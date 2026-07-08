package X;

/* JADX INFO: renamed from: X.0YQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.preview.PublicGroupPreviewConversationLifecycle", f = "PublicGroupPreviewConversationLifecycle.kt", l = {64}, m = "awaitPrepared$im_group_chat_release")
public final class C874140YQy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C874100YQu LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874140YQy(C874100YQu c874100YQu, InterfaceC1364105Vn<? super C874140YQy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c874100YQu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublicGroupPreviewConversationLifecycle@fb8e.awaitPrepared$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0L, this);
        C1C7U.LIZIZ("PublicGroupPreviewConversationLifecycle@fb8e.awaitPrepared$1");
        return objLIZ;
    }
}
