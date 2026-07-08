package X;

/* JADX INFO: renamed from: X.0X3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC842560X3m implements InterfaceC842570X3n {
    public final InterfaceC842570X3n delegate;

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // X.InterfaceC842570X3n
    public C1496250p2V timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append('(');
        sbLIZ.append(this.delegate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @InterfaceC1294060jmO
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC842570X3n m36deprecated_delegate() {
        return this.delegate;
    }

    public final InterfaceC842570X3n delegate() {
        return this.delegate;
    }

    public AbstractC842560X3m(InterfaceC842570X3n interfaceC842570X3n) {
        this.delegate = interfaceC842570X3n;
    }

    @Override // X.InterfaceC842570X3n
    public long read(C1496690p3D c1496690p3D, long j) {
        return this.delegate.read(c1496690p3D, j);
    }
}
