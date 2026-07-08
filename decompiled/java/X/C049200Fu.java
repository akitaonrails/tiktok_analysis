package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Fu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C049200Fu extends AbstractC049400Fw {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final List<String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C049200Fu)) {
            return false;
        }
        C049200Fu c049200Fu = (C049200Fu) obj;
        return this.LIZ == c049200Fu.LIZ && this.LIZIZ == c049200Fu.LIZIZ && this.LIZJ == c049200Fu.LIZJ && this.LIZLLL == c049200Fu.LIZLLL && this.LJ == c049200Fu.LJ && Intrinsics.LJFF(this.LJFF, c049200Fu.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiPhotoSelectConfig(reqCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hintTextResId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", selectedPathList=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC049400Fw
    public final int LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC049400Fw
    public final int LIZIZ() {
        return this.LJ;
    }

    public C049200Fu(int i, List list, int i2) {
        super(3);
        this.LIZ = 4097;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = 2131837606;
        this.LJ = 3;
        this.LJFF = list;
    }
}
