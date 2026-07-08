package X;

import Y.AUListenerS224S0200000_17;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.SmoothClearScreenEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eDX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080250eDX extends DataChannelSceneObserver<C1080260eDY, SmoothClearScreenEvent> {
    public ValueAnimator LIZ;
    public C1080260eDY LIZIZ;

    public C1080250eDX() {
        super(true);
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<SmoothClearScreenEvent> getType() {
        return SmoothClearScreenEvent.class;
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) throws Throwable {
        super.dispose(layeredElementContext, constraintProperty);
        constraintProperty.forceHasOverlappingRenderingCompat(true);
        constraintProperty.translationX(0.0f);
        constraintProperty.alpha(1.0f);
        ValueAnimator valueAnimator = this.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1080260eDY c1080260eDY) {
        C1080260eDY c1080260eDY2 = c1080260eDY;
        if (!Intrinsics.LJFF(c1080260eDY2, this.LIZIZ)) {
            ValueAnimator valueAnimator = this.LIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
            }
            this.LIZIZ = c1080260eDY2;
            ValueAnimator duration = ValueAnimator.ofFloat(constraintProperty.translationX(), c1080260eDY2.LIZ).setDuration(c1080260eDY2.LIZIZ);
            duration.addUpdateListener(new AUListenerS224S0200000_17(constraintProperty, layeredElementContext, 16));
            this.LIZ = duration;
            duration.start();
        }
    }
}
