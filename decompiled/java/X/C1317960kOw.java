package X;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: X.0kOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317960kOw extends IOException {
    public C1317960kOw() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public C1317960kOw(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C1317960kOw(int i, long j, long j2, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(C786410Ut5.k4(Locale.US, "Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)}))), th);
    }
}
