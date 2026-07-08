package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505810pHv extends AbstractC1505820pHw {
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
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        Context context;
        Map<String, ?> all;
        InterfaceC1505840pHy interfaceC1505840pHy = (InterfaceC1505840pHy) xBaseParamModel;
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
        if (Intrinsics.LJFF(interfaceC1505840pHy.getType(), "all")) {
            JSONObject jSONObject = new JSONObject();
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "js_kv_methods_20191113");
            if (sharedPreferencesLIZJ != null && (all = sharedPreferencesLIZJ.getAll()) != null) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            InterfaceC1505850pHz interfaceC1505850pHz = (InterfaceC1505850pHz) C1909107dp.LIZJ(InterfaceC1505850pHz.class, null);
            interfaceC1505850pHz.setValue(C786410Ut5.J3(jSONObject));
            completionBlock.onSuccess(interfaceC1505850pHz, "");
            return;
        }
        String key = interfaceC1505840pHy.getKey();
        if (key == null) {
            C2382909Vj.LIZ(completionBlock, 0, "key is null", null, 4);
            return;
        }
        String strLIZ = C1505830pHx.LIZ(context, key);
        InterfaceC1505850pHz interfaceC1505850pHz2 = (InterfaceC1505850pHz) C1909107dp.LIZJ(InterfaceC1505850pHz.class, null);
        interfaceC1505850pHz2.setValue(strLIZ);
        completionBlock.onSuccess(interfaceC1505850pHz2, "");
    }
}
