package X;

import com.bytedance.android.livesdk.dataChannel.PublicScreenVerticalShrinkChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080490eDv extends ElementSpecImpl {
    public final AbstractC1080560eE2 LL;
    public ConstraintProperty LLILLJJLI;
    public final C01GW LLILLL;

    public C1080490eDv(AbstractC1080560eE2 abstractC1080560eE2) {
        super(R.id.sfp);
        this.LL = abstractC1080560eE2;
        this.LLILLL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(302));
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 651));
        addSceneObserver(new DataChannelSceneObserver<Boolean, PublicScreenVerticalShrinkChannel>() { // from class: X.0eDw
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<PublicScreenVerticalShrinkChannel> getType() {
                return PublicScreenVerticalShrinkChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                this.LIZ.LIZ(!bool.booleanValue());
            }
        });
    }

    public final void LIZ(boolean z) {
        int iIntValue;
        if (C500260Jjc.LJIIZILJ(this.LL.getDataChannel())) {
            if (z) {
                iIntValue = ((Number) this.LLILLL.getValue()).intValue();
            } else {
                iIntValue = 0;
            }
            ConstraintProperty constraintProperty = this.LLILLJJLI;
            if (constraintProperty != null) {
                constraintProperty.connect(4, R.id.o_c, 3, iIntValue);
            }
        }
    }
}
