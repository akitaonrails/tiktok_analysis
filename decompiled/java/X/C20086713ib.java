package X;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* JADX INFO: renamed from: X.13ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20086713ib implements InterfaceC1681290tqx {
    public final InterfaceC1690500u5o LIZ;
    public long LIZIZ = 9205357640488583168L;
    public final C20087013ie LIZJ;
    public final C05P0<Unit> LIZLLL;
    public final boolean LJ;
    public boolean LJFF;
    public long LJI;
    public long LJII;
    public final AbstractC20055313dX LJIIIIZZ;

    @Override // X.InterfaceC1681290tqx
    public final boolean LIZ() {
        C20087013ie c20087013ie = this.LIZJ;
        EdgeEffect edgeEffect = c20087013ie.LIZLLL;
        if (edgeEffect != null && C20087213ig.LIZIZ(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = c20087013ie.LJ;
        if (edgeEffect2 != null && C20087213ig.LIZIZ(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = c20087013ie.LJFF;
        if (edgeEffect3 != null && C20087213ig.LIZIZ(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = c20087013ie.LJI;
        return (edgeEffect4 == null || C20087213ig.LIZIZ(edgeEffect4) == 0.0f) ? false : true;
    }

    public final void LIZIZ() {
        boolean z;
        C20087013ie c20087013ie = this.LIZJ;
        EdgeEffect edgeEffect = c20087013ie.LIZLLL;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c20087013ie.LJ;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = c20087013ie.LJFF;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = c20087013ie.LJI;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                return;
            }
        } else if (!z) {
            return;
        }
        LIZLLL();
    }

    public final long LIZJ() {
        long jLIZIZ = this.LIZIZ;
        if ((9223372034707292159L & jLIZIZ) == 9205357640488583168L) {
            jLIZIZ = C1671580tbI.LIZIZ(this.LJI);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jLIZIZ >> 32)) / Float.intBitsToFloat((int) (this.LJI >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jLIZIZ & 4294967295L)) / Float.intBitsToFloat((int) (this.LJI & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void LIZLLL() {
        if (this.LJ) {
            ((C13FE) this.LIZLLL).setValue(Unit.LIZ);
        }
    }

    @Override // X.InterfaceC1681290tqx
    public final InterfaceC1691470u7N LJIJJ() {
        return this.LJIIIIZZ;
    }

    public final float LJ(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LIZJ() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.LJI & 4294967295L));
        EdgeEffect edgeEffectLIZIZ = this.LIZJ.LIZIZ();
        float fIntBitsToFloat3 = (-C20087213ig.LIZLLL(edgeEffectLIZIZ, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.LJI & 4294967295L));
        if (C20087213ig.LIZIZ(edgeEffectLIZIZ) != 0.0f) {
            return Float.intBitsToFloat(i);
        }
        return fIntBitsToFloat3;
    }

    public final float LJFF(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LIZJ() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.LJI >> 32));
        EdgeEffect edgeEffectLIZJ = this.LIZJ.LIZJ();
        float fLIZLLL = C20087213ig.LIZLLL(edgeEffectLIZJ, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.LJI >> 32));
        if (C20087213ig.LIZIZ(edgeEffectLIZJ) != 0.0f) {
            return Float.intBitsToFloat(i);
        }
        return fLIZLLL;
    }

    public final float LJI(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LIZJ() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.LJI >> 32));
        EdgeEffect edgeEffectLIZLLL = this.LIZJ.LIZLLL();
        float fIntBitsToFloat3 = (-C20087213ig.LIZLLL(edgeEffectLIZLLL, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.LJI >> 32));
        if (C20087213ig.LIZIZ(edgeEffectLIZLLL) != 0.0f) {
            return Float.intBitsToFloat(i);
        }
        return fIntBitsToFloat3;
    }

    public final float LJII(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (LIZJ() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.LJI & 4294967295L));
        EdgeEffect edgeEffectLJ = this.LIZJ.LJ();
        float fLIZLLL = C20087213ig.LIZLLL(edgeEffectLJ, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.LJI & 4294967295L));
        if (C20087213ig.LIZIZ(edgeEffectLJ) != 0.0f) {
            return Float.intBitsToFloat(i);
        }
        return fLIZLLL;
    }

    public final void LJIIIIZZ(long j) {
        boolean zLIZ = C1680770tq7.LIZ(this.LJI, 0L);
        boolean z = !C1680770tq7.LIZ(j, this.LJI);
        this.LJI = j;
        if (z) {
            C20087013ie c20087013ie = this.LIZJ;
            long jLIZIZ = (((long) C814420VxA.LIZIZ(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) C814420VxA.LIZIZ(Float.intBitsToFloat((int) (j >> 32)))) << 32);
            c20087013ie.LIZJ = jLIZIZ;
            EdgeEffect edgeEffect = c20087013ie.LIZLLL;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jLIZIZ >> 32), (int) (jLIZIZ & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c20087013ie.LJ;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jLIZIZ >> 32), (int) (jLIZIZ & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c20087013ie.LJFF;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jLIZIZ & 4294967295L), (int) (jLIZIZ >> 32));
            }
            EdgeEffect edgeEffect4 = c20087013ie.LJI;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jLIZIZ & 4294967295L), (int) (jLIZIZ >> 32));
            }
            EdgeEffect edgeEffect5 = c20087013ie.LJII;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jLIZIZ >> 32), (int) (jLIZIZ & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c20087013ie.LJIIIIZZ;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jLIZIZ >> 32), (int) (jLIZIZ & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c20087013ie.LJIIIZ;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jLIZIZ & 4294967295L), (int) (jLIZIZ >> 32));
            }
            EdgeEffect edgeEffect8 = c20087013ie.LJIIJ;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jLIZIZ & 4294967295L), (int) (jLIZIZ >> 32));
            }
        }
        if (!zLIZ && z) {
            LIZIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02dc A[PHI: r1
      0x02dc: PHI (r1v12 float) = (r1v10 float), (r1v14 float) binds: [B:162:0x02d4, B:46:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    @Override // X.InterfaceC1681290tqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIJJLI(int r21, long r22, kotlin.jvm.functions.Function1 r24) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20086713ib.LJIJJLI(int, long, kotlin.jvm.functions.Function1):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0198  */
    @Override // X.InterfaceC1681290tqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIL(long r12, kotlin.jvm.functions.Function2<? super X.C1395705dD, ? super X.InterfaceC1364105Vn<? super X.C1395705dD>, ? extends java.lang.Object> r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20086713ib.LJIL(long, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    public C20086713ib(Context context, InterfaceC1690500u5o interfaceC1690500u5o, long j, InterfaceC1679150tnV interfaceC1679150tnV) {
        AbstractC20055313dX c20086913id;
        this.LIZ = interfaceC1690500u5o;
        C20087013ie c20087013ie = new C20087013ie(context, C1685850tyJ.LJIIIZ(j));
        this.LIZJ = c20087013ie;
        this.LIZLLL = C20028913Yh.LJFF(Unit.LIZ, C13FT.LIZ);
        this.LJ = true;
        this.LJI = 0L;
        this.LJII = -1L;
        PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: X.05U9
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C05U8(this.LL, null), interfaceC1364105Vn);
                if (objLIZIZ == C099R.LJFF()) {
                    return objLIZIZ;
                }
                return Unit.LIZ;
            }
        };
        C20067313fT c20067313fT = C1679720toQ.LIZ;
        C20065413fA c20065413fA = new C20065413fA(null, null, null, pointerInputEventHandler);
        if (Build.VERSION.SDK_INT >= 31) {
            c20086913id = new C20086813ic(c20065413fA, this, c20087013ie);
        } else {
            c20086913id = new C20086913id(c20065413fA, this, c20087013ie, interfaceC1679150tnV);
        }
        this.LJIIIIZZ = c20086913id;
    }
}
