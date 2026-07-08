package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.socialavatar.experiment.SAAnimationConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS69S0001000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668390tW9 {
    public static final void LIZLLL(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        SAAnimationConfig sAAnimationConfig;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2140471320);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj = objLJJ;
            if (objLJJ == c1680520tpi) {
                C1295960jpS c1295960jpS = new C1295960jpS(context);
                c1295960jpS.setLayerType(2, null);
                c1295960jpS.setRepeatCount(-1);
                try {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    sAAnimationConfig = C444480Hbq.LIZ;
                    SAAnimationConfig sAAnimationConfig2 = (SAAnimationConfig) settingsManagerLIZLLL.LJIIIIZZ("social_avatar_creation_assets", SAAnimationConfig.class, sAAnimationConfig);
                    if (sAAnimationConfig2 != null) {
                        sAAnimationConfig = sAAnimationConfig2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sAAnimationConfig = C444480Hbq.LIZ;
                }
                c1295960jpS.setAnimationFromUrl(sAAnimationConfig.generatingAnimation);
                C786410Ut5.Wb(c1295960jpS, 1.1f);
                C786410Ut5.vc(c1295960jpS, 1.1f);
                c13zcLJIIJ.LJJIJIIJI(c1295960jpS);
                obj = c1295960jpS;
            }
            C1295960jpS c1295960jpS2 = (C1295960jpS) obj;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(InterfaceC1685750ty9.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII = c13zcLJIIJ.LJII(c1295960jpS2);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS604S0100000_25(c1295960jpS2, 517);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            Function1 function1 = (Function1) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = AFwS266S0000000_25.get$arr$(364);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ(432, 0, c13zcLJIIJ, interfaceC1685750ty9LIZLLL, function1, (Function1) objLJJ3);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(X.InterfaceC1685750ty9 r6, X.InterfaceC1680500tpg r7, int r8, int r9) {
        /*
            r0 = -397174272(0xffffffffe8539a00, float:-3.9970405E24)
            X.13ZC r5 = r7.LJIIJ(r0)
            r3 = r9 & 1
            r2 = 2
            if (r3 == 0) goto L64
            r0 = r8 | 6
        Le:
            r1 = r0 & 3
            if (r1 != r2) goto L2a
            boolean r1 = r5.LIZ()
            if (r1 == 0) goto L2a
            r5.LIZJ()
        L1b:
            X.13Ys r2 = r5.LJJJJZI()
            if (r2 == 0) goto L29
            kotlin.jvm.internal.AwS49S0102000_25 r1 = new kotlin.jvm.internal.AwS49S0102000_25
            r0 = 3
            r1.<init>(r8, r9, r6, r0)
            r2.LIZLLL = r1
        L29:
            return
        L2a:
            if (r3 == 0) goto L2e
            X.0tyA r6 = X.InterfaceC1685750ty9.LIZ
        L2e:
            X.1ETK r1 = X.C1670400tZO.LIZIZ(r5)
            long r1 = r1.K2()
            r3 = 5004770(0x4c5de2, float:7.013177E-39)
            r5.LJJIIJZLJL(r3)
            boolean r3 = r5.LJIJJ(r1)
            java.lang.Object r4 = r5.LJJ()
            if (r3 != 0) goto L4f
            X.0tph r3 = X.InterfaceC1680500tpg.LIZ
            r3.getClass()
            X.0tpi r3 = X.C1680510tph.LIZIZ
            if (r4 != r3) goto L58
        L4f:
            kotlin.jvm.internal.AwS39S0000100_25 r4 = new kotlin.jvm.internal.AwS39S0000100_25
            r3 = 3
            r4.<init>(r1, r3)
            r5.LJJIJIIJI(r4)
        L58:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r1 = 0
            r5.LJJJJL(r1)
            r0 = r0 & 14
            X.C1668170tVn.LIZ(r6, r4, r5, r0)
            goto L1b
        L64:
            r0 = r8 & 6
            if (r0 != 0) goto L73
            boolean r0 = r5.LJJIIJ(r6)
            if (r0 == 0) goto L71
            r0 = 4
        L6f:
            r0 = r0 | r8
            goto Le
        L71:
            r0 = 2
            goto L6f
        L73:
            r0 = r8
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668390tW9.LJ(X.0ty9, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(int r31, int r32, X.InterfaceC1680500tpg r33, kotlin.jvm.functions.Function1 r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668390tW9.LIZIZ(int, int, X.0tpg, kotlin.jvm.functions.Function1, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(boolean r36, int r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, kotlin.jvm.functions.Function1<? super X.EnumC439680HLy, kotlin.Unit> r39, X.InterfaceC1680500tpg r40, int r41) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668390tW9.LIZ(boolean, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    public static final void LIZJ(boolean z, boolean z2, long j, float f, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String strLIZ;
        float f2 = f;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1488188544);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                f2 = 1.0f;
            }
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(c.LJ(c1685760tyA, 1.0f), f2);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                if (!z2 && !z) {
                    c13zcLJIIJ.LJJIIJZLJL(-1327622684);
                    i8 = 2131827082;
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-1327624628);
                    i8 = 2131826308;
                }
                String strLIZIZ = C0MBB.LIZIZ(i8, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
                float f3 = 32;
                C1685190txF.LIZ(strLIZIZ, C1682520tsw.LJ(c1685760tyA, f3, 24, f3, 0.0f, 8), C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), C1670400tZO.LJ(c13zcLJIIJ).LIZ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2000);
                if (z && j == 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1793774990);
                    strLIZ = C0MBB.LIZIZ(2131857965, c13zcLJIIJ);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    TimeUnit timeUnit = TimeUnit.HOURS;
                    if (j > timeUnit.toMillis(1L)) {
                        c13zcLJIIJ.LJJIIJZLJL(1793935694);
                        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                        int hours = (int) timeUnit2.toHours(j);
                        strLIZ = C0MBB.LIZ(2131755108, hours, new Object[]{Integer.valueOf(hours), Integer.valueOf((int) (timeUnit2.toMinutes(j) - timeUnit.toMinutes(hours)))}, c13zcLJIIJ);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(1794409126);
                        int minutes = ((int) TimeUnit.MILLISECONDS.toMinutes(j)) + 1;
                        strLIZ = C0MBB.LIZ(2131755098, minutes, new Object[]{Integer.valueOf(minutes)}, c13zcLJIIJ);
                        c13zcLJIIJ.LJJJJL(false);
                    }
                }
                C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI;
                long jE2 = C1670400tZO.LIZIZ(c13zcLJIIJ).E2();
                InterfaceC1685750ty9 interfaceC1685750ty9LJ = C1682520tsw.LJ(c1685760tyA, f3, 12, f3, 0.0f, 8);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AFwS266S0000000_25.get$arr$(363);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1685190txF.LIZ(strLIZ, C1689740u4a.LIZIZ(interfaceC1685750ty9LJ, false, (Function1) objLJJ), jE2, c1693430uAX, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2000);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1668400tWA(z, z2, j, f2, i, i2);
        }
    }

    public static final void LJFF(InterfaceC1680820tqC interfaceC1680820tqC, int i, float f, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3 = z;
        float f2 = f;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(735657390);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1680820tqC)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i4 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                f2 = 1.0f;
            }
            if (i10 != 0) {
                z3 = false;
            }
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(c1685760tyA);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LJFF;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                c13zcLJIIJ.LJJIIJZLJL(1733457495);
                if (interfaceC1680820tqC != null) {
                    C1676460tjA c1676460tjA = new C1676460tjA(interfaceC1680820tqC);
                    float f3 = 306;
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LJIILJJIL(c1685760tyA, f3, f3), ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).R3).getValue()).LIZ, C1669430tXp.LIZ);
                    InterfaceC1671600tbK.LIZ.getClass();
                    C1668230tVt.LIZ(c1676460tjA, null, interfaceC1685750ty9LIZIZ, null, C1671610tbL.LIZIZ, 0.0f, null, c13zcLJIIJ, 24624, 104);
                    C1668640tWY.LIZJ(c.LJIILJJIL(c1685760tyA, f3, f3), C1670400tZO.LIZIZ(c13zcLJIIJ).v2(), 20, new C1668650tWZ(75), c13zcLJIIJ, 3078, 0);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(1733476870);
                if (i >= 0) {
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(c1672220tcK.LIZ(c1685760tyA), f2);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                    int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        z2 = true;
                        C1685190txF.LIZ(C0MBB.LIZJ(2131825873, new Object[]{Integer.valueOf(i)}, c13zcLJIIJ), null, 0L, new C1693430uAX(C1670400tZO.LIZIZ(c13zcLJIIJ).p3(), C1682430tsn.LJ(48), C1680190tpB.LLJ, null, AbstractC1696400uFK.LL, 0L, null, 3, C1682430tsn.LIZJ(57.6d), 16613336), 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2038);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    z2 = true;
                }
                c13zcLJIIJ.LJJJJL(false);
                if (!z3) {
                    c13zcLJIIJ.LJJIIJZLJL(-2096030454);
                    LIZLLL(c13zcLJIIJ, 0);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-2095973445);
                    float f4 = 306;
                    LJ(c.LJIILLIIL(c.LJI(c1685760tyA, f4), f4), c13zcLJIIJ, 6, 0);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(z2);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1667490tUh(interfaceC1680820tqC, i, f2, z3, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(X.InterfaceC1680820tqC r53, boolean r54, boolean r55, int r56, boolean r57, int r58, long r59, boolean r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, kotlin.jvm.functions.Function0<kotlin.Unit> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, kotlin.jvm.functions.Function1<? super X.EnumC439680HLy, kotlin.Unit> r65, X.InterfaceC1680500tpg r66, int r67, int r68, int r69) {
        /*
            Method dump skipped, instruction units count: 1500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668390tW9.LJI(X.0tqC, boolean, boolean, int, boolean, int, long, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.0tpg, int, int, int):void");
    }
}
