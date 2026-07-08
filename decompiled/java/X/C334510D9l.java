package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334510D9l {
    public final String LIZ;
    public final C0D9J LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334510D9l)) {
            return false;
        }
        C334510D9l c334510D9l = (C334510D9l) obj;
        return Intrinsics.LJFF(this.LIZ, c334510D9l.LIZ) && this.LIZIZ == c334510D9l.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuardNoticePayload(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C334510D9l(String str, C0D9J c0d9j) {
        this.LIZ = str;
        this.LIZIZ = c0d9j;
    }
}
