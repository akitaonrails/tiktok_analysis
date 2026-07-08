package X;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.OptValue;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591080rVS extends AbstractC1591090rVT {
    public static final C1591080rVS LIZIZ = new C1591080rVS();
    public static final List<String> LIZJ = new ArrayList();
    public static final HashMap<String, Integer> LIZLLL = new HashMap<>();
    public static AbstractC1591090rVT LJ;
    public static C1591930rWp LJFF;
    public static AbstractC1591090rVT LJI;

    @Override // X.AbstractC1591090rVT
    public final Object LJIILLIIL() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT instanceof InterfaceC1592830rYH) {
            return abstractC1591090rVT;
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final Rect LJIIZILJ() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJIIZILJ();
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final View LJIJJ() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJIJJ();
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final String LJIJJLI() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJIJJLI();
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final View LJIL() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJIL();
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final View LJJ() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJJ();
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJIIJI() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIJIIJI();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJLIJ() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIJLIJ();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIZ() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIZ();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJI() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJI();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJIL() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJIL();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJLIIL() {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJLIIL();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIIIZZ(ImageView imageView) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJIIIIZZ(imageView);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIJ(boolean z) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJIIJ(z);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIILIIL(boolean z) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJIILIIL(z);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final InterfaceC1587260rPI LJIILL(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJIILL(str);
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final int LJIJ(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJIJ(str);
        }
        return 0;
    }

    @Override // X.AbstractC1591090rVT
    public final View LJIJI(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJIJI(str);
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final boolean LJJI(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJJI(str);
        }
        return false;
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIFFI(final String str) {
        C15O7.LIZIZ(new Callable() { // from class: X.0rVV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("TabBarLogic@8452.hideDot$1");
                AbstractC1591090rVT abstractC1591090rVT = C1591080rVS.LJI;
                if (abstractC1591090rVT != null) {
                    abstractC1591090rVT.LJJIFFI(str);
                }
                Boolean boolValueOf = Boolean.valueOf(((ArrayList) C1591080rVS.LIZJ).remove(str));
                C1C7U.LIZIZ("TabBarLogic@8452.hideDot$1");
                return boolValueOf;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // X.AbstractC1591090rVT
    public final boolean LJJII(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJJII(str);
        }
        return false;
    }

    @Override // X.AbstractC1591090rVT
    public final boolean LJJIII(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT == null || !abstractC1591090rVT.LJJIII(str)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1591090rVT
    public final boolean LJJIIJ(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            return abstractC1591090rVT.LJJIIJ(str);
        }
        return false;
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIIZ(Fragment fragment) {
        Object c098200Yq;
        C1591930rWp c1591930rWp = LJFF;
        if (c1591930rWp != null) {
            try {
                c098200Yq = FragmentManager.LJJJJLL(c1591930rWp);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
        } else {
            c098200Yq = null;
        }
        if (Intrinsics.LJFF(fragment, c098200Yq)) {
            LJ = null;
            LJI = null;
            LJFF = null;
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIIZI(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIIZI(str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJ(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIJ(str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJIIJIL(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIJIIJIL(str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJIL(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIJIL(str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIL(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIL(str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJ(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJ(str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJ(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJJ(str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJI(String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJJI(str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJIZL(float f) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJJIZL(f);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJJ(C996210c1z c996210c1z) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJJJ(c996210c1z);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJZI(final String str) {
        C15O7.LIZIZ(new Callable() { // from class: X.0rVW
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("TabBarLogic@8452.showDot$1");
                AbstractC1591090rVT abstractC1591090rVT = C1591080rVS.LJI;
                if (abstractC1591090rVT != null) {
                    abstractC1591090rVT.LJJJJZI(str);
                }
                Boolean boolValueOf = Boolean.valueOf(((ArrayList) C1591080rVS.LIZJ).add(str));
                C1C7U.LIZIZ("TabBarLogic@8452.showDot$1");
                return boolValueOf;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJLL(AbstractC2273051Dy3 abstractC2273051Dy3) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJLL(abstractC2273051Dy3);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJL(List<? extends InterfaceC1583870rJp> list) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJL(list);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJI(AvatarComponentView avatarComponentView, String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJI(avatarComponentView, str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJII(UrlModel urlModel, String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJII(urlModel, str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIIZ(C19EG c19eg, View view) {
        Integer num;
        C1592950rYT c1592950rYT;
        C1582020rGq.LIZJ("scene_top_bottom_attach");
        AbstractC1591090rVT abstractC1591090rVT = LJ;
        LJI = abstractC1591090rVT;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJIIIZ(c19eg, view);
        }
        C1591100rVU c1591100rVU = C1591100rVU.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ != null) {
            AbstractC1591090rVT abstractC1591090rVT2 = LJI;
            c1591100rVU.getClass();
            OptValue optValueLIZ = C1589740rTI.LIZ();
            if (optValueLIZ != null && (num = optValueLIZ.enableHomeTabDynamicText) != null && num.intValue() == 1) {
                View viewLJIJI = null;
                if (abstractC1591090rVT2 != null) {
                    viewLJIJI = abstractC1591090rVT2.LJIJI("HOME");
                }
                if ((viewLJIJI instanceof C1592950rYT) && (c1592950rYT = (C1592950rYT) viewLJIJI) != null) {
                    C1591100rVU.LIZLLL = abstractC1591090rVT2;
                    C1591100rVU.LIZIZ = new WeakReference<>(c1592950rYT);
                    C1591100rVU.LIZJ = c1592950rYT.getIconData().LIZJ;
                    HomeTabViewModel homeTabViewModelLIZ = HomeTabViewModel.LLILZIL.LIZ(c19egLIZIZ);
                    Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19egLIZIZ);
                    for (InterfaceC1583870rJp interfaceC1583870rJp : C13LP.LLIIII(homeTabViewModelLIZ.lZ1(false))) {
                        String strTag = interfaceC1583870rJp.tag();
                        final AwS138S1100000_24 awS138S1100000_24 = new AwS138S1100000_24(interfaceC1583870rJp, strTag, 15);
                        hoxLIZ.wQ2(strTag, new InterfaceC1055110dYz() { // from class: X.0qxC
                            @Override // X.InterfaceC1583780rJg
                            public final String getHoxNodeTag() {
                                return "";
                            }

                            @Override // X.InterfaceC1055110dYz
                            public final void onNodeHide(Bundle bundle) {
                            }

                            @Override // X.InterfaceC1055110dYz
                            public final void onNodeShow(Bundle bundle) {
                                awS138S1100000_24.invoke(bundle);
                            }
                        });
                    }
                    hoxLIZ.wQ2("HOME", new C1569820qxA(AFwS264S0000000_24.get$arr$(785)));
                }
            }
            C1582020rGq.LIZ("scene_top_bottom_attach");
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIJJI(int i, String str) {
        LJIIL(i, str, false);
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIIJZLJL(C19EG c19eg, Configuration configuration) {
        AbstractC1591090rVT abstractC1591090rVT = LJ;
        LJI = abstractC1591090rVT;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIIJZLJL(c19eg, configuration);
        }
        AbstractC1591090rVT abstractC1591090rVT2 = LJI;
        if (abstractC1591090rVT2 != null) {
            abstractC1591090rVT2.LJJJJJL();
        }
        AbstractC1591090rVT abstractC1591090rVT3 = LJI;
        if (abstractC1591090rVT3 != null) {
            abstractC1591090rVT3.LJJJJL();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJL(UserNewContent userNewContent, String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJIJL(userNewContent, str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJLL(boolean z, boolean z2) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJJLL(z, z2);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJZ(int i, C1AV2 c1av2) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJJZ(i, c1av2);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJLZIJ(String str, EnumC1571190qzN enumC1571190qzN) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJLZIJ(str, enumC1571190qzN);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJZ(Fragment fragment, String str) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJZ(fragment, str);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIL(final int i, final String str, final boolean z) {
        C15O7.LIZIZ(new Callable() { // from class: X.0rVX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("TabBarLogic@8452.changeCount$1");
                AbstractC1591090rVT abstractC1591090rVT = C1591080rVS.LJI;
                if (abstractC1591090rVT != null) {
                    abstractC1591090rVT.LJIIL(i, str, z);
                }
                C1591080rVS.LIZLLL.put(str, Integer.valueOf(i));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TabBarLogic@8452.changeCount$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIILJJIL(String str, String str2, boolean z) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJIILJJIL(str, str2, z);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJLI(Drawable drawable, AbstractC2273051Dy3 abstractC2273051Dy3, FrameLayout.LayoutParams layoutParams, ImageView.ScaleType scaleType) {
        AbstractC1591090rVT abstractC1591090rVT = LJI;
        if (abstractC1591090rVT != null) {
            abstractC1591090rVT.LJJJJLI(drawable, abstractC2273051Dy3, layoutParams, scaleType);
        }
    }
}
