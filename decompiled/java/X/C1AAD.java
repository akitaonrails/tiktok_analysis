package X;

import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.broadcast.OpenProbeForKeyUserChannel;
import com.bytedance.android.livesdk.broadcast.VideoPreScheduleStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewManualSpeedTestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AAD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AAD extends View {
    public final Paint LL;
    public C0UWY LLILLJJLI;
    public LiveMode LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public ValueAnimator LLILZLL;
    public boolean LLIZ;

    public final void LIZ() {
        if (this.LLIZ) {
            LiveMode liveMode = this.LLILLL;
            int i = (!C500260Jjc.LJJJI(liveMode != null ? Boolean.valueOf(C354201Zc.LJFF(liveMode)) : null) || this.LLILLJJLI == C0UWY.DEFAULT || LivePreviewManualSpeedTestSetting.INSTANCE.enabled()) ? 4 : 0;
            int visibility = getVisibility();
            setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, this);
            LiveMode liveMode2 = this.LLILLL;
            if (C500260Jjc.LJJJI(liveMode2 != null ? Boolean.valueOf(C354201Zc.LJFF(liveMode2)) : null) && this.LLILLJJLI == C0UWY.TESTING) {
                if (this.LLILZLL == null) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(2.5f, 1.5f);
                    valueAnimatorOfFloat.setDuration(500L);
                    valueAnimatorOfFloat.setRepeatMode(2);
                    valueAnimatorOfFloat.setRepeatCount(-1);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this, 4));
                    valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    this.LLILZLL = valueAnimatorOfFloat;
                }
                ValueAnimator valueAnimator = this.LLILZLL;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
            } else {
                ValueAnimator valueAnimator2 = this.LLILZLL;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        float width = getWidth() / 2;
        C0UWY c0uwy = this.LLILLJJLI;
        if (c0uwy == C0UWY.TESTING) {
            f = this.LLILZ;
        } else {
            f = 2.5f;
        }
        C0UWY c0uwy2 = C0UWY.BAD_CONNECTION;
        if (c0uwy == c0uwy2) {
            i = R.color.a23;
        } else {
            i = R.color.a5z;
        }
        int iLJFF = C497740JfY.LJFF(i);
        this.LL.setStyle(Paint.Style.FILL);
        this.LL.setColor(iLJFF);
        canvas.drawCircle(width, width, (int) C497740JfY.LIZIZ(f), this.LL);
        if (this.LLILLJJLI == c0uwy2) {
            i2 = R.color.a24;
        } else {
            i2 = R.color.a60;
        }
        int iLJFF2 = C497740JfY.LJFF(i2);
        this.LL.setStyle(Paint.Style.STROKE);
        this.LL.setStrokeWidth((int) C497740JfY.LIZIZ(1.0f));
        this.LL.setColor(iLJFF2);
        canvas.drawCircle(width, width, (int) C497740JfY.LIZIZ(f + 0.5f), this.LL);
        super.onDraw(canvas);
    }

    public final void setFragment(Fragment fragment) {
        Lifecycle lifecycle;
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        if (dataChannelLJ != null) {
            dataChannelLJ.EQ2(fragment, OpenProbeForKeyUserChannel.class, new AwS612S0100000_33(this, 17));
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(fragment);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.EQ2(fragment, VideoPreScheduleStatusChannel.class, new AwS612S0100000_33(this, 18));
            dataChannelLJ2.EQ2(fragment, LiveModeChannel.class, new AwS612S0100000_33(this, 19));
        }
        if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.android.livesdk.broadcast.preview.util.PreviewRingView$setFragment$4
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    ValueAnimator valueAnimator = this.LL.LLILZLL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                }
            });
        }
    }

    public C1AAD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LL = paint;
        this.LLILLJJLI = C0UWY.DEFAULT;
        this.LLIZ = LivePreviewNetworkSpeedSetting.INSTANCE.enable();
    }
}
