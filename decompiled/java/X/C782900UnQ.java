package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782900UnQ extends ElementSpecImpl {
    public final LayeredElementContext LL;
    public final C01GW<ValueAnimator> LLILLJJLI;
    public boolean LLILLL;

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        if (this.LLILLJJLI.isInitialized() && this.LLILLJJLI.getValue().isRunning()) {
            this.LLILLJJLI.getValue().cancel();
            ConstraintProperty constraintPropertyById = this.LL.getConstraintPropertyById(getId());
            if (constraintPropertyById != null) {
                constraintPropertyById.alpha(1.0f);
            }
        }
        this.LLILLL = false;
    }

    public C782900UnQ(LayeredElementContext layeredElementContext) {
        super(C1079520eCM.LIZIZ);
        this.LL = layeredElementContext;
        this.LLILLJJLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 801));
    }
}
