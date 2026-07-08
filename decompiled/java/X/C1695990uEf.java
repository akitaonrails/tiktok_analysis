package X;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695990uEf implements InterfaceC20054313dN {
    public C1695970uEd LL;
    public final InterfaceC1681130tqh LLILLJJLI;
    public final AndroidComposeView LLILLL;
    public Function2<? super InterfaceC1686290tz1, ? super C1695970uEd, Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public float[] LLJ;
    public boolean LLJI;
    public int LLJILLL;
    public AbstractC1680810tqB LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIL;
    public final float[] LLIZLLLIL = C1696000uEg.LIZ();
    public InterfaceC1690500u5o LLJIJIL = C1689930u4t.LIZ(1.0f);
    public EnumC1671200tag LLJILJIL = EnumC1671200tag.Ltr;
    public final C1695140uDI LLJILJILJ = new C1695140uDI();
    public long LLJJ = C1676680tjW.LIZIZ;
    public boolean LLJJIJIIJIL = true;
    public final AwS604S0100000_25 LLJJJ = new AwS604S0100000_25(this, 17);

    @Override // X.InterfaceC20054313dN
    public final void destroy() {
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLIZ = true;
        if (this.LLJI) {
            this.LLJI = false;
            this.LLILLL.LJJJIL(this, false);
        }
        InterfaceC1681130tqh interfaceC1681130tqh = this.LLILLJJLI;
        if (interfaceC1681130tqh != null) {
            interfaceC1681130tqh.LIZ(this.LL);
            this.LLILLL.LJJJJJL(this);
        }
    }

    @Override // X.InterfaceC20054313dN
    public final void LJIIIIZZ() {
        if (this.LLJI) {
            if (!C1676680tjW.LIZ(this.LLJJ, C1676680tjW.LIZIZ) && !C1682900ttY.LIZIZ(this.LL.LJIJJ, this.LLILZLL)) {
                C1695970uEd c1695970uEd = this.LL;
                float fLIZIZ = C1676680tjW.LIZIZ(this.LLJJ) * ((int) (this.LLILZLL >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C1676680tjW.LIZJ(this.LLJJ) * ((int) (this.LLILZLL & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fLIZIZ) << 32);
                if (!C1378605aS.LIZJ(c1695970uEd.LJIJJLI, jFloatToRawIntBits)) {
                    c1695970uEd.LJIJJLI = jFloatToRawIntBits;
                    c1695970uEd.LIZ.LJJIJIL(jFloatToRawIntBits);
                }
            }
            this.LL.LJ(this.LLJIJIL, this.LLJILJIL, this.LLILZLL, this.LLJJJ);
            if (this.LLJI) {
                this.LLJI = false;
                this.LLILLL.LJJJIL(this, false);
            }
        }
    }

    public final float[] LJIIJJI() {
        float[] fArrLIZ = this.LLJ;
        if (fArrLIZ == null) {
            fArrLIZ = C1696000uEg.LIZ();
            this.LLJ = fArrLIZ;
        }
        if (!this.LLJJIJI) {
            if (Float.isNaN(fArrLIZ[0])) {
                return null;
            }
            return fArrLIZ;
        }
        this.LLJJIJI = false;
        float[] fArrLJIIL = LJIIL();
        if (this.LLJJIJIIJIL) {
            return fArrLJIIL;
        }
        if (C1696030uEj.LIZ(fArrLJIIL, fArrLIZ)) {
            return fArrLIZ;
        }
        fArrLIZ[0] = Float.NaN;
        return null;
    }

    public final float[] LJIIL() {
        if (this.LLJJIII) {
            C1695970uEd c1695970uEd = this.LL;
            long jLIZIZ = c1695970uEd.LJIJJLI;
            if ((9223372034707292159L & jLIZIZ) == 9205357640488583168L) {
                jLIZIZ = C1671580tbI.LIZIZ(C1296570jqR.LIZIZ(this.LLILZLL));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jLIZIZ >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLIZIZ & 4294967295L));
            float[] fArr = this.LLIZLLLIL;
            float fLJJ = c1695970uEd.LIZ.LJJ();
            float fLJIL = c1695970uEd.LIZ.LJIL();
            float fLJJIII = c1695970uEd.LIZ.LJJIII();
            float fLJJIFFI = c1695970uEd.LIZ.LJJIFFI();
            float fLJJII = c1695970uEd.LIZ.LJJII();
            float fLJJIJIIJIL = c1695970uEd.LIZ.LJJIJIIJIL();
            float fLJJIJL = c1695970uEd.LIZ.LJJIJL();
            double d = ((double) fLJJIII) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fLJIL * fCos) - (fSin * 1.0f);
            float f3 = (fLJIL * fSin) + (fCos * 1.0f);
            double d2 = ((double) fLJJIFFI) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (fLJJ * fCos2) + (f3 * fSin2);
            float f10 = ((-fLJJ) * fSin2) + (f3 * fCos2);
            double d3 = ((double) fLJJII) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (f11 * fCos2) + (fCos3 * f5);
            float f13 = fSin3 * fCos;
            float f14 = fCos * fCos3;
            float f15 = (f11 * f4) + (fCos3 * f6);
            float f16 = ((fCos2 * fCos3) + (f5 * fSin3)) * fLJJIJIIJIL;
            float f18 = f13 * fLJJIJIIJIL;
            float f19 = ((fCos3 * f4) + (fSin3 * f6)) * fLJJIJIIJIL;
            float f20 = f12 * fLJJIJL;
            float f21 = f14 * fLJJIJL;
            float f22 = f15 * fLJJIJL;
            float f23 = f7 * 1.0f;
            float f24 = f * 1.0f;
            float f25 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f16;
                fArr[1] = f18;
                fArr[2] = f19;
                fArr[3] = 0.0f;
                fArr[4] = f20;
                fArr[5] = f21;
                fArr[6] = f22;
                fArr[7] = 0.0f;
                fArr[8] = f23;
                fArr[9] = f24;
                fArr[10] = f25;
                fArr[11] = 0.0f;
                float f26 = -fIntBitsToFloat;
                fArr[12] = ((f16 * f26) - (fIntBitsToFloat2 * f20)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f18 * f26) - (fIntBitsToFloat2 * f21)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f26 * f19) - (fIntBitsToFloat2 * f22)) + f10;
                fArr[15] = 1.0f;
            }
            this.LLJJIII = false;
            this.LLJJIJIIJIL = C1696040uEk.LIZ(this.LLIZLLLIL);
        }
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC20054313dN
    public final void invalidate() {
        if (this.LLJI || this.LLIZ) {
            return;
        }
        this.LLILLL.invalidate();
        if (true != this.LLJI) {
            this.LLJI = true;
            this.LLILLL.LJJJIL(this, true);
        }
    }

    @Override // X.InterfaceC20054313dN
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public final float[] mo67getUnderlyingMatrixsQKQjiQ() {
        return LJIIL();
    }

    @Override // X.InterfaceC20054313dN
    public final void LIZ(long j) {
        C1695970uEd c1695970uEd = this.LL;
        if (!C1676820tjk.LIZIZ(c1695970uEd.LJIJI, j)) {
            c1695970uEd.LJIJI = j;
            c1695970uEd.LIZ.LJJIZ((int) (j >> 32), C1676820tjk.LIZJ(j), c1695970uEd.LJIJJ);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            View view = this.LLILLL;
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(view, view);
                return;
            }
            return;
        }
        this.LLILLL.invalidate();
    }

    @Override // X.InterfaceC20054313dN
    public final void LIZJ(long j) {
        if (!C1682900ttY.LIZIZ(j, this.LLILZLL)) {
            this.LLILZLL = j;
            if (!this.LLJI && !this.LLIZ) {
                this.LLILLL.invalidate();
                if (true != this.LLJI) {
                    this.LLJI = true;
                    this.LLILLL.LJJJIL(this, true);
                }
            }
        }
    }

    @Override // X.InterfaceC20054313dN
    public final void LJ(float[] fArr) {
        C1696000uEg.LJFF(fArr, LJIIL());
    }

    @Override // X.InterfaceC20054313dN
    public final boolean LJI(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C1695970uEd c1695970uEd = this.LL;
        if (c1695970uEd.LJIL) {
            return C1680720tq2.LIZ(c1695970uEd.LIZLLL(), fIntBitsToFloat, fIntBitsToFloat2, null, null);
        }
        return true;
    }

    @Override // X.InterfaceC20054313dN
    public final void LJII(float[] fArr) {
        float[] fArrLJIIJJI = LJIIJJI();
        if (fArrLJIIJJI != null) {
            C1696000uEg.LJFF(fArr, fArrLJIIJJI);
        }
    }

    @Override // X.InterfaceC20054313dN
    public final void LJIIIZ(C1696110uEr c1696110uEr) {
        boolean z;
        Function0<Unit> function0;
        int i;
        Function0<Unit> function02;
        int i2 = c1696110uEr.LL | this.LLJILLL;
        this.LLJILJIL = c1696110uEr.LLJJIJIL;
        this.LLJIJIL = c1696110uEr.LLJJIJIIJIL;
        int i3 = i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (i3 != 0) {
            this.LLJJ = c1696110uEr.LLJILLL;
        }
        if ((i2 & 1) != 0) {
            C1695970uEd c1695970uEd = this.LL;
            float f = c1696110uEr.LLILLJJLI;
            if (c1695970uEd.LIZ.LJJIJIIJIL() != f) {
                c1695970uEd.LIZ.LJIIJ(f);
            }
        }
        if ((i2 & 2) != 0) {
            C1695970uEd c1695970uEd2 = this.LL;
            float f2 = c1696110uEr.LLILLL;
            if (c1695970uEd2.LIZ.LJJIJL() != f2) {
                c1695970uEd2.LIZ.LJIIJJI(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.LL.LJI(c1696110uEr.LLILZ);
        }
        if ((i2 & 8) != 0) {
            C1695970uEd c1695970uEd3 = this.LL;
            float f3 = c1696110uEr.LLILZIL;
            if (c1695970uEd3.LIZ.LJJ() != f3) {
                c1695970uEd3.LIZ.LJII(f3);
            }
        }
        if ((i2 & 16) != 0) {
            C1695970uEd c1695970uEd4 = this.LL;
            float f4 = c1696110uEr.LLILZLL;
            if (c1695970uEd4.LIZ.LJIL() != f4) {
                c1695970uEd4.LIZ.LJI(f4);
            }
        }
        if ((i2 & 32) != 0) {
            C1695970uEd c1695970uEd5 = this.LL;
            float f5 = c1696110uEr.LLIZ;
            if (c1695970uEd5.LIZ.LJJI() != f5) {
                c1695970uEd5.LIZ.LJIILJJIL(f5);
                c1695970uEd5.LJI = true;
                c1695970uEd5.LIZ();
            }
            if (c1696110uEr.LLIZ > 0.0f && !this.LLJJIJIL && (function02 = this.LLILZIL) != null) {
                function02.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            C1695970uEd c1695970uEd6 = this.LL;
            long j = c1696110uEr.LLIZLLLIL;
            if (!C1685910tyP.LJ(j, c1695970uEd6.LIZ.LJJIIZ())) {
                c1695970uEd6.LIZ.LJIILLIIL(j);
            }
        }
        if ((i2 & 128) != 0) {
            C1695970uEd c1695970uEd7 = this.LL;
            long j2 = c1696110uEr.LLJ;
            if (!C1685910tyP.LJ(j2, c1695970uEd7.LIZ.LJJIJLIJ())) {
                c1695970uEd7.LIZ.LJIIZILJ(j2);
            }
        }
        if ((i2 & 1024) != 0) {
            C1695970uEd c1695970uEd8 = this.LL;
            float f6 = c1696110uEr.LLJILJIL;
            if (c1695970uEd8.LIZ.LJJII() != f6) {
                c1695970uEd8.LIZ.LJFF(f6);
            }
        }
        if ((i2 & 256) != 0) {
            C1695970uEd c1695970uEd9 = this.LL;
            float f7 = c1696110uEr.LLJI;
            if (c1695970uEd9.LIZ.LJJIII() != f7) {
                c1695970uEd9.LIZ.LIZJ(f7);
            }
        }
        if ((i2 & 512) != 0) {
            C1695970uEd c1695970uEd10 = this.LL;
            float f8 = c1696110uEr.LLJIJIL;
            if (c1695970uEd10.LIZ.LJJIFFI() != f8) {
                c1695970uEd10.LIZ.LJ(f8);
            }
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            C1695970uEd c1695970uEd11 = this.LL;
            float f9 = c1696110uEr.LLJILJILJ;
            if (c1695970uEd11.LIZ.LJJIIJ() != f9) {
                c1695970uEd11.LIZ.LJIIIZ(f9);
            }
        }
        if (i3 != 0) {
            if (C1676680tjW.LIZ(this.LLJJ, C1676680tjW.LIZIZ)) {
                C1695970uEd c1695970uEd12 = this.LL;
                if (!C1378605aS.LIZJ(c1695970uEd12.LJIJJLI, 9205357640488583168L)) {
                    c1695970uEd12.LJIJJLI = 9205357640488583168L;
                    c1695970uEd12.LIZ.LJJIJIL(9205357640488583168L);
                }
            } else {
                C1695970uEd c1695970uEd13 = this.LL;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C1676680tjW.LIZJ(this.LLJJ) * ((int) (this.LLILZLL & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(C1676680tjW.LIZIZ(this.LLJJ) * ((int) (this.LLILZLL >> 32)))) << 32);
                if (!C1378605aS.LIZJ(c1695970uEd13.LJIJJLI, jFloatToRawIntBits)) {
                    c1695970uEd13.LJIJJLI = jFloatToRawIntBits;
                    c1695970uEd13.LIZ.LJJIJIL(jFloatToRawIntBits);
                }
            }
        }
        if ((i2 & 16384) != 0) {
            C1695970uEd c1695970uEd14 = this.LL;
            boolean z2 = c1696110uEr.LLJJI;
            if (c1695970uEd14.LJIL != z2) {
                c1695970uEd14.LJIL = z2;
                c1695970uEd14.LJI = true;
                c1695970uEd14.LIZ();
            }
        }
        if ((131072 & i2) != 0) {
            C1695970uEd c1695970uEd15 = this.LL;
            AbstractC1683790tuz abstractC1683790tuz = c1696110uEr.LLJJJ;
            if (!Intrinsics.LJFF(c1695970uEd15.LIZ.LJIJI(), abstractC1683790tuz)) {
                c1695970uEd15.LIZ.LJIIIIZZ(abstractC1683790tuz);
            }
        }
        if ((32768 & i2) != 0) {
            C1695970uEd c1695970uEd16 = this.LL;
            int i4 = c1696110uEr.LLJJIII;
            if (i4 == 0) {
                i = 0;
            } else if (i4 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i4 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            if (c1695970uEd16.LIZ.LJJIIJZLJL() != i) {
                c1695970uEd16.LIZ.LJJIJ(i);
            }
        }
        if ((i2 & 7963) != 0) {
            this.LLJJIII = true;
            this.LLJJIJI = true;
        }
        if (!Intrinsics.LJFF(this.LLJJI, c1696110uEr.LLJJJIL)) {
            AbstractC1680810tqB abstractC1680810tqB = c1696110uEr.LLJJJIL;
            this.LLJJI = abstractC1680810tqB;
            if (abstractC1680810tqB != null) {
                C1695970uEd c1695970uEd17 = this.LL;
                if (abstractC1680810tqB instanceof C1680780tq8) {
                    C1680780tq8 c1680780tq8 = (C1680780tq8) abstractC1680810tqB;
                    C1683130ttv c1683130ttv = c1680780tq8.LIZ;
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(c1683130ttv.LIZ)) << 32) | (((long) Float.floatToRawIntBits(c1683130ttv.LIZIZ)) & 4294967295L);
                    C1683130ttv c1683130ttv2 = c1680780tq8.LIZ;
                    c1695970uEd17.LJII(0.0f, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(c1683130ttv2.LIZJ - c1683130ttv2.LIZ)) << 32) | (((long) Float.floatToRawIntBits(c1683130ttv2.LIZLLL - c1683130ttv2.LIZIZ)) & 4294967295L));
                } else if (abstractC1680810tqB instanceof C1680800tqA) {
                    InterfaceC1680960tqQ interfaceC1680960tqQ = ((C1680800tqA) abstractC1680810tqB).LIZ;
                    c1695970uEd17.LJFF();
                    c1695970uEd17.LJIIJJI = interfaceC1680960tqQ;
                    c1695970uEd17.LIZ();
                } else if (abstractC1680810tqB instanceof C1680730tq3) {
                    C1680730tq3 c1680730tq3 = (C1680730tq3) abstractC1680810tqB;
                    C1695950uEb c1695950uEb = c1680730tq3.LIZIZ;
                    if (c1695950uEb != null) {
                        c1695970uEd17.LJFF();
                        c1695970uEd17.LJIIJJI = c1695950uEb;
                        c1695970uEd17.LIZ();
                    } else {
                        C1680760tq6 c1680760tq6 = c1680730tq3.LIZ;
                        c1695970uEd17.LJII(Float.intBitsToFloat((int) (c1680760tq6.LJII >> 32)), (((long) Float.floatToRawIntBits(c1680760tq6.LIZIZ)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1680760tq6.LIZ)) << 32), (((long) Float.floatToRawIntBits(c1680760tq6.LIZJ - c1680760tq6.LIZ)) << 32) | (((long) Float.floatToRawIntBits(c1680760tq6.LIZLLL - c1680760tq6.LIZIZ)) & 4294967295L));
                    }
                }
                if ((abstractC1680810tqB instanceof C1680800tqA) && Build.VERSION.SDK_INT < 33 && (function0 = this.LLILZIL) != null) {
                    function0.invoke();
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.LLJILLL = c1696110uEr.LL;
        if (i2 != 0 || z) {
            if (Build.VERSION.SDK_INT >= 26) {
                View view = this.LLILLL;
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(view, view);
                    return;
                }
                return;
            }
            this.LLILLL.invalidate();
        }
    }

    @Override // X.InterfaceC20054313dN
    public final void LIZIZ(AwS574S0100000_30 awS574S0100000_30, Function2 function2) {
        InterfaceC1681130tqh interfaceC1681130tqh = this.LLILLJJLI;
        if (interfaceC1681130tqh != null) {
            if (!this.LL.LJIJ) {
                C1696250uF5.LIZ("layer should have been released before reuse");
            }
            this.LL = interfaceC1681130tqh.LIZIZ();
            this.LLIZ = false;
            this.LLILZ = function2;
            this.LLILZIL = awS574S0100000_30;
            this.LLJJIII = false;
            this.LLJJIJI = false;
            this.LLJJIJIIJIL = true;
            C1696000uEg.LIZLLL(this.LLIZLLLIL);
            float[] fArr = this.LLJ;
            if (fArr != null) {
                C1696000uEg.LIZLLL(fArr);
            }
            this.LLJJ = C1676680tjW.LIZIZ;
            this.LLJJIJIL = false;
            long j = Integer.MAX_VALUE;
            this.LLILZLL = (j & 4294967295L) | (j << 32);
            this.LLJJI = null;
            this.LLJILLL = 0;
            return;
        }
        C1696250uF5.LIZJ("currently reuse is only supported when we manage the layer lifecycle");
        throw new C2197108jB();
    }

    @Override // X.InterfaceC20054313dN
    public final void LIZLLL(InterfaceC1686290tz1 interfaceC1686290tz1, C1695970uEd c1695970uEd) {
        boolean z;
        LJIIIIZZ();
        if (this.LL.LIZ.LJJI() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJIL = z;
        C1695230uDR c1695230uDR = this.LLJILJILJ.LLILLJJLI;
        c1695230uDR.LJFF(interfaceC1686290tz1);
        c1695230uDR.LIZIZ = c1695970uEd;
        C1695960uEc.LIZ(this.LLJILJILJ, this.LL);
    }

    @Override // X.InterfaceC20054313dN
    public final long LJFF(long j, boolean z) {
        float[] fArrLJIIL;
        if (z) {
            fArrLJIIL = LJIIJJI();
            if (fArrLJIIL == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrLJIIL = LJIIL();
        }
        if (!this.LLJJIJIIJIL) {
            return C1696000uEg.LIZIZ(j, fArrLJIIL);
        }
        return j;
    }

    @Override // X.InterfaceC20054313dN
    public final void LJIIJ(C1696010uEh c1696010uEh, boolean z) {
        float[] fArrLJIIL;
        if (z) {
            fArrLJIIL = LJIIJJI();
        } else {
            fArrLJIIL = LJIIL();
        }
        if (!this.LLJJIJIIJIL) {
            if (fArrLJIIL == null) {
                c1696010uEh.LIZ = 0.0f;
                c1696010uEh.LIZIZ = 0.0f;
                c1696010uEh.LIZJ = 0.0f;
                c1696010uEh.LIZLLL = 0.0f;
                return;
            }
            C1696000uEg.LIZJ(fArrLJIIL, c1696010uEh);
        }
    }

    public C1695990uEf(C1695970uEd c1695970uEd, InterfaceC1681130tqh interfaceC1681130tqh, AndroidComposeView androidComposeView, Function2 function2, AwS574S0100000_30 awS574S0100000_30) {
        this.LL = c1695970uEd;
        this.LLILLJJLI = interfaceC1681130tqh;
        this.LLILLL = androidComposeView;
        this.LLILZ = function2;
        this.LLILZIL = awS574S0100000_30;
        long j = Integer.MAX_VALUE;
        this.LLILZLL = (j & 4294967295L) | (j << 32);
    }
}
