package Y;

import X.AbstractC21634219lc;
import X.C13LZ;
import X.C1ACA;
import X.C21646519nb;
import X.C21665319qd;
import X.C21665419qe;
import X.C2178641AOg;
import X.C786410Ut5;
import X.C790900V0u;
import X.InterfaceC2178671AOj;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewTouchMonitorWidget;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.videoshop.context.VideoContext;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class ATListenerS465S0100000_33 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS465S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        return ((C21665419qe) aTListenerS465S0100000_33.l0).LLLLLLZ();
    }

    public static final boolean onTouch$1(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        if (((PdpBulletBottomSheetFragment) aTListenerS465S0100000_33.l0).LLJILJILJ == 4) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        ((LivePreviewTouchMonitorWidget) aTListenerS465S0100000_33.l0).LLJ = motionEvent.getRawX();
        ((LivePreviewTouchMonitorWidget) aTListenerS465S0100000_33.l0).LLJI = motionEvent.getRawY();
        int iIntValue = ((int) (((LivePreviewTouchMonitorWidget) aTListenerS465S0100000_33.l0).LLJ / (((Number) r0.LLJIJIL.getValue()).intValue() / 3))) + 1;
        int iIntValue2 = ((int) (((LivePreviewTouchMonitorWidget) aTListenerS465S0100000_33.l0).LLJI / (((Number) r0.LLJILJIL.getValue()).intValue() / 4))) + 1;
        C1ACA c1acaZ1 = ((LivePreviewTouchMonitorWidget) aTListenerS465S0100000_33.l0).z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJLLLL = (iIntValue * 10) + iIntValue2;
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r1 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$3(Y.ATListenerS465S0100000_33 r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            int r1 = r8.getActionMasked()
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L90
            if (r1 == r2) goto L86
            r0 = 2
            if (r1 == r0) goto L11
            r0 = 3
            if (r1 == r0) goto L86
        L10:
            return r2
        L11:
            float r4 = r8.getRawX()
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r0 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r0
            float r0 = r0.LLJZ
            float r4 = r4 - r0
            float r1 = r8.getRawY()
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r0 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r0
            float r0 = r0.LLJZIJLIL
            float r1 = r1 - r0
            float r5 = java.lang.Math.abs(r4)
            float r4 = java.lang.Math.abs(r1)
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r1 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r1
            boolean r0 = r1.LLJLLL
            if (r0 != 0) goto L49
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto L49
            r1.LLJLLL = r2
            r1.getClass()
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L49
            r0.requestDisallowInterceptTouchEvent(r2)
        L49:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r1 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r1
            boolean r0 = r1.LLJLLL
            if (r0 == 0) goto L10
            X.01GW r0 = r1.LLJLLIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r1 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r1
            java.util.List r0 = r1.sp()
            if (r0 == 0) goto L10
            int r0 = r0.size()
            if (r0 <= r2) goto L10
            boolean r0 = r1.LLLFZ
            if (r0 != 0) goto L10
            r1.LLLFZ = r2
            X.01GW r0 = r1.LLJL
            java.lang.Object r0 = r0.getValue()
            X.19ng r0 = (X.C21647019ng) r0
            if (r0 == 0) goto L10
            r0.LJI(r3)
            return r2
        L86:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r0 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r0
            r0.LLJLLL = r3
            r0.getClass()
            return r2
        L90:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r1 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r1
            float r0 = r8.getRawX()
            r1.LLJZ = r0
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r1 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r1
            float r0 = r8.getRawY()
            r1.LLJZIJLIL = r0
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem r0 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardPhotoContentAssem) r0
            r0.LLJLLL = r3
            r0.getClass()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS465S0100000_33.onTouch$3(Y.ATListenerS465S0100000_33, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$4(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        return ((C21665319qd) aTListenerS465S0100000_33.l0).LLLLZ();
    }

    public static final boolean onTouch$5(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        InterfaceC2178671AOj interfaceC2178671AOj = ((C2178641AOg) aTListenerS465S0100000_33.l0).LLJI;
        if (interfaceC2178671AOj != null && interfaceC2178671AOj.LJJIIJZLJL()) {
            VideoContext videoContext = ((C2178641AOg) aTListenerS465S0100000_33.l0).LLLFFI;
            if (videoContext == null || !videoContext.LJJJLIIL()) {
                return false;
            }
            return true;
        }
        if (!((C2178641AOg) aTListenerS465S0100000_33.l0).LLJLL.LIZ(new C790900V0u() { // from class: X.1AOd
        })) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    ((C2178641AOg) aTListenerS465S0100000_33.l0).LLJLL.LIZ(new C790900V0u(304));
                }
            } else {
                ((C2178641AOg) aTListenerS465S0100000_33.l0).getClass();
                VideoContext videoContext2 = ((C2178641AOg) aTListenerS465S0100000_33.l0).LLLFFI;
                if (videoContext2 == null || !videoContext2.LJJJLIIL()) {
                    ((C2178641AOg) aTListenerS465S0100000_33.l0).LLJLL.LIZ(new C790900V0u(304));
                }
            }
        }
        VideoContext videoContext3 = ((C2178641AOg) aTListenerS465S0100000_33.l0).LLLFFI;
        if (videoContext3 == null || !videoContext3.LJJJLIIL()) {
            return false;
        }
        return true;
    }

    public static final boolean onTouch$6(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        C786410Ut5.LJLLLLLL(8, view);
        ThoughtInfo thoughtInfoInvoke = ((C21646519nb) aTListenerS465S0100000_33.l0).LJ.invoke();
        if (thoughtInfoInvoke != null) {
            ((C21646519nb) aTListenerS465S0100000_33.l0).LJII.invoke(thoughtInfoInvoke);
        }
        ((C21646519nb) aTListenerS465S0100000_33.l0).LJIIIZ.invoke();
        return false;
    }

    public static final boolean onTouch$7(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        ViewParent parent;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewParent parent2;
        C21646519nb c21646519nb = (C21646519nb) aTListenerS465S0100000_33.l0;
        c21646519nb.getClass();
        int actionMasked = motionEvent.getActionMasked();
        Pair<Float, Float> pairLJ = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    float rawY = c21646519nb.LJIJJLI - motionEvent.getRawY();
                    if (!c21646519nb.LJJI && Math.abs(rawY) > c21646519nb.LIZ.getResources().getDisplayMetrics().density * 4.0f) {
                        c21646519nb.LJJI = true;
                    }
                    if (c21646519nb.LJJI) {
                        float fLIZLLL = C13LZ.LIZLLL(rawY / (c21646519nb.LIZ.getResources().getDisplayMetrics().density * 96.0f), 0.0f, 1.0f);
                        c21646519nb.LJIL = fLIZLLL;
                        c21646519nb.LIZLLL(fLIZLLL);
                        return true;
                    }
                    return true;
                }
            }
            View view2 = c21646519nb.LJIIL;
            if (view2 != null && (parent2 = view2.getParent()) != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            if (!c21646519nb.LJJI) {
                c21646519nb.LJJ = null;
                return true;
            }
            if (motionEvent.getActionMasked() == 1 && c21646519nb.LJIL >= 0.4f) {
                ValueAnimator valueAnimator = c21646519nb.LJJII;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (c21646519nb.LJIIL == null) {
                    c21646519nb.LJI();
                    c21646519nb.LJIIIZ.invoke();
                    return true;
                }
                c21646519nb.LIZ(1.0f, new AwS577S0100000_33(c21646519nb, 3876));
                return true;
            }
            ValueAnimator valueAnimator2 = c21646519nb.LJJII;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (c21646519nb.LJIIL != null && c21646519nb.LJIL > 0.0f) {
                c21646519nb.LIZ(0.0f, new AwS577S0100000_33(c21646519nb, 3877));
                return true;
            }
            c21646519nb.LJII();
            return true;
        }
        View view3 = c21646519nb.LJIIL;
        if (view3 != null && (viewPropertyAnimatorAnimate2 = view3.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        View viewInvoke = c21646519nb.LIZLLL.invoke();
        if (viewInvoke != null && (viewPropertyAnimatorAnimate = viewInvoke.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        ValueAnimator valueAnimator3 = c21646519nb.LJJII;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        c21646519nb.LJJII = null;
        ValueAnimator valueAnimator4 = c21646519nb.LJJIII;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        c21646519nb.LJJIII = null;
        c21646519nb.LJIJJLI = motionEvent.getRawY();
        c21646519nb.LJIL = 0.0f;
        View view4 = c21646519nb.LJIIL;
        if (view4 != null) {
            pairLJ = c21646519nb.LJ(view4);
        }
        c21646519nb.LJJ = pairLJ;
        c21646519nb.LJJI = false;
        View view5 = c21646519nb.LJIIL;
        if (view5 != null && (parent = view5.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$8(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        ((GestureDetector) aTListenerS465S0100000_33.l0).onTouchEvent(motionEvent);
        return true;
    }

    public static final boolean onTouch$9(ATListenerS465S0100000_33 aTListenerS465S0100000_33, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((AbstractC21634219lc) aTListenerS465S0100000_33.l0).LIZ();
            return false;
        }
        return false;
    }
}
