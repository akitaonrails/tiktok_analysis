package X;

import Y.ALAdapterS23S0200000_29;
import Y.AUListenerS152S0300000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.security.SecureRandom;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS466S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204747159t extends FrameLayout implements C15AM, C15AU {
    public ViewGroup LL;
    public String LLILLJJLI;
    public final boolean LLILLL;
    public C15AZ LLILZ;
    public Function2<? super Boolean, ? super String, Unit> LLILZIL;
    public final C1295960jpS LLILZLL;
    public final FrameLayout LLIZ;
    public final FrameLayout LLIZLLLIL;
    public final C1324720kZq LLJ;
    public final C1324720kZq LLJI;
    public final C1324720kZq LLJIJIL;
    public final C16F5 LLJILJIL;
    public String LLJILJILJ;
    public C15A1 LLJILLL;
    public C1087140eOe LLJJ;
    public Animator LLJJI;
    public long LLJJIII;
    public final C11NJ LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public float LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;

    private final C16HX getNewAvatarImageLoadListener() {
        return (C16HX) this.LLJJIJIIJIL.getValue();
    }

    private final C16HX getOldAvatarImageLoadListener() {
        return (C16HX) this.LLJJIJIL.getValue();
    }

    @Override // X.C15AJ
    public final boolean LLIIII() {
        return getParent() != null;
    }

    @Override // X.C15AJ
    public final void g() {
        if (!Intrinsics.LJFF(getParent(), getRoot())) {
            C15AI.LJII(this);
            getRoot().addView(this);
        }
        C500260Jjc.LJLJLJ(this, true);
    }

    @Override // android.view.View, X.C15AJ
    public String getTag() {
        C204753159z c204753159zLJI;
        Integer num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getGeniusId());
        sbLIZ.append('_');
        C15AZ geniusModel = getGeniusModel();
        sbLIZ.append((geniusModel == null || (c204753159zLJI = geniusModel.LJI()) == null || (num = c204753159zLJI.LJI) == null) ? 0 : num.intValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (LLIIII()) {
            C20441214yg.LJIIIZ(getTag(), "onDetachedFromWindow return parent is also alive");
            return;
        }
        setActionSuccess(null);
        LJI(true, false);
        this.LLJJIJI.LJ();
    }

    @Override // X.C15AJ
    public final void LJIIJ() {
        C15AI.LJII(this);
    }

    @Override // X.C15AJ
    public final void LLLIILIL() {
        C15AI.LIZ(this);
    }

    @Override // X.C15AJ
    public final boolean LLZZLLIL() {
        return this.LLILLL;
    }

    @Override // X.C15AU
    public Function2<Boolean, String, Unit> getActionSuccess() {
        return this.LLILZIL;
    }

    @Override // X.C15AJ
    public String getGeniusId() {
        return this.LLILLJJLI;
    }

    @Override // X.C15AJ
    public ViewGroup getRoot() {
        return this.LL;
    }

    @Override // X.C15AJ
    public C15AZ getGeniusModel() {
        return this.LLILZ;
    }

    private final void setLayoutParamsByModel(C15AZ c15az) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        C20476115Ah c20476115Ah = c15az.LIZ;
        int i3 = c20476115Ah.LIZ;
        int i4 = c20476115Ah.LIZIZ;
        int i5 = 0;
        if (layoutParams5 instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
            layoutParams6.setMarginStart(i3);
            layoutParams6.topMargin = i4;
            layoutParams6.gravity = 8388659;
        } else if (layoutParams5 instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
            layoutParams7.setMarginStart(i3);
            layoutParams7.topMargin = i4;
            layoutParams7.gravity = 8388659;
        } else if (layoutParams5 instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams5;
            layoutParams8.setMarginStart(i3);
            layoutParams8.topMargin = i4;
            layoutParams8.addRule(20);
            layoutParams8.addRule(10);
        } else if (layoutParams5 instanceof C19ME) {
            C19ME c19me = (C19ME) layoutParams5;
            c19me.setMarginStart(i3);
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = i4;
            c19me.topToTop = 0;
            c19me.topToBottom = -1;
            c19me.bottomToBottom = -1;
            c19me.bottomToTop = -1;
            c19me.startToStart = 0;
            c19me.endToEnd = -1;
            c19me.startToEnd = -1;
            c19me.endToStart = -1;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationX(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams5);
        setTranslationZ(c15az.LIZ.LJII);
        float f = c15az.LIZ.LJFF;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(f);
        float f2 = c15az.LIZ.LJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(f2);
        float f3 = c15az.LIZ.LJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f3);
        FrameLayout frameLayout = this.LLIZ;
        ViewGroup.LayoutParams layoutParams9 = null;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams10 = frameLayout.getLayoutParams();
            if (layoutParams10 != null) {
                C20476115Ah c20476115Ah2 = c15az.LIZ;
                layoutParams10.width = c20476115Ah2.LIZJ;
                layoutParams10.height = c20476115Ah2.LIZLLL;
            } else {
                layoutParams10 = null;
            }
            C786410Ut5.a6(frameLayout, layoutParams10);
        }
        C16F5 c16f5 = this.LLJILJIL;
        if (c16f5 != null) {
            ViewGroup.LayoutParams layoutParams11 = c16f5.getLayoutParams();
            if (layoutParams11 != null) {
                layoutParams11.width = c15az.LIZ.LIZJ;
            } else {
                layoutParams11 = null;
            }
            C786410Ut5.y6(c16f5, layoutParams11);
            c16f5.setEllipsize(TextUtils.TruncateAt.END);
            c16f5.setMaxLines(1);
            c16f5.setSingleLine(true);
        }
        FrameLayout frameLayout2 = this.LLIZ;
        if (frameLayout2 != null && (layoutParams = frameLayout2.getLayoutParams()) != null && (i = layoutParams.width) > 0) {
            int i6 = (int) ((i * 52.0f) / 74.0f);
            FrameLayout frameLayout3 = this.LLIZLLLIL;
            if (frameLayout3 != null) {
                layoutParams2 = frameLayout3.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                if (layoutParams3 != null) {
                    layoutParams3.width = i6;
                    layoutParams3.height = i6;
                    layoutParams3.setMargins(0, 0, 0, 0);
                }
            } else {
                layoutParams3 = null;
            }
            FrameLayout frameLayout4 = this.LLIZLLLIL;
            if (frameLayout4 != null) {
                C786410Ut5.a6(frameLayout4, layoutParams3);
            }
            C1324720kZq c1324720kZq = this.LLJI;
            if (c1324720kZq != null) {
                c1324720kZq.setPadding(0, 0, 0, 0);
            }
            C1324720kZq c1324720kZq2 = this.LLJIJIL;
            if (c1324720kZq2 != null) {
                c1324720kZq2.setPadding(0, 0, 0, 0);
            }
            C16F5 c16f52 = this.LLJILJIL;
            if (c16f52 != null) {
                layoutParams9 = c16f52.getLayoutParams();
            }
            if ((layoutParams9 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams9) != null) {
                int iLIZIZ = (int) C418440Gaw.LIZIZ(6);
                FrameLayout frameLayout5 = this.LLIZ;
                if (frameLayout5 != null && (layoutParams4 = frameLayout5.getLayoutParams()) != null) {
                    i2 = layoutParams4.height;
                } else {
                    i2 = 0;
                }
                int i7 = ((i2 + i6) / 2) + iLIZIZ;
                if (i7 > 0) {
                    i5 = i7;
                }
                marginLayoutParams.topMargin = i5;
                C16F5 c16f53 = this.LLJILJIL;
                if (c16f53 != null) {
                    C786410Ut5.y6(c16f53, marginLayoutParams);
                }
            }
        }
    }

    private final void setWiggleAnimator(Animator animator) {
        this.LLJJI = animator;
        if (animator == null) {
            this.LLJJ = null;
        }
    }

    public final void LIZIZ(C1324720kZq c1324720kZq) {
        C2363809Oa.LIZIZ(c1324720kZq, "guest_showdown_avatar_placeholder.png", this.LLILLL, this.LLJJIJI);
    }

    public final void LIZJ(C15AZ c15az) {
        ImageModel avatarThumb;
        User user;
        C204753159z c204753159zLJI = c15az.LJI();
        if (c204753159zLJI != null && (user = c204753159zLJI.LIZJ) != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        if (!this.LLILLL) {
            C2363809Oa.LIZ(getContext(), avatarThumb, new AwS610S0100000_31(this, 401), new AwS610S0100000_31(this, 402), this.LLJJIJI);
            return;
        }
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(avatarThumb);
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
        C20476115Ah c20476115Ah = c15az.LIZ;
        int i = c20476115Ah.LIZJ;
        int i2 = c20476115Ah.LIZLLL;
        c1324610kZfLJIIIZ.LJ = i;
        c1324610kZfLJIIIZ.LJFF = i2;
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJIIL = getOldAvatarImageLoadListener();
        c1324610kZfLJIIIZ.LJJI(this.LLJI);
    }

    public final void LIZLLL(C15AZ c15az) {
        ImageModel avatarThumb;
        User user;
        C204753159z c204753159zLJI = c15az.LJI();
        if (c204753159zLJI != null && (user = c204753159zLJI.LIZLLL) != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        if (!this.LLILLL) {
            C2363809Oa.LIZ(getContext(), avatarThumb, new AwS610S0100000_31(this, 403), new AwS610S0100000_31(this, 404), this.LLJJIJI);
            return;
        }
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(avatarThumb);
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
        C20476115Ah c20476115Ah = c15az.LIZ;
        int i = c20476115Ah.LIZJ;
        int i2 = c20476115Ah.LIZLLL;
        c1324610kZfLJIIIZ.LJ = i;
        c1324610kZfLJIIIZ.LJFF = i2;
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJIIL = getNewAvatarImageLoadListener();
        c1324610kZfLJIIIZ.LJJI(this.LLJIJIL);
    }

    public final void LJ(C15A1 c15a1) {
        C1295960jpS c1295960jpS = this.LLILZLL;
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
        }
        C15AO c15aoLIZ = C15AO.LIZ(c15a1.LIZ, "guest_showdown_top3_champion_wave.zip", new C20345814jI(-1, new Pair(Float.valueOf(0.67327f), Float.valueOf(1.0f))), 2029);
        this.LLJJJIL = true;
        C1295960jpS c1295960jpS2 = this.LLILZLL;
        if (c1295960jpS2 != null) {
            C15AS.LIZ(this, c1295960jpS2, c15aoLIZ, this.LLILLL, new AwS645S0100000_31(this, 94));
        }
    }

    public final void LJFF(C15AZ c15az) {
        long jLJIIJJI;
        Animator animator;
        C204753159z c204753159zLJI = c15az.LJI();
        String tag = getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startWiggleAnimation id:");
        sbLIZ.append(c15az.LIZIZ);
        sbLIZ.append(" config:");
        sbLIZ.append(c204753159zLJI);
        C20441214yg.LJIIIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        if (this.LLILLL) {
            int i = 1;
            if (c204753159zLJI != null && c204753159zLJI.LIZ) {
                C1087140eOe c1087140eOe = new C1087140eOe(fLIZIZ, 1.0f, 1.0f, 1);
                if (Intrinsics.LJFF(c1087140eOe, this.LLJJ)) {
                    String tag2 = getTag();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("wiggleInfo is the same as curWiggleInfo ");
                    sbLIZ2.append(c1087140eOe);
                    C20441214yg.LJIIIZ(tag2, C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                this.LLJJ = c1087140eOe;
                Animator animator2 = this.LLJJI;
                if (animator2 != null && animator2.isRunning() && (animator = this.LLJJI) != null) {
                    animator.cancel();
                }
                float f = c1087140eOe.LIZ;
                setPivotX(getMeasuredWidth() / 2.0f);
                setPivotY(getMeasuredHeight() / 2.0f);
                SecureRandom secureRandom = new SecureRandom();
                long j = (long) (LSPassThroughRecordSizeConfig.DEFAULT / f);
                C118300cf c118300cf = new C118300cf();
                if (!secureRandom.nextBoolean()) {
                    i = -1;
                }
                c118300cf.element = i;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                if (this.LLJJIII > 0) {
                    jLJIIJJI = 0;
                } else {
                    jLJIIJJI = C13LZ.LJIIJJI(AbstractC19994813Le.Default, new C354710DvR(0L, 300L));
                }
                valueAnimatorOfFloat.setStartDelay(jLJIIJJI);
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS152S0300000_17(c1087140eOe, c118300cf, this, 3));
                valueAnimatorOfFloat.addListener(new ALAdapterS23S0200000_29(c118300cf, secureRandom, 14));
                long j2 = this.LLJJIII;
                if (j2 > 0) {
                    valueAnimatorOfFloat.setCurrentPlayTime(j2);
                    this.LLJJIII = 0L;
                }
                valueAnimatorOfFloat.start();
                setWiggleAnimator(valueAnimatorOfFloat);
                return;
            }
        }
        LJII(false);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationX(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L23
            android.animation.Animator r1 = r2.LLJJI
            boolean r0 = r1 instanceof android.animation.ValueAnimator
            if (r0 == 0) goto L23
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            long r0 = r1.getCurrentPlayTime()
        Le:
            r2.LLJJIII = r0
            android.animation.Animator r0 = r2.LLJJI
            if (r0 == 0) goto L17
            r0.cancel()
        L17:
            android.animation.Animator r0 = r2.LLJJI
            if (r0 == 0) goto L1e
            r0.removeAllListeners()
        L1e:
            r0 = 0
            r2.setWiggleAnimator(r0)
            return
        L23:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204747159t.LJII(boolean):void");
    }

    public final void LJIIIIZZ(C15AZ c15az) {
        C15A1 c15a1;
        Long lValueOf;
        User user;
        User user2;
        C15AO c15ao;
        C204753159z c204753159zLJI = c15az.LJI();
        Object objValueOf = null;
        if (c204753159zLJI != null) {
            c15a1 = c204753159zLJI.LJII;
        } else {
            c15a1 = null;
        }
        if (c15a1 == null) {
            this.LLJILLL = null;
            C1295960jpS c1295960jpS = this.LLILZLL;
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
            }
            C1295960jpS c1295960jpS2 = this.LLILZLL;
            if (c1295960jpS2 != null) {
                C500260Jjc.LJLJLJ(c1295960jpS2, false);
            }
            this.LLJJJIL = false;
            return;
        }
        if (this.LLJJJJ) {
            C20441214yg.LJIIIZ("Top3AvatarGeniusView", "Native animation is running, skip starting Lottie for now.");
            return;
        }
        C1295960jpS c1295960jpS3 = this.LLILZLL;
        if (c1295960jpS3 != null) {
            C500260Jjc.LJLJLJ(c1295960jpS3, true);
        }
        if (!c15a1.LIZLLL) {
            C15A1 c15a12 = this.LLJILLL;
            if (c15a12 != null) {
                c15ao = c15a12.LIZ;
            } else {
                c15ao = null;
            }
            if (Intrinsics.LJFF(c15ao, c15a1.LIZ)) {
                C20476115Ah c20476115Ah = c15a1.LIZIZ;
                C15A1 c15a13 = this.LLJILLL;
                if (c15a13 != null) {
                    objValueOf = c15a13.LIZIZ;
                }
                if (!Intrinsics.LJFF(c20476115Ah, objValueOf)) {
                    LJIIIZ(c15a1, c15az);
                    return;
                }
                return;
            }
        }
        LJIIIZ(c15a1, c15az);
        C1295960jpS c1295960jpS4 = this.LLILZLL;
        if (c1295960jpS4 != null) {
            C01GW c01gw = C1835340xrQ.LIZ;
            c1295960jpS4.cancelAnimation();
            c1295960jpS4.setImageDrawable(null);
        }
        this.LLJILLL = c15a1;
        this.LLJJJIL = false;
        C15AO c15aoLIZ = C15AO.LIZ(c15a1.LIZ, "guest_showdown_top3_champion_firework.zip", null, 2045);
        C204753159z c204753159zLJI2 = c15az.LJI();
        if (c204753159zLJI2 != null && (user2 = c204753159zLJI2.LIZLLL) != null) {
            lValueOf = Long.valueOf(user2.getId());
        } else {
            lValueOf = null;
        }
        C204753159z c204753159zLJI3 = c15az.LJI();
        if (c204753159zLJI3 != null && (user = c204753159zLJI3.LIZJ) != null) {
            objValueOf = Long.valueOf(user.getId());
        }
        if (Intrinsics.LJFF(lValueOf, objValueOf)) {
            C20441214yg.LJIIIZ(getTag(), "top 1 user don't change, play wave lottie directly");
            LJ(c15a1);
        } else {
            C1295960jpS c1295960jpS5 = this.LLILZLL;
            if (c1295960jpS5 == null) {
                return;
            }
            C15AS.LIZ(this, c1295960jpS5, c15aoLIZ, this.LLILLL, new AwS466S0200000_31(this, c15a1, 6));
        }
    }

    @Override // X.C15AJ
    public final ViewGroup.LayoutParams LLIIIZ(Rect rect) {
        return C15AI.LIZIZ(this, rect);
    }

    @Override // X.C15AJ
    public final void LLIIL(View view) {
        C15AI.LJIIIIZZ(this, view);
    }

    @Override // X.C15AJ
    public final void W(InterfaceC20476615Am interfaceC20476615Am) {
        C15AI.LJ(this, interfaceC20476615Am);
        C500260Jjc.LJLJLJ(this, false);
    }

    @Override // X.C15AJ
    public final void log(String str) {
        C15AI.LJFF(this, str);
    }

    @Override // X.C15AU
    public void setActionSuccess(Function2<? super Boolean, ? super String, Unit> function2) {
        this.LLILZIL = function2;
    }

    public void setGeniusId(String str) {
        this.LLILLJJLI = str;
    }

    @Override // X.C15AJ
    public void setRoot(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    @Override // X.C15AJ
    public void setGeniusModel(C15AZ c15az) {
        this.LLILZ = c15az;
    }

    public final void LJI(boolean z, boolean z2) {
        C1295960jpS c1295960jpS;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopAnimation stopLottie: ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("Top3AvatarGeniusView", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            float progress = 0.0f;
            if (z2 && this.LLJJJIL && (c1295960jpS = this.LLILZLL) != null) {
                progress = c1295960jpS.getProgress();
            }
            this.LLJJJ = progress;
            C1295960jpS c1295960jpS2 = this.LLILZLL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.cancelAnimation();
            }
            C1295960jpS c1295960jpS3 = this.LLILZLL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.removeAllAnimatorListeners();
            }
            C1295960jpS c1295960jpS4 = this.LLILZLL;
            if (c1295960jpS4 != null) {
                C500260Jjc.LJLJLJ(c1295960jpS4, false);
            }
            this.LLJJJIL = false;
            this.LLJILLL = null;
        }
        LJII(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C15A1 r7, X.C15AZ r8) {
        /*
            r6 = this;
            r4 = 0
            if (r8 == 0) goto L41
            X.15Ah r0 = r8.LIZ
            if (r0 == 0) goto L41
            int r5 = r0.LIZ
        L9:
            X.15Ah r0 = r8.LIZ
            if (r0 == 0) goto Lf
            int r4 = r0.LIZIZ
        Lf:
            X.0jpS r3 = r6.LLILZLL
            if (r3 == 0) goto L40
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r1 = r2 instanceof android.widget.FrameLayout.LayoutParams
            r0 = 0
            if (r1 == 0) goto L3d
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            if (r2 == 0) goto L3d
            X.15Ah r1 = r7.LIZIZ
            int r0 = r1.LIZJ
            r2.width = r0
            int r0 = r1.LIZLLL
            r2.height = r0
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r2.gravity = r0
            int r0 = r1.LIZ
            int r0 = r0 - r5
            r2.setMarginStart(r0)
            X.15Ah r0 = r7.LIZIZ
            int r0 = r0.LIZIZ
            int r0 = r0 - r4
            r2.topMargin = r0
            r0 = r2
        L3d:
            X.C786410Ut5.s6(r3, r0)
        L40:
            return
        L41:
            r5 = 0
            if (r8 == 0) goto Lf
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204747159t.LJIIIZ(X.15A1, X.15AZ):void");
    }

    public C204747159t(ViewGroup viewGroup, String str, boolean z) {
        super(viewGroup.getContext());
        this.LL = viewGroup;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLJJIJI = new C11NJ();
        this.LLJJIJIIJIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 1450));
        this.LLJJIJIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 1451));
        C786410Ut5.Td(C1834150xpV.LIZJ(C786410Ut5.ne(getContext())), R.layout.ha8, this, true);
        this.LLILZLL = (C1295960jpS) findViewById(R.id.bog);
        this.LLIZ = (FrameLayout) findViewById(R.id.tn1);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bi2);
        this.LLIZLLLIL = frameLayout;
        this.LLJ = (C1324720kZq) findViewById(R.id.sr3);
        this.LLJI = (C1324720kZq) findViewById(R.id.m65);
        this.LLJIJIL = (C1324720kZq) findViewById(R.id.p5t);
        this.LLJILJIL = (C16F5) findViewById(R.id.user_nickname_text);
        if (frameLayout != null) {
            frameLayout.setOutlineProvider(new C20748016Gw(1));
            frameLayout.setClipToOutline(true);
        }
        ViewGroup.LayoutParams layoutParamsLLIIIZ = LLIIIZ(new Rect());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParamsLLIIIZ);
        setClipChildren(false);
    }

    @Override // X.C15AJ
    public final void LJLL(List list, InterfaceC20476615Am interfaceC20476615Am, Function2 function2) {
        C15AI.LJIIIZ(this, list, interfaceC20476615Am, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a8 A[PHI: r15
      0x03a8: PHI (r15v1 int) = (r15v0 int), (r15v8 int), (r15v8 int), (r15v8 int) binds: [B:182:0x03a4, B:140:0x02d5, B:142:0x02dd, B:144:0x02e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b0 A[PHI: r12 r15
      0x03b0: PHI (r12v9 int) = (r12v8 int), (r12v13 int), (r12v13 int), (r12v13 int) binds: [B:185:0x03ac, B:147:0x02eb, B:149:0x02f3, B:151:0x02f9] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r15v2 int) = (r15v1 int), (r15v7 int), (r15v7 int), (r15v7 int) binds: [B:185:0x03ac, B:147:0x02eb, B:149:0x02f3, B:151:0x02f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04d9 A[PHI: r11
      0x04d9: PHI (r11v7 java.lang.Integer) = (r11v3 java.lang.Integer), (r11v4 java.lang.Integer), (r11v8 java.lang.Integer) binds: [B:261:0x05a5, B:266:0x05b3, B:231:0x04d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0547 A[PHI: r1
      0x0547: PHI (r1v23 java.lang.Integer) = (r1v19 java.lang.Integer), (r1v20 java.lang.Integer), (r1v24 java.lang.Integer) binds: [B:252:0x0586, B:257:0x0594, B:248:0x0545] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05d0 A[PHI: r3
      0x05d0: PHI (r3v16 java.lang.Integer) = (r3v12 java.lang.Integer), (r3v13 java.lang.Integer), (r3v17 java.lang.Integer) binds: [B:278:0x061a, B:283:0x0628, B:274:0x05ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06dc A[PHI: r1
      0x06dc: PHI (r1v17 java.lang.Integer) = (r1v13 java.lang.Integer), (r1v14 java.lang.Integer), (r1v18 java.lang.Integer) binds: [B:310:0x071c, B:315:0x072a, B:306:0x06da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    @Override // X.C15AJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJIJIL(java.util.List r24, X.InterfaceC20476615Am r25, kotlin.jvm.functions.Function2 r26) {
        /*
            Method dump skipped, instruction units count: 2066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204747159t.LLJJIJIL(java.util.List, X.15Am, kotlin.jvm.functions.Function2):void");
    }

    @Override // X.C15AJ
    public final void LLJLILLLLZIIL(InterfaceC20476615Am interfaceC20476615Am, String str, Function2 function2) {
        C15AI.LJI(this, interfaceC20476615Am, str, function2);
    }

    @Override // X.C15AU
    public final void LIZ(Function2<? super Boolean, ? super String, Unit> function2, C1295960jpS c1295960jpS, C15AO c15ao, C1294720jnS c1294720jnS) {
        C15AS.LIZIZ(this, function2, c1295960jpS, c15ao, c1294720jnS);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    @Override // X.C15AJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZZIL(X.InterfaceC20476615Am r9, java.lang.String r10, boolean r11, kotlin.jvm.functions.Function2 r12) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204747159t.LLLZZIL(X.15Am, java.lang.String, boolean, kotlin.jvm.functions.Function2):void");
    }
}
