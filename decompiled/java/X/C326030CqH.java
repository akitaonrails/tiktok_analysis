package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.topic.book.favorite.viewmodel.BookCollectionListViewModel;

/* JADX INFO: renamed from: X.0CqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.book.favorite.viewmodel.BookCollectionListViewModel", f = "BookCollectionListViewModel.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "onLoadMore")
public final class C326030CqH extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BookCollectionListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326030CqH(BookCollectionListViewModel bookCollectionListViewModel, InterfaceC1364105Vn<? super C326030CqH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bookCollectionListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BookCollectionListViewModel@8524.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0L, this);
        C1C7U.LIZIZ("BookCollectionListViewModel@8524.onLoadMore$1");
        return objOnLoadMore;
    }
}
