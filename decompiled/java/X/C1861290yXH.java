package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yXH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861290yXH {
    public final String LIZ;
    public final int LIZIZ;
    public final Object LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1861290yXH() {
        this((String) null, (C326960Crm) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1861290yXH)) {
            return false;
        }
        C1861290yXH c1861290yXH = (C1861290yXH) obj;
        return Intrinsics.LJFF(this.LIZ, c1861290yXH.LIZ) && this.LIZIZ == c1861290yXH.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1861290yXH.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        Object obj = this.LIZJ;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMessageLocation(messageUUId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messageOffset=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastSug=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1861290yXH(String str, C326960Crm c326960Crm, int i) {
        this((i & 1) != 0 ? null : str, 0, (i & 4) != 0 ? null : c326960Crm);
    }

    public C1861290yXH(String str, int i, Object obj) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = obj;
    }
}
