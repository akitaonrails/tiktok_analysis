package X;

import Y.AObjectS35S0100100_25;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670480tZW {
    public static final void LIZ(final InterfaceC1670590tZh interfaceC1670590tZh, final String str, InterfaceC1685750ty9 interfaceC1685750ty9, C1670520tZa c1670520tZa, Function0<Unit> function0, boolean z, C05AR c05ar, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        final C05AR c05ar2;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ;
        boolean z2;
        boolean zLJII2;
        boolean z3 = z;
        Function0<Unit> function02 = function0;
        C1670520tZa c1670520tZa2 = c1670520tZa;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1632955604);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1670590tZh);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1670590tZh);
            }
            if (zLJII) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1670520tZa2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i14 = i2 & 64;
        int i15 = 1572864;
        if (i14 == 0) {
            if ((1572864 & i) == 0) {
                if ((i & 2097152) == 0) {
                    zLJII2 = c13zcLJIIJ.LJJIIJ(c05ar);
                } else {
                    zLJII2 = c13zcLJIIJ.LJII(c05ar);
                }
                if (zLJII2) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i3 |= i15;
            }
        } else {
            i3 |= i15;
        }
        if ((i3 & 599187) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c05ar2 = c05ar;
        } else {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                c1670520tZa2 = C1670520tZa.LIZIZ;
            }
            c05ar2 = null;
            if (i12 != 0) {
                function02 = null;
            }
            if (i13 != 0) {
                z3 = true;
            }
            if (i14 == 0) {
                c05ar2 = c05ar;
            }
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.TRUE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final C05P0 c05p0 = (C05P0) objLJJ;
            boolean z4 = false;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1607258475);
            if (function02 != null) {
                interfaceC1685750ty9LIZ = C634380OuS.LIZ(interfaceC1685750ty92, null, C1673460teK.LIZIZ(c1670520tZa2.LIZ / 2.0f, c13zcLJIIJ, 0), true, null, new C20279814Wu(5), function02);
            } else {
                interfaceC1685750ty9LIZ = interfaceC1685750ty92;
            }
            c13zcLJIIJ.LJJJJL(false);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ2;
            long jT2 = C1670400tZO.LIZIZ(c13zcLJIIJ).T2();
            float fLJJJJLL = interfaceC1690500u5o.LJJJJLL(c1670520tZa2.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(-1607236143);
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(interfaceC1685750ty9LIZ, c1670520tZa2.LIZ), c1670520tZa2.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(-1607235475);
            if (z3 && !((Boolean) c05p0.getValue()).booleanValue()) {
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zLJIJJ = z2 | c13zcLJIIJ.LJIJJ(jT2);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (zLJIJJ || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new AObjectS35S0100100_25(jT2, c1670520tZa2, 1);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                z4 = false;
                c13zcLJIIJ.LJJJJL(false);
                interfaceC1685750ty9LJI = C1680910tqL.LIZJ(interfaceC1685750ty9LJI, (Function1) objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(z4);
            c13zcLJIIJ.LJJJJL(z4);
            long jU2 = C1670400tZO.LIZIZ(c13zcLJIIJ).U2();
            c13zcLJIIJ.LJJIIJZLJL(-1908451940);
            C1670500tZY c1670500tZY = new C1670500tZY(jU2);
            c13zcLJIIJ.LJJJJL(z4);
            C1668880tWw c1668880tWw = C1670400tZO.LIZLLL(c13zcLJIIJ).LJIJ;
            long j = C1685910tyP.LJIIJ;
            c13zcLJIIJ.LJJIIJZLJL(-1263391303);
            C1670490tZX c1670490tZX = new C1670490tZX(c1668880tWw, j);
            c13zcLJIIJ.LJJJJL(false);
            boolean z5 = true;
            C1670570tZf c1670570tZf = new C1670570tZf((((long) Float.floatToRawIntBits(fLJJJJLL)) << 32) | (((long) Float.floatToRawIntBits(fLJJJJLL)) & 4294967295L), true);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if ((3670016 & i3) != 1048576 && ((i3 & 2097152) == 0 || !c13zcLJIIJ.LJJIIJ(c05ar2))) {
                z5 = false;
            }
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (z5 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new C05AR() { // from class: X.05AQ
                    @Override // X.C05AR
                    public final void onCanceled() {
                        C05AR c05ar3 = c05ar2;
                        if (c05ar3 != null) {
                            c05ar3.onCanceled();
                        }
                        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05AP(c05p0, null), 3);
                    }

                    @Override // X.C05AR
                    public final void LIZ(C1696790uFx c1696790uFx) {
                        C05AR c05ar3 = c05ar2;
                        if (c05ar3 != null) {
                            c05ar3.LIZ(c1696790uFx);
                        }
                        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05AM(c05p0, null), 3);
                    }

                    @Override // X.C05AR
                    public final void onFailed(Throwable th) {
                        C05AR c05ar3 = c05ar2;
                        if (c05ar3 != null) {
                            c05ar3.onFailed(th);
                        }
                        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05AN(c05p0, null), 3);
                    }

                    @Override // X.C05AR
                    public final void onProgress(float f) {
                        c05p0.setValue(Boolean.TRUE);
                        C05AR c05ar3 = c05ar2;
                        if (c05ar3 != null) {
                            c05ar3.onProgress(f);
                        }
                        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05AO(c05p0, null), 3);
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1670600tZi.LIZ(interfaceC1670590tZh, str, interfaceC1685750ty9LJI, null, null, c1670500tZY, c1670490tZX, null, c1670570tZf, (C05AQ) objLJJ4, c13zcLJIIJ, (i3 & 14) | (i3 & 112), 152);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final C1670520tZa c1670520tZa3 = c1670520tZa2;
            final Function0<Unit> function03 = function02;
            final boolean z6 = z3;
            final C05AR c05ar3 = c05ar2;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tZZ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1670590tZh interfaceC1670590tZh2 = interfaceC1670590tZh;
                    String str2 = str;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    C1670520tZa c1670520tZa4 = c1670520tZa3;
                    Function0 function04 = function03;
                    boolean z7 = z6;
                    C05AR c05ar4 = c05ar3;
                    int i16 = i;
                    int i17 = i2;
                    ((Integer) obj2).intValue();
                    C1670480tZW.LIZ(interfaceC1670590tZh2, str2, interfaceC1685750ty94, c1670520tZa4, function04, z7, c05ar4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i16 | 1), i17);
                    return Unit.LIZ;
                }
            };
        }
    }
}
