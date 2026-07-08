package X;

import Y.ACListenerS124S0200000_21;
import Y.ACListenerS155S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mHB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390030mHB extends AbstractC1389950mH3 {
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(15.305d)));
    public final Context LLILZLL;
    public final View LLIZ;
    public final C1360890lWB LLIZLLLIL;
    public View LLJ;
    public boolean LLJI;
    public final float LLJIJIL;

    @Override // X.AbstractC1389950mH3
    public final View LJJIJIIJI() {
        View view = this.LLJ;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // X.AbstractC1389950mH3, X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (this.LLILLL != null) {
            this.LLIZLLLIL.LIZ.LIZ = 0L;
        }
        super.dismiss();
    }

    @Override // X.AbstractC1389950mH3
    public final void LJJIIJ(boolean z) {
        View view = null;
        if (z) {
            View view2 = this.LLJ;
            if (view2 != null) {
                view = view2;
            }
            View viewFindViewById = view.findViewById(R.id.y55);
            float f = this.LLJIJIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
            viewFindViewById.setTranslationY(f);
            return;
        }
        View view3 = this.LLJ;
        if (view3 != null) {
            view = view3;
        }
        View viewFindViewById2 = view.findViewById(R.id.y55);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById2);
        viewFindViewById2.setAlpha(1.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById2);
        viewFindViewById2.setTranslationY(0.0f);
    }

    @Override // X.AbstractC1389950mH3
    public final void LJJIIZ(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        long j;
        View view = this.LLJ;
        if (view == null) {
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.y55);
        if (z) {
            f4 = this.LLJIJIL;
            f = 0.0f;
            f3 = 0.0f;
            f2 = 1.0f;
        } else {
            f = this.LLJIJIL;
            f2 = 0.0f;
            f3 = 1.0f;
            f4 = 0.0f;
        }
        if (C07XO.LIZ) {
            new C21647019ng(viewFindViewById.getContext(), viewFindViewById, new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 75L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(f3, f2)))), false).LJI(true);
            return;
        }
        if (C1389890mGx.LJFF >= 4) {
            float f5 = 2;
            new C21647019ng(viewFindViewById.getContext(), viewFindViewById, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(1218.47f), new C1342130l1v(55.85f)), C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(f3, f2)), new C19746412Nq("translationY", new C0HV5(f4 * f5, f * f5)))), false).LJI(true);
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(viewFindViewById, "translationY", f4, f).setDuration(348L);
        duration.setInterpolator(new InterpolatorC448120Hhi(1.71f));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, "alpha", f3, f2);
        if (z) {
            j = 150;
        } else {
            j = 100;
        }
        ObjectAnimator duration2 = objectAnimatorOfFloat.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration2, duration);
        animatorSet.start();
    }

    @Override // X.AbstractC1389950mH3
    public final void LJJIIJZLJL(View view, CharSequence charSequence) {
        view.announceForAccessibility(charSequence);
        View view2 = this.LLJ;
        if (view2 == null) {
            view2 = null;
        }
        View viewFindViewById = view2.findViewById(R.id.roj);
        viewFindViewById.setFocusable(true);
        viewFindViewById.setContentDescription(charSequence);
    }

    public C1390030mHB(Context context, View view, C1360890lWB c1360890lWB) {
        Pair pair;
        LayerDrawable layerDrawableLJIILIIL;
        int i;
        int iLIZIZ;
        Function1<? super FrameLayout, Unit> function1;
        super(view, c1360890lWB);
        this.LLILZLL = context;
        this.LLIZ = view;
        this.LLIZLLLIL = c1360890lWB;
        this.LLJI = true;
        this.LLJIJIL = C418440Gaw.LIZIZ(20);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxBottomToast, R.attr.xi, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxBottomToast__tux_msgFont, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxBottomToast__tux_bottomToastBgColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxBottomToast__tux_bottomToastNewBgColor, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxBottomToast__tux_bottomToastBgCorner, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxBottomToast__tux_bottomToastNewBgCorner, 0.0f);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxBottomToast__tux_bottomToastShadow, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxBottomToast__tux_bottomToastSuccessIcon, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxBottomToast__tux_bottomToastErrorIcon, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxBottomToast__tux_bottomToastInfoIcon, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxBottomToast__tux_bottomToastWarningIcon, 0);
        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxBottomToast__tux_bottomToastChevronIcon, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxBottomToast__tux_bottomToastContentColor, 0);
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxBottomToast__tux_bottomToastButtonVariant, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxBottomToast__tux_bottomToastButtonSize, 0);
        int i6 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxBottomToast__tux_bottomToastLinkTextVariant, 0);
        int i7 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxBottomToast__tux_bottomToastLinkTextSize, 0);
        typedArrayObtainStyledAttributes.recycle();
        View viewSd = C786410Ut5.Sd(R.layout.fz, C786410Ut5.ne(context), null);
        this.LLJ = viewSd;
        setContentView(viewSd == null ? null : viewSd);
        View view2 = this.LLJ;
        C1CRB c1crb = (C1CRB) (view2 == null ? null : view2).findViewById(R.id.evm);
        if (C1389890mGx.LJFF >= 1) {
            pair = new Pair(Integer.valueOf(color2), Float.valueOf(dimension2));
        } else {
            pair = new Pair(Integer.valueOf(color), Float.valueOf(dimension));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        float fFloatValue = ((Number) pair.getSecond()).floatValue();
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZIZ(Integer.valueOf(i3));
        c19659111vp.LIZ = fFloatValue;
        C19751612Pq c19751612PqLIZ = c19659111vp.LIZ(c1crb.getContext());
        if (C1389890mGx.LJFF >= 5) {
            C415490GQx c415490GQx = new C415490GQx();
            c415490GQx.LIZ(iIntValue);
            c415490GQx.LIZIZ(fFloatValue);
            layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c415490GQx, c19751612PqLIZ);
        } else {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(iIntValue);
            c384050F3z.LIZJ = Float.valueOf(fFloatValue);
            layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c384050F3z.LIZ(c1crb.getContext()), c19751612PqLIZ);
        }
        c1crb.setBackground(layerDrawableLJIILIIL);
        ViewGroup.LayoutParams layoutParams = c1crb.getLayoutParams();
        layoutParams.width = Math.min(C497820Jfg.LIZIZ(c1crb.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(430))) + c1crb.getPaddingLeft() + c1crb.getPaddingRight();
        C786410Ut5.Z6(c1crb, layoutParams);
        Integer num = c1360890lWB.LJII;
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            if (C1389890mGx.LJFF >= 2) {
                i = 86;
            } else {
                i = 36;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        }
        View view3 = this.LLJ;
        C426750GoL.LJIIL((view3 == null ? null : view3).findViewById(R.id.y55), null, null, null, Integer.valueOf(iLIZIZ + LLJILJIL), 23);
        View view4 = this.LLJ;
        View viewFindViewById = (view4 == null ? null : view4).findViewById(R.id.roj);
        View.OnClickListener onClickListener = c1360890lWB.LJIIIIZZ;
        if (onClickListener != null) {
            C427690Gpr.LJFF(viewFindViewById, C418440Gaw.LIZIZ(16));
            C786410Ut5.I7(new ACListenerS124S0200000_21(onClickListener, this, 74), viewFindViewById);
        }
        View view5 = this.LLJ;
        FrameLayout frameLayout = (FrameLayout) (view5 == null ? null : view5).findViewById(R.id.vzg);
        int i8 = c1360890lWB.LIZIZ;
        if (i8 != 3) {
            if (i8 != 4) {
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 5) {
                                resourceId4 = 0;
                            }
                        } else {
                            resourceId4 = resourceId3;
                        }
                    } else {
                        resourceId4 = resourceId2;
                    }
                } else {
                    resourceId4 = resourceId;
                }
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                TuxIconView tuxIconView = new TuxIconView(frameLayout.getContext(), null, 0, 6, null);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = resourceId4;
                c419910GdJ.LIZLLL = Integer.valueOf(color3);
                tuxIconView.setTuxIcon(c419910GdJ);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ2, iLIZIZ2);
                layoutParams2.gravity = 17;
                frameLayout.addView(tuxIconView, layoutParams2);
            } else {
                Function1<? super FrameLayout, Unit> function12 = c1360890lWB.LIZJ;
                if (function12 != null) {
                    function12.invoke(frameLayout);
                }
            }
        } else {
            C786410Ut5.LJZ(8, frameLayout);
        }
        View view6 = this.LLJ;
        TuxTextView tuxTextView = (TuxTextView) (view6 == null ? null : view6).findViewById(R.id.o8v);
        tuxTextView.setTuxFont(i2);
        tuxTextView.setTextColor(color3);
        tuxTextView.setText(c1360890lWB.LIZ.LIZIZ);
        if (C1389890mGx.LJFF >= 3 && !C497820Jfg.LJFF(tuxTextView.getContext())) {
            tuxTextView.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)));
            tuxTextView.setGravity(16);
        }
        View view7 = this.LLJ;
        FrameLayout frameLayout2 = (FrameLayout) (view7 == null ? null : view7).findViewById(R.id.h51);
        Float f = c1360890lWB.LJFF;
        if (f != null) {
            C1CRC c1crc = (C1CRC) frameLayout2.getLayoutParams();
            c1crc.LJI = C2230281CQw.LIZ(frameLayout2.getContext(), "min(" + f + "*parent.width,wrap_content)", "width2");
            C786410Ut5.a6(frameLayout2, c1crc);
        }
        int i9 = c1360890lWB.LIZLLL;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3 && (function1 = c1360890lWB.LJ) != null) {
                        function1.invoke(frameLayout2);
                    }
                } else {
                    TuxTextView tuxTextView2 = new TuxTextView(frameLayout2.getContext(), null, 6, 0);
                    tuxTextView2.setTuxFont(i7);
                    C444940Hca c444940Hca = new C444940Hca();
                    String str = c1360890lWB.LJI;
                    c444940Hca.LIZJ = str == null ? "" : str;
                    c444940Hca.LIZIZ = true;
                    c444940Hca.LIZLLL(i6);
                    c444940Hca.LIZIZ(i7);
                    tuxTextView2.setText(c444940Hca.LIZ(frameLayout2.getContext()));
                    frameLayout2.addView(tuxTextView2);
                }
            } else {
                C197039127h c197039127h = new C197039127h(frameLayout2.getContext(), null, 6, 0);
                c197039127h.setText(c1360890lWB.LJI);
                c197039127h.setButtonSize(i5);
                c197039127h.setButtonVariant(i4);
                C786410Ut5.U8(c197039127h, new ACListenerS155S0100000_21(this, 234));
                frameLayout2.addView(c197039127h);
            }
        } else {
            TuxIconView tuxIconView2 = new TuxIconView(frameLayout2.getContext(), null, 0, 6, null);
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = resourceId5;
            c419910GdJ2.LIZLLL = Integer.valueOf(color3);
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            tuxIconView2.setTuxIcon(c419910GdJ2);
            frameLayout2.addView(tuxIconView2);
        }
        View view8 = this.LLJ;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((view8 == null ? null : view8).findViewById(R.id.y55));
        bottomSheetBehaviorFrom.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0mH8
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view9, float f2) {
                float f3;
                View view10 = this.LIZ.LLJ;
                if (view10 == null) {
                    view10 = null;
                }
                View viewFindViewById2 = view10.findViewById(R.id.y55);
                if (f2 < 0.0f) {
                    f3 = 1 + f2;
                } else {
                    f3 = 1.0f;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById2);
                viewFindViewById2.setAlpha(f3);
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i10, View view9) {
                if (i10 == 5) {
                    this.LIZ.LJJIJIL(C1389990mH7.LIZ);
                    this.LIZ.LJJIJIIJIL();
                }
            }
        });
        if (C1389890mGx.LJFF >= 2) {
            bottomSheetBehaviorFrom.setPeekHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))));
        }
        setTouchInterceptor(new ATListenerS454S0100000_21(this, 21));
    }
}
