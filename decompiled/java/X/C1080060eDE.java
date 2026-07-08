package X;

import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080060eDE extends AbstractC1079930eD1 {
    public final LayeredElementContext LLILLL;
    public final View LLILZ;
    public boolean LLILZIL;

    public final void LIZ() {
        if (this.LLILZIL) {
            this.LLILLL.downElement(R.id.o_c);
            this.LLILLL.downElement(R.id.video_animate_container);
            this.LLILLL.downElement(R.id.vl5);
            this.LLILLL.downElement(R.id.ik5);
            this.LLILZIL = false;
        }
    }

    public C1080060eDE(LayeredElementContext layeredElementContext, View view) {
        super(layeredElementContext, view);
        this.LLILLL = layeredElementContext;
        this.LLILZ = view;
        addSceneObserver(new RxBusSceneObserver<C0UTW>() { // from class: X.0eDD
            public final C01GW LIZ;

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C0UTW> getType() {
                return C0UTW.class;
            }

            {
                this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(this.LIZIZ, 614));
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty) {
                super.dispose(layeredElementContext2, constraintProperty);
                constraintProperty.alpha(1.0f);
                ((ValueAnimator) this.LIZ.getValue()).cancel();
                C786410Ut5.LJLLLLLL(8, this.LIZIZ.LLILZ);
                this.LIZIZ.LIZ();
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C0UTW c0utw) {
                C1080060eDE c1080060eDE = this.LIZIZ;
                ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
                boolean z = c0utw.LIZ;
                if (z) {
                    C786410Ut5.LJLLLLLL(0, c1080060eDE.LLILZ);
                    if (!c1080060eDE.LLILZIL) {
                        c1080060eDE.LLILLL.upElement(R.id.o_c);
                        c1080060eDE.LLILLL.upElement(R.id.video_animate_container);
                        c1080060eDE.LLILLL.upElement(R.id.vl5);
                        c1080060eDE.LLILLL.upElement(R.id.ik5);
                        c1080060eDE.LLILZIL = true;
                    }
                } else {
                    C786410Ut5.LJLLLLLL(8, c1080060eDE.LLILZ);
                    c1080060eDE.LIZ();
                }
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                if (z) {
                    valueAnimator.setFloatValues(constraintProperty.alpha(), 0.0f);
                } else {
                    valueAnimator.setFloatValues(constraintProperty.alpha(), 1.0f);
                }
                valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 119));
                valueAnimator.start();
            }
        });
    }
}
