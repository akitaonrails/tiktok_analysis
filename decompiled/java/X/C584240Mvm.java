package X;

import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584240Mvm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1602170rnL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C584240Mvm(C1602170rnL c1602170rnL) {
        super(0);
        this.LL = c1602170rnL;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (((Boolean) C07O5.LIZIZ.getValue()).booleanValue()) {
            float fFloatValue = ((Number) C07O5.LIZ.getValue()).floatValue();
            WindowManager.LayoutParams attributes = this.LL.LIZ.getWindow().getAttributes();
            attributes.preferredRefreshRate = fFloatValue;
            this.LL.LIZ.getWindow().setAttributes(attributes);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setRefreshRateIfNeeded preferredRefreshRate:");
            sbLIZ.append(fFloatValue);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }
}
