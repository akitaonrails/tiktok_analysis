package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WNA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WNA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C828420Wee LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WNA)) {
            return false;
        }
        C0WNA c0wna = (C0WNA) obj;
        return Intrinsics.LJFF(this.LIZ, c0wna.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0wna.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0wna.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0wna.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JSBridgeEvent(mainFrameUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iframeUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", jsbName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", securityEvent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WNA(String str, String str2, String str3, C828420Wee c828420Wee) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c828420Wee;
    }
}
