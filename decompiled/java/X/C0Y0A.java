package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y0A, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y0A {
    public final ByteString LIZ;
    public final Map<Integer, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y0A)) {
            return false;
        }
        C0Y0A c0y0a = (C0Y0A) obj;
        return Intrinsics.LJFF(this.LIZ, c0y0a.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0y0a.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecodedEntry(raw=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", decoded=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y0A(Map map, ByteString byteString) {
        this.LIZ = byteString;
        this.LIZIZ = map;
    }
}
