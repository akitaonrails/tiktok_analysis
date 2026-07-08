package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172771A1r implements InterfaceC2172841A1y {
    public final C06WA LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final Function0<View> LJFF;
    public final boolean LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C891240Yxm LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172771A1r)) {
            return false;
        }
        C2172771A1r c2172771A1r = (C2172771A1r) obj;
        return Intrinsics.LJFF(this.LIZ, c2172771A1r.LIZ) && this.LIZIZ == c2172771A1r.LIZIZ && this.LIZJ == c2172771A1r.LIZJ && this.LIZLLL == c2172771A1r.LIZLLL && Intrinsics.LJFF(this.LJ, c2172771A1r.LJ) && Intrinsics.LJFF(this.LJFF, c2172771A1r.LJFF) && this.LJI == c2172771A1r.LJI && Intrinsics.LJFF(this.LJII, c2172771A1r.LJII) && this.LJIIIIZZ == c2172771A1r.LJIIIIZZ && this.LJIIIZ == c2172771A1r.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c2172771A1r.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function0<View> function0 = this.LJFF;
        int iHashCode3 = (((iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        String str2 = this.LJII;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        C891240Yxm c891240Yxm = this.LJIIJ;
        return iHashCode4 + (c891240Yxm != null ? c891240Yxm.hashCode() : 0);
    }

    public final String toString() {
        return "ChatDetailTextUiConfig(type=" + this.LIZ + ", titleRes=" + this.LIZIZ + ", iconRes=" + this.LIZJ + ", iconTintColor=" + this.LIZLLL + ", middleLabel=" + this.LJ + ", customDisclosureView=" + this.LJFF + ", showArrow=" + this.LJI + ", endLabel=" + this.LJII + ", negative=" + this.LJIIIIZZ + ", hasAttachedRedDot=" + this.LJIIIZ + ", nxetConfig=" + this.LJIIJ + ')';
    }

    @Override // X.InterfaceC2172841A1y
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LIZIZ);
    }

    @Override // X.InterfaceC2172841A1y
    public final C06WA getType() {
        return this.LIZ;
    }

    public static C2172771A1r LIZ(C2172771A1r c2172771A1r, int i, int i2, String str, boolean z, int i3) {
        C06WA c06wa;
        int i4;
        String str2;
        Function0<View> function0;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        String str3 = str;
        int i5 = i2;
        int i6 = i;
        C891240Yxm c891240Yxm = null;
        if ((i3 & 1) != 0) {
            c06wa = c2172771A1r.LIZ;
        } else {
            c06wa = null;
        }
        if ((i3 & 2) != 0) {
            i6 = c2172771A1r.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i5 = c2172771A1r.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i4 = c2172771A1r.LIZLLL;
        } else {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            str2 = c2172771A1r.LJ;
        } else {
            str2 = null;
        }
        if ((i3 & 32) != 0) {
            function0 = c2172771A1r.LJFF;
        } else {
            function0 = null;
        }
        if ((i3 & 64) != 0) {
            z2 = c2172771A1r.LJI;
        } else {
            z2 = false;
        }
        if ((i3 & 128) != 0) {
            str3 = c2172771A1r.LJII;
        }
        if ((i3 & 256) != 0) {
            z3 = c2172771A1r.LJIIIIZZ;
        } else {
            z3 = false;
        }
        if ((i3 & 512) != 0) {
            z4 = c2172771A1r.LJIIIZ;
        }
        if ((i3 & 1024) != 0) {
            c891240Yxm = c2172771A1r.LJIIJ;
        }
        c2172771A1r.getClass();
        return new C2172771A1r(c06wa, i6, i5, i4, str2, function0, z2, str3, z3, z4, c891240Yxm);
    }

    public /* synthetic */ C2172771A1r(C06WA c06wa, int i, int i2, String str, Function0 function0, boolean z, C891240Yxm c891240Yxm, int i3) {
        this(c06wa, i, i2, 0, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? null : function0, (i3 & 64) != 0 ? false : z, null, false, false, (i3 & 1024) == 0 ? c891240Yxm : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2172771A1r(C06WA c06wa, int i, int i2, int i3, String str, Function0<? extends View> function0, boolean z, String str2, boolean z2, boolean z3, C891240Yxm c891240Yxm) {
        this.LIZ = c06wa;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = str;
        this.LJFF = function0;
        this.LJI = z;
        this.LJII = str2;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = z3;
        this.LJIIJ = c891240Yxm;
    }
}
