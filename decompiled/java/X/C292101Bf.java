package X;

import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C292101Bf {
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C292101Bf)) {
            return false;
        }
        C292101Bf c292101Bf = (C292101Bf) obj;
        return Intrinsics.LJFF(this.LIZ, c292101Bf.LIZ) && this.LIZIZ == c292101Bf.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExclusivePanelBuildResult(panels=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstExclusiveGroupItemCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C292101Bf(int i, LinkedList linkedList) {
        this.LIZ = linkedList;
        this.LIZIZ = i;
    }
}
