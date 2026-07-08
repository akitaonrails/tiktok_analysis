package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.12xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19926612xs extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;
    public InterfaceC19925612xi LL;
    public boolean wasThrownFromInputStream;

    public static C19926612xs LIZ() {
        return new C19926612xs("Protocol message end-group tag did not match expected tag.");
    }

    public static C19926612xs LIZIZ() {
        return new C19926612xs("Protocol message contained an invalid tag (zero).");
    }

    public static C19926612xs LIZJ() {
        return new C19926612xs("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.12xu] */
    public static C19926812xu LIZLLL() {
        final String str = "Protocol message tag had invalid wire type.";
        return new C19926612xs(str) { // from class: X.12xu
            public static final long serialVersionUID = 3283890091615336259L;
        };
    }

    public static C19926612xs LJ() {
        return new C19926612xs("CodedInputStream encountered a malformed varint.");
    }

    public static C19926612xs LJFF() {
        return new C19926612xs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C19926612xs LJI() {
        return new C19926612xs("Failed to parse the message.");
    }

    public static C19926612xs LJII() {
        return new C19926612xs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public InterfaceC19925612xi getUnfinishedMessage() {
        return this.LL;
    }

    public C19926612xs(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.LL = null;
    }

    public C19926612xs setUnfinishedMessage(InterfaceC19925612xi interfaceC19925612xi) {
        this.LL = interfaceC19925612xi;
        return this;
    }

    public C19926612xs(Exception exc) {
        super(exc.getMessage(), exc);
        this.LL = null;
    }

    public C19926612xs(String str) {
        super(str);
    }

    public C19926612xs(String str, IOException iOException) {
        super(str, iOException);
    }

    public C19926612xs(String str, Exception exc) {
        super(str, exc);
    }
}
