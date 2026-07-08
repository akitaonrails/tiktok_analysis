package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSessionLegacy$setConnectionActive$1", f = "CallSessionLegacy.kt", l = {377}, m = "invokeSuspend")
public final class C1302140jzQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1302260jzc LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302140jzQ(C1302260jzc c1302260jzc, C013C c013c, InterfaceC1364105Vn<? super C1302140jzQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1302260jzc;
        this.LLILLL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302140jzQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1302150jzR c1302150jzR = new C1302150jzR(this.LLILLJJLI, null);
                this.LL = 1;
                if (C099A.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, c1302150jzR, this) == objLJFF) {
                    return objLJFF;
                }
            }
            this.LLILLJJLI.setActive();
            this.LLILLJJLI.LIZLLL(EnumC1302210jzX.ACTIVE);
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.element = true;
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
