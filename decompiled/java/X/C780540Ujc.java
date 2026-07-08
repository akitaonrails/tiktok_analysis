package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0Ujc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780540Ujc extends C21413918rB {
    public final void LJI(int i) {
        setProgress(getProgress() + i);
        if (LiveExposureOptSetting.INSTANCE.enable()) {
            C769540UGq.LIZ = getProgress();
            C769540UGq.LIZJ = true;
            C769540UGq.LIZIZ = true;
        }
        super.onSizeChanged(getHeight(), getWidth(), 0, 0);
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    public final void setInitValue(int i) {
        setProgress(i);
        if (LiveExposureOptSetting.INSTANCE.enable()) {
            C769540UGq.LIZ = i;
            C769540UGq.LIZJ = true;
            C769540UGq.LIZIZ = false;
        }
        super.onSizeChanged(getHeight(), getWidth(), 0, 0);
    }

    public C780540Ujc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setProgress(LSPassThroughRecordSizeConfig.DEFAULT);
        setProgress(500);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i2, i, i4, i3);
    }
}
