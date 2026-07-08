package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushManager$tryMarkFirstPullMsgEnd$1", f = "IMInnerPushManager.kt", l = {383}, m = "invokeSuspend")
public final class C594630NTx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C876680YaI LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594630NTx(C876680YaI c876680YaI, InterfaceC1364105Vn<? super C594630NTx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c876680YaI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594630NTx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInnerPushManager@1506.tryMarkFirstPullMsgEnd$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("IMInnerPushManager@1506.tryMarkFirstPullMsgEnd$1");
                return objLJFF;
            }
        }
        C876680YaI c876680YaI = this.LLILLJJLI;
        synchronized (c876680YaI) {
            try {
                if (c876680YaI.LIZJ.LIZ != -1) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMInnerPushManager@1506.tryMarkFirstPullMsgEnd$1");
                    return unit;
                }
                c876680YaI.LIZLLL(EnumC876540Ya4.MIX_LINK, C202094145s.LJ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("IMInnerPushManager@1506.tryMarkFirstPullMsgEnd$1");
                return unit2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
