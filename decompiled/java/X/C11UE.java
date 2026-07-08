package X;

/* JADX INFO: renamed from: X.11UE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "kotlinx.coroutines.rx2.RxAwaitKt", f = "RxAwait.kt", l = {82}, m = "awaitSingle")
public final class C11UE<T> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;

    public C11UE(InterfaceC1364105Vn<? super C11UE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        return C11UD.LJFF(null, this);
    }
}
