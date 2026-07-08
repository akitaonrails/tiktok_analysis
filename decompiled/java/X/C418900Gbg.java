package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418900Gbg extends C427870Gq9 {
    public final int LLJJI;
    public final int LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;

    private final Paint getOverlapPaint() {
        return (Paint) this.LLJJIJI.getValue();
    }

    private final Paint getShadowPaint() {
        return (Paint) this.LLJJIJIL.getValue();
    }

    private final Paint getSolidPaint() {
        return (Paint) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJIIJ(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLJJJIL) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getShadowPaint());
        }
        if (this.LLJJJ) {
            float width = getWidth() - this.LLJJJJJIL;
            float height = getHeight();
            float f = this.LLJJJJJIL;
            canvas.drawCircle(width, height - f, f + this.LLJJJJ, getOverlapPaint());
            float width2 = getWidth() - this.LLJJJJJIL;
            float height2 = getHeight();
            float f2 = this.LLJJJJJIL;
            canvas.drawCircle(width2, height2 - f2, f2, getSolidPaint());
            if (this.LLJJJIL) {
                float width3 = getWidth() - this.LLJJJJJIL;
                float height3 = getHeight();
                float f3 = this.LLJJJJJIL;
                canvas.drawCircle(width3, height3 - f3, f3, getShadowPaint());
            }
        }
    }

    @Override // X.C427870Gq9, com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIJ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setShadow(boolean z) {
        this.LLJJJIL = z;
        invalidate();
    }

    public C418900Gbg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void LJIIJJI(C418900Gbg c418900Gbg, boolean z) {
        float fLIZ = C339190DRl.LIZ(1.0f);
        float fLIZ2 = C339190DRl.LIZ(5.0f);
        c418900Gbg.LLJJJ = z;
        c418900Gbg.LLJJJJ = fLIZ;
        c418900Gbg.LLJJJJJIL = fLIZ2;
        c418900Gbg.invalidate();
    }

    public C418900Gbg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJI = ColorProtector.parseColor("#66000000");
        this.LLJJIII = ColorProtector.parseColor("#FE2C55");
        this.LLJJIJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(50));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 90));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 89));
    }
}
