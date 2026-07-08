package X;

import com.ss.android.ugc.aweme.fangroup.viewmodel.FanGroupListViewModel;

/* JADX INFO: renamed from: X.0Xnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fangroup.viewmodel.FanGroupListViewModel", f = "FanGroupListViewModel.kt", l = {130}, m = "fetchFanGroupList")
public final class C859510Xnh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FanGroupListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859510Xnh(FanGroupListViewModel fanGroupListViewModel, InterfaceC1364105Vn<? super C859510Xnh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = fanGroupListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FanGroupListViewModel@1a54.fetchFanGroupList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(false, this);
        C1C7U.LIZIZ("FanGroupListViewModel@1a54.fetchFanGroupList$1");
        return objVQ2;
    }
}
