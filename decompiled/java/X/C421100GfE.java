package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421100GfE extends AppCompatImageView {
    public final TuxIconDrawable LL;
    public final C384050F3z LLILLJJLI;

    public C421100GfE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setBgColor(int i) {
        this.LLILLJJLI.LIZ = Integer.valueOf(i);
        setImageDrawable(C426750GoL.LJIILIIL(this.LL, this.LLILLJJLI.LIZ(getContext())));
    }

    public final void setBgColorRes(int i) {
        this.LLILLJJLI.LIZIZ = Integer.valueOf(i);
        setImageDrawable(C426750GoL.LJIILIIL(this.LL, this.LLILLJJLI.LIZ(getContext())));
    }

    public final void setTintColor(int i) {
        this.LL.LJFF(i);
        setImageDrawable(C426750GoL.LJIILIIL(this.LL, this.LLILLJJLI.LIZ(getContext())));
    }

    public final void setTintColorRes(int i) {
        this.LL.LJI(i, getContext());
        setImageDrawable(C426750GoL.LJIILIIL(this.LL, this.LLILLJJLI.LIZ(getContext())));
    }

    public C421100GfE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxCloseIconView, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxCloseIconView_tux_icon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCloseIconView_tux_tintColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCloseIconView_tux_closeIcon_backgroundColor, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxCloseIconView_tux_closeIcon_contentDescription);
        typedArrayObtainStyledAttributes.recycle();
        setScaleType(ImageView.ScaleType.CENTER);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        c419910GdJ.LIZLLL = Integer.valueOf(color);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        this.LL = tuxIconDrawableLIZ;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(color2);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(26));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        this.LLILLJJLI = c384050F3z;
        setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context)));
        setContentDescription(strXd);
        C427690Gpr.LJ(this, C418440Gaw.LIZIZ(200));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C421100GfE(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.xq;
        } else {
            i3 = 0;
        }
        this(context, attributeSet, i3);
    }
}
