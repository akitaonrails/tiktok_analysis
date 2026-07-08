package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectCreationBanStatusService;
import com.ss.android.ugc.aweme.effect.EffectCreationBanStatusViewModel;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.effect.EffectCreationBanStatusViewModel$1", f = "EffectCreationBanStatusViewModel.kt", l = {40}, m = "invokeSuspend")
public final class C860930Xpz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ EffectCreationBanStatusViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860930Xpz(EffectCreationBanStatusViewModel effectCreationBanStatusViewModel, InterfaceC1364105Vn<? super C860930Xpz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = effectCreationBanStatusViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860930Xpz(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Object currentUserID;
        C1C7U.LIZ("EffectCreationBanStatusViewModel@419b.<init>$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                currentUserID = this.LLILLJJLI;
                map = (Map) this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (IOException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            map = EffectCreationBanStatusViewModel.LLILZIL;
            currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            if (C0C03.LIZ()) {
                try {
                    EffectCreationBanStatusService effectCreationBanStatusService = this.LLILZ.LLILLL;
                    this.LL = map;
                    this.LLILLJJLI = currentUserID;
                    this.LLILLL = 1;
                    obj = effectCreationBanStatusService.getCreationBanStatus(1, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("EffectCreationBanStatusViewModel@419b.<init>$1");
                        return objLJFF;
                    }
                } catch (IOException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                }
            } else {
                obj = EffectCreationBanStatusViewModel.LLILZLL;
            }
        }
        map.put(currentUserID, obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectCreationBanStatusViewModel@419b.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
