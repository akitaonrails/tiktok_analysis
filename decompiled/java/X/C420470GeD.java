package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420470GeD extends FrameLayout {
    public static final int LLILZ;
    public static final int LLILZIL;
    public static final double LLILZLL;
    public static final double LLIZ;
    public static final double LLIZLLLIL;
    public final C21593719f5 LL;
    public final TuxIconView LLILLJJLI;
    public boolean LLILLL;

    public C420470GeD(Context context) {
        this(context, null, 6);
    }

    public C420470GeD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        LLILZ = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        LLILZIL = iLIZIZ2;
        LLILZLL = 30.0d;
        LLIZ = (((double) iLIZIZ) * Math.cos(Math.toRadians(30.0d))) + (((double) iLIZIZ2) * Math.sin(Math.toRadians(30.0d)));
        LLIZLLLIL = (((double) iLIZIZ2) * Math.cos(Math.toRadians(30.0d))) + (((double) iLIZIZ) * Math.sin(Math.toRadians(30.0d)));
    }

    public final void LIZ() {
        this.LL.LIZ();
        if (getVisibility() == 0) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
        }
    }

    public final void setEnableAnimation(boolean z) {
        this.LLILLL = z;
        if (z) {
            C21593719f5 c21593719f5 = this.LL;
            int visibility = c21593719f5.getVisibility();
            c21593719f5.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c21593719f5);
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 8);
            return;
        }
        C21593719f5 c21593719f52 = this.LL;
        int visibility2 = c21593719f52.getVisibility();
        c21593719f52.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c21593719f52);
        C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
        LIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C420470GeD(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet2, 0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e1);
        setBackground(c384050F3z.LIZ(context));
        int i2 = LLILZ;
        int i3 = LLILZIL;
        double d = LLILZLL;
        double d2 = LLIZ;
        double d3 = LLIZLLLIL;
        C21593719f5 c21593719f5 = new C21593719f5(context, attributeSet2, 0, i2, i3, d, d2, d3);
        this.LL = c21593719f5;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconWidth(i2);
        tuxIconView.setIconHeight(i3);
        tuxIconView.setIconRes(R.raw.icon_large_tiktok_logo);
        tuxIconView.setTintColorRes(R.attr.zj);
        this.LLILLJJLI = tuxIconView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) d2, (int) d3);
        layoutParams.gravity = 17;
        addView(c21593719f5, layoutParams);
        addView(tuxIconView, layoutParams);
    }
}
