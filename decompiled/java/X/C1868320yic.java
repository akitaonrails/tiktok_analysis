package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868320yic implements InterfaceC951240arS<Object> {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868320yic)) {
            return false;
        }
        C1868320yic c1868320yic = (C1868320yic) obj;
        return this.LIZ == c1868320yic.LIZ && Intrinsics.LJFF(this.LIZIZ, c1868320yic.LIZIZ) && this.LIZJ == c1868320yic.LIZJ && this.LIZLLL == c1868320yic.LIZLLL && this.LJ == c1868320yic.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorAddTagItem(tagType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tagName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPrimary=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C1868320yic) {
            return Intrinsics.LJFF(obj, this);
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868320yic;
    }

    public C1868320yic(int i, String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
