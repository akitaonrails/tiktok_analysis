package X;

import androidx.fragment.app.Fragment;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;

/* JADX INFO: renamed from: X.03iG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C917403iG extends AbstractC917803iK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C03M2.LIZ.getClass();
        String containerID = null;
        if (C03M2.LIZ() == null) {
            C2382909Vj.LIZ(completionBlock, 0, "can't find osp activity", null, 4);
            return;
        }
        MiniOspActivity miniOspActivityLIZ = C03M2.LIZ();
        if (miniOspActivityLIZ != null && !miniOspActivityLIZ.LLLLZLLLI().LLLLIILL) {
            miniOspActivityLIZ.LLLLZLLLI().LLLLIILL = true;
            Fragment fragmentLJJJJZI = miniOspActivityLIZ.getSupportFragmentManager().LJJJJZI("order_submit_fragment");
            if (fragmentLJJJJZI != null) {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(fragmentLJJJJZI, C343970De7.LIZ);
            }
            miniOspActivityLIZ.finish();
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC918503iR.class, containerID), "Success");
    }
}
