package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533320Kvq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C533320Kvq)) {
            return false;
        }
        C533320Kvq c533320Kvq = (C533320Kvq) obj;
        return Intrinsics.LJFF(this.LIZ, c533320Kvq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c533320Kvq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c533320Kvq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c533320Kvq.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LokiQueryParams(resourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", appName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C533320Kvq(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
