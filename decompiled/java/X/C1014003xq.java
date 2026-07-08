package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCacheServiceImpl;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1014003xq extends AbstractC1014103xr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        JSONObject json = xBaseParamModel.toJSON();
        String strOptString = json.optString("key");
        String strOptString2 = json.optString(Scene.SCENE_SERVICE);
        String strOptString3 = json.optString("value");
        if (CartCacheServiceImpl.LIZLLL().LIZJ(strOptString2)) {
            CartCacheServiceImpl.LIZLLL().LIZ(strOptString3);
        } else {
            C212391189t.LIZ.getClass();
            C212391189t.LIZIZ(strOptString2, strOptString, strOptString3);
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1014303xt.class, containerID), "");
    }
}
