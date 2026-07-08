package X;

import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18Qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21282918Qp extends AbstractC21283518Qv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC21283718Qx interfaceC21283718Qx = (InterfaceC21283718Qx) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bcm", interfaceC21283718Qx.getBcm());
        linkedHashMap.put("clear_old_value", interfaceC21283718Qx.getClearOldValue());
        if (view != null) {
            C21242818Be<Unit> bcmParamsJSB = C18BV.LIZ.setBcmParamsJSB(PageFinder.via(view), linkedHashMap);
            if (bcmParamsJSB.LIZ) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C18R6.class, containerID), "");
                return;
            }
            String str = bcmParamsJSB.LIZIZ;
            if (str == null) {
                str = "unknown reason";
            }
            C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "view is null", null, 4);
        BtmSDK.INSTANCE.getService().getMonitor().LIZIZ(2025, "", null, null, false, new C18R4());
    }
}
