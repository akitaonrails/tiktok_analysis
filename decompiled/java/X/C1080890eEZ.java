package X;

import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterFlingDurationChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eEZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080890eEZ extends ElementSpecImpl {
    public long LL;
    public final C01GW LLILLJJLI;

    public final ValueAnimator LIZ() {
        return (ValueAnimator) this.LLILLJJLI.getValue();
    }

    public C1080890eEZ(int i) {
        super(i);
        this.LL = 800L;
        this.LLILLJJLI = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(13));
        addSceneObserver(new DataChannelSceneObserver<Long, LiveCenterFlingDurationChannel>() { // from class: X.0eEd
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveCenterFlingDurationChannel> getType() {
                return LiveCenterFlingDurationChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Long l) {
                this.LIZ.LL = l.longValue();
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Float, LiveCenterAlpha>() { // from class: X.0eEb
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveCenterAlpha> getType() {
                return LiveCenterAlpha.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
                constraintProperty.alpha(1 - f.floatValue());
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C0UVH, LiveCenterStatusChannel>() { // from class: X.0eEX
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LiveCenterStatusChannel> getType() {
                return LiveCenterStatusChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0UVH c0uvh) {
                float f;
                int i2 = C0UVI.LIZ[c0uvh.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new C1954807lC();
                        }
                        return;
                    }
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                this.LIZ.LIZ().setDuration(this.LIZ.LL);
                this.LIZ.LIZ().setFloatValues(constraintProperty.alpha(), f);
                this.LIZ.LIZ().cancel();
                this.LIZ.LIZ().removeAllUpdateListeners();
                this.LIZ.LIZ().removeAllListeners();
                this.LIZ.LIZ().addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 5));
                this.LIZ.LIZ().start();
            }
        });
    }
}
