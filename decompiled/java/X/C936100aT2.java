package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936100aT2 implements InterfaceC935960aSo {
    public final long LIZ;
    public final ImageModel LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public final boolean LJII;

    @Override // X.InterfaceC935960aSo
    public final void LIZLLL() {
        this.LJI = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C936100aT2)) {
            return false;
        }
        C936100aT2 c936100aT2 = (C936100aT2) obj;
        return this.LIZ == c936100aT2.LIZ && Intrinsics.LJFF(this.LIZIZ, c936100aT2.LIZIZ) && this.LIZJ == c936100aT2.LIZJ && this.LIZLLL == c936100aT2.LIZLLL && this.LJ == c936100aT2.LJ && this.LJFF == c936100aT2.LJFF && this.LJI == c936100aT2.LJI && this.LJII == c936100aT2.LJII;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        ImageModel imageModel = this.LIZIZ;
        return ((((((((((((iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retry=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loading=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", canDelete=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC935960aSo
    public final boolean LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC935960aSo
    public final boolean getEnable() {
        return this.LJII;
    }

    public C936100aT2(long j, ImageModel imageModel, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5) {
        this.LIZ = j;
        this.LIZIZ = imageModel;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = i;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = z5;
    }
}
