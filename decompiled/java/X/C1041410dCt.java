package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.web.experiment.IABLoginDisableJsIdentifyExp;
import com.ss.android.ugc.aweme.web.experiment.IABPaymentDisableJsIdentifyExp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041410dCt extends AbstractC1041420dCu {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1039610d9z interfaceC1039610d9z;
        InterfaceC1041400dCs interfaceC1041400dCs;
        String str;
        List<String> list;
        List<String> list2;
        InterfaceC1041430dCv interfaceC1041430dCv = (InterfaceC1041430dCv) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String str2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null) {
            interfaceC1039610d9z = (InterfaceC1039610d9z) c1537480q70LIZIZ.LJFF(InterfaceC1039610d9z.class);
            interfaceC1041400dCs = (InterfaceC1041400dCs) c1537480q70LIZIZ.LJFF(InterfaceC1041400dCs.class);
        } else {
            interfaceC1039610d9z = null;
            interfaceC1041400dCs = null;
        }
        Object obj = interfaceC1041430dCv.getParams().get("type");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = interfaceC1041430dCv.getParams().get("method");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        String event = interfaceC1041430dCv.getEvent();
        switch (event.hashCode()) {
            case -1119721558:
                if (event.equals("payment_manual_input") && !Intrinsics.LJFF(str, "third_party") && interfaceC1041400dCs != null) {
                    interfaceC1041400dCs.LIZ(str, str2, "manual");
                    break;
                }
                break;
            case -843392911:
                if (event.equals("payment_submit") && interfaceC1041400dCs != null) {
                    interfaceC1041400dCs.LIZLLL(str2);
                    break;
                }
                break;
            case -713506009:
                if (event.equals("login_manual_input") && interfaceC1039610d9z != null) {
                    interfaceC1039610d9z.LIZIZ("manual");
                    break;
                }
                break;
            case -356601709:
                if (event.equals("login_autofill_input") && interfaceC1039610d9z != null) {
                    interfaceC1039610d9z.LIZIZ("autofill");
                    break;
                }
                break;
            case -154741330:
                if (event.equals("login_submit") && interfaceC1039610d9z != null) {
                    interfaceC1039610d9z.LIZJ();
                    break;
                }
                break;
            case 112279638:
                if (event.equals("payment_autofill_input") && !Intrinsics.LJFF(str, "third_party") && interfaceC1041400dCs != null) {
                    interfaceC1041400dCs.LIZ(str, str2, "autofill");
                    break;
                }
                break;
            case 296400922:
                if (event.equals("payment_input_click") && !Intrinsics.LJFF(str, "third_party") && interfaceC1041400dCs != null) {
                    interfaceC1041400dCs.LIZJ(str, str2);
                    break;
                }
                break;
            case 1657545740:
                if (event.equals("login_start")) {
                    C01GW c01gw = IABLoginDisableJsIdentifyExp.LIZIZ;
                    if ((!((IABLoginDisableJsIdentifyExp.IABLoginDisableJsIdentifyConfig) c01gw.getValue()).disableJsIdentify || (list = ((IABLoginDisableJsIdentifyExp.IABLoginDisableJsIdentifyConfig) c01gw.getValue()).methods) == null || !C13LP.LJJJJ(str2, list)) && interfaceC1039610d9z != null) {
                        interfaceC1039610d9z.LIZ(str, str2);
                    }
                }
                break;
            case 1773878505:
                if (event.equals("payment_start") && !Intrinsics.LJFF(str, "first_party")) {
                    C01GW c01gw2 = IABPaymentDisableJsIdentifyExp.LIZIZ;
                    if ((!((IABPaymentDisableJsIdentifyExp.IABPaymentDisableJsIdentifyConfig) c01gw2.getValue()).disableJsIdentify || (list2 = ((IABPaymentDisableJsIdentifyExp.IABPaymentDisableJsIdentifyConfig) c01gw2.getValue()).methods) == null || !C13LP.LJJJJ(str2, list2)) && interfaceC1041400dCs != null) {
                        interfaceC1041400dCs.LIZIZ(str, str2, "js_callback");
                    }
                    break;
                }
                break;
        }
    }
}
