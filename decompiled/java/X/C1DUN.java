package X;

import android.graphics.Color;
import android.view.Choreographer;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DUN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DUN implements Choreographer.FrameCallback {
    public final TextureViewSurfaceTextureListenerC1284890jXb LL;
    public final Function0<C1143590frh> LLILLJJLI;
    public C1147340fxk LLILLL;
    public C1396005dG LLILZ = new C1396005dG(null, 0, 31);
    public boolean LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public String LLJIJIL;
    public int LLJILJIL;
    public float LLJILJILJ;
    public C1147220fxY LLJILLL;
    public C1DUP LLJJ;

    public final void LIZLLL() {
        if (this.LLILZIL) {
            this.LLILZIL = false;
            if (this.LLILZLL) {
                C786410Ut5.v2().removeFrameCallback(this);
                this.LLILZLL = false;
            }
            this.LLIZ = 0L;
            this.LL.setRenderMode(EnumC1284920jXe.WHEN_DIRTY);
        }
    }

    public final void LJ() {
        C1396005dG c1396005dG = this.LLILZ;
        this.LLJIJIL = c1396005dG.LIZ;
        this.LLJILJIL = c1396005dG.LJ;
        this.LLJILJILJ = C13LZ.LIZLLL(c1396005dG.LIZJ, 0.0f, 1.0f);
    }

    public final void LIZJ(boolean z) {
        if (z) {
            this.LLIZ = 0L;
        }
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        if (z) {
            C786410Ut5.v2().postFrameCallback(this);
        } else {
            C786410Ut5.v2().postFrameCallbackDelayed(this, 32L);
        }
    }

    public final void LJFF(boolean z) {
        C1147340fxk c1147340fxk = this.LLILLL;
        if (c1147340fxk == null) {
            return;
        }
        this.LL.setRenderMode(EnumC1284920jXe.WHEN_DIRTY);
        if (!c1147340fxk.LJIIIIZZ) {
            this.LLIZLLLIL = 0.0f;
            this.LLJ = 0.0f;
            this.LLJI = 0.0f;
            LJ();
        }
        LIZJ(z);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        float fLIZLLL;
        C1143590frh c1143590frh;
        float f;
        boolean z;
        float f2;
        this.LLILZLL = false;
        C1147340fxk c1147340fxk = this.LLILLL;
        if (this.LLILZIL && c1147340fxk != null) {
            if (this.LLIZ > 0) {
                fLIZLLL = C13LZ.LIZLLL((j - r4) / 1.0E9f, 0.0f, 0.08f);
            } else {
                fLIZLLL = 0.033333335f;
            }
            this.LLIZ = j;
            if (c1147340fxk.LJIIIIZZ) {
                c1143590frh = this.LLILLJJLI.invoke();
            } else {
                c1143590frh = new C1143590frh(0.0f, 0.0f, 0.0f);
            }
            if (c1147340fxk.LJIIIIZZ) {
                f = 14.0f;
            } else {
                f = 18.0f;
            }
            float fLIZLLL2 = C13LZ.LIZLLL(1.0f - ((float) Math.exp((-f) * fLIZLLL)), 0.08f, 0.42f);
            float f3 = this.LLIZLLLIL;
            this.LLIZLLLIL = f3 + ((C13LZ.LIZLLL(c1143590frh.LIZ, 0.0f, 1.0f) - f3) * fLIZLLL2);
            float f4 = this.LLJ;
            this.LLJ = f4 + ((C13LZ.LIZLLL(c1143590frh.LIZIZ, 0.0f, 1.0f) - f4) * fLIZLLL2);
            float f5 = this.LLJI;
            this.LLJI = f5 + ((C13LZ.LIZLLL(c1143590frh.LIZJ, 0.0f, 1.0f) - f5) * fLIZLLL2);
            float fLIZLLL3 = C13LZ.LIZLLL(this.LLILZ.LIZJ, 0.0f, 1.0f);
            C1396005dG c1396005dG = this.LLILZ;
            boolean z2 = true;
            if ((c1396005dG.LJ == 0 && c1396005dG.LIZIZ <= 0.001f && fLIZLLL3 <= 0.001f) || (!Intrinsics.LJFF(this.LLJIJIL, c1396005dG.LIZ))) {
                LJ();
            } else {
                int i = this.LLJILJIL;
                int i2 = this.LLILZ.LJ;
                if (i != i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (fLIZLLL3 >= this.LLJILJILJ) {
                    z2 = false;
                }
                if (z) {
                    this.LLJILJIL = i2;
                }
                float fExp = 1.0f - ((float) Math.exp(fLIZLLL * (-22.0f)));
                if (!z && !z2) {
                    f2 = 0.46f;
                } else {
                    f2 = 0.18f;
                }
                float fLIZLLL4 = C13LZ.LIZLLL(fExp, 0.08f, f2);
                float f6 = this.LLJILJILJ;
                this.LLJILJILJ = f6 + ((fLIZLLL3 - f6) * fLIZLLL4);
            }
            this.LL.setUniforms(LIZ(c1147340fxk, this.LLJILJILJ, this.LLIZLLLIL, this.LLJ, this.LLJI));
            LIZJ(false);
        }
    }

    public C1DUN(TextureViewSurfaceTextureListenerC1284890jXb textureViewSurfaceTextureListenerC1284890jXb, C1147120fxO c1147120fxO) {
        this.LL = textureViewSurfaceTextureListenerC1284890jXb;
        this.LLILLJJLI = c1147120fxO;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0fxY, java.lang.Object] */
    public final C1287390jbd LIZ(C1147340fxk c1147340fxk, float f, float f2, float f3, float f4) {
        C1DUO c1duo;
        int iLIZ;
        int iLIZ2;
        int iLIZ3;
        int iLIZ4;
        float fFloatValue;
        float f5;
        float f6;
        float f7;
        float fLIZLLL;
        ?? r5 = new Object(c1147340fxk.LJIILL, c1147340fxk.LJIILLIIL, c1147340fxk.LJFF) { // from class: X.0fxY
            public final long LIZ;
            public final long LIZIZ;
            public final long LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1147220fxY)) {
                    return false;
                }
                C1147220fxY c1147220fxY = (C1147220fxY) obj;
                return this.LIZ == c1147220fxY.LIZ && this.LIZIZ == c1147220fxY.LIZIZ && this.LIZJ == c1147220fxY.LIZJ;
            }

            public final int hashCode() {
                return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShaderStyleKey(heroStartColor=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", heroEndColor=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", moodId=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = j;
                this.LIZIZ = j;
                this.LIZJ = j;
            }
        };
        C1DUP c1dup = this.LLJJ;
        if (!Intrinsics.LJFF(this.LLJILLL, r5) || c1dup == null) {
            long j = c1147340fxk.LJIILL;
            long j2 = c1147340fxk.LJIILLIIL;
            long j3 = c1147340fxk.LJFF;
            int i = (int) (j & 4294967295L);
            int i2 = (int) (j2 & 4294967295L);
            long jLongValue = 0;
            if (j3 > 0) {
                if (j3 == 1) {
                    c1duo = C2255681DQo.LIZIZ;
                } else if (j3 == 2) {
                    c1duo = C2255681DQo.LJ;
                } else if (j3 == 3) {
                    c1duo = C2255681DQo.LIZJ;
                } else if (j3 == 4) {
                    c1duo = C2255681DQo.LJFF;
                } else if (j3 == 5) {
                    c1duo = C2255681DQo.LIZLLL;
                } else if (j3 == 6) {
                    c1duo = C2255681DQo.LJI;
                } else {
                    c1duo = C2255681DQo.LIZ;
                }
            } else {
                c1duo = C2255681DQo.LIZ;
            }
            Integer num = c1duo.LIZ;
            if (num != null) {
                iLIZ = num.intValue();
            } else {
                iLIZ = C2255681DQo.LIZ(0.58f, i, -16777216);
            }
            Integer num2 = c1duo.LIZIZ;
            if (num2 != null) {
                iLIZ2 = num2.intValue();
            } else {
                iLIZ2 = C2255681DQo.LIZ(0.28f, i, i2);
            }
            Integer num3 = c1duo.LIZJ;
            if (num3 != null) {
                iLIZ3 = num3.intValue();
            } else {
                iLIZ3 = C2255681DQo.LIZ(0.28f, i, -1);
            }
            Integer num4 = c1duo.LIZLLL;
            if (num4 != null) {
                iLIZ4 = num4.intValue();
            } else {
                iLIZ4 = C2255681DQo.LIZ(0.58f, i, -1);
            }
            int iRgb = Color.rgb(C2255681DQo.LIZIZ(c1duo.LJIILJJIL), C2255681DQo.LIZIZ(c1duo.LJIILL / 2.0f), C2255681DQo.LIZIZ(c1duo.LJIILLIIL / 2.0f));
            Float f8 = c1duo.LJII;
            if (f8 != null) {
                fFloatValue = f8.floatValue();
            } else {
                Long lValueOf = Long.valueOf(j3);
                if (lValueOf.longValue() > 0) {
                    jLongValue = lValueOf.longValue();
                }
                fFloatValue = (((jLongValue % 12) + 12) % 12) * 0.17f;
            }
            c1dup = c1dup;
            C1DUP c1dup2 = new C1DUP(iLIZ, iLIZ2, iLIZ3, iLIZ4, iRgb, fFloatValue, c1duo.LJ, c1duo.LJFF, c1duo.LJI, c1duo.LJJ, c1duo.LJJI, c1duo.LJJIFFI, c1duo.LJJII, c1duo.LJJIII, c1duo.LJJIIJ, c1duo.LJJIIJZLJL, c1duo.LJJIIZ, c1duo.LJJIIZI, c1duo.LJJIJ, c1duo.LJJIJIIJI, c1duo.LJJIJIIJIL, c1duo.LJJIJIL, c1duo.LJJIJL, c1duo.LJJIJLIJ, c1duo.LJIIIIZZ, c1duo.LJIIIZ, c1duo.LJIIJ, c1duo.LJIIJJI, c1duo.LJIIL, c1duo.LJIILIIL, c1duo.LJIJI, c1duo.LJIJJ, c1duo.LJIJJLI, c1duo.LJIL, c1duo.LJIIZILJ, c1duo.LJIJ);
            this.LLJILLL = r5;
            this.LLJJ = c1dup2;
        }
        boolean z = c1147340fxk.LJIIIIZZ;
        float fLIZLLL2 = C13LZ.LIZLLL(f, 0.0f, 1.0f) * 0.1f;
        float fLIZLLL3 = C13LZ.LIZLLL(f2, 0.0f, 1.0f);
        float fLIZLLL4 = C13LZ.LIZLLL(f3, 0.0f, 1.0f);
        float fLIZLLL5 = C13LZ.LIZLLL(f4, 0.0f, 1.0f);
        float fResolve = c1dup.LJIIJ.resolve(fLIZLLL3, fLIZLLL4, fLIZLLL5);
        float fResolve2 = c1dup.LJIIL.resolve(fLIZLLL3, fLIZLLL4, fLIZLLL5);
        float fResolve3 = c1dup.LJIJ.resolve(fLIZLLL3, fLIZLLL4, fLIZLLL5);
        float fResolve4 = c1dup.LJIILJJIL.resolve(fLIZLLL3, fLIZLLL4, fLIZLLL5);
        float fResolve5 = c1dup.LJIILLIIL.resolve(fLIZLLL3, fLIZLLL4, fLIZLLL5);
        float fResolve6 = c1dup.LJIJJ.resolve(fLIZLLL3, fLIZLLL4, fLIZLLL5);
        float fResolve7 = c1dup.LJIL.resolve(fLIZLLL3, fLIZLLL4, fLIZLLL5);
        float fLJFF = C626640Ohy.LJFF(new float[]{c1dup.LJIILL * fResolve5, c1dup.LJIJJLI * fResolve7, c1dup.LJIILIIL * fResolve4 * 0.8f}, c1dup.LJIIZILJ * fResolve3);
        float f9 = c1dup.LJJIIJZLJL;
        float f10 = fLJFF * f9;
        float f11 = (fResolve * c1dup.LJIIIZ * f9) + (fResolve4 * c1dup.LJIILIIL * f9);
        float f12 = fResolve5 * c1dup.LJIILL * f9;
        float f13 = f11 + f12 + (0.32f * f10);
        if (c1dup.LJII && z) {
            float f14 = fResolve3 * c1dup.LJJ;
            if (f14 > 1.5f) {
                f14 = 1.5f;
            }
            f5 = 0.25f * f14;
        } else {
            f5 = 0.0f;
        }
        float f15 = f5 + 1.0f;
        float f16 = c1dup.LJJIIZI * f15;
        float f18 = c1dup.LJJIJ * ((fResolve2 * c1dup.LJIIJJI * 0.8f) + 1.0f);
        if (z) {
            f6 = (fResolve7 * c1dup.LJIJJLI * f9) + (f10 * 0.28f);
            if (f6 > 1.5f) {
                f6 = 1.5f;
            }
        } else {
            f6 = 0.0f;
        }
        float f19 = c1dup.LJI * f15;
        float f20 = c1dup.LJFF;
        if (z) {
            f7 = c1dup.LJJIII + (f12 * 0.14f);
        } else {
            f7 = c1dup.LJJIII;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(Float.valueOf(c1dup.LJJI), Float.valueOf(C13LZ.LIZLLL(c1dup.LJJIFFI, -1.0f, 1.0f) + (C13LZ.LJ(C814420VxA.LIZIZ(c1dup.LJIIIIZZ), 0, 2) * 4.0f) + (C814420VxA.LIZIZ(C13LZ.LIZLLL(f16, 0.1f, 9.9f) * 10.0f) * 16.0f)));
        List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(c1dup.LJJII * ((f6 * 0.35f) + 1.0f)), Float.valueOf(C814420VxA.LIZIZ(C13LZ.LIZLLL(c1dup.LJJIJIIJI, 0.0f, 0.99f) * 100.0f) + (C814420VxA.LIZIZ(C13LZ.LIZLLL(c1dup.LJJIJIIJIL, 0.0f, 0.99f) * 100.0f) * 100.0f) + (C814420VxA.LIZIZ(C13LZ.LIZLLL(c1dup.LJJIJIL, 0.0f, 0.99f) * 100.0f) * 10000.0f)));
        int i3 = c1dup.LIZ;
        int i4 = c1dup.LIZIZ;
        int i5 = c1dup.LIZJ;
        int i6 = c1dup.LIZLLL;
        int i7 = c1dup.LJ;
        float fLIZIZ = C814420VxA.LIZIZ(C13LZ.LIZLLL(c1dup.LJJIIJ + (fResolve6 * c1dup.LJIJI * 0.01f), 0.0f, 0.99f) * 100.0f) + (C13LZ.LJ(C814420VxA.LIZIZ(f18), 0, 99) * 100.0f) + (C814420VxA.LIZIZ(C13LZ.LIZLLL(c1dup.LJJIIZ, 0.0f, 9.99f) * 100.0f) * 10000.0f);
        if (z) {
            fLIZLLL = C13LZ.LIZLLL(c1dup.LJJIII + (f13 * 0.42f) + fLIZLLL2, 0.0f, 2.0f);
        } else {
            fLIZLLL = c1dup.LJJIII;
        }
        return new C1287390jbd(f19, f20, f7, (List<Float>) listLJIIJJI, (List<Float>) listLJIIJJI2, i3, i4, i5, i6, i7, fLIZIZ, fLIZLLL);
    }
}
