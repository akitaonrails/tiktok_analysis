package X;

import Y.ACListenerS120S0200000_17;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS36S0110000_17;
import Y.ARunnableS81S0200000_12;
import Y.AfS186S0100000_17;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop2CardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTop3CardEffectChannel;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.livesetting.gift.HitGalleryRepurchaseGroupSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0fh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136980fh2 extends AbstractC1132750faD implements InterfaceC1137440fhm {
    public C16F5 LJFF;
    public C16F5 LJI;
    public ViewGroup LJII;
    public TextView LJIIIIZZ;
    public ViewGroup LJIIIZ;
    public AppCompatImageView LJIIJ;
    public ConstraintLayout LJIIJJI;
    public C1324720kZq LJIIL;
    public C1324720kZq LJIILIIL;
    public C1324720kZq LJIILJJIL;
    public C19487111Lx LJIILL;
    public ARunnableS36S0110000_17 LJIILLIIL;
    public C1143920fsE LJIIZILJ;
    public C1143920fsE LJIJ;
    public C1143920fsE LJIJI;
    public final ARunnableS112S0100000_12 LJIJJ;
    public final C1136960fh0 LJIJJLI;

    @Override // X.InterfaceC1137250fhT
    public final void LIZJ(Context context) {
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJIIIIZZ(C1135810ff9 c1135810ff9) {
    }

    @Override // X.InterfaceC1137250fhT
    public final void LIZLLL() {
        ViewGroup viewGroup;
        if (!C1133200faw.LIZ(this.LIZIZ) || C1132700fa8.LJI(this.LIZIZ) || (viewGroup = this.LJII) == null || viewGroup.getVisibility() == 0) {
            C500260Jjc.LJIILIIL(this.LJIIIZ);
        } else {
            C500260Jjc.LJIILIIL(this.LJFF);
            C500260Jjc.LLFFF(this.LJIIIZ);
        }
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJII() {
        C16F5 c16f5 = this.LJFF;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, null);
        }
    }

    @Override // X.InterfaceC1137250fhT
    public final void dispose() {
        C16F5 c16f5;
        Handler handler;
        ARunnableS36S0110000_17 aRunnableS36S0110000_17 = this.LJIILLIIL;
        if (aRunnableS36S0110000_17 != null && (c16f5 = this.LJFF) != null && (handler = c16f5.getHandler()) != null) {
            handler.removeCallbacks(aRunnableS36S0110000_17);
        }
        this.LJIILLIIL = null;
        ViewGroup viewGroup = this.LJII;
        if (viewGroup != null) {
            HandlerHook.viewRemoveCallbacks(viewGroup, this.LJIJJ);
        }
        C19487111Lx c19487111Lx = this.LJIILL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LJIILL = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = null;
    }

    @Override // X.InterfaceC1137440fhm
    public final ViewGroup LJI() {
        return this.LJII;
    }

    @Override // X.InterfaceC1137440fhm
    public final C16F5 LJIIL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1137440fhm
    public final TextView LJIILJJIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1137250fhT
    public final InterfaceC1137400fhi LJIILLIIL() {
        return this.LJIJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0fh0] */
    public C1136980fh2(final FrameLayout frameLayout) {
        super(frameLayout);
        this.LJIJJ = new ARunnableS112S0100000_12(this, 20);
        this.LJIJJLI = new InterfaceC1137400fhi() { // from class: X.0fh0
            @Override // X.InterfaceC1137400fhi
            public final void LIZ() {
                TransitionDrawable transitionDrawable;
                TransitionDrawable transitionDrawable2;
                C16F5 c16f5 = this.LIZ.LJFF;
                if (c16f5 != null) {
                    C1137000fh4.LIZ.getClass();
                    C786410Ut5.ac(c16f5, 1.0f);
                    c16f5.setText("");
                    if (!(c16f5.getBackground() instanceof TransitionDrawable)) {
                        c16f5.setBackground(C800330VaR.LIZIZ(c16f5.getContext(), R.drawable.drv));
                    }
                    Drawable background = c16f5.getBackground();
                    if ((background instanceof TransitionDrawable) && (transitionDrawable2 = (TransitionDrawable) background) != null) {
                        transitionDrawable2.resetTransition();
                        C1137000fh4.LJIIJ(c16f5, C800330VaR.LIZIZ(c16f5.getContext(), R.drawable.drx));
                    }
                }
                C16F5 c16f52 = this.LIZ.LJI;
                if (c16f52 != null) {
                    C1137380fhg.LIZ.getClass();
                    if (!(c16f52.getBackground() instanceof TransitionDrawable)) {
                        c16f52.setBackground(C800330VaR.LIZIZ(c16f52.getContext(), R.drawable.drv));
                    }
                    Drawable background2 = c16f52.getBackground();
                    if ((background2 instanceof TransitionDrawable) && (transitionDrawable = (TransitionDrawable) background2) != null) {
                        transitionDrawable.resetTransition();
                        C1137380fhg.LIZ(c16f52, C800330VaR.LIZIZ(c16f52.getContext(), R.drawable.drx));
                    }
                }
                ConstraintLayout constraintLayout = this.LIZ.LJIIJJI;
                if (constraintLayout != null) {
                    C786410Ut5.LL(8, constraintLayout);
                }
                C19487111Lx c19487111Lx = this.LIZ.LJIILL;
                if (c19487111Lx != null) {
                    c19487111Lx.dispose();
                }
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZIZ() {
                TextPaint paint;
                Context context;
                C1077790e9Z c1077790e9Z;
                C1136980fh2 c1136980fh2 = this.LIZ;
                if (C1132700fa8.LJ(c1136980fh2.LIZIZ, c1136980fh2.LIZLLL)) {
                    C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
                    DataChannel dataChannel = this.LIZ.LIZLLL;
                    c1137540fhw.getClass();
                    if (ScalableDowngradeSetting.disableGiftNotifyAnim() && dataChannel != null && (c1077790e9Z = (C1077790e9Z) dataChannel.gg0(LowDevicePerfScalableChannel.class)) != null && c1077790e9Z.LIZIZ.ordinal() <= EnumC1087640ePS.LEVEL_CRITICAL.ordinal()) {
                        C1138230fj3.LIZJ("LiveGiftTrayTagSection", "entryAnimationStart setupRightTagInBigTrayWithoutAnim");
                        C1137000fh4 c1137000fh4 = C1137000fh4.LIZ;
                        C1136980fh2 c1136980fh22 = this.LIZ;
                        C16F5 c16f5 = c1136980fh22.LJFF;
                        C1135810ff9 c1135810ff9 = c1136980fh22.LIZIZ;
                        DataChannel dataChannel2 = c1136980fh22.LIZLLL;
                        c1137000fh4.getClass();
                        C1137000fh4.LJIIJJI(c16f5, c1135810ff9, dataChannel2, true, false);
                    } else if (C1137540fhw.LIZ(this.LIZ.LIZJ)) {
                        C1138230fj3.LIZJ("LiveGiftTrayTagSection", "entryAnimationStart setupRightTagInSmallTrayWithoutAnim");
                        C1137000fh4 c1137000fh42 = C1137000fh4.LIZ;
                        C1136980fh2 c1136980fh23 = this.LIZ;
                        C16F5 c16f52 = c1136980fh23.LJFF;
                        C1135810ff9 c1135810ff92 = c1136980fh23.LIZIZ;
                        DataChannel dataChannel3 = c1136980fh23.LIZLLL;
                        c1137000fh42.getClass();
                        if (c16f52 != null && (context = c16f52.getContext()) != null) {
                            C1137000fh4.LJII(c1135810ff92, dataChannel3, new C5183020f(c16f52, 25));
                            C500260Jjc.LLFFF(c16f52);
                            c16f52.setBackground(C1135990ffR.LJ(context, c1135810ff92));
                        }
                    } else {
                        C1138230fj3.LIZJ("LiveGiftTrayTagSection", "entryAnimationStart setupRightTagInMediumTrayWithAnim");
                        C1137000fh4 c1137000fh43 = C1137000fh4.LIZ;
                        C1136980fh2 c1136980fh24 = this.LIZ;
                        C16F5 c16f53 = c1136980fh24.LJFF;
                        C1135810ff9 c1135810ff93 = c1136980fh24.LIZIZ;
                        DataChannel dataChannel4 = c1136980fh24.LIZLLL;
                        c1137000fh43.getClass();
                        C1137000fh4.LJII(c1135810ff93, dataChannel4, new C5183020f(c16f53, 25));
                        if (c16f53 != null) {
                            C500260Jjc.LLFFF(c16f53);
                        }
                        float fMeasureText = 0.0f;
                        if (c16f53 != null) {
                            C786410Ut5.Rc(c16f53, 0.0f);
                            C786410Ut5.od(c16f53, 0.0f);
                            C786410Ut5.k5(c16f53, 0.0f);
                            if (c16f53 != null) {
                                C786410Ut5.ac(c16f53, 1.3f);
                                C786410Ut5.yc(c16f53, 1.3f);
                                CharSequence text = c16f53.getText();
                                if (text != null && text.length() != 0 && c16f53 != null && (paint = c16f53.getPaint()) != null) {
                                    fMeasureText = paint.measureText(c16f53.getText(), 0, c16f53.getText().length());
                                }
                            }
                        }
                        if (fMeasureText > ((int) C497740JfY.LIZIZ(160.0f)) && c16f53 != null) {
                            c16f53.setTextSize(15.0f);
                        }
                    }
                } else {
                    C16F5 c16f54 = this.LIZ.LJFF;
                    if (c16f54 != null) {
                        C500260Jjc.LJIILIIL(c16f54);
                    }
                    C16F5 c16f55 = this.LIZ.LJI;
                    if (c16f55 != null) {
                        C500260Jjc.LJIILIIL(c16f55);
                    }
                }
                if (!C1133200faw.LIZ(this.LIZ.LIZIZ) || C1132700fa8.LJI(this.LIZ.LIZIZ)) {
                    C500260Jjc.LJIILIIL(this.LIZ.LJIIIZ);
                } else {
                    C500260Jjc.LLFFF(this.LIZ.LJIIIZ);
                    C500260Jjc.LJIILIIL(this.LIZ.LJFF);
                }
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZLLL(boolean z) {
                List<GiftMessage.SponsorshipInfo> list;
                int height;
                int height2;
                int measuredWidth;
                C16F5 c16f5;
                if (z) {
                    C1138230fj3.LIZ("LiveGiftTrayTagSection", "firstSendAnimationEnd showForYouViewIndependently");
                    C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
                    EnumC1136790fgj enumC1136790fgj = this.LIZ.LIZJ;
                    c1137540fhw.getClass();
                    if (C1137540fhw.LIZ(enumC1136790fgj) && (c16f5 = this.LIZ.LJFF) != null) {
                        C1137000fh4.LIZ.getClass();
                        c16f5.setText(C1137000fh4.LIZIZ(true));
                        C500260Jjc.LLFFF(c16f5);
                        return;
                    }
                    return;
                }
                C1133690fbj c1133690fbj = C1133690fbj.LIZ;
                C1135810ff9 c1135810ff9 = this.LIZ.LIZIZ;
                c1133690fbj.getClass();
                if (C1133690fbj.LJ(c1135810ff9) || this.LIZ.LJFF == null) {
                    C1138230fj3.LIZ("LiveGiftTrayTagSection", "firstSendAnimationEnd exit Tray");
                    C1136980fh2 c1136980fh2 = this.LIZ;
                    C1135810ff9 c1135810ff92 = c1136980fh2.LIZIZ;
                    ViewGroup viewGroupLJIJI = null;
                    if (c1135810ff92 != null && (list = c1135810ff92.LJIL) != null) {
                        for (GiftMessage.SponsorshipInfo sponsorshipInfo : list) {
                            int i = sponsorshipInfo.giftTrayStyle;
                            if (i == 1 || i == 2) {
                                if (sponsorshipInfo != null) {
                                    if (!c1135810ff92.LJJJLL) {
                                        HitGalleryRepurchaseGroupSetting hitGalleryRepurchaseGroupSetting = HitGalleryRepurchaseGroupSetting.INSTANCE;
                                        if (hitGalleryRepurchaseGroupSetting.getValue() != 2 && hitGalleryRepurchaseGroupSetting.getValue() != 1) {
                                            return;
                                        }
                                    }
                                    C20441214yg.LIZIZ("LiveGiftTrayTagSection", "tryShowSponsorTitleGifterAnim");
                                    int[] iArr = new int[2];
                                    C16F5 c16f52 = c1136980fh2.LJI;
                                    if (c16f52 != null) {
                                        c16f52.getLocationInWindow(iArr);
                                    }
                                    int[] iArr2 = new int[2];
                                    InterfaceC1136920fgw interfaceC1136920fgw = c1136980fh2.LJ;
                                    if (interfaceC1136920fgw != null && (viewGroupLJIJI = interfaceC1136920fgw.LJIJI()) != null) {
                                        viewGroupLJIJI.getLocationInWindow(iArr2);
                                    }
                                    int i2 = iArr[1];
                                    C16F5 c16f53 = c1136980fh2.LJI;
                                    if (c16f53 != null) {
                                        height = c16f53.getHeight();
                                    } else {
                                        height = 0;
                                    }
                                    int i3 = i2 + (height / 2);
                                    int i4 = iArr2[1];
                                    if (viewGroupLJIJI != null) {
                                        height2 = viewGroupLJIJI.getHeight();
                                    } else {
                                        height2 = 0;
                                    }
                                    int i5 = i4 + height2;
                                    ConstraintLayout constraintLayout = c1136980fh2.LJIIJJI;
                                    if (constraintLayout != null) {
                                        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                                        C16F5 c16f54 = c1136980fh2.LJFF;
                                        if (c16f54 != null) {
                                            measuredWidth = c16f54.getMeasuredWidth();
                                        } else {
                                            measuredWidth = 0;
                                        }
                                        layoutParams.width = (int) ((measuredWidth / 2.0f) + ((int) C497740JfY.LIZIZ(10.0f)));
                                        C786410Ut5.m6(constraintLayout, layoutParams);
                                        C786410Ut5.jd(constraintLayout, i3 - i5);
                                        C786410Ut5.LL(0, constraintLayout);
                                    }
                                    c1136980fh2.LJIJI = new C1143920fsE();
                                    if (C1132700fa8.LJIIL(c1136980fh2.LIZIZ)) {
                                        c1136980fh2.LJIIZILJ = new C1143920fsE();
                                        c1136980fh2.LJIJ = new C1143920fsE();
                                    }
                                    c1136980fh2.LJIILL = (C19487111Lx) new C11IW(C11NZ.LJJJJJL(0L, 2120L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS186S0100000_17(c1136980fh2, 6)).LJJIJIIJI(new AfS186S0100000_17(c1136980fh2, 7)).LJJIIJZLJL(new C1151740g4q(c1136980fh2, 0))).LJIILL().LJIIZILJ();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZJ(boolean z, C1136900fgu c1136900fgu) {
                Object objGg0;
                ViewGroup viewGroup;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator viewPropertyAnimatorScaleX;
                ViewPropertyAnimator viewPropertyAnimatorScaleY;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator interpolator;
                ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
                C16F5 c16f5;
                if (c1136900fgu != null) {
                    if (c1136900fgu.LIZJ > 1) {
                        C1136980fh2 c1136980fh2 = this.LIZ;
                        if (C1132700fa8.LJ(c1136980fh2.LIZIZ, c1136980fh2.LIZLLL) && (c16f5 = this.LIZ.LJFF) != null) {
                            C500260Jjc.LJIILIIL(c16f5);
                        }
                        TextView textView = this.LIZ.LJIIIIZZ;
                        if (textView != null) {
                            textView.setText(C497740JfY.LJIJJ(2131841050, Long.valueOf(c1136900fgu.LIZJ)));
                        }
                        C500260Jjc.LJIILIIL(this.LIZ.LJIIIZ);
                        C1136980fh2 c1136980fh22 = this.LIZ;
                        int i = c1136900fgu.LIZLLL;
                        AppCompatImageView appCompatImageView = c1136980fh22.LJIIJ;
                        if (appCompatImageView != null) {
                            appCompatImageView.setImageResource(C1132700fa8.LIZIZ(i));
                        }
                        C1136980fh2 c1136980fh23 = this.LIZ;
                        ViewGroup viewGroup2 = c1136980fh23.LJII;
                        if (viewGroup2 != null) {
                            C786410Ut5.LJLZ(0, viewGroup2);
                        }
                        ViewGroup viewGroup3 = c1136980fh23.LJII;
                        if (viewGroup3 != null) {
                            C786410Ut5.R4(1.0f, viewGroup3);
                        }
                        C2268791DrB c2268791DrB = new C2268791DrB(0.33f, 0.0f, 0.67f, 1.0f);
                        DataChannel dataChannel = c1136980fh23.LIZLLL;
                        Object objGg02 = null;
                        if (dataChannel != null) {
                            objGg0 = dataChannel.gg0(BattleTop2CardEffectChannel.class);
                        } else {
                            objGg0 = null;
                        }
                        DataChannel dataChannel2 = c1136980fh23.LIZLLL;
                        if (dataChannel2 != null) {
                            objGg02 = dataChannel2.gg0(BattleTop3CardEffectChannel.class);
                        }
                        EnumC919030a1V enumC919030a1V = EnumC919030a1V.NORMAL;
                        if (objGg0 == enumC919030a1V && objGg02 == enumC919030a1V && (viewGroup = c1136980fh23.LJII) != null && (viewPropertyAnimatorAnimate = viewGroup.animate()) != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(1.3f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.3f)) != null && (duration = viewPropertyAnimatorScaleY.setDuration(100L)) != null && (interpolator = duration.setInterpolator(c2268791DrB)) != null && (viewPropertyAnimatorWithEndAction = interpolator.withEndAction(new ARunnableS81S0200000_12(c2268791DrB, c1136980fh23, 15))) != null) {
                            viewPropertyAnimatorWithEndAction.start();
                        }
                        C1136980fh2 c1136980fh24 = this.LIZ;
                        ViewGroup viewGroup4 = c1136980fh24.LJII;
                        if (viewGroup4 != null) {
                            HandlerHook.viewRemoveCallbacks(viewGroup4, c1136980fh24.LJIJJ);
                        }
                        C1136980fh2 c1136980fh25 = this.LIZ;
                        ViewGroup viewGroup5 = c1136980fh25.LJII;
                        if (viewGroup5 != null) {
                            HandlerHook.viewPostDelay(viewGroup5, c1136980fh25.LJIJJ, 2000L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (z) {
                    return;
                }
                C1136980fh2 c1136980fh26 = this.LIZ;
                ViewGroup viewGroup6 = c1136980fh26.LJII;
                if (viewGroup6 != null) {
                    HandlerHook.viewRemoveCallbacks(viewGroup6, c1136980fh26.LJIJJ);
                }
                C1136980fh2 c1136980fh27 = this.LIZ;
                c1136980fh27.LJIJJLI(c1136980fh27.LIZIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x0255  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0443  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x04cd  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x04cf  */
            @Override // X.InterfaceC1137400fhi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJ(boolean r24, boolean r25, boolean r26) {
                /*
                    Method dump skipped, instruction units count: 1338
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1136960fh0.LJ(boolean, boolean, boolean):void");
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[PHI: r0
      0x0034: PHI (r0v3 boolean) = (r0v2 boolean), (r0v9 boolean) binds: [B:7:0x0017, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(X.C1135810ff9 r6) {
        /*
            r5 = this;
            boolean r4 = X.C1132700fa8.LJI(r6)
            boolean r1 = X.C1133200faw.LIZ(r6)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.LIZLLL
            boolean r0 = X.C1132700fa8.LJ(r6, r0)
            r3 = 1
            r2 = 0
            if (r4 != 0) goto L16
            if (r1 != 0) goto L36
            if (r0 == 0) goto L36
        L16:
            r0 = 1
            if (r4 != 0) goto L34
        L19:
            if (r1 == 0) goto L34
        L1b:
            X.16F5 r1 = r5.LJFF
            if (r1 == 0) goto L25
            if (r0 == 0) goto L31
            r0 = 0
        L22:
            X.C786410Ut5.LLJJJJ(r1, r0)
        L25:
            android.view.ViewGroup r0 = r5.LJIIIZ
            if (r0 == 0) goto L30
            if (r3 != 0) goto L2d
            r2 = 8
        L2d:
            X.C786410Ut5.LJLZ(r2, r0)
        L30:
            return
        L31:
            r0 = 8
            goto L22
        L34:
            r3 = 0
            goto L1b
        L36:
            r0 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136980fh2.LJIJJLI(X.0ff9):void");
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJIIJJI(DataChannel dataChannel, EnumC1136790fgj enumC1136790fgj) {
        this.LIZLLL = dataChannel;
        this.LIZJ = enumC1136790fgj;
        C16F5 c16f5 = (C16F5) this.LIZ.findViewById(R.id.z6_);
        this.LJFF = c16f5;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS120S0200000_17(this, dataChannel, 4));
        }
        this.LJI = (C16F5) this.LIZ.findViewById(R.id.tk2);
        C16F5 c16f52 = this.LJFF;
        if (c16f52 != null) {
            c16f52.setTypeface(C1119920fFW.LIZJ(c16f52.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f52.getContext()), 2);
        }
        this.LJIIJJI = (ConstraintLayout) this.LIZ.findViewById(R.id.y1q);
        this.LJIIL = (C1324720kZq) this.LIZ.findViewById(R.id.vzp);
        this.LJIILIIL = (C1324720kZq) this.LIZ.findViewById(R.id.h59);
        this.LJIILJJIL = (C1324720kZq) this.LIZ.findViewById(R.id.obm);
        this.LJIIJ = (AppCompatImageView) this.LIZ.findViewById(R.id.kgr);
        TextView textView = (TextView) this.LIZ.findViewById(R.id.txt_gift_tray_critical);
        this.LJIIIIZZ = textView;
        if (textView != null) {
            textView.setTypeface(C1119920fFW.LIZJ(textView.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, textView.getContext()), 2);
        }
        ViewGroup viewGroup = (ViewGroup) this.LIZ.findViewById(R.id.j0v);
        this.LJII = viewGroup;
        C500260Jjc.LJIILIIL(viewGroup);
        TextView textView2 = (TextView) this.LIZ.findViewById(R.id.txt_gift_tray_hammer);
        if (textView2 != null) {
            textView2.setTypeface(C1119920fFW.LIZJ(textView2.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, textView2.getContext()), 2);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.LIZ.findViewById(R.id.j0w);
        this.LJIIIZ = viewGroup2;
        C500260Jjc.LJIILIIL(viewGroup2);
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJ(C1135810ff9 c1135810ff9, EnumC1137240fhS enumC1137240fhS, int i) {
        this.LIZIZ = c1135810ff9;
        C16F5 c16f5 = this.LJFF;
        if (c16f5 != null) {
            C1137380fhg c1137380fhg = C1137380fhg.LIZ;
            DataChannel dataChannel = this.LIZLLL;
            c1137380fhg.getClass();
            Context context = c16f5.getContext();
            if (context != null && C1132700fa8.LJ(c1135810ff9, dataChannel)) {
                C1137380fhg.LIZ(c16f5, C1135990ffR.LJ(context, c1135810ff9));
            }
        }
        C16F5 c16f52 = this.LJI;
        if (c16f52 != null) {
            C1137380fhg c1137380fhg2 = C1137380fhg.LIZ;
            C1135810ff9 c1135810ff92 = this.LIZIZ;
            DataChannel dataChannel2 = this.LIZLLL;
            c1137380fhg2.getClass();
            Context context2 = c16f52.getContext();
            if (context2 != null && C1132700fa8.LJ(c1135810ff92, dataChannel2)) {
                C1137380fhg.LIZ(c16f52, C1135990ffR.LJ(context2, c1135810ff92));
            }
        }
        C1137540fhw c1137540fhw = EnumC1136790fgj.Companion;
        EnumC1136790fgj enumC1136790fgj = this.LIZJ;
        c1137540fhw.getClass();
        if (!C1137540fhw.LIZ(enumC1136790fgj)) {
            if (C1132700fa8.LJ(c1135810ff9, this.LIZLLL)) {
                C16F5 c16f53 = this.LJFF;
                if (c16f53 != null) {
                    c16f53.setTextSize(1, 18.0f);
                    return;
                }
                return;
            }
            C16F5 c16f54 = this.LJFF;
            if (c16f54 == null) {
                return;
            }
            c16f54.setTextSize(1, 20.0f);
        }
    }
}
