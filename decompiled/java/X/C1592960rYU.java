package X;

import Y.ARunnableS124S0100000_24;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592960rYU extends AbstractC1592930rYR {
    public boolean LLJJ;
    public final int LLJJI;
    public final int LLJJIII;
    public final C01GW LLJJIJI;

    @Override // X.AbstractC1592930rYR
    public final void LIZJ(int i, boolean z) {
    }

    @Override // X.AbstractC1592930rYR
    public final int LJIILLIIL(boolean z) {
        throw null;
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJI() {
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJI() {
        ImageView imageView = new ImageView(this.LL.getContext());
        imageView.setImageDrawable(this.LLILLL.LIZ(R.drawable.bvn, this.LL.getContext()));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, 0);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        layoutParams.gravity = 49;
        C786410Ut5.c6(imageView, layoutParams);
        return imageView;
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJII() {
        ImageView imageView = new ImageView(this.LL.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        C786410Ut5.c6(imageView, LJJIL());
        return imageView;
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJIIIIZZ() {
        ImageView imageView = new ImageView(this.LL.getContext());
        imageView.setScaleType(C1584190rKL.LIZIZ() ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParamsLJJIL = LJJIL();
        Pair pair = C1584190rKL.LIZIZ() ? new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)))) : new Pair(-2, -2);
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        layoutParamsLJJIL.width = iIntValue;
        layoutParamsLJJIL.height = iIntValue2;
        C786410Ut5.c6(imageView, layoutParamsLJJIL);
        return imageView;
    }

    @Override // X.AbstractC1592930rYR
    public final ImageView LJIIIZ() {
        Drawable drawableLIZ;
        Pair pair;
        ImageView imageView = new ImageView(this.LL.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (C1584190rKL.LIZIZ()) {
            Pair pair2 = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
            int i = C1584210rKN.LIZ[C1584190rKL.LIZ().ordinal()];
            if (i == 1 || i == 2) {
                double d = 24;
                double d2 = 36;
                double dIntValue = (((double) ((Number) pair2.getFirst()).intValue()) * d) / d2;
                double dIntValue2 = (((double) ((Number) pair2.getSecond()).intValue()) * d) / d2;
                double dDoubleValue = ((Number) pair2.getFirst()).doubleValue() - dIntValue;
                double d3 = 2;
                pair = new Pair(Integer.valueOf((int) (dDoubleValue / d3)), Integer.valueOf((int) ((((Number) pair2.getSecond()).doubleValue() - dIntValue2) / d3)));
            } else {
                pair = new Pair(0, 0);
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            C426750GoL.LJIIL(imageView, Integer.valueOf(imageView.getPaddingLeft() + iIntValue), Integer.valueOf(imageView.getPaddingTop() + iIntValue2), Integer.valueOf(imageView.getPaddingRight() + iIntValue), Integer.valueOf(imageView.getPaddingBottom() + iIntValue2), 16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((Number) pair2.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue());
            layoutParams.gravity = 17;
            C786410Ut5.c6(imageView, layoutParams);
            drawableLIZ = this.LLILLL.LJ(imageView.getContext());
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            C786410Ut5.c6(imageView, layoutParams2);
            drawableLIZ = this.LLILLL.LIZ(R.drawable.bvk, imageView.getContext());
        }
        if (drawableLIZ != null) {
            imageView.setImageDrawable(drawableLIZ);
        }
        return imageView;
    }

    @Override // X.AbstractC1592930rYR
    public final TuxTextView LJIIJ() {
        TuxTextView tuxTextView = new TuxTextView(this.LL.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(92);
        tuxTextView.setTextColor(C446980Hfs.LIZ(this.LL.getContext(), R.color.bd));
        tuxTextView.setLetterSpacing(0.01f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
        C786410Ut5.R6(tuxTextView, layoutParams);
        tuxTextView.setGravity(17);
        tuxTextView.setSingleLine(true);
        Resources resources = tuxTextView.getResources();
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "plus_button_add_text", true);
        tuxTextView.setText(resources.getString(iLJIJ != 1 ? iLJIJ != 2 ? 2131825181 : 2131834281 : 2131834271));
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

    @Override // X.AbstractC1592930rYR
    public final void LJJIJ() {
        if (((Boolean) C285090BFj.LJLJLLL.getValue()).booleanValue()) {
            C0CN5.LIZJ(Long.valueOf(((Number) C285090BFj.LJLJL.getValue()).longValue()), new ARunnableS124S0100000_24(this, 93), false);
        } else {
            C07MK.LIZ.getClass();
            C1239204t4.LIZ(new Runnable() { // from class: X.0rYe
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PublishTabLogic@32aa.showFestivalIconIfNeed$2");
                    try {
                        this.LL.LJJIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PublishTabLogic@32aa.showFestivalIconIfNeed$2");
                }
            }, "nuj_premain", false);
        }
    }

    @Override // X.AbstractC1592930rYR
    public final void LJIJJ() {
        Boolean bool;
        if (C828040We2.LIZIZ()) {
            ImageView imageView = this.LL.LLILZLL;
            Object tag = imageView != null ? imageView.getTag(R.id.k2t) : null;
            if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                return;
            }
            LruCache<String, Drawable> lruCache = C730700SlQ.LIZ;
            LJJIJ();
        }
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIJIL() {
        LJIILIIL();
        C0CXL.LIZ.getClass();
        C0CXL.LIZIZ();
        LJJIJ();
    }

    public final FrameLayout.LayoutParams LJJIL() {
        FrameLayout.LayoutParams layoutParams;
        if (C1585030rLh.LJIIL() && C315230CXh.LIZ() == 2) {
            int i = this.LLJJI;
            layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 8388661;
            boolean z = C14LC.LJIIIZ;
            layoutParams.topMargin = z ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
            layoutParams.setMarginEnd(z ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
        } else {
            if (C1585030rLh.LJIIL() && C315230CXh.LIZ() == 3) {
                int i2 = this.LLJJIII;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
                layoutParams2.gravity = 8388661;
                boolean z2 = C14LC.LJIIIZ;
                layoutParams2.topMargin = z2 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                layoutParams2.setMarginEnd(z2 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)));
                return layoutParams2;
            }
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            if (((Boolean) C258840ACk.LIZ.getValue()).booleanValue()) {
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                return layoutParams;
            }
        }
        return layoutParams;
    }

    public final void LJJIZ() {
        Drawable drawableLJJIJLIJ;
        if (C828040We2.LIZIZ()) {
            Drawable drawable = (Drawable) ((ConcurrentHashMap) this.LLILLL.LLILLJJLI).remove(-100);
            if (drawable == null) {
                LruCache<String, Drawable> lruCache = C730700SlQ.LIZ;
                drawable = null;
            }
            C1592950rYT c1592950rYT = this.LL;
            c1592950rYT.setTabIconBackScaleType(ImageView.ScaleType.CENTER_INSIDE);
            c1592950rYT.setTabIconBackImageDrawable(drawable);
            return;
        }
        this.LL.setTabIconBackScaleType(C1584190rKL.LIZIZ() ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "plus_button_add_text", true) <= 0) {
            if (this.LLJJ) {
                drawableLJJIJLIJ = LJJIJLIJ(this.LLILLJJLI);
            } else {
                this.LLJJ = true;
                drawableLJJIJLIJ = LJJIJLIJ(EnumC1571190qzN.DARK);
            }
            C1592950rYT c1592950rYT2 = this.LL;
            c1592950rYT2.setTabIconBackImageDrawable(drawableLJJIJLIJ);
            if (C1584190rKL.LIZIZ()) {
                c1592950rYT2.setTabIconBackScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            FrameLayout.LayoutParams layoutParamsLJJIL = LJJIL();
            Pair pair = C1584190rKL.LIZIZ() ? new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)))) : new Pair(-2, -2);
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            layoutParamsLJJIL.width = iIntValue;
            layoutParamsLJJIL.height = iIntValue2;
            c1592950rYT2.setTabIconBackLayoutParams(layoutParamsLJJIL);
            c1592950rYT2.setTitleVisibility(8);
            return;
        }
        C1592950rYT c1592950rYT3 = this.LL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Double dValueOf = Double.valueOf(16.5d);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(20.5d))));
        c1592950rYT3.setTabIconBackLayoutParams(layoutParams);
        LJIILL();
        C1592950rYT c1592950rYT4 = this.LL;
        c1592950rYT4.setTitleVisibility(0);
        c1592950rYT4.setTitleTuxFont(92);
        c1592950rYT4.setTitleTextColor(C446980Hfs.LIZ(c1592950rYT4.getContext(), R.color.bd));
        c1592950rYT4.setTitleLetterSpacing(0.01f);
        boolean z = this.LLJJ;
        int i = R.drawable.but;
        if (!z) {
            this.LLJJ = true;
            C1592950rYT c1592950rYT5 = this.LL;
            if (EnumC1571190qzN.DARK != EnumC1571190qzN.LIGHT) {
                i = R.drawable.buu;
            }
            c1592950rYT5.setTabIconBackImageDrawable(this.LLILLL.LIZ(i, c1592950rYT5.getContext()));
            return;
        }
        EnumC1571190qzN enumC1571190qzN = this.LLILLJJLI;
        EnumC1571190qzN enumC1571190qzN2 = EnumC1571190qzN.LIGHT;
        if (enumC1571190qzN != enumC1571190qzN2) {
            i = R.drawable.buu;
        }
        Drawable drawableLIZ = this.LLILLL.LIZ(i, this.LL.getContext());
        int i2 = this.LLILLJJLI == enumC1571190qzN2 ? R.color.di : R.color.be;
        C1592950rYT c1592950rYT6 = this.LL;
        c1592950rYT6.setTitleTextColor(C446980Hfs.LIZ(c1592950rYT6.getContext(), i2));
        c1592950rYT6.setTabIconBackImageDrawable(drawableLIZ);
    }

    public C1592960rYU(final C1592950rYT c1592950rYT) {
        super(c1592950rYT);
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
        this.LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
        this.LLJJIJI = C452501pT.LIZIZ(new C07OG());
        c1592950rYT.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0rYc
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                if (C1585030rLh.LJIIL()) {
                    C1592950rYT c1592950rYT2 = c1592950rYT;
                    HandlerHook.viewPostDelay(c1592950rYT2, new ARunnableS124S0100000_24(c1592950rYT2, 92), 2000L);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                Drawable tabIconBackImageDrawable;
                C1592950rYT c1592950rYT2 = this.LL;
                if (c1592950rYT2 != null && (tabIconBackImageDrawable = c1592950rYT2.getTabIconBackImageDrawable()) != null && (tabIconBackImageDrawable instanceof C1593150rYn)) {
                    C1593150rYn c1593150rYn = (C1593150rYn) tabIconBackImageDrawable;
                    if (c1593150rYn.isRunning()) {
                        c1593150rYn.stop();
                    }
                }
            }
        });
        if (LJJIJIIJIL(EnumC1593030rYb.UNSELECT, this.LLILZ.LJ, true)) {
            LJJIJIL();
        }
    }

    @Override // X.AbstractC1592930rYR
    public final void LJJIIZ(EnumC1571190qzN enumC1571190qzN) {
        if (LJJIJIIJIL(EnumC1593030rYb.UNSELECT, enumC1571190qzN, true)) {
            LJJIJIL();
        }
    }

    public final Drawable LJJIJLIJ(EnumC1571190qzN enumC1571190qzN) {
        int i;
        int i2;
        int iIntValue;
        Object second;
        if (C1585030rLh.LJIIL()) {
            Pair pair = (Pair) ((Map) this.LLJJIJI.getValue()).get(Integer.valueOf(C315230CXh.LIZ()));
            if (pair != null) {
                if (enumC1571190qzN == EnumC1571190qzN.LIGHT) {
                    second = pair.getFirst();
                } else {
                    second = pair.getSecond();
                }
                iIntValue = ((Number) second).intValue();
            } else if (enumC1571190qzN == EnumC1571190qzN.LIGHT) {
                iIntValue = R.raw.icon_tab_bottom_create_fill;
            } else {
                iIntValue = R.raw.icon_tab_bottom_create;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = iIntValue;
            return c419910GdJ.LIZ(this.LL.getContext());
        }
        int i3 = C1584200rKM.LIZ[C1584190rKL.LIZ().ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (!C960203pA.LIZIZ(this.LL.getContext()) && enumC1571190qzN == EnumC1571190qzN.LIGHT) {
                i2 = R.drawable.bv1;
            } else {
                i2 = R.drawable.buw;
            }
            Drawable drawableLIZ = this.LLILLL.LIZ(i2, this.LL.getContext());
            if (!C282050B3r.LIZ) {
                return drawableLIZ;
            }
            PreDrawableInflate preDrawableInflate = this.LLILLL;
            ((ConcurrentHashMap) preDrawableInflate.LLILLJJLI).put(Integer.valueOf(i2), drawableLIZ);
            return drawableLIZ;
        }
        if (!C960203pA.LIZIZ(this.LL.getContext()) && enumC1571190qzN == EnumC1571190qzN.LIGHT) {
            i = R.raw.icon_bitmap_exp_02_icon_color_create_dark;
        } else {
            i = R.raw.icon_bitmap_exp_02_icon_color_create_light;
        }
        return this.LLILLL.LIZ(i, this.LL.getContext());
    }

    @Override // X.AbstractC1592930rYR
    public final boolean LJJIJIIJIL(EnumC1593030rYb enumC1593030rYb, EnumC1571190qzN enumC1571190qzN, boolean z) {
        if (this.LLILLJJLI == enumC1571190qzN && !z) {
            return false;
        }
        if (z) {
            LJIILIIL();
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "plus_button_add_text", true) > 0) {
                LJIILL();
            }
        }
        if (this.LLILLJJLI != enumC1571190qzN) {
            this.LLILLJJLI = enumC1571190qzN;
            return true;
        }
        return z;
    }
}
