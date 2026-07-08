package X;

/* JADX INFO: renamed from: X.13gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {544}, m = "processDragStop")
public final class C20075013gi extends AbstractC23140094w {
    public AbstractC20074613ge LL;
    public C1394905d5 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AbstractC20074613ge LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20075013gi(AbstractC20074613ge abstractC20074613ge, InterfaceC1364105Vn<? super C20075013gi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = abstractC20074613ge;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return AbstractC20074613ge.LLJJIJIL(this.LLILZ, null, this);
    }
}
