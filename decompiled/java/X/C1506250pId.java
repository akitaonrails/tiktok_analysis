package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506250pId extends AbstractC1506260pIe {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        String json;
        InterfaceC1506270pIf interfaceC1506270pIf = (InterfaceC1506270pIf) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        String key = interfaceC1506270pIf.getKey();
        if (key == null) {
            C2382909Vj.LIZ(completionBlock, 0, "key is null", null, 4);
            return;
        }
        Object value = interfaceC1506270pIf.getValue();
        if (value == null) {
            C2382909Vj.LIZ(completionBlock, 0, "value is null", null, 4);
            return;
        }
        if (!(value instanceof Map) && !(value instanceof List)) {
            json = value.toString();
        } else {
            json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, value);
        }
        C1505830pHx.LIZIZ(context, key, json);
        InterfaceC1506280pIg interfaceC1506280pIg = (InterfaceC1506280pIg) C1909107dp.LIZJ(InterfaceC1506280pIg.class, null);
        interfaceC1506280pIg.setCode(1);
        completionBlock.onSuccess(interfaceC1506280pIg, "");
    }
}
