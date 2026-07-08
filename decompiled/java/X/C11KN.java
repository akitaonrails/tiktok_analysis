package X;

/* JADX INFO: renamed from: X.11KN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11KN<T> extends C11K1<T> {
    public final InterfaceC626120Oh8<? super T> LL;
    public final T[] LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public volatile boolean LLILZIL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        this.LLILZIL = true;
    }

    @Override // X.InterfaceC19494911Ox
    public final void clear() {
        this.LLILLL = this.LLILLJJLI.length;
    }

    @Override // X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILLL == this.LLILLJJLI.length;
    }

    @Override // X.InterfaceC19494911Ox
    public final T poll() {
        int i = this.LLILLL;
        T[] tArr = this.LLILLJJLI;
        if (i == tArr.length) {
            return null;
        }
        this.LLILLL = i + 1;
        T t = tArr[i];
        C1701890uOB.LIZ(t, "The array element is null");
        return t;
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        if ((i & 1) != 0) {
            this.LLILZ = true;
            return 1;
        }
        return 0;
    }

    public C11KN(InterfaceC626120Oh8<? super T> interfaceC626120Oh8, T[] tArr) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = tArr;
    }
}
