package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426020GnA extends SmartImageView {
    public final C01GW LLIZLLLIL;
    public Bitmap LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;

    private final Paint getShadowPaint() {
        return (Paint) this.LLIZLLLIL.getValue();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJIIIIZZ(ImageUrlModel imageUrlModel) {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJJ(this);
        c1331670kl3LJIIIIZZ.LJJII(new C0ID4(c1331670kl3LJIIIIZZ, this, 2));
    }

    public final void LJIIIZ(Canvas canvas) {
        Bitmap bitmap = this.LLJ;
        if (bitmap != null) {
            int i = this.LLJI;
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            Integer numValueOf = Integer.valueOf(this.LLJIJIL);
            c1546210qL5.getClass();
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(i, C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf)), getWidth() + this.LLJI, getHeight() + this.LLJIJIL), getShadowPaint());
        }
        super.onDraw(canvas);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIIZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setShadowBlurRadius(int i) {
        this.LLJILJIL = i;
        setPadding(i, i, i, i);
        invalidate();
    }

    public C426020GnA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xh);
    }

    public C426020GnA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPadding(10, 10, 10, 10);
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(397));
        this.LLJIJIL = 1;
        this.LLJILJIL = 10;
    }
}
