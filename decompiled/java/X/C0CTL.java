package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailViewModel;

/* JADX INFO: renamed from: X.0CTL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEmojiDetailViewModel", f = "BulletinEmojiDetailViewModel.kt", l = {57}, m = "onRefresh")
public final class C0CTL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinEmojiDetailViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTL(BulletinEmojiDetailViewModel bulletinEmojiDetailViewModel, InterfaceC1364105Vn<? super C0CTL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinEmojiDetailViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEmojiDetailViewModel@3a08.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("BulletinEmojiDetailViewModel@3a08.onRefresh$1");
        return objOnRefresh;
    }
}
