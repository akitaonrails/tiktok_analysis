package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489660JIe extends AbstractC489650JId {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C489660JIe)) {
            return false;
        }
        C489660JIe c489660JIe = (C489660JIe) obj;
        return Intrinsics.LJFF(this.LIZ, c489660JIe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c489660JIe.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoInfo(creatorName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C489660JIe(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
