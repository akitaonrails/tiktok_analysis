package X;

import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;

/* JADX INFO: renamed from: X.15So, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel", f = "ExploreFeedListViewModel.kt", l = {761, 780, 792}, m = "fetchList")
public final class C20523615So extends AbstractC23140094w {
    public boolean LL;
    public ExploreFeedRequestOverride LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ExploreFeedListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20523615So(ExploreFeedListViewModel exploreFeedListViewModel, InterfaceC1364105Vn<? super C20523615So> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = exploreFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreFeedListViewModel@1463.fetchList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILZ.yQ2(false, this);
        C1C7U.LIZIZ("ExploreFeedListViewModel@1463.fetchList$1");
        return objYQ2;
    }
}
