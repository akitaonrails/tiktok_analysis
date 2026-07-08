package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11Fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19470411Fm extends FrameLayout {
    public final boolean LL;
    public final C19670811xi LLILLJJLI;
    public C1324800kZy LLILLL;
    public SmartImageView LLILZ;
    public ImageView LLILZIL;
    public C415800GSc LLILZLL;
    public boolean LLIZ;
    public View LLIZLLLIL;
    public final boolean LLJ;

    public static void LIZ(C1331670kl3 c1331670kl3) {
        if (C297930Bm3.LIZ()) {
            c1331670kl3.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3.LJJJJJ = "tools_default";
        }
    }

    public final void setEnableUI(boolean z) {
        ImageView imageView = null;
        if (z) {
            if (this.LL) {
                SmartImageView smartImageView = this.LLILZ;
                if (smartImageView != null) {
                    imageView = smartImageView;
                }
                imageView.clearColorFilter();
                return;
            }
            C1324800kZy c1324800kZy = this.LLILLL;
            if (c1324800kZy != null) {
                imageView = c1324800kZy;
            }
            imageView.clearColorFilter();
            return;
        }
        if (this.LL) {
            SmartImageView smartImageView2 = this.LLILZ;
            if (smartImageView2 != null) {
                imageView = smartImageView2;
            }
            imageView.setColorFilter(R.color.eq, PorterDuff.Mode.DST_IN);
            return;
        }
        C1324800kZy c1324800kZy2 = this.LLILLL;
        if (c1324800kZy2 != null) {
            imageView = c1324800kZy2;
        }
        imageView.setColorFilter(R.color.eq, PorterDuff.Mode.DST_IN);
    }

    public final void setIconImageViewScaleType(InterfaceC1320380kSq interfaceC1320380kSq) {
        C1322090kVb c1322090kVb = null;
        if (this.LL) {
            SmartImageView smartImageView = this.LLILZ;
            if (smartImageView != null) {
                c1322090kVb = smartImageView;
            }
            ((C1331070kk5) c1322090kVb.getHierarchy()).LJIIZILJ(interfaceC1320380kSq);
            return;
        }
        C1324800kZy c1324800kZy = this.LLILLL;
        if (c1324800kZy != null) {
            c1322090kVb = c1324800kZy;
        }
        ((C1331070kk5) c1322090kVb.getHierarchy()).LJIIZILJ(interfaceC1320380kSq);
    }

    public final void setImageBackground(int i) {
        View view = null;
        if (this.LL) {
            SmartImageView smartImageView = this.LLILZ;
            if (smartImageView != null) {
                view = smartImageView;
            }
            view.setBackgroundResource(i);
            return;
        }
        C1324800kZy c1324800kZy = this.LLILLL;
        if (c1324800kZy != null) {
            view = c1324800kZy;
        }
        view.setBackgroundResource(i);
    }

    public final void setImageHierarchy(C1331070kk5 c1331070kk5) {
        C1322090kVb c1322090kVb = null;
        if (this.LL) {
            SmartImageView smartImageView = this.LLILZ;
            if (smartImageView != null) {
                c1322090kVb = smartImageView;
            }
            c1322090kVb.setHierarchy(c1331070kk5);
            return;
        }
        C1324800kZy c1324800kZy = this.LLILLL;
        if (c1324800kZy != null) {
            c1322090kVb = c1324800kZy;
        }
        c1322090kVb.setHierarchy(c1331070kk5);
    }

    public final void setShowDownloadIcon(boolean z) {
        this.LLIZ = z;
    }

    public C19470411Fm(Context context, boolean z, boolean z2, boolean z3, C19670811xi c19670811xi) {
        int i;
        super(context, null);
        this.LL = z3;
        this.LLILLJJLI = c19670811xi;
        boolean zLIZ = C297840Blu.LIZ();
        this.LLJ = zLIZ;
        if (z) {
            i = R.layout.d21;
        } else if (z2) {
            i = R.layout.d20;
        } else {
            i = R.layout.d1z;
        }
        View viewSd = C786410Ut5.Sd(i, C786410Ut5.ne(context), null);
        this.LLIZLLLIL = viewSd;
        this.LLILLL = (C1324800kZy) (viewSd == null ? null : viewSd).findViewById(R.id.khd);
        View view = this.LLIZLLLIL;
        this.LLILZ = (SmartImageView) (view == null ? null : view).findViewById(R.id.vd7);
        C1331070kk5 c1331070kk5LIZ = new C1331090kk7(getResources()).LIZ();
        c1331070kk5LIZ.LJIJ(null, 1);
        c1331070kk5LIZ.LJIJ(null, 5);
        if (z3) {
            SmartImageView smartImageView = this.LLILZ;
            C786410Ut5.LLFF(0, smartImageView == null ? null : smartImageView);
            C1324800kZy c1324800kZy = this.LLILLL;
            C786410Ut5.t1(c1324800kZy == null ? null : c1324800kZy, 8);
            SmartImageView smartImageView2 = this.LLILZ;
            (smartImageView2 == null ? null : smartImageView2).setHierarchy(c1331070kk5LIZ);
        } else {
            SmartImageView smartImageView3 = this.LLILZ;
            C786410Ut5.LLFF(8, smartImageView3 == null ? null : smartImageView3);
            C1324800kZy c1324800kZy2 = this.LLILLL;
            C786410Ut5.t1(c1324800kZy2 == null ? null : c1324800kZy2, 0);
            C1324800kZy c1324800kZy3 = this.LLILLL;
            (c1324800kZy3 == null ? null : c1324800kZy3).setHierarchy(c1331070kk5LIZ);
        }
        View view2 = this.LLIZLLLIL;
        this.LLILZIL = (ImageView) (view2 == null ? null : view2).findViewById(R.id.khf);
        View view3 = this.LLIZLLLIL;
        this.LLILZLL = (C415800GSc) (view3 == null ? null : view3).findViewById(R.id.lno);
        if (zLIZ) {
            ImageView imageView = this.LLILZIL;
            C786410Ut5.LJZI(8, imageView == null ? null : imageView);
            C415800GSc c415800GSc = this.LLILZLL;
            C786410Ut5.L0(c415800GSc == null ? null : c415800GSc, 8);
        }
        C415800GSc c415800GSc2 = this.LLILZLL;
        (c415800GSc2 == null ? null : c415800GSc2).setBgCircleColor(C960203pA.LIZ(R.attr.oz, getContext()));
        C415800GSc c415800GSc3 = this.LLILZLL;
        (c415800GSc3 == null ? null : c415800GSc3).setProgressColor(-1);
        C415800GSc c415800GSc4 = this.LLILZLL;
        (c415800GSc4 == null ? null : c415800GSc4).setMaxProgress(100);
        C415800GSc c415800GSc5 = this.LLILZLL;
        (c415800GSc5 == null ? null : c415800GSc5).setCircleWidth((int) C11VU.LIZIZ(2.0f, context));
        C415800GSc c415800GSc6 = this.LLILZLL;
        (c415800GSc6 == null ? null : c415800GSc6).setBgCircleWidth((int) C11VU.LIZIZ(3.0f, context));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View view4 = this.LLIZLLLIL;
        C786410Ut5.W5(view4 == null ? null : view4, layoutParams);
        View view5 = this.LLIZLLLIL;
        addView(view5 != null ? view5 : null);
    }
}
