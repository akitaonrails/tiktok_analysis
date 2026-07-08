package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.Common;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552100qUa extends AbstractC1552180qUi {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strLIZ = C1553670qX7.LIZ();
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        Common commonLIZLLL = c1551940qUK.LIZLLL();
        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map = c1551940qUK.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Map map2 = (Map) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map2.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), ((OptionCheckUpdateParams.CustomValue) entry2.getValue()).getValue().toString());
            }
            linkedHashMap.put(key, linkedHashMap2);
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1552200qUk.class, null);
        InterfaceC1552200qUk interfaceC1552200qUk = (InterfaceC1552200qUk) xBaseModelLIZJ;
        interfaceC1552200qUk.setAccessKey(strLIZ);
        interfaceC1552200qUk.setCustom(linkedHashMap);
        interfaceC1552200qUk.setReqMeta(C2097608Jq.LJIIIIZZ(new Pair("req_type", 10), new Pair("sync_task_id", 0)));
        InterfaceC1552150qUf interfaceC1552150qUf = (InterfaceC1552150qUf) C1909107dp.LIZJ(InterfaceC1552150qUf.class, null);
        interfaceC1552150qUf.setAid(Long.valueOf(commonLIZLLL.aid));
        interfaceC1552150qUf.setAppName(commonLIZLLL.appName);
        interfaceC1552150qUf.setAppVersion(commonLIZLLL.appVersion);
        interfaceC1552150qUf.setDeviceId(commonLIZLLL.deviceId);
        interfaceC1552150qUf.setDeviceModel(commonLIZLLL.deviceModel);
        interfaceC1552150qUf.setDevicePlatform(commonLIZLLL.devicePlatform);
        interfaceC1552150qUf.setOs(Integer.valueOf(commonLIZLLL.os));
        interfaceC1552150qUf.setOsVersion(commonLIZLLL.osVersion);
        interfaceC1552150qUf.setRegion(commonLIZLLL.region);
        interfaceC1552150qUf.setSdkVersion(commonLIZLLL.sdkVersion);
        interfaceC1552200qUk.setCommon(interfaceC1552150qUf);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
