package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IH3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IH3 {
    public final String LIZ = "live_end";
    public final String LIZIZ = "guest_end_panel";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IH3)) {
            return false;
        }
        C0IH3 c0ih3 = (C0IH3) obj;
        return Intrinsics.LJFF(this.LIZ, c0ih3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ih3.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveEndFeedEnterParamEvent(enterFromMerge=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
