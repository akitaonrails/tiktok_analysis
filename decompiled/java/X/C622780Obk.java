package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel;

/* JADX INFO: renamed from: X.0Obk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailListViewModel", f = "BulletinEmojiDetailListViewModel.kt", l = {69}, m = "onRefresh")
public final class C622780Obk extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinEmojiDetailListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622780Obk(BulletinEmojiDetailListViewModel bulletinEmojiDetailListViewModel, InterfaceC1364105Vn<? super C622780Obk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinEmojiDetailListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEmojiDetailListViewModel@caf4.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("BulletinEmojiDetailListViewModel@caf4.onRefresh$1");
        return objOnRefresh;
    }
}
