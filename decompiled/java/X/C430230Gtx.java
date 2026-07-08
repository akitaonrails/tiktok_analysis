package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gtx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430230Gtx extends SmartImageView {
    public static boolean LLJILJILJ;
    public float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    public C430230Gtx(Context context) {
        this(context, null, 6, 0);
    }

    public C430230Gtx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final Paint getBorderPaint() {
        return (Paint) this.LLJILJIL.getValue();
    }

    private final Path getPath() {
        return (Path) this.LLJIJIL.getValue();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJIIIIZZ(Canvas canvas) {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 > height2) {
            width2 = height2;
        }
        float f = width2 / 2;
        float f2 = f - this.LLIZLLLIL;
        getPath().reset();
        getPath().addCircle(width, height, f2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(getPath());
        super.onDraw(canvas);
        canvas.restore();
        if (this.LLJ != 0.0f && this.LLJI != 0) {
            canvas.drawCircle(width, height, f - (getBorderPaint().getStrokeWidth() / 2), getBorderPaint());
        }
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIIIZZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setBorderAttrRes(int i) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJI = iIntValue;
        invalidate();
    }

    public final void setBorderColor(int i) {
        this.LLJI = i;
        invalidate();
    }

    public final void setBorderWidthPx(float f) {
        this.LLJ = f;
        invalidate();
    }

    public final void setPaddingPx(float f) {
        this.LLIZLLLIL = f;
        invalidate();
    }

    public C430230Gtx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJIJIL = C452501pT.LIZIZ(new C430240Gty());
        this.LLJILJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 88));
        setPlaceholderImage(0);
        setPaddingPx(C12ES.LIZJ(1.0f, context));
        setBorderWidthPx(C12ES.LIZJ(1.0f, context));
        setBorderAttrRes(R.attr.zi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C430230Gtx(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.xh;
        } else {
            i3 = 0;
        }
        this(context, attributeSet, i3);
    }

    public final void LJIIIZ(UrlModel urlModel, int[] iArr, int i, int i2, String str, InterfaceC427850Gq7 interfaceC427850Gq7) {
        C1331670kl3 c1331670kl3LJIIIIZZ;
        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(urlModel);
        if (C637980P0q.LIZ(null) && imageUrlModelLIZ.isEmpty()) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ("");
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
            c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ(getContext()));
        } else {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
        }
        if (iArr != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(iArr);
        }
        c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
        c1331670kl3LJIIIIZZ.LJIIIZ = i2;
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LIZLLL(str);
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        c1331670kl3LJIIIIZZ.LJJ(this);
        c1331670kl3LJIIIIZZ.LJIIJ(interfaceC427850Gq7);
    }
}
