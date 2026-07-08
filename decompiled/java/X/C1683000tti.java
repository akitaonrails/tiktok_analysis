package X;

import android.graphics.Outline;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683000tti {
    public boolean LIZ = true;
    public final Outline LIZIZ;
    public AbstractC1680810tqB LIZJ;
    public C1695950uEb LIZLLL;
    public InterfaceC1680960tqQ LJ;
    public boolean LJFF;
    public boolean LJI;
    public InterfaceC1680960tqQ LJII;
    public C1680760tq6 LJIIIIZZ;
    public float LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;

    public final void LJ() {
        if (this.LJFF) {
            this.LJIIJ = 0L;
            this.LJIIIZ = 0.0f;
            this.LJ = null;
            this.LJFF = false;
            this.LJI = false;
            AbstractC1680810tqB abstractC1680810tqB = this.LIZJ;
            if (abstractC1680810tqB == null || !this.LJIIL || Float.intBitsToFloat((int) (this.LJIIJJI >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.LJIIJJI & 4294967295L)) <= 0.0f) {
                this.LIZIZ.setEmpty();
                return;
            }
            this.LIZ = true;
            if (abstractC1680810tqB instanceof C1680780tq8) {
                C1683130ttv c1683130ttv = ((C1680780tq8) abstractC1680810tqB).LIZ;
                float f = c1683130ttv.LIZ;
                this.LJIIJ = (((long) Float.floatToRawIntBits(c1683130ttv.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                float f2 = c1683130ttv.LIZJ - c1683130ttv.LIZ;
                this.LJIIJJI = (((long) Float.floatToRawIntBits(c1683130ttv.LIZLLL - c1683130ttv.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
                this.LIZIZ.setRect(Math.round(c1683130ttv.LIZ), Math.round(c1683130ttv.LIZIZ), Math.round(c1683130ttv.LIZJ), Math.round(c1683130ttv.LIZLLL));
                return;
            }
            if (!(abstractC1680810tqB instanceof C1680730tq3)) {
                if (abstractC1680810tqB instanceof C1680800tqA) {
                    LJFF(((C1680800tqA) abstractC1680810tqB).LIZ);
                    return;
                }
                return;
            }
            C1680760tq6 c1680760tq6 = ((C1680730tq3) abstractC1680810tqB).LIZ;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (c1680760tq6.LJ >> 32));
            float f3 = c1680760tq6.LIZ;
            this.LJIIJ = (((long) Float.floatToRawIntBits(c1680760tq6.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
            float f4 = c1680760tq6.LIZJ - c1680760tq6.LIZ;
            this.LJIIJJI = (((long) Float.floatToRawIntBits(c1680760tq6.LIZLLL - c1680760tq6.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
            if (C1680750tq5.LIZIZ(c1680760tq6)) {
                this.LIZIZ.setRoundRect(Math.round(c1680760tq6.LIZ), Math.round(c1680760tq6.LIZIZ), Math.round(c1680760tq6.LIZJ), Math.round(c1680760tq6.LIZLLL), fIntBitsToFloat);
                this.LJIIIZ = fIntBitsToFloat;
                return;
            }
            C1695950uEb c1695950uEbLIZ = this.LIZLLL;
            if (c1695950uEbLIZ == null) {
                c1695950uEbLIZ = C1695940uEa.LIZ();
                this.LIZLLL = c1695950uEbLIZ;
            }
            c1695950uEbLIZ.reset();
            c1695950uEbLIZ.LJIILJJIL(c1680760tq6, EnumC1669110tXJ.CounterClockwise);
            LJFF(c1695950uEbLIZ);
        }
    }

    public C1683000tti() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.LIZIZ = outline;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
    }

    public final Outline LIZIZ() {
        LJ();
        if (this.LJIIL && this.LIZ) {
            return this.LIZIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC1686290tz1 r18) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1683000tti.LIZ(X.0tz1):void");
    }

    public final boolean LIZJ(long j) {
        AbstractC1680810tqB abstractC1680810tqB;
        if (!this.LJIIL || (abstractC1680810tqB = this.LIZJ) == null) {
            return true;
        }
        return C1680720tq2.LIZ(abstractC1680810tqB, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), null, null);
    }

    public final void LJFF(InterfaceC1680960tqQ interfaceC1680960tqQ) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            if (!interfaceC1680960tqQ.LIZLLL()) {
                this.LIZ = false;
                this.LIZIZ.setEmpty();
                this.LJI = true;
                this.LJ = interfaceC1680960tqQ;
                return;
            }
        } else {
            if (i >= 30) {
                C1683010ttj.LIZ(this.LIZIZ, interfaceC1680960tqQ);
            }
            this.LJI = !this.LIZIZ.canClip();
            this.LJ = interfaceC1680960tqQ;
            return;
        }
        Outline outline = this.LIZIZ;
        if (interfaceC1680960tqQ instanceof C1695950uEb) {
            outline.setConvexPath(((C1695950uEb) interfaceC1680960tqQ).LIZIZ);
            this.LJI = !this.LIZIZ.canClip();
            this.LJ = interfaceC1680960tqQ;
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final boolean LIZLLL(AbstractC1680810tqB abstractC1680810tqB, float f, boolean z, float f2, long j) {
        boolean z2;
        this.LIZIZ.setAlpha(f);
        boolean z3 = !Intrinsics.LJFF(this.LIZJ, abstractC1680810tqB);
        if (z3) {
            this.LIZJ = abstractC1680810tqB;
            this.LJFF = true;
        }
        this.LJIIJJI = j;
        if (abstractC1680810tqB != null && (z || f2 > 0.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJIIL != z2) {
            this.LJIIL = z2;
            this.LJFF = true;
        }
        return z3;
    }
}
