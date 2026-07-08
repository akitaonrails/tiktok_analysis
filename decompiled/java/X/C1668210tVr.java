package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.c;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AFwS347S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668210tVr extends AbstractC20085213iM {
    public final C05P0 LLJ;
    public final long LLJI;
    public final long LLJIJIL;
    public long LLJILJIL;
    public float LLJILJILJ;
    public final C05P0 LLJILLL;

    private final boolean getShowStaticImage() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    public final C0CFG getGearType() {
        return (C0CFG) this.LLJ.getValue();
    }

    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m61getBackgroundColor0d7_KjU() {
        return this.LLJILJIL;
    }

    /* JADX INFO: renamed from: setBackgroundColor-8_81llA, reason: not valid java name */
    public final void m62setBackgroundColor8_81llA(long j) {
        this.LLJILJIL = j;
    }

    public final void setGear(C0CFG c0cfg) {
        float f;
        if (getGearType() != c0cfg) {
            setShowStaticImage(true);
            setGearType(c0cfg);
            if (getGearType() == C0CFG.HIGH) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.LLJILJILJ = f;
        }
    }

    public final void setGearType(C0CFG c0cfg) {
        ((C13FE) this.LLJ).setValue(c0cfg);
    }

    public final void setShowStaticImage(boolean z) {
        ((C13FE) this.LLJILLL).setValue(Boolean.valueOf(z));
    }

    public C1668210tVr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJ = C20028913Yh.LJI(C0CFG.LOW);
        this.LLJI = C1685850tyJ.LIZJ(224, 206, 248, 122);
        this.LLJIJIL = C1685850tyJ.LIZJ(221, 245, 253, 36);
        this.LLJILJIL = C1685850tyJ.LIZLLL(4281348405L);
        this.LLJILLL = C20028913Yh.LJI(Boolean.TRUE);
    }

    @Override // X.AbstractC20085213iM
    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        float f;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1190372504);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C05P1 c05p1LIZIZ = C1675660ths.LIZIZ(this.LLJILJILJ, new C1677070tk9(0), 0.0f, null, null, c13zcLJIIJ, 0, 28);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f2 = 6;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1667200tUE.LIZ(C1679640toI.LIZIZ(c.LIZIZ(c.LJ(c1685760tyA, 1.0f), 1.0f), 4, null, C1685850tyJ.LIZIZ(1291845632), C1685850tyJ.LIZIZ(1291845632), 6), C1669050tXD.LIZIZ(f2)), this.LLJILJIL, C1669430tXp.LIZ);
            C0CFG gearType = getGearType();
            C0CFG c0cfg = C0CFG.HIGH;
            if (gearType == c0cfg) {
                interfaceC1685750ty9LIZIZ = C1675890tiF.LIZIZ(1, interfaceC1685750ty9LIZIZ, C1668200tVq.LJII(C1697810uHb.LJIIJJI(new C1685910tyP(C1685910tyP.LIZJ(((Number) c05p1LIZIZ.getValue()).floatValue() * C1685910tyP.LJFF(this.LLJI), this.LLJI)), new C1685910tyP(C1685910tyP.LIZJ(((Number) c05p1LIZIZ.getValue()).floatValue() * C1685910tyP.LJFF(this.LLJIJIL), this.LLJIJIL))), 0.0f, Float.POSITIVE_INFINITY, 8), C1669050tXD.LIZIZ(f2));
            }
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                c13zcLJIIJ.LJJIIJZLJL(1111209674);
                if (getShowStaticImage()) {
                    if (getGearType() == c0cfg) {
                        i3 = R.drawable.bu9;
                    } else {
                        i3 = R.drawable.clc;
                    }
                    AbstractC1676270tir abstractC1676270tirLIZ = C1A46.LIZ(i3, c13zcLJIIJ, 0);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c1672220tcK.LIZIZ(C1685720ty6.LIZIZ(c1685760tyA, AFwS347S0000000_25.get$arr$(16)), C1668040tVa.LIZLLL);
                    float f3 = 30;
                    if (getGearType() == c0cfg) {
                        f = 40;
                    } else {
                        f = f3;
                    }
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIILJJIL = c.LJIILJJIL(interfaceC1685750ty9LIZIZ2, f, f3);
                    InterfaceC1671600tbK.LIZ.getClass();
                    C1668230tVt.LIZ(abstractC1676270tirLIZ, "icon", interfaceC1685750ty9LJIILJJIL, null, C1671610tbL.LIZJ, 0.0f, null, c13zcLJIIJ, 24624, 104);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(1111228722);
                getGearType();
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 6);
        }
    }
}
