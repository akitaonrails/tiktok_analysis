package X;

import Y.ALAdapterS19S0100000_24;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS272S0100000_24;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rYS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1592940rYS extends AbstractC1592930rYR {
    public Pair<Integer, Integer> LLJJ;
    public C1592290rXP LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public ValueAnimator LLJJIJIL;
    public ValueAnimator LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    @Override // X.AbstractC1592930rYR
    public final void LJIJJ() {
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJII() {
        FrameLayout.LayoutParams layoutParams;
        this.LLJJIII = false;
        FrameLayout.LayoutParams layoutParams2 = null;
        this.LLJJI = null;
        this.LLJJ = null;
        C1592950rYT c1592950rYT = this.LL;
        SmartImageView smartImageView = c1592950rYT.LLJJIJIIJIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        ImageView imageView = c1592950rYT.LLILZLL;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        c1592950rYT.LLJJJ = false;
        ImageView redDotVIew = this.LL.getRedDotVIew();
        if (redDotVIew != null) {
            ViewGroup.LayoutParams layoutParams3 = redDotVIew.getLayoutParams();
            if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0);
                layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                layoutParams.gravity = 49;
                layoutParams2 = layoutParams;
            }
            C786410Ut5.c6(redDotVIew, layoutParams2);
        }
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIJ() {
    }

    public void LJJIJLIJ() {
    }

    public boolean LJJJJ() {
        return this instanceof C1592210rXH;
    }

    public void LJJJJI(MotionEvent motionEvent) {
    }

    @Override // X.AbstractC1592930rYR
    public final SmartImageView LJ() {
        C1292100jjE c1292100jjE = new C1292100jjE(this.LL.getContext());
        c1292100jjE.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Pair<Integer, Integer> pairLJJJI = LJJJI();
        int iIntValue = pairLJJJI.getFirst().intValue();
        int iIntValue2 = pairLJJJI.getSecond().intValue();
        C1593020rYa iconData = this.LL.getIconData();
        if (C1584190rKL.LIZIZ() && iconData.LIZLLL.LIZIZ.LIZLLL) {
            Pair<Integer, Integer> pairLIZ = C1584220rKO.LIZ(new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
            int iIntValue3 = pairLIZ.getFirst().intValue();
            int iIntValue4 = pairLIZ.getSecond().intValue();
            C426750GoL.LJIIL(c1292100jjE, Integer.valueOf(c1292100jjE.getPaddingLeft() + iIntValue3), Integer.valueOf(c1292100jjE.getPaddingTop() + iIntValue4), Integer.valueOf(c1292100jjE.getPaddingRight() + iIntValue3), Integer.valueOf(c1292100jjE.getPaddingBottom() + iIntValue4), 16);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue, iIntValue2);
        layoutParams.gravity = 49;
        if (C1585030rLh.LJIIL()) {
            layoutParams.topMargin = C14LC.LJIIIZ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        }
        layoutParams.topMargin = ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(0);
            layoutParams.topMargin = 0;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1292100jjE);
        c1292100jjE.setLayoutParams(layoutParams);
        return c1292100jjE;
    }

    @Override // X.AbstractC1592930rYR
    public ImageView LJI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ImageView imageView = new ImageView(this.LL.getContext());
        imageView.setImageDrawable(this.LLILLL.LIZ(R.drawable.bvn, this.LL.getContext()));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(c19252910Tv.LIZLLL().LJIJI().LJJL().LJIIJ());
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0);
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            layoutParams.gravity = 49;
        }
        C786410Ut5.c6(imageView, layoutParams);
        if (this.LLJJ != null && this.LLJJIII) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.setMargins(LJJJI().getFirst().intValue() / 2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0);
                marginLayoutParams.setMarginStart(LJJJI().getFirst().intValue() / 2);
                marginLayoutParams2 = marginLayoutParams;
            }
            C786410Ut5.c6(imageView, marginLayoutParams2);
        }
        return imageView;
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJII() {
        ImageView imageView = new ImageView(this.LL.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    @Override // X.AbstractC1592930rYR
    public ImageView LJIIIIZZ() {
        ImageView imageView = new ImageView(this.LL.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Pair<Integer, Integer> pairLJJJI = LJJJI();
        C1593020rYa iconData = this.LL.getIconData();
        if (C1584190rKL.LIZIZ() && iconData.LIZLLL.LIZIZ.LIZLLL) {
            Pair<Integer, Integer> pairLIZ = C1584220rKO.LIZ(pairLJJJI);
            int iIntValue = pairLIZ.getFirst().intValue();
            int iIntValue2 = pairLIZ.getSecond().intValue();
            C426750GoL.LJIIL(imageView, Integer.valueOf(imageView.getPaddingLeft() + iIntValue), Integer.valueOf(imageView.getPaddingTop() + iIntValue2), Integer.valueOf(imageView.getPaddingRight() + iIntValue), Integer.valueOf(imageView.getPaddingBottom() + iIntValue2), 16);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(pairLJJJI.getFirst().intValue(), pairLJJJI.getSecond().intValue());
        layoutParams.gravity = 49;
        if (C1585030rLh.LJIIL()) {
            layoutParams.topMargin = C14LC.LJIIIZ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        }
        layoutParams.topMargin = ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(0);
            layoutParams.topMargin = 0;
        }
        C786410Ut5.c6(imageView, layoutParams);
        return imageView;
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJIIIZ() {
        Pair pair;
        ImageView imageView = new ImageView(this.LL.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        Drawable drawableLJ = C1584190rKL.LIZIZ() ? this.LLILLL.LJ(this.LL.getContext()) : this.LLILLL.LIZ(R.drawable.bvk, this.LL.getContext());
        if (drawableLJ != null) {
            imageView.setImageDrawable(drawableLJ);
        }
        Pair pair2 = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
        if (C1584190rKL.LIZIZ()) {
            int i = C1584210rKN.LIZ[C1584190rKL.LIZ().ordinal()];
            if (i == 1 || i == 2) {
                double d = 32;
                double d2 = 36;
                double d3 = 2;
                pair = new Pair(Integer.valueOf((int) ((((Number) pair2.getFirst()).doubleValue() - ((((double) ((Number) pair2.getFirst()).intValue()) * d) / d2)) / d3)), Integer.valueOf((int) ((((Number) pair2.getSecond()).doubleValue() - ((((double) ((Number) pair2.getSecond()).intValue()) * d) / d2)) / d3)));
            } else {
                pair = new Pair(0, 0);
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            C426750GoL.LJIIL(imageView, Integer.valueOf(imageView.getPaddingLeft() + iIntValue), Integer.valueOf(imageView.getPaddingTop() + iIntValue2), Integer.valueOf(imageView.getPaddingRight() + iIntValue), Integer.valueOf(imageView.getPaddingBottom() + iIntValue2), 16);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((Number) pair2.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue());
        layoutParams.gravity = 49;
        C786410Ut5.c6(imageView, layoutParams);
        return imageView;
    }

    @Override // X.AbstractC1592930rYR
    public TuxTextView LJIIJ() {
        TuxTextView tuxTextView = new TuxTextView(this.LL.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(LJIILLIIL(false));
        tuxTextView.setTextColor(C446980Hfs.LIZ(this.LL.getContext(), R.color.bd));
        tuxTextView.setLetterSpacing(0.01f);
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.bottomMargin = 0;
            layoutParams.setMarginStart(0);
            layoutParams.topMargin = 0;
            C786410Ut5.R6(tuxTextView, layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 81;
            layoutParams2.bottomMargin = C1585030rLh.LJIIL() ? C14LC.LJIIIZ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            C786410Ut5.R6(tuxTextView, layoutParams2);
        }
        tuxTextView.setGravity(17);
        tuxTextView.setSingleLine(true);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setText(this.LLILZ.LIZJ);
        return tuxTextView;
    }

    @Override // X.AbstractC1592930rYR
    public final void LJIJI() {
        if (LJJIJIIJIL(EnumC1593030rYb.SELECT, this.LLILLJJLI, false)) {
            LJJIJIL();
        }
    }

    @Override // X.AbstractC1592930rYR
    public final void LJIJJLI() {
        if (LJJIJIIJIL(EnumC1593030rYb.UNSELECT, this.LLILLJJLI, false)) {
            LJJIJIL();
        }
    }

    public final TextView LJJIL() {
        TuxTextView tuxTextView = new TuxTextView(this.LL.getContext(), null, 6, 0);
        Integer num = this.LLILZ.LIZLLL.LJFF;
        if (num != null) {
            tuxTextView.setId(num.intValue());
        }
        tuxTextView.setBackground(this.LLILLL.LIZ(R.drawable.buh, tuxTextView.getContext()));
        tuxTextView.setClickable(false);
        tuxTextView.setGravity(17);
        tuxTextView.setLines(1);
        tuxTextView.setTextSize(1, 12.0f);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, tuxTextView.getContext());
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), 0);
        tuxTextView.setTuxFont(72);
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxTextView.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(c19252910Tv.LIZLLL().LJIJI().LJJL().LJIIJ());
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, 0);
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13)));
            layoutParams.gravity = 49;
        }
        C786410Ut5.R6(tuxTextView, layoutParams);
        return tuxTextView;
    }

    public Pair<Integer, Integer> LJJJI() {
        Pair<Integer, Integer> pair = this.LLJJ;
        if (pair != null && this.LLJJIII) {
            return pair;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        int iLJJIIZ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII() ? c19252910Tv.LIZLLL().LJIJI().LJJL().LJJIIZ() : C1585030rLh.LJIIL() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)) : ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
        return new Pair<>(Integer.valueOf(iLJJIIZ), Integer.valueOf(iLJJIIZ));
    }

    public void LJJJIL() {
        if (((Boolean) this.LLJJJJ.getValue()).booleanValue() || ((Boolean) this.LLJJJIL.getValue()).booleanValue() || LJJJJ()) {
            this.LL.setTouchListener(new View.OnTouchListener() { // from class: X.0rYg
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Integer numValueOf;
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                        if (numValueOf.intValue() == 0) {
                            this.LL.LJJJJJL();
                        } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                            this.LL.LJJJJJ();
                        }
                    }
                    this.LL.LJJJJI(motionEvent);
                    return false;
                }
            });
        }
    }

    public final void LJJJJJ() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.LLJJIJIL == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS272S0100000_24(this, 5));
            valueAnimatorOfFloat.addListener(new ALAdapterS19S0100000_24(this, 1));
            this.LLJJIJIL = valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimator3 = this.LLJJIJIL;
        if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = this.LLJJIJIL) != null) {
            valueAnimator2.cancel();
        }
        if ((((Boolean) this.LLJJJJ.getValue()).booleanValue() || (((Boolean) this.LLJJJIL.getValue()).booleanValue() && this.LL.getTabIconViewScaleX() < 1.0f)) && (valueAnimator = this.LLJJIJIL) != null) {
            valueAnimator.start();
        }
    }

    public final void LJJJJJL() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.LLJJJ == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.9f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS272S0100000_24(this, 6));
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0rYk
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                }
            });
            this.LLJJJ = valueAnimatorOfFloat;
        }
        ValueAnimator valueAnimator3 = this.LLJJJ;
        if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = this.LLJJJ) != null) {
            valueAnimator2.cancel();
        }
        if ((((Boolean) this.LLJJJJ.getValue()).booleanValue() || (((Boolean) this.LLJJJIL.getValue()).booleanValue() && this.LL.LLJILLL != null)) && (valueAnimator = this.LLJJJ) != null) {
            valueAnimator.start();
        }
    }

    public final Context getContext() {
        return (Context) this.LLJJJJJIL.getValue();
    }

    @Override // X.AbstractC1592930rYR
    public void LJJIJIL() {
        Context context;
        Resources resources;
        Configuration configuration;
        LJIILIIL();
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (!c19252910Tv.LIZLLL().LJIJI().LJJL().LIZ()) {
            LJIILL();
        }
        if (this.LLJJIII) {
            LJIIL();
        }
        Context context2 = getContext();
        boolean z = false;
        boolean z2 = context2 != null && C960203pA.LIZIZ(context2);
        C1593140rYm c1593140rYmLJJJ = (C290710BaP.LIZ() && z2) ? LJJJ(LJIJ()) : LJJIZ(LJIJ());
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateResourceWithIconState tag: ");
        sbLIZ.append(this.LLILZ.LIZIZ);
        sbLIZ.append(", isSelect: ");
        sbLIZ.append(LJIJ());
        sbLIZ.append(", ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isDarkMode: ");
        sbLIZ2.append(z2);
        sbLIZ2.append(", BottomTabIconDarkModeSettings: ");
        sbLIZ2.append(C290710BaP.LIZ());
        sbLIZ2.append(", ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("context: ");
        sbLIZ3.append(this.LL.getContext());
        sbLIZ3.append(", fragmentActivity: ");
        sbLIZ3.append(C1388190mED.LIZIZ(this.LL.getContext()));
        sbLIZ3.append(", ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("resource: ");
        Context context3 = getContext();
        sbLIZ4.append(context3 != null ? context3.getResources() : null);
        sbLIZ4.append(", uiMode: ");
        Context context4 = getContext();
        sbLIZ4.append((context4 == null || (resources = context4.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.uiMode));
        sbLIZ4.append(", ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        String string = sb.toString();
        LJIJ();
        C1586120rNS.LIZ.getClass();
        C1586120rNS.LIZIZ.LJIIIIZZ(null, "BottomTab", string);
        String str = this.LLILZ.LIZIZ;
        boolean zLIZ = C290710BaP.LIZ();
        EnumC1571190qzN enumC1571190qzN = this.LLILLJJLI;
        int i = this.LL.getContext().getResources().getConfiguration().uiMode;
        StringBuilder sb2 = C1592300rXQ.LIZLLL;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append('[');
        sbLIZ5.append(str);
        sbLIZ5.append("]: settings: ");
        sbLIZ5.append(zLIZ);
        sbLIZ5.append(", darkModeFlag: ");
        sbLIZ5.append(z2);
        sbLIZ5.append(", backgroundStyle: ");
        sbLIZ5.append(enumC1571190qzN);
        sbLIZ5.append(", uiMode: ");
        sbLIZ5.append(i);
        sbLIZ5.append("; ");
        sb2.append(C2188811AlT.LIZIZ(sbLIZ5));
        if (zLIZ && z2) {
            if ((i & 48) != 32) {
                C1592300rXQ.LIZJ = true;
            }
        } else if ((i & 48) != 16) {
            C1592300rXQ.LIZJ = true;
        }
        C1592950rYT c1592950rYT = this.LL;
        LJJJJIZL(c1592950rYT, c1593140rYmLJJJ, getContext());
        if (C1584190rKL.LIZIZ() && c1593140rYmLJJJ.LIZLLL && C290710BaP.LIZ() && (context = getContext()) != null && C960203pA.LIZIZ(context)) {
            z = true;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(c1593140rYmLJJJ.LIZIZ, (this.LLILLJJLI == EnumC1571190qzN.DARK || z) ? (Context) this.LLJJIJIIJIL.getValue() : (Context) this.LLJJIJI.getValue());
        if (numLIZJ != null) {
            c1592950rYT.setTitleTextColor(numLIZJ.intValue());
        }
        c1592950rYT.setTitleTuxFont(LJIILLIIL(LJIJ()));
        TuxTextView tabTitleView = c1592950rYT.getTabTitleView();
        if (tabTitleView == null || tabTitleView.getText().toString().length() <= 16) {
            return;
        }
        if (tabTitleView.getPaint().measureText(tabTitleView.getText().toString()) > 230.0f) {
            tabTitleView.setTextSize(1, 8.0f);
        }
        if (c19252910Tv.LIZLLL().LJIJI().LLLJIL()) {
            tabTitleView.setTextSize(1, 8.0f);
        }
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJI() {
        LJJIJIL();
    }

    public C1592940rYS(C1592950rYT c1592950rYT) {
        super(c1592950rYT);
        this.LLJJIJI = C452501pT.LIZIZ(new C1593110rYj(c1592950rYT));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1593100rYi(c1592950rYT));
        this.LLJJJIL = C452501pT.LIZIZ(new C1592240rXK());
        this.LLJJJJ = C452501pT.LIZIZ(new C1592230rXJ());
        this.LLJJJJJIL = C1509305vX.LIZ(new AwS568S0100000_24(c1592950rYT, 1628));
        LJIILIIL();
        LJJIJLIJ();
        C1593020rYa c1593020rYa = this.LLILZ;
        if (LJJIJIIJIL(c1593020rYa.LJFF, c1593020rYa.LJ, true)) {
            LJJIJIL();
        }
        LJJJIL();
    }

    @Override // X.AbstractC1592930rYR
    public final void LIZIZ(InterfaceC1593160rYo interfaceC1593160rYo) {
        this.LL.LLILZIL = interfaceC1593160rYo;
    }

    @Override // X.AbstractC1592930rYR
    public void LJJIIZ(EnumC1571190qzN enumC1571190qzN) {
        if (LJJIJIIJIL(this.LLILZIL, enumC1571190qzN, true)) {
            LJJIJIL();
        }
    }

    public C1593140rYm LJJIZ(boolean z) {
        C1592290rXP c1592290rXP;
        Context context;
        if (!this.LLJJIII || (c1592290rXP = this.LLJJI) == null) {
            c1592290rXP = this.LLILZ.LIZLLL;
        }
        C1593140rYm c1593140rYm = c1592290rXP.LIZIZ;
        boolean z2 = true;
        if (!C1584190rKL.LIZIZ() || !c1593140rYm.LIZLLL || !C290710BaP.LIZ() || (context = getContext()) == null || !C960203pA.LIZIZ(context)) {
            z2 = false;
        }
        if (this.LLILLJJLI != EnumC1571190qzN.DARK && !z2) {
            if (z) {
                return c1592290rXP.LIZ;
            }
            return c1592290rXP.LIZJ;
        }
        if (z) {
            return c1592290rXP.LIZIZ;
        }
        return c1592290rXP.LIZLLL;
    }

    public C1593140rYm LJJJ(boolean z) {
        C1592290rXP c1592290rXP;
        if (!this.LLJJIII || (c1592290rXP = this.LLJJI) == null) {
            c1592290rXP = this.LLILZ.LIZLLL;
        }
        if (z) {
            return c1592290rXP.LIZIZ;
        }
        return c1592290rXP.LIZLLL;
    }

    @Override // X.AbstractC1592930rYR
    public final void LIZJ(int i, boolean z) {
        String strValueOf;
        TextView textView;
        TextView textView2;
        TextView textView3;
        if ((!Intrinsics.LJFF(this.LLILZ.LIZIZ, "NOTIFICATION") && !Intrinsics.LJFF(this.LLILZ.LIZIZ, "FRIENDS_TAB") && !Intrinsics.LJFF(this.LLILZ.LIZIZ, "USER") && !Intrinsics.LJFF(this.LLILZ.LIZIZ, "SHOP_MALL") && !Intrinsics.LJFF(this.LLILZ.LIZIZ, "Following")) || Intrinsics.LJFF(this.LLILZ.LIZIZ, "USER")) {
            return;
        }
        boolean z2 = true;
        if (!this.LLJILJILJ) {
            TextView textViewLJJIL = LJJIL();
            C1592950rYT c1592950rYT = this.LL;
            c1592950rYT.LLJIJIL = textViewLJJIL;
            if (c1592950rYT.LLJJJJJIL && (textView3 = c1592950rYT.LLJIJIL) != null) {
                C786410Ut5.S4(0.0f, textView3);
            }
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
                FrameLayout frameLayout = c1592950rYT.LLJJJJ;
                if (frameLayout != null) {
                    frameLayout.addView(c1592950rYT.LLJIJIL);
                }
            } else {
                c1592950rYT.addView(c1592950rYT.LLJIJIL);
            }
            TextView textView4 = c1592950rYT.LLJIJIL;
            if (textView4 != null) {
                textView4.bringToFront();
            }
            this.LLJILJILJ = true;
        }
        if (i <= 0) {
            this.LL.setCountDotVisibility(8);
            this.LLIZ = 0;
            return;
        }
        if (Intrinsics.LJFF(this.LLILZ.LIZIZ, "FRIENDS_TAB")) {
            if (i > 99) {
                strValueOf = "99";
            } else {
                strValueOf = String.valueOf(i);
            }
        } else if (Intrinsics.LJFF(this.LLILZ.LIZIZ, "USER")) {
            if (i > 9) {
                if (C444960Hcc.LIZIZ()) {
                    strValueOf = "+9";
                } else {
                    strValueOf = "9+";
                }
            } else {
                strValueOf = String.valueOf(i);
            }
        } else if (i > 99) {
            if (C444960Hcc.LIZIZ()) {
                strValueOf = "+99";
            } else {
                strValueOf = "99+";
            }
        } else {
            strValueOf = String.valueOf(i);
        }
        if (!z || ((textView2 = this.LL.LLJIJIL) != null && textView2.getVisibility() == 0)) {
            z2 = false;
        }
        C1592950rYT c1592950rYT2 = this.LL;
        c1592950rYT2.setCountDotVisibility(0);
        c1592950rYT2.setCountDotText(strValueOf);
        if (z2 && (textView = c1592950rYT2.LLJIJIL) != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIIZZ());
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(textView, 1));
            valueAnimatorOfFloat.start();
        }
        this.LLIZ = i;
    }

    @Override // X.AbstractC1592930rYR
    public boolean LJJIJIIJIL(EnumC1593030rYb enumC1593030rYb, EnumC1571190qzN enumC1571190qzN, boolean z) {
        if (this.LLILZIL == enumC1593030rYb && this.LLILLJJLI == enumC1571190qzN && !z) {
            return false;
        }
        if (z) {
            LJJIIZI(enumC1593030rYb);
            z = true;
        }
        if (Intrinsics.LJFF(this.LLILZ.LIZIZ, "HOME")) {
            this.LLILLJJLI = enumC1571190qzN;
        } else if (this.LLILLJJLI != enumC1571190qzN) {
            this.LLILLJJLI = enumC1571190qzN;
            if (LJIJ()) {
                return true;
            }
        }
        return z;
    }

    public final void LJJJJIZL(C1592950rYT c1592950rYT, C1593140rYm c1593140rYm, Context context) {
        Context context2;
        boolean z;
        String str = c1593140rYm.LIZJ;
        if (this.LLJJIII && str != null) {
            boolean zLIZIZ = C960203pA.LIZIZ(context);
            if ((!C290710BaP.LIZ() || !zLIZIZ) && this.LLILLJJLI != EnumC1571190qzN.DARK) {
                z = false;
            } else {
                z = true;
            }
            c1592950rYT.LJII(str, new C0NLT(false, z, LJIJ()));
        }
        if (C1585030rLh.LJIIL()) {
            if (this.LLILLJJLI == EnumC1571190qzN.DARK) {
                context2 = (Context) this.LLJJIJIIJIL.getValue();
            } else {
                context2 = (Context) this.LLJJIJI.getValue();
            }
            Integer numLIZJ = C1308910kAL.LIZJ(c1593140rYm.LIZIZ, context2);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = c1593140rYm.LIZ;
            c419910GdJ.LIZLLL = numLIZJ;
            c1592950rYT.setTabIconBackImageDrawable(c419910GdJ.LIZ(c1592950rYT.getContext()));
            return;
        }
        if (C1584190rKL.LIZIZ() && c1593140rYm.LIZLLL) {
            c1592950rYT.setTabIconImageDrawable(this.LLILLL.LIZ(c1593140rYm.LIZ, context));
            return;
        }
        if (C282050B3r.LIZ) {
            Drawable drawableLIZ = this.LLILLL.LIZ(c1593140rYm.LIZ, context);
            PreDrawableInflate preDrawableInflate = this.LLILLL;
            ((ConcurrentHashMap) preDrawableInflate.LLILLJJLI).put(Integer.valueOf(c1593140rYm.LIZ), drawableLIZ);
            c1592950rYT.setTabIconImageDrawable(drawableLIZ);
            return;
        }
        c1592950rYT.setTabIconImageDrawable(this.LLILLL.LIZ(c1593140rYm.LIZ, context));
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIIJZLJL(C19EG c19eg, C592330NLb c592330NLb, C1592290rXP c1592290rXP, Pair pair) {
        C1593140rYm c1593140rYmLJJIZ;
        boolean z;
        ImageView redDotVIew;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LLJJIII = true;
        this.LLJJI = c1592290rXP;
        this.LLJJ = new Pair<>(Integer.valueOf((int) (((Number) pair.getFirst()).floatValue() * (r3.getSecond().intValue() / ((Number) pair.getSecond()).intValue()))), LJJJI().getSecond());
        LJIIL();
        boolean zLIZIZ = C960203pA.LIZIZ(c19eg);
        if (C290710BaP.LIZ() && zLIZIZ) {
            c1593140rYmLJJIZ = LJJJ(LJIJ());
        } else {
            c1593140rYmLJJIZ = LJJIZ(LJIJ());
        }
        SmartImageView customIconViewV2 = this.LL.getCustomIconViewV2();
        if (customIconViewV2 != null) {
            ViewGroup.LayoutParams layoutParams = customIconViewV2.getLayoutParams();
            layoutParams.width = LJJJI().getFirst().intValue();
            layoutParams.height = LJJJI().getSecond().intValue();
            C786410Ut5.G6(customIconViewV2, layoutParams);
        }
        String str = c1593140rYmLJJIZ.LIZJ;
        if (str != null) {
            this.LL.setCustomIconV2Callback(new C1592180rXE(this, c592330NLb));
            C1592950rYT c1592950rYT = this.LL;
            boolean zLIZIZ2 = C960203pA.LIZIZ(c19eg);
            if ((!C290710BaP.LIZ() || !zLIZIZ2) && this.LLILLJJLI != EnumC1571190qzN.DARK) {
                z = false;
            } else {
                z = true;
            }
            c1592950rYT.LJII(str, new C0NLT(true, z, LJIJ()));
            if (this.LLJJ != null && (redDotVIew = this.LL.getRedDotVIew()) != null) {
                ViewGroup.LayoutParams layoutParams2 = redDotVIew.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.setMargins(LJJJI().getFirst().intValue() / 2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, 0);
                    marginLayoutParams.setMarginStart(LJJJI().getFirst().intValue() / 2);
                    marginLayoutParams2 = marginLayoutParams;
                }
                C786410Ut5.c6(redDotVIew, marginLayoutParams2);
                return;
            }
            return;
        }
        LJJII();
    }
}
