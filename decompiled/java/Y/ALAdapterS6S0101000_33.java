package Y;

import X.C0HCN;
import X.C1744700vVE;
import X.C19Y4;
import X.C19YB;
import X.C19YL;
import X.C19YV;
import X.C19YZ;
import X.C1A9R;
import X.C1A9W;
import X.C20441214yg;
import X.C21556419Xu;
import X.C21561119Zp;
import X.C21648419nu;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C426750GoL;
import X.C612110Nzd;
import X.C618720OOo;
import X.C724270Sb3;
import X.C814420VxA;
import X.EnumC2174751A9h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3NavHideOnScrollAssem;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;

/* JADX INFO: loaded from: classes34.dex */
public class ALAdapterS6S0101000_33 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (6 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        ((C21561119Zp) aLAdapterS6S0101000_33.l0).setInScroll(false);
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        ((C21561119Zp) aLAdapterS6S0101000_33.l0).setAnimationY(0);
        ((C21561119Zp) aLAdapterS6S0101000_33.l0).setAnimating(false);
        ((C21561119Zp) aLAdapterS6S0101000_33.l0).setCurShowIndex(aLAdapterS6S0101000_33.i1);
        ((C21561119Zp) aLAdapterS6S0101000_33.l0).setInScroll(false);
        C21561119Zp c21561119Zp = (C21561119Zp) aLAdapterS6S0101000_33.l0;
        c21561119Zp.LIZIZ(c21561119Zp.getCurrMusicProcess(), null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("transitionEnd newIndex=");
        sbLIZ.append(aLAdapterS6S0101000_33.i1);
        sbLIZ.append(" dynamicRect=");
        sbLIZ.append(((C21561119Zp) aLAdapterS6S0101000_33.l0).getDynamicRectF());
        sbLIZ.append(" progress=");
        sbLIZ.append(((C21561119Zp) aLAdapterS6S0101000_33.l0).getCurrMusicProcess());
        C20441214yg.LIZIZ("KtvLyricRender", C2188811AlT.LIZIZ(sbLIZ));
        ((C21561119Zp) aLAdapterS6S0101000_33.l0).invalidate();
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        C19YV c19yv = (C19YV) aLAdapterS6S0101000_33.l0;
        c19yv.LLILLL = aLAdapterS6S0101000_33.i1;
        c19yv.LLILZ = 0.0f;
    }

    public static final void onAnimationEnd$2(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        C21556419Xu c21556419Xu = (C21556419Xu) aLAdapterS6S0101000_33.l0;
        c21556419Xu.LLILLL = aLAdapterS6S0101000_33.i1;
        c21556419Xu.LLILZ = 0.0f;
    }

    public static final void onAnimationEnd$3(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        C19YZ c19yz = (C19YZ) aLAdapterS6S0101000_33.l0;
        c19yz.LLILLL = aLAdapterS6S0101000_33.i1;
        c19yz.LLILZ = 0.0f;
    }

    public static final void onAnimationEnd$4(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        C19Y4 c19y4 = (C19Y4) aLAdapterS6S0101000_33.l0;
        c19y4.LLILLL = aLAdapterS6S0101000_33.i1;
        c19y4.LLILZ = 0.0f;
    }

    public static final void onAnimationEnd$5(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        C19YL c19yl = (C19YL) aLAdapterS6S0101000_33.l0;
        c19yl.LLILLL = aLAdapterS6S0101000_33.i1;
        c19yl.LLILZ = 0.0f;
    }

    public static final void onAnimationEnd$6(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        View view;
        super.onAnimationEnd(animator);
        VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aLAdapterS6S0101000_33.l0;
        C1A9R c1a9r = videoMusicCoverAssem.LLLIZZ;
        if (c1a9r == null) {
            c1a9r = null;
        }
        C1A9W c1a9wFq = videoMusicCoverAssem.fq();
        c1a9r.LJIILLIIL = c1a9wFq;
        if (!C0HCN.LIZJ() && !LowScreenOptimizeAB.LIZIZ()) {
            View view2 = c1a9r.LJIILJJIL;
            if (view2 != null) {
                if (c1a9r.LIZIZ) {
                    if (c1a9wFq.LJI) {
                        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_MY_PROFILE_MUSIC.get()))), view2);
                        C426750GoL.LJIIL(view2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.PROFILE_MUSIC_TOP.get())))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.PROFILE_MUSIC_BOTTOM.get())))), 21);
                    } else {
                        C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.AREA_HEIGHT_MUSIC.get()))), view2);
                        C426750GoL.LJIIL(view2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.MUSIC_TOP.get())))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(EnumC2174751A9h.MUSIC_BOTTOM.get())))), 21);
                    }
                } else {
                    C426750GoL.LJIIIZ(view2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(35 - c1a9wFq.LIZLLL)))), 0, null, false, 25);
                }
            }
            View view3 = c1a9r.LJ;
            if (view3 != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9wFq.LJ + c1a9wFq.LIZ + c1a9wFq.LIZIZ + c1a9r.LJFF())));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9wFq.LJ + c1a9wFq.LIZLLL + c1a9wFq.LIZJ)));
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9wFq.LIZIZ)));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9wFq.LIZ)));
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9wFq.LIZLLL)));
                int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1a9wFq.LIZJ)));
                if (c1a9r.LIZIZ) {
                    EnumC2174751A9h enumC2174751A9h = EnumC2174751A9h.AREA_WIDTH;
                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get()))) - iLIZIZ;
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(enumC2174751A9h.get())));
                    iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                    iLIZIZ2 = -2;
                }
                C618720OOo.LIZIZ(view3, iLIZIZ, iLIZIZ2);
                C426750GoL.LJIIL(view3, Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ6), 16);
            }
            if (c1a9r.LIZIZ && (view = c1a9r.LJIILL) != null) {
                ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 8388629;
                return;
            }
            return;
        }
        c1a9r.LJ(c1a9wFq);
    }

    public static final void onAnimationEnd$7(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        C19YB c19yb = (C19YB) aLAdapterS6S0101000_33.l0;
        c19yb.LLILLL = aLAdapterS6S0101000_33.i1;
        c19yb.LLILZ = 0.0f;
    }

    public static final void onAnimationEnd$8(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        C21648419nu c21648419nu = ((FriendsV3NavHideOnScrollAssem) aLAdapterS6S0101000_33.l0).LLJI;
        if (c21648419nu != null) {
            c21648419nu.LIZJ(aLAdapterS6S0101000_33.i1);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS6S0101000_33 aLAdapterS6S0101000_33, Animator animator) {
        Object obj;
        super.onAnimationStart(animator);
        VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aLAdapterS6S0101000_33.l0;
        FrameLayout frameLayout = videoMusicCoverAssem.LLLLJ;
        if (frameLayout != null) {
            int i = aLAdapterS6S0101000_33.i1;
            C612110Nzd c612110Nzd = C612110Nzd.LIZ;
            C724270Sb3 c724270Sb3 = videoMusicCoverAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            c612110Nzd.getClass();
            if (C612110Nzd.LIZIZ(aweme)) {
                frameLayout.setBackground(null);
                C426750GoL.LJIIL(frameLayout, 0, null, null, null, 30);
                C618720OOo.LIZIZ(frameLayout, i, i);
            }
        }
    }

    public ALAdapterS6S0101000_33(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
