package Y;

import X.C1428470nHB;
import X.C1440480naY;
import X.C1441830ncj;
import X.C786410Ut5;
import X.InterfaceC1452170ntP;
import X.InterfaceC1464120oCg;
import android.animation.Animator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AAListenerS333S0100000_22 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$0(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
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
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public AAListenerS333S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
        C786410Ut5.LLIIII(((VEVideoPublishPreviewScene) aAListenerS333S0100000_22.l0).LLJLILLLLZIIL, 4);
    }

    public static final void onAnimationEnd$1(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        final VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aAListenerS333S0100000_22.l0;
        vEVideoPublishPreviewScene.LLJLILLLLZIIL.bringToFront();
        C786410Ut5.LLIIII(vEVideoPublishPreviewScene.LLJLILLLLZIIL, 0);
        vEVideoPublishPreviewScene.LLLILZLLLI.bringToFront();
        vEVideoPublishPreviewScene.LLLILZJ.bringToFront();
        C786410Ut5.LJLLLLLL(0, vEVideoPublishPreviewScene.LLLILZJ);
        C786410Ut5.LJLLLLLL(0, vEVideoPublishPreviewScene.LLLILZLLLI);
        C786410Ut5.V4(vEVideoPublishPreviewScene.LLJJLIIIJLLLLLLLZ, 0.0f);
        C786410Ut5.LJZI(8, vEVideoPublishPreviewScene.LLJJLIIIJLLLLLLLZ);
        VideoPublishEditModel videoPublishEditModel = vEVideoPublishPreviewScene.LLJL;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null && C1440480naY.LIZ() && C1428470nHB.LJLJI(vEVideoPublishPreviewScene.LLJL)) {
            vEVideoPublishPreviewScene.LLLLLJIL = new SafeHandler(vEVideoPublishPreviewScene);
            FrameLayout frameLayout = vEVideoPublishPreviewScene.LLLLJI;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
            C1441830ncj c1441830ncj = vEVideoPublishPreviewScene.LLJLIL;
            if (c1441830ncj != null && (interfaceC1452170ntP = c1441830ncj.LJIIIZ) != null) {
                interfaceC1452170ntP.cg(new InterfaceC1464120oCg() { // from class: X.0nlb
                    @Override // X.InterfaceC1464120oCg
                    public final void LIZ(int i) {
                        VEVideoPublishPreviewScene vEVideoPublishPreviewScene2 = vEVideoPublishPreviewScene;
                        vEVideoPublishPreviewScene2.getClass();
                        Context contextLIZIZ = C545820Lau.LIZIZ(vEVideoPublishPreviewScene2);
                        if (contextLIZIZ != null) {
                            for (TextStickerData textStickerData : (ArrayList) vEVideoPublishPreviewScene2.LLLLLIL) {
                                if (i >= textStickerData.getStartTime() && i <= textStickerData.getEndTime() && !textStickerData.getAddToLayoutInPreviewOrCover()) {
                                    C196925122x c196925122x = new C196925122x(contextLIZIZ, vEVideoPublishPreviewScene2.LLLLLJIL, textStickerData, false, new C124G() { // from class: X.0nlj
                                        @Override // X.C124G
                                        public final boolean LIZ() {
                                            return false;
                                        }
                                    }, Boolean.FALSE);
                                    int left = (vEVideoPublishPreviewScene2.LLJLILLLLZIIL.getLeft() + vEVideoPublishPreviewScene2.LLJLILLLLZIIL.getRight()) / 2;
                                    int top = (vEVideoPublishPreviewScene2.LLJLILLLLZIIL.getTop() + vEVideoPublishPreviewScene2.LLJLILLLLZIIL.getBottom()) / 2;
                                    float layoutWidth = textStickerData.getLayoutWidth();
                                    float layoutHeight = textStickerData.getLayoutHeight();
                                    if (layoutWidth == 0.0f) {
                                        layoutWidth = ScreenUtils.getScreenWidth(vEVideoPublishPreviewScene2.getContext());
                                    }
                                    if (layoutHeight == 0.0f) {
                                        layoutHeight = ScreenUtils.getScreenHeight(vEVideoPublishPreviewScene2.getContext());
                                    }
                                    float fMax = Math.max(vEVideoPublishPreviewScene2.LLJLILLLLZIIL.getWidth() / layoutWidth, vEVideoPublishPreviewScene2.LLJLILLLLZIIL.getHeight() / layoutHeight);
                                    int i2 = (int) (left - (layoutWidth / 2.0f));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) layoutWidth, (int) layoutHeight);
                                    marginLayoutParams.setMarginStart(i2);
                                    marginLayoutParams.topMargin = (int) (top - (layoutHeight / 2.0f));
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c196925122x);
                                    c196925122x.setScaleX(fMax);
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c196925122x);
                                    c196925122x.setScaleY(fMax);
                                    vEVideoPublishPreviewScene2.LLLLJI.addView(c196925122x, marginLayoutParams);
                                    ((ArrayList) vEVideoPublishPreviewScene2.LLLLLILLIL).add(c196925122x);
                                    textStickerData.setAddToLayoutInPreviewOrCover(true);
                                }
                                for (C196925122x c196925122x2 : (ArrayList) vEVideoPublishPreviewScene2.LLLLLILLIL) {
                                    c196925122x2.setPlayPosition(i);
                                    c196925122x2.LJJII();
                                }
                            }
                        }
                    }
                });
            }
        }
        vEVideoPublishPreviewScene.LLLLLLLLL();
        vEVideoPublishPreviewScene.LLLLLLLLLL();
        vEVideoPublishPreviewScene.LLLLLZ(true);
    }

    public static final void onAnimationEnd$2(AAListenerS333S0100000_22 aAListenerS333S0100000_22, Animator animator) {
        ((Function0) aAListenerS333S0100000_22.l0).invoke();
    }
}
