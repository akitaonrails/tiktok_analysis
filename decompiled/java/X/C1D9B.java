package X;

/* JADX INFO: renamed from: X.1D9B, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {739}, m = "receiveCatching-JP2dKIU$suspendImpl")
public final class C1D9B<E> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1DEK<E> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D9B(C1DEK<E> c1dek, InterfaceC1364105Vn<? super C1D9B> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1dek;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIJ = C1DEK.LJJIJ(this.LLILLJJLI, this);
        if (objLJJIJ == C099R.LJFF()) {
            return objLJJIJ;
        }
        return new C094N(objLJJIJ);
    }
}
