package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uiw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714760uiw extends AbstractC1714770uix {
    public final List<C1714740uiu> LIZ;
    public final int LIZIZ = 2131840411;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1714760uiw)) {
            return false;
        }
        C1714760uiw c1714760uiw = (C1714760uiw) obj;
        return Intrinsics.LJFF(this.LIZ, c1714760uiw.LIZ) && this.LIZIZ == c1714760uiw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sheet(options=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entryLabelResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1714760uiw(List list) {
        this.LIZ = list;
    }
}
