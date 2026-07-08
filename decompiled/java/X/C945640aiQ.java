package X;

import Y.AAListenerS267S0200000_15;
import Y.AAListenerS320S0100000_9;
import Y.ARunnableS106S0100000_6;
import Y.AUListenerS264S0100000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945640aiQ extends RelativeLayout {
    public static final ArrayList<C945650aiR> LLJILLL;
    public final C16F5 LL;
    public final ImageView LLILLJJLI;
    public final C1088120eQE LLILLL;
    public final ViewGroup LLILZ;
    public final C0GYR LLILZIL;
    public C945650aiR LLILZLL;
    public ValueAnimator LLIZ;
    public final BPEAHandler LLIZLLLIL;
    public volatile boolean LLJ;
    public String LLJI;
    public boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public long LLJILJILJ;

    static {
        int iLIZIZ = (int) C497740JfY.LIZIZ(80.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(14.0f);
        int iLIZIZ3 = (int) C497740JfY.LIZIZ(2.0f);
        int iLIZIZ4 = (int) C497740JfY.LIZIZ(10.0f);
        int iLIZIZ5 = (int) C497740JfY.LIZIZ(2.0f);
        C497740JfY.LIZIZ(-2.0f);
        int iLIZIZ6 = (int) C497740JfY.LIZIZ(80.0f);
        int iLIZIZ7 = (int) C497740JfY.LIZIZ(14.0f);
        int iLIZIZ8 = (int) C497740JfY.LIZIZ(2.0f);
        int iLIZIZ9 = (int) C497740JfY.LIZIZ(10.0f);
        int iLIZIZ10 = (int) C497740JfY.LIZIZ(2.0f);
        C497740JfY.LIZIZ(3.0f);
        int iLIZIZ11 = (int) C497740JfY.LIZIZ(58.0f);
        int iLIZIZ12 = (int) C497740JfY.LIZIZ(10.0f);
        int iLIZIZ13 = (int) C497740JfY.LIZIZ(2.0f);
        int iLIZIZ14 = (int) C497740JfY.LIZIZ(8.0f);
        int iLIZIZ15 = (int) C497740JfY.LIZIZ(1.0f);
        C497740JfY.LIZIZ(2.0f);
        LLJILLL = C1697810uHb.LJ(new C945650aiR(1, iLIZIZ, iLIZIZ2, 11, 10, iLIZIZ3, R.style.a9k, 11, iLIZIZ4, iLIZIZ5, new Pair(Integer.valueOf((int) C497740JfY.LIZIZ(124.0f)), Integer.MAX_VALUE)), new C945650aiR(2, iLIZIZ6, iLIZIZ7, 11, 10, iLIZIZ8, R.style.a9k, 11, iLIZIZ9, iLIZIZ10, new Pair(Integer.valueOf((int) C497740JfY.LIZIZ(88.0f)), Integer.valueOf((int) C497740JfY.LIZIZ(124.0f)))), new C945650aiR(3, iLIZIZ11, iLIZIZ12, 8, 7, iLIZIZ13, R.style.a9n, 9, iLIZIZ14, iLIZIZ15, new Pair(Integer.MIN_VALUE, Integer.valueOf((int) C497740JfY.LIZIZ(88.0f)))));
    }

    private final TuxIconDrawable getNewStyleFanTicketIconDrawable() {
        return (TuxIconDrawable) this.LLJILJIL.getValue();
    }

    public final void LIZ() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.LLIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C1088120eQE c1088120eQE = this.LLILLL;
        if (c1088120eQE != null) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("LiveShowTimeStickerCountdownView", "cancelFlashingAnimator");
            if (!c1088120eQE.LLJJIII || (valueAnimator = c1088120eQE.LLJI) == null) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public final boolean LIZIZ() {
        C1088120eQE c1088120eQE = this.LLILLL;
        return C500260Jjc.LJJJI(c1088120eQE != null ? Boolean.valueOf(c1088120eQE.LLJJIII) : null);
    }

    public final void LIZLLL() {
        C20441214yg.LIZIZ("CountDownLayout", "reset");
        C20441214yg.LIZIZ("CountDownLayout", "resetCountDownTime");
        this.LLJILJILJ = 0L;
        C1088120eQE c1088120eQE = this.LLILLL;
        if (c1088120eQE != null) {
            c1088120eQE.LIZ(0L, false);
        }
        C1088120eQE c1088120eQE2 = this.LLILLL;
        if (c1088120eQE2 != null) {
            int visibility = c1088120eQE2.getVisibility();
            c1088120eQE2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1088120eQE2);
        }
        if (this.LLJ || LIZIZ()) {
            C20441214yg.LIZIZ("CountDownLayout", "resetCountDownTime, cancelFinishCountDownAnimation");
            LIZ();
        }
        LJ(0, 0L, 0L);
    }

    public final void LJI() {
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        RelativeLayout.LayoutParams layoutParams3;
        C945650aiR c945650aiR = this.LLILZLL;
        if (c945650aiR != null) {
            ViewGroup viewGroup = this.LLILZ;
            if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
                setPaddingRelative((int) C497740JfY.LIZIZ(0.0f), (int) C497740JfY.LIZIZ(0.0f), 0, 0);
                C1088120eQE c1088120eQE = this.LLILLL;
                layoutParams = c1088120eQE != null ? c1088120eQE.getLayoutParams() : null;
                if (!(layoutParams instanceof RelativeLayout.LayoutParams) || (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) == null) {
                    return;
                }
                layoutParams2.setMarginStart(0);
                layoutParams2.topMargin = 0;
                C1088120eQE c1088120eQE2 = this.LLILLL;
                if (c1088120eQE2 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1088120eQE2);
                    c1088120eQE2.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            }
            setPaddingRelative((int) C497740JfY.LIZIZ(4.0f), (int) C497740JfY.LIZIZ(4.0f), 0, 0);
            C1088120eQE c1088120eQE3 = this.LLILLL;
            layoutParams = c1088120eQE3 != null ? c1088120eQE3.getLayoutParams() : null;
            if (!(layoutParams instanceof RelativeLayout.LayoutParams) || (layoutParams3 = (RelativeLayout.LayoutParams) layoutParams) == null) {
                return;
            }
            int i = c945650aiR.LIZ;
            if (i == 1) {
                layoutParams3.setMarginStart((int) C497740JfY.LIZIZ(3.0f));
                layoutParams3.topMargin = (int) C497740JfY.LIZIZ(0.0f);
            } else if (i != 2) {
                layoutParams3.setMarginStart((int) C497740JfY.LIZIZ(2.0f));
                layoutParams3.topMargin = (int) C497740JfY.LIZIZ(2.0f);
            } else {
                layoutParams3.setMarginStart((int) C497740JfY.LIZIZ(2.0f));
                layoutParams3.topMargin = (int) C497740JfY.LIZIZ(3.0f);
            }
            C1088120eQE c1088120eQE4 = this.LLILLL;
            if (c1088120eQE4 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1088120eQE4);
                c1088120eQE4.setLayoutParams(layoutParams3);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZJ(int i) {
        C945650aiR next;
        RelativeLayout.LayoutParams layoutParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("maskSizeUpdate, maskSize=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CountDownLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (i <= 0) {
            C20441214yg.LIZIZ("CountDownLayout", "maskSizeUpdate, size <= 0, so return");
            return;
        }
        Iterator<C945650aiR> it2 = LLJILLL.iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
            C945650aiR c945650aiR = next;
            if (i >= c945650aiR.LJIIJ.getFirst().intValue() && i < c945650aiR.LJIIJ.getSecond().intValue()) {
                break;
            }
        }
        C945650aiR c945650aiR2 = next;
        if (c945650aiR2 != null) {
            this.LLILZLL = c945650aiR2;
            ViewGroup viewGroup = this.LLILZ;
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                layoutParams2.width = c945650aiR2.LIZIZ;
                layoutParams2.height = c945650aiR2.LIZJ;
                C786410Ut5.X5(layoutParams2, viewGroup);
            }
            C16F5 c16f5 = this.LL;
            if (c16f5 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c16f5.getLayoutParams();
                marginLayoutParams.setMarginStart(c945650aiR2.LJFF);
                C786410Ut5.y6(c16f5, marginLayoutParams);
                c16f5.LJJJI(c945650aiR2.LJI);
                c16f5.setTextSize(c945650aiR2.LIZLLL);
                C21382118m3.LIZIZ(c16f5, c945650aiR2.LJ, c945650aiR2.LIZLLL, 1, 1);
            }
            ImageView imageView = this.LLILLJJLI;
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int i2 = c945650aiR2.LJIIIIZZ;
                marginLayoutParams2.width = i2;
                marginLayoutParams2.height = i2;
                marginLayoutParams2.setMarginStart(c945650aiR2.LJIIIZ);
                C786410Ut5.c6(imageView, marginLayoutParams2);
            }
            C1088120eQE c1088120eQE = this.LLILLL;
            if (c1088120eQE != null) {
                c1088120eQE.setTextSize(c945650aiR2.LJII);
                ViewGroup.LayoutParams layoutParams3 = c1088120eQE.getLayoutParams();
                if ((layoutParams3 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams3) != null) {
                    if (c945650aiR2.LIZ == 1) {
                        layoutParams.addRule(10, -1);
                        layoutParams.addRule(17, R.id.ez0);
                        layoutParams.addRule(3, -1);
                        layoutParams.addRule(20, 0);
                    } else {
                        layoutParams.addRule(10, 0);
                        layoutParams.addRule(17, -1);
                        layoutParams.addRule(3, R.id.ez0);
                        layoutParams.addRule(20, -1);
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1088120eQE);
                    c1088120eQE.setLayoutParams(layoutParams);
                }
            }
            LJI();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, Y.ARunnableS106S0100000_6] */
    public final void LJFF(long j) {
        C1088120eQE c1088120eQE;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCountDownTime, remainingTimeSecond=");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("CountDownLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (j < 0) {
            C20441214yg.LIZIZ("CountDownLayout", "updateCountDownTime, remainingTimeSecond < 0, so return");
            return;
        }
        if (j == this.LLJILJILJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateCountDownTime, remainingTimeSecond is same, so return, remainingTimeSecond=");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("CountDownLayout", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
        C1088120eQE c1088120eQE2 = this.LLILLL;
        if (c1088120eQE2 != null) {
            if (j < 10) {
                z = true;
            } else {
                z = false;
            }
            c1088120eQE2.LIZ(j, z);
        }
        C1088120eQE c1088120eQE3 = this.LLILLL;
        if (c1088120eQE3 != null) {
            int visibility = c1088120eQE3.getVisibility();
            c1088120eQE3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1088120eQE3);
        }
        if (j == 0 && this.LLJILJILJ == 1) {
            C20441214yg.LIZIZ("CountDownLayout", "updateCountDownTime, doFinishAnimation");
            if (C01HE.LJ() != C01FV.AUDIENCE) {
                ?? aRunnableS106S0100000_6 = new ARunnableS106S0100000_6((Object) this, 205);
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = aRunnableS106S0100000_6;
                if (!LIZIZ() && (c1088120eQE = this.LLILLL) != null && c1088120eQE.getVisibility() == 0) {
                    C20441214yg.LIZIZ("CountDownLayout", "countDownTimeTextViewColorAnimation");
                    AAListenerS320S0100000_9 aAListenerS320S0100000_9 = new AAListenerS320S0100000_9(c259800zU, 3);
                    C1143300frE.LJIIJJI().getClass();
                    AbstractC1143290frD.LIZ("LiveShowTimeStickerCountdownView", "startFlashingAnimator");
                    if (!c1088120eQE.LLJJIII) {
                        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, -340459, -1);
                        c1088120eQE.LLJI = valueAnimatorOfArgb;
                        if (valueAnimatorOfArgb != null) {
                            valueAnimatorOfArgb.setDuration(600L);
                        }
                        ValueAnimator valueAnimator = c1088120eQE.LLJI;
                        if (valueAnimator != null) {
                            valueAnimator.setRepeatCount(2);
                        }
                        ValueAnimator valueAnimator2 = c1088120eQE.LLJI;
                        if (valueAnimator2 != null) {
                            valueAnimator2.setRepeatMode(1);
                        }
                        ValueAnimator valueAnimator3 = c1088120eQE.LLJI;
                        if (valueAnimator3 != null) {
                            valueAnimator3.addUpdateListener(new AUListenerS264S0100000_15(c1088120eQE, 8));
                        }
                        ValueAnimator valueAnimator4 = c1088120eQE.LLJI;
                        if (valueAnimator4 != null) {
                            valueAnimator4.addListener(new AAListenerS267S0200000_15(aAListenerS320S0100000_9, c1088120eQE, 7));
                        }
                        ValueAnimator valueAnimator5 = c1088120eQE.LLJI;
                        if (valueAnimator5 != null) {
                            valueAnimator5.start();
                        }
                        c1088120eQE.LLJJIII = true;
                    }
                }
            } else {
                C786410Ut5.LJLIIL(1000L, this.LLIZLLLIL, new ARunnableS106S0100000_6((Object) this, 22));
            }
        } else if (this.LLJ || LIZIZ()) {
            C20441214yg.LIZIZ("CountDownLayout", "updateCountDownTime, cancelFinishCountDownAnimation");
            LIZ();
        }
        this.LLJILJILJ = j;
    }

    public C945640aiQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = C930540aK4.LJJIJIL(new AwS416S0200000_15(context, this, 25));
        this.LLJILJILJ = -1L;
        C786410Ut5.Sd(R.layout.g3x, C786410Ut5.ne(context), this);
        C1088120eQE c1088120eQE = (C1088120eQE) findViewById(R.id.f0c);
        this.LLILLL = c1088120eQE;
        this.LL = (C16F5) findViewById(R.id.ez1);
        this.LLILLJJLI = (ImageView) findViewById(R.id.eyy);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.ez0);
        this.LLILZ = viewGroup;
        this.LLILZIL = (C0GYR) findViewById(R.id.eyz);
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        if (c1088120eQE != null) {
            int visibility = c1088120eQE.getVisibility();
            c1088120eQE.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1088120eQE);
            c1088120eQE.setTextSize(11.0f);
        }
        if (C931790aM5.LIZIZ()) {
            setPaddingRelative(0, 0, 0, 0);
        } else {
            setPaddingRelative((int) C497740JfY.LIZIZ(4.0f), (int) C497740JfY.LIZIZ(4.0f), 0, 0);
        }
    }

    public final void LJ(int i, long j, long j2) {
        String strLJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentCoin=");
        sbLIZ.append(j);
        sbLIZ.append(", maxCoin=");
        sbLIZ.append(j2);
        sbLIZ.append(", progress=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CountDownLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (j2 > 0 && j >= 0 && i >= 0 && i <= 100) {
            ViewGroup viewGroup = this.LLILZ;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            C0GYR c0gyr = this.LLILZIL;
            if (c0gyr != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("progress=");
                sbLIZ2.append(i);
                C20441214yg.LIZIZ("CDCoinProgressBar", C2188811AlT.LIZIZ(sbLIZ2));
                c0gyr.LLILZLL = i * 0.01f;
                c0gyr.invalidate();
            }
            C16F5 c16f5 = this.LL;
            if (c16f5 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(C1850730yGF.LJFF(j));
                sbLIZ3.append('/');
                sbLIZ3.append(C1850730yGF.LJFF(j2));
                c16f5.setText(C2188811AlT.LIZIZ(sbLIZ3));
            }
            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
            if (multiGuestDataHolder != null) {
                strLJII = multiGuestDataHolder.LJII();
            } else {
                strLJII = null;
            }
            if (!TextUtils.isEmpty(strLJII) && Intrinsics.LJFF(strLJII, this.LLJI) && this.LLJIJIL) {
                C20441214yg.LIZIZ("CountDownLayout", "same ticketIconUrl and loaded successfully, so return");
            } else {
                this.LLJI = strLJII;
                C1324610kZf url = C1819620xS4.LIZ().setUrl(strLJII);
                if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                    url.LJIIJJI = getNewStyleFanTicketIconDrawable();
                } else {
                    url.LJIIIZ = R.drawable.emi;
                }
                url.LJIIL = new C987140bnM(this, 7);
                url.LJJI(this.LLILLJJLI);
            }
        } else {
            ViewGroup viewGroup2 = this.LLILZ;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(8, viewGroup2);
            }
        }
        LJI();
    }
}
