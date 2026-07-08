package X;

/* JADX INFO: renamed from: X.0p1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1495570p1P implements InterfaceC1495590p1R {
    public final InterfaceC1495590p1R LL;

    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    @Override // X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() {
        this.LL.flush();
    }

    @Override // X.InterfaceC1495590p1R
    public final C1496250p2V timeout() {
        return this.LL.timeout();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append('(');
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1495570p1P(InterfaceC1495590p1R interfaceC1495590p1R) {
        this.LL = interfaceC1495590p1R;
    }
}
