package X;

import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19214410Fa {
    public final C10FW LIZ;
    public final AbstractC19215010Fg LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final CMPreviewInfo LJFF;
    public final float LJI;
    public final boolean LJII;
    public final float LJIIIIZZ;
    public final Pair<C10FW, Float> LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final long LJIIL;
    public final C443120HZe<String, String, String> LJIILIIL;
    public final boolean LJIILJJIL;
    public final float LJIILL;

    public C19214410Fa() {
        this(0);
    }

    public final C19214410Fa LIZJ() {
        return LIZ(this, null, C19215210Fi.LIZ, 0.0f, 0.0f, 0.0f, null, 0.0f, false, 0.0f, 509);
    }

    public final AbstractC1159950gI5 LIZIZ() {
        return C1677160tkI.LIZ(this.LIZLLL - this.LIZJ) < 10 ? new AbstractC1159950gI5() { // from class: X.0gI3
            public final float LIZ = 10.0f;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1159930gI3) && Float.compare(this.LIZ, ((C1159930gI3) obj).LIZ) == 0;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MinimumBound(min=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.LIZ);
            }
        } : C1677160tkI.LIZ(C10FS.LJ(this.LJIIL)) > C1677160tkI.LIZ(this.LJIILL) ? new C1159940gI4(this.LJIILL) : C1159960gI6.LIZ;
    }

    public /* synthetic */ C19214410Fa(int i) {
        this(null, new AbstractC19215010Fg() { // from class: X.10Fh
        }, 0.0f, 10.0f, 0.0f, null, 0.0f, false, 0.0f);
    }

    public final C19214410Fa LIZLLL(float f) {
        return LIZ(this, null, null, 0.0f, 0.0f, 0.0f, null, f, false, 0.0f, 447);
    }

    public C19214410Fa(C10FW c10fw, AbstractC19215010Fg abstractC19215010Fg, float f, float f2, float f3, CMPreviewInfo cMPreviewInfo, float f4, boolean z, float f5) {
        this.LIZ = c10fw;
        this.LIZIZ = abstractC19215010Fg;
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = f3;
        this.LJFF = cMPreviewInfo;
        this.LJI = f4;
        this.LJII = z;
        this.LJIIIIZZ = f5;
        this.LJIIIZ = new Pair<>(c10fw, Float.valueOf(f));
        this.LJIIJ = C10FS.LIZIZ(f);
        this.LJIIJJI = C10FS.LIZIZ(f2);
        float f6 = f2 - f;
        this.LJIIL = C10FS.LIZJ(f6);
        this.LJIILIIL = C10FS.LIZ(false, Float.valueOf(f6));
        this.LJIILJJIL = Intrinsics.LJFF(abstractC19215010Fg, C1688490u2Z.LIZ);
        this.LJIILL = f3 / 2;
    }

    public static C19214410Fa LIZ(C19214410Fa c19214410Fa, C10FW c10fw, AbstractC19215010Fg abstractC19215010Fg, float f, float f2, float f3, CMPreviewInfo cMPreviewInfo, float f4, boolean z, float f5, int i) {
        float f6 = f5;
        boolean z2 = z;
        float f7 = f4;
        CMPreviewInfo cMPreviewInfo2 = cMPreviewInfo;
        float f8 = f3;
        float f9 = f2;
        float f10 = f;
        AbstractC19215010Fg abstractC19215010Fg2 = abstractC19215010Fg;
        C10FW c10fw2 = c10fw;
        if ((i & 1) != 0) {
            c10fw2 = c19214410Fa.LIZ;
        }
        if ((i & 2) != 0) {
            abstractC19215010Fg2 = c19214410Fa.LIZIZ;
        }
        if ((i & 4) != 0) {
            f10 = c19214410Fa.LIZJ;
        }
        if ((i & 8) != 0) {
            f9 = c19214410Fa.LIZLLL;
        }
        if ((i & 16) != 0) {
            f8 = c19214410Fa.LJ;
        }
        if ((i & 32) != 0) {
            cMPreviewInfo2 = c19214410Fa.LJFF;
        }
        if ((i & 64) != 0) {
            f7 = c19214410Fa.LJI;
        }
        if ((i & 128) != 0) {
            z2 = c19214410Fa.LJII;
        }
        if ((i & 256) != 0) {
            f6 = c19214410Fa.LJIIIIZZ;
        }
        c19214410Fa.getClass();
        return new C19214410Fa(c10fw2, abstractC19215010Fg2, f10, f9, f8, cMPreviewInfo2, f7, z2, f6);
    }
}
