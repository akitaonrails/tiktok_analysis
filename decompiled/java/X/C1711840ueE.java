package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ueE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711840ueE extends AbstractC1475905q9 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        try {
            C1724180uy8 c1724180uy8 = new C1724180uy8(C1BWL.LIZ());
            c1724180uy8.LJIIL = new InterfaceC1724090uxz() { // from class: X.0ueF
                @Override // X.InterfaceC1724090uxz
                public final void onEventV3(String str, JSONObject jSONObject) {
                    C20684815ws.LJIJ(str, jSONObject);
                }
            };
            c1724180uy8.LJIILL = new InterfaceC1724010uxr() { // from class: X.08Ck
                @Override // X.InterfaceC1724010uxr
                public final void LIZ(String str) {
                    if (!u.LJJIIJZLJL(str, "aweme://webview/", false)) {
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C2214201BlK.LJFF(), "aweme://webview/");
                        smartRouteBuildRoute.withParam("url", str);
                        smartRouteBuildRoute.open();
                        return;
                    }
                    SmartRouter.buildRoute(C2214201BlK.LJFF(), str).open();
                }
            };
            c1724180uy8.LIZIZ = "https://fp22-normal-useast1a.tiktokv.com";
            C1711860ueG c1711860ueGLJFF = C932203ke.LIZ.LJFF(c1724180uy8.LIZ());
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C06CS.class, null);
            C06CS c06cs = (C06CS) xBaseModelLIZJ;
            c06cs.setCode(Integer.valueOf(c1711860ueGLJFF.LIZ));
            c06cs.setMsg(c1711860ueGLJFF.LIZIZ);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 13, null, null, 6);
        }
    }
}
