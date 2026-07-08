package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xtz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C863410Xtz implements InterfaceC1785530wZ5 {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C863410Xtz)) {
            return false;
        }
        C863410Xtz c863410Xtz = (C863410Xtz) obj;
        return this.LIZ == c863410Xtz.LIZ && Intrinsics.LJFF(this.LIZIZ, c863410Xtz.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowMatchRecommendNotificationConfirm(pushEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", settingsLink=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C863410Xtz(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
