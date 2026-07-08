package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S0121000_12;
import kotlin.jvm.internal.AwS0S1203000_19;
import kotlin.jvm.internal.AwS157S0110000_19;
import kotlin.jvm.internal.AwS25S1101000_19;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS2S0212000_25;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS6S0501000_12;
import kotlin.jvm.internal.AwS71S0210000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667550tUn {
    public static final void LJFF(boolean z, boolean z2, final Function1<? super String, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z3;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1201780234);
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i2 & 145) == 144 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            String strLIZIZ = C0MBB.LIZIZ(2131834597, c13zcLJIIJ);
            String strLIZIZ2 = C0MBB.LIZIZ(2131838212, c13zcLJIIJ);
            String strLIZJ = C0MBB.LIZJ(2131836315, new Object[]{strLIZIZ}, c13zcLJIIJ);
            String strLIZJ2 = C0MBB.LIZJ(2131836316, new Object[]{strLIZIZ2}, c13zcLJIIJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZJ);
            sbLIZ.append("\n\n");
            sbLIZ.append(strLIZJ2);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
            int iLJJJ = a0.LJJJ(strLIZIZ3, strLIZIZ, 0, false, 6);
            int iLJJJ2 = a0.LJJJ(strLIZIZ3, strLIZIZ2, 0, false, 6);
            C1693450uAZ c1693450uAZ = new C1693450uAZ(0L, C1670400tZO.LJ(c13zcLJIIJ).LJIIIZ.LIZ.LIZIZ, C1670400tZO.LJ(c13zcLJIIJ).LJIIIZ.LIZ.LIZJ, null, null, C1670400tZO.LJ(c13zcLJIIJ).LJIIIZ.LIZ.LJFF, null, 0L, null, null, null, 0L, null, null, 65497);
            c13zcLJIIJ.LJJIIJZLJL(435431386);
            C1692230u8b c1692230u8b = new C1692230u8b();
            int iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(0L, C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI.LIZ.LIZIZ, C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI.LIZ.LIZJ, null, null, C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI.LIZ.LJFF, null, 0L, null, null, null, 0L, null, null, 65497));
            try {
                c1692230u8b.LIZLLL(strLIZIZ3);
                c1692230u8b.LJII(iLJIIJJI);
                c1692230u8b.LIZIZ(c1693450uAZ, iLJJJ, strLIZIZ.length() + iLJJJ);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = new InterfaceC1693170uA7() { // from class: X.0tua
                        @Override // X.InterfaceC1693170uA7
                        public final void LIZIZ() {
                            Activity activityLIZIZ;
                            IFilterVideoService iFilterVideoService;
                            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (iFilterVideoService = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null)) != null) {
                                iFilterVideoService.LJI(activityLIZIZ, "manage_feeds");
                            }
                            C20684815ws.onEventV3("click_filter_video_keywords");
                        }
                    };
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                c1692230u8b.LIZ(new C1693020u9s("keyword_filter", null, (InterfaceC1693170uA7) objLJJ), iLJJJ, strLIZIZ.length() + iLJJJ);
                c1692230u8b.LIZIZ(c1693450uAZ, iLJJJ2, strLIZIZ2.length() + iLJJJ2);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                if ((i2 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (z3 || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new InterfaceC1693170uA7() { // from class: X.0TR4
                        @Override // X.InterfaceC1693170uA7
                        public final void LIZIZ() {
                            Function1<String, Unit> function12 = function1;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("https://support.tiktok.com/");
                            String appLanguage = ((ILanguageService) ServiceManager.get().getService(ILanguageService.class)).getAppLanguage();
                            if (Intrinsics.LJFF(appLanguage, "he")) {
                                appLanguage = "he_IL";
                            } else if (Intrinsics.LJFF(appLanguage, "zh-Hant")) {
                                appLanguage = "zh-Hant-TW";
                            }
                            sbLIZ2.append(appLanguage);
                            sbLIZ2.append("/using-tiktok/exploring-videos/managing-personalization-on-tiktok");
                            function12.invoke(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    };
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                c1692230u8b.LIZ(new C1693020u9s("learn_more", null, (InterfaceC1693170uA7) objLJJ2), iLJJJ2, strLIZIZ2.length() + iLJJJ2);
                C1692220u8a c1692220u8aLJIIL = c1692230u8b.LJIIL();
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(InterfaceC1685750ty9.LIZ, 1.0f);
                if (z2) {
                    i3 = 32;
                    f = 32;
                } else {
                    i3 = 32;
                    f = 24;
                }
                if (z2) {
                    f2 = i3;
                } else {
                    f2 = 24;
                }
                C1685190txF.LIZIZ(c1692220u8aLJIIL, C1682520tsw.LJIIL(interfaceC1685750ty9LJ, f, 0.0f, f2, 0.0f, 10), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2032);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1692230u8b.LJII(iLJIIJJI);
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0121000_12(i, function1, z, z2, 0);
        }
    }

    public static final void LJI(boolean z, boolean z2, Function1<? super Boolean, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        float f;
        float f2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1410032573);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
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
                if (z2) {
                    f = 32;
                } else {
                    f = 24;
                }
                if (z2) {
                    f2 = 32;
                } else {
                    f2 = 24;
                }
                k.LIZ(C1675980tiO.LIZIZ(c.LJI(c.LJ(C1682520tsw.LJIIL(c1685760tyA, f, 20, f2, 0.0f, 8), 1.0f), (float) 0.5d), C1670400tZO.LIZIZ(c13zcLJIIJ).T2(), C1669430tXp.LIZ), c13zcLJIIJ, 0);
                Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = C1671990tbx.LLIZ;
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                Function1 function12 = (Function1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ2 = c.LJ(c1685760tyA, 1.0f);
                c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                boolean zLJII = c13zcLJIIJ.LJII(context);
                if ((i2 & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z5 = z3 | zLJII;
                if ((i2 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z6 = z4 | z5;
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (z6 || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS71S0210000_19(context, function1, z, 7);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(54, 0, c13zcLJIIJ, interfaceC1685750ty9LJ2, function12, (Function1) objLJJ2);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0121000_12(i, function1, z, z2, 1);
        }
    }

    public static final void LIZLLL(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1664202753);
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C1668060tVc.LIZ(c.LJ(interfaceC1685750ty92, 1.0f), false, 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), null, C13Z4.LIZJ(-181180216, new AwS157S0110000_19(function0, z, 3), c13zcLJIIJ), null, C13Z4.LIZJ(1417968842, new AwS157S0110000_19(function0, z, 4), c13zcLJIIJ), c13zcLJIIJ, 12779520, 86);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0212000_25(i, i2, interfaceC1685750ty92, function0, z, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super Boolean, Unit> function13, Function0<Unit> function0, Function1<? super Boolean, Unit> function14, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean zBooleanValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-37966508);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function14)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                Boolean bool = (Boolean) C1915520zwk.LLILZLL.getValue();
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(zBooleanValue));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.valueOf(!((Boolean) c05p0.getValue()).booleanValue()));
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1670410tZP.LIZ(C1669670tYD.LIZJ(c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(-1239128551, new C1667540tUm(function0, function13, function14, function1, function12, c05p0, (C05P0) objLJJ2), c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0501000_12(function1, function12, function13, function0, function14, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0tpg, X.13ZC] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.0u1l] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r30v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZJ(Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super Boolean, Unit> function13, Function0<Unit> function0, Function1<? super Boolean, Unit> function14, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        ?? r2;
        float f;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zBooleanValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ?? LJIIJ = interfaceC1680500tpg.LJIIJ(498958804);
        if ((i & 6) == 0) {
            if (LJIIJ.LJII(function1)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (LJIIJ.LJII(function12)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (LJIIJ.LJII(function13)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (LJIIJ.LJII(function0)) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (LJIIJ.LJII(function14)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) == 9362 && LJIIJ.LIZ()) {
            LJIIJ.LIZJ();
        } else {
            LJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = LJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj = objLJJ;
            if (objLJJ == c1680520tpi) {
                Boolean bool = (Boolean) C1915520zwk.LLILZLL.getValue();
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                C05P0 c05p0LJI = C20028913Yh.LJI(Boolean.valueOf(zBooleanValue));
                LJIIJ.LJJIJIIJI(c05p0LJI);
                obj = c05p0LJI;
            }
            C05P0 c05p0 = (C05P0) obj;
            LJIIJ.LJJJJL(false);
            LJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = LJIIJ.LJJ();
            Object obj2 = objLJJ2;
            if (objLJJ2 == c1680520tpi) {
                C05P0 c05p0LJI2 = C20028913Yh.LJI(Boolean.valueOf(!((Boolean) c05p0.getValue()).booleanValue()));
                LJIIJ.LJJIJIIJI(c05p0LJI2);
                obj2 = c05p0LJI2;
            }
            C05P0 c05p02 = (C05P0) obj2;
            LJIIJ.LJJJJL(false);
            if (((Configuration) LJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZ)).orientation == 2) {
                z = true;
            } else {
                z = false;
            }
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1671850tbj.LIZ(C1689370u3z.LIZLLL(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(LJIIJ).G3(), C1669430tXp.LIZ), C1689370u3z.LIZIZ(LJIIJ), false, 14), EnumC995470c0n.Max);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, LJIIJ, 48);
            int iLIZ = C0MXE.LIZ(LJIIJ);
            C13D2 c13d2LJJJIL = LJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(LJIIJ, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (LJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                LJIIJ.LJJIII();
                if (LJIIJ.LJJJI) {
                    LJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    LJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(LJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(LJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (LJIIJ.LJJJI || !Intrinsics.LJFF(LJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    LJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    LJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(LJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                ?? r16 = C1687990u1l.LIZ;
                LJIIJ.LJJIIJZLJL(-624870713);
                if (!z) {
                    r2 = 0;
                    LIZLLL(((i2 >> 3) & 896) | 6, 2, LJIIJ, null, function0, true);
                } else {
                    r2 = 0;
                }
                LJIIJ.LJJJJL(r2);
                String strLIZIZ = C0MBB.LIZIZ(2131838226, LJIIJ);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
                float f2 = 32;
                float f3 = 12;
                if (z) {
                    f = f2;
                } else {
                    f = (float) r2;
                }
                C1685190txF.LIZ(strLIZIZ, C1682520tsw.LJIIJJI(interfaceC1685750ty9LJ, f2, f, f2, f3), C1670400tZO.LIZIZ(LJIIJ).K3(), C1670400tZO.LJ(LJIIJ).LIZ, 0L, 3, r2 == true ? 1 : 0, r2, r2 == true ? 1 : 0, null, null, LJIIJ, r2 == true ? 1 : 0, r2 == true ? 1 : 0, 2000);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = r16.LIZ(C1689370u3z.LIZLLL(c1685760tyA, C1689370u3z.LIZIZ(LJIIJ), r2, 14), 1.0f, r2);
                C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, LJIIJ, r2);
                int iLIZ2 = C0MXE.LIZ(LJIIJ);
                C13D2 c13d2LJJJIL2 = LJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(LJIIJ, interfaceC1685750ty9LIZ2);
                if (LJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    LJIIJ.LJJIII();
                    if (LJIIJ.LJJJI) {
                        LJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        LJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(LJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(LJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (LJIIJ.LJJJI || !Intrinsics.LJFF(LJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        LJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        LJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(LJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    LJFF(((Boolean) c05p0.getValue()).booleanValue(), true, function1, LJIIJ, ((i2 << 6) & 896) | 48);
                    boolean zBooleanValue2 = ((Boolean) c05p02.getValue()).booleanValue();
                    LJIIJ.LJJIIJZLJL(-1633490746);
                    if ((i2 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object objLJJ3 = LJIIJ.LJJ();
                    Object obj3 = objLJJ3;
                    if (z2 || objLJJ3 == c1680520tpi) {
                        AwS378S0200000_12 awS378S0200000_12 = new AwS378S0200000_12(c05p02, function12, 108);
                        LJIIJ.LJJIJIIJI(awS378S0200000_12);
                        obj3 = awS378S0200000_12;
                    }
                    LJIIJ.LJJJJL(r2);
                    LJI(zBooleanValue2, true, (Function1) obj3, LJIIJ, 48);
                    LJIIJ.LJJJJL(true);
                    String strLIZIZ2 = C0MBB.LIZIZ(2131838225, LJIIJ);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c1685760tyA, f2);
                    LJIIJ.LJJIIJZLJL(-1746271574);
                    if ((i2 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i2 & 57344) == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z5 = z4 | z3;
                    Object objLJJ4 = LJIIJ.LJJ();
                    Object obj4 = objLJJ4;
                    if (z5 || objLJJ4 == c1680520tpi) {
                        AwS269S0300000_25 awS269S0300000_25 = new AwS269S0300000_25(function13, function14, (Function1<? super Boolean, Unit>) c05p02, (C05P0<Boolean>) 25);
                        LJIIJ.LJJIJIIJI(awS269S0300000_25);
                        obj4 = awS269S0300000_25;
                    }
                    LJIIJ.LJJJJL(r2);
                    LJ(strLIZIZ2, interfaceC1685750ty9LJIIIIZZ, r2 == true ? 1 : 0, (Function0) obj4, LJIIJ, 48, 4);
                    LJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = LJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0501000_12(function1, function12, function13, function0, function14, i, 1);
        }
    }

    public static final void LJ(String str, InterfaceC1685750ty9 interfaceC1685750ty9, int i, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        int i9 = i;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1392094959);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i9)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i4 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                i9 = 0;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1671970tbv.LLIZ;
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = c.LJ(InterfaceC1685750ty9.LIZ, 1.0f).LIZ(interfaceC1685750ty92);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean z3 = true;
            if ((i4 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | z;
            if ((i4 & 7168) != 2048) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z5 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS25S1101000_19(str, i9, function0, 1);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ(6, 0, c13zcLJIIJ, interfaceC1685750ty9LIZ, function1, (Function1) objLJJ2);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1203000_19(str, interfaceC1685750ty92, i9, function0, i2, i3, 0);
        }
    }

    public static final void LIZ(boolean z, Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super Boolean, Unit> function13, Function0<Unit> function0, Function1<? super Boolean, Unit> function14, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1386161998);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i5 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function14)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (z) {
            c13zcLJIIJ.LJJIIJZLJL(-958106199);
            int i9 = i2 >> 3;
            LIZJ(function1, function12, function13, function0, function14, c13zcLJIIJ, (i9 & 57344) | (i9 & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168));
            c13zcLJIIJ.LJJJJL(false);
        } else {
            c13zcLJIIJ.LJJIIJZLJL(-957803608);
            int i10 = i2 >> 3;
            LIZIZ(function1, function12, function13, function0, function14, c13zcLJIIJ, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344));
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0TR5(z, function1, function12, function13, function0, function14, i);
        }
    }
}
