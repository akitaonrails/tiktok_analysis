package X;

import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM;

/* JADX INFO: renamed from: X.0lKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM", f = "InteractionBubbleListVM.kt", l = {249}, m = "fetchCommentList")
public final class C1353900lKu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InteractionBubbleListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1353900lKu(InteractionBubbleListVM interactionBubbleListVM, InterfaceC1364105Vn<? super C1353900lKu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = interactionBubbleListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("InteractionBubbleListVM@6f7c.fetchCommentList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(null, this);
        C1C7U.LIZIZ("InteractionBubbleListVM@6f7c.fetchCommentList$1");
        return objWQ2;
    }
}
