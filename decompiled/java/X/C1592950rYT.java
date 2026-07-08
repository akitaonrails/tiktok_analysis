package X;

import Y.AAListenerS273S0200000_24;
import Y.ARunnableS124S0100000_24;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592950rYT extends FrameLayout implements InterfaceC1587260rPI, InterfaceC20343214is {
    public final C1593020rYa LL;
    public final C01GW LLILLJJLI;
    public View.OnTouchListener LLILLL;
    public View.OnTouchListener LLILZ;
    public InterfaceC1593160rYo LLILZIL;
    public ImageView LLILZLL;
    public ImageView LLIZ;
    public C1295960jpS LLIZLLLIL;
    public TuxTextView LLJ;
    public ImageView LLJI;
    public TextView LLJIJIL;
    public ImageView LLJILJIL;
    public AbstractC1592930rYR LLJILJILJ;
    public ImageView LLJILLL;
    public AvatarComponentView LLJJ;
    public boolean LLJJI;
    public AnimatorSet LLJJIII;
    public ImageView LLJJIJI;
    public SmartImageView LLJJIJIIJIL;
    public InterfaceC1685420txc<? super Boolean, ? super Pair<Integer, Integer>, ? super String, ? super String, ? super C0NLT, Unit> LLJJIJIL;
    public boolean LLJJJ;
    public final LinearLayout LLJJJIL;
    public final FrameLayout LLJJJJ;
    public boolean LLJJJJJIL;
    public final C1593090rYh LLJJJJLIIL;

    public final InterfaceC1587260rPI getAvatarLoadListener() {
        return this;
    }

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    public final View getCustomizedNoticeUI() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "TAB_BOTTOM/icon_tab";
    }

    public void setCustomRiskId(String str) {
    }

    private final TimeInterpolator getAvatarInterpolator() {
        return (TimeInterpolator) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1587260rPI
    public final void LIZ() {
        ARunnableS124S0100000_24 aRunnableS124S0100000_24 = new ARunnableS124S0100000_24(this, 0);
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            aRunnableS124S0100000_24.run();
        } else {
            HandlerHook.viewPost(this, aRunnableS124S0100000_24);
        }
    }

    public final void LJ() {
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            imageView.bringToFront();
        }
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            C786410Ut5.S4(0.0f, textView);
        }
        TextView textView2 = this.LLJIJIL;
        if (textView2 != null) {
            textView2.bringToFront();
        }
        C337180DJs.LIZJ(this.LLILZLL);
        this.LLJJJJJIL = true;
    }

    public final void LJFF() {
        AnimatorSet animatorSet = this.LLJJIII;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        View currentAvatarView = getCurrentAvatarView();
        if (currentAvatarView != null) {
            C339190DRl.LIZIZ(currentAvatarView);
        }
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.V4(imageView, 1.0f);
        }
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            C786410Ut5.S4(1.0f, textView);
        }
        setTabIconVisibility(0);
    }

    public final void LJI() {
        TextView textView = this.LLJIJIL;
        if (textView == null || textView.getAlpha() != 0.0f) {
            return;
        }
        C786410Ut5.S4(1.0f, textView);
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    public final View getCurrentAvatarView() {
        boolean z = C1586860rOe.LIZ;
        return C1586860rOe.LIZ ? this.LLJJ : this.LLJILLL;
    }

    public final Drawable getTabIconBackImageDrawable() {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public final float getTabIconViewScaleX() {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            return imageView.getScaleX();
        }
        return 1.0f;
    }

    public final CharSequence getTitleText() {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            return tuxTextView.getText();
        }
        return null;
    }

    public final void LIZJ() {
        View currentAvatarView = getCurrentAvatarView();
        if (this.LLILZLL == null || currentAvatarView == null) {
            return;
        }
        AnimatorSet animatorSet = this.LLJJIII;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new AAListenerS273S0200000_24(currentAvatarView, this, 0));
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(getAvatarInterpolator());
        if (this.LLJIJIL != null) {
            Animator[] animatorArr = new Animator[3];
            animatorArr[0] = ObjectAnimator.ofFloat(currentAvatarView, "alpha", 0.0f, 1.0f);
            animatorArr[1] = ObjectAnimator.ofFloat(this.LLILZLL, "alpha", 1.0f, 0.0f);
            TextView textView = this.LLJIJIL;
            if (textView == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            animatorArr[2] = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
            animatorSet2.playTogether(animatorArr);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(currentAvatarView, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.LLILZLL, "alpha", 1.0f, 0.0f));
        }
        this.LLJJIII = animatorSet2;
        animatorSet2.start();
    }

    public final AvatarComponentView getAvatarComponentView() {
        return this.LLJJ;
    }

    public final TextView getCountDotView() {
        return this.LLJIJIL;
    }

    public final ImageView getCustomIconView$homepage_common_release() {
        return this.LLJJIJI;
    }

    public final SmartImageView getCustomIconViewV2() {
        return this.LLJJIJIIJIL;
    }

    public final C1593020rYa getIconData() {
        return this.LL;
    }

    public final AbstractC1592930rYR getIconTabLogic() {
        return this.LLJILJILJ;
    }

    public final ImageView getRedDotVIew() {
        return this.LLJI;
    }

    public final ImageView getSocialAvatarEntrance() {
        return this.LLIZ;
    }

    public final ImageView getTabIcon() {
        return this.LLILZLL;
    }

    public final C1295960jpS getTabLottieIcon() {
        return this.LLIZLLLIL;
    }

    public final TuxTextView getTabTitleView() {
        return this.LLJ;
    }

    public final View.OnTouchListener getTouchListener() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0rYh] */
    public C1592950rYT(C1593020rYa c1593020rYa) {
        super(c1593020rYa.LIZ);
        this.LL = c1593020rYa;
        this.LLILLJJLI = C452501pT.LIZIZ(new C1593130rYl());
        this.LLJJIJIL = new C1593050rYd();
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setId(View.generateViewId());
            C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            linearLayout.setPadding(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
            linearLayout.setGravity(17);
            this.LLJJJIL = linearLayout;
            FrameLayout frameLayout = new FrameLayout(getContext());
            int iLJIILL = c19252910Tv.LIZLLL().LJIJI().LJJL().LJIILL();
            C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(iLJIILL, iLJIILL));
            this.LLJJJJ = frameLayout;
            linearLayout.addView(frameLayout);
            addView(linearLayout);
        }
        this.LLJJJJLIIL = new AbstractC1335900krs() { // from class: X.0rYh
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                this.LL.LIZIZ(th);
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                this.LL.LIZ();
            }
        };
    }

    @Override // X.InterfaceC1587260rPI
    public final void LIZIZ(Throwable th) {
        ARunnableS124S0100000_24 aRunnableS124S0100000_24 = new ARunnableS124S0100000_24(this, 1);
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            aRunnableS124S0100000_24.run();
        } else {
            HandlerHook.viewPost(this, aRunnableS124S0100000_24);
        }
    }

    public final void LIZLLL(UrlModel urlModel) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJJIIZI(new ColorDrawable(0));
        c1331670kl3LJIIIIZZ.LJJI(this.LLJILLL);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331750klB.LIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.2d));
        c1331750klB.LIZJ = R.attr.ng;
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIIZZ.LJIIJ(this.LLJJJJLIIL);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1593160rYo interfaceC1593160rYo;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && (interfaceC1593160rYo = this.LLILZIL) != null) {
                            interfaceC1593160rYo.LIZIZ();
                        }
                    } else {
                        InterfaceC1593160rYo interfaceC1593160rYo2 = this.LLILZIL;
                        if (interfaceC1593160rYo2 != null) {
                            getWidth();
                            getHeight();
                            interfaceC1593160rYo2.LIZLLL(motionEvent);
                        }
                    }
                } else {
                    InterfaceC1593160rYo interfaceC1593160rYo3 = this.LLILZIL;
                    if (interfaceC1593160rYo3 != null) {
                        interfaceC1593160rYo3.LIZ();
                    }
                }
            } else {
                InterfaceC1593160rYo interfaceC1593160rYo4 = this.LLILZIL;
                if (interfaceC1593160rYo4 != null) {
                    interfaceC1593160rYo4.LIZJ(getWidth(), getHeight(), motionEvent);
                }
            }
        }
        View.OnTouchListener onTouchListener = this.LLILZ;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = this.LLILLL;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    public final void setAvatarImageViewScaleX(float f) {
        ImageView imageView = this.LLJILLL;
        if (imageView != null) {
            C786410Ut5.Qb(imageView, f);
        }
    }

    public final void setAvatarImageViewScaleY(float f) {
        ImageView imageView = this.LLJILLL;
        if (imageView != null) {
            C786410Ut5.rc(imageView, f);
        }
    }

    public final void setCountDotText(String str) {
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setCountDotView(TextView textView) {
        this.LLJIJIL = textView;
    }

    public final void setCountDotVisibility(int i) {
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, i);
        }
    }

    public final void setCustomIconV2Callback(InterfaceC1685420txc<? super Boolean, ? super Pair<Integer, Integer>, ? super String, ? super String, ? super C0NLT, Unit> interfaceC1685420txc) {
        this.LLJJIJIL = interfaceC1685420txc;
    }

    public final void setCustomIconView$homepage_common_release(ImageView imageView) {
        this.LLJJIJI = imageView;
    }

    public final void setCustomIconViewV2(SmartImageView smartImageView) {
        this.LLJJIJIIJIL = smartImageView;
    }

    public final void setCustomIconVisible(int i) {
        SmartImageView smartImageView = this.LLJJIJIIJIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(i, smartImageView);
        }
    }

    public final void setCustomViewAnimation$homepage_common_release(AbstractC2273051Dy3 abstractC2273051Dy3) {
        ImageView imageView;
        ImageView imageView2 = this.LLILZLL;
        if (imageView2 != null && (imageView = this.LLJJIJI) != null) {
            abstractC2273051Dy3.LIZLLL(imageView2, imageView);
        }
    }

    public final void setIconTabLogic(AbstractC1592930rYR abstractC1592930rYR) {
        this.LLJILJILJ = abstractC1592930rYR;
    }

    public final void setRedDotVIew(ImageView imageView) {
        this.LLJI = imageView;
    }

    public final void setRedViewScaleX(float f) {
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            C786410Ut5.Qb(imageView, f);
        }
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            C786410Ut5.Mb(f, textView);
        }
    }

    public final void setRedViewScaleY(float f) {
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            C786410Ut5.rc(imageView, f);
        }
        TextView textView = this.LLJIJIL;
        if (textView != null) {
            C786410Ut5.nc(f, textView);
        }
    }

    public final void setTabDotVisibility(int i) {
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            if (this.LLJJI) {
                i = 8;
            }
            C786410Ut5.LJZI(i, imageView);
        }
    }

    public final void setTabIconBackImageDrawable(Drawable drawable) {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setTabIconBackLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.c6(imageView, layoutParams);
        }
    }

    public final void setTabIconBackScaleType(ImageView.ScaleType scaleType) {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            imageView.setScaleType(scaleType);
        }
    }

    public final void setTabIconImageDrawable(Drawable drawable) {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setTabIconScaleX(float f) {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.Qb(imageView, f);
        }
    }

    public final void setTabIconScaleY(float f) {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.rc(imageView, f);
        }
    }

    public final void setTabIconVisibility(int i) {
        ImageView imageView = this.LLILZLL;
        if (imageView != null) {
            C786410Ut5.LJZI(i, imageView);
        }
    }

    public final void setTabLottieIconVisibility(int i) {
        C1295960jpS c1295960jpS = this.LLIZLLLIL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(i, c1295960jpS);
        }
    }

    public final void setTabRefreshAlpha(float f) {
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.V4(imageView, f);
        }
    }

    public final void setTabRefreshIconColor(int i) {
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            imageView.setColorFilter(i);
        }
    }

    public final void setTabRefreshRotation(float f) {
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.Cb(imageView, f);
        }
    }

    public final void setTabRefreshScaleX(float f) {
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.Qb(imageView, f);
        }
    }

    public final void setTabRefreshScaleY(float f) {
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.rc(imageView, f);
        }
    }

    public final void setTabRefreshVisibility(int i) {
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C786410Ut5.LJZI(i, imageView);
        }
    }

    public final void setTitleLetterSpacing(float f) {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setLetterSpacing(f);
        }
    }

    public final void setTitleText(CharSequence charSequence) {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(charSequence);
        }
    }

    public final void setTitleTextColor(int i) {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public final void setTitleTextResource(int i) {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(i);
        }
    }

    public final void setTitleTuxColor(int i) {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(i);
        }
    }

    public final void setTitleTuxFont(int i) {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i);
        }
    }

    public final void setTitleVisibility(int i) {
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
    }

    public final void setTouchListener(View.OnTouchListener onTouchListener) {
        this.LLILLL = onTouchListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [REQUEST, X.0kbR] */
    public final void LJII(final String str, final C0NLT c0nlt) {
        SmartImageView smartImageView = this.LLJJIJIIJIL;
        if (smartImageView != null) {
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJIJI = "tab_icon_cache";
            c1325700kbQLIZLLL.LJI = EnumC1325560kbC.CUSTOM;
            c1325700kbQLIZLLL.LIZIZ = EnumC1320950kTl.DISK_CACHE;
            ?? LIZ = c1325700kbQLIZLLL.LIZ();
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = "unknown";
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LIZJ = "dynamic_tab_icon";
            c1320810kTXLIZJ.LIZLLL = LIZ;
            c1320810kTXLIZJ.LJIILJJIL = smartImageView.getController();
            c1320810kTXLIZJ.LJIL = new InterfaceC1320080kSM() { // from class: X.0rYf
                @Override // X.InterfaceC1320080kSM
                public final void LIZ(int i, String str2, boolean z) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                c259800zU.element = "memory";
                                return;
                            }
                            return;
                        }
                        c259800zU.element = "encode_memory";
                        return;
                    }
                    c259800zU.element = "disk";
                }
            };
            c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0rYY
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LIZLLL(String str2, Throwable th) {
                    String message;
                    InterfaceC1685420txc<? super Boolean, ? super Pair<Integer, Integer>, ? super String, ? super String, ? super C0NLT, Unit> interfaceC1685420txc = this.LIZIZ.LLJJIJIL;
                    Boolean bool = Boolean.FALSE;
                    String str3 = c259800zU.element;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Fresco_Error: ");
                    String message2 = null;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    interfaceC1685420txc.invoke(bool, null, str3, C2188811AlT.LIZIZ(sbLIZ), c0nlt);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setTabIconBackImage: onFailure, url: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", throwable: ");
                    if (th != null) {
                        message2 = th.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str2, Object obj, Animatable animatable) {
                    Pair pair;
                    InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
                    C1592950rYT c1592950rYT = this.LIZIZ;
                    c1592950rYT.LLJJJ = true;
                    InterfaceC1685420txc<? super Boolean, ? super Pair<Integer, Integer>, ? super String, ? super String, ? super C0NLT, Unit> interfaceC1685420txc = c1592950rYT.LLJJIJIL;
                    Boolean bool = Boolean.TRUE;
                    if (interfaceC1330440kj4 != null) {
                        pair = new Pair(Integer.valueOf(interfaceC1330440kj4.getWidth()), Integer.valueOf(interfaceC1330440kj4.getHeight()));
                    } else {
                        pair = null;
                    }
                    interfaceC1685420txc.invoke(bool, pair, c259800zU.element, null, c0nlt);
                }
            };
            smartImageView.setController(c1320810kTXLIZJ.LIZ());
        }
    }
}
