package X;

import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility;

/* JADX INFO: renamed from: X.14Zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20287014Zo implements Animator.AnimatorListener {
    public final boolean LL;
    public final /* synthetic */ C20286814Zm LLILLJJLI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View viewLIZ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IPausePanelAbility iPausePanelAbility;
        View view;
        View view2;
        View view3;
        int type;
        View viewLIZ2;
        String aid = null;
        if (this.LL) {
            C20286814Zm c20286814Zm = this.LLILLJJLI;
            c20286814Zm.LJJIIJ(c20286814Zm.LJJIJIIJI, 1.0f);
            C20286814Zm c20286814Zm2 = this.LLILLJJLI;
            InterfaceC1049140dPM interfaceC1049140dPM = c20286814Zm2.LJJLIIIJLLLLLLLZ;
            if (interfaceC1049140dPM != null) {
                viewLIZ2 = interfaceC1049140dPM.LIZ();
            } else {
                viewLIZ2 = null;
            }
            c20286814Zm2.LJJIIJ(viewLIZ2, 1.0f);
            this.LLILLJJLI.LJJIFFI(1.0f, true);
            this.LLILLJJLI.LJJII(1.0f);
            this.LLILLJJLI.LJIIJJI(true, false);
            this.LLILLJJLI.LJI(true);
            InterfaceC20289914aH interfaceC20289914aH = this.LLILLJJLI.LJJJLL;
            if (interfaceC20289914aH != null) {
                interfaceC20289914aH.LJIIIZ();
            }
            this.LLILLJJLI.LJJIII();
            View view4 = this.LLILLJJLI.LJJJJ;
            if (view4 != null) {
                view4.setClickable(true);
            }
            HomePageViewPagerAbility homePageViewPagerAbility = this.LLILLJJLI.LJJLIIIJILLIZJL;
            if (homePageViewPagerAbility != null) {
                homePageViewPagerAbility.LLIFFJFJJ(false);
            }
        } else {
            C20286814Zm c20286814Zm3 = this.LLILLJJLI;
            c20286814Zm3.LJJIIJ(c20286814Zm3.LJJIJIIJI, 0.0f);
            C20286814Zm c20286814Zm4 = this.LLILLJJLI;
            InterfaceC1049140dPM interfaceC1049140dPM2 = c20286814Zm4.LJJLIIIJLLLLLLLZ;
            if (interfaceC1049140dPM2 != null) {
                viewLIZ = interfaceC1049140dPM2.LIZ();
            } else {
                viewLIZ = null;
            }
            c20286814Zm4.LJJIIJ(viewLIZ, 0.0f);
            this.LLILLJJLI.LJJIFFI(0.0f, true);
            this.LLILLJJLI.LJJII(0.0f);
            View view5 = this.LLILLJJLI.LJJJJ;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            this.LLILLJJLI.LJI(false);
            C20286814Zm c20286814Zm5 = this.LLILLJJLI;
            View view6 = c20286814Zm5.LJJJ;
            if (view6 != null && view6.getVisibility() == 4 && (view3 = c20286814Zm5.LJJJ) != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            View view7 = c20286814Zm5.LJJJI;
            if (view7 != null && view7.getVisibility() == 4 && (view2 = c20286814Zm5.LJJJI) != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view8 = c20286814Zm5.LJJJIL;
            if (view8 != null && view8.getVisibility() == 4 && (view = c20286814Zm5.LJJJIL) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view9 = this.LLILLJJLI.LJJJ;
            if (view9 != null && view9.getVisibility() == 0 && (interfaceC665370Q7z = this.LLILLJJLI.LJJIIZ) != null && (iPausePanelAbility = (IPausePanelAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPausePanelAbility.class, null)) != null) {
                iPausePanelAbility.IK2();
            }
            View view10 = this.LLILLJJLI.LJJJJ;
            if (view10 != null) {
                view10.setClickable(false);
            }
            HomePageViewPagerAbility homePageViewPagerAbility2 = this.LLILLJJLI.LJJLIIIJILLIZJL;
            if (homePageViewPagerAbility2 != null) {
                homePageViewPagerAbility2.LLIFFJFJJ(true);
            }
        }
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        Aweme aweme = this.LLILLJJLI.LJJJJZI;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        C20286814Zm c20286814Zm6 = this.LLILLJJLI;
        c20286814Zm6.getClass();
        if (C20286114Zf.LIZ(c20286814Zm6.LJJJJZI)) {
            type = C14Z5.COMMON_BACKGROUND_LYNX.getType();
        } else {
            type = C14Z5.BACKGROUND.getType();
        }
        c20285414YyLIZ.LJII(aid, new C14Z2(type, this.LLILLJJLI.LJIJJ));
        Aweme aweme2 = this.LLILLJJLI.LJJJJZI;
        if (aweme2 != null) {
            C1440005kM.LIZ(new C20289414aC(this.LL, aweme2.getAid()));
        }
    }

    public C20287014Zo(C20286814Zm c20286814Zm, boolean z) {
        this.LLILLJJLI = c20286814Zm;
        this.LL = z;
    }
}
