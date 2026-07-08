package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576800Mjm extends AbstractC576850Mjr {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C576800Mjm)) {
            return false;
        }
        C576800Mjm c576800Mjm = (C576800Mjm) obj;
        return Intrinsics.LJFF(this.LIZ, c576800Mjm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c576800Mjm.LIZIZ) && this.LIZJ == c576800Mjm.LIZJ && this.LIZLLL == c576800Mjm.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoSuccess(videoPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", audioPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C576800Mjm(String str, String str2, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
