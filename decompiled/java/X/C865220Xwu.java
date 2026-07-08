package X;

/* JADX INFO: renamed from: X.0Xwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationReadStatusManager", f = "DefaultConversationReadStatusManager.kt", l = {79, 43}, m = "batchMarkRead")
public final class C865220Xwu extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C865210Xwt LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865220Xwu(C865210Xwt c865210Xwt, InterfaceC1364105Vn<? super C865220Xwu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c865210Xwt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationReadStatusManager@291.batchMarkRead$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJ = this.LLILZLL.LJJJ(null, this);
        C1C7U.LIZIZ("DefaultConversationReadStatusManager@291.batchMarkRead$1");
        return objLJJJ;
    }
}
