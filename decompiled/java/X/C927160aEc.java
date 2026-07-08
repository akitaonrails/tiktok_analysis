package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927160aEc {
    public final AbstractC948890anf LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C927160aEc)) {
            return false;
        }
        C927160aEc c927160aEc = (C927160aEc) obj;
        return Intrinsics.LJFF(this.LIZ, c927160aEc.LIZ) && this.LIZIZ == c927160aEc.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenRandMatchPanelModel(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C927160aEc(int i, AbstractC948890anf abstractC948890anf) {
        this.LIZ = abstractC948890anf;
        this.LIZIZ = i;
    }
}
