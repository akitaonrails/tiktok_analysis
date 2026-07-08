package X;

import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18Qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21283018Qq extends AbstractC21283618Qw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.14hs] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        String containerID;
        String btm = ((C18R1) xBaseParamModel).getBtm();
        C18CK.LIZLLL("FE_registerBtmPage", new C18R9(btm));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        XBaseResultModel xBaseResultModel = null;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
            String str = C1545850qKV.LLILLJJLI.get(view);
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            Pair<Boolean, String> pairRegisterBtmPage = btmSDK.getService().registerBtmPage(view, btm, str);
            if (pairRegisterBtmPage.getFirst().booleanValue()) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C18R5.class, containerID), "");
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("btm=");
                sbLIZ.append(btm);
                sbLIZ.append(", register failed, ");
                sbLIZ.append(pairRegisterBtmPage.getSecond());
                C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
                xBaseResultModel = null;
                btmSDK.getService().getMonitor().LIZIZ(2024, "", null, null, false, new C18R2(btm));
            }
            if (Unit.LIZ != null) {
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("btm=");
        sbLIZ2.append(btm);
        sbLIZ2.append(", view is null");
        C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ2), xBaseResultModel, 4);
        BtmSDK.INSTANCE.getService().getMonitor().LIZIZ(2025, "", xBaseResultModel, xBaseResultModel, false, new C18R3(btm));
    }
}
