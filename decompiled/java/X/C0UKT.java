package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.PreviewGoLiveLoadingEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UKT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UKT extends FrameLayout {
    public LifecycleOwner LL;
    public DataChannel LLILLJJLI;

    public C0UKT(Context context) {
        this(context, null, 6);
    }

    public C0UKT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LL;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LL, PreviewGoLiveLoadingEvent.class, new AwS591S0100000_12(this, 1046));
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    public C0UKT(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        FrameLayout.inflate(context, R.layout.hhh, this);
    }
}
