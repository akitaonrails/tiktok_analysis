package X;

import Y.AgS307S0100000_27;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0y2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel$onRefresh$2$1", f = "ExploreFeedListViewModel.kt", l = {1159}, m = "invokeSuspend")
public final class C1842250y2Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ExploreFeedListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842250y2Z(ExploreFeedListViewModel exploreFeedListViewModel, InterfaceC1364105Vn<? super C1842250y2Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = exploreFeedListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1842250y2Z(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreFeedListViewModel@1463.onRefresh$2$1");
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
                C2153908cD c2153908cD = C2153908cD.LIZ;
                AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(110);
                c2153908cD.getClass();
                C2153908cD.LIZ("explore_chunk_process_request", aFwS216S0000000_27);
                C2252331DDr c2252331DDr = C20524815Ta.LJII;
                AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(this.LLILLJJLI, 14);
                this.LL = 1;
                c2252331DDr.getClass();
                if (C2252331DDr.LJIIJ(c2252331DDr, agS307S0100000_27, this) == objLJFF) {
                    C1C7U.LIZIZ("ExploreFeedListViewModel@1463.onRefresh$2$1");
                    return objLJFF;
                }
            }
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            AFwS216S0000000_27 aFwS216S0000000_272 = AFwS216S0000000_27.get$arr$(111);
            c2153908cD2.getClass();
            C2153908cD.LIZ("explore_chunk_process_request", aFwS216S0000000_272);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LLJJJJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILLJJLI.LLJJJJ = null;
            C2153908cD c2153908cD3 = C2153908cD.LIZ;
            AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(th, 245);
            c2153908cD3.getClass();
            C2153908cD.LIZ("explore_chunk_process_request", awS571S0100000_27);
            C1AF0.LJ(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreFeedListViewModel@1463.onRefresh$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
