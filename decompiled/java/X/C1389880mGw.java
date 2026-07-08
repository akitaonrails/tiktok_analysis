package X;

import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389880mGw {
    public C1361790lXd LIZ = new C1361790lXd(0);
    public Context LIZIZ;
    public final View LIZJ;
    public C1390070mHF LIZLLL;

    public final void LIZIZ() {
        this.LIZ.LIZ.LJII = false;
        C1390070mHF c1390070mHF = this.LIZLLL;
        if (c1390070mHF != null) {
            c1390070mHF.LJJIJIL(C1389900mGy.LIZ);
        }
        C1390070mHF c1390070mHF2 = this.LIZLLL;
        if (c1390070mHF2 != null) {
            c1390070mHF2.dismiss();
        }
    }

    public final void LJII() {
        Context context = this.LIZIZ;
        if (context != null) {
            this.LIZIZ = C1388190mED.LJ(C1388190mED.LIZJ(context, true), context);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0mH3, X.0mHF] */
    public final void LJIIJ() {
        final Context context = this.LIZIZ;
        final View view = this.LIZJ;
        CharSequence charSequence = this.LIZ.LIZ.LIZIZ;
        if (context == null || view == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        final C1361790lXd c1361790lXd = this.LIZ;
        ?? r1 = new AbstractC1389950mH3(context, view, c1361790lXd) { // from class: X.0mHF
            public final View LLILZLL;
            public View LLIZ;

            @Override // X.AbstractC1389950mH3
            public final View LJJIJIIJI() {
                View view2 = this.LLIZ;
                if (view2 == null) {
                    return null;
                }
                return view2;
            }

            @Override // X.AbstractC1389950mH3
            public final void LJJIIZ(boolean z) {
                float f;
                float f2;
                float f3;
                View view2 = this.LLIZ;
                if (view2 == null) {
                    view2 = null;
                }
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.boe);
                float f4 = 0.8f;
                if (z) {
                    f3 = 1.0f;
                    f2 = 0.0f;
                    f = 0.8f;
                    f4 = 1.0f;
                } else {
                    f = 1.0f;
                    f2 = 1.0f;
                    f3 = 0.0f;
                }
                if (C07XO.LIZ) {
                    new C21647019ng(linearLayout.getContext(), linearLayout, new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 75L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(f2, f3)))), false).LJI(true);
                    return;
                }
                if (C1389890mGx.LJFF >= 4) {
                    new C21647019ng(linearLayout.getContext(), linearLayout, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(1218.47f), new C1342130l1v(55.85f)), C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(f2, f3)), new C19746412Nq("scaleX", new C0HIW(f, f4)), new C19746412Nq("scaleY", new C0HIX(f, f4)))), false).LJI(true);
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(linearLayout, 51));
                valueAnimatorOfFloat.start();
                C21616519il c21616519ilLJIILL = C1619980sG4.LJIILL(linearLayout, AbstractC21616419ik.LJIILL, f4);
                c21616519ilLJIILL.LJI(f);
                c21616519ilLJIILL.LJIIIZ();
                C21616519il c21616519ilLJIILL2 = C1619980sG4.LJIILL(linearLayout, AbstractC21616419ik.LJIILLIIL, f4);
                c21616519ilLJIILL2.LJI(f);
                c21616519ilLJIILL2.LJIIIZ();
            }

            {
                Pair pair;
                LayerDrawable layerDrawableLJIILIIL;
                int i;
                int i2;
                super(view, c1361790lXd);
                this.LLILZLL = view;
                setTouchable(false);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxCenterToast, R.attr.xm, 0);
                int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCenterToast__tux_centerToastBackgroundColor, 0);
                float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxCenterToast__tux_centerToastBackgroundCorner, 0.0f);
                int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCenterToast__tux_centerToastNewBackgroundColor, 0);
                float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxCenterToast__tux_centerToastNewBackgroundCorner, 0.0f);
                int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCenterToast__tux_centerToastMessageFontColor, 0);
                int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCenterToast__tux_centerToastMessageFont, 0);
                int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxCenterToast__tux_centerToastShadow, 0);
                typedArrayObtainStyledAttributes.recycle();
                View viewSd = C786410Ut5.Sd(R.layout.g1, C786410Ut5.ne(context), null);
                this.LLIZ = viewSd;
                setContentView(viewSd == null ? null : viewSd);
                View view2 = this.LLIZ;
                View viewFindViewById = (view2 == null ? null : view2).findViewById(R.id.boe);
                if (C1389890mGx.LJFF >= 1) {
                    pair = new Pair(Integer.valueOf(color2), Float.valueOf(dimension2));
                } else {
                    pair = new Pair(Integer.valueOf(color), Float.valueOf(dimension));
                }
                int iIntValue = ((Number) pair.getFirst()).intValue();
                float fFloatValue = ((Number) pair.getSecond()).floatValue();
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZIZ(Integer.valueOf(i4));
                c19659111vp.LIZ = fFloatValue;
                C19751612Pq c19751612PqLIZ = c19659111vp.LIZ(context);
                if (C1389890mGx.LJFF >= 5) {
                    C415490GQx c415490GQx = new C415490GQx();
                    c415490GQx.LIZ(iIntValue);
                    c415490GQx.LIZIZ(fFloatValue);
                    layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c415490GQx, c19751612PqLIZ);
                } else {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZ = Integer.valueOf(iIntValue);
                    c384050F3z.LIZJ = Float.valueOf(fFloatValue);
                    layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c384050F3z.LIZ(context), c19751612PqLIZ);
                }
                viewFindViewById.setBackground(layerDrawableLJIILIIL);
                if (C497820Jfg.LJ(context)) {
                    i = 140;
                } else {
                    i = 100;
                }
                viewFindViewById.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
                if (C1389890mGx.LJFF >= 3 && !C497820Jfg.LJFF(context)) {
                    viewFindViewById.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
                C444830HcP c444830HcP = new C444830HcP();
                c444830HcP.LIZIZ.LJ = iLIZIZ;
                c444830HcP.LJII(i3);
                c444830HcP.LJIILJJIL(color3);
                c444830HcP.LJIILIIL(c1361790lXd.LIZ.LIZIZ);
                c444830HcP.LIZIZ.LJI = Layout.Alignment.ALIGN_CENTER;
                View view3 = this.LLIZ;
                ((C21415018rM) (view3 == null ? null : view3).findViewById(R.id.message_tv)).setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, true, null, 29));
                View view4 = this.LLIZ;
                TuxIconView tuxIconView = (TuxIconView) (view4 == null ? null : view4).findViewById(R.id.k1_);
                Integer num = c1361790lXd.LIZ.LIZJ;
                if (num == null) {
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    View view5 = this.LLIZ;
                    C426750GoL.LJIIL((view5 != null ? view5 : null).findViewById(R.id.boe), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ2), 16);
                    i2 = 8;
                } else {
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    View view6 = this.LLIZ;
                    C426750GoL.LJIIL((view6 != null ? view6 : null).findViewById(R.id.boe), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ4), 16);
                    tuxIconView.setIconRes(num.intValue());
                    i2 = 0;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, i2);
                Integer num2 = c1361790lXd.LIZ.LIZLLL;
                if (num2 != null) {
                    tuxIconView.setTintColor(num2.intValue());
                }
            }
        };
        r1.show();
        if (this.LIZ.LIZ.LJII) {
            C1378370lyN.LIZ.getClass();
            C1378370lyN.LIZJ(r1);
        }
        this.LIZLLL = r1;
    }

    public C1389880mGw(Dialog dialog) {
        View decorView;
        Window window = dialog.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZJ = decorView;
        this.LIZIZ = dialog.getContext();
        LJII();
    }

    public final void LIZ(boolean z) {
        C1389920mH0 c1389920mH0 = this.LIZ.LIZ;
        c1389920mH0.LJII = z;
        if (z) {
            int i = AbstractC1389950mH3.LLILZ + 1;
            AbstractC1389950mH3.LLILZ = i;
            if (i >= Integer.MAX_VALUE) {
                AbstractC1389950mH3.LLILZ = 1;
            }
            c1389920mH0.LJIIIIZZ = AbstractC1389950mH3.LLILZ;
        }
    }

    public final void LIZJ(Function0 function0) {
        this.LIZ.LIZ.LJIIIZ = new WeakReference<>(function0);
    }

    public final void LIZLLL(long j) {
        this.LIZ.LIZ.LJ = j;
    }

    public final void LJ(int i) {
        this.LIZ.LIZ.LIZJ = Integer.valueOf(i);
    }

    public final void LJFF(int i) {
        this.LIZ.LIZ.LIZLLL = Integer.valueOf(i);
    }

    public final void LJI(int i) {
        Integer numLIZJ;
        C1389920mH0 c1389920mH0 = this.LIZ.LIZ;
        Context context = this.LIZIZ;
        if (context != null) {
            numLIZJ = C1308910kAL.LIZJ(i, context);
        } else {
            numLIZJ = null;
        }
        c1389920mH0.LIZLLL = numLIZJ;
    }

    public final void LJIIIIZZ(int i) {
        String string;
        C1389920mH0 c1389920mH0 = this.LIZ.LIZ;
        Context context = this.LIZIZ;
        if (context != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        c1389920mH0.LIZIZ = string;
    }

    public final void LJIIIZ(CharSequence charSequence) {
        this.LIZ.LIZ.LIZIZ = charSequence;
    }

    public C1389880mGw(PopupWindow popupWindow) {
        Context context;
        this.LIZJ = popupWindow.getContentView();
        View contentView = popupWindow.getContentView();
        if (contentView != null) {
            context = contentView.getContext();
        } else {
            context = null;
        }
        this.LIZIZ = context;
        LJII();
    }

    public C1389880mGw(Fragment fragment) {
        View rootView;
        View view = fragment.getView();
        if (view != null) {
            rootView = view.getRootView();
        } else {
            rootView = null;
        }
        this.LIZJ = rootView;
        this.LIZIZ = fragment.getContext();
        LJII();
    }

    public C1389880mGw(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZJ = decorView;
        this.LIZIZ = activity;
        LJII();
    }

    public C1389880mGw(View view) {
        this.LIZJ = view;
        this.LIZIZ = view.getContext();
        LJII();
    }
}
