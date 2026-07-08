package X;

/* JADX INFO: renamed from: X.11SK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11SK<T, U, V> extends C11SQ implements InterfaceC626120Oh8<T>, C11SO<U, V> {
    public final InterfaceC626120Oh8<? super V> LLILLJJLI;
    public final InterfaceC19495011Oy<U> LLILLL;
    public volatile boolean LLILZ;
    public volatile boolean LLILZIL;

    public abstract void LIZ(InterfaceC626120Oh8<? super V> interfaceC626120Oh8, U u);

    public final boolean LIZIZ() {
        return this.LL.getAndIncrement() == 0;
    }

    public C11SK(C11PI c11pi, C19501711Rn c19501711Rn) {
        this.LLILLJJLI = c11pi;
        this.LLILLL = c19501711Rn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(Object obj, InterfaceC420801kM interfaceC420801kM) {
        InterfaceC626120Oh8<? super V> interfaceC626120Oh8 = this.LLILLJJLI;
        InterfaceC19495011Oy<U> interfaceC19495011Oy = this.LLILLL;
        if (this.LL.get() == 0 && this.LL.compareAndSet(0, 1)) {
            if (interfaceC19495011Oy.isEmpty()) {
                LIZ(interfaceC626120Oh8, obj);
                if (this.LL.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                interfaceC19495011Oy.offer(obj);
            }
        } else {
            interfaceC19495011Oy.offer(obj);
            if (!LIZIZ()) {
                return;
            }
        }
        C11SN.LIZIZ(interfaceC19495011Oy, interfaceC626120Oh8, interfaceC420801kM, this);
    }
}
