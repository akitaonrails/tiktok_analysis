package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20591115hl {
    public final EnumC20591315hn LIZ;
    public final C19389510tR LIZIZ;
    public final EnumC1153530g7j LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final EnumC1284990jXl LJIIIIZZ;
    public final boolean LJIIIZ;
    public final EnumC19380610s0 LJIIJ;
    public final WeakReference<View> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20591115hl)) {
            return false;
        }
        C20591115hl c20591115hl = (C20591115hl) obj;
        return this.LIZ == c20591115hl.LIZ && Intrinsics.LJFF(this.LIZIZ, c20591115hl.LIZIZ) && this.LIZJ == c20591115hl.LIZJ && this.LIZLLL == c20591115hl.LIZLLL && this.LJ == c20591115hl.LJ && this.LJFF == c20591115hl.LJFF && this.LJI == c20591115hl.LJI && this.LJII == c20591115hl.LJII && this.LJIIIIZZ == c20591115hl.LJIIIIZZ && this.LJIIIZ == c20591115hl.LJIIIZ && this.LJIIJ == c20591115hl.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c20591115hl.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31;
        WeakReference<View> weakReference = this.LJIIJJI;
        return iHashCode + (weakReference == null ? 0 : weakReference.hashCode());
    }

    public final String toString() {
        return "WindowSizeUpdate(orientation=" + this.LIZ + ", windowSize=" + this.LIZIZ + ", screenMode=" + this.LIZJ + ", isScreenModeChanged=" + this.LIZLLL + ", isInMultiWindowMode=" + this.LJ + ", isVerticalSplit=" + this.LJFF + ", isHorizontalSplit=" + this.LJI + ", isFold=" + this.LJII + ", foldType=" + this.LJIIIIZZ + ", isFoldStatusChanged=" + this.LJIIIZ + ", foldStatus=" + this.LJIIJ + ", viewWR=" + this.LJIIJJI + ')';
    }

    public C20591115hl(EnumC20591315hn enumC20591315hn, C19389510tR c19389510tR, EnumC1153530g7j enumC1153530g7j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EnumC1284990jXl enumC1284990jXl, boolean z6, EnumC19380610s0 enumC19380610s0, WeakReference<View> weakReference) {
        this.LIZ = enumC20591315hn;
        this.LIZIZ = c19389510tR;
        this.LIZJ = enumC1153530g7j;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = z5;
        this.LJIIIIZZ = enumC1284990jXl;
        this.LJIIIZ = z6;
        this.LJIIJ = enumC19380610s0;
        this.LJIIJJI = weakReference;
    }
}
