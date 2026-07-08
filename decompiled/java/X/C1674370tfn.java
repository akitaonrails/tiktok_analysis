package X;

import androidx.compose.foundation.layout.c;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS49S0102000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674370tfn {
    public static final void LIZ(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        AbstractC903280Zc6 defaultViewModelCreationExtras;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1506492641);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0 && c13zcLJIIJ.LJII(storyHighlightsCreationVM)) {
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
                    storyHighlightsCreationVM = (StoryHighlightsCreationVM) viewModelLIZIZ;
                } else {
                    "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString();
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
            }
            c13zcLJIIJ.LJJJJLI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(InterfaceC1685750ty9.LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                if (storyHighlightsCreationVM.dl1()) {
                    c13zcLJIIJ.LJJIIJZLJL(598485225);
                    C1674430tft.LJFF(null, c13zcLJIIJ, 0, 1);
                    C1674320tfi.LIZJ(null, c13zcLJIIJ, 0, 1);
                    C1674390tfp.LIZLLL(null, c13zcLJIIJ, 0, 1);
                    c13zcLJIIJ.LJJJJL(false);
                } else if (storyHighlightsCreationVM.zQ2()) {
                    c13zcLJIIJ.LJJIIJZLJL(598636536);
                    C1674320tfi.LIZJ(null, c13zcLJIIJ, 0, 1);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(598693545);
                    C1674320tfi.LIZJ(null, c13zcLJIIJ, 0, 1);
                    C1674430tft.LJFF(null, c13zcLJIIJ, 0, 1);
                    C1674390tfp.LIZLLL(null, c13zcLJIIJ, 0, 1);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(storyHighlightsCreationVM, i, i2, 10);
        }
    }
}
