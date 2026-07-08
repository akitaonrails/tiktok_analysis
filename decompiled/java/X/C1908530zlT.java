package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.view.GameHeaderView$SavedState;
import com.bytedance.android.livesdk.game.model.GameDetailHeaderCTA;
import com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo;
import com.bytedance.android.livesdk.game.model.GameDetailHeaderProps;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908530zlT extends ConstraintLayout implements InterfaceC1902160zbC {
    public final View LL;
    public final C1324720kZq LLILLJJLI;
    public final TuxTextView LLILLL;
    public final LinearLayout LLILZ;
    public final C197039127h LLILZIL;
    public final TuxTextView LLILZLL;
    public final C1324720kZq LLIZ;
    public final TextView LLIZLLLIL;
    public final C197039127h LLJ;
    public final View LLJI;
    public GameDetailHeaderInfo LLJIJIL;
    public View LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public C1881590z41 LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public long LLJJIJIL;
    public Pair<String, ? extends WeakReference<Bitmap>> LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final ArrayList<GameDetailHeaderProps> LLJJJJLIIL;
    public final C01GW LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public InterfaceC1886280zBa LLJLIL;

    public static /* synthetic */ void getState$annotations() {
    }

    private final String getDropsId() {
        GameDetailHeaderInfo gameDetailHeaderInfo = this.LLJIJIL;
        if ((gameDetailHeaderInfo == null || gameDetailHeaderInfo.activityType != 1) && (0 == 0 || gameDetailHeaderInfo == null)) {
            return null;
        }
        return gameDetailHeaderInfo.bizId;
    }

    private final int getScreenHeight() {
        return ((Number) this.LLJJL.getValue()).intValue();
    }

    private final InterfaceC497601wk getViewCoroutineScope() {
        return (InterfaceC497601wk) this.LLJJJJJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E0() {
        /*
            r3 = this;
            java.lang.String r1 = r3.LLJILJILJ
            java.lang.String r0 = "interactive_full_screen"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 0
            if (r0 == 0) goto L23
            X.0z41 r0 = r3.LLJJ
            if (r0 == 0) goto L24
            X.0KYM r1 = r0.LJJI()
            java.lang.String r0 = "sub_page"
            java.lang.String r0 = r1.LIZIZ(r0)
            if (r0 != 0) goto L1d
            java.lang.String r0 = ""
        L1d:
            int r0 = r0.length()
            if (r0 <= 0) goto L24
        L23:
            return r2
        L24:
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r0 = r3.LLJIJIL
            if (r0 == 0) goto L23
            java.lang.String r1 = r0.headerId
            if (r1 == 0) goto L23
            X.14i1<java.util.Set<java.lang.String>> r0 = X.InterfaceC772390URp.b
            java.lang.Object r0 = r0.LIZIZ()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908530zlT.E0():boolean");
    }

    @Override // X.InterfaceC1902160zbC
    public Rect getClickArea() {
        C197039127h c197039127h;
        int i = this.LLJJJIL;
        if (i != 1) {
            if (i != 3 || (c197039127h = this.LLJ) == null) {
                return null;
            }
            Rect rect = new Rect();
            c197039127h.getGlobalVisibleRect(rect);
            return rect;
        }
        C197039127h c197039127h2 = this.LLILZIL;
        if (c197039127h2 == null) {
            return null;
        }
        Rect rect2 = new Rect();
        c197039127h2.getGlobalVisibleRect(rect2);
        return rect2;
    }

    public final int getCollapsedHeaderHeight() {
        String str = this.LLJILJILJ;
        return (int) ((Intrinsics.LJFF(str, "interactive_full_screen") || Intrinsics.LJFF(str, "immersive_full_screen")) ? C497740JfY.LJIIZILJ() * 0.5589744f : C497740JfY.LIZIZ(90.0f));
    }

    public final int getExpandedHeaderHeight() {
        float fLIZIZ;
        float fLJIIZILJ;
        float f;
        String str = this.LLJILJILJ;
        if (Intrinsics.LJFF(str, "interactive_full_screen")) {
            f = 1.7692307f;
            if ((getScreenHeight() * 1.0f) / C497740JfY.LJIIZILJ() <= 1.7692307f) {
                return getScreenHeight() - ((int) C497740JfY.LIZIZ(110.0f));
            }
            fLJIIZILJ = C497740JfY.LJIIZILJ();
        } else {
            if (!Intrinsics.LJFF(str, "immersive_full_screen")) {
                fLIZIZ = C497740JfY.LIZIZ(90.0f);
                return (int) fLIZIZ;
            }
            fLJIIZILJ = C497740JfY.LJIIZILJ();
            f = 0.5589744f;
        }
        fLIZIZ = fLJIIZILJ * f;
        return (int) fLIZIZ;
    }

    @Override // X.InterfaceC1902160zbC
    public int getState() {
        int i = this.LLJJJIL;
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        return i;
    }

    public final int h0() {
        int iLIZIZ = (int) C497740JfY.LIZIZ(250.0f);
        View view = this.LLJI;
        int measuredHeight = view != null ? view.getMeasuredHeight() : (int) C497740JfY.LIZIZ(220.0f);
        View view2 = this.LLJI;
        return iLIZIZ + (measuredHeight - (view2 != null ? view2.getPaddingTop() : 0));
    }

    public final void j0() {
        final String str;
        Pair<String, ? extends WeakReference<Bitmap>> pair;
        WeakReference<Bitmap> second;
        Bitmap bitmap;
        GameDetailHeaderInfo gameDetailHeaderInfo = this.LLJIJIL;
        if (gameDetailHeaderInfo == null || (str = gameDetailHeaderInfo.headerImageUrl) == null) {
            C1324720kZq c1324720kZq = this.LLILLJJLI;
            if (c1324720kZq != null) {
                C500260Jjc.LJIILLIIL(c1324720kZq);
                return;
            }
            return;
        }
        Pair<String, ? extends WeakReference<Bitmap>> pair2 = this.LLJJJ;
        if (Intrinsics.LJFF(pair2 != null ? pair2.getFirst() : null, str) && (pair = this.LLJJJ) != null && (second = pair.getSecond()) != null && (bitmap = second.get()) != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            e0(bitmap);
            return;
        }
        Uri uri = UriProtector.parse(str);
        int expandedHeaderHeight = getExpandedHeaderHeight();
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        c1325700kbQLIZLLL.LIZJ = new C1324630kZh((int) ((getExpandedHeaderHeight() * 69.0f) / 39.0f), expandedHeaderHeight);
        C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), getContext()).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0krp
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                C1324720kZq c1324720kZq2 = this.LIZ.LLILLJJLI;
                if (c1324720kZq2 != null) {
                    c1324720kZq2.setImageDrawable(null);
                }
                C1324720kZq c1324720kZq3 = this.LIZ.LLILLJJLI;
                if (c1324720kZq3 != null) {
                    C500260Jjc.LJIILLIIL(c1324720kZq3);
                }
                this.LIZ.LLJJJ = null;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download header cover failed: ");
                sbLIZ.append(interfaceC1320200kSY.LIZLLL());
                C20441214yg.LJ("GameHeaderView", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                AbstractC1325130kaV abstractC1325130kaV;
                Bitmap underlyingBitmap;
                C1323050kX9<AbstractC1327750kej> result = interfaceC1320200kSY.getResult();
                AbstractC1327750kej abstractC1327750kej = null;
                if (result != null) {
                    abstractC1327750kej = result.get();
                }
                if ((abstractC1327750kej instanceof AbstractC1325130kaV) && (abstractC1325130kaV = (AbstractC1325130kaV) abstractC1327750kej) != null && (underlyingBitmap = abstractC1325130kaV.getUnderlyingBitmap()) != null) {
                    this.LIZ.e0(underlyingBitmap);
                    this.LIZ.LLJJJ = new Pair<>(str, new WeakReference(underlyingBitmap));
                }
            }
        }, C822700WPc.LL);
    }

    public final void l0() {
        GameDetailHeaderCTA gameDetailHeaderCTA;
        String str;
        String str2;
        GameDetailHeaderInfo gameDetailHeaderInfo = this.LLJIJIL;
        int i = 8;
        if (gameDetailHeaderInfo == null || (str2 = gameDetailHeaderInfo.activityTitle) == null) {
            TextView textView = this.LLIZLLLIL;
            if (textView != null) {
                C500260Jjc.LJIILLIIL(textView);
            }
        } else {
            TextView textView2 = this.LLIZLLLIL;
            if (textView2 != null) {
                C786410Ut5.LJLLLLLL((str2.length() <= 0 || this.LLJJJIL != 3) ? 8 : 0, textView2);
            }
            TextView textView3 = this.LLIZLLLIL;
            if (textView3 != null) {
                textView3.setText(str2);
            }
        }
        GameDetailHeaderInfo gameDetailHeaderInfo2 = this.LLJIJIL;
        if (gameDetailHeaderInfo2 == null || (gameDetailHeaderCTA = gameDetailHeaderInfo2.gameDetailHeaderCta) == null || (str = gameDetailHeaderCTA.headerCtaText) == null) {
            C197039127h c197039127h = this.LLJ;
            if (c197039127h != null) {
                C500260Jjc.LJIILLIIL(c197039127h);
                return;
            }
            return;
        }
        C197039127h c197039127h2 = this.LLJ;
        if (c197039127h2 != null) {
            if (str.length() > 0 && this.LLJJJIL == 3) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, c197039127h2);
        }
        C197039127h c197039127h3 = this.LLJ;
        if (c197039127h3 != null) {
            c197039127h3.setText(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Integer] */
    @Override // X.InterfaceC1902160zbC
    public final void l1() {
        AnimatorSet animatorSet = new AnimatorSet();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float expandedHeaderHeight = getExpandedHeaderHeight() * 1.03f;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = 0;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eWL
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer numValueOf;
                C1324720kZq c1324720kZq = this.LL.LLIZ;
                if (c1324720kZq != null) {
                    float f = expandedHeaderHeight;
                    ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                    ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (r6.getCollapsedHeaderHeight() + ((f - r6.getCollapsedHeaderHeight()) * valueAnimator2.getAnimatedFraction()));
                        C786410Ut5.W5(c1324720kZq, layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (valueAnimatorOfFloat.getAnimatedFraction() > 0.0f) {
                    C259800zU<Integer> c259800zU2 = c259800zU;
                    Integer num = c259800zU2.element;
                    C1324720kZq c1324720kZq2 = this.LL.LLIZ;
                    T tValueOf = 0;
                    if (c1324720kZq2 != null) {
                        numValueOf = Integer.valueOf(c1324720kZq2.getHeight());
                    } else {
                        numValueOf = null;
                    }
                    if (Intrinsics.LJFF(num, numValueOf)) {
                        ViewParent root = this.LL.getRoot();
                        if (root != null) {
                            root.requestLayout();
                        }
                        C20441214yg.LJIIL("GameHeaderView", "perform expand could not update the height of cover view, call root view requestLayout method");
                        tValueOf = 0;
                    } else {
                        C1324720kZq c1324720kZq3 = this.LL.LLIZ;
                        if (c1324720kZq3 != null) {
                            tValueOf = Integer.valueOf(c1324720kZq3.getHeight());
                        }
                    }
                    c259800zU2.element = tValueOf;
                }
            }
        });
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f));
        valueAnimatorOfFloat.setDuration(320L);
        final ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eWK
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float expandedHeaderHeight2 = this.LL.getExpandedHeaderHeight() * 1.03f;
                C1324720kZq c1324720kZq = this.LL.LLIZ;
                if (c1324720kZq != null) {
                    ValueAnimator valueAnimator2 = valueAnimatorOfFloat2;
                    ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (expandedHeaderHeight2 - ((expandedHeaderHeight2 - r0.getExpandedHeaderHeight()) * valueAnimator2.getAnimatedFraction()));
                        C786410Ut5.W5(c1324720kZq, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        });
        valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f));
        valueAnimatorOfFloat2.setDuration(80L);
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        final ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zlW
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = this.LL.LL;
                if (view != null) {
                    ValueAnimator valueAnimator2 = valueAnimatorOfFloat3;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (r6.LLJJLIIIJLLLLLLLZ + ((r6.getColorMaskExpandHeight() - r6.LLJJLIIIJLLLLLLLZ) * valueAnimator2.getAnimatedFraction()));
                        C786410Ut5.W5(view, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        });
        valueAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f));
        valueAnimatorOfFloat3.setDuration(320L);
        final ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat4.setInterpolator(new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f));
        valueAnimatorOfFloat4.setDuration(80L);
        final TextView[] textViewArr = {this.LLJ, this.LLIZLLLIL};
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zlb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView[] textViewArr2 = textViewArr;
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat4;
                C1908530zlT c1908530zlT = this;
                for (TextView textView : textViewArr2) {
                    if (textView != null) {
                        C786410Ut5.S4(1 - valueAnimator2.getAnimatedFraction(), textView);
                        C786410Ut5.cd(c1908530zlT.LLJL * valueAnimator2.getAnimatedFraction(), textView);
                    }
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new Animator.AnimatorListener() { // from class: X.0zla
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                for (TextView textView : textViewArr) {
                    if (textView != null) {
                        C500260Jjc.LJIILLIIL(textView);
                        C786410Ut5.S4(0.0f, textView);
                        C786410Ut5.cd(this.LLJL, textView);
                    }
                }
            }
        });
        final ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
        valueAnimatorOfFloat5.setDuration(320L);
        final TuxTextView[] tuxTextViewArr = {this.LLILLL, this.LLILZIL, this.LLILZLL};
        valueAnimatorOfFloat5.addListener(new Animator.AnimatorListener() { // from class: X.0vgN
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                for (TuxTextView tuxTextView : tuxTextViewArr) {
                    if (tuxTextView != null) {
                        C786410Ut5.wd(tuxTextView, 0.0f);
                    }
                }
            }
        });
        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eVr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TuxTextView[] tuxTextViewArr2 = tuxTextViewArr;
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat5;
                for (TuxTextView tuxTextView : tuxTextViewArr2) {
                    if (tuxTextView != null) {
                        C786410Ut5.B5(tuxTextView, valueAnimator2.getAnimatedFraction());
                    }
                }
            }
        });
        final ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.65f, 0.0f, 0.35f, 1.0f));
        valueAnimatorOfFloat6.setDuration(320L);
        final int iLIZIZ = (int) C497740JfY.LIZIZ(15.0f);
        valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eVt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout linearLayout = this.LL.LLILZ;
                if (linearLayout != null) {
                    C786410Ut5.W4(linearLayout, valueAnimatorOfFloat6.getAnimatedFraction());
                }
                LinearLayout linearLayout2 = this.LL.LLILZ;
                if (linearLayout2 != null) {
                    C786410Ut5.hd(linearLayout2, iLIZIZ * (1 - valueAnimatorOfFloat6.getAnimatedFraction()));
                }
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorSet, valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.0zlf
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C19724012Fa.LIZLLL(160L, this.LL, new C1908670zlh(valueAnimatorOfFloat6));
            }
        });
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.0eVn
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1908530zlT c1908530zlT = this.LL;
                c1908530zlT.getClass();
                if (C500260Jjc.LJJIFFI(InterfaceC772390URp.a.LIZIZ())) {
                    C19724012Fa.LIZLLL(3000L, c1908530zlT, new C1091550eVl(c1908530zlT));
                }
                this.LL.z0(false);
                C1908530zlT c1908530zlT2 = this.LL;
                c1908530zlT2.LLJJJJ = false;
                c1908530zlT2.u0(true);
            }
        });
        animatorSet2.start();
    }

    public final void n0() {
        String str;
        GameDetailHeaderInfo gameDetailHeaderInfo = this.LLJIJIL;
        if (gameDetailHeaderInfo == null || (str = gameDetailHeaderInfo.headerImageThemeColor) == null) {
            View view = this.LL;
            if (view != null) {
                C500260Jjc.LJIILLIIL(view);
                return;
            }
            return;
        }
        if (str.length() == 0 || !Intrinsics.LJFF(this.LLJILJILJ, "interactive_full_screen")) {
            return;
        }
        View view2 = this.LL;
        if (view2 != null) {
            C500260Jjc.LLFFF(view2);
        }
        View view3 = this.LL;
        if (view3 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            int color = ColorProtector.parseColor(str);
            gradientDrawable.setColors(new int[]{color, color, 0});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
            view3.setBackground(gradientDrawable);
        }
    }

    public final void p0() {
        String str;
        Drawable drawable;
        C1324720kZq c1324720kZq;
        GameDetailHeaderInfo gameDetailHeaderInfo = this.LLJIJIL;
        if (gameDetailHeaderInfo == null || (str = gameDetailHeaderInfo.headerImageUrl) == null) {
            return;
        }
        if (Intrinsics.LJFF(this.LLJILLL, str)) {
            n0();
            if (!Intrinsics.LJFF(this.LLJILJILJ, "interactive_full_screen") || (c1324720kZq = this.LLILLJJLI) == null) {
                return;
            }
            C500260Jjc.LLFFF(c1324720kZq);
            return;
        }
        C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
        url.LJIL = true;
        url.LJIIL = new C0IYA() { // from class: X.0zlU
            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZ() {
                View view = this.LIZ.LL;
                if (view != null) {
                    view.setBackground(null);
                }
                View view2 = this.LIZ.LL;
                if (view2 != null) {
                    C500260Jjc.LJIILLIIL(view2);
                }
            }

            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZLLL(String str2, Exception exc) {
                C1324720kZq c1324720kZq2;
                C1908530zlT c1908530zlT = this.LIZ;
                if (c1908530zlT.LLJILLL != null && (c1324720kZq2 = c1908530zlT.LLIZ) != null) {
                    c1324720kZq2.setActualImageResource(R.drawable.esc);
                }
                C1908530zlT c1908530zlT2 = this.LIZ;
                c1908530zlT2.LLJILLL = null;
                View view = c1908530zlT2.LL;
                if (view != null) {
                    C500260Jjc.LJIILLIIL(view);
                }
                C1324720kZq c1324720kZq3 = this.LIZ.LLILLJJLI;
                if (c1324720kZq3 != null) {
                    C500260Jjc.LJIILLIIL(c1324720kZq3);
                }
            }

            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZJ(int i, int i2, String str2) {
                C1324720kZq c1324720kZq2;
                C1908530zlT c1908530zlT = this.LIZ;
                c1908530zlT.LLJILLL = str2;
                c1908530zlT.n0();
                if (Intrinsics.LJFF(this.LIZ.LLJILJILJ, "interactive_full_screen") && (c1324720kZq2 = this.LIZ.LLILLJJLI) != null) {
                    C500260Jjc.LLFFF(c1324720kZq2);
                }
            }
        };
        if (this.LLJILLL == null) {
            url.LJIIIZ = R.drawable.esc;
        } else {
            C1324720kZq c1324720kZq2 = this.LLIZ;
            if (c1324720kZq2 != null && (drawable = c1324720kZq2.getDrawable()) != null && drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0) {
                url.LJIIJJI = new BitmapDrawable(getResources(), C0GZ2.LIZ(drawable, drawable.getBounds().width(), drawable.getBounds().height(), null));
            }
        }
        url.LJJI(this.LLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Integer] */
    @Override // X.InterfaceC1902160zbC
    public final void rk() {
        AnimatorSet animatorSet = new AnimatorSet();
        final float collapsedHeaderHeight = getCollapsedHeaderHeight() * 1.03f;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = 0;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eWM
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer numValueOf;
                C1324720kZq c1324720kZq = this.LL.LLIZ;
                if (c1324720kZq != null) {
                    float f = collapsedHeaderHeight;
                    ValueAnimator valueAnimator2 = valueAnimatorOfFloat;
                    ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (r1.getExpandedHeaderHeight() - ((r1.getExpandedHeaderHeight() - f) * valueAnimator2.getAnimatedFraction()));
                        C786410Ut5.W5(c1324720kZq, layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                if (valueAnimatorOfFloat.getAnimatedFraction() > 0.0f) {
                    C259800zU<Integer> c259800zU2 = c259800zU;
                    Integer num = c259800zU2.element;
                    C1324720kZq c1324720kZq2 = this.LL.LLIZ;
                    T tValueOf = 0;
                    if (c1324720kZq2 != null) {
                        numValueOf = Integer.valueOf(c1324720kZq2.getHeight());
                    } else {
                        numValueOf = null;
                    }
                    if (Intrinsics.LJFF(num, numValueOf)) {
                        ViewParent root = this.LL.getRoot();
                        if (root != null) {
                            root.requestLayout();
                        }
                        C20441214yg.LJIIL("GameHeaderView", "perform collapse could not update the height of cover view, call root view requestLayout method");
                        tValueOf = 0;
                    } else {
                        C1324720kZq c1324720kZq3 = this.LL.LLIZ;
                        if (c1324720kZq3 != null) {
                            tValueOf = Integer.valueOf(c1324720kZq3.getHeight());
                        }
                    }
                    c259800zU2.element = tValueOf;
                }
            }
        });
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f));
        valueAnimatorOfFloat.setDuration(320L);
        final ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eWJ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1324720kZq c1324720kZq = this.LL.LLIZ;
                if (c1324720kZq != null) {
                    float f = collapsedHeaderHeight;
                    ValueAnimator valueAnimator2 = valueAnimatorOfFloat2;
                    ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (f - ((f - r0.getCollapsedHeaderHeight()) * valueAnimator2.getAnimatedFraction()));
                        C786410Ut5.W5(c1324720kZq, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        });
        valueAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f));
        valueAnimatorOfFloat2.setDuration(80L);
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        final ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zlX
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = this.LL.LL;
                if (view != null) {
                    ValueAnimator valueAnimator2 = valueAnimatorOfFloat3;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = (int) (r6.getColorMaskExpandHeight() - ((r6.getColorMaskExpandHeight() - r6.LLJJLIIIJLLLLLLLZ) * valueAnimator2.getAnimatedFraction()));
                        C786410Ut5.W5(view, layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        });
        valueAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f));
        valueAnimatorOfFloat3.setDuration(320L);
        final ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int iLIZIZ = (int) C497740JfY.LIZIZ(110.0f);
        final View[] viewArr = {this.LLILZ, this.LLILLL, this.LLILZIL, this.LLILZLL, this.LLJILJIL};
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Gf5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View[] viewArr2 = viewArr;
                int i = iLIZIZ;
                ValueAnimator valueAnimator2 = valueAnimatorOfFloat4;
                for (View view : viewArr2) {
                    if (view != null) {
                        C786410Ut5.ed(view, (-i) * valueAnimator2.getAnimatedFraction());
                        C786410Ut5.T4(view, 1.0f - valueAnimator2.getAnimatedFraction());
                    }
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new Animator.AnimatorListener() { // from class: X.0eVs
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1908530zlT c1908530zlT = this.LL;
                View view = c1908530zlT.LLJILJIL;
                if (view != null) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1908530zlT, view);
                    c1908530zlT.removeView(view);
                    C1908530zlT c1908530zlT2 = this.LL;
                    c1908530zlT2.LLJILJIL = null;
                    TuxTextView tuxTextView = c1908530zlT2.LLILZLL;
                    if (tuxTextView != null) {
                        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (int) C497740JfY.LIZIZ(40.0f);
                            C786410Ut5.W5(tuxTextView, marginLayoutParams);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                }
            }
        });
        valueAnimatorOfFloat4.setInterpolator(new PathInterpolator(0.5f, 0.0f, 0.75f, 0.0f));
        valueAnimatorOfFloat4.setDuration(160L);
        final ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.37f, 0.0f, 0.63f, 1.0f));
        valueAnimatorOfFloat5.setDuration(160L);
        final TextView[] textViewArr = {this.LLJ, this.LLIZLLLIL};
        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0zlY
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr2 = textViewArr;
                C1908530zlT c1908530zlT = this;
                for (TextView textView : textViewArr2) {
                    if (textView != null) {
                        C786410Ut5.S4(fFloatValue, textView);
                        C786410Ut5.cd(c1908530zlT.LLJL * (1 - fFloatValue), textView);
                    }
                }
            }
        });
        valueAnimatorOfFloat5.addListener(new Animator.AnimatorListener() { // from class: X.0zlV
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                GameDetailHeaderCTA gameDetailHeaderCTA;
                String str;
                int i;
                String str2;
                C1908530zlT c1908530zlT = this.LL;
                TextView textView = c1908530zlT.LLIZLLLIL;
                int i2 = 8;
                if (textView != null) {
                    GameDetailHeaderInfo gameDetailHeaderInfo = c1908530zlT.LLJIJIL;
                    if (gameDetailHeaderInfo != null && (str2 = gameDetailHeaderInfo.activityTitle) != null && str2.length() > 0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, textView);
                    C786410Ut5.S4(0.0f, textView);
                    C786410Ut5.cd(this.LL.LLJL, textView);
                }
                C1908530zlT c1908530zlT2 = this.LL;
                C197039127h c197039127h = c1908530zlT2.LLJ;
                if (c197039127h != null) {
                    GameDetailHeaderInfo gameDetailHeaderInfo2 = c1908530zlT2.LLJIJIL;
                    if (gameDetailHeaderInfo2 != null && (gameDetailHeaderCTA = gameDetailHeaderInfo2.gameDetailHeaderCta) != null && (str = gameDetailHeaderCTA.headerCtaText) != null && str.length() > 0) {
                        i2 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i2, c197039127h);
                    C786410Ut5.w5(c197039127h, 0.0f);
                    C786410Ut5.ud(c197039127h, this.LL.LLJL);
                }
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorSet, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.0zlg
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C19724012Fa.LIZLLL(320L, this.LL, new C1908680zli(valueAnimatorOfFloat5));
            }
        });
        animatorSet2.start();
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.0eVo
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1908530zlT c1908530zlT = this.LL;
                c1908530zlT.LLJJJJ = false;
                c1908530zlT.u0(true);
            }
        });
    }

    @Override // X.InterfaceC1902160zbC
    public final boolean sk() {
        return Intrinsics.LJFF(this.LLJILJILJ, "interactive_full_screen");
    }

    @Override // X.InterfaceC1902160zbC
    public final boolean tk() {
        return Intrinsics.LJFF(this.LLJILJILJ, "interactive_full_screen");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0() {
        /*
            r6 = this;
            java.lang.String r4 = r6.getDropsId()
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r0 = r6.LLJIJIL
            r5 = 0
            if (r0 == 0) goto L53
            int r0 = r0.activityType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L53
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L49
            java.lang.String r3 = "gamerewards"
        L1a:
            X.0z41 r0 = r6.LLJJ
            if (r0 == 0) goto L47
            X.0z3c r2 = r0.LJIIIZ()
        L22:
            java.lang.String r0 = "livesdk_gamepad_second_floor_activity_page_guide_appear"
            X.0IjA r1 = X.C0IJT.LIZ(r0)
            if (r2 == 0) goto L2e
            X.0z5M r5 = X.C1882380z5I.LIZLLL(r2)
        L2e:
            java.util.Map r0 = X.C1882380z5I.LIZ(r5)
            java.util.Map r0 = X.C476770Imp.LJFF(r0)
            r1.LJJIIZI(r0)
            java.lang.String r0 = "biz_id"
            r1.LJJII(r4, r0)
            java.lang.String r0 = "activity_type"
            r1.LJJII(r3, r0)
            r1.LIZ()
            return
        L47:
            r2 = r5
            goto L22
        L49:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L53
            java.lang.String r3 = "gip"
            goto L1a
        L53:
            java.lang.String r3 = "unset"
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908530zlT.B0():void");
    }

    @Override // X.InterfaceC1902160zbC
    public int getCollapsedHeight() {
        return getCollapsedHeaderHeight();
    }

    public final int getColorMaskExpandHeight() {
        return h0();
    }

    @Override // X.InterfaceC1902160zbC
    public int getExpandedHeight() {
        return getExpandedHeaderHeight();
    }

    public final ViewParent getRoot() {
        ViewParent parent = getParent();
        while (parent != null && parent.getParent() != null) {
            parent = parent.getParent();
        }
        return parent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        List<GameDetailHeaderProps> list;
        super.onAttachedToWindow();
        if (E0()) {
            this.LLJJIJI = true;
            C1324720kZq c1324720kZq = this.LLIZ;
            if (c1324720kZq != null) {
                c1324720kZq.setPivotX(0.5f);
                c1324720kZq.setPivotY(0.5f);
                C786410Ut5.Yb(c1324720kZq, 1.1f);
                C786410Ut5.xc(c1324720kZq, 1.1f);
                C786410Ut5.Qc(c1324720kZq, -((int) C497740JfY.LIZIZ(30.0f)));
            }
            C1324720kZq c1324720kZq2 = this.LLILLJJLI;
            if (c1324720kZq2 != null) {
                c1324720kZq2.setPivotX(0.5f);
                c1324720kZq2.setPivotY(0.5f);
                C786410Ut5.Yb(c1324720kZq2, 1.1f);
                C786410Ut5.xc(c1324720kZq2, 1.1f);
                C786410Ut5.Qc(c1324720kZq2, -((int) C497740JfY.LIZIZ(30.0f)));
            }
            C197039127h c197039127h = this.LLILZIL;
            if (c197039127h != null) {
                C786410Ut5.w5(c197039127h, 0.0f);
            }
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                C786410Ut5.B5(tuxTextView, 0.0f);
            }
            TuxTextView tuxTextView2 = this.LLILZLL;
            if (tuxTextView2 != null) {
                C786410Ut5.B5(tuxTextView2, 0.0f);
            }
            LinearLayout linearLayout = this.LLILZ;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = linearLayout.getChildAt(i);
                    if (childAt != null) {
                        C786410Ut5.T4(childAt, 0.0f);
                        C786410Ut5.Jc(childAt, -((int) C497740JfY.LIZIZ(20.0f)));
                    }
                }
            }
            GameDetailHeaderInfo gameDetailHeaderInfo = this.LLJIJIL;
            if (gameDetailHeaderInfo == null || (list = gameDetailHeaderInfo.propsList) == null || list.size() <= 0) {
                LinearLayout linearLayout2 = this.LLILZ;
                if (linearLayout2 != null) {
                    C500260Jjc.LJIILIIL(linearLayout2);
                }
            } else {
                LinearLayout linearLayout3 = this.LLILZ;
                if (linearLayout3 != null) {
                    C500260Jjc.LJIILLIIL(linearLayout3);
                }
            }
            C19724012Fa.LIZLLL(50L, this, new C1091500eVg(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2296808zG.LIZJ(getViewCoroutineScope(), null);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        GameHeaderView$SavedState gameHeaderView$SavedState = new GameHeaderView$SavedState(parcelableOnSaveInstanceState);
        gameHeaderView$SavedState.state = this.LLJJJIL;
        return gameHeaderView$SavedState;
    }

    public final InterfaceC1886280zBa getOnClickListener() {
        return this.LLJLIL;
    }

    private final void setState(int i) {
        this.LLJJJIL = i;
        if (i != 1) {
            if (i == 3) {
                C1324720kZq c1324720kZq = this.LLIZ;
                if (c1324720kZq != null) {
                    ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = getCollapsedHeaderHeight();
                        C786410Ut5.W5(c1324720kZq, layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                l0();
                View view = this.LL;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = this.LLJJLIIIJLLLLLLLZ;
                        C786410Ut5.W5(view, layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                u0(false);
                return;
            }
            return;
        }
        C1324720kZq c1324720kZq2 = this.LLIZ;
        if (c1324720kZq2 != null) {
            ViewGroup.LayoutParams layoutParams3 = c1324720kZq2.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = getExpandedHeaderHeight();
                C786410Ut5.W5(c1324720kZq2, layoutParams3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C197039127h c197039127h = this.LLJ;
        if (c197039127h != null) {
            C500260Jjc.LJIILLIIL(c197039127h);
        }
        TextView textView = this.LLIZLLLIL;
        if (textView != null) {
            C500260Jjc.LJIILLIIL(textView);
        }
        View view2 = this.LLJI;
        if (view2 != null) {
            if (view2.isLaidOut() && !view2.isLayoutRequested()) {
                View view3 = this.LL;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.height = h0();
                        C786410Ut5.W5(view3, layoutParams4);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
            } else {
                view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0zlZ
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        view4.removeOnLayoutChangeListener(this);
                        View view5 = this.LL.LL;
                        if (view5 != null) {
                            ViewGroup.LayoutParams layoutParams5 = view5.getLayoutParams();
                            if (layoutParams5 != null) {
                                layoutParams5.height = this.LL.h0();
                                C786410Ut5.W5(view5, layoutParams5);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                });
            }
        }
        z0(true);
        u0(false);
    }

    @Override // X.InterfaceC1902160zbC
    public final void LJJJJJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
            } else {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.LLJJJIL = i;
        if (i != 6) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationY(0.0f);
        }
        if (this.LLJJJIL != 4) {
            this.LLJJIJIIJIL = 0;
        }
    }

    @Override // X.InterfaceC1902160zbC
    public final void Og(int i) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(-i);
    }

    public final void e0(Bitmap bitmap) {
        String str;
        String str2;
        String first;
        Bitmap bitmap2;
        String str3;
        String first2;
        WeakReference<Bitmap> second;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("blurAndGradientCover, header_id=");
        GameDetailHeaderInfo gameDetailHeaderInfo = this.LLJIJIL;
        if (gameDetailHeaderInfo != null) {
            str = gameDetailHeaderInfo.headerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", header_image_url=");
        GameDetailHeaderInfo gameDetailHeaderInfo2 = this.LLJIJIL;
        if (gameDetailHeaderInfo2 != null) {
            str2 = gameDetailHeaderInfo2.headerImageUrl;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(", last_loader_image_url=");
        Pair<String, ? extends WeakReference<Bitmap>> pair = this.LLJJJ;
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        sbLIZ.append(first);
        sbLIZ.append(", last_load_bitmap=");
        Pair<String, ? extends WeakReference<Bitmap>> pair2 = this.LLJJJ;
        if (pair2 != null && (second = pair2.getSecond()) != null) {
            bitmap2 = second.get();
        } else {
            bitmap2 = null;
        }
        sbLIZ.append(bitmap2);
        sbLIZ.append(", isUsingCacheBitmap=");
        GameDetailHeaderInfo gameDetailHeaderInfo3 = this.LLJIJIL;
        if (gameDetailHeaderInfo3 != null) {
            str3 = gameDetailHeaderInfo3.headerImageUrl;
        } else {
            str3 = null;
        }
        Pair<String, ? extends WeakReference<Bitmap>> pair3 = this.LLJJJ;
        if (pair3 != null) {
            first2 = pair3.getFirst();
        } else {
            first2 = null;
        }
        sbLIZ.append(Intrinsics.LJFF(str3, first2));
        C20441214yg.LIZIZ("GameHeaderView", C2188811AlT.LIZIZ(sbLIZ));
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            C23250099c.LIZLLL(getViewCoroutineScope(), C0PEM.LIZJ, null, new C1099620eim(bitmap, this, null), 2);
            return;
        }
        C1324720kZq c1324720kZq = this.LLILLJJLI;
        if (c1324720kZq != null) {
            c1324720kZq.setImageDrawable(null);
        }
        C20441214yg.LJIIL("GameHeaderView", "blur and gradient cover failed: the height or width of bitmap is invalid");
    }

    public final C1324720kZq i0(String str) {
        int iIntValue;
        C1324720kZq c1324720kZq = new C1324720kZq(getContext());
        int iLIZIZ = (int) C497740JfY.LIZIZ(48.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(0.8f);
        C426750GoL.LJIIL(c1324720kZq, Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ2), 16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int iIntValue2 = 0;
        gradientDrawable.setBounds(new Rect(0, 0, iLIZIZ, iLIZIZ));
        gradientDrawable.setShape(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey9, c1324720kZq.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setColor(iIntValue);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.exq, c1324720kZq.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        }
        gradientDrawable.setStroke(iLIZIZ2, iIntValue2);
        c1324720kZq.setBackground(gradientDrawable);
        C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
        url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        url.LJIL = true;
        url.LJIILIIL = Boolean.TRUE;
        url.LJJI(c1324720kZq);
        C786410Ut5.u6(c1324720kZq, new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ));
        return c1324720kZq;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GameHeaderView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GameHeaderView$SavedState gameHeaderView$SavedState = (GameHeaderView$SavedState) parcelable;
        super.onRestoreInstanceState(gameHeaderView$SavedState.mSuperState);
        setState(gameHeaderView$SavedState.state);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(boolean r8) {
        /*
            r7 = this;
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r0 = r7.LLJIJIL
            r6 = 0
            if (r0 == 0) goto L71
            com.bytedance.android.livesdk.game.model.GameDetailHeaderCTA r0 = r0.gameDetailHeaderCta
            if (r0 == 0) goto L71
            int r0 = r0.headerCtaType
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L71
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L68
            java.lang.String r3 = "join"
        L1a:
            java.lang.String r2 = r7.getDropsId()
            boolean r1 = r7.LLJJJJ
            X.0z41 r0 = r7.LLJJ
            if (r0 == 0) goto L66
            X.0z3c r5 = r0.LJIIIZ()
        L28:
            java.lang.String r0 = "livesdk_gamepad_btn_click"
            X.0IjA r4 = X.C0IJT.LIZ(r0)
            X.C1880070z1Z.LIZ(r4, r5)
            java.lang.String r0 = "btn_name"
            r4.LJJII(r3, r0)
            java.lang.String r0 = "drops_id"
            r4.LJJII(r2, r0)
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r1 == 0) goto L64
            r1 = r3
        L42:
            java.lang.String r0 = "is_second_floor_default"
            r4.LJJII(r1, r0)
            if (r8 != 0) goto L4a
            r3 = r2
        L4a:
            java.lang.String r0 = "is_expansion"
            r4.LJJII(r3, r0)
            if (r5 == 0) goto L55
            X.0z5M r6 = X.C1882380z5I.LIZLLL(r5)
        L55:
            java.util.Map r0 = X.C1882380z5I.LIZ(r6)
            java.util.Map r0 = X.C476770Imp.LJFF(r0)
            r4.LJJIIZI(r0)
            r4.LIZ()
            return
        L64:
            r1 = r2
            goto L42
        L66:
            r5 = r6
            goto L28
        L68:
            int r0 = r2.intValue()
            if (r0 != 0) goto L71
            java.lang.String r3 = "view"
            goto L1a
        L71:
            r3 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908530zlT.s0(boolean):void");
    }

    public final void setOnClickListener(InterfaceC1886280zBa interfaceC1886280zBa) {
        this.LLJLIL = interfaceC1886280zBa;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.LLJJI
            if (r0 == 0) goto L6
            if (r9 == 0) goto Lb3
        L6:
            java.lang.String r1 = r8.LLJILJILJ
            java.lang.String r0 = "interactive_full_screen"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lb3
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r0 = r8.LLJIJIL
            r7 = 0
            if (r0 == 0) goto Lb3
            com.bytedance.android.livesdk.game.model.GameDetailHeaderCTA r0 = r0.gameDetailHeaderCta
            if (r0 == 0) goto Lb3
            X.0z41 r0 = r8.LLJJ
            r6 = 0
            if (r0 == 0) goto Lb3
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.LLJLL
            if (r0 == 0) goto Lb3
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lb3
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r4 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r6] = r0
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            int r0 = r8.LLJJJIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.C13LQ.LJJIJIIJI(r0, r1)
            if (r0 < 0) goto Lb3
            r8.LLJJI = r4
            com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r0 = r8.LLJIJIL
            if (r0 == 0) goto Lc1
            com.bytedance.android.livesdk.game.model.GameDetailHeaderCTA r0 = r0.gameDetailHeaderCta
            if (r0 == 0) goto Lc1
            int r0 = r0.headerCtaType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto Lc1
            int r0 = r1.intValue()
            if (r0 != r4) goto Lb8
            java.lang.String r3 = "join"
        L65:
            java.lang.String r2 = r8.getDropsId()
            int r0 = r8.LLJJJIL
            if (r0 != r4) goto L6e
            r6 = 1
        L6e:
            boolean r5 = r8.LLJJJJ
            X.0z41 r0 = r8.LLJJ
            if (r0 == 0) goto Lb6
            X.0z3c r1 = r0.LJIIIZ()
        L78:
            java.lang.String r0 = "livesdk_gamepad_btn_show"
            X.0IjA r4 = X.C0IJT.LIZ(r0)
            X.C1880070z1Z.LIZ(r4, r1)
            if (r1 == 0) goto L87
            X.0z5M r7 = X.C1882380z5I.LIZLLL(r1)
        L87:
            java.util.Map r0 = X.C1882380z5I.LIZ(r7)
            java.util.Map r0 = X.C476770Imp.LJFF(r0)
            r4.LJJIIZI(r0)
            java.lang.String r0 = "btn_name"
            r4.LJJII(r3, r0)
            java.lang.String r0 = "drops_id"
            r4.LJJII(r2, r0)
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r5 == 0) goto Lb4
            r1 = r3
        La3:
            java.lang.String r0 = "is_second_floor_default"
            r4.LJJII(r1, r0)
            if (r6 != 0) goto Lab
            r3 = r2
        Lab:
            java.lang.String r0 = "is_expansion"
            r4.LJJII(r3, r0)
            r4.LIZ()
        Lb3:
            return
        Lb4:
            r1 = r2
            goto La3
        Lb6:
            r1 = r7
            goto L78
        Lb8:
            int r0 = r1.intValue()
            if (r0 != 0) goto Lc1
            java.lang.String r3 = "view"
            goto L65
        Lc1:
            r3 = r7
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908530zlT.u0(boolean):void");
    }

    @Override // X.InterfaceC1902160zbC
    public final void uk(int i) {
        int height;
        C1324720kZq c1324720kZq = this.LLIZ;
        if (c1324720kZq != null) {
            ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = getExpandedHeaderHeight() + i;
                C786410Ut5.W5(c1324720kZq, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = getExpandedHeaderHeight() + i;
            C786410Ut5.W5(this, layoutParams2);
            if (this.LLJJIJIIJIL == getHeight()) {
                ViewParent root = getRoot();
                if (root != null) {
                    root.requestLayout();
                }
                C20441214yg.LJIIL("GameHeaderView", "onDrag could not update the height of cover view, call root view requestLayout method");
                height = 0;
            } else {
                height = getHeight();
            }
            this.LLJJIJIIJIL = height;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void z0(boolean z) {
        C1881590z41 c1881590z41;
        MutableLiveData<Boolean> mutableLiveData;
        String str;
        InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ;
        if ((!z || !this.LLJJIII) && Intrinsics.LJFF(this.LLJILJILJ, "interactive_full_screen")) {
            GameDetailHeaderInfo gameDetailHeaderInfo = this.LLJIJIL;
            C1882420z5M c1882420z5MLIZLLL = null;
            if (gameDetailHeaderInfo != null && gameDetailHeaderInfo.headerImageUrl != null && (c1881590z41 = this.LLJJ) != null && (mutableLiveData = c1881590z41.LLJLL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE) && C13LQ.LJJIJIIJI(Integer.valueOf(this.LLJJJIL), new Integer[]{1, 3}) >= 0) {
                if (z) {
                    this.LLJJIII = true;
                    str = "first_enter";
                } else {
                    str = "expand";
                }
                String dropsId = getDropsId();
                C1881590z41 c1881590z412 = this.LLJJ;
                if (c1881590z412 != null) {
                    interfaceC1881340z3cLJIIIZ = c1881590z412.LJIIIZ();
                } else {
                    interfaceC1881340z3cLJIIIZ = null;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_second_floor_activity_page_show");
                if (interfaceC1881340z3cLJIIIZ != null) {
                    c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3cLJIIIZ);
                }
                c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
                c474500IjALIZ.LJJII(dropsId, "drops_id");
                c474500IjALIZ.LJJII(str, "show_reason");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public C1908530zlT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C1324720kZq c1324720kZq;
        int i3 = this.LLJJJIL;
        if (i3 != 1) {
            if (i3 == 3 && (c1324720kZq = this.LLIZ) != null) {
                c1324720kZq.measure(i, View.MeasureSpec.makeMeasureSpec(getCollapsedHeaderHeight(), 1073741824));
            }
        } else {
            C1324720kZq c1324720kZq2 = this.LLIZ;
            if (c1324720kZq2 != null) {
                c1324720kZq2.measure(i, View.MeasureSpec.makeMeasureSpec(getExpandedHeaderHeight(), 1073741824));
            }
        }
        if (C13LQ.LJJIJIIJI(Integer.valueOf(this.LLJJJIL), new Integer[]{4, 5}) >= 0) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getExpandedHeaderHeight(), 1073741824));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo r16, java.lang.String r17, X.C1881590z41 r18) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1908530zlT.C0(com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo, java.lang.String, X.0z41):void");
    }

    public C1908530zlT(Context context, AttributeSet attributeSet, int i, int i2) {
        int iIntValue;
        super(context, attributeSet, i, i2);
        this.LLJILJILJ = "full_screen";
        this.LLJJJIL = 1;
        this.LLJJJJ = true;
        this.LLJJJJJIL = C452501pT.LIZIZ(new C1908640zle());
        this.LLJJJJLIIL = new ArrayList<>();
        this.LLJJL = C452501pT.LIZIZ(new C1104180eq8(context));
        this.LLJJLIIIJLLLLLLLZ = (int) C497740JfY.LIZIZ(100.0f);
        this.LLJL = (int) C497740JfY.LIZIZ(20.0f);
        C786410Ut5.Sd(R.layout.gmu, C786410Ut5.ne(context), this);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c63, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        setBackgroundColor(iIntValue);
        this.LL = findViewById(R.id.e8e);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.c4o);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sdv);
        this.LLILZ = linearLayout;
        this.LLILLL = (TuxTextView) findViewById(R.id.title);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.m02);
        this.LLILZIL = c197039127h;
        this.LLILZLL = (TuxTextView) findViewById(R.id.ffs);
        C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.iqr);
        this.LLIZ = c1324720kZq;
        this.LLIZLLLIL = (TextView) findViewById(R.id.irv);
        C197039127h c197039127h2 = (C197039127h) findViewById(R.id.e61);
        this.LLJ = c197039127h2;
        this.LLJI = findViewById(R.id.a5n);
        if (c197039127h != null) {
            c197039127h.LJJJJL(new C06YX());
        }
        if (c197039127h2 != null) {
            c197039127h2.LJJJJL(new C06YY());
        }
        if (linearLayout != null) {
            linearLayout.setShowDividers(2);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.getPaint().setColor(0);
            shapeDrawable.setIntrinsicHeight(0);
            shapeDrawable.setIntrinsicWidth((int) C497740JfY.LIZIZ(8.0f));
            linearLayout.setDividerDrawable(shapeDrawable);
        }
        if (c1324720kZq != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.exw, C1385040m98.LIZ(context, false));
            c1324720kZq.setBackgroundColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
        }
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0zlc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC1886280zBa onClickListener = this.LL.getOnClickListener();
                    if (onClickListener != null) {
                        onClickListener.LIZ();
                    }
                    this.LL.s0(true);
                }
            });
        }
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: X.0zld
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC1886280zBa onClickListener = this.LL.getOnClickListener();
                    if (onClickListener != null) {
                        onClickListener.LIZ();
                    }
                    this.LL.s0(false);
                }
            });
        }
    }
}
