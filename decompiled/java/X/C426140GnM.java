package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426140GnM extends FrameLayout {
    public static final /* synthetic */ int LLILZIL = 0;
    public final ARunnableS106S0100000_6 LL;
    public final boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    private final Drawable getBadgeBackground() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.av_);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        return c384050F3z.LIZ(getContext());
    }

    private final TuxIconView getBadgeIcon() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final Paint getOutlinePaint() {
        return (Paint) this.LLILLL.getValue();
    }

    private final void setBadgeViewResource(int i) {
        TuxIconView badgeIcon = getBadgeIcon();
        Drawable badgeBackground = getBadgeBackground();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        badgeIcon.setImageDrawable(C426750GoL.LJIILIIL(c419910GdJ.LIZ(getContext()), badgeBackground));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        int iIntValue;
        super.dispatchDraw(canvas);
        if (!this.LLILLJJLI || (childAt = getChildAt(0)) == null) {
            return;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        float f = fLIZIZ / 2;
        RectF rectF = new RectF(childAt.getLeft() - f, childAt.getTop() - f, childAt.getRight() + f, childAt.getBottom() + f);
        Paint outlinePaint = getOutlinePaint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        outlinePaint.setColor(iIntValue);
        getOutlinePaint().setStrokeWidth(fLIZIZ);
        getOutlinePaint().setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, -90.0f, 360.0f, false, getOutlinePaint());
    }

    public C426140GnM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new ARunnableS106S0100000_6((Object) this, 63);
        this.LLILLJJLI = true;
        this.LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(51));
        this.LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 91));
        C786410Ut5.M6(getBadgeIcon(), new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        if (getChildCount() == 0) {
            addView(getBadgeIcon());
        }
        setWillNotDraw(false);
    }

    public final void LIZ(int i, String str, boolean z) {
        if (Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), str)) {
            C786410Ut5.b0(this, 8);
            return;
        }
        HandlerHook.viewRemoveCallbacks(this, this.LL);
        if (i == EnumC429220GsK.UNFOLLOW.getValue()) {
            setBadgeViewResource(R.raw.icon_plus_tiny_fill);
            C786410Ut5.b0(this, 0);
        } else if (z) {
            setBadgeViewResource(R.raw.icon_tick_tiny_fill);
            HandlerHook.viewPostDelay(this, this.LL, 1000L);
        } else {
            C786410Ut5.b0(this, 8);
        }
    }
}
