package X;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680390QmT {
    public final int LIZ;
    public RectF LIZIZ;
    public RectF LIZJ;
    public PointF LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final RectF LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C680390QmT)) {
            return false;
        }
        C680390QmT c680390QmT = (C680390QmT) obj;
        return this.LIZ == c680390QmT.LIZ && Intrinsics.LJFF(this.LIZIZ, c680390QmT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c680390QmT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c680390QmT.LIZLLL) && this.LJ == c680390QmT.LJ && this.LJFF == c680390QmT.LJFF && Intrinsics.LJFF(this.LJI, c680390QmT.LJI) && this.LJII == c680390QmT.LJII;
    }

    public C680390QmT(int i, RectF rectF, RectF rectF2, boolean z, boolean z2, int i2) {
        PointF pointF;
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            float f = 2;
            pointF = new PointF(rectF.left + (rectF.width() / f), rectF.top + (rectF.height() / f));
        } else {
            pointF = null;
        }
        z = (i2 & 16) != 0 ? true : z;
        RectF rectF3 = (i2 & 64) != 0 ? new RectF() : null;
        z2 = (i2 & 128) != 0 ? false : z2;
        this.LIZ = i;
        this.LIZIZ = rectF;
        this.LIZJ = rectF2;
        this.LIZLLL = pointF;
        this.LJ = z;
        this.LJFF = false;
        this.LJI = rectF3;
        this.LJII = z2;
    }
}
