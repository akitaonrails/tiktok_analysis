package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777240wLi extends AbstractC1777330wLr {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777240wLi)) {
            return false;
        }
        C1777240wLi c1777240wLi = (C1777240wLi) obj;
        return Intrinsics.LJFF(this.LIZ, c1777240wLi.LIZ) && this.LIZIZ == c1777240wLi.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportPanelStatusChange(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isOpen=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777240wLi(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
