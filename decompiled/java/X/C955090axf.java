package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0axf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955090axf {
    public final transient ViewGroup LIZ;
    public final RectF LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final Rect LJ;
    public final int LJFF;
    public final String LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;

    public final String toString() {
        return "CoHostWindowLayoutInfo(windowParentView=" + this.LIZ + ", parentViewRect=" + this.LIZIZ + ", isSelf=" + this.LIZJ + ", uiPos=" + this.LIZLLL + ", windowViewRect=" + this.LJ + ", radius=" + this.LJFF + ", linkMicId=" + this.LJI + ", isAuxStreamSource=" + this.LJII + ", streamId=" + this.LJIIIIZZ + ", isEmptyView=" + this.LJIIIZ + ", emptyViewType=" + this.LJIIJ + ", cohostWindowExtra=" + this.LJIIJJI + ", isEnlarged=" + this.LJIIL + ')';
    }

    public C955090axf(C957020b0m c957020b0m, RectF rectF, boolean z, int i, Rect rect, int i2, String str, boolean z2, String str2, boolean z3, String str3, String str4, boolean z4) {
        this.LIZ = c957020b0m;
        this.LIZIZ = rectF;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = rect;
        this.LJFF = i2;
        this.LJI = str;
        this.LJII = z2;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = z3;
        this.LJIIJ = str3;
        this.LJIIJJI = str4;
        this.LJIIL = z4;
    }
}
