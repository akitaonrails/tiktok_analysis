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
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ypO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872520ypO extends AbstractC1872480ypK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        final IHostUserDepend iHostUserDepend;
        InterfaceC1797410wsF interfaceC1797410wsF;
        Object objValueOf;
        C1874950ytJ c1874950ytJ;
        InterfaceC1797410wsF interfaceC1797410wsF2;
        InterfaceC1872530ypP interfaceC1872530ypP = (InterfaceC1872530ypP) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            Activity activityLIZ = C0XS4.LIZ(context);
            if (activityLIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "context can not convert to activity", null, 4);
                return;
            }
            C1874950ytJ c1874950ytJ2 = C1874950ytJ.LJIIL;
            if (c1874950ytJ2 != null && (iHostUserDepend = c1874950ytJ2.LJIIIZ) != null) {
                if (iHostUserDepend.hasLogin()) {
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1872490ypL.class, null);
                    InterfaceC1872490ypL interfaceC1872490ypL = (InterfaceC1872490ypL) xBaseModelLIZJ;
                    interfaceC1872490ypL.setStatus("loggedIn");
                    interfaceC1872490ypL.setAlreadyLoggedIn(Boolean.TRUE);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    if (interfaceC1872530ypP.getKeepOpen() || (c1874950ytJ = C1874950ytJ.LJIIL) == null || (interfaceC1797410wsF2 = c1874950ytJ.LJI) == null) {
                        return;
                    }
                    interfaceC1797410wsF2.LIZ(this.IBridgeSdkContext, enumC1063300dmC, "", false);
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Object> context2 = interfaceC1872530ypP.getContext();
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
                InterfaceC1874720ysw interfaceC1874720ysw = new InterfaceC1874720ysw() { // from class: X.0ypN
                    @Override // X.InterfaceC1874720ysw
                    public final void onFail() {
                        CompletionBlock<InterfaceC1872490ypL> completionBlock2 = completionBlock;
                        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1872490ypL.class, null);
                        InterfaceC1872490ypL interfaceC1872490ypL2 = (InterfaceC1872490ypL) xBaseModelLIZJ2;
                        interfaceC1872490ypL2.setStatus("cancelled");
                        interfaceC1872490ypL2.setAlreadyLoggedIn(Boolean.FALSE);
                        completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                    }

                    @Override // X.InterfaceC1874720ysw
                    public final void onSuccess() {
                        if (iHostUserDepend.hasLogin()) {
                            CompletionBlock<InterfaceC1872490ypL> completionBlock2 = completionBlock;
                            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1872490ypL.class, null);
                            InterfaceC1872490ypL interfaceC1872490ypL2 = (InterfaceC1872490ypL) xBaseModelLIZJ2;
                            interfaceC1872490ypL2.setAlreadyLoggedIn(Boolean.FALSE);
                            interfaceC1872490ypL2.setStatus("loggedIn");
                            completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                            return;
                        }
                        CompletionBlock<InterfaceC1872490ypL> completionBlock3 = completionBlock;
                        XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC1872490ypL.class, null);
                        InterfaceC1872490ypL interfaceC1872490ypL3 = (InterfaceC1872490ypL) xBaseModelLIZJ3;
                        interfaceC1872490ypL3.setAlreadyLoggedIn(Boolean.FALSE);
                        interfaceC1872490ypL3.setStatus("cancelled");
                        completionBlock3.onSuccess((XBaseResultModel) xBaseModelLIZJ3, "");
                    }
                };
                if (interfaceC1872530ypP.getKeepOpen()) {
                    iHostUserDepend.login(activityLIZ, interfaceC1874720ysw, linkedHashMap);
                    objValueOf = Unit.LIZ;
                } else {
                    IHostUserDepend.LoginParamsExt loginParamsExt = new IHostUserDepend.LoginParamsExt();
                    loginParamsExt.setKeepOpen(interfaceC1872530ypP.getKeepOpen());
                    iHostUserDepend.login(activityLIZ, interfaceC1874720ysw, linkedHashMap, loginParamsExt);
                    C1874950ytJ c1874950ytJ3 = C1874950ytJ.LJIIL;
                    if (c1874950ytJ3 != null && (interfaceC1797410wsF = c1874950ytJ3.LJI) != null) {
                        objValueOf = Boolean.valueOf(interfaceC1797410wsF.LIZ(this.IBridgeSdkContext, enumC1063300dmC, "", false));
                    }
                }
                if (objValueOf != null) {
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "hostUserDepend is null", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
