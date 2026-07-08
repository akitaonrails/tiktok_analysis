package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import tikcast.linkmic.common.CohostTypeSpotExtra;

/* JADX INFO: renamed from: X.0axe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955080axe {
    public final transient FrameLayout LIZ;
    public final RectF LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final Rect LJFF;
    public final int LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final EnumC918810a19 LJIIJJI;
    public final boolean LJIIL;
    public final String LJIILIIL;
    public final CohostTypeSpotExtra LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final C955230axt LJIIZILJ;

    public final String toString() {
        return "CoHostWindowLayoutInfoWithStreamState(windowParentView=" + this.LIZ + ", parentViewRect=" + this.LIZIZ + ", isRoomOwner=" + this.LIZJ + ", spotId=" + this.LIZLLL + ", uiPos=" + this.LJ + ", windowViewRect=" + this.LJFF + ", radius=" + this.LJI + ", linkMicType=" + this.LJII + ", linkMicId=" + this.LJIIIIZZ + ", isAuxStreamSource=" + this.LJIIIZ + ", streamId=" + this.LJIIJ + ", linkState=" + this.LJIIJJI + ", isEmptyView=" + this.LJIIL + ", emptyViewType=" + this.LJIILIIL + ", coHostWindowExtra=" + this.LJIILJJIL + ", isEnlargeMode=" + this.LJIILL + ", isPipelineFirstCallback=" + this.LJIILLIIL + ", source=" + this.LJIIZILJ + ')';
    }

    public final String LIZ() {
        return this.LJII == 2 ? this.LJIIJ : this.LJIIIIZZ;
    }

    public C955080axe(C957020b0m c957020b0m, RectF rectF, boolean z, long j, int i, Rect rect, int i2, int i3, String str, boolean z2, String str2, EnumC918810a19 enumC918810a19, boolean z3, String str3, CohostTypeSpotExtra cohostTypeSpotExtra, boolean z4, boolean z5, C955230axt c955230axt) {
        this.LIZ = c957020b0m;
        this.LIZIZ = rectF;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = i;
        this.LJFF = rect;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = str;
        this.LJIIIZ = z2;
        this.LJIIJ = str2;
        this.LJIIJJI = enumC918810a19;
        this.LJIIL = z3;
        this.LJIILIIL = str3;
        this.LJIILJJIL = cohostTypeSpotExtra;
        this.LJIILL = z4;
        this.LJIILLIIL = z5;
        this.LJIIZILJ = c955230axt;
    }
}
