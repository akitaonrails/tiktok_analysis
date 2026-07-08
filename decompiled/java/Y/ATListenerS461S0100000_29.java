package Y;

import X.C0J0T;
import X.C0LAB;
import X.C0WZX;
import X.C114F;
import X.C11BJ;
import X.C11G7;
import X.C121W;
import X.C123W;
import X.C12A3;
import X.C12A4;
import X.C12AB;
import X.C12ES;
import X.C12G1;
import X.C12U9;
import X.C12UA;
import X.C12UE;
import X.C12W9;
import X.C12Y9;
import X.C1402820mbo;
import X.C1618440sDa;
import X.C19394610uG;
import X.C19420310yP;
import X.C194484117a;
import X.C19466811Ec;
import X.C19520211Yq;
import X.C19601311mV;
import X.C19601411mW;
import X.C196868120s;
import X.C197109129z;
import X.C19759412Sq;
import X.C19759512Sr;
import X.C19762412Tu;
import X.C19762612Tw;
import X.C19762712Tx;
import X.C1DPV;
import X.C1DPX;
import X.C20684815ws;
import X.C21526919Ml;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C337180DJs;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1641610sox;
import X.EnumC19360310oj;
import X.InterfaceC1455850nzL;
import X.InterfaceC1461660o8i;
import android.graphics.Rect;
import android.text.Editable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.canvas.guide.CanvasGestureGuideWidget;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishFullPagePreviewScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public class ATListenerS461S0100000_29 implements View.OnTouchListener {
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
            case 25:
                return onTouch$25(this, view, motionEvent);
            case 26:
                return onTouch$26(this, view, motionEvent);
            case 27:
                return onTouch$27(this, view, motionEvent);
            case 28:
                return onTouch$28(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS461S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$0(Y.ATListenerS461S0100000_29 r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS461S0100000_29.onTouch$0(Y.ATListenerS461S0100000_29, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$1(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((LiveData) ((CanvasGestureGuideWidget) aTListenerS461S0100000_29.l0).LIZLLL.getValue()).setValue(Boolean.FALSE);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$10(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                ImagePublishFullPagePreviewScene imagePublishFullPagePreviewScene = (ImagePublishFullPagePreviewScene) aTListenerS461S0100000_29.l0;
                if (imagePublishFullPagePreviewScene.LLLF && !imagePublishFullPagePreviewScene.LLL) {
                    ImageView imageView = imagePublishFullPagePreviewScene.LLLIIIIL;
                    ImageView imageView2 = null;
                    if (imageView == null) {
                        imageView = null;
                    }
                    if (imageView.getVisibility() == 0) {
                        ImageView imageView3 = ((ImagePublishFullPagePreviewScene) aTListenerS461S0100000_29.l0).LLLIIIIL;
                        if (imageView3 != null) {
                            imageView2 = imageView3;
                        }
                        C337180DJs.LIZ(imageView2);
                    }
                    ((ImagePublishFullPagePreviewScene) aTListenerS461S0100000_29.l0).LLLLLLLLL();
                }
                ((ImagePublishFullPagePreviewScene) aTListenerS461S0100000_29.l0).LLL = false;
            }
            return false;
        }
        ((ImagePublishFullPagePreviewScene) aTListenerS461S0100000_29.l0).LLLF = true;
        return false;
    }

    public static final boolean onTouch$11(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && Math.abs(((ImagePublishPreviewScene) aTListenerS461S0100000_29.l0).LLLLL - motionEvent.getX()) < ViewConfiguration.get(((ImagePublishPreviewScene) aTListenerS461S0100000_29.l0).requireSceneContext()).getScaledTouchSlop()) {
                ImagePublishPreviewScene imagePublishPreviewScene = (ImagePublishPreviewScene) aTListenerS461S0100000_29.l0;
                boolean z = imagePublishPreviewScene.LLLLIL;
                if (!z) {
                    VideoPublishEditModel videoPublishEditModel = imagePublishPreviewScene.LLJJL;
                    String str = imagePublishPreviewScene.LLJLILLLLZIIL;
                    if (str == null) {
                        str = "";
                    }
                    C1402820mbo.LIZ.getClass();
                    C20684815ws.LJIILLIIL("click_on_preview_page", C1402820mbo.LIZ(videoPublishEditModel, str, z).LIZ);
                    ((ImagePublishPreviewScene) aTListenerS461S0100000_29.l0).LLLLLLLLL();
                    return false;
                }
                imagePublishPreviewScene.LLLLLLLLL();
                return false;
            }
            return false;
        }
        ((ImagePublishPreviewScene) aTListenerS461S0100000_29.l0).LLLLL = motionEvent.getX();
        return false;
    }

    public static final boolean onTouch$12(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        ((C114F) aTListenerS461S0100000_29.l0).LLLIIII = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$13(Y.ATListenerS461S0100000_29 r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS461S0100000_29.onTouch$13(Y.ATListenerS461S0100000_29, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$14(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        View view2;
        if (!((C19520211Yq) aTListenerS461S0100000_29.l0).LLLLILI().LIZ.LIZJ || (view2 = ((C19520211Yq) aTListenerS461S0100000_29.l0).LLJLLIL) == null || view2.getVisibility() != 0) {
            return false;
        }
        if (C0J0T.LIZ(((C19520211Yq) aTListenerS461S0100000_29.l0).LLJLLIL).contains(C814420VxA.LIZIZ(motionEvent.getRawX()), C814420VxA.LIZIZ(motionEvent.getRawY()))) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            ((C19520211Yq) aTListenerS461S0100000_29.l0).LLLLIL().LJII.invoke();
        }
        return true;
    }

    public static final boolean onTouch$15(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            TuxTextView tuxTextView = ((C11G7) aTListenerS461S0100000_29.l0).LLJJJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            EditText editText = ((C11G7) aTListenerS461S0100000_29.l0).LLJJIJIL;
            if (editText != null) {
                editText.setCursorVisible(true);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", "click_search");
            c2344009Gk.LJIIIIZZ("enter_from", "label_panel");
            C20684815ws.LJIILLIIL("enter_anchor_search", c2344009Gk.LIZ);
            view.performClick();
        }
        return false;
    }

    public static final boolean onTouch$16(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        ((C11G7) aTListenerS461S0100000_29.l0).LJLJI();
        return false;
    }

    public static final boolean onTouch$17(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        C121W c121w = (C121W) aTListenerS461S0100000_29.l0;
        if (c121w.LLJJ != null) {
            Rect rect = new Rect();
            c121w.LLJJ.getHitRect(rect);
            if (motionEvent.getY() >= rect.top - C12ES.LIZJ(20.0f, c121w.LL) && motionEvent.getY() <= rect.bottom + C12ES.LIZJ(20.0f, c121w.LL)) {
                float fHeight = rect.top + (rect.height() / 2);
                float x = motionEvent.getX() - rect.left;
                if (x < 0.0f) {
                    x = 0.0f;
                } else if (x > rect.width()) {
                    x = rect.width();
                }
                return c121w.LLJJ.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x, fHeight, motionEvent.getMetaState()));
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$18(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        C196868120s c196868120s = (C196868120s) aTListenerS461S0100000_29.l0;
        if (c196868120s.LLJJ != null) {
            Rect rect = new Rect();
            c196868120s.LLJJ.getHitRect(rect);
            if (motionEvent.getY() >= rect.top - C12ES.LIZJ(20.0f, c196868120s.LL) && motionEvent.getY() <= rect.bottom + C12ES.LIZJ(20.0f, c196868120s.LL)) {
                float fHeight = rect.top + (rect.height() / 2);
                float x = motionEvent.getX() - rect.left;
                if (x < 0.0f) {
                    x = 0.0f;
                } else if (x > rect.width()) {
                    x = rect.width();
                }
                return c196868120s.LLJJ.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), x, fHeight, motionEvent.getMetaState()));
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$19(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aTListenerS461S0100000_29.l0;
        if (!stickerPropDetailFragment.LLIZ) {
            stickerPropDetailFragment.LLIZ = true;
            ((ILayoutPreloadService) ServiceManager.get().getService(ILayoutPreloadService.class)).preloadLayoutFiles();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) throws Throwable {
        if (((C11BJ) aTListenerS461S0100000_29.l0).LLILLJJLI == EnumC19360310oj.LL) {
            if (motionEvent.getAction() == 1) {
                ((C11BJ) aTListenerS461S0100000_29.l0).LIZIZ();
            }
            return true;
        }
        if (motionEvent.getAction() == 1) {
            Editable editableLLLLJI = C2204961BRm.LLLLJI(((C11BJ) aTListenerS461S0100000_29.l0).LL.LIZJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrWLo3j6NAclw75HWpmBl25Q6aAgW6u1xBqR/9ZTDkQqXXHHZAL983wMvS3nfQ8wmVwe+T5BSjCazOBY=", null));
            if (editableLLLLJI != null) {
                editableLLLLJI.length();
            }
            C11BJ c11bj = (C11BJ) aTListenerS461S0100000_29.l0;
            HandlerHook.viewPost(c11bj.LL.LIZJ, new ARunnableS129S0100000_29(c11bj, 25));
            return false;
        }
        return false;
    }

    public static final boolean onTouch$20(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                C19420310yP c19420310yP = (C19420310yP) aTListenerS461S0100000_29.l0;
                c19420310yP.LIZLLL.clearAnimation();
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(c19420310yP.LIZ, R.anim.bt);
                animationLoadAnimation.setAnimationListener(new C12Y9(c19420310yP, 2));
                c19420310yP.LIZLLL.startAnimation(animationLoadAnimation);
                return false;
            }
            return false;
        }
        C19420310yP c19420310yP2 = (C19420310yP) aTListenerS461S0100000_29.l0;
        c19420310yP2.LIZLLL.clearAnimation();
        c19420310yP2.LJFF.LIZ(AFwS218S0000000_29.get$arr$(403));
        c19420310yP2.LIZLLL.startAnimation(AnimationUtils.loadAnimation(c19420310yP2.LIZ, R.anim.bs));
        return false;
    }

    public static final boolean onTouch$21(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        if (!((C19466811Ec) aTListenerS461S0100000_29.l0).LLILZ) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2) {
            C19466811Ec c19466811Ec = (C19466811Ec) aTListenerS461S0100000_29.l0;
            if (c19466811Ec.LLILZLL) {
                c19466811Ec.LLILZLL = false;
                c19466811Ec.LLIZ.removeCallbacksAndMessages(null);
            }
        } else if (action == 1) {
            C786410Ut5.LJLIIL(2000L, ((C19466811Ec) aTListenerS461S0100000_29.l0).LLIZ, new ARunnableS129S0100000_29(aTListenerS461S0100000_29, 197));
            return false;
        }
        return false;
    }

    public static final boolean onTouch$22(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            C1618440sDa.LIZIZ.LJJLIIIIJ(((C19601311mV) aTListenerS461S0100000_29.l0).LJIIJJI, false);
            return false;
        }
        C1618440sDa.LIZIZ.LJJLIIIIJ(((C19601311mV) aTListenerS461S0100000_29.l0).LJIIJJI, true);
        return true;
    }

    public static final boolean onTouch$23(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        Function1<Boolean, Unit> function1;
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && (function1 = ((C19601411mW) aTListenerS461S0100000_29.l0).LJ) != null) {
                function1.invoke(Boolean.FALSE);
            }
            return false;
        }
        Function1<Boolean, Unit> function12 = ((C19601411mW) aTListenerS461S0100000_29.l0).LJ;
        if (function12 == null) {
            return true;
        }
        function12.invoke(Boolean.TRUE);
        return true;
    }

    public static final boolean onTouch$24(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0 || numValueOf.intValue() == 2 || numValueOf.intValue() == 1) {
                ((C12W9) aTListenerS461S0100000_29.l0).LJ = System.currentTimeMillis();
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$25(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C786410Ut5.W4(((C194484117a) ((RecyclerView.ViewHolder) aTListenerS461S0100000_29.l0)).LLILZIL, 0.5f);
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        C786410Ut5.W4(((C194484117a) ((RecyclerView.ViewHolder) aTListenerS461S0100000_29.l0)).LLILZIL, 1.0f);
        return false;
    }

    public static final boolean onTouch$26(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (view != null) {
            C19394610uG c19394610uG = (C19394610uG) aTListenerS461S0100000_29.l0;
            if (view.isEnabled() && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
                if (numValueOf.intValue() == 0) {
                    c19394610uG.LLILZIL = motionEvent.getX();
                    c19394610uG.LLILZLL = motionEvent.getY();
                    c19394610uG.I5(true);
                } else if (numValueOf.intValue() != 5) {
                    if (numValueOf.intValue() == 2) {
                        c19394610uG.LLIZ = motionEvent.getX();
                        c19394610uG.LLIZLLLIL = motionEvent.getY();
                        float fAbs = Math.abs(c19394610uG.LLILZIL - c19394610uG.LLIZ);
                        float fAbs2 = Math.abs(c19394610uG.LLILZLL - c19394610uG.LLIZLLLIL);
                        float scaledTouchSlop = ViewConfiguration.get(c19394610uG.itemView.getContext()).getScaledTouchSlop();
                        if (fAbs > scaledTouchSlop || fAbs2 > scaledTouchSlop) {
                            c19394610uG.I5(false);
                            return false;
                        }
                    } else if (numValueOf.intValue() == 3 || numValueOf.intValue() == 1) {
                        c19394610uG.I5(false);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$27(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    ((C12UA) aTListenerS461S0100000_29.l0).LIZIZ(motionEvent.getRawX(), view, true);
                }
                return true;
            }
            ((C12UA) aTListenerS461S0100000_29.l0).LIZIZ(motionEvent.getRawX(), view, false);
            return true;
        }
        ((C12UA) aTListenerS461S0100000_29.l0).LIZIZ(motionEvent.getRawX(), view, true);
        return true;
    }

    public static final boolean onTouch$28(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            C12U9 c12u9 = (C12U9) aTListenerS461S0100000_29.l0;
            if (c12u9.LLLF) {
                c12u9.LLLF = false;
                C12UE c12ue = c12u9.LLL;
                if (c12ue == null) {
                    c12ue = null;
                }
                c12ue.LLILLL.end();
                c12ue.LLILZ.start();
                ((C12U9) aTListenerS461S0100000_29.l0).LLLIZZ(-1, C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_FTC_TOUCH_DOWN_RECORD, EnumC1641610sox.USER_OPERATION), false);
                ((C12U9) aTListenerS461S0100000_29.l0).getClass();
            }
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float fAbs = Math.abs(((C123W) aTListenerS461S0100000_29.l0).LLLLL - y);
                C123W c123w = (C123W) aTListenerS461S0100000_29.l0;
                if (fAbs < c123w.LLLLLIL) {
                    float fAbs2 = Math.abs(c123w.LLLLJI - x);
                    C123W c123w2 = (C123W) aTListenerS461S0100000_29.l0;
                    if (fAbs2 < c123w2.LLLLLIL) {
                        c123w2.LJIILJJIL();
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        C123W c123w3 = (C123W) aTListenerS461S0100000_29.l0;
        c123w3.LLLLJI = x;
        c123w3.LLLLL = y;
        return false;
    }

    public static final boolean onTouch$4(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        ((C12G1) aTListenerS461S0100000_29.l0).LLLLIL().LJII.invoke();
        GestureDetector gestureDetector = ((C12G1) aTListenerS461S0100000_29.l0).LLJL;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        C21526919Ml c21526919Ml;
        Integer numValueOf2;
        C21526919Ml c21526919Ml2;
        Integer numValueOf3;
        C21526919Ml c21526919Ml3;
        Integer numValueOf4;
        C21526919Ml c21526919Ml4;
        C21526919Ml c21526919Ml5 = ((C197109129z) aTListenerS461S0100000_29.l0).LLLLL;
        if (c21526919Ml5 != null) {
            c21526919Ml5.setInteractionEnabled(true);
        }
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
            if (numValueOf.intValue() != 0 && numValueOf.intValue() != 5) {
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 2) {
                        ((C197109129z) aTListenerS461S0100000_29.l0).LLLLILI = motionEvent.getX();
                        ((C197109129z) aTListenerS461S0100000_29.l0).LLLLJ = motionEvent.getY();
                        C197109129z c197109129z = (C197109129z) aTListenerS461S0100000_29.l0;
                        float f = c197109129z.LLLLIILLL - c197109129z.LLLLILI;
                        if (Math.abs(c197109129z.LLLLIL - c197109129z.LLLLJ) >= 100.0f && Math.abs(f) < 50.0f) {
                            C21526919Ml c21526919Ml6 = ((C197109129z) aTListenerS461S0100000_29.l0).LLLLL;
                            if (c21526919Ml6 != null) {
                                c21526919Ml6.setInteractionEnabled(false);
                            }
                            ViewParent parent = ((C197109129z) aTListenerS461S0100000_29.l0).getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                            return false;
                        }
                    } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                        ((C197109129z) aTListenerS461S0100000_29.l0).LLLLJI = motionEvent.getX();
                        ViewParent parent2 = ((C197109129z) aTListenerS461S0100000_29.l0).getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(false);
                        }
                        C197109129z c197109129z2 = (C197109129z) aTListenerS461S0100000_29.l0;
                        if (Math.abs(c197109129z2.LLLLIILLL - c197109129z2.LLLLJI) <= 10.0f) {
                            C197109129z c197109129z3 = (C197109129z) aTListenerS461S0100000_29.l0;
                            CardView cardView = (CardView) c197109129z3.findViewById(R.id.i0y);
                            CardView cardView2 = (CardView) c197109129z3.findViewById(R.id.uhy);
                            CardView cardView3 = (CardView) c197109129z3.findViewById(R.id.xto);
                            if (C197109129z.F0(motionEvent, (CardView) c197109129z3.findViewById(R.id.gwl))) {
                                EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = c197109129z3.LLLLIILL;
                                if (effectRecommendationCarouselViewModel != null) {
                                    effectRecommendationCarouselViewModel.vQ2(new C12A3(c197109129z3.getContext()));
                                }
                            } else if (C197109129z.F0(motionEvent, cardView)) {
                                C21526919Ml c21526919Ml7 = c197109129z3.LLLLL;
                                if (c21526919Ml7 != null && (numValueOf4 = Integer.valueOf(c21526919Ml7.getCurrentState())) != null) {
                                    if (numValueOf4.intValue() == R.id.vzw) {
                                        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel2 = c197109129z3.LLLLIILL;
                                        if (effectRecommendationCarouselViewModel2 != null) {
                                            effectRecommendationCarouselViewModel2.vQ2(new C12A4(c197109129z3.getContext()));
                                            return false;
                                        }
                                    } else if ((numValueOf4.intValue() == R.id.w01 || numValueOf4.intValue() == R.id.vzz) && (c21526919Ml4 = c197109129z3.LLLLL) != null) {
                                        c21526919Ml4.E0(R.id.vzw);
                                        return false;
                                    }
                                }
                            } else if (C197109129z.F0(motionEvent, cardView2)) {
                                C21526919Ml c21526919Ml8 = c197109129z3.LLLLL;
                                if (c21526919Ml8 != null && (numValueOf3 = Integer.valueOf(c21526919Ml8.getCurrentState())) != null) {
                                    if (numValueOf3.intValue() == R.id.w01) {
                                        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel3 = c197109129z3.LLLLIILL;
                                        if (effectRecommendationCarouselViewModel3 != null) {
                                            effectRecommendationCarouselViewModel3.vQ2(new C12A4(c197109129z3.getContext()));
                                            return false;
                                        }
                                    } else if ((numValueOf3.intValue() == R.id.vzw || numValueOf3.intValue() == R.id.vzz) && (c21526919Ml3 = c197109129z3.LLLLL) != null) {
                                        c21526919Ml3.E0(R.id.w01);
                                        return false;
                                    }
                                }
                            } else if (C197109129z.F0(motionEvent, cardView3) && (c21526919Ml = c197109129z3.LLLLL) != null && (numValueOf2 = Integer.valueOf(c21526919Ml.getCurrentState())) != null) {
                                if (numValueOf2.intValue() == R.id.vzz) {
                                    EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel4 = c197109129z3.LLLLIILL;
                                    if (effectRecommendationCarouselViewModel4 != null) {
                                        effectRecommendationCarouselViewModel4.vQ2(new C12A4(c197109129z3.getContext()));
                                        return false;
                                    }
                                } else if ((numValueOf2.intValue() == R.id.vzw || numValueOf2.intValue() == R.id.w01) && (c21526919Ml2 = c197109129z3.LLLLL) != null) {
                                    c21526919Ml2.E0(R.id.vzz);
                                    return false;
                                }
                            }
                            return false;
                        }
                    }
                }
            } else {
                ((C197109129z) aTListenerS461S0100000_29.l0).LLLLIILLL = motionEvent.getX();
                ((C197109129z) aTListenerS461S0100000_29.l0).LLLLIL = motionEvent.getY();
                ViewParent parent3 = ((C197109129z) aTListenerS461S0100000_29.l0).getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel5 = ((C197109129z) aTListenerS461S0100000_29.l0).LLLLIILL;
        if (effectRecommendationCarouselViewModel5 != null) {
            effectRecommendationCarouselViewModel5.vQ2(C12AB.LIZ);
        }
        C21526919Ml c21526919Ml9 = ((C197109129z) aTListenerS461S0100000_29.l0).LLLLL;
        if (c21526919Ml9 != null) {
            c21526919Ml9.onTouchEvent(motionEvent);
        }
        return true;
    }

    public static final boolean onTouch$6(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            C19759512Sr c19759512Sr = (C19759512Sr) aTListenerS461S0100000_29.l0;
            if (!c19759512Sr.LLLF && c19759512Sr.LLJJLIIIJLLLLLLLZ && c19759512Sr.LLJZ) {
                c19759512Sr.LLJZ = false;
                c19759512Sr.LLLLLLIL(-1, "long_press", false);
                C19759512Sr c19759512Sr2 = (C19759512Sr) aTListenerS461S0100000_29.l0;
                InterfaceC1461660o8i interfaceC1461660o8i = c19759512Sr2.LLJJJJLIIL;
                if (interfaceC1461660o8i != null) {
                    interfaceC1461660o8i.R3(c19759512Sr2.LLJJLIIIJLLLLLLLZ);
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            C19759412Sq c19759412Sq = (C19759412Sq) aTListenerS461S0100000_29.l0;
            if (!c19759412Sq.LLJLLL && c19759412Sq.LLJJL && c19759412Sq.LLJLILLLLZIIL) {
                c19759412Sq.LLJLILLLLZIIL = false;
                c19759412Sq.LLLLLLJ(-1, "long_press", false);
                C19759412Sq c19759412Sq2 = (C19759412Sq) aTListenerS461S0100000_29.l0;
                InterfaceC1461660o8i interfaceC1461660o8i = c19759412Sq2.LLJJJJJIL;
                if (interfaceC1461660o8i != null) {
                    interfaceC1461660o8i.R3(c19759412Sq2.LLJJL);
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$8(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    ((C19762412Tu) aTListenerS461S0100000_29.l0).LJI(motionEvent.getRawX(), view, true);
                }
                return true;
            }
            ((C19762412Tu) aTListenerS461S0100000_29.l0).LJI(motionEvent.getRawX(), view, false);
            return true;
        }
        ((C19762412Tu) aTListenerS461S0100000_29.l0).LJI(motionEvent.getRawX(), view, true);
        return true;
    }

    public static final boolean onTouch$9(ATListenerS461S0100000_29 aTListenerS461S0100000_29, View view, MotionEvent motionEvent) {
        if (motionEvent != null && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            C19762612Tw c19762612Tw = (C19762612Tw) aTListenerS461S0100000_29.l0;
            if (c19762612Tw.LLLIIII) {
                c19762612Tw.LLLIIII = false;
                InterfaceC1461660o8i interfaceC1461660o8iLIZJ = ((InterfaceC1455850nzL) c19762612Tw.LLJLIL.getValue(c19762612Tw, C19762612Tw.LLLLJ[6])).AT().LIZJ();
                if (interfaceC1461660o8iLIZJ != null) {
                    interfaceC1461660o8iLIZJ.R3(false);
                }
                C19762712Tx c19762712Tx = ((C19762612Tw) aTListenerS461S0100000_29.l0).LLLII;
                if (c19762712Tx == null) {
                    c19762712Tx = null;
                }
                c19762712Tx.LLILLL.end();
                c19762712Tx.LLILZ.start();
                ((C19762612Tw) aTListenerS461S0100000_29.l0).LLLLII(-1, C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_TOUCH_DOWN_RECORD, EnumC1641610sox.USER_OPERATION), false);
                C0LAB c0labLLLILZLLLI = ((C19762612Tw) aTListenerS461S0100000_29.l0).LLLILZLLLI();
                c0labLLLILZLLLI.LJ("enter_method", "long_press");
                C20684815ws.LJIILLIIL("record_dub_end", c0labLLLILZLLLI.LIZ);
            }
        }
        return false;
    }
}
