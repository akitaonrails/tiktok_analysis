package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostUserDepend;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503990pEz extends AbstractC1503970pEx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        IHostUserDepend iHostUserDepend;
        InterfaceC1503960pEw interfaceC1503960pEw = (InterfaceC1503960pEw) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            Activity activityLIZ = C0XS4.LIZ(context);
            if (activityLIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "context can not convert to activity", null, 4);
                return;
            }
            C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
            if (c1874950ytJ != null && (iHostUserDepend = c1874950ytJ.LJIIIZ) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> context2 = interfaceC1503960pEw.getContext();
                if (context2 != null) {
                    for (Map.Entry<String, Object> entry : context2.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Integer) {
                            linkedHashMap.put(key, String.valueOf(((Number) value).intValue()));
                        } else if (value instanceof Number) {
                            linkedHashMap.put(key, value.toString());
                        } else if (value instanceof String) {
                            linkedHashMap.put(key, value);
                        } else if (value instanceof Boolean) {
                            linkedHashMap.put(key, String.valueOf(((Boolean) value).booleanValue()));
                        }
                    }
                }
                iHostUserDepend.logout(activityLIZ, new InterfaceC1504020pF2() { // from class: X.0pF0
                    @Override // X.InterfaceC1504020pF2
                    public final void onSuccess() {
                        CompletionBlock<InterfaceC1504010pF1> completionBlock2 = completionBlock;
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1504010pF1.class, null);
                        ((InterfaceC1504010pF1) xBaseModelLIZJ).setStatus("loggedOut");
                        completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    }
                }, linkedHashMap);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "hostUserDepend is null", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
