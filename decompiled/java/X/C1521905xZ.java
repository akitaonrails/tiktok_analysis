package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.05xZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1521905xZ extends AbstractC1522005xa {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String string;
        InterfaceC1522105xb interfaceC1522105xb = (InterfaceC1522105xb) xBaseParamModel;
        String schema = interfaceC1522105xb.getSchema();
        Map<String, Object> params = interfaceC1522105xb.getParams();
        String containerID = null;
        try {
            Uri uri = UriProtector.parse(schema);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : UriProtector.getQueryParameterNames(uri)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (!(value instanceof CharSequence) && !(value instanceof Number) && !(value instanceof Boolean) && !(value instanceof Character)) {
                        if (!(value instanceof Map) && !(value instanceof List) && !(value instanceof Object[])) {
                            string = value.toString();
                        } else {
                            string = C1741890vQh.LJIIIIZZ(value);
                        }
                    } else {
                        string = value.toString();
                    }
                    if (string != null && !a0.LJJJIL(string)) {
                        linkedHashMap.put(key, string);
                    }
                }
            }
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                builderClearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
            }
            schema = builderClearQuery.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1522205xc.class, containerID);
        ((InterfaceC1522205xc) xBaseModelLIZJ).setMergedSchema(schema);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
