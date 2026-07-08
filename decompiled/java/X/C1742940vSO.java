package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ContentFeedData;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS3S0510000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vSO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel$realLoadMore$1", f = "TrendingListViewModel.kt", l = {195}, m = "invokeSuspend")
public final class C1742940vSO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TrendingListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742940vSO(TrendingListViewModel trendingListViewModel, InterfaceC1364105Vn<? super C1742940vSO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = trendingListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742940vSO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        ArrayList arrayList;
        List listLJJJJLI;
        List<Feed> list;
        ContentFeedData contentFeedData;
        List<Feed> list2;
        ContentFeedData contentFeedData2;
        List<Feed> list3;
        Object objLLZLI = obj;
        C1C7U.LIZ("TrendingListViewModel@fed0.realLoadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLLZLI);
            } else {
                C155000ia.LIZIZ(objLLZLI);
                TrendingListViewModel trendingListViewModel = this.LLILLJJLI;
                InterfaceC1742900vSK interfaceC1742900vSK = (InterfaceC1742900vSK) trendingListViewModel.LLILLL.getValue().getOperator();
                C1742820vSC c1742820vSC = trendingListViewModel.LL;
                this.LL = 1;
                objLLZLI = interfaceC1742900vSK.LLZLI(c1742820vSC, this);
                if (objLLZLI == objLJFF) {
                    C1C7U.LIZIZ("TrendingListViewModel@fed0.realLoadMore$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C1742950vSP) objLLZLI;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        TrendingListViewModel trendingListViewModel2 = this.LLILLJJLI;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            trendingListViewModel2.AQ2(EnumC1742610vRr.FAIL);
        }
        TrendingListViewModel trendingListViewModel3 = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1742950vSP c1742950vSP = (C1742950vSP) c098200Yq;
            C1742820vSC c1742820vSC2 = trendingListViewModel3.LL;
            List listLJJJJLI2 = null;
            if (c1742820vSC2 != null) {
                str = c1742820vSC2.LJIIIIZZ;
            } else {
                str = null;
            }
            boolean zLJFF = Intrinsics.LJFF(str, "auction");
            if (zLJFF && (contentFeedData2 = c1742950vSP.LJII) != null && (list3 = contentFeedData2.feedList) != null) {
                arrayList = new ArrayList();
                for (Feed feed : list3) {
                    String str2 = c1742950vSP.LJI;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1742910vSL c1742910vSLXQ2 = TrendingListViewModel.xQ2(feed, str2);
                    if (c1742910vSLXQ2 != null) {
                        arrayList.add(c1742910vSLXQ2);
                    }
                }
            } else {
                arrayList = null;
            }
            if (zLJFF && (contentFeedData = c1742950vSP.LJIIIIZZ) != null && (list2 = contentFeedData.feedList) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (Feed feed2 : list2) {
                    String str3 = c1742950vSP.LJI;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList2.add(TrendingListViewModel.xQ2(feed2, str3));
                }
                listLJJJJLI = C13LP.LJJJJLI(arrayList2);
            } else {
                listLJJJJLI = null;
            }
            ContentFeedData contentFeedData3 = c1742950vSP.LIZ;
            if (contentFeedData3 != null && (list = contentFeedData3.feedList) != null) {
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (Feed feed3 : list) {
                    String str4 = c1742950vSP.LJI;
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList3.add(TrendingListViewModel.xQ2(feed3, str4));
                }
                listLJJJJLI2 = C13LP.LJJJJLI(arrayList3);
            }
            trendingListViewModel3.setState(new AwS3S0510000_26(zLJFF, (boolean) arrayList, (List<? extends C1742910vSL>) listLJJJJLI, (List<? extends C1742910vSL>) trendingListViewModel3, (TrendingListViewModel) listLJJJJLI2, (List<? extends C1742910vSL>) c1742950vSP, (C1742950vSP) 2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TrendingListViewModel@fed0.realLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
