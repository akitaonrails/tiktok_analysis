package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530640pvy {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1530640pvy)) {
            return false;
        }
        C1530640pvy c1530640pvy = (C1530640pvy) obj;
        return Intrinsics.LJFF(this.LIZ, c1530640pvy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1530640pvy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoSspPrewarmRequest(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1530640pvy(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
