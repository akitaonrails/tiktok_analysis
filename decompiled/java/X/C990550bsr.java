package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990550bsr {
    public final String LIZ;
    public final String LIZIZ = null;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C990550bsr)) {
            return false;
        }
        C990550bsr c990550bsr = (C990550bsr) obj;
        return Intrinsics.LJFF(this.LIZ, c990550bsr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c990550bsr.LIZIZ) && this.LIZJ == c990550bsr.LIZJ && Intrinsics.LJFF(this.LIZLLL, c990550bsr.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ) * 31;
        String str2 = this.LIZLLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MynaPreloadItem(templateUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C990550bsr(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZJ = i;
        this.LIZLLL = str2;
        if (!a0.LJJJIL(str)) {
            if (i >= 0) {
                return;
            }
            "MynaPreloadItem.viewCount must be non-negative".toString();
            throw new IllegalArgumentException("MynaPreloadItem.viewCount must be non-negative");
        }
        "MynaPreloadItem.templateUrl must not be blank".toString();
        throw new IllegalArgumentException("MynaPreloadItem.templateUrl must not be blank");
    }
}
