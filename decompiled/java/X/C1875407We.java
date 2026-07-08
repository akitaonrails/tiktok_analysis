package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07We, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1875407We {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1875407We)) {
            return false;
        }
        C1875407We c1875407We = (C1875407We) obj;
        return Intrinsics.LJFF(this.LIZ, c1875407We.LIZ) && this.LIZIZ == c1875407We.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarkdownRenderFinishedInfo(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", answerIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1875407We(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
