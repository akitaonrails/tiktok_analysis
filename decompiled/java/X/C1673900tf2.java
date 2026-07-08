package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673900tf2 extends AbstractC1673910tf3 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1673900tf2)) {
            return false;
        }
        C1673900tf2 c1673900tf2 = (C1673900tf2) obj;
        return Intrinsics.LJFF(this.LIZ, c1673900tf2.LIZ) && this.LIZIZ == c1673900tf2.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowButtonUIUpdate(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1673900tf2(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
