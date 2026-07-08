package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS137S0400000_8;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS175S0101000_8;
import kotlin.jvm.internal.AwS302S0300000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS49S0102000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS62S0301000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674390tfp {
    public static final void LIZJ(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        Activity activity;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(435123293);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(storyHighlightsCreationVM)) {
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
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            C13DR c13dr = AndroidCompositionLocals_androidKt.LIZIZ;
            Context context = (Context) c13zcLJIIJ.LJJIL(c13dr);
            Object objLJJIL = c13zcLJIIJ.LJJIL(c13dr);
            if ((objLJJIL instanceof Activity) && (activity = (Activity) objLJJIL) != null) {
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                boolean zLJII = c13zcLJIIJ.LJII(activity) | c13zcLJIIJ.LJII(interfaceC497601wk) | c13zcLJIIJ.LJII(storyHighlightsCreationVM) | c13zcLJIIJ.LJII(context);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS137S0400000_8(activity, storyHighlightsCreationVM, interfaceC497601wk, context, 7);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ2, 7);
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
                int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
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
                    C1674780tgS.LIZ(new C1674790tgT(null, null, new C1674800tgU(C1669660tYC.LLJLLL, C1383370m6R.LJFF(R.attr.a1h)), C1383370m6R.LJFF(R.attr.a03), 0, 0.0f, false, 0, 0.0f, 1011), c.LJIILIIL(c1685760tyA, 62.0f), c13zcLJIIJ, 56, 0);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS175S0101000_8(storyHighlightsCreationVM, i, 2);
                    return;
                }
                return;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS175S0101000_8(storyHighlightsCreationVM, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM r17, X.C1674400tfq r18, X.InterfaceC1680500tpg r19, int r20) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674390tfp.LIZ(com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM, X.0tfq, X.0tpg, int):void");
    }

    public static final void LIZLLL(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        AbstractC903280Zc6 defaultViewModelCreationExtras;
        int i4;
        StoryHighlightsCreationVM storyHighlightsCreationVM2 = storyHighlightsCreationVM;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1111075991);
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
            C05P0 c05p0LIZIZ = C1671620tbM.LIZIZ(storyHighlightsCreationVM2.LLILZLL, c13zcLJIIJ);
            C05P0 c05p0LIZIZ2 = C1671620tbM.LIZIZ(storyHighlightsCreationVM2.LLJILJILJ.LJFF, c13zcLJIIJ);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                c13zcLJIIJ.LJJIJIIJI(C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ));
            }
            c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            Bitmap bitmap = ((C1674400tfq) c05p0LIZIZ.getValue()).LIZJ;
            c13zcLJIIJ.LJJIIJZLJL(-1251889882);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(bitmap);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1377105aD(bitmap);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C1377105aD c1377105aD = (C1377105aD) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJJJL(false);
            List list = (List) c05p0LIZIZ2.getValue();
            EnumC1674410tfr enumC1674410tfr = EnumC1674410tfr.EDIT_COVER;
            boolean zContains = list.contains(enumC1674410tfr);
            boolean zLIZ = storyHighlightsCreationVM2.LLJILJILJ.LIZ(enumC1674410tfr);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII = c13zcLJIIJ.LJII(storyHighlightsCreationVM2);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS569S0100000_25(storyHighlightsCreationVM2, 795);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            Function0 function0 = (Function0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            String strLIZIZ = C0MBB.LIZIZ(2131848979, c13zcLJIIJ);
            String strLIZIZ2 = C0MBB.LIZIZ(2131848978, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII2 = c13zcLJIIJ.LJII(storyHighlightsCreationVM2);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS569S0100000_25(storyHighlightsCreationVM2, 796);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            Function0 function02 = (Function0) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            String strLIZIZ3 = C0MBB.LIZIZ(2131848977, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c1377105aD) | c13zcLJIIJ.LJII(storyHighlightsCreationVM2);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new AwS426S0200000_25(c1377105aD, storyHighlightsCreationVM2, 125);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1671800tbe.LIZ(zContains, zLIZ, function0, strLIZIZ, null, strLIZIZ2, function02, strLIZIZ3, (Function0) objLJJ5, C13Z4.LIZJ(1940241292, new AwS302S0300000_25(c1377105aD, storyHighlightsCreationVM2, c05p0LIZIZ, 8), c13zcLJIIJ), c13zcLJIIJ, 805306368, 16);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(storyHighlightsCreationVM2, i, i2, 9);
        }
    }

    public static final void LIZIZ(StoryHighlightsCreationVM storyHighlightsCreationVM, C1674400tfq c1674400tfq, StoryHighlightAwemePreview storyHighlightAwemePreview, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        List<String> urlList;
        int iLJIIIZ;
        boolean zLJII;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1901580674);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(storyHighlightsCreationVM)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(c1674400tfq)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(storyHighlightAwemePreview);
            } else {
                zLJII = c13zcLJIIJ.LJII(storyHighlightAwemePreview);
            }
            if (zLJII) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJII2 = c13zcLJIIJ.LJII(interfaceC497601wk) | c13zcLJIIJ.LJII(storyHighlightsCreationVM) | c13zcLJIIJ.LJII(context);
            if ((i2 & 896) == 256 || ((i2 & 512) != 0 && c13zcLJIIJ.LJII(storyHighlightAwemePreview))) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z | zLJII2;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z2 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS153S0400000_25(interfaceC497601wk, storyHighlightsCreationVM, context, storyHighlightAwemePreview, 9);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            String str = null;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ2, 7);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1685760tyA, 62.0f);
                UrlModel urlModel = storyHighlightAwemePreview.coverImgUrl;
                if (urlModel == null || (urlList = urlModel.getUrlList()) == null) {
                    urlList = C13BV.INSTANCE;
                }
                C1523605xq c1523605xq = new C1523605xq(urlList);
                c13zcLJIIJ.LJJIIJZLJL(1180015180);
                String str2 = storyHighlightAwemePreview.awemeId;
                StoryHighlightAwemePreview storyHighlightAwemePreview2 = c1674400tfq.LIZIZ;
                if (storyHighlightAwemePreview2 != null) {
                    str = storyHighlightAwemePreview2.awemeId;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    iLJIIIZ = C1685850tyJ.LJIIIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).S3());
                } else {
                    iLJIIIZ = 0;
                }
                c13zcLJIIJ.LJJJJL(false);
                C1674780tgS.LIZ(new C1674790tgT(c1523605xq, null, null, 0, iLJIIIZ, 2.5f, false, 0, 0.0f, 974), interfaceC1685750ty9LJIILIIL, c13zcLJIIJ, 56, 0);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(storyHighlightsCreationVM, c1674400tfq, storyHighlightAwemePreview, i, 29);
        }
    }
}
