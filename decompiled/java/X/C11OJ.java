package X;

/* JADX INFO: renamed from: X.11OJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11OJ<T> extends C11NY<T> {
    public static final long serialVersionUID = -2252972430506210021L;
    public final T[] LL;
    public int LLILLJJLI;
    public volatile boolean LLILLL;

    public abstract void LIZ();

    public abstract void LIZIZ(long j);

    @Override // X.C11NY, X.C11LR
    public final void cancel() {
        this.LLILLL = true;
    }

    @Override // X.C11NY, X.InterfaceC19495111Oz
    public final int requestFusion(int i) {
        return i & 1;
    }

    @Override // X.C11NY, X.InterfaceC19494911Ox
    public final void clear() {
        this.LLILLJJLI = this.LL.length;
    }

    @Override // X.C11NY, X.InterfaceC19494911Ox
    public final boolean isEmpty() {
        return this.LLILLJJLI == this.LL.length;
    }

    @Override // X.C11NY, X.InterfaceC19494911Ox
    public final T poll() {
        int i = this.LLILLJJLI;
        T[] tArr = this.LL;
        if (i == tArr.length) {
            return null;
        }
        this.LLILLJJLI = i + 1;
        T t = tArr[i];
        C1701890uOB.LIZ(t, "array element is null");
        return t;
    }

    public C11OJ(T[] tArr) {
        this.LL = tArr;
    }

    @Override // X.C11NY, X.C11LR
    public final void request(long j) {
        if (C11NC.validate(j) && C19492311Nx.LIZ(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                LIZ();
            } else {
                LIZIZ(j);
            }
        }
    }
}
