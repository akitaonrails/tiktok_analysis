package X;

/* JADX INFO: renamed from: X.0pYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {861}, m = "withTimeoutOrNull")
public final class C1516360pYw<T> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1516410pZ1<Object> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516360pYw(C1516410pZ1<Object> c1516410pZ1, InterfaceC1364105Vn<? super C1516360pYw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1516410pZ1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LLD(0L, null, this);
    }
}
