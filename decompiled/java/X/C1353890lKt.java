package X;

import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM;

/* JADX INFO: renamed from: X.0lKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM", f = "InteractionBubbleListVM.kt", l = {165}, m = "onRefresh")
public final class C1353890lKt extends AbstractC23140094w {
    public C1353820lKm LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InteractionBubbleListVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1353890lKt(InteractionBubbleListVM interactionBubbleListVM, InterfaceC1364105Vn<? super C1353890lKt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = interactionBubbleListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractionBubbleListVM@6f7c.onRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLL.onRefresh(this);
        C1C7U.LIZIZ("InteractionBubbleListVM@6f7c.onRefresh$1");
        return objOnRefresh;
    }
}
