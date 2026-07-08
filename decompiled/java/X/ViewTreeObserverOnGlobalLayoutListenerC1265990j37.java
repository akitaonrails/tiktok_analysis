package X;

import Y.ARunnableS119S0100000_19;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileAwemeListFragment;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0j37, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1265990j37 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onGlobalLayout$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onGlobalLayout$10(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        WrapGridLayoutManager wrapGridLayoutManager = ((AdFakeUserProfileAwemeListFragment) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LLILLL;
        RecyclerView recyclerView = null;
        if (wrapGridLayoutManager == null) {
            wrapGridLayoutManager = null;
        }
        if (!(wrapGridLayoutManager instanceof WrapGridLayoutManager)) {
            wrapGridLayoutManager = null;
        }
        if (wrapGridLayoutManager != null && wrapGridLayoutManager.findFirstVisibleItemPosition() == -1) {
            return;
        }
        ((AdFakeUserProfileAwemeListFragment) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).MR(true);
        RecyclerView recyclerView2 = ((AdFakeUserProfileAwemeListFragment) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LL;
        if (recyclerView2 != null) {
            recyclerView = recyclerView2;
        }
        C786410Ut5.C3(recyclerView.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265990j37);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        C1241210iP9.LIZ((EditText) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0);
        C786410Ut5.C3(((EditText) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265990j37);
    }

    public static final void onGlobalLayout$10(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        C786410Ut5.C3(((C1215990hkT) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).getFlCoverFromXml().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265990j37);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((C1215990hkT) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).getFlCoverFromXml().getLayoutParams();
        layoutParams.height = layoutParams.width;
        C786410Ut5.a6(((C1215990hkT) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).getFlCoverFromXml(), layoutParams);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        C340780DXo.LIZJ((EditText) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0);
        C786410Ut5.C3(((EditText) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265990j37);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        EditText editText = (EditText) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0;
        HandlerHook.viewPostDelay(editText, new ARunnableS119S0100000_19(editText, 75), 200L);
        C786410Ut5.C3(((EditText) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265990j37);
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        ((AbstractViewOnClickListenerC1256970ioZ) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onGlobalLayout$5(X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37 r9) {
        /*
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol r0 = (com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol) r0
            int r5 = r0.LJL()
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol r0 = (com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol) r0
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r0.LLJILJIL
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = (com.ss.android.ugc.profile.business.ur.platform.NickNameData) r0
            r4 = 0
            if (r0 == 0) goto L97
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r0.getVerifyIcon()
            if (r0 == 0) goto L97
            java.lang.String r0 = r0.getLocalIcon()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol r0 = (com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol) r0
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto L97
            java.lang.Object r1 = r9.l0
            com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol r1 = (com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol) r1
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = X.C1721460utk.LIZ
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r1.LLJILJIL
            com.ss.android.ugc.profile.business.ur.platform.NickNameData r0 = (com.ss.android.ugc.profile.business.ur.platform.NickNameData) r0
            if (r0 == 0) goto L95
            com.ss.android.ugc.profile.platform.base.data.Icon r0 = r0.getVerifyIcon()
            if (r0 == 0) goto L95
            java.lang.String r2 = r0.getLocalIcon()
        L3f:
            java.lang.String r1 = "nav_bar_center_nickname"
            java.lang.String r0 = ""
            X.0Ra5 r0 = X.C1721460utk.LIZJ(r3, r2, r4, r1, r0)
            if (r0 == 0) goto L97
            int r0 = r0.LIZ
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L4f:
            X.0iZi r3 = X.C1247760iZi.LIZ
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol r0 = (com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol) r0
            T extends com.ss.android.ugc.profile.platform.base.data.BizBaseData r0 = r0.LLJILJIL
            if (r0 == 0) goto L93
            com.ss.android.ugc.profile.platform.base.data.Describe r0 = r0.getDescribe()
            if (r0 == 0) goto L93
            java.lang.String r2 = r0.getText()
        L63:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol r0 = (com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol) r0
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L74
            r0 = 2131825150(0x7f1111fe, float:1.9283148E38)
            java.lang.String r4 = r1.getString(r0)
        L74:
            r3.getClass()
            java.lang.String r8 = X.C1247760iZi.LIZIZ(r2, r4)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol r0 = (com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol) r0
            com.bytedance.tux.input.TuxTextView r0 = r0.LJLI()
            if (r0 == 0) goto L92
            X.01zO r4 = new X.01zO
            java.lang.Object r6 = r9.l0
            com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol r6 = (com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol) r6
            r9 = 2
            r4.<init>(r5, r6, r7, r8, r9)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r0, r4)
        L92:
            return
        L93:
            r2 = r4
            goto L63
        L95:
            r2 = r4
            goto L3f
        L97:
            r7 = r4
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC1265990j37.onGlobalLayout$5(X.0j37):void");
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        KeyboardUtils.AndroidBug5497Workaround androidBug5497Workaround = (KeyboardUtils.AndroidBug5497Workaround) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0;
        if (androidBug5497Workaround.LLILLJJLI != null && androidBug5497Workaround.LLILLL != null) {
            androidBug5497Workaround.LLILLJJLI.getWindowVisibleDisplayFrame(new Rect());
            if (r1.bottom < ((double) androidBug5497Workaround.LLILLJJLI.getHeight()) * 0.75d) {
                androidBug5497Workaround.LLILLL.onShow();
            } else {
                androidBug5497Workaround.LLILLL.onHide();
            }
        }
    }

    public static final void onGlobalLayout$7(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        LinearLayout linearLayout;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        Pair pair;
        float[][] fArr;
        float[][] fArr2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        int i;
        float f;
        int i2;
        ProfileBadgeStruct profileBadge;
        ProfileBadgeStruct profileBadge2;
        float f2;
        int height;
        LinearLayout linearLayout2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ProfileBadgeStruct profileBadge3;
        User user;
        ProfileBadgeStruct profileBadge4;
        LinearLayout linearLayout3;
        AvatarComponentView avatarComponentView = ((EnlargeAvatarActivity) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LLILZIL;
        if (avatarComponentView == null) {
            avatarComponentView = null;
        }
        if (avatarComponentView.getParent() != null) {
            if (C280120AyQ.LIZ()) {
                final EnlargeAvatarActivity enlargeAvatarActivity = (EnlargeAvatarActivity) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0;
                AvatarComponentView avatarComponentView2 = enlargeAvatarActivity.LLILZIL;
                if (avatarComponentView2 == null) {
                    avatarComponentView2 = null;
                }
                View view = (View) avatarComponentView2.getParent();
                int height2 = view.getHeight();
                View view2 = enlargeAvatarActivity.LLJIJIL;
                if (view2 == null) {
                    view2 = null;
                }
                int height3 = height2 - view2.getHeight();
                float fLLLLZI = enlargeAvatarActivity.LLLLZI();
                User user2 = enlargeAvatarActivity.LLILZLL;
                if (user2 != null) {
                    profileBadge2 = user2.getProfileBadge();
                } else {
                    profileBadge2 = null;
                }
                if (enlargeAvatarActivity.LLLZIL(profileBadge2)) {
                    f2 = 2.5f;
                } else {
                    f2 = 3.0f;
                }
                C1256720ioA c1256720ioALLLLZLLIL = enlargeAvatarActivity.LLLLZLLIL();
                float fLLLLLZL = enlargeAvatarActivity.LLLLLZL(fLLLLZI);
                if (Float.isNaN(fLLLLLZL) || Float.isInfinite(fLLLLLZL)) {
                    fLLLLLZL = f2;
                }
                c1256720ioALLLLZLLIL.LJIIJJI = fLLLLLZL;
                C1256720ioA c1256720ioALLLLZLLIL2 = enlargeAvatarActivity.LLLLZLLIL();
                int iLIZIZ = C814420VxA.LIZIZ(enlargeAvatarActivity.LLLLZLLIL().LJI * enlargeAvatarActivity.LLLLZLLIL().LJIIJJI);
                int width = view.getWidth();
                if (iLIZIZ > width) {
                    iLIZIZ = width;
                }
                c1256720ioALLLLZLLIL2.LJIIIIZZ = iLIZIZ;
                enlargeAvatarActivity.LLLLZLLIL().LJIIIZ = C814420VxA.LIZIZ(enlargeAvatarActivity.LLLLZLLIL().LJII * enlargeAvatarActivity.LLLLZLLIL().LJIIJJI);
                int iLJFF = C418440Gaw.LJFF(Math.min(enlargeAvatarActivity.LLLLZLLIL().LJIIIIZZ, enlargeAvatarActivity.LLLLZLLIL().LJIIIZ), enlargeAvatarActivity);
                AvatarComponentView avatarComponentView3 = enlargeAvatarActivity.LLILZIL;
                if (avatarComponentView3 == null) {
                    avatarComponentView3 = null;
                }
                int avatarSizeDp = avatarComponentView3.getAvatarSizeDp();
                float f3 = avatarSizeDp;
                final float f4 = enlargeAvatarActivity.LLLLZLLIL().LJIIJJI * f3;
                float f5 = iLJFF;
                if (f4 > f5) {
                    f4 = f5;
                }
                if (avatarSizeDp > 0) {
                    enlargeAvatarActivity.LLLLZLLIL().LJIIJJI = f4 / f3;
                }
                if (Float.isNaN(enlargeAvatarActivity.LLLLZLLIL().LJIIJJI) || Float.isInfinite(enlargeAvatarActivity.LLLLZLLIL().LJIIJJI) || enlargeAvatarActivity.LLLLZLLIL().LJIIJJI <= 0.0f) {
                    enlargeAvatarActivity.LLLLZLLIL().LJIIJJI = f2;
                }
                AvatarComponentView avatarComponentView4 = enlargeAvatarActivity.LLILZIL;
                if (avatarComponentView4 == null) {
                    avatarComponentView4 = null;
                }
                ObjectAnimator objectAnimatorLLLLZLL = EnlargeAvatarActivity.LLLLZLL(1.0f / enlargeAvatarActivity.LLLLZLLIL().LJIIJJI, 1.0f, avatarComponentView4, "scaleX");
                AvatarComponentView avatarComponentView5 = enlargeAvatarActivity.LLILZIL;
                if (avatarComponentView5 == null) {
                    avatarComponentView5 = null;
                }
                ObjectAnimator objectAnimatorLLLLZLL2 = EnlargeAvatarActivity.LLLLZLL(1.0f / enlargeAvatarActivity.LLLLZLLIL().LJIIJJI, 1.0f, avatarComponentView5, "scaleY");
                float f6 = 2;
                enlargeAvatarActivity.LLLLZLLIL().LIZJ = enlargeAvatarActivity.LLLLZLLIL().LIZ - ((enlargeAvatarActivity.LLLLZLLIL().LJIIIIZZ - enlargeAvatarActivity.LLLLZLLIL().LJI) / f6);
                enlargeAvatarActivity.LLLLZLLIL().LIZLLL = (enlargeAvatarActivity.LLLLZLLIL().LIZIZ + enlargeAvatarActivity.LLLLZLLIL().LJIIJ) - ((enlargeAvatarActivity.LLLLZLLIL().LJIIIZ - enlargeAvatarActivity.LLLLZLLIL().LJII) / f6);
                enlargeAvatarActivity.LLLLZLLIL().LJ = (view.getWidth() - enlargeAvatarActivity.LLLLZLLIL().LJIIIIZZ) / 2.0f;
                if (!enlargeAvatarActivity.LLIZ && (user = enlargeAvatarActivity.LLILZLL) != null && (profileBadge4 = user.getProfileBadge()) != null && profileBadge4.getShouldShow() && (linearLayout3 = enlargeAvatarActivity.LLJJJJ) != null) {
                    height = linearLayout3.getHeight();
                } else {
                    height = 0;
                }
                C1256720ioA c1256720ioALLLLZLLIL3 = enlargeAvatarActivity.LLLLZLLIL();
                LinearLayout linearLayout4 = enlargeAvatarActivity.LLIZLLLIL;
                if (linearLayout4 == null) {
                    linearLayout4 = null;
                }
                c1256720ioALLLLZLLIL3.LJFF = (((height3 - linearLayout4.getHeight()) - enlargeAvatarActivity.LLLLZLLIL().LJIIIZ) - height) / 2.0f;
                AvatarComponentView avatarComponentView6 = enlargeAvatarActivity.LLILZIL;
                if (avatarComponentView6 == null) {
                    avatarComponentView6 = null;
                }
                ObjectAnimator objectAnimatorLLLLZLL3 = EnlargeAvatarActivity.LLLLZLL(enlargeAvatarActivity.LLLLZLLIL().LIZJ, enlargeAvatarActivity.LLLLZLLIL().LJ, avatarComponentView6, "x");
                AvatarComponentView avatarComponentView7 = enlargeAvatarActivity.LLILZIL;
                if (avatarComponentView7 == null) {
                    avatarComponentView7 = null;
                }
                ObjectAnimator objectAnimatorLLLLZLL4 = EnlargeAvatarActivity.LLLLZLL(enlargeAvatarActivity.LLLLZLLIL().LIZLLL, enlargeAvatarActivity.LLLLZLLIL().LJFF, avatarComponentView7, "y");
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(0, C475630Ikz.LIZIZ(R.attr.e1, enlargeAvatarActivity));
                valueAnimatorOfArgb.addUpdateListener(new AUListenerS256S0100000_6(view, 135));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorLLLLZLL3, objectAnimatorLLLLZLL4, objectAnimatorLLLLZLL, objectAnimatorLLLLZLL2, valueAnimatorOfArgb);
                animatorSet.setDuration(200L);
                animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
                animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0io8
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        String uid;
                        EnlargeAvatarActivity enlargeAvatarActivity2 = enlargeAvatarActivity;
                        AvatarComponentView avatarComponentView8 = enlargeAvatarActivity2.LLILZIL;
                        if (avatarComponentView8 == null) {
                            avatarComponentView8 = null;
                        }
                        float f7 = 1.0f / enlargeAvatarActivity2.LLLLZLLIL().LJIIJJI;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(avatarComponentView8);
                        avatarComponentView8.setScaleX(f7);
                        EnlargeAvatarActivity enlargeAvatarActivity3 = enlargeAvatarActivity;
                        AvatarComponentView avatarComponentView9 = enlargeAvatarActivity3.LLILZIL;
                        if (avatarComponentView9 == null) {
                            avatarComponentView9 = null;
                        }
                        float f8 = 1.0f / enlargeAvatarActivity3.LLLLZLLIL().LJIIJJI;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(avatarComponentView9);
                        avatarComponentView9.setScaleY(f8);
                        EnlargeAvatarActivity enlargeAvatarActivity4 = enlargeAvatarActivity;
                        AvatarComponentView avatarComponentView10 = enlargeAvatarActivity4.LLILZIL;
                        if (avatarComponentView10 == null) {
                            avatarComponentView10 = null;
                        }
                        ViewGroup.LayoutParams layoutParams2 = avatarComponentView10.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = enlargeAvatarActivity4.LLLLZLLIL().LJIIIIZZ;
                            layoutParams2.height = enlargeAvatarActivity4.LLLLZLLIL().LJIIIZ;
                            C786410Ut5.W5(avatarComponentView10, layoutParams2);
                            AvatarComponentView avatarComponentView11 = enlargeAvatarActivity.LLILZIL;
                            if (avatarComponentView11 == null) {
                                avatarComponentView11 = null;
                            }
                            avatarComponentView11.LJIILJJIL(Integer.valueOf(C814420VxA.LIZIZ(f4)), Integer.valueOf(C418440Gaw.LJFF(r1.LLLLZLLIL().LJIIIZ, enlargeAvatarActivity)));
                            EnlargeAvatarActivity enlargeAvatarActivity5 = enlargeAvatarActivity;
                            AvatarComponentView avatarComponentView12 = enlargeAvatarActivity5.LLILZIL;
                            if (avatarComponentView12 == null) {
                                avatarComponentView12 = null;
                            }
                            float f9 = enlargeAvatarActivity5.LLLLZLLIL().LIZJ;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(avatarComponentView12);
                            avatarComponentView12.setX(f9);
                            EnlargeAvatarActivity enlargeAvatarActivity6 = enlargeAvatarActivity;
                            AvatarComponentView avatarComponentView13 = enlargeAvatarActivity6.LLILZIL;
                            if (avatarComponentView13 == null) {
                                avatarComponentView13 = null;
                            }
                            float f10 = enlargeAvatarActivity6.LLLLZLLIL().LIZLLL;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(avatarComponentView13);
                            avatarComponentView13.setY(f10);
                            User user3 = enlargeAvatarActivity.LLILZLL;
                            if (user3 != null && (uid = user3.getUid()) != null) {
                                EnlargeAvatarActivity enlargeAvatarActivity7 = enlargeAvatarActivity;
                                AvatarComponentView avatarComponentView14 = enlargeAvatarActivity7.LLILZIL;
                                if (avatarComponentView14 == null) {
                                    avatarComponentView14 = null;
                                }
                                C0S1B.LIZ(avatarComponentView14, uid, enlargeAvatarActivity7.LLILZLL, enlargeAvatarActivity7, false, null, 56);
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                });
                EnlargeAvatarActivity enlargeAvatarActivity2 = (EnlargeAvatarActivity) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0;
                animatorSet.start();
                enlargeAvatarActivity2.getClass();
                float fLIZ = C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZ(enlargeAvatarActivity2.LLLLZLLIL().LJFF + enlargeAvatarActivity2.LLLLZLLIL().LJIIIZ);
                User user3 = enlargeAvatarActivity2.LLILZLL;
                if (user3 == null || (profileBadge3 = user3.getProfileBadge()) == null || !profileBadge3.getShouldShow() || enlargeAvatarActivity2.LLIZ ? (linearLayout2 = enlargeAvatarActivity2.LLIZLLLIL) != null : (linearLayout2 = enlargeAvatarActivity2.LLJJJJ) != null) {
                    ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                    if (layoutParams2 != null) {
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams2.topMargin = (int) fLIZ;
                        }
                        C786410Ut5.W5(linearLayout2, layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                EnlargeAvatarActivity enlargeAvatarActivity3 = (EnlargeAvatarActivity) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0;
                float intExtra = (enlargeAvatarActivity3.getIntent().getIntExtra("avatar_width", 0) - enlargeAvatarActivity3.LLLLZLLIL().LJI) / f6;
                AvatarComponentView avatarComponentView8 = enlargeAvatarActivity3.LLILZIL;
                if (avatarComponentView8 == null) {
                    avatarComponentView8 = null;
                }
                ObjectAnimator objectAnimatorLLLLZLL5 = EnlargeAvatarActivity.LLLLZLL(enlargeAvatarActivity3.LLLLZLLIL().LJ, enlargeAvatarActivity3.LLLLZLLIL().LIZJ + intExtra, avatarComponentView8, "x");
                float intExtra2 = (enlargeAvatarActivity3.getIntent().getIntExtra("avatar_height", 0) - enlargeAvatarActivity3.LLLLZLLIL().LJII) / f6;
                AvatarComponentView avatarComponentView9 = enlargeAvatarActivity3.LLILZIL;
                if (avatarComponentView9 == null) {
                    avatarComponentView9 = null;
                }
                ObjectAnimator objectAnimatorLLLLZLL6 = EnlargeAvatarActivity.LLLLZLL(enlargeAvatarActivity3.LLLLZLLIL().LJFF, enlargeAvatarActivity3.LLLLZLLIL().LIZLLL + intExtra2, avatarComponentView9, "y");
                AvatarComponentView avatarComponentView10 = enlargeAvatarActivity3.LLILZIL;
                if (avatarComponentView10 == null) {
                    avatarComponentView10 = null;
                }
                ObjectAnimator objectAnimatorLLLLZLL7 = EnlargeAvatarActivity.LLLLZLL(1.0f, 1.0f / enlargeAvatarActivity3.LLLLZLLIL().LJIIJJI, avatarComponentView10, "scaleX");
                AvatarComponentView avatarComponentView11 = enlargeAvatarActivity3.LLILZIL;
                if (avatarComponentView11 == null) {
                    avatarComponentView11 = null;
                }
                ObjectAnimator objectAnimatorLLLLZLL8 = EnlargeAvatarActivity.LLLLZLL(1.0f, 1.0f / enlargeAvatarActivity3.LLLLZLLIL().LJIIJJI, avatarComponentView11, "scaleY");
                AvatarComponentView avatarComponentView12 = enlargeAvatarActivity3.LLILZIL;
                if (avatarComponentView12 == null) {
                    avatarComponentView12 = null;
                }
                View view3 = (View) avatarComponentView12.getParent();
                ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(C475630Ikz.LIZIZ(R.attr.e1, enlargeAvatarActivity3), 0);
                valueAnimatorOfArgb2.addUpdateListener(new AUListenerS256S0100000_6(view3, 137));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorLLLLZLL5, objectAnimatorLLLLZLL6, objectAnimatorLLLLZLL7, objectAnimatorLLLLZLL8, valueAnimatorOfArgb2);
                animatorSet2.setDuration(200L);
                animatorSet2.setInterpolator(C1619980sG4.LJIILIIL());
                enlargeAvatarActivity3.LLJ = animatorSet2;
            } else {
                AnimatorSet animatorSetLLLLZIL = ((EnlargeAvatarActivity) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LLLLZIL();
                EnlargeAvatarActivity enlargeAvatarActivity4 = (EnlargeAvatarActivity) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0;
                animatorSetLLLLZIL.start();
                AvatarComponentView avatarComponentView13 = enlargeAvatarActivity4.LLILZIL;
                if (avatarComponentView13 == null) {
                    avatarComponentView13 = null;
                }
                int height4 = avatarComponentView13.getHeight();
                float[][] fArr3 = enlargeAvatarActivity4.LLJILJILJ;
                if (fArr3 == null) {
                    fArr3 = null;
                }
                float f7 = fArr3[1][1];
                float f8 = height4;
                float f9 = enlargeAvatarActivity4.LLJI;
                float fLIZ2 = C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZ((f7 - (((f9 - 1) * f8) / 2)) + (f8 * f9));
                User user4 = enlargeAvatarActivity4.LLILZLL;
                if (user4 != null && (profileBadge = user4.getProfileBadge()) != null && profileBadge.getShouldShow() && !enlargeAvatarActivity4.LLIZ) {
                    linearLayout = enlargeAvatarActivity4.LLJJJJ;
                    if (linearLayout != null) {
                        layoutParams = linearLayout.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                } else {
                    linearLayout = enlargeAvatarActivity4.LLIZLLLIL;
                    if (linearLayout == null) {
                        linearLayout = null;
                        layoutParams = null;
                    }
                    layoutParams = linearLayout.getLayoutParams();
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = (int) fLIZ2;
                    }
                } else {
                    marginLayoutParams = null;
                }
                if (linearLayout != null) {
                    C786410Ut5.d6(linearLayout, marginLayoutParams);
                }
                EnlargeAvatarActivity enlargeAvatarActivity5 = (EnlargeAvatarActivity) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0;
                AnimatorSet animatorSetLLLLZIL2 = enlargeAvatarActivity5.LLLLZIL();
                Object obj = ListProtector.get(animatorSetLLLLZIL2.getChildAnimations(), 0);
                if (obj instanceof ObjectAnimator) {
                    objectAnimator = (ObjectAnimator) obj;
                } else {
                    objectAnimator = null;
                }
                Object obj2 = ListProtector.get(animatorSetLLLLZIL2.getChildAnimations(), 1);
                if (obj2 instanceof ObjectAnimator) {
                    objectAnimator2 = (ObjectAnimator) obj2;
                } else {
                    objectAnimator2 = null;
                }
                if (C268330AfP.LJIIL()) {
                    pair = new Pair(0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                } else if (enlargeAvatarActivity5.LLLLZLLLI()) {
                    int iLIZIZ2 = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84))) / 2;
                    pair = new Pair(Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ2 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                } else {
                    pair = new Pair(0, 0);
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                float[][] fArr4 = enlargeAvatarActivity5.LLJILJILJ;
                if (fArr4 == null) {
                    fArr = null;
                } else {
                    fArr = fArr4;
                }
                float f10 = fArr[0][0] + iIntValue;
                if (fArr4 == null) {
                    fArr2 = null;
                } else {
                    fArr2 = fArr4;
                }
                float f11 = fArr2[1][0] + iIntValue2;
                if (objectAnimator != null) {
                    float[] fArr5 = new float[2];
                    if (fArr4 == null) {
                        fArr4 = null;
                    }
                    fArr5[0] = fArr4[0][1];
                    fArr5[1] = f10;
                    objectAnimator.setFloatValues(fArr5);
                }
                if (objectAnimator2 != null) {
                    float[] fArr6 = new float[2];
                    float[][] fArr7 = enlargeAvatarActivity5.LLJILJILJ;
                    if (fArr7 == null) {
                        fArr7 = null;
                    }
                    fArr6[0] = fArr7[1][1];
                    fArr6[1] = f11;
                    objectAnimator2.setFloatValues(fArr6);
                }
                Object obj3 = ListProtector.get(animatorSetLLLLZIL2.getChildAnimations(), 2);
                if (obj3 instanceof ObjectAnimator) {
                    objectAnimator3 = (ObjectAnimator) obj3;
                } else {
                    objectAnimator3 = null;
                }
                Object obj4 = ListProtector.get(animatorSetLLLLZIL2.getChildAnimations(), 3);
                if (obj4 instanceof ObjectAnimator) {
                    objectAnimator4 = (ObjectAnimator) obj4;
                } else {
                    objectAnimator4 = null;
                }
                if (objectAnimator3 != null) {
                    i = 2;
                    i2 = 0;
                    f = 1.0f;
                    objectAnimator3.setFloatValues(enlargeAvatarActivity5.LLJI, 1.0f);
                } else {
                    i = 2;
                    f = 1.0f;
                    i2 = 0;
                }
                if (objectAnimator4 != null) {
                    float[] fArr8 = new float[i];
                    fArr8[i2] = enlargeAvatarActivity5.LLJI;
                    fArr8[1] = f;
                    objectAnimator4.setFloatValues(fArr8);
                }
                animatorSetLLLLZIL2.setDuration(200L);
                animatorSetLLLLZIL2.setInterpolator(C1619980sG4.LJIILIIL());
                AvatarComponentView avatarComponentView14 = enlargeAvatarActivity5.LLILZIL;
                if (avatarComponentView14 == null) {
                    avatarComponentView14 = null;
                }
                View view4 = (View) avatarComponentView14.getParent();
                int[] iArr = new int[2];
                iArr[i2] = C475630Ikz.LIZIZ(R.attr.e1, enlargeAvatarActivity5);
                iArr[1] = i2;
                ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(iArr);
                valueAnimatorOfArgb3.addUpdateListener(new AUListenerS256S0100000_6(view4, 136));
                animatorSetLLLLZIL2.play(valueAnimatorOfArgb3);
                enlargeAvatarActivity5.LLJ = animatorSetLLLLZIL2;
            }
            AvatarComponentView avatarComponentView15 = ((EnlargeAvatarActivity) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LLILZIL;
            if (avatarComponentView15 == null) {
                avatarComponentView15 = null;
            }
            C786410Ut5.C3(avatarComponentView15.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265990j37);
        }
    }

    public static final void onGlobalLayout$8(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        C786410Ut5.C3(((C1253900ijc) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265990j37);
        ((C1253900ijc) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LIZ();
    }

    public static final void onGlobalLayout$9(ViewTreeObserverOnGlobalLayoutListenerC1265990j37 viewTreeObserverOnGlobalLayoutListenerC1265990j37) {
        if (((C1214930hil) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).getWidth() > 0 && ((C1214930hil) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LL.getWidth() > 0) {
            C1214930hil c1214930hil = (C1214930hil) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0;
            c1214930hil.LLILZ = true;
            C786410Ut5.C3(c1214930hil.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265990j37);
            ((C1214930hil) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LJII();
            ((C1214930hil) viewTreeObserverOnGlobalLayoutListenerC1265990j37.l0).LJI();
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1265990j37(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
