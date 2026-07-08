package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567200qsw {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567200qsw)) {
            return false;
        }
        C1567200qsw c1567200qsw = (C1567200qsw) obj;
        return Intrinsics.LJFF(this.LIZ, c1567200qsw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1567200qsw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1567200qsw.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelNoticeInput(viewName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appStoreRegion=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1567200qsw(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
