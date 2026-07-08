package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1103220eoa extends LiveIconView {
    public int LLJJIJIIJIL;
    public long LLJJIJIL;
    public final Paint LLJJJ;
    public final RectF LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public EnumC1102990eoD LLJJJJLIIL;
    public final C01GW LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    private final ObjectAnimator getObjectAnimator() {
        return (ObjectAnimator) this.LLJJL.getValue();
    }

    @Override // com.bytedance.android.live.design.view.icon.LiveIconView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        getObjectAnimator().cancel();
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // com.bytedance.android.live.design.view.icon.LiveIconView, X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (this.LLJJJJ && this.LLJJJJJIL) {
                if (this.LLJJIJIIJIL < 10) {
                    RectF rectF = this.LLJJJIL;
                    float f = rectF.left;
                    float f2 = rectF.top;
                    float f3 = rectF.bottom;
                    canvas.clipRect(f, (((f3 - f2) / 10.0f) * (10 - r4)) + f2, rectF.right, f3, Region.Op.INTERSECT);
                }
                canvas.drawRoundRect(this.LLJJJIL, 10.0f, 10.0f, this.LLJJJ);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setAudioClickable(boolean z) {
        float f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioClickable:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MicSoundEffectView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJJIL = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
    }

    public void setAudioEnabled(boolean z) {
        this.LLJJJJ = z;
        if (C1103040eoI.LIZ[this.LLJJJJLIIL.ordinal()] == 1) {
            if (this.LLJJJJ) {
                setIconAttr(R.attr.e40);
                return;
            } else {
                setIconAttr(R.attr.e43);
                return;
            }
        }
        if (this.LLJJJJ) {
            setIconAttr(R.attr.e3u);
        } else {
            setIconAttr(R.attr.e3x);
        }
    }

    public final void setIconStyle(EnumC1102990eoD enumC1102990eoD) {
        this.LLJJJJLIIL = enumC1102990eoD;
    }

    public final void setVolumeLevel(int i) {
        if (i >= 0 && i <= 10 && this.LLJJJJ && this.LLJJLIIIJLLLLLLLZ) {
            getObjectAnimator().setIntValues(this.LLJJIJIIJIL, i);
            getObjectAnimator().setAutoCancel(true);
            C786410Ut5.Pd(getObjectAnimator());
        }
    }

    public C1103220eoa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJIJIL = 100L;
        Paint paint = new Paint();
        paint.setColor(C497740JfY.LJFF(R.color.a8r));
        paint.setStyle(Paint.Style.FILL);
        this.LLJJJ = paint;
        this.LLJJJIL = new RectF();
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = EnumC1102990eoD.DEFAULT;
        this.LLJJL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 252));
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = i3 - i;
        float f2 = f / 2.0f;
        float f3 = (f / 24.0f) * 5;
        this.LLJJJIL.left = f2 - ((getIconWidthRatio() * f3) / 2.0f);
        RectF rectF = this.LLJJJIL;
        rectF.right = rectF.left + (f3 * getIconWidthRatio());
        float f4 = (i4 - i2) / 24.0f;
        this.LLJJJIL.top = (4 * f4) / getIconHeightRatio();
        RectF rectF2 = this.LLJJJIL;
        rectF2.bottom = rectF2.top + (f4 * 11 * getIconHeightRatio());
    }
}
