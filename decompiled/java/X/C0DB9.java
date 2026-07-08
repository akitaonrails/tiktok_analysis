package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DB9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DB9 extends C0DB8 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DB9)) {
            return false;
        }
        C0DB9 c0db9 = (C0DB9) obj;
        return Intrinsics.LJFF(this.LIZ, c0db9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0db9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0db9.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inlineMessage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DB9(String str, String str2) {
        String strLIZ = C0D9L.LIZ(2131857591);
        this.LIZ = str;
        this.LIZIZ = strLIZ;
        this.LIZJ = str2;
    }
}
