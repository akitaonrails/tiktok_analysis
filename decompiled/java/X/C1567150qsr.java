package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567150qsr {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567150qsr)) {
            return false;
        }
        C1567150qsr c1567150qsr = (C1567150qsr) obj;
        return Intrinsics.LJFF(this.LIZ, c1567150qsr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1567150qsr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1567150qsr.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelAutoLoginUiInfo(startUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1567150qsr(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
