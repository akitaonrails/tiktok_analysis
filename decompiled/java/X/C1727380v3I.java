package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.PcsFormPrivacyPolicyCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0v3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727380v3I extends C09AY implements Function2<C03H5, Boolean, Unit> {
    public final /* synthetic */ PcsFormPrivacyPolicyCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727380v3I(PcsFormPrivacyPolicyCell pcsFormPrivacyPolicyCell) {
        super(2);
        this.LL = pcsFormPrivacyPolicyCell;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Boolean bool) {
        bool.booleanValue();
        this.LL.P5();
        return Unit.LIZ;
    }
}
