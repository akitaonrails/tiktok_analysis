package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1875307Wd {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1875307Wd)) {
            return false;
        }
        C1875307Wd c1875307Wd = (C1875307Wd) obj;
        return Intrinsics.LJFF(this.LIZ, c1875307Wd.LIZ) && this.LIZIZ == c1875307Wd.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypewriterFinishedInfo(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", answerIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1875307Wd(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
