package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C053200Hi {
    public final int LIZ;
    public final String LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C053200Hi)) {
            return false;
        }
        C053200Hi c053200Hi = (C053200Hi) obj;
        return this.LIZ == c053200Hi.LIZ && Intrinsics.LJFF(this.LIZIZ, c053200Hi.LIZIZ) && Float.compare(this.LIZJ, c053200Hi.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalEmbTag(tagId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tagName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", confidence=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C053200Hi(float f, String str, int i) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = f;
    }
}
