package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YSZ implements InterfaceC874460YSe {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YSZ)) {
            return false;
        }
        C0YSZ c0ysz = (C0YSZ) obj;
        return Intrinsics.LJFF(this.LIZ, c0ysz.LIZ) && this.LIZIZ == c0ysz.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Silenced(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YSZ(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
