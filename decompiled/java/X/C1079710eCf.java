package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.MultiTabLIVEVisibility;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1079710eCf extends DataChannelSceneObserver<Boolean, MultiTabLIVEVisibility> {
    public final LayeredElementContext LIZ;
    public final C01GW LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<MultiTabLIVEVisibility> getType() {
        return MultiTabLIVEVisibility.class;
    }

    public C1079710eCf(LayeredElementContext layeredElementContext) {
        super(true);
        this.LIZ = layeredElementContext;
        this.LIZIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 496));
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
        super.dispose(layeredElementContext, constraintProperty);
        ((ValueAnimator) this.LIZIZ.getValue()).cancel();
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
        if (bool.booleanValue()) {
            if (constraintProperty.visibility() == 4) {
                constraintProperty.visibility(0);
            }
        } else {
            if (constraintProperty.visibility() != 0) {
                return;
            }
            constraintProperty.visibility(4);
        }
    }
}
