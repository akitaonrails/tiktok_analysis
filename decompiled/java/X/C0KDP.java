package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KDP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDP {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public C0KDP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KDP)) {
            return false;
        }
        C0KDP c0kdp = (C0KDP) obj;
        return Intrinsics.LJFF(this.LIZ, c0kdp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kdp.LIZIZ) && this.LIZJ == c0kdp.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0kdp.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PayResult(packageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", payStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", payMessage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0KDP(int i) {
        this("", "", -999, "");
    }

    public C0KDP(String str, String str2, int i, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
    }
}
