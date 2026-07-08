package X;

import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080990eEj extends ElementSpecImpl {
    public final AbstractC1080560eE2 LL;
    public ValueAnimator LLILLJJLI;
    public boolean LLILLL;

    public C1080990eEj(AbstractC1080560eE2 abstractC1080560eE2) {
        super(C1079590eCT.LIZIZ);
        this.LL = abstractC1080560eE2;
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 682));
        addSceneObserver(new RxBusSceneObserver<C1085120eLO>() { // from class: X.0eEi
            public final C01GW LIZ;

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C1085120eLO> getType() {
                return C1085120eLO.class;
            }

            {
                this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(this.LIZIZ, 640));
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                super.dispose(layeredElementContext, constraintProperty);
                constraintProperty.translationY(0.0f);
                ((ValueAnimator) this.LIZ.getValue()).cancel();
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1085120eLO c1085120eLO) {
                C1085120eLO c1085120eLO2 = c1085120eLO;
                this.LIZIZ.LLILLL = c1085120eLO2.LIZIZ;
                ((ValueAnimator) this.LIZ.getValue()).cancel();
                ((ValueAnimator) this.LIZ.getValue()).removeAllUpdateListeners();
                float fAbs = c1085120eLO2.LIZ;
                C1080990eEj c1080990eEj = this.LIZIZ;
                if (fAbs > 0.0f) {
                    fAbs += Math.abs(c1080990eEj.LL.LJIIIZ - c1085120eLO2.LIZJ);
                }
                float f = -fAbs;
                ((ValueAnimator) this.LIZ.getValue()).setFloatValues(constraintProperty.translationY(), f);
                ValueAnimator valueAnimator = this.LIZIZ.LLILLJJLI;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ((ValueAnimator) this.LIZ.getValue()).addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 131));
                constraintProperty.translationY(f);
            }
        });
        addSceneObserver(new RxBusSceneObserver<C1081010eEl>() { // from class: X.0eEk
            public final C01GW LIZ;

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C1081010eEl> getType() {
                return C1081010eEl.class;
            }

            {
                this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(this.LIZIZ, 641));
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1081010eEl c1081010eEl) {
                C1081010eEl c1081010eEl2 = c1081010eEl;
                this.LIZIZ.LLILLJJLI = (ValueAnimator) this.LIZ.getValue();
                ((ValueAnimator) this.LIZ.getValue()).cancel();
                ((ValueAnimator) this.LIZ.getValue()).removeAllUpdateListeners();
                if (this.LIZIZ.LLILLL) {
                    float fAbs = c1081010eEl2.LIZIZ;
                    if (fAbs > 0.0f) {
                        fAbs += Math.abs(r1.LL.LJIIIZ - c1081010eEl2.LIZ);
                    }
                    float f = -fAbs;
                    ((ValueAnimator) this.LIZ.getValue()).setFloatValues(constraintProperty.translationY(), f);
                    ((ValueAnimator) this.LIZ.getValue()).addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 132));
                    constraintProperty.translationY(f);
                }
            }
        });
    }
}
