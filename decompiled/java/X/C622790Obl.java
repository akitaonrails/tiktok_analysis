package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel;

/* JADX INFO: renamed from: X.0Obl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel", f = "BulletinEmojiDetailListViewModel.kt", l = {108}, m = "onLoadMore")
public final class C622790Obl extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinEmojiDetailListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622790Obl(BulletinEmojiDetailListViewModel bulletinEmojiDetailListViewModel, InterfaceC1364105Vn<? super C622790Obl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinEmojiDetailListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEmojiDetailListViewModel@caf4.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("BulletinEmojiDetailListViewModel@caf4.onLoadMore$1");
        return objVQ2;
    }
}
