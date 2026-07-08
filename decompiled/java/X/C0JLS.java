package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.moderator.assem.PcsServiceModeratorAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JLS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLS extends C09AY implements Function0<PcsDialogAbility> {
    public final /* synthetic */ PcsServiceModeratorAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JLS(PcsServiceModeratorAssem pcsServiceModeratorAssem) {
        super(0);
        this.LL = pcsServiceModeratorAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final PcsDialogAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), PcsDialogAbility.class, null);
    }
}
