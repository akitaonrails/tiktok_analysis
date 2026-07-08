package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.Region;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0GpL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427370GpL extends LinearLayout {
    public final Path LL;
    public final FrameLayout LLILLJJLI;
    public final TuxIconView LLILLL;
    public C1295960jpS LLILZ;
    public final List<C418930Gbj> LLILZIL;
    public final FrameLayout LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS == null || c1295960jpS.getComposition() == null || c1295960jpS.isAnimating()) {
            return;
        }
        c1295960jpS.playAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1295960jpS c1295960jpS = this.LLILZ;
        if (c1295960jpS != null) {
            c1295960jpS.pauseAnimation();
        }
    }

    public C427370GpL(Context context) {
        super(context, null, 0);
        C427380GpM c427380GpM = new C427380GpM();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        float fLIZIZ = C418440Gaw.LIZIZ(14);
        float fLIZIZ2 = C418440Gaw.LIZIZ(18);
        c427380GpM.LIZ.reset();
        c427380GpM.LIZIZ.reset();
        c427380GpM.LIZJ.setEmpty();
        c427380GpM.LIZLLL.setEmpty();
        c427380GpM.LJ.setEmpty();
        float f = iLIZIZ * 0.5f;
        c427380GpM.LIZ.addCircle(fLIZIZ + f, f, fLIZIZ2 * 0.5f, Path.Direction.CW);
        c427380GpM.LIZIZ.addCircle(f, f, f, Path.Direction.CW);
        c427380GpM.LJ.set(0, 0, iLIZIZ, iLIZIZ);
        c427380GpM.LIZJ.setPath(c427380GpM.LIZ, c427380GpM.LJ);
        c427380GpM.LIZLLL.setPath(c427380GpM.LIZIZ, c427380GpM.LJ);
        c427380GpM.LIZLLL.op(c427380GpM.LIZJ, Region.Op.DIFFERENCE);
        this.LL = c427380GpM.LIZLLL.getBoundaryPath();
        setOrientation(0);
        setGravity(16);
        setClipChildren(false);
        setClipToPadding(false);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_like_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
        tuxIconView.setTuxIcon(c419910GdJ);
        this.LLILLL = tuxIconView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.addView(tuxIconView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 17));
        this.LLILLJJLI = frameLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-6)));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-1));
        addView(frameLayout, layoutParams);
        C438490HHj c438490HHj = C438490HHj.LIZ;
        EnumC429390Gsb enumC429390Gsb = EnumC429390Gsb.LIKE_STATUS;
        c438490HHj.getClass();
        C1292030jj7 c1292030jj7LIZ = C438490HHj.LIZ(enumC429390Gsb);
        if (c1292030jj7LIZ != null) {
            C1295960jpS c1295960jpS = new C1295960jpS(getContext());
            c1295960jpS.setRepeatCount(-1);
            C786410Ut5.LLD(8, c1295960jpS);
            c1295960jpS.setScaleType(ImageView.ScaleType.CENTER_CROP);
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) / 2;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), 81);
            layoutParams2.bottomMargin = iLIZIZ2;
            frameLayout.addView(c1295960jpS, layoutParams2);
            this.LLILZ = c1295960jpS;
            c1292030jj7LIZ.LIZIZ(new C0IE0(c1295960jpS, this, 1));
            c1292030jj7LIZ.LIZ(new C0IE0(c1295960jpS, this, 2));
        }
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            C418930Gbj c418930Gbj = new C418930Gbj(context, null, 0);
            c418930Gbj.setSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            int visibility = c418930Gbj.getVisibility();
            c418930Gbj.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c418930Gbj);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            if (i > 0) {
                layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)));
            }
            addView(c418930Gbj, layoutParams3);
            arrayList.add(c418930Gbj);
        }
        this.LLILZIL = arrayList;
        FrameLayout frameLayout2 = new FrameLayout(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16) / 2.0f);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        frameLayout2.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.LJZ(8, frameLayout2);
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_ellipsis_horizontal;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView2.setTuxIcon(c419910GdJ2);
        frameLayout2.addView(tuxIconView2, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 17));
        this.LLILZLL = frameLayout2;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        layoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)));
        addView(frameLayout2, layoutParams4);
    }
}
