package X;

import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15Sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel$onShow$1", f = "ExploreFeedListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C20523315Sl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ExploreFeedListViewModel LL;
    public final /* synthetic */ AbstractC1158440gFe LLILLJJLI;
    public final /* synthetic */ ExploreLynxParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20523315Sl(ExploreFeedListViewModel exploreFeedListViewModel, AbstractC1158440gFe abstractC1158440gFe, ExploreLynxParams exploreLynxParams, InterfaceC1364105Vn<? super C20523315Sl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exploreFeedListViewModel;
        this.LLILLJJLI = abstractC1158440gFe;
        this.LLILLL = exploreLynxParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20523315Sl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        HashSet hashSetLLIFFJFJJ;
        C1C7U.LIZ("ExploreFeedListViewModel@1463.onShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.vQ2(C2286608xc.LJFF(((C1158430gFd) this.LLILLJJLI).LIZJ), this.LLILLL);
        ExploreFeedListViewModel exploreFeedListViewModel = this.LL;
        C1158430gFd c1158430gFd = (C1158430gFd) this.LLILLJJLI;
        ExploreAwemeList exploreAwemeList = c1158430gFd.LIZIZ;
        long j = c1158430gFd.LIZJ;
        exploreFeedListViewModel.LLJJJIL.clear();
        List<String> list = exploreFeedListViewModel.LLJILJILJ;
        if (!list.isEmpty()) {
            hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(list);
        } else {
            hashSetLLIFFJFJJ = null;
        }
        String str = exploreFeedListViewModel.LLJJI;
        String str2 = exploreFeedListViewModel.LLJJIII;
        String str3 = exploreFeedListViewModel.LLJJ;
        String str4 = exploreFeedListViewModel.LLJJIJI;
        String str5 = exploreFeedListViewModel.LLJJIJIIJIL;
        String str6 = exploreFeedListViewModel.LLJJIJIL;
        if (str6 != null) {
            exploreFeedListViewModel.LLJJIJIL = null;
        }
        if (exploreFeedListViewModel.JQ2(exploreAwemeList, C15TI.UG_CARD.getValue(), new C20523515Sn(hashSetLLIFFJFJJ, j, str3, str, str2, str4, str5, str6), false)) {
            C20524315Sv.LL.getClass();
            C20524315Sv.LJFF(exploreAwemeList);
            C20524315Sv.LJI(exploreAwemeList);
            exploreFeedListViewModel.LLJILJIL = Long.valueOf(j);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreFeedListViewModel@1463.onShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
