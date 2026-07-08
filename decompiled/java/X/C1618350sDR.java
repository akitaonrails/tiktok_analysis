package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS32S0102000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0sDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel$updateState$1", f = "DistributeStatusViewModel.kt", l = {140}, m = "invokeSuspend")
public final class C1618350sDR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DistributeStatusViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618350sDR(DistributeStatusViewModel distributeStatusViewModel, int i, int i2, InterfaceC1364105Vn<? super C1618350sDR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = distributeStatusViewModel;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1618350sDR(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DistributeStatusViewModel@eb08.updateState$1");
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
                this.LLILLJJLI.setStateImmediate(AFwS264S0000000_24.get$arr$(14));
                DistributeStatusViewModel distributeStatusViewModel = this.LLILLJJLI;
                int i2 = this.LLILLL;
                C01ES c01es = (C01ES) distributeStatusViewModel.LLILLJJLI.getValue().getOperator();
                this.LL = 1;
                obj = c01es.s0(i2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DistributeStatusViewModel@eb08.updateState$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C926820aE4) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        DistributeStatusViewModel distributeStatusViewModel2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        int i4 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C188600o0.LIZ((C926820aE4) c098200Yq, null, new AwS32S0102000_24(distributeStatusViewModel2, i3, i4, 0), null);
        }
        DistributeStatusViewModel distributeStatusViewModel3 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            ((Function1) distributeStatusViewModel3.LLILLL.getValue()).invoke(thM5exceptionOrNullimpl);
            distributeStatusViewModel3.setState(new AwS603S0100000_24(thM5exceptionOrNullimpl, 21));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DistributeStatusViewModel@eb08.updateState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
