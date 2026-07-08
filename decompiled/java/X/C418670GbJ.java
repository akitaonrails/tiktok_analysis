package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.dataChannel.BGMRefreshVolumeBarEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0GbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418670GbJ extends C21413918rB {
    public DataChannel LLILLJJLI;

    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            Rect bounds = getThumb().getBounds();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int thumbOffset = (bounds.left - getThumbOffset()) + getPaddingLeft();
            int iWidth = bounds.width() + thumbOffset;
            if (x < thumbOffset || x > iWidth || y < bounds.top || y > bounds.bottom) {
                DataChannel dataChannel = this.LLILLJJLI;
                if (dataChannel != null) {
                    dataChannel.FQ2(BGMRefreshVolumeBarEvent.class);
                }
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
    }

    public C418670GbJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }
}
