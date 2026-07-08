package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787110UuD {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C787110UuD)) {
            return false;
        }
        C787110UuD c787110UuD = (C787110UuD) obj;
        return Intrinsics.LJFF(this.LIZ, c787110UuD.LIZ) && this.LIZIZ == c787110UuD.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautySequence(effectId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C787110UuD(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
