package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366530EYp extends AbstractC366540EYq {
    public final String LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C366530EYp)) {
            return false;
        }
        C366530EYp c366530EYp = (C366530EYp) obj;
        return Intrinsics.LJFF(this.LIZIZ, c366530EYp.LIZIZ) && Float.compare(this.LIZJ, c366530EYp.LIZJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Progress(resId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", progressRatio=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZJ);
    }

    @Override // X.AbstractC366540EYq
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C366530EYp(String str, float f) {
        super(str);
        this.LIZIZ = str;
        this.LIZJ = f;
    }
}
