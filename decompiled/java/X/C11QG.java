package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11QG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11QG {
    public static final C11NG LIZ = new Throwable() { // from class: X.11NG
        public static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    };

    public static RuntimeException LIZIZ(Throwable th) throws Throwable {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                return (RuntimeException) th;
            }
            return new RuntimeException(th);
        }
        throw th;
    }

    public static String LIZ(long j, TimeUnit timeUnit) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The source did not signal an event for ");
        sbLIZ.append(j);
        sbLIZ.append(" ");
        sbLIZ.append(timeUnit.toString().toLowerCase());
        sbLIZ.append(" and has been terminated.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
