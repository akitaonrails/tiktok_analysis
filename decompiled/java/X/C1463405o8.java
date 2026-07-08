package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.05o8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1463405o8 extends AbstractC1464205oG {
    public final C054G LLILLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        InterfaceC1463505o9 interfaceC1463505o9 = (InterfaceC1463505o9) xBaseParamModel;
        String campaignId = interfaceC1463505o9.getCampaignId();
        Map<String, Object> data = interfaceC1463505o9.getData();
        String pid = interfaceC1463505o9.getPid();
        String bid = interfaceC1463505o9.getBid();
        int iIntValue = interfaceC1463505o9.getCacheTTL().intValue();
        if (!((Boolean) C00Z5.LIZ.getValue()).booleanValue()) {
            C2382909Vj.LIZ(completionBlock, 0, "ab is not enable", null, 4);
            return;
        }
        if (data == null) {
            C2382909Vj.LIZ(completionBlock, 0, "data is null", null, 4);
            return;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LJI(data);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str != null && !a0.LJJJIL(str)) {
            C01VP.LIZ.getClass();
            C2344009Gk c2344009GkLIZ = C01VP.LIZ("data_updated", campaignId);
            c2344009GkLIZ.LJIIIIZZ("update_data_source", "jsb");
            c2344009GkLIZ.LJIIIIZZ("bid", bid);
            c2344009GkLIZ.LJIIIIZZ("pid", pid);
            C20684815ws.LJIILLIIL("music_ogc_lynx_initial_data", c2344009GkLIZ.LIZ);
            C23250099c.LIZLLL(this.LLILLL, null, null, new C1463305o7(campaignId, str, iIntValue, completionBlock, this, null), 3);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "data serialization failed", null, 4);
    }
}
