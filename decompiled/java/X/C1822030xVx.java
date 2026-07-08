package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.assem.PcsServiceSkuContentAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822030xVx extends C09AY implements Function0<PcsDialogAbility> {
    public final /* synthetic */ PcsServiceSkuContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822030xVx(PcsServiceSkuContentAssem pcsServiceSkuContentAssem) {
        super(0);
        this.LL = pcsServiceSkuContentAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.android.livesdk.comp.api.pcs.data.ability.PcsDialogAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final PcsDialogAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), PcsDialogAbility.class, null);
    }
}
