package X;

import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0p1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495840p1q {
    public static final ByteString LIZLLL = ByteString.encodeUtf8(":");
    public static final ByteString LJ = ByteString.encodeUtf8(":status");
    public static final ByteString LJFF = ByteString.encodeUtf8(":method");
    public static final ByteString LJI = ByteString.encodeUtf8(":path");
    public static final ByteString LJII = ByteString.encodeUtf8(":scheme");
    public static final ByteString LJIIIIZZ = ByteString.encodeUtf8(":authority");
    public final ByteString LIZ;
    public final ByteString LIZIZ;
    public final int LIZJ;

    public final String toString() {
        return c.LJIIJJI("%s: %s", this.LIZ.utf8(), this.LIZIZ.utf8());
    }

    public final int hashCode() {
        return ((527 + this.LIZ.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1495840p1q)) {
            return false;
        }
        C1495840p1q c1495840p1q = (C1495840p1q) obj;
        if (!this.LIZ.equals(c1495840p1q.LIZ) || !this.LIZIZ.equals(c1495840p1q.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C1495840p1q(ByteString byteString, ByteString byteString2) {
        this.LIZ = byteString;
        this.LIZIZ = byteString2;
        this.LIZJ = byteString.size() + 32 + byteString2.size();
    }

    public C1495840p1q(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public C1495840p1q(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }
}
