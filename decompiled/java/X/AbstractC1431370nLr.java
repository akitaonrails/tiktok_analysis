package X;

/* JADX INFO: renamed from: X.0nLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1431370nLr {
    public final Throwable LIZ;

    public String LIZIZ() {
        return "";
    }

    public abstract int LIZJ();

    public String LIZLLL() {
        return null;
    }

    public abstract EnumC1436980nUu LJ();

    public final Throwable LIZ() {
        Throwable th = this.LIZ;
        if (!(th instanceof C1435220nS4)) {
            return th;
        }
        Throwable cause = th.getCause();
        return cause == null ? new RuntimeException() { // from class: X.0nLu
        } : cause;
    }

    public AbstractC1431370nLr(Throwable th) {
        this.LIZ = th;
    }
}
