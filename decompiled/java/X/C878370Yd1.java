package X;

/* JADX INFO: renamed from: X.0Yd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource", f = "ChatListConversationDataSource.kt", l = {699}, m = "arrangePreloadAllTask")
public final class C878370Yd1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C878460YdA LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878370Yd1(C878460YdA c878460YdA, InterfaceC1364105Vn<? super C878370Yd1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c878460YdA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ChatListConversationDataSource@6f28.arrangePreloadAllTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.arrangePreloadAllTask$1");
        return objLIZ;
    }
}
