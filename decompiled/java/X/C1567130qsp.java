package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567130qsp {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567130qsp)) {
            return false;
        }
        C1567130qsp c1567130qsp = (C1567130qsp) obj;
        return Intrinsics.LJFF(this.LIZ, c1567130qsp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1567130qsp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1567130qsp.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelNoticeAutoLoginInfo(startUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1567130qsp(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
