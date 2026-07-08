package X;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.Map;

/* JADX INFO: renamed from: X.0TSW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TSW extends C0TSU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        String containerID;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        View view2;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        if (!(view instanceof WebView)) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                view2 = interfaceC634840OvC2.getView();
            } else {
                view2 = null;
            }
            if (!(view2 instanceof LynxView)) {
                C2382909Vj.LIZ(completionBlock, 0, "RequestLocationAvailability get wrong view", null, 4);
                return;
            }
        }
        String hybridUrl = getHybridUrl(enumC1063300dmC);
        if (hybridUrl == null) {
            C2382909Vj.LIZ(completionBlock, 0, "RequestLocationAvailability get wrong url", null, 4);
            return;
        }
        Uri uri = UriProtector.parse(hybridUrl);
        String path = uri.getPath();
        String host = uri.getHost();
        if (!C1AUZ.LIZ(enumC1063300dmC, path, host) && !C1AUZ.LIZIZ(enumC1063300dmC, path, host)) {
            C2382909Vj.LIZ(completionBlock, 0, "RequestLocationAvailability get wrong path", null, 4);
            return;
        }
        try {
            Map<String, String> mapLIZ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LIZ();
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID = interfaceC634840OvC3.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0TSV.class, containerID);
            C0TSV c0tsv = (C0TSV) xBaseModelLIZJ;
            String str = mapLIZ.get("enable_location");
            if (str != null) {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
            } else {
                numValueOf = null;
            }
            c0tsv.setEnableLocation(numValueOf);
            String str2 = mapLIZ.get("system_is_precise");
            if (str2 != null) {
                numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(str2));
            } else {
                numValueOf2 = null;
            }
            c0tsv.setSystemIsPrecise(numValueOf2);
            String str3 = mapLIZ.get("inapp_is_precise");
            if (str3 != null) {
                numValueOf3 = Integer.valueOf(CastIntegerProtector.parseInt(str3));
            } else {
                numValueOf3 = null;
            }
            c0tsv.setInappIsPrecise(numValueOf3);
            String str4 = mapLIZ.get("is_location_system_permission");
            if (str4 != null) {
                numValueOf4 = Integer.valueOf(CastIntegerProtector.parseInt(str4));
            } else {
                numValueOf4 = null;
            }
            c0tsv.setLocationSystemPermission(numValueOf4);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get params exception: ");
            sbLIZ.append(e.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
