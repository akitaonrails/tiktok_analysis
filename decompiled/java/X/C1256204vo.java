package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1256204vo implements InterfaceC1256404vq {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1256204vo)) {
            return false;
        }
        C1256204vo c1256204vo = (C1256204vo) obj;
        return Intrinsics.LJFF(this.LIZ, c1256204vo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1256204vo.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(sourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1256204vo(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
