package Y;

import X.AbstractC1126590fQH;
import X.AnonymousClass0956;
import X.C0KAJ;
import X.C1088150eQH;
import X.C1091350eVR;
import X.C1091360eVS;
import X.C1098550eh3;
import X.C1099130ehz;
import X.C1099770ej1;
import X.C1109770ez9;
import X.C1111050f1D;
import X.C1111120f1K;
import X.C1111130f1L;
import X.C1113190f4f;
import X.C1117630fBp;
import X.C1118100fCa;
import X.C1126970fQt;
import X.C1145830fvJ;
import X.C1149290g0t;
import X.C1161920gLG;
import X.C1322110kVd;
import X.C419610Gcp;
import X.C500260Jjc;
import X.EnumC1087130eOd;
import X.EnumC1091490eVf;
import X.EnumC1117590fBl;
import X.InterfaceC1110630f0X;
import X.InterfaceC1118110fCb;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.billboard.broadcast.LiveBroadcastBillboardWidget;
import com.bytedance.android.livesdk.gallery.setting.GallerySettingDialog;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.share.ShareSettingsDialog;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes18.dex */
public class ATListenerS450S0100000_17 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public ATListenerS450S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && ((C1113190f4f) aTListenerS450S0100000_17.l0).LIZ.canScrollVertically(1)) {
            C1113190f4f.LIZLLL((C1113190f4f) aTListenerS450S0100000_17.l0, EnumC1091490eVf.FOCUS, 6);
            ((C1113190f4f) aTListenerS450S0100000_17.l0).LJIIIIZZ = false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        ((LiveDialogFragment) aTListenerS450S0100000_17.l0).processMotionEvent(motionEvent);
        return false;
    }

    public static final boolean onTouch$10(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        EnumC1117590fBl enumC1117590fBl;
        if (motionEvent.getAction() == 0) {
            ((ShareSettingsDialog) aTListenerS450S0100000_17.l0).getClass();
            boolean z = !ShareSettingsDialog.OR().isOn();
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            Context context = ((ShareSettingsDialog) aTListenerS450S0100000_17.l0).getContext();
            if (z) {
                enumC1117590fBl = EnumC1117590fBl.ON;
            } else {
                enumC1117590fBl = EnumC1117590fBl.OFF;
            }
            C1117630fBp c1117630fBp = new C1117630fBp(enumC1117590fBl, C500260Jjc.LJJLIIIJ(((ShareSettingsDialog) aTListenerS450S0100000_17.l0).dataChannel), C500260Jjc.LJIIZILJ(((ShareSettingsDialog) aTListenerS450S0100000_17.l0).dataChannel));
            final ShareSettingsDialog shareSettingsDialog = (ShareSettingsDialog) aTListenerS450S0100000_17.l0;
            iGiftService.updateSettingSwitch(context, c1117630fBp, new InterfaceC1118110fCb() { // from class: X.0fBj
                @Override // X.InterfaceC1118110fCb
                public final void onCancel() {
                }

                @Override // X.InterfaceC1118110fCb
                public final void onSuccess() {
                    C20743716Ff c20743716FfRR = shareSettingsDialog.RR();
                    shareSettingsDialog.getClass();
                    c20743716FfRR.setChecked(ShareSettingsDialog.OR().isOn());
                }

                @Override // X.InterfaceC1118110fCb
                public final void onError(String str) {
                    if (str.length() == 0) {
                        C766270U4b.LIZLLL(2131842705);
                    } else {
                        C766270U4b.LJIIJJI(str);
                    }
                }
            });
        }
        return true;
    }

    public static final boolean onTouch$11(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (motionEvent.getAction() == 4) {
            Rect rect = (Rect) aTListenerS450S0100000_17.l0;
            if (rawX > rect.left && rawX <= rect.right && rawY > rect.top && rawY <= rect.bottom) {
                C1099770ej1 c1099770ej1 = C1099770ej1.LL;
                C0KAJ c0kaj = C0KAJ.MANUALLY_ROUTE;
                c1099770ej1.getClass();
                C1099770ej1.LIZIZ(true, c0kaj);
            }
            return true;
        }
        return false;
    }

    public static final boolean onTouch$12(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        C1088150eQH c1088150eQH;
        if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (c1088150eQH = ((LiveBroadcastBillboardWidget) aTListenerS450S0100000_17.l0).LLILLL.LJFF) != null) {
            c1088150eQH.LIZ();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$13(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = (GestureDetector) aTListenerS450S0100000_17.l0;
        int i = LikeHelper.LLLJL;
        return gestureDetector.onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$14(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aTListenerS450S0100000_17.l0;
        publicScreenWidget.getClass();
        if (motionEvent.getAction() == 2 && publicScreenWidget.LLJLLIL.LIZ()) {
            publicScreenWidget.d2(EnumC1087130eOd.FOCUS, true);
            publicScreenWidget.LLJJIII = false;
        }
        publicScreenWidget.LLJZ(motionEvent);
        return false;
    }

    public static final boolean onTouch$15(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        if (((AbstractC1126590fQH) aTListenerS450S0100000_17.l0).LLJJ) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f);
            objectAnimatorOfFloat.setDuration(1L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f);
            objectAnimatorOfFloat2.setDuration(1L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.7f);
            objectAnimatorOfFloat3.setDuration(100L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.7f);
            objectAnimatorOfFloat4.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(animatorSet, animatorSet2);
            animatorSet3.start();
        } else {
            if (1 == motionEvent.getAction()) {
                C419610Gcp.LIZIZ(view).start();
                return false;
            }
            if (3 == motionEvent.getAction()) {
                C419610Gcp.LIZIZ(view).start();
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$16(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        Boolean boolValueOf;
        C1109770ez9 c1109770ez9 = ((C1111050f1D) aTListenerS450S0100000_17.l0).LL;
        if (c1109770ez9 != null) {
            boolValueOf = Boolean.valueOf(c1109770ez9.LJJIFFI);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$17(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        C1109770ez9 c1109770ez9;
        InterfaceC1110630f0X interfaceC1110630f0X;
        if (motionEvent != null && (c1109770ez9 = ((C1111050f1D) aTListenerS450S0100000_17.l0).LL) != null && (interfaceC1110630f0X = c1109770ez9.LJIIJJI) != null) {
            interfaceC1110630f0X.LJJJJJL(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$18(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        C1109770ez9 c1109770ez9;
        InterfaceC1110630f0X interfaceC1110630f0X;
        if (motionEvent != null && (c1109770ez9 = ((C1111120f1K) aTListenerS450S0100000_17.l0).LL) != null && (interfaceC1110630f0X = c1109770ez9.LJIIJJI) != null) {
            interfaceC1110630f0X.LJJJJJL(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$19(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        Boolean boolValueOf;
        C1109770ez9 c1109770ez9 = ((C1111120f1K) aTListenerS450S0100000_17.l0).LL;
        if (c1109770ez9 != null) {
            boolValueOf = Boolean.valueOf(c1109770ez9.LJJIFFI);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$2(Y.ATListenerS450S0100000_17 r4, android.view.View r5, android.view.MotionEvent r6) {
        /*
            java.lang.Object r4 = r4.l0
            com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment r4 = (com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment) r4
            X.0eA3 r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L64
            boolean r5 = r0.LIZ(r6)
            if (r5 != 0) goto L16
        Le:
            X.0eGK r0 = r4.LLJ
            if (r0 == 0) goto L16
            boolean r5 = r0.LLJZ(r6)
        L16:
            X.0eAX r0 = r4.LLILZLL
            r3 = 3
            r2 = 2
            if (r0 == 0) goto L4d
            if (r5 == 0) goto L25
            int r1 = r6.getActionMasked()
            r0 = 5
            if (r1 != r0) goto L4d
        L25:
            X.0eAX r0 = r4.LLILZLL
            boolean r5 = r0.onTouchEvent(r6)
        L2b:
            if (r5 != 0) goto L36
            X.0eA1 r0 = r4.LLIZ
            if (r0 == 0) goto L36
            boolean r5 = r0.onTouchEvent(r6)
        L35:
            return r5
        L36:
            X.0eA1 r0 = r4.LLIZ
            if (r0 == 0) goto L35
            int r0 = r6.getActionMasked()
            if (r0 != r2) goto L35
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r6)
            r1.setAction(r3)
            X.0eA1 r0 = r4.LLIZ
            r0.onTouchEvent(r1)
            return r5
        L4d:
            X.0eAX r0 = r4.LLILZLL
            if (r0 == 0) goto L2b
            int r0 = r6.getActionMasked()
            if (r0 != r2) goto L2b
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r6)
            r1.setAction(r3)
            X.0eAX r0 = r4.LLILZLL
            r0.onTouchEvent(r1)
            goto L2b
        L64:
            r5 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS450S0100000_17.onTouch$2(Y.ATListenerS450S0100000_17, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$20(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        Boolean boolValueOf;
        C1109770ez9 c1109770ez9 = ((C1111120f1K) aTListenerS450S0100000_17.l0).LL;
        if (c1109770ez9 != null) {
            boolValueOf = Boolean.valueOf(c1109770ez9.LJJIFFI);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$21(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        C1109770ez9 c1109770ez9;
        InterfaceC1110630f0X interfaceC1110630f0X;
        if (motionEvent != null && (c1109770ez9 = ((C1111130f1L) aTListenerS450S0100000_17.l0).LL) != null && (interfaceC1110630f0X = c1109770ez9.LJIIJJI) != null) {
            interfaceC1110630f0X.LJJJJJL(motionEvent);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$22(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        Boolean boolValueOf;
        C1109770ez9 c1109770ez9 = ((C1111130f1L) aTListenerS450S0100000_17.l0).LL;
        if (c1109770ez9 != null) {
            boolValueOf = Boolean.valueOf(c1109770ez9.LJJIFFI);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$23(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        Boolean boolValueOf;
        C1109770ez9 c1109770ez9 = ((C1111130f1L) aTListenerS450S0100000_17.l0).LL;
        if (c1109770ez9 != null) {
            boolValueOf = Boolean.valueOf(c1109770ez9.LJJIFFI);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$24(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        return ((C1145830fvJ) aTListenerS450S0100000_17.l0).LLILZLL;
    }

    public static final boolean onTouch$3(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ((C1091360eVS) aTListenerS450S0100000_17.l0).getIconImgView().startAnimation(C1091350eVR.LIZ());
                    return false;
                }
                return false;
            }
            ((C1091360eVS) aTListenerS450S0100000_17.l0).getIconImgView().startAnimation(C1091350eVR.LIZ());
            return false;
        }
        C1322110kVd iconImgView = ((C1091360eVS) aTListenerS450S0100000_17.l0).getIconImgView();
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        iconImgView.startAnimation(animationSet);
        return false;
    }

    public static final boolean onTouch$4(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        C1099130ehz c1099130ehz = (C1099130ehz) aTListenerS450S0100000_17.l0;
        c1099130ehz.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            HandlerHook.viewRemoveCallbacks(c1099130ehz.LLILLL, c1099130ehz.LLILZLL);
            return false;
        }
        if (action != 3 && action != 1) {
            return false;
        }
        HandlerHook.viewPostDelay(c1099130ehz.LLILLL, c1099130ehz.LLILZLL, Mp4ScreenVideoLoadTimeout.CONTROL);
        return false;
    }

    public static final boolean onTouch$5(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            ((C1098550eh3) aTListenerS450S0100000_17.l0).LJJIII();
            return false;
        }
        C1098550eh3 c1098550eh3 = (C1098550eh3) aTListenerS450S0100000_17.l0;
        AnonymousClass0956 anonymousClass0956 = c1098550eh3.LLJILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1098550eh3.LLJILLL = null;
        return false;
    }

    public static final boolean onTouch$6(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        return ((C1126970fQt) aTListenerS450S0100000_17.l0).LLLLIL.LIZIZ(motionEvent, view);
    }

    public static final boolean onTouch$7(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        return ((C1149290g0t) aTListenerS450S0100000_17.l0).LIZIZ(motionEvent, view);
    }

    public static final boolean onTouch$8(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        return ((C1149290g0t) aTListenerS450S0100000_17.l0).LIZIZ(motionEvent, view);
    }

    public static final boolean onTouch$9(ATListenerS450S0100000_17 aTListenerS450S0100000_17, View view, MotionEvent motionEvent) {
        EnumC1117590fBl enumC1117590fBl;
        if (motionEvent.getAction() == 0) {
            C1118100fCa.LIZ.getClass();
            boolean z = !C1118100fCa.LIZIZ().isOn();
            final GallerySettingDialog gallerySettingDialog = (GallerySettingDialog) aTListenerS450S0100000_17.l0;
            gallerySettingDialog.getClass();
            Context context = gallerySettingDialog.getContext();
            if (z) {
                enumC1117590fBl = EnumC1117590fBl.ON;
            } else {
                enumC1117590fBl = EnumC1117590fBl.OFF;
            }
            C1118100fCa.LIZJ(context, new C1117630fBp(enumC1117590fBl, C500260Jjc.LJJLIIIJ(gallerySettingDialog.dataChannel), C500260Jjc.LJIIZILJ(gallerySettingDialog.dataChannel)), new InterfaceC1118110fCb() { // from class: X.0fBn
                @Override // X.InterfaceC1118110fCb
                public final void onCancel() {
                }

                @Override // X.InterfaceC1118110fCb
                public final void onSuccess() {
                    C20743716Ff c20743716FfMR = gallerySettingDialog.MR();
                    C1118100fCa.LIZ.getClass();
                    c20743716FfMR.setChecked(C1118100fCa.LIZIZ().isOn());
                }

                @Override // X.InterfaceC1118110fCb
                public final void onError(String str) {
                    if (str.length() == 0) {
                        C766270U4b.LIZLLL(2131842705);
                    } else {
                        C766270U4b.LJIIJJI(str);
                    }
                }
            });
        }
        return true;
    }
}
