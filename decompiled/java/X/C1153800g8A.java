package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153800g8A {
    public final String LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153800g8A)) {
            return false;
        }
        C1153800g8A c1153800g8A = (C1153800g8A) obj;
        return Intrinsics.LJFF(this.LIZ, c1153800g8A.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1153800g8A.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationLabelTextInfo(formatString=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nameList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153800g8A(String str, List<String> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
