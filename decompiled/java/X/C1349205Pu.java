package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM$onPrepared$1", f = "OfflineModeManagerVM.kt", l = {74}, m = "invokeSuspend")
public final class C1349205Pu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public OfflineModeManagerVM LL;
    public int LLILLJJLI;
    public final /* synthetic */ OfflineModeManagerVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1349205Pu(OfflineModeManagerVM offlineModeManagerVM, InterfaceC1364105Vn<? super C1349205Pu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = offlineModeManagerVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1349205Pu(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        OfflineModeManagerVM offlineModeManagerVM;
        C1C7U.LIZ("OfflineModeManagerVM@2534.onPrepared$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    offlineModeManagerVM = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                offlineModeManagerVM = this.LLILLL;
                InterfaceC624740Oeu interfaceC624740Oeu = (InterfaceC624740Oeu) offlineModeManagerVM.wQ2().getOperator();
                this.LL = offlineModeManagerVM;
                this.LLILLJJLI = 1;
                obj = interfaceC624740Oeu.C(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OfflineModeManagerVM@2534.onPrepared$1");
                    return objLJFF;
                }
            }
            offlineModeManagerVM.HQ2((List) obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            OfflineModeManagerVM.LLILZLL.LJ("getWatchedAidList failed " + e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeManagerVM@2534.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
