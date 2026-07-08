package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425000GlW {
    public final View LIZ;
    public final LifecycleOwner LIZIZ;
    public final FrameLayout LIZJ;
    public final RelativeLayout LIZLLL;
    public final TuxIconView LJ;
    public final TuxTextView LJFF;
    public boolean LJI;
    public boolean LJII;
    public final float LJIIIIZZ;
    public final ImageView LJIIIZ;
    public final ImageView LJIIJ;
    public final ImageView LJIIJJI;
    public final ImageView LJIIL;

    public final void LIZ(Function1<? super View, Unit> function1) {
        function1.invoke(this.LJIIIZ);
        function1.invoke(this.LJIIJ);
        function1.invoke(this.LJIIJJI);
    }

    public C425000GlW(View view, LifecycleOwner lifecycleOwner) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LIZ = view;
        this.LIZIZ = lifecycleOwner;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.vz7);
        this.LIZJ = frameLayout;
        this.LIZLLL = (RelativeLayout) view.findViewById(R.id.vz_);
        TuxIconView tuxIconView = (TuxIconView) frameLayout.findViewById(R.id.vzf);
        this.LJ = tuxIconView;
        this.LJFF = (TuxTextView) frameLayout.findViewById(R.id.vze);
        this.LJII = true;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LJIIIIZZ = 15.0f;
        ImageView imageView = new ImageView(view.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)));
        int i = iLIZIZ / 2;
        layoutParams.leftMargin = i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        layoutParams.topMargin = i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        layoutParams.gravity = 3;
        C786410Ut5.c6(imageView, layoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(R.drawable.d8l);
        this.LJIIIZ = imageView;
        ImageView imageView2 = new ImageView(view.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        layoutParams2.leftMargin = ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)) + i) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        layoutParams2.topMargin = i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        layoutParams2.gravity = 3;
        C786410Ut5.c6(imageView2, layoutParams2);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.d8m);
        this.LJIIJ = imageView2;
        ImageView imageView3 = new ImageView(view.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(29)));
        layoutParams3.gravity = 5;
        layoutParams3.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        layoutParams3.topMargin = i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        C786410Ut5.c6(imageView3, layoutParams3);
        imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView3.setImageResource(R.drawable.d8n);
        this.LJIIJJI = imageView3;
        ImageView imageView4 = new ImageView(view.getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28))));
        layoutParams4.addRule(20);
        layoutParams4.addRule(15);
        C786410Ut5.c6(imageView4, layoutParams4);
        imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView4.setImageDrawable(imageView4.getContext().getDrawable(R.drawable.btr));
        ViewGroup.LayoutParams layoutParams5 = tuxIconView.getLayoutParams();
        if ((layoutParams5 instanceof RelativeLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        }
        tuxIconView.requestLayout();
        C786410Ut5.V4(imageView4, 0.0f);
        this.LJIIL = imageView4;
    }

    public static void LIZIZ(View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (!Intrinsics.LJFF(view.getParent(), viewGroup)) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup2);
            }
            viewGroup.addView(view);
        }
    }
}
