package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2150108bb {
    public final String LIZ;
    public final boolean LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2150108bb)) {
            return false;
        }
        C2150108bb c2150108bb = (C2150108bb) obj;
        return Intrinsics.LJFF(this.LIZ, c2150108bb.LIZ) && this.LIZIZ == c2150108bb.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2150108bb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2150108bb.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Long l = this.LIZJ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LIZLLL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadResult(vid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2150108bb(String str, boolean z, Long l, String str2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = l;
        this.LIZLLL = str2;
    }

    public /* synthetic */ C2150108bb(String str, boolean z, Long l, int i) {
        this(str, z, (i & 4) != 0 ? null : l, (String) null);
    }
}
