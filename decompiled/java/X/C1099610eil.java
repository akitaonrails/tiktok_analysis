package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.LiveUserInfoMuteUIAudienceToastOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0eil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1099610eil extends C16FY {
    public static WeakReference<Bitmap> LLJILJIL = new WeakReference<>(null);
    public boolean LLILLL;
    public boolean LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public boolean LLIZ;
    public final Paint LLIZLLLIL;
    public final PorterDuffXfermode LLJ;
    public final Bitmap LLJI;
    public Drawable LLJIJIL;

    public Boolean getMuteIconVisible() {
        return Boolean.valueOf(this.LLIZ);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public C1099610eil(Context context) {
        Bitmap bitmapDecodeResource;
        super(context);
        this.LLILZIL = (int) C497740JfY.LIZIZ(7.0f);
        this.LLILZLL = (int) C497740JfY.LIZIZ(1.0f);
        this.LLIZ = false;
        this.LLIZLLLIL = new Paint();
        this.LLJ = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        if (C1119850fFP.LJJII) {
            bitmapDecodeResource = null;
        } else {
            bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ema);
        }
        this.LLJI = bitmapDecodeResource;
        this.LLJIJIL = null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLIZ) {
            C417440GYk.LIZ(getWidth(), getHeight(), canvas, this.LLIZLLLIL);
            super.draw(canvas);
            this.LLIZLLLIL.setXfermode(this.LLJ);
            if (C497740JfY.LJJ()) {
                LIZ(this.LLILZIL, 0.0f, canvas);
            } else {
                LIZ(getWidth() - this.LLILZIL, getWidth() - (this.LLILZIL * 2), canvas);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    @Override // X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setAnchor(boolean z) {
        this.LLILZ = z;
    }

    public void setUseNewMute(boolean z) {
        this.LLILLL = z;
    }

    public C1099610eil(Context context, AttributeSet attributeSet) {
        Bitmap bitmapDecodeResource;
        super(context, attributeSet);
        this.LLILZIL = (int) C497740JfY.LIZIZ(7.0f);
        this.LLILZLL = (int) C497740JfY.LIZIZ(1.0f);
        this.LLIZ = false;
        this.LLIZLLLIL = new Paint();
        this.LLJ = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        if (C1119850fFP.LJJII) {
            bitmapDecodeResource = null;
        } else {
            bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ema);
        }
        this.LLJI = bitmapDecodeResource;
        this.LLJIJIL = null;
    }

    public final void LIZJ(boolean z, boolean z2) {
        this.LLIZ = z;
        this.LLIZLLLIL.setAntiAlias(true);
        invalidate();
        if (this.LLILLL) {
            if (!this.LLILZ && LiveUserInfoMuteUIAudienceToastOpt.enable() && z2 && z) {
                C766270U4b.LIZLLL(2131854878);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_audience_mute_mic");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_mute");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LIZ(float f, float f2, Canvas canvas) {
        Bitmap bitmap;
        int height = getHeight();
        int i = this.LLILZIL;
        canvas.drawCircle(f, height - i, i + this.LLILZLL, this.LLIZLLLIL);
        this.LLIZLLLIL.setXfermode(null);
        if (this.LLILLL) {
            if (this.LLJIJIL == null) {
                this.LLJIJIL = C342780DcC.LIZ(getContext());
            }
            if (this.LLJIJIL != null) {
                Drawable drawable = this.LLJIJIL;
                int height2 = getHeight() - (this.LLILZIL * 2);
                int i2 = (int) f2;
                drawable.setBounds(i2, height2, drawable.getIntrinsicWidth() + i2, drawable.getIntrinsicHeight() + height2);
                drawable.draw(canvas);
                return;
            }
        }
        if (C1119850fFP.LJJII) {
            if (LLJILJIL.get() == null || LLJILJIL.get().isRecycled()) {
                LLJILJIL = new WeakReference<>(BitmapFactory.decodeResource(getResources(), R.drawable.ema));
            }
            bitmap = LLJILJIL.get();
        } else {
            bitmap = this.LLJI;
        }
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, f2, getHeight() - (this.LLILZIL * 2), this.LLIZLLLIL);
    }
}
