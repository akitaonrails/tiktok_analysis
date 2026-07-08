package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382280Eyo {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C382280Eyo() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382280Eyo)) {
            return false;
        }
        C382280Eyo c382280Eyo = (C382280Eyo) obj;
        return Intrinsics.LJFF(this.LIZ, c382280Eyo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c382280Eyo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c382280Eyo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c382280Eyo.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("I2VQuotaRequest(creationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sceneTag=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382280Eyo(String str, String str2, String str3, int i) {
        String str4;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        str3 = (i & 8) != 0 ? "" : str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str4;
        this.LIZLLL = str3;
    }
}
