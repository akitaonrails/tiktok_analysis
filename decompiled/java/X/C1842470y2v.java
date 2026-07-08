package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842470y2v {
    public C1810410xDD LIZ;
    public String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public RankAnimationInfo LJI;
    public final ImageModel LJII;
    public C1810410xDD LJIIIIZZ;
    public final int LJIIIZ;
    public final long LJIIJ = System.currentTimeMillis();

    public final C1842470y2v LIZ() {
        return new C1842470y2v(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.LIZ.hashCode() * 31;
        C1810410xDD c1810410xDD = this.LIZ;
        int iHashCode2 = (((((iHashCode + c1810410xDD.LIZIZ.type) * 31) + c1810410xDD.LIZLLL.type) * 31) + this.LIZIZ.hashCode()) * 31;
        RankAnimationInfo rankAnimationInfo = this.LJI;
        return iHashCode2 + (rankAnimationInfo != null ? Integer.valueOf(rankAnimationInfo.type).hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C1842470y2v c1842470y2v = (C1842470y2v) obj;
        C1810410xDD c1810410xDD = this.LIZ;
        EnumC1811400xEo enumC1811400xEo = c1810410xDD.LIZ;
        C1810410xDD c1810410xDD2 = c1842470y2v.LIZ;
        if (enumC1811400xEo == c1810410xDD2.LIZ && Intrinsics.LJFF(c1810410xDD.LIZIZ, c1810410xDD2.LIZIZ) && Intrinsics.LJFF(this.LIZ.LIZLLL, c1842470y2v.LIZ.LIZLLL) && Intrinsics.LJFF(this.LIZIZ, c1842470y2v.LIZIZ) && this.LIZJ == c1842470y2v.LIZJ) {
            RankAnimationInfo rankAnimationInfo = this.LJI;
            if (rankAnimationInfo != null) {
                i = rankAnimationInfo.type;
            } else {
                i = 0;
            }
            RankAnimationInfo rankAnimationInfo2 = c1842470y2v.LJI;
            if (rankAnimationInfo2 != null) {
                i2 = rankAnimationInfo2.type;
            } else {
                i2 = 0;
            }
            if (i == i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1842470y2v(C1810410xDD c1810410xDD, String str, boolean z, boolean z2, long j, boolean z3, RankAnimationInfo rankAnimationInfo, ImageModel imageModel, C1810410xDD c1810410xDD2, int i) {
        this.LIZ = c1810410xDD;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = j;
        this.LJFF = z3;
        this.LJI = rankAnimationInfo;
        this.LJII = imageModel;
        this.LJIIIIZZ = c1810410xDD2;
        this.LJIIIZ = i;
    }
}
