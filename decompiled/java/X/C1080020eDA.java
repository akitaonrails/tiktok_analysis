package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080020eDA extends C1080010eD9 {
    public C1080020eDA() {
        super(R.id.v97);
        addSceneObserver(new RxBusSceneObserver<C473120Igw>() { // from class: X.0eD4
            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C473120Igw> getType() {
                return C473120Igw.class;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onEvent(com.bytedance.ies.sdk.widgets.LayeredElementContext r4, com.bytedance.ies.sdk.widgets.ConstraintProperty r5, X.C473120Igw r6) {
                /*
                    r3 = this;
                    X.0Igw r6 = (X.C473120Igw) r6
                    X.0eDA r2 = r3.LIZ
                    android.util.SparseBooleanArray r0 = r6.LIZ
                    if (r0 == 0) goto L16
                    r1 = 1
                    boolean r0 = r0.get(r1)
                    if (r0 != r1) goto L16
                Lf:
                    r2.getClass()
                    X.C1080020eDA.LIZ(r1, r5)
                    return
                L16:
                    r1 = 0
                    goto Lf
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1079960eD4.onEvent(com.bytedance.ies.sdk.widgets.LayeredElementContext, com.bytedance.ies.sdk.widgets.ConstraintProperty, java.lang.Object):void");
            }
        });
        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(this, 376));
        bindGroup(C1080000eD8.LIZLLL);
    }

    public static void LIZ(boolean z, ConstraintProperty constraintProperty) {
        if (z) {
            constraintProperty.margin(6, (int) C497740JfY.LIZIZ(32.0f));
            constraintProperty.apply();
        } else {
            constraintProperty.margin(6, (int) C497740JfY.LIZIZ(16.0f));
            constraintProperty.apply();
        }
    }
}
