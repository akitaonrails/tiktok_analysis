package X;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0pYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516370pYx extends CancellationException {
    public static final int $stable = 0;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(C1516380pYy.LIZ);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1516370pYx(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Timed out waiting for ");
        sbLIZ.append(j);
        sbLIZ.append(" ms");
        super(C2188811AlT.LIZIZ(sbLIZ));
    }
}
