package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eED, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080670eED extends ElementSpecImpl {
    public final C1080530eDz LL;

    public C1080670eED(C1080530eDz c1080530eDz) {
        super(R.id.kw_);
        this.LL = c1080530eDz;
        addSceneObserver(new RxBusSceneObserver<C1085120eLO>() { // from class: X.0eEB
            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C1085120eLO> getType() {
                return C1085120eLO.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1085120eLO c1085120eLO) {
                C1085120eLO c1085120eLO2 = c1085120eLO;
                if (C1080800eEQ.LIZIZ(layeredElementContext.getDataChannel())) {
                    layeredElementContext.getDataChannel();
                    constraintProperty.removeConstraints(6);
                    constraintProperty.removeConstraints(7);
                    if (!c1085120eLO2.LIZIZ) {
                        constraintProperty.connect(6, R.id.kwe, 7, this.LIZ.LL.LJIIL);
                        constraintProperty.apply();
                    } else {
                        constraintProperty.connect(7, 0, 7, 0);
                        constraintProperty.apply();
                    }
                }
            }
        });
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 373));
    }
}
