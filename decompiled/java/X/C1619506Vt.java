package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.whee.WheeBubbleUnlockedIdsRefreshCoordinator$tryRefreshIfPendingOnChatResume$1", f = "WheeBubbleUnlockedIdsRefreshCoordinator.kt", l = {102}, m = "invokeSuspend")
public final class C1619506Vt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1619806Vw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619506Vt(C1619806Vw c1619806Vw, InterfaceC1364105Vn<? super C1619506Vt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1619806Vw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1619506Vt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WheeBubbleUnlockedIdsRefreshCoordinator@17e4.tryRefreshIfPendingOnChatResume$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1619406Vs c1619406Vs = C1619406Vs.LIZ;
                C1619806Vw c1619806Vw = this.LLILLJJLI;
                this.LL = 1;
                if (c1619406Vs.LIZJ(c1619806Vw, this) == objLJFF) {
                    C1C7U.LIZIZ("WheeBubbleUnlockedIdsRefreshCoordinator@17e4.tryRefreshIfPendingOnChatResume$1");
                    return objLJFF;
                }
            }
            C1619406Vs.LIZJ.set(false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("WheeBubbleUnlockedIdsRefreshCoordinator@17e4.tryRefreshIfPendingOnChatResume$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1619406Vs.LIZJ.set(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
