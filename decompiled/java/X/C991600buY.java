package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0buY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991600buY extends AbstractC991610buZ {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991600buY)) {
            return false;
        }
        C991600buY c991600buY = (C991600buY) obj;
        return this.LIZ == c991600buY.LIZ && Intrinsics.LJFF(this.LIZIZ, c991600buY.LIZIZ) && this.LIZJ == c991600buY.LIZJ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentRenderResult(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromPre=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991600buY(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
