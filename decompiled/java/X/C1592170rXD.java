package X;

import Y.ACListenerS88S0300000_24;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS57S0300000_24;
import Y.ARunnableS75S0200000_6;
import Y.ARunnableS93S0200000_24;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ICoinService;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0rXD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592170rXD extends AbstractC1591090rVT implements InterfaceC1592420rXc, InterfaceC1592830rYH {
    public final C1591930rWp LIZIZ;
    public final C19EG LIZJ;
    public View LJI;
    public ARunnableS57S0300000_24 LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public TabChangeManager LJIIJJI;
    public final LinkedHashMap<String, AbstractC1592930rYR> LIZLLL = new LinkedHashMap<>();
    public final String LJ = "BottomTab";
    public String LJFF = "HOME";
    public final C01GW LJII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1627));

    @Override // X.InterfaceC1592420rXc
    public final void LIZJ() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(this.LJFF);
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJJIII();
        }
    }

    @Override // X.InterfaceC1592420rXc
    public final void LIZLLL() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(this.LJFF);
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJJIJIIJI();
        }
    }

    @Override // X.InterfaceC1592830rYH
    public final boolean LJFF() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("HOME");
        if (abstractC1592930rYR != null) {
            return abstractC1592930rYR.LJIJ();
        }
        return false;
    }

    @Override // X.AbstractC1591090rVT
    public final View LJIJJ() {
        C1592950rYT c1592950rYT;
        View viewLJIJI = LJIJI("NOTIFICATION");
        return (!(viewLJIJI instanceof C1592950rYT) || (c1592950rYT = (C1592950rYT) viewLJIJI) == null) ? viewLJIJI : c1592950rYT.getTabIcon();
    }

    @Override // X.AbstractC1591090rVT
    public final View LJIL() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("PUBLISH");
        if (abstractC1592930rYR == null) {
            return null;
        }
        abstractC1592930rYR.LJIILIIL();
        return abstractC1592930rYR.LL.getTabIcon();
    }

    @Override // X.AbstractC1591090rVT
    public final View LJJ() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("PUBLISH");
        if (abstractC1592930rYR == null) {
            return null;
        }
        abstractC1592930rYR.LJIILL();
        return abstractC1592930rYR.LL.getTabTitleView();
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJIIJI() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("PUBLISH");
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJIJJ();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJLIJ() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("INCENTIVE_COIN");
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJJIJIL();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIZ() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("USER");
        if (abstractC1592930rYR != null) {
            C1592950rYT c1592950rYT = abstractC1592930rYR.LL;
            c1592950rYT.LLJJI = false;
            ImageView imageView = c1592950rYT.LLIZ;
            if (imageView != null) {
                C339190DRl.LIZIZ(imageView);
                HandlerHook.viewPost(c1592950rYT, new ARunnableS75S0200000_6(c1592950rYT, imageView, 3));
            }
            ImageView imageView2 = c1592950rYT.LLILZLL;
            if (imageView2 != null) {
                C786410Ut5.V4(imageView2, 1.0f);
            }
            TextView textView = c1592950rYT.LLJIJIL;
            if (textView != null) {
                C786410Ut5.S4(1.0f, textView);
            }
            c1592950rYT.setTabIconVisibility(0);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJI() {
        C1592950rYT c1592950rYT;
        ImageView imageView;
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("SHOP_MALL");
        if (abstractC1592930rYR == null || (imageView = (c1592950rYT = abstractC1592930rYR.LL).LLJJIJI) == null) {
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1592950rYT, imageView);
        c1592950rYT.removeView(imageView);
        c1592950rYT.LLJJIJI = null;
        ImageView imageView2 = c1592950rYT.LLILZLL;
        if (imageView2 != null) {
            C786410Ut5.LJZI(0, imageView2);
            C786410Ut5.V4(imageView2, 1.0f);
            C786410Ut5.Qb(imageView2, 1.0f);
            C786410Ut5.rc(imageView2, 1.0f);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJIL() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("SHOP_MALL");
        if (abstractC1592930rYR != null) {
            C1592950rYT c1592950rYT = abstractC1592930rYR.LL;
            ImageView imageView = c1592950rYT.LLJJIJI;
            if (imageView != null) {
                imageView.clearAnimation();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1592950rYT, imageView);
                c1592950rYT.removeView(imageView);
                c1592950rYT.LLJJIJI = null;
            }
            ImageView imageView2 = c1592950rYT.LLILZLL;
            if (imageView2 != null) {
                imageView2.clearAnimation();
                C786410Ut5.LJZI(0, imageView2);
            }
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJJL() {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (!c19252910Tv.LIZLLL().LJIJI().LLLIIII() && c19252910Tv.LIZLLL().LJIJI().LLLJIL()) {
            int iLLILL = c19252910Tv.LIZLLL().LJIJI().LLILL(C497820Jfg.LIZIZ(this.LIZJ));
            this.LIZIZ.setPadding(iLLILL, 0, iLLILL, 0);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJL() {
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLJL();
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJLIIL() {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("PUBLISH");
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJJIJ();
        }
    }

    public final C1592340rXU LJJLI() {
        return (C1592340rXU) this.LJII.getValue();
    }

    public final boolean LJJLIIIJJIZ() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII() && C1395900mQe.LIZ(this.LIZIZ) != null;
    }

    public final void LJJLIIJ() {
        Iterator<T> it2 = this.LIZLLL.values().iterator();
        while (it2.hasNext()) {
            ((AbstractC1592930rYR) it2.next()).LJJI();
        }
    }

    public final void LJJLIL() {
        if (C1593730rZj.LIZIZ.LJJII()) {
            Iterator<T> it2 = this.LIZLLL.values().iterator();
            while (it2.hasNext()) {
                C1592950rYT c1592950rYT = ((AbstractC1592930rYR) it2.next()).LL;
                if ((c1592950rYT instanceof C1592950rYT) && c1592950rYT != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592950rYT);
                    c1592950rYT.setAlpha(1.0f);
                }
            }
        }
    }

    @Override // X.AbstractC1591090rVT
    public final Rect LJIIZILJ() {
        C1592340rXU c1592340rXULJJLI = LJJLI();
        c1592340rXULJJLI.getClass();
        Rect rect = new Rect();
        View viewLIZJ = c1592340rXULJJLI.LIZJ();
        if (viewLIZJ == null) {
            viewLIZJ = c1592340rXULJJLI.LIZ;
        }
        viewLIZJ.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // X.AbstractC1591090rVT
    public final String LJIJJLI() {
        return this.LJFF;
    }

    public C1592170rXD(C1591930rWp c1591930rWp) {
        this.LIZIZ = c1591930rWp;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c1591930rWp.getContext());
        if (c19egLIZIZ != null) {
            this.LIZJ = c19egLIZIZ;
            C1592340rXU c1592340rXULJJLI = LJJLI();
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1624);
            C1592370rXX c1592370rXXLIZJ = c1592340rXULJJLI.LIZJ();
            if (c1592370rXXLIZJ != null) {
                c1592370rXXLIZJ.setOnBreakPointChange(awS568S0100000_24);
            }
            this.LJIIIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1626));
            this.LJIIJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1625));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static boolean LJJLIIIJLJLI(String str) {
        if (!TextUtils.equals(str, "HOME")) {
            if ((!Intrinsics.LJFF(str, "FRIENDS_TAB") || C319860CgK.LIZ()) && !Intrinsics.LJFF(str, "Nearby") && !Intrinsics.LJFF(str, "Following") && !Intrinsics.LJFF(str, "Live") && !Intrinsics.LJFF(str, "Drama")) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1592830rYH
    public final void LIZIZ(EnumC1571190qzN enumC1571190qzN) {
        if (enumC1571190qzN == null) {
            return;
        }
        LJJJLZIJ(null, enumC1571190qzN);
    }

    @Override // X.InterfaceC1592830rYH
    public final void LJ(EnumC1571190qzN enumC1571190qzN) {
        boolean z;
        LJJLIL();
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("HOME");
        boolean z2 = true;
        if (abstractC1592930rYR != null && !abstractC1592930rYR.LJIJ()) {
            return;
        }
        LJJZ(C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LIZJ)).CQ2());
        if (enumC1571190qzN == EnumC1571190qzN.DARK) {
            z = true;
        } else {
            z = false;
        }
        LJIIJ(z);
        Iterator<T> it2 = this.LIZLLL.values().iterator();
        while (it2.hasNext()) {
            C1592950rYT c1592950rYT = ((AbstractC1592930rYR) it2.next()).LL;
            if ((c1592950rYT instanceof C1592950rYT) && c1592950rYT != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592950rYT);
                c1592950rYT.setAlpha(1.0f);
            }
        }
        LJJJLZIJ(null, enumC1571190qzN);
        if (C1581510rG1.LJ()) {
            if (enumC1571190qzN != EnumC1571190qzN.DARK) {
                z2 = false;
            }
            LJIILIIL(z2);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIIIZZ(ImageView imageView) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("USER");
        if (abstractC1592930rYR != null) {
            C1592950rYT c1592950rYT = abstractC1592930rYR.LL;
            ImageView imageView2 = c1592950rYT.LLJI;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                return;
            }
            TextView textView = c1592950rYT.LLJIJIL;
            if (textView != null && textView.getVisibility() == 0) {
                return;
            }
            c1592950rYT.LLJJI = true;
            c1592950rYT.LLIZ = imageView;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
                FrameLayout frameLayout = c1592950rYT.LLJJJJ;
                if (frameLayout != null) {
                    frameLayout.addView(imageView);
                }
            } else {
                c1592950rYT.addView(imageView);
            }
            ImageView imageView3 = c1592950rYT.LLILZLL;
            if (imageView3 != null) {
                C339190DRl.LIZIZ(imageView3);
            }
            ImageView imageView4 = c1592950rYT.LLJI;
            if (imageView4 == null) {
                return;
            }
            C339190DRl.LIZIZ(imageView4);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIJ(boolean z) {
        boolean z2;
        Integer numLIZJ;
        View viewFindViewById;
        View viewFindViewById2;
        if (C1584190rKL.LIZIZ() && C960203pA.LIZIZ(this.LIZJ)) {
            z2 = true;
        } else {
            z2 = false;
        }
        int height = -1;
        if (!z && !z2) {
            if (C1584190rKL.LIZIZ()) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZJ);
                if (c19egLIZIZ != null && (viewFindViewById2 = c19egLIZIZ.findViewById(R.id.ch3)) != null) {
                    height = viewFindViewById2.getHeight();
                }
                numLIZJ = (height <= 0 || Intrinsics.LJFF("HOME", C343710Ddh.LIZ(this.LIZJ).CQ2())) ? C1308910kAL.LIZJ(R.attr.c3, this.LIZJ) : C1308910kAL.LIZJ(R.attr.zm, (Context) this.LJIIIZ.getValue());
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.c3, this.LIZJ);
            }
        } else {
            numLIZJ = 0;
            if (C1584190rKL.LIZIZ()) {
                C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(this.LIZJ);
                if (c19egLIZIZ2 != null && (viewFindViewById = c19egLIZIZ2.findViewById(R.id.ch3)) != null) {
                    height = viewFindViewById.getHeight();
                }
                boolean zLJFF = Intrinsics.LJFF("HOME", C343710Ddh.LIZ(this.LIZJ).CQ2());
                if (height > 0 && !zLJFF) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.zm, (Context) this.LJIIJ.getValue());
                }
            }
        }
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            LJJLI().LIZ(iIntValue);
            View view = this.LJI;
            if (view != null) {
                view.setBackgroundColor(iIntValue);
            }
            C1586120rNS c1586120rNS = C1586120rNS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeBackground isDark: ");
            sbLIZ.append(z);
            sbLIZ.append(", color: ");
            sbLIZ.append(numLIZJ);
            sbLIZ.append(", isDarkMode: ");
            sbLIZ.append(C960203pA.LIZIZ(this.LIZJ));
            sbLIZ.append(", context: ");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", uiMode: ");
            sbLIZ.append(this.LIZJ.getResources().getConfiguration().uiMode);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1586120rNS.getClass();
            C1586120rNS.LIZIZ.LJIIIIZZ(null, "BottomTab", strLIZIZ);
            StringBuilder sb = C1592300rXQ.LIZLLL;
            sb.setLength(0);
            C1592300rXQ.LIZ = Boolean.valueOf(z);
            C1592300rXQ.LIZIZ = Integer.valueOf(iIntValue);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isDark: ");
            sbLIZ2.append(C1592300rXQ.LIZ);
            sbLIZ2.append(", tabBackgroundColor: ");
            sbLIZ2.append(C1592300rXQ.LIZIZ);
            sbLIZ2.append(';');
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIILIIL(boolean z) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("HOME");
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LIZLLL(z);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final InterfaceC1587260rPI LJIILL(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            C1592950rYT c1592950rYT = abstractC1592930rYR.LL;
            c1592950rYT.getAvatarLoadListener();
            return c1592950rYT;
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final int LJIJ(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            return abstractC1592930rYR.LLIZ;
        }
        return 0;
    }

    @Override // X.AbstractC1591090rVT
    public final View LJIJI(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            return abstractC1592930rYR.LL;
        }
        return null;
    }

    @Override // X.AbstractC1591090rVT
    public final boolean LJJI(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            return abstractC1592930rYR.LJIIZILJ();
        }
        return false;
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIFFI(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJIIJJI();
            abstractC1592930rYR.LL.setTabDotVisibility(8);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final boolean LJJII(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            return abstractC1592930rYR.LLILZLL;
        }
        return false;
    }

    @Override // X.AbstractC1591090rVT
    public final boolean LJJIII(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR == null || abstractC1592930rYR.LL.LLJJ == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1591090rVT
    public final boolean LJJIIJ(String str) {
        ImageView imageView;
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR == null || (imageView = abstractC1592930rYR.LL.LLJI) == null || imageView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIIZ(Fragment fragment) {
        ((C1395870mQb) LJJLI().LIZIZ.getValue()).LIZIZ();
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIIZI(String str) {
        boolean zLJI = MethodIDManager.LJI(72096);
        List<InterfaceC1583870rJp> listVy = HomeTabViewModel.LLILZIL.LIZ(this.LIZJ).vy();
        int size = listVy.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            InterfaceC1583870rJp interfaceC1583870rJp = (InterfaceC1583870rJp) ListProtector.get(listVy, i);
            if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), str)) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZJ);
                if (c19egLIZIZ == null) {
                    "Required value was null.".toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Required value was null.");
                    if (zLJI) {
                        MethodIDManager.LJ();
                        throw illegalArgumentException;
                    }
                    throw illegalArgumentException;
                }
                LJJLIIIJLLLLLLLZ(interfaceC1583870rJp, C486860J7k.LIZIZ(c19egLIZIZ), true);
            } else {
                i++;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC1591090rVT
    @InterfaceC1294060jmO
    public final void LJJIJ(String str) {
        PublishTabAbility publishTabAbilityLIZ;
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.BOTTOM_TAB);
        C1150504el.LIZ().LJIIIIZZ = false;
        C19EG c19eg = (C19EG) C1388190mED.LIZ(this.LIZJ);
        C486860J7k.LIZIZ(c19eg).LLJILLL.setValue(str);
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19eg);
        scrollSwitchStateManagerLIZIZ.getClass();
        boolean zLJI = MethodIDManager.LJI(71652);
        scrollSwitchStateManagerLIZIZ.LLJILJILJ.setValue(new Pair<>(str, Boolean.FALSE));
        if (zLJI) {
            MethodIDManager.LJ();
        }
        MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
        if (mainActivityScopeLIZJ != null && (publishTabAbilityLIZ = C1592280rXO.LIZ(mainActivityScopeLIZJ)) != null) {
            publishTabAbilityLIZ.Bn0();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJIIJIL(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null && !abstractC1592930rYR.LLILZLL) {
            abstractC1592930rYR.LLILZLL = true;
            abstractC1592930rYR.LJIL();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJIL(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null && abstractC1592930rYR.LLILZLL) {
            abstractC1592930rYR.LLILZLL = false;
            abstractC1592930rYR.LJJ();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIL(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJIILIIL();
            abstractC1592930rYR.LL.LJFF();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJ(String str) {
        C1559130qfv.LIZ(C1388190mED.LIZIZ(this.LIZJ), true);
        LJJJLZIJ(str, null);
        LJJLL(str);
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LIZJ));
        LJJJZ(tabChangeManagerLIZ.BQ2(), tabChangeManagerLIZ.CQ2());
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJ(String str) {
        EnumC1571190qzN enumC1571190qzN;
        EnumC1571190qzN enumC1571190qzN2;
        EnumC1571190qzN enumC1571190qzN3;
        if (C1585030rLh.LJIL()) {
            LJJLJLI(str);
            for (Map.Entry<String, AbstractC1592930rYR> entry : this.LIZLLL.entrySet()) {
                String key = entry.getKey();
                AbstractC1592930rYR value = entry.getValue();
                if (!Intrinsics.LJFF(key, "PUBLISH")) {
                    if (LJJLIIIJJI(str)) {
                        enumC1571190qzN3 = EnumC1571190qzN.DARK;
                    } else {
                        enumC1571190qzN3 = EnumC1571190qzN.LIGHT;
                    }
                    value.LJJIIZ(enumC1571190qzN3);
                }
            }
            LJJLL(str);
            return;
        }
        for (Map.Entry<String, AbstractC1592930rYR> entry2 : this.LIZLLL.entrySet()) {
            String key2 = entry2.getKey();
            AbstractC1592930rYR value2 = entry2.getValue();
            if (Intrinsics.LJFF(key2, str)) {
                value2.LJJIII();
            } else {
                value2.LJJIJIIJI();
            }
            if (((Number) C258620ABo.LIZ.getValue()).intValue() == 1) {
                if (LJJLIIIJJI(str)) {
                    enumC1571190qzN = EnumC1571190qzN.DARK;
                } else {
                    enumC1571190qzN = EnumC1571190qzN.LIGHT;
                }
                value2.LJJIIZ(enumC1571190qzN);
            } else if (!Intrinsics.LJFF(key2, "PUBLISH")) {
                if (LJJLIIIJJI(str)) {
                    enumC1571190qzN2 = EnumC1571190qzN.DARK;
                } else {
                    enumC1571190qzN2 = EnumC1571190qzN.LIGHT;
                }
                value2.LJJIIZ(enumC1571190qzN2);
            }
        }
        LJJLL(str);
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJI(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJJII();
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJIZL(float f) {
        TuxTextView tabTitleView;
        Iterator<T> it2 = this.LIZLLL.values().iterator();
        while (it2.hasNext()) {
            C1592950rYT c1592950rYT = ((AbstractC1592930rYR) it2.next()).LL;
            if ((c1592950rYT instanceof C1592950rYT) && c1592950rYT != null && (tabTitleView = c1592950rYT.getTabTitleView()) != null && tabTitleView.getTextSize() != f) {
                tabTitleView.setTextSize(0, f);
            }
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJJ(C996210c1z c996210c1z) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("SHOP_MALL");
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LL.setCustomViewAnimation$homepage_common_release(c996210c1z);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJZI(String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJIIJJI();
            abstractC1592930rYR.LL.setTabDotVisibility(0);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJLL(AbstractC2273051Dy3 abstractC2273051Dy3) {
        C1592950rYT c1592950rYT;
        ImageView imageView;
        ImageView imageView2;
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("SHOP_MALL");
        if (abstractC1592930rYR != null && (imageView = (c1592950rYT = abstractC1592930rYR.LL).LLILZLL) != null && (imageView2 = c1592950rYT.LLJJIJI) != null) {
            abstractC2273051Dy3.LIZLLL(imageView, imageView2);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJL(List<? extends InterfaceC1583870rJp> list) {
        int iLIZIZ;
        final C1592950rYT c1592950rYT;
        AbstractC1592930rYR c1592940rYS;
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ;
        if (C1585030rLh.LJIL()) {
            int i = C14LC.LJIILIIL;
            C1591930rWp c1591930rWp = this.LIZIZ;
            if (LJJLIIIJJIZ()) {
                iLIZIZ = -1;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iLIZIZ);
            layoutParams.gravity = 8388691;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1591930rWp);
            c1591930rWp.setLayoutParams(layoutParams);
            if (C309690CBz.LIZ.LJ.LIZJ == null) {
                HandlerHook.viewPost(this.LIZIZ, new ARunnableS124S0100000_24(this, 90));
            }
            this.LIZIZ.setPadding(0, 0, 0, 0);
            this.LIZIZ.setOrientation(0);
            if (this.LIZIZ.getChildCount() > 0) {
                C1591930rWp c1591930rWp2 = this.LIZIZ;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1591930rWp2, null);
                c1591930rWp2.removeAllViews();
            }
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            if (i == C14LC.LJIIJ) {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
                iLIZIZ2 = 0;
            }
            if (LJJLIIIJJIZ()) {
                iLIZIZ2 = 0;
                iLIZIZ3 = 0;
            }
            int i2 = 0;
            for (InterfaceC1583870rJp interfaceC1583870rJp : list) {
                int i3 = i2 + 1;
                View viewLJI = interfaceC1583870rJp.LJI(C1592310rXR.LIZ);
                if ((viewLJI instanceof C1592950rYT) && (c1592950rYT = (C1592950rYT) viewLJI) != null) {
                    C993790by5.LIZ(c1592950rYT, EnumC993780by4.BOTTOM_TAB_VIEW);
                    C1586120rNS.LIZ(C1586120rNS.LIZ, this.LJ, "updateViewExpWithVirtualItem current bottom tab tag:" + interfaceC1583870rJp.tag() + ", title:" + interfaceC1583870rJp.LIZLLL());
                    if (C285090BFj.LJIIIIZZ()) {
                        c1592940rYS = c1592950rYT.getIconTabLogic();
                        if (c1592940rYS == null) {
                            if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "PUBLISH")) {
                                C1592100rX6.LIZ.getClass();
                                c1592940rYS = C1592100rX6.LIZ(c1592950rYT);
                            } else {
                                Intrinsics.LJFF(interfaceC1583870rJp.tag(), "HOME");
                                if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "Nearby")) {
                                    c1592940rYS = new C1592990rYX(c1592950rYT);
                                } else if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "NOTIFICATION")) {
                                    c1592940rYS = new C1592210rXH(c1592950rYT);
                                } else if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "SHOP_MALL")) {
                                    c1592940rYS = new C1592980rYW(c1592950rYT);
                                } else if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "FRIENDS_TAB") && C1591220rVg.LIZ()) {
                                    c1592940rYS = new C1592200rXG(c1592950rYT);
                                } else {
                                    C1593730rZj c1593730rZj = C1593730rZj.LIZIZ;
                                    if (c1593730rZj.LIZIZ(c1592950rYT, interfaceC1583870rJp.tag()) instanceof AbstractC1592930rYR) {
                                        c1592940rYS = (AbstractC1592930rYR) c1593730rZj.LIZIZ(c1592950rYT, interfaceC1583870rJp.tag());
                                    } else if (interfaceC1583870rJp.LJIIIZ()) {
                                        c1592940rYS = new AbstractC1592930rYR(c1592950rYT, this) { // from class: X.0rXd
                                            public final InterfaceC1592420rXc LLJJ;

                                            @Override // X.AbstractC1592930rYR
                                            public final void LIZJ(int i4, boolean z) {
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final ImageView LJI() {
                                                return null;
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final ImageView LJII() {
                                                return null;
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final ImageView LJIIIIZZ() {
                                                return null;
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final ImageView LJIIIZ() {
                                                return null;
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final TuxTextView LJIIJ() {
                                                return null;
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJIJI() {
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJIJJ() {
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJIJJLI() {
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJJI() {
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJJIIZ(EnumC1571190qzN enumC1571190qzN) {
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJJIJ() {
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final boolean LJJIJIIJIL(EnumC1593030rYb enumC1593030rYb, EnumC1571190qzN enumC1571190qzN, boolean z) {
                                                return false;
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJJIJIL() {
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJJIII() {
                                                this.LLJJ.LIZJ();
                                            }

                                            @Override // X.AbstractC1592930rYR
                                            public final void LJJIJIIJI() {
                                                this.LLJJ.LIZLLL();
                                            }

                                            {
                                                this.LLJJ = this;
                                            }
                                        };
                                    } else {
                                        c1592940rYS = new C1592940rYS(c1592950rYT);
                                    }
                                }
                            }
                        }
                    } else if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "PUBLISH")) {
                        C1592100rX6.LIZ.getClass();
                        c1592940rYS = C1592100rX6.LIZ(c1592950rYT);
                    } else {
                        Intrinsics.LJFF(interfaceC1583870rJp.tag(), "HOME");
                        if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "Nearby")) {
                            c1592940rYS = new C1592990rYX(c1592950rYT);
                        } else if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "NOTIFICATION")) {
                            c1592940rYS = new C1592210rXH(c1592950rYT);
                        } else if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "SHOP_MALL")) {
                            c1592940rYS = new C1592980rYW(c1592950rYT);
                        } else if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "FRIENDS_TAB") && C1591220rVg.LIZ()) {
                            c1592940rYS = new C1592200rXG(c1592950rYT);
                        } else {
                            C1593730rZj c1593730rZj2 = C1593730rZj.LIZIZ;
                            if (c1593730rZj2.LIZIZ(c1592950rYT, interfaceC1583870rJp.tag()) instanceof AbstractC1592930rYR) {
                                c1592940rYS = (AbstractC1592930rYR) c1593730rZj2.LIZIZ(c1592950rYT, interfaceC1583870rJp.tag());
                            } else if (interfaceC1583870rJp.LJIIIZ()) {
                                c1592940rYS = new AbstractC1592930rYR(c1592950rYT, this) { // from class: X.0rXd
                                    public final InterfaceC1592420rXc LLJJ;

                                    @Override // X.AbstractC1592930rYR
                                    public final void LIZJ(int i4, boolean z) {
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final ImageView LJI() {
                                        return null;
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final ImageView LJII() {
                                        return null;
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final ImageView LJIIIIZZ() {
                                        return null;
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final ImageView LJIIIZ() {
                                        return null;
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final TuxTextView LJIIJ() {
                                        return null;
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJIJI() {
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJIJJ() {
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJIJJLI() {
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJJI() {
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJJIIZ(EnumC1571190qzN enumC1571190qzN) {
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJJIJ() {
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final boolean LJJIJIIJIL(EnumC1593030rYb enumC1593030rYb, EnumC1571190qzN enumC1571190qzN, boolean z) {
                                        return false;
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJJIJIL() {
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJJIII() {
                                        this.LLJJ.LIZJ();
                                    }

                                    @Override // X.AbstractC1592930rYR
                                    public final void LJJIJIIJI() {
                                        this.LLJJ.LIZLLL();
                                    }

                                    {
                                        this.LLJJ = this;
                                    }
                                };
                            } else {
                                c1592940rYS = new C1592940rYS(c1592950rYT);
                            }
                        }
                    }
                    LJJLJ(interfaceC1583870rJp, c1592940rYS);
                    this.LIZLLL.put(interfaceC1583870rJp.tag(), c1592940rYS);
                    HomeTabViewModel.LLILZIL.LIZ(this.LIZJ).LLILLJJLI.put(interfaceC1583870rJp.tag(), interfaceC1583870rJp);
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZJ);
                    if (c19egLIZIZ != null) {
                        scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19egLIZIZ);
                    } else {
                        scrollSwitchStateManagerLIZIZ = null;
                    }
                    if (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "USER") && C1586440rNy.LIZ()) {
                        c1592950rYT.setOnLongClickListener(new ViewOnLongClickListenerC785900UsG(scrollSwitchStateManagerLIZIZ, interfaceC1583870rJp, 0));
                    }
                    C786410Ut5.G7(c1592950rYT, new ACListenerS88S0300000_24(interfaceC1583870rJp, scrollSwitchStateManagerLIZIZ, this, 3));
                    C2271391DvN.LIZ(c1592950rYT, (C1A5L) C2271381DvM.LJJJ.getValue());
                    if (!Intrinsics.LJFF(interfaceC1583870rJp.tag(), "PUBLISH") || (Intrinsics.LJFF(interfaceC1583870rJp.tag(), "PUBLISH") && ((ICoinService) ServiceManager.get().getService(ICoinService.class)).LJIJJ())) {
                        if (C1592440rXe.LIZ < 0) {
                            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "bottom_tab_animation_optimization", true);
                            C1592440rXe.LIZ = iLJIJ;
                            if (iLJIJ < 0) {
                                C1592440rXe.LIZ = 0;
                            }
                        }
                        int i4 = C1592440rXe.LIZ;
                        if (i4 != 1) {
                            if (i4 < 0) {
                                int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "bottom_tab_animation_optimization", true);
                                C1592440rXe.LIZ = iLJIJ2;
                                if (iLJIJ2 < 0) {
                                    C1592440rXe.LIZ = 0;
                                }
                            }
                            if (C1592440rXe.LIZ != 2) {
                                try {
                                    Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.LIZJ, R.drawable.bud);
                                    if (drawableLIZIZ != null) {
                                        c1592950rYT.setBackground(drawableLIZIZ);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                        c1592950rYT.setPadding(0, iLIZIZ2, 0, iLIZIZ3);
                    }
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
                    layoutParams2.weight = 1.0f;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592950rYT);
                    c1592950rYT.setLayoutParams(layoutParams2);
                    LJJLIIIJILLIZJL(c1592950rYT, i2, interfaceC1583870rJp.tag());
                    if (!interfaceC1583870rJp.LJIIIZ()) {
                        this.LIZIZ.addView(c1592950rYT);
                    }
                }
                i2 = i3;
            }
            String strCQ2 = C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LIZJ)).CQ2();
            if (strCQ2 == null) {
                strCQ2 = "HOME";
            }
            if (!Intrinsics.LJFF(strCQ2, "HOME")) {
                AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("HOME");
                if (abstractC1592930rYR != null) {
                    abstractC1592930rYR.LJJIJIIJI();
                }
                AbstractC1592930rYR abstractC1592930rYR2 = this.LIZLLL.get(strCQ2);
                if (abstractC1592930rYR2 != null) {
                    abstractC1592930rYR2.LJJIII();
                }
                LJJJLZIJ(strCQ2, null);
                LJJLL(strCQ2);
            }
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFII()) {
                LJJZ(strCQ2);
                LJIIJ(LJJLIIIJJI(strCQ2));
            }
            C1592050rX1.LIZ(new C1592070rX3());
            return;
        }
        if (C1601090rlb.LIZIZ() && C0X35.LJIIL("optimize_boot_perf_delay_tab_ui_bottom")) {
            C704270Rjt.LIZ(new ARunnableS93S0200000_24(this, list, 37));
        } else if (C1601090rlb.LIZLLL()) {
            C0CN5.LIZJ(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), new ARunnableS93S0200000_24(this, list, 38), false);
        } else {
            LJJZZI(list);
        }
    }

    public final boolean LJJLIIIJJI(String str) {
        boolean z;
        boolean z2;
        boolean zCI;
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        if (Intrinsics.LJFF(str, "HOME")) {
            z = true;
        } else {
            z = false;
        }
        if ((!Intrinsics.LJFF(str, "FRIENDS_TAB") || C319860CgK.LIZ()) && ((!Intrinsics.LJFF(str, "Nearby") || !((INearbyFeedService) ServiceManager.get().getService(INearbyFeedService.class)).LIZ()) && !Intrinsics.LJFF(str, "Live"))) {
            z2 = false;
        } else {
            z2 = true;
        }
        C128Y c128yBQ2 = C343710Ddh.LIZ(this.LIZJ).BQ2();
        if ((c128yBQ2 instanceof InterfaceC1593630rZZ) && (interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yBQ2) != null) {
            zCI = interfaceC1593630rZZ.CI(35);
        } else {
            zCI = false;
        }
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        String str2 = this.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isDarkBgStyleTab: home:");
        sbLIZ.append(z);
        sbLIZ.append(", explore:");
        sbLIZ.append(zCI);
        sbLIZ.append(", isInSecondTab: ");
        sbLIZ.append(z2);
        C1586120rNS.LIZ(c1586120rNS, str2, C2188811AlT.LIZIZ(sbLIZ));
        if ((z && !zCI) || z2) {
            return true;
        }
        return false;
    }

    public final void LJJLJLI(String str) {
        for (Map.Entry<String, AbstractC1592930rYR> entry : this.LIZLLL.entrySet()) {
            String key = entry.getKey();
            AbstractC1592930rYR value = entry.getValue();
            if (!Intrinsics.LJFF(key, str)) {
                value.LJJIJIIJI();
            }
        }
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LJJIII();
        }
    }

    public final void LJJLL(String str) {
        AbstractC1592930rYR abstractC1592930rYR;
        AbstractC1592930rYR abstractC1592930rYR2;
        LJJZ(str);
        if (!LJJLIIIJJI(str)) {
            boolean z = C14LC.LJIIIZ;
            if (C309690CBz.LIZ.LJFF) {
                LJIIJ(false);
                LJJLIIJ();
                if (str != null && (abstractC1592930rYR2 = this.LIZLLL.get(str)) != null) {
                    abstractC1592930rYR2.LIZLLL(false);
                }
                boolean z2 = C1592300rXQ.LIZJ;
                StringBuilder sb = C1592300rXQ.LIZLLL;
                if (z2) {
                    C1AF0.LJFF(new Throwable("BottomTabStyleException"), sb.toString());
                    C1592300rXQ.LIZJ = false;
                }
                sb.setLength(0);
                return;
            }
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLJL();
        LJIIJ(LJJLIIIJJI(str));
        LJJLIIJ();
        if (str != null && (abstractC1592930rYR = this.LIZLLL.get(str)) != null) {
            abstractC1592930rYR.LIZLLL(LJJLIIIJJI(str));
        }
        boolean z3 = C1592300rXQ.LIZJ;
        StringBuilder sb2 = C1592300rXQ.LIZLLL;
        if (z3) {
            C1AF0.LJFF(new Throwable("BottomTabStyleException"), sb2.toString());
            C1592300rXQ.LIZJ = false;
        }
        sb2.setLength(0);
    }

    public final void LJJZ(String str) {
        EnumC1592360rXW enumC1592360rXW;
        InterfaceC1616480sAQ interfaceC1616480sAQLJIJI = C19252910Tv.LIZIZ.LIZLLL().LJIJI();
        if (!interfaceC1616480sAQLJIJI.LLFII()) {
            return;
        }
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LIZJ));
        String strCQ2 = tabChangeManagerLIZ.CQ2();
        if (str == null) {
            str = strCQ2;
        }
        boolean zLIZLLL = LJJLI().LIZLLL();
        boolean zLJJLIIIJL = LJJLIIIJL(tabChangeManagerLIZ.BQ2(), str);
        if (interfaceC1616480sAQLJIJI.LLLIIII() && zLJJLIIIJL && !zLIZLLL) {
            enumC1592360rXW = EnumC1592360rXW.FLOAT;
        } else {
            enumC1592360rXW = EnumC1592360rXW.COMPACT;
        }
        LJJLI().LIZIZ(enumC1592360rXW);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ae  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZI(java.util.List<? extends X.InterfaceC1583870rJp> r19) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592170rXD.LJJZZI(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJJLIIIJL(Fragment fragment, String str) {
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        boolean z = false;
        if (!LJJLIIIJLJLI(str)) {
            return false;
        }
        if (!TextUtils.equals(str, "HOME")) {
            return true;
        }
        if ((fragment instanceof InterfaceC1593630rZZ) && (interfaceC1593630rZZ = (InterfaceC1593630rZZ) fragment) != null && interfaceC1593630rZZ.lm()) {
            z = true;
        }
        return !z;
    }

    @Override // X.InterfaceC1592830rYH
    public final void LIZ(int i, Float f) {
        if (f != null) {
            Iterator<T> it2 = this.LIZLLL.values().iterator();
            while (it2.hasNext()) {
                C1592950rYT c1592950rYT = ((AbstractC1592930rYR) it2.next()).LL;
                if ((c1592950rYT instanceof C1592950rYT) && c1592950rYT != null) {
                    float fFloatValue = f.floatValue();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592950rYT);
                    c1592950rYT.setAlpha(fFloatValue);
                }
            }
        }
        LJJLI().LIZ(i);
        View view = this.LJI;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJI(AvatarComponentView avatarComponentView, String str) {
        AvatarComponentView avatarComponentView2;
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null && (avatarComponentView2 = (AvatarComponentView) C1595430rcT.LIZIZ.LIZIZ().addTabAvatarView(avatarComponentView)) != null) {
            C1592950rYT c1592950rYT = abstractC1592930rYR.LL;
            if (c1592950rYT.LLJJ == null) {
                c1592950rYT.LLJJ = avatarComponentView2;
                if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
                    FrameLayout frameLayout = c1592950rYT.LLJJJJ;
                    if (frameLayout != null) {
                        frameLayout.addView(avatarComponentView2);
                    }
                } else {
                    c1592950rYT.addView(avatarComponentView2);
                }
                c1592950rYT.LJ();
            }
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJII(UrlModel urlModel, String str) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            C1592950rYT c1592950rYT = abstractC1592930rYR.LL;
            if (c1592950rYT.LLJILLL != null) {
                View currentAvatarView = c1592950rYT.getCurrentAvatarView();
                if (currentAvatarView != null) {
                    C337180DJs.LIZJ(currentAvatarView);
                }
                ImageView imageView = c1592950rYT.LLILZLL;
                if (imageView != null) {
                    C337180DJs.LIZJ(imageView);
                }
                c1592950rYT.LIZLLL(urlModel);
                return;
            }
            ImageView imageViewLJII = abstractC1592930rYR.LJII();
            if (imageViewLJII == null) {
                return;
            }
            C1595430rcT.LIZIZ.LIZIZ().addTabAvatarView(imageViewLJII);
            C1592950rYT c1592950rYT2 = abstractC1592930rYR.LL;
            if (c1592950rYT2.LLJILLL != null) {
                return;
            }
            c1592950rYT2.LLJILLL = imageViewLJII;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
                FrameLayout frameLayout = c1592950rYT2.LLJJJJ;
                if (frameLayout != null) {
                    frameLayout.addView(imageViewLJII);
                }
            } else {
                c1592950rYT2.addView(imageViewLJII);
            }
            C786410Ut5.V4(imageViewLJII, 0.0f);
            c1592950rYT2.LIZLLL(urlModel);
            c1592950rYT2.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    @Override // X.AbstractC1591090rVT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C19EG r12, android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592170rXD.LJIIIZ(X.19EG, android.view.View):void");
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIJJI(int i, String str) {
        LJIIL(i, str, false);
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIIJZLJL(C19EG c19eg, Configuration configuration) {
        ((C1395870mQb) LJJLI().LIZIZ.getValue()).LJ();
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJIJL(UserNewContent userNewContent, String str) {
        FriendsRedDotUser user;
        String str2;
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null && (user = userNewContent.getUser()) != null && (str2 = user.uid) != null) {
            AvatarComponentView avatarComponentView = abstractC1592930rYR.LL.getAvatarComponentView();
            C337180DJs.LIZIZ(avatarComponentView);
            abstractC1592930rYR.LL.setTabIconVisibility(0);
            C1595430rcT.LIZIZ.LIZIZ().refreshTabAvatarView(abstractC1592930rYR.LL.getAvatarComponentView(), userNewContent.isStory());
            if (avatarComponentView != null) {
                C0S1B.LIZ(avatarComponentView, str2, userNewContent, ProcessLifecycleOwner.Companion.get(), false, AFwS264S0000000_24.get$arr$(12), 24);
            }
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJLL(boolean z, boolean z2) {
        float f;
        C1592340rXU c1592340rXULJJLI = LJJLI();
        c1592340rXULJJLI.getClass();
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        View viewLIZJ = c1592340rXULJJLI.LIZJ();
        if (viewLIZJ == null) {
            viewLIZJ = c1592340rXULJJLI.LIZ;
        }
        if (z2) {
            C2180521AVm.LIZ(viewLIZJ, EnumC2180541AVo.V_ALPHA, C1AV3.LIZ(1, "Feed", Boolean.TRUE, "bottomtab_logic"));
            C679360Qko.LIZ(viewLIZJ.getAlpha(), f, viewLIZJ);
        } else {
            C2180521AVm.LIZ(viewLIZJ, EnumC2180541AVo.V_ALPHA, C1AV3.LIZ(2, "Feed", null, "bottomtab_logic"));
            C786410Ut5.T4(viewLIZJ, f);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJZ(int i, C1AV2 c1av2) {
        C1592340rXU c1592340rXULJJLI = LJJLI();
        View viewLIZJ = c1592340rXULJJLI.LIZJ();
        if (viewLIZJ == null) {
            viewLIZJ = c1592340rXULJJLI.LIZ;
        }
        C2180521AVm.LIZLLL(viewLIZJ, i, c1av2);
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJLZIJ(String str, EnumC1571190qzN enumC1571190qzN) {
        EnumC1571190qzN enumC1571190qzN2;
        EnumC1592360rXW enumC1592360rXW;
        if (enumC1571190qzN == null) {
            if (LJJLIIIJJI(str)) {
                enumC1571190qzN2 = EnumC1571190qzN.DARK;
            } else {
                enumC1571190qzN2 = EnumC1571190qzN.LIGHT;
            }
        } else {
            enumC1571190qzN2 = enumC1571190qzN;
        }
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        String str2 = this.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateIconBackgroundStyle toTag: ");
        sbLIZ.append(str);
        sbLIZ.append(", style: ");
        sbLIZ.append(enumC1571190qzN2);
        C1586120rNS.LIZ(c1586120rNS, str2, C2188811AlT.LIZIZ(sbLIZ));
        Iterator<T> it2 = this.LIZLLL.values().iterator();
        while (it2.hasNext()) {
            ((AbstractC1592930rYR) it2.next()).LJJIIZ(enumC1571190qzN2);
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        c19252910Tv.LIZLLL().LJIJI().LLLJL();
        if (enumC1571190qzN != null) {
            InterfaceC1616480sAQ interfaceC1616480sAQLJIJI = c19252910Tv.LIZLLL().LJIJI();
            if (interfaceC1616480sAQLJIJI.LLFII()) {
                boolean zLIZLLL = LJJLI().LIZLLL();
                String strCQ2 = C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LIZJ)).CQ2();
                boolean zLLLIIII = interfaceC1616480sAQLJIJI.LLLIIII();
                boolean z = false;
                if (zLLLIIII && enumC1571190qzN2 == EnumC1571190qzN.DARK && LJJLIIIJLJLI(strCQ2) && !zLIZLLL) {
                    enumC1592360rXW = EnumC1592360rXW.FLOAT;
                } else {
                    enumC1592360rXW = EnumC1592360rXW.COMPACT;
                }
                LJJLI().LIZIZ(enumC1592360rXW);
                if (enumC1571190qzN2 == EnumC1571190qzN.DARK) {
                    z = true;
                }
                LJIIJ(z);
            }
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJZ(Fragment fragment, String str) {
        C19EG activity;
        if (str != null && str.length() != 0) {
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                activity = null;
            }
            IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
            if (activity != null && C960203pA.LIZIZ(activity)) {
                C1360720lVu.LIZ(activity);
                if (iMainService != null) {
                    iMainService.changeStatusBarMainTab(activity, "HOME");
                }
                C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                String str2 = this.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateSystemBarTheme navigationBarDark bottomTabTag:");
                sbLIZ.append(str);
                sbLIZ.append(", bottomTabFragment:");
                sbLIZ.append(fragment);
                sbLIZ.append(' ');
                C1586120rNS.LIZ(c1586120rNS, str2, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (iMainService != null) {
                iMainService.changeStatusBarMainTab(activity, str);
            }
            if (LJJLIIIJL(fragment, str)) {
                if (activity != null) {
                    C1360720lVu.LIZ(activity);
                }
                C1586120rNS c1586120rNS2 = C1586120rNS.LIZ;
                String str3 = this.LJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateSystemBarTheme bottom2Tab navigationBarDark bottomTabTag:");
                sbLIZ2.append(str);
                sbLIZ2.append(", bottomTabFragment:");
                sbLIZ2.append(fragment);
                sbLIZ2.append(' ');
                C1586120rNS.LIZ(c1586120rNS2, str3, C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            if (activity != null) {
                C1360720lVu.LIZIZ(activity);
            }
            if (iMainService != null) {
                iMainService.changeStatusBarMainTab(activity, "USER");
            }
            C1586120rNS c1586120rNS3 = C1586120rNS.LIZ;
            String str4 = this.LJ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateSystemBarTheme otherTab navigationBarAutoColor bottomTabTag:");
            sbLIZ3.append(str);
            sbLIZ3.append(", bottomTabFragment:");
            sbLIZ3.append(fragment);
            sbLIZ3.append(' ');
            C1586120rNS.LIZ(c1586120rNS3, str4, C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public final void LJJLIIIJ(C1592950rYT c1592950rYT, InterfaceC1583870rJp interfaceC1583870rJp) {
        AbstractC1592930rYR abstractC1592930rYRLIZ;
        if (C285090BFj.LJIIIIZZ()) {
            c1592950rYT.getIconTabLogic();
            C1592100rX6.LIZ.getClass();
            abstractC1592930rYRLIZ = C1592100rX6.LIZ(c1592950rYT);
        } else {
            C1592100rX6.LIZ.getClass();
            abstractC1592930rYRLIZ = C1592100rX6.LIZ(c1592950rYT);
        }
        LJJLJ(interfaceC1583870rJp, abstractC1592930rYRLIZ);
        this.LIZLLL.put(interfaceC1583870rJp.tag(), abstractC1592930rYRLIZ);
    }

    public final void LJJLJ(InterfaceC1583870rJp interfaceC1583870rJp, AbstractC1592930rYR abstractC1592930rYR) {
        String key;
        ITabIconService iTabIconService;
        C592330NLb c592330NLbLIZJ;
        ITabIconService iTabIconService2 = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
        if (iTabIconService2 != null && iTabIconService2.LJII()) {
            String strTag = interfaceC1583870rJp.tag();
            C1584320rKY.LIZ.getClass();
            EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(strTag);
            if (enumC1584360rKcLJIIIIZZ != null && (key = enumC1584360rKcLJIIIIZZ.getKey()) != null && (iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null)) != null && (c592330NLbLIZJ = iTabIconService.LIZJ(EnumC592410NLj.BOTTOM, key, strTag)) != null) {
                C1593020rYa c1593020rYa = abstractC1592930rYR.LLILZ;
                abstractC1592930rYR.LJJIIJZLJL(this.LIZJ, c592330NLbLIZJ, new C1592290rXP(C1593140rYm.LIZ(c1593020rYa.LIZLLL.LIZ, c592330NLbLIZJ.LJ.LIZ), C1593140rYm.LIZ(c1593020rYa.LIZLLL.LIZIZ, c592330NLbLIZJ.LJ.LIZIZ), C1593140rYm.LIZ(c1593020rYa.LIZLLL.LIZJ, c592330NLbLIZJ.LJ.LIZJ), C1593140rYm.LIZ(c1593020rYa.LIZLLL.LIZLLL, c592330NLbLIZJ.LJ.LIZLLL), (Integer) null, 48), new Pair(Integer.valueOf((int) c592330NLbLIZJ.LJFF.LIZ), Integer.valueOf((int) c592330NLbLIZJ.LJFF.LIZIZ)));
                return;
            }
            return;
        }
        interfaceC1583870rJp.LIZJ(this.LIZJ, new C1592130rX9(abstractC1592930rYR, this), new C1592140rXA(abstractC1592930rYR, this));
    }

    public static void LJJLIIIJILLIZJL(C1592950rYT c1592950rYT, final int i, String str) {
        String string;
        CharSequence text;
        if (Intrinsics.LJFF(str, "PUBLISH")) {
            c1592950rYT.setContentDescription(C20642515q3.LJI(2131829283));
            q0.LJIJ(c1592950rYT, new C20094213jo() { // from class: X.0rXN
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                    accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZIZ(0, i, false));
                }
            });
            return;
        }
        TuxTextView tabTitleView = c1592950rYT.getTabTitleView();
        if (tabTitleView != null && (text = tabTitleView.getText()) != null) {
            string = text.toString();
        } else {
            string = null;
        }
        c1592950rYT.setContentDescription(string);
        final String strLJI = C20642515q3.LJI(2131823349);
        q0.LJIJ(c1592950rYT, new C20094213jo() { // from class: X.0rXL
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setRoleDescription(strLJI);
                accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZIZ(0, i, false));
            }
        });
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIIL(int i, String str, boolean z) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get(str);
        if (abstractC1592930rYR != null) {
            abstractC1592930rYR.LIZJ(i, z);
        }
    }

    @Override // X.AbstractC1591090rVT
    public final void LJIILJJIL(String str, String str2, boolean z) {
        AbstractC1592930rYR abstractC1592930rYR;
        AbstractC1592930rYR abstractC1592930rYR2;
        String str3 = "HOME";
        if (C1585030rLh.LJIL()) {
            if (str2 != null) {
                str3 = str2;
            }
            if (!(this.LIZLLL.get(str3) instanceof C1592430rXd)) {
                this.LJFF = str3;
            }
            C1586120rNS c1586120rNS = C1586120rNS.LIZ;
            String str4 = this.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doChangeTabExpWithVirtualTabs last ");
            sbLIZ.append(str3);
            sbLIZ.append(", to:");
            sbLIZ.append(str);
            sbLIZ.append(", from:");
            sbLIZ.append(str2);
            C1586120rNS.LIZ(c1586120rNS, str4, C2188811AlT.LIZIZ(sbLIZ));
            if (!Intrinsics.LJFF(str, str3) && !Intrinsics.LJFF(str, "PUBLISH")) {
                if (Intrinsics.LJFF(str, "FRIENDS_TAB") && (abstractC1592930rYR2 = this.LIZLLL.get(str)) != null) {
                    abstractC1592930rYR2.LJIILIIL();
                    abstractC1592930rYR2.LL.LJFF();
                }
                C0CXE.LIZ.getClass();
                if (C0CXE.LIZ()) {
                    LJJLJLI(str);
                } else {
                    AbstractC1592930rYR abstractC1592930rYR3 = this.LIZLLL.get(str3);
                    if (abstractC1592930rYR3 != null) {
                        abstractC1592930rYR3.LJJIJIIJI();
                    }
                    AbstractC1592930rYR abstractC1592930rYR4 = this.LIZLLL.get(str);
                    if (abstractC1592930rYR4 != null) {
                        abstractC1592930rYR4.LJJIII();
                    }
                }
                LJJJLZIJ(str, null);
                LJJLL(str);
                LJJLIL();
                return;
            }
            return;
        }
        if (str2 != null) {
            str3 = str2;
        }
        C1586120rNS c1586120rNS2 = C1586120rNS.LIZ;
        String str5 = this.LJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("doChangeTabOnline last ");
        sbLIZ2.append(str3);
        sbLIZ2.append(", to:");
        sbLIZ2.append(str);
        sbLIZ2.append(", from:");
        sbLIZ2.append(str2);
        C1586120rNS.LIZ(c1586120rNS2, str5, C2188811AlT.LIZIZ(sbLIZ2));
        if (Intrinsics.LJFF(str, str3) || Intrinsics.LJFF(str, "PUBLISH")) {
            return;
        }
        AbstractC1592930rYR abstractC1592930rYR5 = this.LIZLLL.get(str);
        if (abstractC1592930rYR5 != null) {
            abstractC1592930rYR5.LJJIII();
        }
        C0CXE.LIZ.getClass();
        if (C0CXE.LIZ()) {
            for (Object obj : this.LIZLLL.keySet()) {
                if (!Intrinsics.LJFF(str, obj) && (abstractC1592930rYR = this.LIZLLL.get(obj)) != null) {
                    abstractC1592930rYR.LJJIJIIJI();
                }
            }
        } else {
            AbstractC1592930rYR abstractC1592930rYR6 = this.LIZLLL.get(str3);
            if (abstractC1592930rYR6 != null) {
                abstractC1592930rYR6.LJJIJIIJI();
                if (abstractC1592930rYR6.LLILZLL) {
                    abstractC1592930rYR6.LLILZLL = false;
                    abstractC1592930rYR6.LJJ();
                }
            }
        }
        LJJJLZIJ(str, null);
        LJJLL(str);
        LJJLIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIIJ(android.view.View r21, X.InterfaceC1583870rJp r22, com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r23) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1592170rXD.LJJLIIIIJ(android.view.View, X.0rJp, com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager):void");
    }

    public final void LJJLIIIJLLLLLLLZ(InterfaceC1583870rJp interfaceC1583870rJp, ScrollSwitchStateManager scrollSwitchStateManager, boolean z) {
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.BOTTOM_TAB);
        C1150504el.LIZ().LJIIIIZZ = false;
        if (!z) {
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            String value = EnumC1589910rTZ.CLICK_BOTTOM_ICON.getValue();
            c1584320rKY.getClass();
            C1584320rKY.LJ = value;
        }
        scrollSwitchStateManager.LLJILLL.setValue(interfaceC1583870rJp.tag());
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            tabSwitchMetricServiceLIZ.LJII();
            TabChangeManager tabChangeManagerLIZ = this.LJIIJJI;
            if (tabChangeManagerLIZ == null) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZJ);
                if (c19egLIZIZ != null) {
                    tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZIZ);
                } else {
                    tabChangeManagerLIZ = null;
                }
                this.LJIIJJI = tabChangeManagerLIZ;
            }
            C1593210rYt.LIZIZ(tabChangeManagerLIZ, interfaceC1583870rJp.tag());
        }
        String strTag = interfaceC1583870rJp.tag();
        boolean zLJI = MethodIDManager.LJI(71652);
        scrollSwitchStateManager.LLJILJILJ.setValue(new Pair<>(strTag, Boolean.valueOf(z)));
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        String str = this.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performTabClick, curtag:");
        sbLIZ.append(interfaceC1583870rJp.tag());
        sbLIZ.append(", isMocked:");
        sbLIZ.append(z);
        C1586120rNS.LIZ(c1586120rNS, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1591090rVT
    public final void LJJJJLI(Drawable drawable, AbstractC2273051Dy3 abstractC2273051Dy3, FrameLayout.LayoutParams layoutParams, ImageView.ScaleType scaleType) {
        AbstractC1592930rYR abstractC1592930rYR = this.LIZLLL.get("SHOP_MALL");
        if (abstractC1592930rYR != null) {
            C1592950rYT c1592950rYT = abstractC1592930rYR.LL;
            ImageView imageView = c1592950rYT.LLJJIJI;
            if (imageView != null) {
                imageView.clearAnimation();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1592950rYT, imageView);
                c1592950rYT.removeView(imageView);
                c1592950rYT.LLJJIJI = null;
            }
            ImageView imageView2 = c1592950rYT.LLILZLL;
            if (imageView2 != null) {
                imageView2.clearAnimation();
                C786410Ut5.LJZI(0, imageView2);
            }
            ImageView customIconView$homepage_common_release = abstractC1592930rYR.LL.getCustomIconView$homepage_common_release();
            if (customIconView$homepage_common_release != null) {
                if (layoutParams != null) {
                    C786410Ut5.c6(customIconView$homepage_common_release, layoutParams);
                }
            } else {
                customIconView$homepage_common_release = new ImageView(abstractC1592930rYR.LL.getContext());
                if (scaleType == null) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                }
                customIconView$homepage_common_release.setScaleType(scaleType);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                if ((C303940Bvk.LIZ() && !C303950Bvl.LIZ()) || C14LC.LJIIL) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                }
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
                    layoutParams.gravity = 49;
                }
                C786410Ut5.c6(customIconView$homepage_common_release, layoutParams);
                C786410Ut5.LJZI(8, customIconView$homepage_common_release);
                abstractC1592930rYR.LL.addView(customIconView$homepage_common_release);
            }
            customIconView$homepage_common_release.setImageDrawable(drawable);
            C1592950rYT c1592950rYT2 = abstractC1592930rYR.LL;
            c1592950rYT2.LLJJIJI = customIconView$homepage_common_release;
            View view = c1592950rYT2.LLILZLL;
            if (view != null) {
                abstractC2273051Dy3.LIZLLL(view, customIconView$homepage_common_release);
            }
        }
    }
}
