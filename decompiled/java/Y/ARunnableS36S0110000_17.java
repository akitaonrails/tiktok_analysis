package Y;

import X.AbstractC1109720ez4;
import X.C1135990ffR;
import X.C1136980fh2;
import X.C1143100fqu;
import X.C1602160rnK;
import X.C16F5;
import X.C1C7U;
import X.C472860IgW;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1087130eOd;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.animation.TranslateAnimation;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayPerformanceOptimisationSetting;
import com.bytedance.android.livesdk.slot.FrameL3SlotHeightChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS36S0110000_17 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            X.0ezD r0 = (X.C1109810ezD) r0
            kotlin.jvm.functions.Function0<X.0eys<?>> r0 = r0.LJFF
            java.lang.Object r1 = r0.invoke()
            X.0eys r1 = (X.C1109600eys) r1
            if (r1 == 0) goto L18
            java.lang.Object r0 = r4.l0
            X.0ezD r0 = (X.C1109810ezD) r0
            X.0ezc r0 = r0.LIZIZ
            boolean r0 = r0.LLLIZZ
            r1.LIZJ = r0
        L18:
            java.lang.Object r0 = r4.l0
            X.0ezD r0 = (X.C1109810ezD) r0
            X.0ezc r0 = r0.LIZIZ
            boolean r0 = r0.getCanFold()
            r3 = 1
            if (r0 == 0) goto L5f
            java.lang.Object r1 = r4.l0
            X.0ezD r1 = (X.C1109810ezD) r1
            X.0ezc r0 = r1.LIZIZ
            boolean r0 = r0.LLLIZZ
            r1.LIZ(r3, r0, r3)
            boolean r0 = r4.z1
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r4.l0
            X.0ezD r0 = (X.C1109810ezD) r0
            X.0ezc r1 = r0.LIZIZ
            boolean r0 = r1.LLLIZZ
            if (r0 == 0) goto L4b
            r1.LJJLIIJ(r3)
        L41:
            java.lang.Object r0 = r4.l0
            X.0ezD r0 = (X.C1109810ezD) r0
            android.widget.ImageView r0 = r0.LIZJ
            X.C500260Jjc.LJIILIIL(r0)
            return
        L4b:
            java.lang.Object r1 = r4.l0
            X.0ezD r1 = (X.C1109810ezD) r1
            X.0ezc r0 = r1.LIZIZ
            boolean r0 = r0.LLLIZZ
            if (r0 != 0) goto L41
            android.os.Handler r3 = r1.LIZLLL
            java.lang.Runnable r2 = r1.LJ
            r0 = 1800(0x708, double:8.893E-321)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            goto L41
        L5f:
            java.lang.Object r2 = r4.l0
            X.0ezD r2 = (X.C1109810ezD) r2
            X.0ezc r0 = r2.LIZIZ
            boolean r1 = r0.LLLIZZ
            r0 = 0
            r2.LIZ(r0, r1, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS36S0110000_17.LIZ$0():void");
    }

    public final void LIZ$1() {
        C1136980fh2 c1136980fh2 = (C1136980fh2) this.l0;
        C16F5 c16f5 = c1136980fh2.LJI;
        if (c16f5 != null) {
            C786410Ut5.od(c16f5, (int) C497740JfY.LIZIZ(-6.0f));
            C786410Ut5.ac(c16f5, 0.5f);
            C786410Ut5.yc(c16f5, 0.5f);
            c16f5.setPivotY(0.0f);
            if (C497740JfY.LJJ()) {
                c16f5.setPivotX(c1136980fh2.LJFF != null ? r0.getMeasuredWidth() : 0);
                C786410Ut5.Rc(c16f5, -((int) C497740JfY.LIZIZ(51.0f)));
            } else {
                c16f5.setPivotX(0.0f);
                C786410Ut5.Rc(c16f5, (int) C497740JfY.LIZIZ(51.0f));
            }
        }
        C16F5 c16f52 = ((C1136980fh2) this.l0).LJI;
        if (c16f52 != null) {
            C500260Jjc.LLFFF(c16f52);
        }
        if (this.z1) {
            C16F5 c16f53 = ((C1136980fh2) this.l0).LJI;
            Drawable background = c16f53 != null ? c16f53.getBackground() : null;
            if (background instanceof TransitionDrawable) {
                ((TransitionDrawable) background).startTransition(200);
            }
        } else if (LiveGiftTrayPerformanceOptimisationSetting.INSTANCE.getValue().rightTagTransitionOptEnabled) {
            C1136980fh2 c1136980fh22 = (C1136980fh2) this.l0;
            C16F5 c16f54 = c1136980fh22.LJI;
            if (c16f54 != null) {
                c16f54.setBackground(C1135990ffR.LJ(c1136980fh22.LIZ.getContext(), ((C1136980fh2) this.l0).LIZIZ));
            }
        } else {
            C16F5 c16f55 = ((C1136980fh2) this.l0).LJI;
            Drawable background2 = c16f55 != null ? c16f55.getBackground() : null;
            if (background2 instanceof TransitionDrawable) {
                ((TransitionDrawable) background2).startTransition(0);
            }
        }
        ((C1136980fh2) this.l0).LJIILLIIL = null;
    }

    public final void LIZ$2() {
        AbstractC1109720ez4 abstractC1109720ez4 = (AbstractC1109720ez4) this.l0;
        PINNED_MODEL pinned_model = abstractC1109720ez4.LLILLJJLI;
        if (pinned_model != 0) {
            pinned_model.LIZJ = abstractC1109720ez4.N5().LLLIZZ;
        }
        if (!((AbstractC1109720ez4) this.l0).N5().getCanFold()) {
            C500260Jjc.LJLJLJ(((AbstractC1109720ez4) this.l0).P5(), false);
            return;
        }
        if (this.z1 && ((AbstractC1109720ez4) this.l0).N5().LLLIZZ) {
            ((AbstractC1109720ez4) this.l0).N5().LJJLIIJ(true);
        }
        C500260Jjc.LJLJLJ(((AbstractC1109720ez4) this.l0).P5(), true);
        if (((AbstractC1109720ez4) this.l0).N5().LLLIZZ) {
            ((AbstractC1109720ez4) this.l0).P5().setImageResource(R.drawable.c16);
        } else {
            C786410Ut5.LJLIIL(1800L, ((AbstractC1109720ez4) this.l0).S5(), ((AbstractC1109720ez4) this.l0).R5());
            ((AbstractC1109720ez4) this.l0).P5().setImageResource(R.drawable.c17);
        }
    }

    public static final void run$0(ARunnableS36S0110000_17 aRunnableS36S0110000_17) {
        boolean zLIZ;
        C1C7U.LIZ("PinOptExpandSpanController@5505.applyMeasureListener$1$1");
        try {
            aRunnableS36S0110000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PinOptExpandSpanController@5505.applyMeasureListener$1$1");
    }

    public static final void run$1(ARunnableS36S0110000_17 aRunnableS36S0110000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftTrayTagSection@f9b3.startTitleGifterBgTransition$runnable$1");
        try {
            aRunnableS36S0110000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftTrayTagSection@f9b3.startTitleGifterBgTransition$runnable$1");
    }

    public static final void run$2(ARunnableS36S0110000_17 aRunnableS36S0110000_17) {
        boolean zLIZ;
        int height;
        C1C7U.LIZ("FrameL3SlotWidget@670f.changeContainerVisibilityDirect$1");
        try {
            FrameL3SlotWidget frameL3SlotWidget = (FrameL3SlotWidget) aRunnableS36S0110000_17.l0;
            DataChannel dataChannel = frameL3SlotWidget.dataChannel;
            if (dataChannel != null) {
                if (aRunnableS36S0110000_17.z1) {
                    height = frameL3SlotWidget.LLILZ.getHeight();
                } else {
                    height = 0;
                }
                dataChannel.zW(FrameL3SlotHeightChannel.class, Integer.valueOf(height));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FrameL3SlotWidget@670f.changeContainerVisibilityDirect$1");
    }

    public static final void run$3(ARunnableS36S0110000_17 aRunnableS36S0110000_17) {
        boolean zLIZ;
        C1C7U.LIZ("I18nUpdateManager@21d6.update$1");
        try {
            ((I18nUpdateManager) aRunnableS36S0110000_17.l0).LIZLLL(aRunnableS36S0110000_17.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("I18nUpdateManager@21d6.update$1");
    }

    public static final void run$4(ARunnableS36S0110000_17 aRunnableS36S0110000_17) {
        boolean zLIZ;
        C1C7U.LIZ("BrightScanningImageView@8b32.start$1");
        try {
            C1143100fqu c1143100fqu = (C1143100fqu) aRunnableS36S0110000_17.l0;
            ValueAnimator valueAnimator = c1143100fqu.LLJ;
            if (valueAnimator == null) {
                if (aRunnableS36S0110000_17.z1) {
                    c1143100fqu.LIZJ(true);
                } else {
                    c1143100fqu.LIZIZ(true);
                }
            } else if (valueAnimator.isRunning()) {
                ((C1143100fqu) aRunnableS36S0110000_17.l0).LLJ.cancel();
            }
            ((C1143100fqu) aRunnableS36S0110000_17.l0).LLJ.start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BrightScanningImageView@8b32.start$1");
    }

    public static final void run$5(ARunnableS36S0110000_17 aRunnableS36S0110000_17) {
        boolean zLIZ;
        C1C7U.LIZ("BasePinnedViewHolder@6cf7.applyMeasureListener$1$1");
        try {
            aRunnableS36S0110000_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BasePinnedViewHolder@6cf7.applyMeasureListener$1$1");
    }

    public static final void run$6(ARunnableS36S0110000_17 aRunnableS36S0110000_17) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aRunnableS36S0110000_17.l0;
        boolean z = aRunnableS36S0110000_17.z1;
        View view = publicScreenWidget.LLILZIL;
        if (view == null || view.getVisibility() != 0) {
            if (!z && publicScreenWidget.LLJILLL == EnumC1087130eOd.NORMAL) {
                return;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(100L);
            publicScreenWidget.LLILLL.startAnimation(translateAnimation);
            if (publicScreenWidget.LLILLL.getVisibility() != 0) {
                publicScreenWidget.dataChannel.zW(PublicScreenNewMessageVisible.class, Boolean.TRUE);
            }
            C472860IgW c472860IgW = publicScreenWidget.LLILLL;
            int visibility = c472860IgW.getVisibility();
            c472860IgW.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c472860IgW);
        }
    }

    public ARunnableS36S0110000_17(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
