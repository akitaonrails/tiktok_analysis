package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel;

/* JADX INFO: renamed from: X.0hHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel", f = "AddLocationVideoViewModel.kt", l = {BaseNotice.CREATOR}, m = "onLoadMore")
public final class C1198330hHz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AddLocationVideoViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198330hHz(AddLocationVideoViewModel addLocationVideoViewModel, InterfaceC1364105Vn<? super C1198330hHz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = addLocationVideoViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddLocationVideoViewModel@c89f.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("AddLocationVideoViewModel@c89f.onLoadMore$1");
        return objVQ2;
    }
}
