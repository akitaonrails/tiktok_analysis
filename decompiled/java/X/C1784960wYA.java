package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.PcsIndustrySelectFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784960wYA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsIndustrySelectFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784960wYA(PcsIndustrySelectFragment pcsIndustrySelectFragment) {
        super(0);
        this.LL = pcsIndustrySelectFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1784900wY4 c1784900wY4 = this.LL.LLJI;
        if (c1784900wY4 != null) {
            c1784900wY4.LIZJ("cancel");
        }
        return Unit.LIZ;
    }
}
