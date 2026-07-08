package X;

/* JADX INFO: renamed from: X.13gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {534, 537}, m = "processDragStart")
public final class C20074913gh extends AbstractC23140094w {
    public AbstractC20074613ge LL;
    public C1394805d4 LLILLJJLI;
    public C0NW8 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC20074613ge LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20074913gh(AbstractC20074613ge abstractC20074613ge, InterfaceC1364105Vn<? super C20074913gh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC20074613ge;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return AbstractC20074613ge.LLJJIJIIJIL(this.LLILZIL, null, this);
    }
}
