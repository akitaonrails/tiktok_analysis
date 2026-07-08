package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0kWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322750kWf extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;
    public boolean wasThrownFromInputStream;

    public static C1322750kWf LIZ() {
        return new C1322750kWf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public C1322750kWf(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public C1322750kWf(Exception exc) {
        super(exc.getMessage(), exc);
    }

    public C1322750kWf(String str) {
        super(str);
    }

    public C1322750kWf(String str, IOException iOException) {
        super(str, iOException);
    }

    public C1322750kWf(String str, Exception exc) {
        super(str, exc);
    }
}
