package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800840wxm extends AbstractC1800810wxj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Boolean boolValueOf;
        Map<String, ? extends Object> mapLJFF;
        String containerID;
        InterfaceC1800820wxk interfaceC1800820wxk = (InterfaceC1800820wxk) xBaseParamModel;
        try {
            PageFinder pageFinderVia = PageFinder.via((View) null);
            List<String> keys = interfaceC1800820wxk.getKeys();
            if (keys != null) {
                boolValueOf = Boolean.valueOf(keys.isEmpty());
            } else {
                boolValueOf = null;
            }
            if (C1189060h32.LJIILJJIL(boolValueOf)) {
                mapLJFF = new LinkedHashMap<>();
            } else {
                mapLJFF = C1893310zMv.LIZIZ.LJFF(pageFinderVia, interfaceC1800820wxk.getKeys(), interfaceC1800820wxk.getDataBtm());
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1800800wxi.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
            ((InterfaceC1800800wxi) xBaseModelLIZJ).setLocalServicePassthroughParams(mapLJFF);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, "unexpected error", null, 4);
            C1205490hTX.LIZ.LJ(EnumC21315318bH.PT_SETTINGS_ERROR, e);
        }
    }
}
