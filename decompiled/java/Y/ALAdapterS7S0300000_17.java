package Y;

import X.AbstractC1086230eNB;
import X.AbstractC1096120ed8;
import X.AbstractC1101760emE;
import X.C0IGJ;
import X.C0KVO;
import X.C1082780eHc;
import X.C1095140ebY;
import X.C1095930ecp;
import X.C1099230ei9;
import X.C1101640em2;
import X.C1101750emD;
import X.C1101820emK;
import X.C1101970emZ;
import X.C1102000emc;
import X.C1124290fMZ;
import X.C1148970g0N;
import X.C118300cf;
import X.C12ES;
import X.C16F5;
import X.C1809710xC5;
import X.C1819620xS4;
import X.C20736316Cj;
import X.C430340Gu8;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC1101980ema;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget;
import com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS7S0300000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationStart$1(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                super.onAnimationCancel(animator);
                break;
            case 7:
                super.onAnimationCancel(animator);
                break;
            case 8:
                onAnimationCancel$2(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationCancel$3(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationCancel$4(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationCancel$5(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Throwable {
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
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$12(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            default:
                super.onAnimationEnd(animator);
                break;
            case 15:
                onAnimationEnd$13(this, animator);
                break;
            case 16:
                onAnimationEnd$14(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) throws Throwable {
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
            case 3:
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                onAnimationStart$3(this, animator);
                break;
            case 5:
                onAnimationStart$4(this, animator);
                break;
            case 6:
                onAnimationStart$5(this, animator);
                break;
            case 7:
                super.onAnimationStart(animator);
                break;
            case 8:
                onAnimationStart$7(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                super.onAnimationStart(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                super.onAnimationStart(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$10(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$11(this, animator);
                break;
            case 14:
                onAnimationStart$12(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        Room roomLJJLIIIIJ;
        ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).hide();
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((C1101640em2) aLAdapterS7S0300000_17.l1).LIZ.Sr());
        if (c1101820emKLIZIZ != null) {
            PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = (PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0;
            C1101640em2 c1101640em2 = (C1101640em2) aLAdapterS7S0300000_17.l1;
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
            c1101820emKLIZIZ.LJIIJJI = -1L;
            c1101820emKLIZIZ.LJIILLIIL = -1;
            DataChannel dataChannel = portraitShortTouchPreviewWidget.dataChannel;
            if (dataChannel != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            } else {
                roomLJJLIIIIJ = null;
            }
            C1101750emD.LIZJ(c1101820emKLIZIZ, dataChannel, roomLJJLIIIIJ, null);
            C1101750emD.LJI(c1101640em2);
        }
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ((C1101640em2) aLAdapterS7S0300000_17.l1).LIZIZ.LJLJL();
        C1102000emc.LIZ.LJ();
    }

    public static final void onAnimationCancel$2(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        Room roomLJJLIIIIJ;
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((AbstractC1101760emE) aLAdapterS7S0300000_17.l0).LJII());
        if (c1101820emKLIZIZ != null) {
            PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = (PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l2;
            AbstractC1101760emE abstractC1101760emE = (AbstractC1101760emE) aLAdapterS7S0300000_17.l0;
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
            c1101820emKLIZIZ.LJIIJJI = -1L;
            c1101820emKLIZIZ.LJIILLIIL = -1;
            DataChannel dataChannel = portraitShortTouchPreviewWidget.dataChannel;
            if (dataChannel != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            } else {
                roomLJJLIIIIJ = null;
            }
            C1101750emD.LIZJ(c1101820emKLIZIZ, dataChannel, roomLJJLIIIIJ, null);
            C1101750emD.LJFF(abstractC1101760emE);
        }
        ((InterfaceC1101980ema) aLAdapterS7S0300000_17.l1).LIZJ(((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l2).isDestroyed);
    }

    public static final void onAnimationCancel$3(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        Room roomLJJLIIIIJ;
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((AbstractC1101760emE) aLAdapterS7S0300000_17.l1).LJII());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
        }
        ((InterfaceC1101980ema) aLAdapterS7S0300000_17.l2).LIZJ(((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).isDestroyed);
        C1101820emK c1101820emKLIZIZ2 = C1101750emD.LIZIZ(((AbstractC1101760emE) aLAdapterS7S0300000_17.l1).LJII());
        if (c1101820emKLIZIZ2 != null) {
            PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = (PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0;
            AbstractC1101760emE abstractC1101760emE = (AbstractC1101760emE) aLAdapterS7S0300000_17.l1;
            c1101820emKLIZIZ2.LJFF = System.currentTimeMillis();
            c1101820emKLIZIZ2.LJIIJJI = -1L;
            c1101820emKLIZIZ2.LJIILLIIL = -1;
            DataChannel dataChannel = portraitShortTouchPreviewWidget.dataChannel;
            if (dataChannel != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            } else {
                roomLJJLIIIIJ = null;
            }
            C1101750emD.LIZJ(c1101820emKLIZIZ2, dataChannel, roomLJJLIIIIJ, null);
            C1101750emD.LJFF(abstractC1101760emE);
        }
    }

    public static final void onAnimationCancel$4(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        Room roomLJJLIIIIJ;
        ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).hide();
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((AbstractC1101760emE) aLAdapterS7S0300000_17.l1).LJII());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
        }
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ((InterfaceC1101980ema) aLAdapterS7S0300000_17.l2).LIZJ(((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).isDestroyed);
        C1101820emK c1101820emKLIZIZ2 = C1101750emD.LIZIZ(((AbstractC1101760emE) aLAdapterS7S0300000_17.l1).LJII());
        if (c1101820emKLIZIZ2 != null) {
            PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = (PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0;
            AbstractC1101760emE abstractC1101760emE = (AbstractC1101760emE) aLAdapterS7S0300000_17.l1;
            c1101820emKLIZIZ2.LJFF = System.currentTimeMillis();
            c1101820emKLIZIZ2.LJIIJJI = -1L;
            c1101820emKLIZIZ2.LJIILLIIL = -1;
            DataChannel dataChannel = portraitShortTouchPreviewWidget.dataChannel;
            if (dataChannel != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            } else {
                roomLJJLIIIIJ = null;
            }
            C1101750emD.LIZJ(c1101820emKLIZIZ2, dataChannel, roomLJJLIIIIJ, null);
            C1101750emD.LJFF(abstractC1101760emE);
        }
    }

    public static final void onAnimationCancel$5(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        C786410Ut5.ed((View) aLAdapterS7S0300000_17.l2, 0.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((LiveNewGiftBottomWidget) aLAdapterS7S0300000_17.l1).z1(new AwS561S0100000_17((AnimatorSet) aLAdapterS7S0300000_17.l2, 162));
    }

    public static final void onAnimationEnd$1(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).hide();
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((C1101640em2) aLAdapterS7S0300000_17.l1).LIZ.Sr());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
        }
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ((C1101640em2) aLAdapterS7S0300000_17.l1).LIZIZ.LJLJL();
        ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).x1((C1101970emZ) aLAdapterS7S0300000_17.l2);
    }

    public static final void onAnimationEnd$10(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).hide();
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((AbstractC1101760emE) aLAdapterS7S0300000_17.l1).LJII());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
        }
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        ((InterfaceC1101980ema) aLAdapterS7S0300000_17.l2).LIZLLL(((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).isDestroyed);
    }

    public static final void onAnimationEnd$11(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        int childCount;
        super.onAnimationEnd(animator);
        ((ShortTouchViewWidget) aLAdapterS7S0300000_17.l0).LLJ.remove((AnimatorSet) aLAdapterS7S0300000_17.l1);
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((C1101640em2) aLAdapterS7S0300000_17.l2).LIZ.Sr());
        if (c1101820emKLIZIZ != null) {
            ShortTouchViewWidget shortTouchViewWidget = (ShortTouchViewWidget) aLAdapterS7S0300000_17.l0;
            c1101820emKLIZIZ.LJIIJJI = System.currentTimeMillis();
            ViewGroup viewGroup = shortTouchViewWidget.LLILZ;
            if (viewGroup != null) {
                childCount = viewGroup.getChildCount();
            } else {
                childCount = 0;
            }
            c1101820emKLIZIZ.LJIILJJIL = childCount;
            C1101750emD.LIZJ(c1101820emKLIZIZ, shortTouchViewWidget.dataChannel, shortTouchViewWidget.LLJI, shortTouchViewWidget.LLJILJIL);
        }
        C1101750emD.LJI((C1101640em2) aLAdapterS7S0300000_17.l2);
        ViewGroup viewGroup2 = ((ShortTouchViewWidget) aLAdapterS7S0300000_17.l0).LLILZ;
        if (viewGroup2 != null) {
            C786410Ut5.LJJJLZIJ(((C1101640em2) aLAdapterS7S0300000_17.l2).LIZ.LLLILZJ(), viewGroup2);
        }
        List<C1101640em2> list = ((ShortTouchViewWidget) aLAdapterS7S0300000_17.l0).LLILZLL;
        if (list != null) {
            ((ArrayList) list).remove((C1101640em2) aLAdapterS7S0300000_17.l2);
        }
        ((C1101640em2) aLAdapterS7S0300000_17.l2).LIZ.Pl();
        ((ShortTouchViewWidget) aLAdapterS7S0300000_17.l0).A1();
    }

    public static final void onAnimationEnd$12(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        ((C1148970g0N) aLAdapterS7S0300000_17.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS7S0300000_17.l1);
    }

    public static final void onAnimationEnd$13(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        super.onAnimationEnd(animator);
        AbstractC1096120ed8 abstractC1096120ed8 = (AbstractC1096120ed8) aLAdapterS7S0300000_17.l0;
        LinearLayout linearLayout = (LinearLayout) aLAdapterS7S0300000_17.l1;
        abstractC1096120ed8.getClass();
        AbstractC1096120ed8.LJIIZILJ(4, linearLayout);
        AbstractC1096120ed8 abstractC1096120ed82 = (AbstractC1096120ed8) aLAdapterS7S0300000_17.l0;
        C16F5 c16f5 = (C16F5) aLAdapterS7S0300000_17.l2;
        abstractC1096120ed82.getClass();
        AbstractC1096120ed8.LJIIZILJ(4, c16f5);
        C16F5 c16f52 = (C16F5) aLAdapterS7S0300000_17.l2;
        if (c16f52 != null) {
            c16f52.setSelected(false);
        }
        C16F5 c16f53 = (C16F5) aLAdapterS7S0300000_17.l2;
        if (c16f53 != null) {
            c16f53.setEllipsize(null);
        }
    }

    public static final void onAnimationEnd$14(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1819620xS4.LIZ().LJIIIZ(((C1095140ebY) aLAdapterS7S0300000_17.l0).LIZJ).LJJI(((C1095930ecp) aLAdapterS7S0300000_17.l1).LJIIIZ);
        ((Function0) aLAdapterS7S0300000_17.l2).invoke();
        C12ES.LJIILL(4, ((C1095930ecp) aLAdapterS7S0300000_17.l1).LJIIIZ);
    }

    public static final void onAnimationEnd$2(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        int width;
        C118300cf c118300cf = (C118300cf) aLAdapterS7S0300000_17.l1;
        TextView textView = ((AbstractC1086230eNB) aLAdapterS7S0300000_17.l0).LLILZLL;
        int width2 = 0;
        if (textView != null) {
            width = textView.getWidth();
        } else {
            width = 0;
        }
        c118300cf.element = width;
        C118300cf c118300cf2 = (C118300cf) aLAdapterS7S0300000_17.l2;
        View view = ((AbstractC1086230eNB) aLAdapterS7S0300000_17.l0).LLILLL;
        if (view != null) {
            width2 = view.getWidth();
        }
        c118300cf2.element = width2;
        TextView textView2 = ((AbstractC1086230eNB) aLAdapterS7S0300000_17.l0).LLIZ;
        if (textView2 != null) {
            C786410Ut5.LLIL(textView2, 8);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        C12ES.LJIILL(8, ((C1099230ei9) aLAdapterS7S0300000_17.l0).LJIIJJI);
        C12ES.LJIILL(8, (FrameLayout) aLAdapterS7S0300000_17.l1);
        C12ES.LJIILL(0, (ViewGroup) aLAdapterS7S0300000_17.l2);
        ((C1099230ei9) aLAdapterS7S0300000_17.l0).LJIILLIIL.invoke();
        C1099230ei9 c1099230ei9 = (C1099230ei9) aLAdapterS7S0300000_17.l0;
        c1099230ei9.LJIJJLI = null;
        c1099230ei9.LJIL = null;
        c1099230ei9.LJIJJ = null;
    }

    public static final void onAnimationEnd$4(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1124290fMZ) aLAdapterS7S0300000_17.l1).LJJJLIIL(new AwS561S0100000_17((AnimatorSet) aLAdapterS7S0300000_17.l2, 481));
    }

    public static final void onAnimationEnd$5(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        C784440Upu.LIZ().LIZIZ(new C0IGJ(true));
    }

    public static final void onAnimationEnd$6(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) throws Throwable {
        ((ConstraintProperty) aLAdapterS7S0300000_17.l1).forceHasOverlappingRenderingCompat(true);
        ((LayeredElementContext) aLAdapterS7S0300000_17.l2).getDataChannel().SX0(C1082780eHc.class, Boolean.valueOf(((C0KVO) aLAdapterS7S0300000_17.l0).LIZ));
    }

    public static final void onAnimationEnd$7(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        super.onAnimationEnd(animator);
        TextView textView = (TextView) aLAdapterS7S0300000_17.l0;
        if (textView != null) {
            C786410Ut5.S4(1.0f, textView);
        }
        ((C1809710xC5) aLAdapterS7S0300000_17.l1).LIZJ = false;
        C12ES.LJIILL(8, (TextView) aLAdapterS7S0300000_17.l2);
        C12ES.LJIILL(0, (TextView) aLAdapterS7S0300000_17.l0);
    }

    public static final void onAnimationEnd$8(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(((AbstractC1101760emE) aLAdapterS7S0300000_17.l0).LJII());
        if (c1101820emKLIZIZ != null) {
            c1101820emKLIZIZ.LJFF = System.currentTimeMillis();
        }
        ((InterfaceC1101980ema) aLAdapterS7S0300000_17.l1).LIZLLL(((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l2).isDestroyed);
    }

    public static final void onAnimationEnd$9(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = (PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0;
        portraitShortTouchPreviewWidget.LLILLL = portraitShortTouchPreviewWidget.y1(((AbstractC1101760emE) aLAdapterS7S0300000_17.l1).LJIILL(), new ALAdapterS7S0300000_17((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0, (AbstractC1101760emE) aLAdapterS7S0300000_17.l1, (InterfaceC1101980ema) aLAdapterS7S0300000_17.l2, 8));
        Animator animator2 = ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l0).LLILLL;
        if (animator2 != null) {
            animator2.start();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        TextView textView = (TextView) aLAdapterS7S0300000_17.l0;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$10(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        ((C1148970g0N) aLAdapterS7S0300000_17.l0).getClass();
    }

    public static final void onAnimationStart$11(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        Context context;
        C430340Gu8 c430340Gu8;
        super.onAnimationStart(animator);
        C1819620xS4.LIZ().LJIIIZ(((C1095140ebY) aLAdapterS7S0300000_17.l0).LIZJ).LJJI(((C1095930ecp) aLAdapterS7S0300000_17.l1).LJIIIZ);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS7S0300000_17.l1).LJIIIZ);
        C430340Gu8 c430340Gu82 = ((C1095930ecp) aLAdapterS7S0300000_17.l1).LJIILIIL;
        if (c430340Gu82 != null) {
            c430340Gu82.setText(String.valueOf(((C1095140ebY) aLAdapterS7S0300000_17.l0).LIZ));
        }
        ViewGroup viewGroup = ((C1095930ecp) aLAdapterS7S0300000_17.l1).LJ;
        if (viewGroup != null && (context = viewGroup.getContext()) != null && (c430340Gu8 = ((C1095930ecp) aLAdapterS7S0300000_17.l1).LJIILIIL) != null) {
            c430340Gu8.LJJJJI(C20736316Cj.LIZIZ(R.attr.c9i, context));
        }
        C430340Gu8 c430340Gu83 = ((C1095930ecp) aLAdapterS7S0300000_17.l1).LJIILIIL;
        if (c430340Gu83 != null) {
            String str = ((C1095140ebY) aLAdapterS7S0300000_17.l0).LJI;
            if (str == null) {
                str = "#FFFFA25F";
            }
            c430340Gu83.setTextColor(C497740JfY.LJI(0, str));
        }
        ((Function0) aLAdapterS7S0300000_17.l2).invoke();
    }

    public static final void onAnimationStart$12(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        super.onAnimationStart(animator);
        AbstractC1096120ed8 abstractC1096120ed8 = (AbstractC1096120ed8) aLAdapterS7S0300000_17.l0;
        C16F5 c16f5 = (C16F5) aLAdapterS7S0300000_17.l1;
        abstractC1096120ed8.getClass();
        AbstractC1096120ed8.LJIIZILJ(0, c16f5);
        AbstractC1096120ed8 abstractC1096120ed82 = (AbstractC1096120ed8) aLAdapterS7S0300000_17.l0;
        LinearLayout linearLayout = (LinearLayout) aLAdapterS7S0300000_17.l2;
        abstractC1096120ed82.getClass();
        AbstractC1096120ed8.LJIIZILJ(0, linearLayout);
    }

    public static final void onAnimationStart$2(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        View view = ((AbstractC1086230eNB) aLAdapterS7S0300000_17.l0).LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = ((AbstractC1086230eNB) aLAdapterS7S0300000_17.l0).LLILZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        TextView textView = ((AbstractC1086230eNB) aLAdapterS7S0300000_17.l0).LLILZLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        TextView textView2 = ((AbstractC1086230eNB) aLAdapterS7S0300000_17.l0).LLILZLL;
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJI(2131841692));
        }
        TextView textView3 = ((AbstractC1086230eNB) aLAdapterS7S0300000_17.l0).LLILZLL;
        if (textView3 != null) {
            textView3.setTextColor(C20736316Cj.LIZJ(R.attr.er6, textView3));
        }
    }

    public static final void onAnimationStart$3(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        TextView textView = (TextView) aLAdapterS7S0300000_17.l0;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$4(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) throws Throwable {
        ((ConstraintProperty) aLAdapterS7S0300000_17.l0).forceHasOverlappingRenderingCompat(false);
        C784440Upu.LIZ().LIZIZ((C0KVO) aLAdapterS7S0300000_17.l1);
        ((LayeredElementContext) aLAdapterS7S0300000_17.l2).getDataChannel().SX0(C1082780eHc.class, Boolean.valueOf(((C0KVO) aLAdapterS7S0300000_17.l1).LIZ));
    }

    public static final void onAnimationStart$5(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        C784440Upu.LIZ().LIZIZ(new C0IGJ(false));
        C784440Upu.LIZ().LIZIZ((C0KVO) aLAdapterS7S0300000_17.l0);
    }

    public static final void onAnimationStart$7(ALAdapterS7S0300000_17 aLAdapterS7S0300000_17, Animator animator) {
        ((InterfaceC1101980ema) aLAdapterS7S0300000_17.l1).LIZIZ(true, ((PortraitShortTouchPreviewWidget) aLAdapterS7S0300000_17.l2).isDestroyed);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS7S0300000_17(X.C0KVO r2, com.bytedance.ies.sdk.widgets.ConstraintProperty r3, com.bytedance.ies.sdk.widgets.LayeredElementContext r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 5 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS7S0300000_17.<init>(X.0KVO, com.bytedance.ies.sdk.widgets.ConstraintProperty, com.bytedance.ies.sdk.widgets.LayeredElementContext, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS7S0300000_17(android.widget.LinearLayout r2, X.C16F5 r3, X.AbstractC1096120ed8 r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 14 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS7S0300000_17.<init>(android.widget.LinearLayout, X.16F5, X.0ed8, int):void");
    }

    public ALAdapterS7S0300000_17(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
