package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.lynx.tasm.LynxView;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0NjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601970NjH extends AbstractC601930NjD {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Long lLIZ;
        Long lLIZ2;
        InterfaceC601960NjG interfaceC601960NjG = (InterfaceC601960NjG) xBaseParamModel;
        final InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC == null) {
            C2382909Vj.LIZ(completionBlock, 0, "bridge context is empty", null, 4);
            return;
        }
        InterfaceC606320NqI interfaceC606320NqI = (InterfaceC606320NqI) interfaceC634840OvC.LIZIZ(InterfaceC606320NqI.class);
        if (interfaceC606320NqI == null) {
            C2382909Vj.LIZ(completionBlock, 0, "event center not registered", null, 4);
            return;
        }
        if (interfaceC601960NjG.getCallbackId().length() == 0) {
            C2382909Vj.LIZ(completionBlock, 0, "empty callback id when trigger responsive event", null, 4);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> perfParams = interfaceC601960NjG.getPerfParams();
        if (perfParams != null) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ecMixMallCallMethodBack, perfParams=");
            sbLIZ.append(perfParams);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            Object obj = perfParams.get("t_handler_lynx_start");
            if (obj != null && (lLIZ2 = C601990NjJ.LIZ(obj)) != null) {
                linkedHashMap.put("t_handler_lynx_start", Long.valueOf(lLIZ2.longValue()));
            }
            Object obj2 = perfParams.get("t_handler_lynx_end");
            if (obj2 != null && (lLIZ = C601990NjJ.LIZ(obj2)) != null) {
                linkedHashMap.put("t_handler_lynx_end", Long.valueOf(lLIZ.longValue()));
            }
        }
        String callbackId = interfaceC601960NjG.getCallbackId();
        Map<String, ? extends Object> data = interfaceC601960NjG.getData();
        if (data == null) {
            data = C2097608Jq.LJ();
        }
        linkedHashMap.put("bridge_center_extra_bdx_bridge_context", interfaceC634840OvC);
        linkedHashMap.put("bridge_center_extra_bridge_center_context", new InterfaceC21159017rA() { // from class: X.0NjI
            @Override // X.InterfaceC21159017rA
            public final String LIZJ() {
                LynxView lynxView;
                View view = interfaceC634840OvC.getView();
                if (!(view instanceof LynxView) || (lynxView = (LynxView) view) == null) {
                    return null;
                }
                return lynxView.getTemplateUrl();
            }

            @Override // X.InterfaceC21159017rA
            public final View LIZ(String str) {
                LynxView lynxView;
                View view = interfaceC634840OvC.getView();
                if (!(view instanceof LynxView) || (lynxView = (LynxView) view) == null) {
                    return null;
                }
                return lynxView.findViewByName(str);
            }

            @Override // X.InterfaceC21159017rA
            public final <T> T LIZIZ(Class<T> cls) {
                return (T) interfaceC634840OvC.LIZIZ(cls);
            }
        });
        Object objLIZIZ = interfaceC634840OvC.LIZIZ(C1773330wFP.class);
        if (objLIZIZ != null) {
            linkedHashMap.put("bridge_center_extra_lynx_item_vo", objLIZIZ);
        }
        interfaceC606320NqI.LIZJ(callbackId, data, linkedHashMap);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC601940NjE.class, containerID), "");
    }
}
