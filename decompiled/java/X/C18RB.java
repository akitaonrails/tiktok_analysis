package X;

import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18RB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18RB extends C18RC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        String bcmChainStandardStringByFinder;
        int iIntValue;
        JSONObject jSONObjectLIZ;
        C18RD c18rd = (C18RD) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        if (Intrinsics.LJFF(c18rd.isDomainStandard(), Boolean.FALSE)) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = c18rd.getBtm();
            C212367188v c212367188v = BcmParams.Companion;
            Map<String, Object> bcm = c18rd.getBcm();
            c212367188v.getClass();
            c21244318Bt.LIZJ = C212367188v.LIZJ(bcm);
            c21244318Bt.LIZIZ = PageFinder.via(view);
            Number chainLength = c18rd.getChainLength();
            if (chainLength != null) {
                iIntValue = chainLength.intValue();
            } else {
                iIntValue = 20;
            }
            C18C6 bcmChainByBtmModel = btmSDK.getBcmChainByBtmModel(c21244318Bt, iIntValue, false);
            if (bcmChainByBtmModel != null && (jSONObjectLIZ = bcmChainByBtmModel.LIZ()) != null) {
                bcmChainStandardStringByFinder = C786410Ut5.J3(jSONObjectLIZ);
            } else {
                bcmChainStandardStringByFinder = null;
            }
        } else {
            BtmSDK btmSDK2 = BtmSDK.INSTANCE;
            String btm = c18rd.getBtm();
            PageFinder pageFinderVia = PageFinder.via(view);
            C212367188v c212367188v2 = BcmParams.Companion;
            Map<String, Object> bcm2 = c18rd.getBcm();
            c212367188v2.getClass();
            bcmChainStandardStringByFinder = btmSDK2.getBcmChainStandardStringByFinder(btm, pageFinderVia, C212367188v.LIZJ(bcm2));
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C18RE.class, containerID);
        ((C18RE) xBaseModelLIZJ).setBcmChain(bcmChainStandardStringByFinder);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
