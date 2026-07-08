package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import njp.a;

/* JADX INFO: renamed from: X.0zIU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel$onRefresh$2", f = "ExploreTopicGeneralFeedListViewModel.kt", l = {573}, m = "invokeSuspend")
public final class C1890560zIU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ExploreTopicGeneralFeedListViewModel LLILLJJLI;
    public final /* synthetic */ C15TH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890560zIU(ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, C15TH c15th, InterfaceC1364105Vn<? super C1890560zIU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = exploreTopicGeneralFeedListViewModel;
        this.LLILLL = c15th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1890560zIU(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onRefresh$2");
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
                C2153908cD c2153908cD = C2153908cD.LIZ;
                AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(182);
                c2153908cD.getClass();
                C2153908cD.LIZ("topic_general_list_vm", aFwS217S0000000_28);
                ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel = this.LLILLJJLI;
                C2252331DDr c2252331DDr = exploreTopicGeneralFeedListViewModel.LLJJJ.LJI;
                C15TB c15tb = new C15TB(exploreTopicGeneralFeedListViewModel, this.LLILLL);
                this.LL = 1;
                c2252331DDr.getClass();
                if (C2252331DDr.LJIIJ(c2252331DDr, c15tb, this) == objLJFF) {
                    C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onRefresh$2");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(e, 208);
            c2153908cD2.getClass();
            C2153908cD.LIZ("topic_general_list_vm", awS572S0100000_28);
            C1AF0.LJ(e);
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LLJLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILLJJLI.LLJLL = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onRefresh$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
