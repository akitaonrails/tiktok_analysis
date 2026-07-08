package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0axp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955190axp extends AbstractC955360ay6 {
    public final C955310ay1 LIZ;
    public final C955230axt LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955190axp)) {
            return false;
        }
        C955190axp c955190axp = (C955190axp) obj;
        return Intrinsics.LJFF(this.LIZ, c955190axp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c955190axp.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutPipelineWillStart(layoutModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955190axp(C955310ay1 c955310ay1, C955230axt c955230axt) {
        this.LIZ = c955310ay1;
        this.LIZIZ = c955230axt;
    }
}
