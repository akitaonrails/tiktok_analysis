package X;

/* JADX INFO: renamed from: X.11Op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19494111Op extends C11K7<Integer> {
    public static final long serialVersionUID = 396518478098735504L;
    public final InterfaceC626120Oh8<? super Integer> LL;
    public final long LLILLJJLI;
    public long LLILLL;
    public boolean LLILZ;

    @Override // X.C11K7, X.InterfaceC420801kM
    public final void dispose() {
        set(1);
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final void clear() {
        this.LLILLL = this.LLILLJJLI;
        lazySet(1);
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILLL == this.LLILLJJLI;
    }

    @Override // X.C11K7, X.InterfaceC19494911Ox
    public final Object poll() {
        long j = this.LLILLL;
        if (j != this.LLILLJJLI) {
            this.LLILLL = 1 + j;
            return Integer.valueOf((int) j);
        }
        lazySet(1);
        return null;
    }

    @Override // X.C11K7, X.InterfaceC420801kM
    public final boolean isDisposed() {
        return get() != 0;
    }

    @Override // X.C11K7, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        if ((i & 1) != 0) {
            this.LLILZ = true;
            return 1;
        }
        return 0;
    }

    public C19494111Op(InterfaceC626120Oh8<? super Integer> interfaceC626120Oh8, long j, long j2) {
        this.LL = interfaceC626120Oh8;
        this.LLILLL = j;
        this.LLILLJJLI = j2;
    }
}
