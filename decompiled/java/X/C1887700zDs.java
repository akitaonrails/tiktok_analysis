package X;

import android.content.Context;
import com.bytedance.incentive.track.IncentiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0zDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887700zDs extends AbstractC1504810pGJ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context contextLJIIJJI;
        String string;
        String strLJFF;
        String scene = ((InterfaceC1504820pGK) xBaseParamModel).getScene();
        int iHashCode = scene.hashCode();
        String containerID = null;
        if (iHashCode != -1544719766) {
            if (iHashCode != 4051516) {
                if (iHashCode == 1123609397 && scene.equals("support_event_stream")) {
                    List<IncentiveEvent> list = C1887710zDt.LIZ;
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.isEmpty()) {
                        arrayList.addAll(C13LQ.LJJLL((Object[]) C20484080s.LIZ(((Keva) C1887710zDt.LIZIZ.getValue()).getString("event_stream", "[]"), IncentiveEvent[].class)));
                    }
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID = interfaceC634840OvC.getContainerID();
                    }
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1504830pGL.class, containerID);
                    ((InterfaceC1504830pGL) xBaseModelLIZJ).setResult(C1058250de3.LIZLLL(list));
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    return;
                }
            } else if (scene.equals("attr_info")) {
                C1893370zN1 c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003);
                if (c1893370zN1 != null) {
                    strLJFF = c1893370zN1.LJFF();
                } else {
                    strLJFF = null;
                }
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                }
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1504830pGL.class, containerID);
                ((InterfaceC1504830pGL) xBaseModelLIZJ2).setResult(strLJFF);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                return;
            }
        } else if (scene.equals("support_link")) {
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP == null || (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) == null) {
                return;
            }
            Object objLJIIIZ = C1323690kYB.LIZ(contextLJIIJJI).LJIIIZ("", "appsflyer_deep_link");
            if (objLJIIIZ != null) {
                string = objLJIIIZ.toString();
            } else {
                string = null;
            }
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID = interfaceC634840OvC3.getContainerID();
            }
            XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC1504830pGL.class, containerID);
            ((InterfaceC1504830pGL) xBaseModelLIZJ3).setResult(string);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ3, "");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
        if (interfaceC634840OvC4 != null) {
            containerID = interfaceC634840OvC4.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1504830pGL.class, containerID), "");
    }
}
