package X;

import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0GWN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GWN extends View {
    public float LL;
    public float LLILLJJLI;
    public int LLILLL;
    public final List<C307130C2d> LLILZ;

    public void setInterpolator(Interpolator interpolator) {
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        if (!it2.hasNext()) {
            return;
        }
        it2.next().getClass();
        System.currentTimeMillis();
        throw null;
    }

    public void setWaveColor(int i) {
        this.LLILLL = i;
    }

    public C0GWN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.LLILZ = new ArrayList();
        new LinearInterpolator();
        new ARunnableS104S0100000_4(this, 4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveEffectView, -1, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.WaveEffectView_waveColor, -7829368);
        this.LL = typedArrayObtainStyledAttributes.getDimension(R$styleable.WaveEffectView_waveInitialRadius, 0.0f);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimension(R$styleable.WaveEffectView_waveMaxRadius, -1.0f);
        typedArrayObtainStyledAttributes.getInt(R$styleable.WaveEffectView_waveDuration, 2000);
        typedArrayObtainStyledAttributes.getInt(R$styleable.WaveEffectView_waveIntervalTime, 500);
        typedArrayObtainStyledAttributes.getFloat(R$styleable.WaveEffectView_waveStartAlpha, 1.0f);
        typedArrayObtainStyledAttributes.getFloat(R$styleable.WaveEffectView_waveEndAlpha, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        new Paint(1).setColor(this.LLILLL);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int iMin = Math.min(i, i2) / 2;
        float f = this.LLILLJJLI;
        if (f == -1.0f || f > iMin) {
            this.LLILLJJLI = iMin;
        }
        if (this.LL > iMin) {
            this.LL = this.LLILLJJLI / 2.0f;
        }
    }
}
