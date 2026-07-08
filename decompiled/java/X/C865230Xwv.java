package X;

/* JADX INFO: renamed from: X.0Xwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationReadStatusManager", f = "DefaultConversationReadStatusManager.kt", l = {79, 65}, m = "batchMarkUnread")
public final class C865230Xwv extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C865210Xwt LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865230Xwv(C865210Xwt c865210Xwt, InterfaceC1364105Vn<? super C865230Xwv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c865210Xwt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationReadStatusManager@291.batchMarkUnread$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJI = this.LLILZLL.LJJJI(null, this);
        C1C7U.LIZIZ("DefaultConversationReadStatusManager@291.batchMarkUnread$1");
        return objLJJJI;
    }
}
