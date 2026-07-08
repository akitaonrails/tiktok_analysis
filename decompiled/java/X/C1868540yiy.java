package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868540yiy {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C1868540yiy() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868540yiy)) {
            return false;
        }
        C1868540yiy c1868540yiy = (C1868540yiy) obj;
        return this.LIZ == c1868540yiy.LIZ && Intrinsics.LJFF(this.LIZIZ, c1868540yiy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1868540yiy.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoginPanelCommonConfig(disclaimerTextRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", faqUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraConsentCopy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868540yiy(String str, int i) {
        str = (i & 2) != 0 ? "" : str;
        String str2 = (i & 4) == 0 ? null : "";
        this.LIZ = 0;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
