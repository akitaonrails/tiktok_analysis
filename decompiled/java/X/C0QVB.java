package X;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.result.ISearchSkinBgAbility;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QVB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QVB extends C0QVC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        View view;
        Context context;
        C19EG c19egLIZIZ;
        ISearchSkinBgAbility iSearchSkinBgAbility;
        C0QVE c0qve = (C0QVE) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null && (context = view.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            SAFHelper.LIZ.getClass();
            InterfaceC665370Q7z interfaceC665370Q7zLJJIJL = SAFHelper.LJJIJL(view, c19egLIZIZ);
            if (interfaceC665370Q7zLJJIJL != null && (iSearchSkinBgAbility = (ISearchSkinBgAbility) C1558520qew.LIZ(interfaceC665370Q7zLJJIJL, ISearchSkinBgAbility.class, null)) != null) {
                boolean visible = c0qve.getVisible();
                c0qve.getShopCardHeight().intValue();
                iSearchSkinBgAbility.U10(visible);
            }
        }
        completionBlock.onSuccess(new XBaseResultModel() { // from class: X.00p5
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                return null;
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() {
                return new JSONObject();
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
            public final List<String> provideResultList() {
                return C13BV.INSTANCE;
            }
        }, "");
    }
}
