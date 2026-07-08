package X;

import com.bytedance.android.livesdk.comp.api.subscription.model.PunishmentData;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.assem.SubManagementContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490150JKb extends C09AY implements Function1<PunishmentData, Unit> {
    public final /* synthetic */ SubManagementContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490150JKb(SubManagementContentAssem subManagementContentAssem) {
        super(1);
        this.LL = subManagementContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PunishmentData punishmentData) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }
}
