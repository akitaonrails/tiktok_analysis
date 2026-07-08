package X;

/* JADX INFO: renamed from: X.08DB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C08DB {
    public abstract boolean LIZIZ();

    public abstract void LIZJ(Runnable runnable);

    public final void LIZ(Runnable runnable) {
        if (LIZIZ()) {
            runnable.run();
        } else {
            LIZJ(runnable);
        }
    }
}
