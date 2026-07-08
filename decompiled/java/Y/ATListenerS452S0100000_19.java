package Y;

import X.C1224280hxq;
import X.C1245110iVR;
import X.C19635211ry;
import X.C19HG;
import X.C2537109wv;
import X.C268330AfP;
import X.C300830Bqj;
import X.C365280ETu;
import X.EnumC1223630hwn;
import X.EnumC356410DyB;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController;
import com.ss.android.ugc.aweme.im.ability.HistorySearchKeyWordAbility;
import com.ss.android.ugc.aweme.im.ui.assem.HistorySearchAssem;
import com.ss.android.ugc.aweme.live.liveevent.sticker.sheet.base.SingleOptionSelectionSheet;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationFormAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarCenterComponent;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorSearchBarAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class ATListenerS452S0100000_19 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ boolean onTouch$1(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        return ((Boolean) ((Function2) aTListenerS452S0100000_19.l0).invoke(view, motionEvent)).booleanValue();
    }

    public static final /* synthetic */ boolean onTouch$2(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        return ((Boolean) ((Function2) aTListenerS452S0100000_19.l0).invoke(view, motionEvent)).booleanValue();
    }

    public static final /* synthetic */ boolean onTouch$3(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        return ((Boolean) ((Function2) aTListenerS452S0100000_19.l0).invoke(view, motionEvent)).booleanValue();
    }

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case 16:
                return onTouch$16(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS452S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        boolean zLIZ;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && ((View) ((HistorySearchAssem) aTListenerS452S0100000_19.l0).LLJI.getValue()).getVisibility() != 0) {
                view.performClick();
                zLIZ = C300830Bqj.LIZ();
                return !zLIZ;
            }
            return false;
        }
        if (((View) ((HistorySearchAssem) aTListenerS452S0100000_19.l0).LLJI.getValue()).getVisibility() != 0) {
            HistorySearchKeyWordAbility historySearchKeyWordAbility = (HistorySearchKeyWordAbility) ((HistorySearchAssem) aTListenerS452S0100000_19.l0).LLJ.getValue();
            if (historySearchKeyWordAbility != null) {
                historySearchKeyWordAbility.Rq();
            }
            zLIZ = C300830Bqj.LIZ();
            return !zLIZ;
        }
        return false;
    }

    public static final boolean onTouch$10(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((GroupCreationFormAssem) aTListenerS452S0100000_19.l0).LJJIL();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$11(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((GroupCreationFormAssem) aTListenerS452S0100000_19.l0).LJJIL();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$12(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        TextView textView = ((C19635211ry) aTListenerS452S0100000_19.l0).LLIZLLLIL;
        if (textView != null && C365280ETu.LIZ((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), textView)) {
            TextView textView2 = ((C19635211ry) aTListenerS452S0100000_19.l0).LLIZLLLIL;
            if (textView2 != null) {
                textView2.performClick();
            }
        } else {
            C19635211ry c19635211ry = (C19635211ry) aTListenerS452S0100000_19.l0;
            if (c19635211ry.LLJILJILJ) {
                SingleOptionSelectionSheet singleOptionSelectionSheet = c19635211ry.LLJJIJI;
                if (singleOptionSelectionSheet != null) {
                    singleOptionSelectionSheet.dismissAllowingStateLoss();
                }
                ((C19635211ry) aTListenerS452S0100000_19.l0).LLJJIJI = null;
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$13(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        return ((MTAwemeListFragment) aTListenerS452S0100000_19.l0).LLLLZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r5 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$14(Y.ATListenerS452S0100000_19 r4, android.view.View r5, android.view.MotionEvent r6) {
        /*
            java.lang.Object r2 = r4.l0
            X.0it6 r2 = (X.C1259780it6) r2
            r2.getClass()
            int r5 = r6.getActionMasked()
            r1 = 2
            r4 = 0
            if (r5 == 0) goto L18
            r3 = 1
            if (r5 == r3) goto La0
            if (r5 == r1) goto L5b
            r0 = 3
            if (r5 == r0) goto La0
        L17:
            return r4
        L18:
            r2.f6()
            r2.LLLF = r4
            float r0 = r6.getX()
            r2.LLLFF = r0
            float r0 = r6.getY()
            r2.LLLFFI = r0
            int r0 = r2.LLLFZ
            if (r0 >= 0) goto L3e
            android.view.ViewGroup r0 = r2.LLJILJIL
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            int r0 = r0 / r1
            r2.LLLFZ = r0
        L3e:
            java.lang.Boolean r0 = r2.i6()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            Y.ARunnableS119S0100000_19 r1 = new Y.ARunnableS119S0100000_19
            r0 = 207(0xcf, float:2.9E-43)
            r1.<init>(r2, r0)
            r2.LLLI = r1
            android.view.ViewGroup r3 = r2.LLJILJIL
            Y.ARunnableS119S0100000_19 r2 = r2.LLLI
            r0 = 250(0xfa, double:1.235E-321)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r3, r2, r0)
            return r4
        L5b:
            boolean r0 = r2.LLLF
            if (r0 != 0) goto L89
            float r1 = r6.getX()
            float r0 = r2.LLLFF
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r2.LLLFZ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L83
            float r1 = r6.getY()
            float r0 = r2.LLLFFI
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r2.LLLFZ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L89
        L83:
            r2.f6()
        L86:
            boolean r4 = r2.LLLF
            return r4
        L89:
            boolean r0 = r2.LLLF
            if (r0 == 0) goto L86
            android.view.ViewGroup r0 = r2.LLJILJIL
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L98
            r0.requestDisallowInterceptTouchEvent(r3)
        L98:
            X.0itd r0 = r2.LLL
            if (r0 == 0) goto L86
            r0.LLLLLZL(r6)
            goto L86
        La0:
            boolean r0 = r2.LLLF
            if (r0 == 0) goto Laf
            X.0itd r0 = r2.LLL
            if (r0 == 0) goto Lab
            r0.LLLLLZL(r6)
        Lab:
            r2.LLLF = r4
            r4 = 1
            return r4
        Laf:
            r2.f6()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS452S0100000_19.onTouch$14(Y.ATListenerS452S0100000_19, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$15(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        if (C268330AfP.LJIIIZ()) {
            View view2 = ((ProfileNavBarCenterComponent) aTListenerS452S0100000_19.l0).LLJZIJLIL;
            if (view2 != null) {
                view2.getAlpha();
                return false;
            }
            return false;
        }
        if (((Boolean) C2537109wv.LJIILLIIL.getValue()).booleanValue()) {
            if (((((ColorDrawable) ((ProfileNavBarCenterComponent) aTListenerS452S0100000_19.l0).cp().findViewById(R.id.p1z).getBackground()).getColor() >> 24) & 255) < 255) {
                return false;
            }
            return true;
        }
        if (((ProfileNavBarCenterComponent) aTListenerS452S0100000_19.l0).LLJZ <= 0.0f) {
            return false;
        }
        return true;
    }

    public static final boolean onTouch$16(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        if (((SlideGuideController) aTListenerS452S0100000_19.l0).LLJIJIL && motionEvent.getAction() == 0) {
            view.setClickable(false);
            HandlerHook.viewPost(view, new ARunnableS119S0100000_19((SlideGuideController) aTListenerS452S0100000_19.l0, 226));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r4 != 3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$4(Y.ATListenerS452S0100000_19 r4, android.view.View r5, android.view.MotionEvent r6) {
        /*
            int r0 = r6.getActionMasked()
            r2 = 1
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem r0 = (com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem) r0
            boolean r0 = r0.LLLLJI
            if (r0 != 0) goto L12
            r5.performClick()
        L12:
            java.lang.Object r3 = r4.l0
            com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem r3 = (com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem) r3
            r3.getClass()
            int r4 = r6.getActionMasked()
            r1 = 0
            if (r4 == 0) goto L9a
            if (r4 == r2) goto L97
            r0 = 2
            if (r4 == r0) goto L29
            r0 = 3
            if (r4 == r0) goto L97
        L28:
            return r2
        L29:
            boolean r0 = r3.LLLLJI
            if (r0 != 0) goto L28
            float r4 = r6.getRawY()
            float r0 = r3.LLLLJ
            float r4 = r4 - r0
            float r1 = r6.getRawX()
            float r0 = r3.LLLLILI
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            int r0 = r0 * 2
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L28
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L28
            X.0Itn r4 = r3.LLJLIL
            if (r4 == 0) goto L28
            X.0iWH r1 = r3.LLJLILLLLZIIL
            if (r1 == 0) goto L28
            android.view.View r0 = r1.getScrollTarget()
            if (r0 == 0) goto L95
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 != 0) goto L95
            r1 = 1
        L6c:
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L28
            boolean r0 = r4.LLLFF
            if (r0 != 0) goto L28
            X.1DDq r0 = r3.LLLLIILL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L28
            if (r1 == 0) goto L28
            X.0Itn r1 = r3.LLJLIL
            if (r1 == 0) goto L92
            X.0Itk r0 = X.EnumC481060Itk.REFRESH
            r1.setScrollMode(r0)
            r1.LJ()
        L92:
            r3.LLLLJI = r2
            return r2
        L95:
            r1 = 0
            goto L6c
        L97:
            r3.LLLLJI = r1
            return r2
        L9a:
            float r0 = r6.getRawX()
            r3.LLLLILI = r0
            float r0 = r6.getRawY()
            r3.LLLLJ = r0
            r3.LLLLJI = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS452S0100000_19.onTouch$4(Y.ATListenerS452S0100000_19, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$5(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        if (1 == motionEvent.getAction()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            SelectorSearchBarAssem selectorSearchBarAssem = (SelectorSearchBarAssem) aTListenerS452S0100000_19.l0;
            if (jElapsedRealtime - selectorSearchBarAssem.LLJJ < 300) {
                return true;
            }
            selectorSearchBarAssem.LLJJ = jElapsedRealtime;
            ((C1224280hxq) selectorSearchBarAssem.LLJI.getValue()).LJII().LJIIIZ(EnumC356410DyB.EDIT);
            if (((Boolean) ((SelectorSearchBarAssem) aTListenerS452S0100000_19.l0).LLJILJIL.getValue()).booleanValue()) {
                ((SelectorSearchBarAssem) aTListenerS452S0100000_19.l0).Jo().xQ2(EnumC1223630hwn.SEARCH_PAGE);
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:
    
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$6(Y.ATListenerS452S0100000_19 r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            boolean r0 = r7 instanceof X.C21578619ce
            if (r0 != 0) goto L5
            r7 = 0
        L5:
            int r1 = r8.getActionMasked()
            r3 = 0
            if (r1 == 0) goto L5c
            r5 = 1
            if (r1 == r5) goto L76
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L76
        L15:
            return r3
        L16:
            java.lang.Object r0 = r6.l0
            X.0iCP r0 = (X.C1233310iCP) r0
            boolean r0 = r0.LIZLLL
            if (r0 != 0) goto L15
            if (r7 == 0) goto L15
            int r0 = r7.getScrollY()
            if (r0 != 0) goto L15
            java.lang.Object r0 = r6.l0
            X.0iCP r0 = (X.C1233310iCP) r0
            X.0i5R r1 = r0.LJI
            X.0i5R r0 = X.EnumC1228990i5R.PUBLIC_GROUP
            if (r1 != r0) goto L15
            float r4 = r8.getY()
            java.lang.Object r2 = r6.l0
            X.0iCP r2 = (X.C1233310iCP) r2
            float r0 = r2.LIZJ
            float r4 = r4 - r0
            int r1 = r2.LJ
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4c
            r2.LIZ(r5)
            java.lang.Object r0 = r6.l0
            X.0iCP r0 = (X.C1233310iCP) r0
            r0.LIZLLL = r5
            return r3
        L4c:
            int r0 = -r1
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            r2.LIZ(r3)
            java.lang.Object r0 = r6.l0
            X.0iCP r0 = (X.C1233310iCP) r0
            r0.LIZLLL = r5
            return r3
        L5c:
            java.lang.Object r1 = r6.l0
            X.0iCP r1 = (X.C1233310iCP) r1
            float r0 = r8.getY()
            r1.LIZJ = r0
            java.lang.Object r2 = r6.l0
            X.0iCP r2 = (X.C1233310iCP) r2
            r2.LIZLLL = r3
            X.0i5R r1 = r2.LJI
            X.0i5R r0 = X.EnumC1228990i5R.PUBLIC_GROUP
            if (r1 != r0) goto L15
            r2.LIZ(r3)
            return r3
        L76:
            java.lang.Object r0 = r6.l0
            X.0iCP r0 = (X.C1233310iCP) r0
            r0.LIZLLL = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS452S0100000_19.onTouch$6(Y.ATListenerS452S0100000_19, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$7(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        C19HG c19hg = ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LL;
        if (c19hg == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LLJILJIL = false;
                        }
                    }
                } else {
                    ProfileBgImagePreviewActivity profileBgImagePreviewActivity = (ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0;
                    if (!profileBgImagePreviewActivity.LLJILJIL || profileBgImagePreviewActivity.LLJIJIL) {
                        return false;
                    }
                    Matrix matrix = profileBgImagePreviewActivity.LLJILLL;
                    if (matrix == null) {
                        new Matrix(c19hg.LLILZLL);
                    } else {
                        matrix.set(c19hg.LLILZLL);
                    }
                    if (!profileBgImagePreviewActivity.LLJILLL.isIdentity()) {
                        ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LLJILJIL = false;
                        return false;
                    }
                    float rawY = motionEvent.getRawY() - ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LLJ;
                    float rawX = motionEvent.getRawX() - ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LLJI;
                    if (Math.abs(rawY) > ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LLJILJILJ || Math.abs(rawX) > ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LLJILJILJ) {
                        ProfileBgImagePreviewActivity profileBgImagePreviewActivity2 = (ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0;
                        profileBgImagePreviewActivity2.LLJIJIL = true;
                        profileBgImagePreviewActivity2.finishAfterTransition();
                        return true;
                    }
                }
                return false;
            }
            ProfileBgImagePreviewActivity profileBgImagePreviewActivity3 = (ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0;
            profileBgImagePreviewActivity3.LLJIJIL = false;
            profileBgImagePreviewActivity3.LLJILJIL = false;
            return false;
        }
        ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LLJ = motionEvent.getRawY();
        ((ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0).LLJI = motionEvent.getRawX();
        ProfileBgImagePreviewActivity profileBgImagePreviewActivity4 = (ProfileBgImagePreviewActivity) aTListenerS452S0100000_19.l0;
        profileBgImagePreviewActivity4.LLJIJIL = false;
        Matrix matrix2 = profileBgImagePreviewActivity4.LLJILLL;
        if (matrix2 == null) {
            new Matrix(c19hg.LLILZLL);
        } else {
            matrix2.set(c19hg.LLILZLL);
        }
        profileBgImagePreviewActivity4.LLJILJIL = profileBgImagePreviewActivity4.LLJILLL.isIdentity();
        return false;
    }

    public static final boolean onTouch$8(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        boolean z;
        C1245110iVR c1245110iVR = (C1245110iVR) aTListenerS452S0100000_19.l0;
        if (!c1245110iVR.LIZIZ) {
            c1245110iVR.LJJIIZ = false;
        } else {
            View view2 = c1245110iVR.LJIIJ;
            if ((view2 instanceof ScrollView) && view2 != null) {
                int iLIZJ = c1245110iVR.LIZJ() - view2.getScrollY();
                if (iLIZJ < 0) {
                    iLIZJ = 0;
                }
                float f = iLIZJ;
                float y = motionEvent.getY();
                if (0.0f <= y && y <= f) {
                    z = true;
                } else {
                    z = false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                c1245110iVR.LJJIIZ = false;
                                return false;
                            }
                        } else {
                            float scaledTouchSlop = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
                            if (!z || Math.abs(motionEvent.getY() - c1245110iVR.LJJIIZI) > scaledTouchSlop) {
                                c1245110iVR.LJJIIZ = false;
                                return false;
                            }
                        }
                    } else {
                        if (c1245110iVR.LJJIIZ && z) {
                            c1245110iVR.LJJIIZ = false;
                            c1245110iVR.LJI();
                            return true;
                        }
                        c1245110iVR.LJJIIZ = false;
                        return false;
                    }
                } else {
                    c1245110iVR.LJJIIZ = z;
                    c1245110iVR.LJJIIZI = motionEvent.getY();
                    return false;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$9(ATListenerS452S0100000_19 aTListenerS452S0100000_19, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    ProfileHeaderSignatureTranslationComponent profileHeaderSignatureTranslationComponent = (ProfileHeaderSignatureTranslationComponent) aTListenerS452S0100000_19.l0;
                    if (!profileHeaderSignatureTranslationComponent.LLLFF) {
                        profileHeaderSignatureTranslationComponent.Fp();
                        return false;
                    }
                    return false;
                }
                return false;
            }
            ((ProfileHeaderSignatureTranslationComponent) aTListenerS452S0100000_19.l0).Fp();
            return false;
        }
        TuxTextView tuxTextView = ((ProfileHeaderSignatureTranslationComponent) aTListenerS452S0100000_19.l0).LLJLLL;
        if (tuxTextView == null) {
            return false;
        }
        tuxTextView.setTextColorRes(R.attr.a1k);
        return false;
    }
}
