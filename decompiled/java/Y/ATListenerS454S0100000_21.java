package Y;

import X.AbstractC736370SuZ;
import X.C013C;
import X.C09RD;
import X.C0I0B;
import X.C1345550l7R;
import X.C1352150lI5;
import X.C1353310lJx;
import X.C1353320lJy;
import X.C1353500lKG;
import X.C1368810lix;
import X.C1368970ljD;
import X.C1373650lql;
import X.C1388190mED;
import X.C1389920mH0;
import X.C1390030mHB;
import X.C1391630mJl;
import X.C1391690mJr;
import X.C1558520qew;
import X.C294180Bg0;
import X.C786410Ut5;
import X.EnumC994470bzB;
import X.InterfaceC1368360liE;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentDoubleTapToLikeGuideFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerGuideAssem;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import com.ss.android.ugc.aweme.internalshare.impl.effectshare.EffectShareFragment;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public class ATListenerS454S0100000_21 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ boolean onTouch$13(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        return ((Boolean) ((Function2) aTListenerS454S0100000_21.l0).invoke(view, motionEvent)).booleanValue();
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
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return onTouch$17(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return onTouch$18(this, view, motionEvent);
            case 19:
                return onTouch$19(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return onTouch$20(this, view, motionEvent);
            case 21:
                return onTouch$21(this, view, motionEvent);
            case 22:
                return onTouch$22(this, view, motionEvent);
            case 23:
                return onTouch$23(this, view, motionEvent);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return onTouch$24(this, view, motionEvent);
            case 25:
                return onTouch$25(this, view, motionEvent);
            case 26:
                return onTouch$26(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS454S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        Dialog dialogLIZ;
        Window window;
        Dialog dialogLIZ2;
        Window window2;
        if (motionEvent.getActionMasked() == 0) {
            ((ILogger) ServiceManager.get().getService(ILogger.class)).LIZJ("share", C0I0B.LJFF.LIZIZ());
            C1368810lix c1368810lix = (C1368810lix) aTListenerS454S0100000_21.l0;
            Fragment fragment = c1368810lix.LLJIJIL.LIZIZ;
            if ((fragment instanceof EffectShareFragment) && fragment != null) {
                InterfaceC1368360liE interfaceC1368360liE = c1368810lix.LIZJ().LJI;
                if (interfaceC1368360liE != null && (dialogLIZ2 = interfaceC1368360liE.LIZ()) != null && (window2 = dialogLIZ2.getWindow()) != null) {
                    window2.setSoftInputMode(16);
                }
            } else {
                InterfaceC1368360liE interfaceC1368360liE2 = c1368810lix.LIZJ().LJI;
                if (interfaceC1368360liE2 != null && (dialogLIZ = interfaceC1368360liE2.LIZ()) != null && (window = dialogLIZ.getWindow()) != null) {
                    window.setSoftInputMode(32);
                }
            }
            C1368810lix c1368810lix2 = (C1368810lix) aTListenerS454S0100000_21.l0;
            c1368810lix2.getClass();
            c1368810lix2.LLJJIJIIJIL = EnumC994470bzB.ANIMATE;
            EditText editText = c1368810lix2.LLJILJILJ;
            if (editText != null) {
                editText.requestFocus();
            }
            EditText editText2 = c1368810lix2.LLJILJILJ;
            if (editText2 != null) {
                HandlerHook.viewPost(editText2, new ARunnableS121S0100000_21(c1368810lix2, 9));
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$1(Y.ATListenerS454S0100000_21 r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS454S0100000_21.onTouch$1(Y.ATListenerS454S0100000_21, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$10(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    C1345550l7R c1345550l7R = (C1345550l7R) aTListenerS454S0100000_21.l0;
                    if (c1345550l7R.LLJJL) {
                        c1345550l7R.LJII();
                    }
                }
            } else {
                C1345550l7R c1345550l7R2 = (C1345550l7R) aTListenerS454S0100000_21.l0;
                if (c1345550l7R2.LLJJL) {
                    c1345550l7R2.LLJJL = false;
                    if (!c1345550l7R2.LLJJJJLIIL) {
                        c1345550l7R2.LIZLLL();
                        return true;
                    }
                }
            }
        } else {
            C1345550l7R c1345550l7R3 = (C1345550l7R) aTListenerS454S0100000_21.l0;
            if (!c1345550l7R3.LLJJJJLIIL && !c1345550l7R3.getLikeVM().LLILLL) {
                C1345550l7R c1345550l7R4 = (C1345550l7R) aTListenerS454S0100000_21.l0;
                c1345550l7R4.LLJJL = true;
                Comment comment = c1345550l7R4.LLILLL;
                if (comment != null && comment.isUserBuried()) {
                    if (!C294180Bg0.LIZ() && (animatorSet2 = ((C1345550l7R) aTListenerS454S0100000_21.l0).LLJJLIIIJLLLLLLLZ) != null) {
                        animatorSet2.start();
                        return true;
                    }
                } else if (!C294180Bg0.LIZ() && (animatorSet = ((C1345550l7R) aTListenerS454S0100000_21.l0).LLJL) != null) {
                    animatorSet.start();
                    return true;
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$11(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ((ILogger) ServiceManager.get().getService(ILogger.class)).LIZJ("share", C0I0B.LJFF.LIZIZ());
            ((C1368970ljD) aTListenerS454S0100000_21.l0).LLILZ.requestFocus();
            KeyboardUtils.LIZLLL(((C1368970ljD) aTListenerS454S0100000_21.l0).LLILZ);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$12(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        CharSequence text;
        if (motionEvent.getActionMasked() != 1) {
            return true;
        }
        for (View view2 : new C09RD(((C1373650lql) aTListenerS454S0100000_21.l0).LLILLJJLI)) {
            Rect rect = new Rect();
            view2.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                TuxTextView tuxTextView = (TuxTextView) view2;
                CharSequence text2 = tuxTextView.getText();
                TuxTextView tuxTextView2 = ((C1373650lql) aTListenerS454S0100000_21.l0).LLILLL;
                AbstractC736370SuZ abstractC736370SuZ = null;
                if (tuxTextView2 != null) {
                    text = tuxTextView2.getText();
                } else {
                    text = null;
                }
                if (text2.equals(text)) {
                    return true;
                }
                C1373650lql c1373650lql = (C1373650lql) aTListenerS454S0100000_21.l0;
                TuxTextView tuxTextView3 = c1373650lql.LLILLL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColor(c1373650lql.getContext().getResources().getColor(R.color.di));
                }
                C1373650lql c1373650lql2 = (C1373650lql) aTListenerS454S0100000_21.l0;
                c1373650lql2.LLILLL = tuxTextView;
                tuxTextView.setTextColor(c1373650lql2.getContext().getResources().getColor(R.color.da));
                view2.setBackgroundColor(((C1373650lql) aTListenerS454S0100000_21.l0).getContext().getResources().getColor(R.color.av));
                AbstractC736370SuZ abstractC736370SuZ2 = ((C1373650lql) aTListenerS454S0100000_21.l0).LLILZ;
                if (abstractC736370SuZ2 != null) {
                    abstractC736370SuZ = abstractC736370SuZ2;
                }
                abstractC736370SuZ.LJII(view2);
            }
        }
        return true;
    }

    public static final boolean onTouch$14(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        SkeletonSharePanelFragment skeletonSharePanelFragment = (SkeletonSharePanelFragment) aTListenerS454S0100000_21.l0;
        if (!skeletonSharePanelFragment.LLJJJIL || motionEvent == null) {
            return false;
        }
        if (skeletonSharePanelFragment.yS(motionEvent)) {
            ((SkeletonSharePanelFragment) aTListenerS454S0100000_21.l0).LJJIL();
            return false;
        }
        return true;
    }

    public static final boolean onTouch$15(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        SkeletonSharePanelFragment skeletonSharePanelFragment = (SkeletonSharePanelFragment) aTListenerS454S0100000_21.l0;
        if (!skeletonSharePanelFragment.LLJJJIL || motionEvent == null) {
            return false;
        }
        if (skeletonSharePanelFragment.yS(motionEvent)) {
            ((SkeletonSharePanelFragment) aTListenerS454S0100000_21.l0).LJJIL();
            return false;
        }
        return true;
    }

    public static final boolean onTouch$16(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    C1353310lJx c1353310lJx = (C1353310lJx) aTListenerS454S0100000_21.l0;
                    if (c1353310lJx.LJIIJ) {
                        c1353310lJx.LJI(true);
                    }
                }
            } else {
                C1353310lJx c1353310lJx2 = (C1353310lJx) aTListenerS454S0100000_21.l0;
                if (c1353310lJx2.LJIIJ) {
                    c1353310lJx2.LJIIJ = false;
                    if (!c1353310lJx2.LJIIIZ) {
                        c1353310lJx2.LJ();
                        return true;
                    }
                }
            }
        } else {
            C1353310lJx c1353310lJx3 = (C1353310lJx) aTListenerS454S0100000_21.l0;
            if (!c1353310lJx3.LJIIIZ) {
                c1353310lJx3.LJIIJ = true;
                Comment comment = c1353310lJx3.LIZ;
                if (comment != null && comment.isUserDigged()) {
                    AnimatorSet animatorSet = ((C1353310lJx) aTListenerS454S0100000_21.l0).LJIIJJI;
                    if (animatorSet != null) {
                        animatorSet.start();
                        return true;
                    }
                } else {
                    AnimatorSet animatorSet2 = ((C1353310lJx) aTListenerS454S0100000_21.l0).LJIIL;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$17(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    C1353310lJx c1353310lJx = (C1353310lJx) aTListenerS454S0100000_21.l0;
                    if (c1353310lJx.LJIILLIIL) {
                        c1353310lJx.LJFF(true);
                    }
                }
            } else {
                C1353310lJx c1353310lJx2 = (C1353310lJx) aTListenerS454S0100000_21.l0;
                if (c1353310lJx2.LJIILLIIL) {
                    c1353310lJx2.LJIILLIIL = false;
                    if (!c1353310lJx2.LJIILL) {
                        c1353310lJx2.LIZLLL();
                        return true;
                    }
                }
            }
        } else {
            C1353310lJx c1353310lJx3 = (C1353310lJx) aTListenerS454S0100000_21.l0;
            if (!c1353310lJx3.LJIILL) {
                c1353310lJx3.LJIILLIIL = true;
                Comment comment = c1353310lJx3.LIZ;
                if (comment != null && comment.isUserBuried()) {
                    AnimatorSet animatorSet = ((C1353310lJx) aTListenerS454S0100000_21.l0).LJIIZILJ;
                    if (animatorSet != null) {
                        animatorSet.start();
                        return true;
                    }
                } else {
                    AnimatorSet animatorSet2 = ((C1353310lJx) aTListenerS454S0100000_21.l0).LJIJ;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$18(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (((C1353500lKG) aTListenerS454S0100000_21.l0).isFocused() || ((C1353500lKG) aTListenerS454S0100000_21.l0).isFocusable() || ((C1353500lKG) aTListenerS454S0100000_21.l0).isFocusableInTouchMode()) {
            ((C1353500lKG) aTListenerS454S0100000_21.l0).setFocusable(false);
            ((C1353500lKG) aTListenerS454S0100000_21.l0).setFocusableInTouchMode(false);
        }
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r1 != 3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$19(Y.ATListenerS454S0100000_21 r4, android.view.View r5, android.view.MotionEvent r6) {
        /*
            int r1 = r6.getAction()
            r3 = 0
            r2 = 1
            if (r1 == r2) goto L28
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto L28
        Le:
            return r3
        Lf:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment r0 = (com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment) r0
            X.0I7D r1 = r0.LLILZ
            if (r1 == 0) goto Le
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 != r2) goto Le
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment r0 = (com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment) r0
            X.C1391190mJ3.LJIIZILJ(r0, r3)
            return r3
        L28:
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment r0 = (com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment) r0
            X.C1391190mJ3.LJIIZILJ(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS454S0100000_21.onTouch$19(Y.ATListenerS454S0100000_21, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$2(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    C1353320lJy c1353320lJy = (C1353320lJy) aTListenerS454S0100000_21.l0;
                    if (c1353320lJy.LLJILJILJ) {
                        c1353320lJy.LJI(true);
                    }
                }
            } else {
                C1353320lJy c1353320lJy2 = (C1353320lJy) aTListenerS454S0100000_21.l0;
                if (c1353320lJy2.LLJILJILJ) {
                    c1353320lJy2.LLJILJILJ = false;
                    if (!c1353320lJy2.LLJILJIL) {
                        c1353320lJy2.LIZLLL();
                        return true;
                    }
                }
            }
        } else {
            C1353320lJy c1353320lJy3 = (C1353320lJy) aTListenerS454S0100000_21.l0;
            if (!c1353320lJy3.LLJILJIL) {
                c1353320lJy3.LLJILJILJ = true;
                Comment comment = c1353320lJy3.LLILLJJLI;
                if (comment != null && comment.isUserDigged()) {
                    AnimatorSet animatorSet = ((C1353320lJy) aTListenerS454S0100000_21.l0).LLJILLL;
                    if (animatorSet != null) {
                        animatorSet.start();
                        return true;
                    }
                } else {
                    AnimatorSet animatorSet2 = ((C1353320lJy) aTListenerS454S0100000_21.l0).LLJJ;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$20(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && (((NowFakeCommentInputAssem) aTListenerS454S0100000_21.l0).hp().isFocused() || ((NowFakeCommentInputAssem) aTListenerS454S0100000_21.l0).hp().isFocusable() || ((NowFakeCommentInputAssem) aTListenerS454S0100000_21.l0).hp().isFocusableInTouchMode())) {
            ((NowFakeCommentInputAssem) aTListenerS454S0100000_21.l0).hp().setFocusable(false);
            ((NowFakeCommentInputAssem) aTListenerS454S0100000_21.l0).hp().setFocusableInTouchMode(false);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                return true;
            }
            ((NowFakeCommentInputAssem) aTListenerS454S0100000_21.l0).kp().QK0(((NowFakeCommentInputAssem) aTListenerS454S0100000_21.l0).LLJLIL, "click_input_box");
            C1352150lI5.LIZ(System.currentTimeMillis(), "click_input_box");
            return true;
        }
        return true;
    }

    public static final boolean onTouch$21(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        boolean z;
        C1389920mH0 c1389920mH0 = ((C1390030mHB) aTListenerS454S0100000_21.l0).LLIZLLLIL.LIZ;
        if (c1389920mH0.LJIIJJI && !c1389920mH0.LJII) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        View view2 = null;
        if (motionEvent.getAction() == 0) {
            C1390030mHB c1390030mHB = (C1390030mHB) aTListenerS454S0100000_21.l0;
            int[] iArr = new int[2];
            View view3 = c1390030mHB.LLJ;
            if (view3 == null) {
                view3 = null;
            }
            view3.findViewById(R.id.evm).getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            View view4 = c1390030mHB.LLJ;
            if (view4 == null) {
                view4 = null;
            }
            View viewFindViewById = view4.findViewById(R.id.evm);
            int measuredWidth = viewFindViewById.getMeasuredWidth() + i;
            int measuredHeight = viewFindViewById.getMeasuredHeight() + i2;
            if (i2 <= rawY && rawY <= measuredHeight && i <= rawX && rawX <= measuredWidth) {
                z = true;
            } else {
                z = false;
            }
            c1390030mHB.LLJI = z;
        }
        C1390030mHB c1390030mHB2 = (C1390030mHB) aTListenerS454S0100000_21.l0;
        if (c1390030mHB2.LLJI) {
            return false;
        }
        int[] iArr2 = new int[2];
        View view5 = c1390030mHB2.LLJ;
        if (view5 != null) {
            view2 = view5;
        }
        view2.getLocationOnScreen(iArr2);
        motionEvent.offsetLocation(iArr2[0], iArr2[1]);
        C1390030mHB c1390030mHB3 = (C1390030mHB) aTListenerS454S0100000_21.l0;
        View view6 = c1390030mHB3.LLIZLLLIL.LJIIIZ;
        if (view6 != null) {
            if (view6.isAttachedToWindow()) {
                view6.dispatchTouchEvent(motionEvent);
            }
        } else {
            Activity activityLIZ = C1388190mED.LIZ(c1390030mHB3.LLILZLL);
            if (activityLIZ != null) {
                activityLIZ.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$22(Y.ATListenerS454S0100000_21 r11, android.view.View r12, android.view.MotionEvent r13) {
        /*
            float r0 = r13.getRawX()
            int r9 = (int) r0
            float r0 = r13.getRawY()
            int r8 = (int) r0
            int r0 = r13.getAction()
            r4 = 0
            r6 = 2
            r10 = 1
            r7 = 0
            if (r0 != 0) goto L44
            java.lang.Object r5 = r11.l0
            X.0mHH r5 = (X.C1390090mHH) r5
            int[] r2 = new int[r6]
            android.view.View r1 = r5.LLJ
            if (r1 != 0) goto L1f
            r1 = r4
        L1f:
            r0 = 2131394997(0x7f0a81b5, float:1.8410694E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L71
            r0.getLocationOnScreen(r2)
            r3 = r2[r7]
            r2 = r2[r10]
            int r1 = r0.getMeasuredWidth()
            int r1 = r1 + r3
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 + r2
            if (r2 > r8) goto L71
            if (r8 > r0) goto L71
            if (r3 > r9) goto L71
            if (r9 > r1) goto L71
            r0 = 1
        L42:
            r5.LLJILJIL = r0
        L44:
            java.lang.Object r1 = r11.l0
            X.0mHH r1 = (X.C1390090mHH) r1
            boolean r0 = r1.LLJILJIL
            if (r0 == 0) goto L4e
            r10 = 0
        L4d:
            return r10
        L4e:
            int[] r2 = new int[r6]
            android.view.View r0 = r1.LLJ
            if (r0 == 0) goto L55
            r4 = r0
        L55:
            r4.getLocationOnScreen(r2)
            r0 = r2[r7]
            float r1 = (float) r0
            r0 = r2[r10]
            float r0 = (float) r0
            r13.offsetLocation(r1, r0)
            java.lang.Object r0 = r11.l0
            X.0mHH r0 = (X.C1390090mHH) r0
            android.content.Context r0 = r0.LLILZLL
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            if (r0 == 0) goto L4d
            r0.dispatchTouchEvent(r13)
            return r10
        L71:
            r0 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS454S0100000_21.onTouch$22(Y.ATListenerS454S0100000_21, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$23(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (((C1353500lKG) aTListenerS454S0100000_21.l0).isFocused() || ((C1353500lKG) aTListenerS454S0100000_21.l0).isFocusable() || ((C1353500lKG) aTListenerS454S0100000_21.l0).isFocusableInTouchMode()) {
            ((C1353500lKG) aTListenerS454S0100000_21.l0).setFocusable(false);
            ((C1353500lKG) aTListenerS454S0100000_21.l0).setFocusableInTouchMode(false);
        }
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }

    public static final boolean onTouch$24(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            ((PollCell) aTListenerS454S0100000_21.l0).T5();
            PollCell pollCell = (PollCell) aTListenerS454S0100000_21.l0;
            ConstraintLayout constraintLayout = pollCell.LL;
            if (constraintLayout == null) {
                return false;
            }
            constraintLayout.setBackground(pollCell.LLJL);
            return false;
        }
        PollCell pollCell2 = (PollCell) aTListenerS454S0100000_21.l0;
        C786410Ut5.LJLIIL(100L, pollCell2.LLJLILLLLZIIL, pollCell2.LLJLL);
        return false;
    }

    public static final boolean onTouch$25(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            ((PollCell) aTListenerS454S0100000_21.l0).T5();
            PollCell pollCell = (PollCell) aTListenerS454S0100000_21.l0;
            ConstraintLayout constraintLayout = pollCell.LL;
            if (constraintLayout == null) {
                return false;
            }
            constraintLayout.setBackground(pollCell.LLJL);
            return false;
        }
        PollCell pollCell2 = (PollCell) aTListenerS454S0100000_21.l0;
        if (pollCell2.LLJ) {
            C786410Ut5.LJLIIL(0L, pollCell2.LLJLILLLLZIIL, pollCell2.LLJLL);
            return false;
        }
        C786410Ut5.LJLIIL(100L, pollCell2.LLJLILLLLZIIL, pollCell2.LLJLL);
        return false;
    }

    public static final boolean onTouch$26(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C1391630mJl c1391630mJl = (C1391630mJl) aTListenerS454S0100000_21.l0;
            c1391630mJl.LLIZ = C1391690mJr.LIZ;
            c1391630mJl.LIZIZ();
        }
        return ((C1391630mJl) aTListenerS454S0100000_21.l0).LLILZIL.LJIJJLI;
    }

    public static final boolean onTouch$3(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    C1353320lJy c1353320lJy = (C1353320lJy) aTListenerS454S0100000_21.l0;
                    if (c1353320lJy.LLJJIJIIJIL) {
                        c1353320lJy.LJ(true);
                    }
                }
            } else {
                C1353320lJy c1353320lJy2 = (C1353320lJy) aTListenerS454S0100000_21.l0;
                if (c1353320lJy2.LLJJIJIIJIL) {
                    c1353320lJy2.LLJJIJIIJIL = false;
                    if (!c1353320lJy2.LLJJIJI) {
                        c1353320lJy2.LIZJ();
                        return true;
                    }
                }
            }
        } else {
            C1353320lJy c1353320lJy3 = (C1353320lJy) aTListenerS454S0100000_21.l0;
            if (!c1353320lJy3.LLJJIJI) {
                c1353320lJy3.LLJJIJIIJIL = true;
                Comment comment = c1353320lJy3.LLILLJJLI;
                if (comment != null && comment.isUserBuried()) {
                    AnimatorSet animatorSet = ((C1353320lJy) aTListenerS454S0100000_21.l0).LLJJIJIL;
                    if (animatorSet != null) {
                        animatorSet.start();
                        return true;
                    }
                } else {
                    AnimatorSet animatorSet2 = ((C1353320lJy) aTListenerS454S0100000_21.l0).LLJJJ;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$4(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            ((CommentDoubleTapToLikeGuideFragment) aTListenerS454S0100000_21.l0).MR("action_disappear");
            view.performClick();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (((View) aTListenerS454S0100000_21.l0).isFocused() || ((View) aTListenerS454S0100000_21.l0).isFocusable() || ((View) aTListenerS454S0100000_21.l0).isFocusableInTouchMode()) {
            ((View) aTListenerS454S0100000_21.l0).setFocusable(false);
            ((View) aTListenerS454S0100000_21.l0).setFocusableInTouchMode(false);
        }
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }

    public static final boolean onTouch$6(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (((C1353500lKG) aTListenerS454S0100000_21.l0).isFocused() || ((C1353500lKG) aTListenerS454S0100000_21.l0).isFocusable() || ((C1353500lKG) aTListenerS454S0100000_21.l0).isFocusableInTouchMode()) {
            ((C1353500lKG) aTListenerS454S0100000_21.l0).setFocusable(false);
            ((C1353500lKG) aTListenerS454S0100000_21.l0).setFocusableInTouchMode(false);
        }
        if (motionEvent.getAction() == 1) {
            view.performClick();
        }
        return true;
    }

    public static final boolean onTouch$7(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            ICommentMentionAssemAbility iCommentMentionAssemAbility = (ICommentMentionAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL((CommonCommentKeyboard) aTListenerS454S0100000_21.l0), ICommentMentionAssemAbility.class, null);
            if (iCommentMentionAssemAbility != null && iCommentMentionAssemAbility.f40()) {
                iCommentMentionAssemAbility.A51(true);
                return true;
            }
            CommonCommentKeyboard commonCommentKeyboard = (CommonCommentKeyboard) aTListenerS454S0100000_21.l0;
            commonCommentKeyboard.withState(commonCommentKeyboard.ip(), new AwS600S0100000_21((CommonCommentKeyboard) aTListenerS454S0100000_21.l0, 53));
            return true;
        }
        C013C c013c = new C013C();
        CommonCommentKeyboard commonCommentKeyboard2 = (CommonCommentKeyboard) aTListenerS454S0100000_21.l0;
        commonCommentKeyboard2.withState(commonCommentKeyboard2.ip(), new AwS387S0200000_21((CommonCommentKeyboard) aTListenerS454S0100000_21.l0, c013c, 10));
        return c013c.element;
    }

    public static final boolean onTouch$8(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C786410Ut5.LJLLLLLL(8, ((CommentInnerGuideAssem) aTListenerS454S0100000_21.l0).LJJIJL());
        }
        return true;
    }

    public static final boolean onTouch$9(ATListenerS454S0100000_21 aTListenerS454S0100000_21, View view, MotionEvent motionEvent) {
        boolean zLJI = MethodIDManager.LJI(71998);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    C1345550l7R c1345550l7R = (C1345550l7R) aTListenerS454S0100000_21.l0;
                    if (c1345550l7R.LLJJIJIL) {
                        c1345550l7R.LJIIIIZZ();
                    }
                }
            } else {
                C1345550l7R c1345550l7R2 = (C1345550l7R) aTListenerS454S0100000_21.l0;
                if (c1345550l7R2.LLJJIJIL) {
                    c1345550l7R2.LLJJIJIL = false;
                    if (!c1345550l7R2.LLJJIJIIJIL && (!C294180Bg0.LIZ() || !((C1345550l7R) aTListenerS454S0100000_21.l0).LLJJJJLIIL)) {
                        ((C1345550l7R) aTListenerS454S0100000_21.l0).LJ("click_button");
                    }
                }
            }
        } else {
            C1345550l7R c1345550l7R3 = (C1345550l7R) aTListenerS454S0100000_21.l0;
            if (!c1345550l7R3.LLJJIJIIJIL && !c1345550l7R3.getLikeVM().LLILLL && (!C294180Bg0.LIZ() || !((C1345550l7R) aTListenerS454S0100000_21.l0).LLJJJJLIIL)) {
                C1345550l7R c1345550l7R4 = (C1345550l7R) aTListenerS454S0100000_21.l0;
                c1345550l7R4.LLJJIJIL = true;
                Comment comment = c1345550l7R4.LLILLL;
                if (comment != null && comment.isUserDigged()) {
                    AnimatorSet animatorSet = ((C1345550l7R) aTListenerS454S0100000_21.l0).LLJJJ;
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                } else {
                    AnimatorSet animatorSet2 = ((C1345550l7R) aTListenerS454S0100000_21.l0).LLJJJIL;
                    if (animatorSet2 != null) {
                        animatorSet2.start();
                    }
                }
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return true;
    }
}
