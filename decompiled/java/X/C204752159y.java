package X;

import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204752159y implements InterfaceC20477315At {
    public final EnumC20439114yL LIZ;
    public final String LIZIZ;
    public final C15AK<? extends C15A8> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public boolean LJI;

    public C204752159y() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C204752159y)) {
            return false;
        }
        C204752159y c204752159y = (C204752159y) obj;
        return this.LIZ == c204752159y.LIZ && Intrinsics.LJFF(this.LIZIZ, c204752159y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c204752159y.LIZJ) && this.LIZLLL == c204752159y.LIZLLL && this.LJ == c204752159y.LJ && this.LJFF == c204752159y.LJFF && this.LJI == c204752159y.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C15AK<? extends C15A8> c15ak = this.LIZJ;
        return ((((((((iHashCode + (c15ak == null ? 0 : c15ak.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageGeniusConfig(resType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", res=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", alphaAnimationConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", repeatCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", repeatMode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enableShowRes=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", detached=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20477315At
    public final InterfaceC20477315At LIZJ() {
        EnumC20439114yL enumC20439114yL = this.LIZ;
        String str = this.LIZIZ;
        int i = this.LIZLLL;
        int i2 = this.LJ;
        boolean z = this.LJI;
        C15AK<? extends C15A8> c15ak = this.LIZJ;
        C15AK c15ak2 = null;
        if (c15ak != null) {
            long j = c15ak.LIZ;
            long j2 = c15ak.LIZIZ;
            Interpolator interpolator = c15ak.LIZJ;
            C15AG c15ag = c15ak.LIZLLL;
            T t = c15ak.LJ;
            c15ak2 = new C15AK(j, j2, interpolator, c15ag, t != 0 ? (C15A8) t.LIZ() : null);
        }
        return new C204752159y(enumC20439114yL, str, c15ak2, i, i2, false, z, 32);
    }

    @Override // X.InterfaceC20477315At
    public final boolean LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC20477315At
    public final void LIZIZ(boolean z) {
        this.LJI = z;
    }

    public C204752159y(EnumC20439114yL enumC20439114yL, String str, C15AK c15ak, int i, int i2, boolean z, boolean z2, int i3) {
        c15ak = (i3 & 4) != 0 ? null : c15ak;
        i = (i3 & 8) != 0 ? 0 : i;
        i2 = (i3 & 16) != 0 ? 1 : i2;
        z = (i3 & 32) != 0 ? true : z;
        z2 = (i3 & 64) != 0 ? false : z2;
        this.LIZ = enumC20439114yL;
        this.LIZIZ = str;
        this.LIZJ = c15ak;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = z;
        this.LJI = z2;
    }
}
