package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875000YUg extends AbstractC874970YUd {
    public final String LIZ;

    public C875000YUg() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C875000YUg) && Intrinsics.LJFF(this.LIZ, ((C875000YUg) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Server(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C875000YUg(String str) {
        this.LIZ = str;
    }
}
