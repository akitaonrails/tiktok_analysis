package X;

/* JADX INFO: renamed from: X.11LO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11LO extends C11LP<Runnable> {
    public static final long serialVersionUID = -8219729196779211169L;

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RunnableDisposable(disposed=");
        sbLIZ.append(isDisposed());
        sbLIZ.append(", ");
        sbLIZ.append(get());
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C11LO(Runnable runnable) {
        super(runnable);
    }

    @Override // X.C11LP
    public final void LIZ(Runnable runnable) {
        runnable.run();
    }
}
