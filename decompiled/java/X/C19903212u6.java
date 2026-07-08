package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.12u6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19903212u6 extends IOException {
    public static final /* synthetic */ int LL = 0;

    public static C19903212u6 LIZ() {
        return new C19903212u6("Protocol message had invalid UTF-8.");
    }

    public static C19903212u6 LIZIZ() {
        return new C19903212u6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C19903212u6 LIZJ() {
        return new C19903212u6("Failed to parse the message.");
    }

    public static C19903212u6 LIZLLL() {
        return new C19903212u6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C19903212u6(String str) {
        super(str);
    }
}
