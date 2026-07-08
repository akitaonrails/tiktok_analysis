package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VSO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSO {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C0VSO() {
        this("", 0L, "", "");
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AOPReportEvent(actionType='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", content='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', backtrace='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C0VSO c0vso = (C0VSO) obj;
        if (!Intrinsics.LJFF(this.LIZ, c0vso.LIZ) || !Intrinsics.LJFF(this.LIZJ, c0vso.LIZJ) || !Intrinsics.LJFF(this.LIZLLL, c0vso.LIZLLL)) {
            return false;
        }
        return true;
    }

    public C0VSO(String str, long j, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
