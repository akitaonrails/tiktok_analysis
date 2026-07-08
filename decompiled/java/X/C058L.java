package X;

/* JADX INFO: renamed from: X.058L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.birthdayinfo.ChatListBirthdayInfoUpdater", f = "ChatListBirthdayInfoUpdater.kt", l = {243}, m = "triggerFetch")
public final class C058L extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1513005w8 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058L(C1513005w8 c1513005w8, InterfaceC1364105Vn<? super C058L> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1513005w8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListBirthdayInfoUpdater@3b59.triggerFetch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIL = this.LLILLL.LJIL(false, this);
        C1C7U.LIZIZ("ChatListBirthdayInfoUpdater@3b59.triggerFetch$1");
        return objLJIL;
    }
}
