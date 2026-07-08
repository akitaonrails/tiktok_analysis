package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366510EYn extends AbstractC366540EYq {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C366510EYn) && Intrinsics.LJFF(this.LIZIZ, ((C366510EYn) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(resId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC366540EYq
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C366510EYn(String str) {
        super(str);
        this.LIZIZ = str;
    }
}
