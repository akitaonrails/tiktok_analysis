package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04x6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1264204x6 {
    public final String LIZ;
    public final boolean LIZIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264204x6)) {
            return false;
        }
        C1264204x6 c1264204x6 = (C1264204x6) obj;
        return Intrinsics.LJFF(this.LIZ, c1264204x6.LIZ) && this.LIZIZ == c1264204x6.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuestInviteSectionHeaderItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needTopMargin=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1264204x6(String str) {
        this.LIZ = str;
    }
}
