package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NNF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NNF extends C0NNI {
    public final C0NNE LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0NNF) && Intrinsics.LJFF(this.LLILZLL, ((C0NNF) obj).LLILZLL);
    }

    public final int hashCode() {
        C0NNE c0nne = this.LLILZLL;
        if (c0nne == null) {
            return 0;
        }
        return c0nne.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursEntranceWithSticker(sticker=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NNF(C0NNE c0nne) {
        super(Long.valueOf(c0nne.LIZ), c0nne.LIZJ, null, c0nne instanceof C0NND, true);
        this.LLILZLL = c0nne;
    }
}
