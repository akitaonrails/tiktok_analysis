package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.ability.IPcsServiceOptInTargetPageAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinContentAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823760xYk extends C09AY implements Function0<String> {
    public final /* synthetic */ PcsServicePlusOptinContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823760xYk(PcsServicePlusOptinContentAssem pcsServicePlusOptinContentAssem) {
        super(0);
        this.LL = pcsServicePlusOptinContentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String strUi1;
        IPcsServiceOptInTargetPageAbility iPcsServiceOptInTargetPageAbilityIp = this.LL.ip();
        return (iPcsServiceOptInTargetPageAbilityIp == null || (strUi1 = iPcsServiceOptInTargetPageAbilityIp.ui1()) == null) ? "" : strUi1;
    }
}
