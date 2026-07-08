package X;

import android.content.Context;
import android.os.PowerManager;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S0602000_25;
import kotlin.jvm.internal.AwS125S1000000_19;
import kotlin.jvm.internal.AwS176S0101000_9;
import kotlin.jvm.internal.AwS176S0400000_25;
import kotlin.jvm.internal.AwS179S0101000_19;
import kotlin.jvm.internal.AwS19S1001000_25;
import kotlin.jvm.internal.AwS2S0412000_25;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS48S0102000_19;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS64S0310000_25;
import kotlin.jvm.internal.AwS71S0500000_9;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0u3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689210u3j {
    public static final void LIZJ(InterfaceC1686920u02 interfaceC1686920u02, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1432105735);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1686920u02)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(interfaceC1686920u02.LIZ(c1685760tyA, 1.0f, true), 1.0f);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
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
                C1668690tWd.LIZIZ(0.0f, 6, 6, c13zcLJIIJ, c.LJIILIIL(c1685760tyA, 36), false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS179S0101000_19(interfaceC1686920u02, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(kotlin.jvm.functions.Function0<kotlin.Unit> r7, X.InterfaceC1680500tpg r8, int r9) {
        /*
            r0 = 1205467352(0x47d9f8d8, float:111601.69)
            X.13ZC r5 = r8.LJIIJ(r0)
            r0 = r9 & 6
            r6 = 4
            r2 = 2
            if (r0 != 0) goto L70
            boolean r0 = r5.LJII(r7)
            if (r0 == 0) goto L6e
            r1 = 4
        L14:
            r1 = r1 | r9
        L15:
            r0 = r1 & 3
            if (r0 != r2) goto L32
            boolean r0 = r5.LIZ()
            if (r0 == 0) goto L32
            r5.LIZJ()
        L22:
            X.13Ys r2 = r5.LJJJJZI()
            if (r2 == 0) goto L31
            kotlin.jvm.internal.AwS181S0101000_25 r1 = new kotlin.jvm.internal.AwS181S0101000_25
            r0 = 21
            r1.<init>(r9, r7, r0)
            r2.LIZLLL = r1
        L31:
            return
        L32:
            X.13DN<androidx.lifecycle.LifecycleOwner> r0 = X.C13GF.LIZ
            java.lang.Object r4 = r5.LJJIL(r0)
            androidx.lifecycle.LifecycleOwner r4 = (androidx.lifecycle.LifecycleOwner) r4
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r5.LJJIIJZLJL(r0)
            r0 = r1 & 14
            r3 = 0
            if (r0 != r6) goto L6c
            r2 = 1
        L46:
            boolean r0 = r5.LJII(r4)
            r2 = r2 | r0
            java.lang.Object r1 = r5.LJJ()
            if (r2 != 0) goto L5a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L63
        L5a:
            kotlin.jvm.internal.AwS369S0200000_3 r1 = new kotlin.jvm.internal.AwS369S0200000_3
            r0 = 4
            r1.<init>(r4, r7, r0)
            r5.LJJIJIIJI(r1)
        L63:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5.LJJJJL(r3)
            X.C1680540tpk.LIZIZ(r4, r1, r5)
            goto L22
        L6c:
            r2 = 0
            goto L46
        L6e:
            r1 = 2
            goto L14
        L70:
            r1 = r9
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689210u3j.LJ(kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LJFF(Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-698883085);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.TRUE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS410S0200000_9(function0, (Function0<Unit>) c05p0, (C05P0<Boolean>) 20);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            LJ((Function0) objLJJ2, c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS176S0101000_9(i, function0, 0);
        }
    }

    public static final void LJIIIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(415827381);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            float f = 16;
            C1685190txF.LIZ(str, C1682520tsw.LJIIJJI(InterfaceC1685750ty9.LIZ, f, 18, f, 12), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILIIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, (i2 & 14) | 48, 0, 2032);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 1);
        }
    }

    public static final void LJIIIIZZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, Function2 function2) {
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(803765780);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i5 != 0) {
                function2 = C1689270u3p.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1675980tiO.LIZIZ(InterfaceC1685750ty9.LIZ, C1670400tZO.LIZIZ(c13zcLJIIJ).J2(), C1669050tXD.LIZIZ(C1666730tTT.LIZ(R.dimen.bm, c13zcLJIIJ))), 1.0f);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                function2.invoke(c13zcLJIIJ, Integer.valueOf(i3 & 14));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS48S0102000_19(i, i2, function2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC1686920u02 r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.InterfaceC1680500tpg r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689210u3j.LIZIZ(X.0u02, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }

    public static final void LJI(AbstractC1689250u3n abstractC1689250u3n, Function1<? super C1689420u44, Unit> function1, Function1<? super AbstractC1689280u3q, Unit> function12, Function1<? super AbstractC1689280u3q, Unit> function13, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Function1<? super AbstractC1689280u3q, Unit> function14 = function12;
        boolean z2 = z;
        Function1<? super AbstractC1689280u3q, Unit> function15 = function13;
        Function1<? super C1689420u44, Unit> function16 = function1;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-45581537);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1689250u3n)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function16)) {
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
            if (c13zcLJIIJ.LJII(function14)) {
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
            if (c13zcLJIIJ.LJII(function15)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS266S0000000_25.get$arr$(93);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                function16 = (Function1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (i10 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ2 == C1680510tph.LIZIZ) {
                    objLJJ2 = AFwS266S0000000_25.get$arr$(94);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                function14 = (Function1) objLJJ2;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (i11 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ3 == C1680510tph.LIZIZ) {
                    objLJJ3 = AFwS266S0000000_25.get$arr$(96);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                function15 = (Function1) objLJJ3;
                c13zcLJIIJ.LJJJJL(false);
            }
            if (i12 != 0) {
                z2 = true;
            }
            if (abstractC1689250u3n instanceof C1689420u44) {
                c13zcLJIIJ.LJJIIJZLJL(-709554696);
                C13ZT.LIZ(C1689320u3u.LIZ.LIZJ(C1689570u4J.LIZ), C13Z4.LIZJ(527987031, new C1689230u3l(abstractC1689250u3n, z2, function16), c13zcLJIIJ), c13zcLJIIJ, 56);
                c13zcLJIIJ.LJJJJL(false);
            } else if (abstractC1689250u3n instanceof AbstractC1689280u3q) {
                c13zcLJIIJ.LJJIIJZLJL(-709045552);
                C13ZT.LIZ(C1689320u3u.LIZ.LIZJ(new InterfaceC1673170tdr() { // from class: X.0u4I
                    public final /* synthetic */ C1689570u4J LIZ = C1689570u4J.LIZ;

                    @Override // X.InterfaceC1673170tdr
                    public final float LIZ(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-475481665);
                        float fLIZ = this.LIZ.LIZ(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLIZ;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final float LIZIZ(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(1320883548);
                        float fLIZIZ = this.LIZ.LIZIZ(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLIZIZ;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final float LIZJ(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-121550078);
                        float fLIZJ = this.LIZ.LIZJ(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLIZJ;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final float LIZLLL(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(891154489);
                        float fLIZLLL = this.LIZ.LIZLLL(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLIZLLL;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final C1693430uAX LJ(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(1332568646);
                        C1693430uAX c1693430uAXLJ = this.LIZ.LJ(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return c1693430uAXLJ;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final float LJI(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-751143808);
                        float fLJI = this.LIZ.LJI(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLJI;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final long LJII(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(334759947);
                        long jLJII = this.LIZ.LJII(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return jLJII;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final float LJIIIIZZ(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(171100646);
                        float fLJIIIIZZ = this.LIZ.LJIIIIZZ(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLJIIIIZZ;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final C1668880tWw LJIIIZ(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(-1043598597);
                        C1668880tWw c1668880tWwLJIIIZ = this.LIZ.LJIIIZ(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return c1668880tWwLJIIIZ;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final float LJIIJ(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(1969394280);
                        float fLJIIJ = this.LIZ.LJIIJ(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLJIIJ;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final long LJIIJJI(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(1309967001);
                        long jLJIIJJI = this.LIZ.LJIIJJI(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return jLJIIJJI;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final float LJIIL(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(196532816);
                        float fLJIIL = this.LIZ.LJIIL(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLJIIL;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final long LJIILIIL(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(932081722);
                        long jLJIILIIL = this.LIZ.LJIILIIL(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return jLJIILIIL;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final float LJIILJJIL(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(872323257);
                        float fLJIILJJIL = this.LIZ.LJIILJJIL(interfaceC1680500tpg2);
                        interfaceC1680500tpg2.LJ();
                        return fLJIILJJIL;
                    }

                    @Override // X.InterfaceC1673170tdr
                    public final C1693430uAX LJFF(InterfaceC1680500tpg interfaceC1680500tpg2) {
                        interfaceC1680500tpg2.LJJIIJZLJL(1762582246);
                        C1693430uAX c1693430uAX = C1670400tZO.LJ(interfaceC1680500tpg2).LJJIIJZLJL;
                        interfaceC1680500tpg2.LJ();
                        return c1693430uAX;
                    }
                }), C13Z4.LIZJ(983926784, new AwS64S0310000_25(abstractC1689250u3n, (AbstractC1689250u3n) z2, (boolean) function14, function15, (Function1<? super AbstractC1689280u3q, Unit>) 1), c13zcLJIIJ), c13zcLJIIJ, 56);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-854173381);
                c13zcLJIIJ.LJJJJL(false);
                throw new C1954807lC();
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0412000_25(abstractC1689250u3n, (AbstractC1689250u3n) function16, (Function1<? super C1689420u44, Unit>) function14, function15, (Function1<? super AbstractC1689280u3q, Unit>) z2, (boolean) i, i2, 1);
        }
    }

    public static final void LJII(String str, Function0<Unit> function0, boolean z, C1689390u41 c1689390u41, InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C1689390u41 c1689390u41LIZIZ = c1689390u41;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1488588433);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJJIIJ(c1689390u41LIZIZ)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else {
                if (i9 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    c1689390u41LIZIZ = C1689370u3z.LIZIZ(c13zcLJIIJ);
                    i3 &= -7169;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(c13zcLJIIJ).I2(), C1669430tXp.LIZ));
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILIIL;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                C1687990u1l c1687990u1l = C1687990u1l.LIZ;
                C1668060tVc.LIZ(null, false, 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).I2(), null, C13Z4.LIZJ(-906221956, new AwS639S0100000_25(function0, (Function0<Unit>) 30), c13zcLJIIJ), C13Z4.LIZJ(891228507, new AwS125S1000000_19(str, 1), c13zcLJIIJ), null, c13zcLJIIJ, 1769472, 151);
                float f = 12;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIJJI = C1682520tsw.LJIIJJI(c1685760tyA, f, 0, f, 18);
                if (z2) {
                    interfaceC1685750ty9LJIIJJI = C1689370u3z.LIZLLL(interfaceC1685750ty9LJIIJJI, c1689390u41LIZIZ, false, 14);
                }
                int i10 = (i3 >> 3) & 7168;
                int i11 = i10 >> 3;
                C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, (i11 & 112) | (i11 & 14));
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJJI);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                    interfaceC1631620sYq.invoke(c1687990u1l, c13zcLJIIJ, Integer.valueOf(((i10 >> 6) & 112) | 6));
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1244320iUA(str, function0, z2, c1689390u41LIZIZ, interfaceC1631620sYq, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final void LIZ(C1689240u3m c1689240u3m, Function1<? super C1689420u44, Unit> function1, Function1<? super AbstractC1689280u3q, Unit> function12, Function1<? super AbstractC1689280u3q, Unit> function13, Function0<Unit> function0, Function1<? super Integer, Unit> function14, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        ?? r9;
        int i9;
        Function1<? super Integer, Unit> function15 = function14;
        Function0<Unit> function02 = function0;
        Function1<? super AbstractC1689280u3q, Unit> function16 = function13;
        Function1<? super AbstractC1689280u3q, Unit> function17 = function12;
        Function1<? super C1689420u44, Unit> function18 = function1;
        C1689240u3m c1689240u3m2 = c1689240u3m;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1939402173);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0 && c13zcLJIIJ.LJJIIJ(c1689240u3m2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function18)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function17)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function16)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        int i14 = i2 & 32;
        if (i14 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function15)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((i3 & 74899) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else {
                if ((i2 & 1) != 0) {
                    c1689240u3m2 = new C1689240u3m(0);
                    i3 &= -15;
                }
                if (i10 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = AFwS266S0000000_25.get$arr$(92);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    function18 = (Function1) objLJJ;
                    c13zcLJIIJ.LJJJJL(false);
                }
                if (i11 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ2 == C1680510tph.LIZIZ) {
                        objLJJ2 = AFwS266S0000000_25.get$arr$(95);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    function17 = (Function1) objLJJ2;
                    c13zcLJIIJ.LJJJJL(false);
                }
                if (i12 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ3 == C1680510tph.LIZIZ) {
                        objLJJ3 = AFwS266S0000000_25.get$arr$(97);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                    }
                    function16 = (Function1) objLJJ3;
                    c13zcLJIIJ.LJJJJL(false);
                }
                if (i13 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ4 = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ4 == C1680510tph.LIZIZ) {
                        objLJJ4 = AFwS214S0000000_25.get$arr$(110);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                    }
                    function02 = (Function0) objLJJ4;
                    c13zcLJIIJ.LJJJJL(false);
                }
                if (i14 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ5 = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ5 == C1680510tph.LIZIZ) {
                        objLJJ5 = AFwS240S0000000_9.get$arr$(117);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                    }
                    function15 = (Function1) objLJJ5;
                    c13zcLJIIJ.LJJJJL(false);
                }
            }
            c13zcLJIIJ.LJJJJLI();
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            Object obj = C1680510tph.LIZIZ;
            if (objLJJ6 == obj) {
                objLJJ6 = new C815520Vyw(context);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            C815520Vyw c815520Vyw = (C815520Vyw) objLJJ6;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (objLJJ7 == obj) {
                objLJJ7 = (PowerManager) C786410Ut5.H2(context, "power");
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            c13zcLJIIJ.LJJJJL(false);
            C05P1<Boolean> c05p1 = C20303114cP.LJIILJJIL(c815520Vyw, c13zcLJIIJ).LIZ;
            C05P1<Boolean> c05p12 = C20303114cP.LJIILIIL(c815520Vyw, c13zcLJIIJ).LIZ;
            C1685640txy c1685640txyLJIILL = C20303114cP.LJIILL(c13zcLJIIJ);
            C05P1<Boolean> c05p13 = c1685640txyLJIILL.LIZ;
            C05P1<Boolean> c05p14 = c1685640txyLJIILL.LIZIZ;
            C05P1<Boolean> c05p15 = C20303114cP.LJIIL((PowerManager) objLJJ7, c13zcLJIIJ).LIZ;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (objLJJ8 == obj) {
                objLJJ8 = C20028913Yh.LJ(new AwS71S0500000_9(c05p1, c05p12, c05p13, c05p14, c05p15, (C05P1<Boolean>) 0));
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            C05P1 c05p16 = (C05P1) objLJJ8;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ9 = c13zcLJIIJ.LJJ();
            if (objLJJ9 == obj) {
                objLJJ9 = new AwS553S0100000_9(c05p16, (C05P1<Integer>) 170);
                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
            }
            c13zcLJIIJ.LJJJJL(false);
            LJ((Function0) objLJJ9, c13zcLJIIJ, 6);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if ((57344 & i3) == 16384) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ10 = c13zcLJIIJ.LJJ();
            if (z || objLJJ10 == obj) {
                objLJJ10 = new AwS569S0100000_25(function02, (Function0<Unit>) 194);
                c13zcLJIIJ.LJJIJIIJI(objLJJ10);
            }
            c13zcLJIIJ.LJJJJL(false);
            LJFF((Function0) objLJJ10, c13zcLJIIJ, 0);
            Integer numValueOf = Integer.valueOf(((Number) c05p16.getValue()).intValue());
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if ((i3 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objLJJ11 = c13zcLJIIJ.LJJ();
            if (z2 || objLJJ11 == obj) {
                objLJJ11 = new C594700NUe(function15, c05p16, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ11);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(numValueOf, (Function2) objLJJ11, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(250386667);
            if (!((ArrayList) c1689240u3m2.LIZIZ()).isEmpty()) {
                r9 = 0;
                LJIIIZ(0, c13zcLJIIJ, context.getString(2131827529));
                LJIIIIZZ(6, 0, c13zcLJIIJ, C13Z4.LIZJ(-253104331, new AwS176S0400000_25(c1689240u3m2, (C1689240u3m) function18, (Function1<? super C1689420u44, Unit>) function17, function16, (Function1<? super AbstractC1689280u3q, Unit>) 1), c13zcLJIIJ));
            } else {
                r9 = 0;
            }
            c13zcLJIIJ.LJJJJL(r9);
            if (!((ArrayList) c1689240u3m2.LIZ()).isEmpty()) {
                LJIIIZ(r9, c13zcLJIIJ, context.getString(2131827530));
                LJIIIIZZ(6, r9, c13zcLJIIJ, C13Z4.LIZJ(1353692076, new AwS176S0400000_25(c1689240u3m2, (C1689240u3m) function18, (Function1<? super C1689420u44, Unit>) function17, function16, (Function1<? super AbstractC1689280u3q, Unit>) 0), c13zcLJIIJ));
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            Function1<? super C1689420u44, Unit> function19 = function18;
            C1689240u3m c1689240u3m3 = c1689240u3m2;
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0602000_25(c1689240u3m3, (C1689240u3m) function19, (Function1<? super C1689420u44, Unit>) function17, function16, (Function1<? super AbstractC1689280u3q, Unit>) function02, (Function0<Unit>) function15, (Function1<? super Integer, Unit>) i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel r28, kotlin.jvm.functions.Function1<? super X.C1689420u44, kotlin.Unit> r29, kotlin.jvm.functions.Function1<? super X.AbstractC1689280u3q, kotlin.Unit> r30, kotlin.jvm.functions.Function1<? super X.AbstractC1689280u3q, kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, X.InterfaceC1680500tpg r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1689210u3j.LIZLLL(com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}
