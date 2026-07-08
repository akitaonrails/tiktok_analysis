package X;

import Y.ALAdapterS12S0200000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1079930eD1 extends ElementSpecImpl {
    public final LayeredElementContext LL;
    public final View LLILLJJLI;

    public AbstractC1079930eD1(LayeredElementContext layeredElementContext, View view) {
        super(C1079590eCT.LIZ);
        this.LL = layeredElementContext;
        this.LLILLJJLI = view;
        addSceneObserver(new RxBusSceneObserver<C1085120eLO>() { // from class: X.0eD2
            public final C01GW LIZ;

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C1085120eLO> getType() {
                return C1085120eLO.class;
            }

            {
                this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(this.LIZIZ, 637));
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty) throws Throwable {
                super.dispose(layeredElementContext2, constraintProperty);
                constraintProperty.forceHasOverlappingRenderingCompat(true);
                constraintProperty.alpha(1.0f);
                ((ValueAnimator) this.LIZ.getValue()).cancel();
                C786410Ut5.LJLLLLLL(8, this.LIZIZ.LLILLJJLI);
                if (constraintProperty.visibility() == 4) {
                    constraintProperty.visibility(0);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C1085120eLO c1085120eLO) {
                C1085120eLO c1085120eLO2 = c1085120eLO;
                ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.removeAllListeners();
                    if (c1085120eLO2.LIZIZ) {
                        valueAnimator.setFloatValues(constraintProperty.alpha(), 0.0f);
                    } else {
                        valueAnimator.setFloatValues(constraintProperty.alpha(), 1.0f);
                    }
                    valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 128));
                    valueAnimator.addListener(new ALAdapterS12S0200000_17(c1085120eLO2, constraintProperty, 36));
                    if (c1085120eLO2.LIZIZ) {
                        constraintProperty.visibility(4);
                    } else {
                        constraintProperty.visibility(0);
                    }
                }
                if (c1085120eLO2.LIZIZ) {
                    C786410Ut5.LJLLLLLL(0, this.LIZIZ.LLILLJJLI);
                } else {
                    C786410Ut5.LJLLLLLL(8, this.LIZIZ.LLILLJJLI);
                    constraintProperty.visibility(0);
                }
            }
        });
    }
}
