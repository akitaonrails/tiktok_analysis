package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00F8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00F8 {
    public final Integer LIZ;

    public C00F8() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00F8) && Intrinsics.LJFF(this.LIZ, ((C00F8) obj).LIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchKeyframeOptDir3PanelLayoutSpec(targetRowHeightPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00F8(Integer num) {
        this.LIZ = num;
    }
}
