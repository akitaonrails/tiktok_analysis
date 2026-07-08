package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Er8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377520Er8 {
    public final Pair<Float, Float> LIZ;
    public final Pair<Float, Float> LIZIZ;
    public final Pair<Float, Float> LIZJ;
    public final Pair<Float, Float> LIZLLL;
    public final Pair<Float, Float> LJ;
    public final Pair<Float, Float> LJFF;
    public final float LJI;
    public final float LJII;
    public final Pair<Float, Float> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377520Er8)) {
            return false;
        }
        C377520Er8 c377520Er8 = (C377520Er8) obj;
        return Intrinsics.LJFF(this.LIZ, c377520Er8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c377520Er8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c377520Er8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c377520Er8.LIZLLL) && Intrinsics.LJFF(this.LJ, c377520Er8.LJ) && Intrinsics.LJFF(this.LJFF, c377520Er8.LJFF) && Float.compare(this.LJI, c377520Er8.LJI) == 0 && Float.compare(this.LJII, c377520Er8.LJII) == 0 && Intrinsics.LJFF(this.LJIIIIZZ, c377520Er8.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlideData(previewScaleX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", previewScaleY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", previewTranY=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackTranY=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", editorProAlpha=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", editBarAlpha=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", textCoefficient=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", textOriginTransY=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", surfaceViewRadis=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public /* synthetic */ C377520Er8(Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, Pair pair6, Pair pair7) {
        this(pair, pair2, pair3, pair4, pair5, pair6, 1.0f, 0.0f, pair7);
    }

    public C377520Er8(Pair<Float, Float> pair, Pair<Float, Float> pair2, Pair<Float, Float> pair3, Pair<Float, Float> pair4, Pair<Float, Float> pair5, Pair<Float, Float> pair6, float f, float f2, Pair<Float, Float> pair7) {
        this.LIZ = pair;
        this.LIZIZ = pair2;
        this.LIZJ = pair3;
        this.LIZLLL = pair4;
        this.LJ = pair5;
        this.LJFF = pair6;
        this.LJI = f;
        this.LJII = f2;
        this.LJIIIIZZ = pair7;
    }
}
