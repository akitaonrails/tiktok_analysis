package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uiv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714750uiv extends AbstractC1714770uix {
    public final C1714740uiu LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1714750uiv)) {
            return false;
        }
        C1714750uiv c1714750uiv = (C1714750uiv) obj;
        return Intrinsics.LJFF(this.LIZ, c1714750uiv.LIZ) && this.LIZIZ == c1714750uiv.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Direct(option=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entryLabelResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1714750uiv(C1714740uiu c1714740uiu, int i) {
        this.LIZ = c1714740uiu;
        this.LIZIZ = i;
    }
}
