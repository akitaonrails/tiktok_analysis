package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.subscription.SubscribeUpsellLynxUrlSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822200xWE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsServicePlusOptinFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822200xWE(PcsServicePlusOptinFragment pcsServicePlusOptinFragment) {
        super(0);
        this.LL = pcsServicePlusOptinFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PcsServicePlusOptinFragment pcsServicePlusOptinFragment = this.LL;
        pcsServicePlusOptinFragment.getClass();
        String smbManagementPage = SubscribeUpsellLynxUrlSetting.INSTANCE.getSmbManagementPage(pcsServicePlusOptinFragment.LL.getShowEntrance(), pcsServicePlusOptinFragment.LL.getAnchorId(), pcsServicePlusOptinFragment.LL.getSecAnchorId(), pcsServicePlusOptinFragment.LL.getAnchorId(), false, pcsServicePlusOptinFragment.LL.getPcsTrackContext(), "", false);
        Context context = pcsServicePlusOptinFragment.getContext();
        if (context != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, smbManagementPage);
        }
        return Unit.LIZ;
    }
}
