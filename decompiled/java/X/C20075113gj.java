package X;

/* JADX INFO: renamed from: X.13gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {552}, m = "processDragCancel")
public final class C20075113gj extends AbstractC23140094w {
    public AbstractC20074613ge LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC20074613ge LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20075113gj(AbstractC20074613ge abstractC20074613ge, InterfaceC1364105Vn<? super C20075113gj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = abstractC20074613ge;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return AbstractC20074613ge.LLJJIJI(this.LLILLL, this);
    }
}
