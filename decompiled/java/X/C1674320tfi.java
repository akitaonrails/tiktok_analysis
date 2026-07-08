package X;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS176S0400000_25;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS49S0102000_25;
import kotlin.jvm.internal.AwS69S0001000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674320tfi {
    public static final void LIZLLL(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1449810553);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            k.LIZ(C1675980tiO.LIZIZ(C1675450thX.LIZ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 0.5625f), C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669430tXp.LIZ), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 9);
        }
    }

    public static final void LIZ(StoryHighlightsCreationVM storyHighlightsCreationVM, C1674360tfm c1674360tfm, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZJ;
        boolean z;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(442962257);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(storyHighlightsCreationVM)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(c1674360tfm)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJJI = C1682520tsw.LJIIJJI(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 16.0f, 10.0f, 16.0f, 16.0f);
            if (c1674360tfm.LIZIZ.isEmpty()) {
                c13zcLJIIJ.LJJIIJZLJL(-2145415402);
                strLIZJ = C0MBB.LIZIZ(2131848949, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-2145318000);
                strLIZJ = C0MBB.LIZJ(2131848950, new Object[]{String.valueOf(c1674360tfm.LIZIZ.size())}, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            }
            C1666930tTn c1666930tTnLIZ = C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15);
            EnumC1674300tfg enumC1674300tfg = c1674360tfm.LIZLLL;
            if (enumC1674300tfg != EnumC1674300tfg.INITIAL && enumC1674300tfg != EnumC1674300tfg.FIRST_TIME_LOADING && enumC1674300tfg != EnumC1674300tfg.FIRST_TIME_ERROR && (!c1674360tfm.LIZIZ.isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJII = c13zcLJIIJ.LJII(interfaceC497601wk) | c13zcLJIIJ.LJII(storyHighlightsCreationVM) | c13zcLJIIJ.LJII(context);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS269S0300000_25(interfaceC497601wk, storyHighlightsCreationVM, context, 15);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673400teE.LIZJ((Function0) objLJJ2, strLIZJ, interfaceC1685750ty9LJIIJJI, z, 0L, false, null, null, null, c1666930tTnLIZ, null, null, false, c13zcLJIIJ, 0, 0, 7664);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(storyHighlightsCreationVM, c1674360tfm, i, 71);
        }
    }

    public static final void LIZIZ(StoryHighlightAwemePreview storyHighlightAwemePreview, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        boolean zLJII;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(207162824);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(storyHighlightAwemePreview);
            } else {
                zLJII = c13zcLJIIJ.LJII(storyHighlightAwemePreview);
            }
            if (zLJII) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            long j = storyHighlightAwemePreview.createTime * 1000;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(interfaceC1685750ty9, ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).z2).getValue()).LIZ, C1669050tXD.LIZLLL(0.0f, 0.0f, 8, 0.0f, 11));
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = c.LIZLLL(c1685760tyA);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 54);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                    C1685190txF.LIZ(new BDDateFormat("D").LIZIZ(j, Locale.getDefault()), null, C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), C1670400tZO.LJ(c13zcLJIIJ).LJIIIZ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                    C1685190txF.LIZ(new BDDateFormat("MMM").LIZIZ(j, Locale.getDefault()), C1688600u2k.LIZLLL(c1685760tyA, 0.0f, -3.0f, 1), C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), C1670400tZO.LJ(c13zcLJIIJ).LJJII, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2032);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(storyHighlightAwemePreview, interfaceC1685750ty9, i, 72);
        }
    }

    public static final void LIZJ(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        AbstractC903280Zc6 defaultViewModelCreationExtras;
        Activity activity;
        int i4;
        StoryHighlightsCreationVM storyHighlightsCreationVM2 = storyHighlightsCreationVM;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-30758239);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0 && c13zcLJIIJ.LJII(storyHighlightsCreationVM2)) {
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
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
            } else if ((i2 & 1) != 0) {
                c13zcLJIIJ.LJJIJIIJIL(1729797275);
                ViewModelStoreOwner viewModelStoreOwnerLIZ = C1685320txS.LIZ(c13zcLJIIJ);
                if (viewModelStoreOwnerLIZ != null) {
                    if (viewModelStoreOwnerLIZ instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZ).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = C903300Zc8.LIZJ;
                    }
                    ViewModel viewModelLIZIZ = C1674760tgQ.LIZIZ(StoryHighlightsCreationVM.class, viewModelStoreOwnerLIZ, null, defaultViewModelCreationExtras, c13zcLJIIJ);
                    c13zcLJIIJ.LJJJJL(false);
                    storyHighlightsCreationVM2 = (StoryHighlightsCreationVM) viewModelLIZIZ;
                } else {
                    "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString();
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
            }
            c13zcLJIIJ.LJJJJLI();
            C05P0 c05p0LIZIZ = C1671620tbM.LIZIZ(storyHighlightsCreationVM2.LLILLJJLI, c13zcLJIIJ);
            C05P0 c05p0LIZIZ2 = C1671620tbM.LIZIZ(storyHighlightsCreationVM2.LLJILJILJ.LJFF, c13zcLJIIJ);
            Object objLJJIL = c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            if ((objLJJIL instanceof Activity) && (activity = (Activity) objLJJIL) != null) {
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
                List list = (List) c05p0LIZIZ2.getValue();
                EnumC1674410tfr enumC1674410tfr = EnumC1674410tfr.PREVIEW;
                boolean zContains = list.contains(enumC1674410tfr);
                boolean zLIZ = storyHighlightsCreationVM2.LLJILJILJ.LIZ(enumC1674410tfr);
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                boolean zLJII = c13zcLJIIJ.LJII(storyHighlightsCreationVM2) | c13zcLJIIJ.LJII(activity);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS426S0200000_25(activity, storyHighlightsCreationVM2, 123);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1671800tbe.LIZ(zContains, zLIZ, (Function0) objLJJ2, C0MBB.LIZIZ(2131848951, c13zcLJIIJ), C1669660tYC.LJJL, null, null, null, null, C13Z4.LIZJ(1165392918, new AwS176S0400000_25(storyHighlightsCreationVM2, activity, interfaceC497601wk, c05p0LIZIZ, 6), c13zcLJIIJ), c13zcLJIIJ, 805306368, 480);
            } else {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(storyHighlightsCreationVM2, i, i2, 8);
                    return;
                }
                return;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS49S0102000_25(storyHighlightsCreationVM2, i, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM r37, X.C1674360tfm r38, com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview r39, X.InterfaceC1680500tpg r40, int r41) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674320tfi.LJ(com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM, X.0tfm, com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM r11, X.C1674360tfm r12, X.InterfaceC1685750ty9 r13, X.InterfaceC1680500tpg r14, int r15) {
        /*
            r0 = 789226662(0x2f0aa4a6, float:1.2609522E-10)
            r1 = r14
            X.13ZC r2 = r1.LJIIJ(r0)
            r14 = r15
            r0 = r14 & 6
            r9 = r11
            if (r0 != 0) goto Laf
            boolean r0 = r2.LJII(r9)
            if (r0 == 0) goto Lac
            r1 = 4
        L15:
            r1 = r1 | r14
        L16:
            r0 = r14 & 48
            r8 = r12
            if (r0 != 0) goto L24
            boolean r0 = r2.LJII(r8)
            if (r0 == 0) goto La8
            r0 = 32
        L23:
            r1 = r1 | r0
        L24:
            r0 = r14 & 384(0x180, float:5.38E-43)
            r6 = r13
            if (r0 != 0) goto L32
            boolean r0 = r2.LJJIIJ(r6)
            if (r0 == 0) goto La5
            r0 = 256(0x100, float:3.59E-43)
        L31:
            r1 = r1 | r0
        L32:
            r1 = r1 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L54
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L54
            r2.LIZJ()
        L41:
            X.13Ys r0 = r2.LJJJJZI()
            if (r0 == 0) goto L53
            kotlin.jvm.internal.AwS62S0301000_25 r10 = new kotlin.jvm.internal.AwS62S0301000_25
            r15 = 28
            r11 = r9
            r12 = r8
            r13 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            r0.LIZLLL = r10
        L53:
            return
        L54:
            X.05P0 r5 = X.C20028913Yh.LJIIIIZZ(r8, r2)
            X.0u55 r7 = X.C1689910u4r.LIZ(r2)
            kotlin.Unit r4 = kotlin.Unit.LIZ
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r2.LJJIIJZLJL(r0)
            boolean r3 = r2.LJJIIJ(r7)
            boolean r0 = r2.LJJIIJ(r5)
            r3 = r3 | r0
            boolean r0 = r2.LJII(r9)
            r3 = r3 | r0
            java.lang.Object r1 = r2.LJJ()
            if (r3 != 0) goto L81
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L8a
        L81:
            X.0tfj r1 = new X.0tfj
            r0 = 0
            r1.<init>(r7, r5, r9, r0)
            r2.LJJIJIIJI(r1)
        L8a:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 0
            r2.LJJJJL(r0)
            X.C1680540tpk.LJFF(r4, r1, r2)
            kotlin.jvm.internal.AwS176S0400000_25 r5 = new kotlin.jvm.internal.AwS176S0400000_25
            r10 = 7
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = -654516378(0xffffffffd8fcdf66, float:-2.2242914E15)
            X.12De r1 = X.C13Z4.LIZJ(r0, r5, r2)
            r0 = 6
            X.C1674290tff.LIZ(r1, r2, r0)
            goto L41
        La5:
            r0 = 128(0x80, float:1.8E-43)
            goto L31
        La8:
            r0 = 16
            goto L23
        Lac:
            r1 = 2
            goto L15
        Laf:
            r1 = r14
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674320tfi.LJFF(com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM, X.0tfm, X.0ty9, X.0tpg, int):void");
    }
}
