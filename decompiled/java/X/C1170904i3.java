package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04i3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1170904i3 {
    public final List<List<String>> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170904i3)) {
            return false;
        }
        C1170904i3 c1170904i3 = (C1170904i3) obj;
        return Intrinsics.LJFF(this.LIZ, c1170904i3.LIZ) && this.LIZIZ == c1170904i3.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TableBlockParseResult(rows=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", consumedLineCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1170904i3(List<? extends List<String>> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
