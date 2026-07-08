package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540470qBp extends AbstractC1540490qBr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Map<String, Object> mapLJ;
        Map<String, Object> mapLJ2;
        Map<String, Object> mapLJ3;
        InterfaceC1540480qBq interfaceC1540480qBq = (InterfaceC1540480qBq) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(interfaceC1540480qBq.getTargetUrl());
        if (context != null) {
            SSRCacheManager sSRCacheManager = SSRCacheManager.LIZ;
            String ssrCacheKey = interfaceC1540480qBq.getSsrCacheKey();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            EnumC1539420qA8 enumC1539420qA8 = EnumC1539420qA8.SYSTEM_INFO;
            InterfaceC1540500qBs ssrRequestBody = interfaceC1540480qBq.getSsrRequestBody();
            if (ssrRequestBody == null || (mapLJ = ssrRequestBody.getSystemInfo()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            linkedHashMap.put(enumC1539420qA8, mapLJ);
            EnumC1539420qA8 enumC1539420qA82 = EnumC1539420qA8.INIT_DATA;
            InterfaceC1540500qBs ssrRequestBody2 = interfaceC1540480qBq.getSsrRequestBody();
            if (ssrRequestBody2 == null || (mapLJ2 = ssrRequestBody2.getInitData()) == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            linkedHashMap.put(enumC1539420qA82, mapLJ2);
            EnumC1539420qA8 enumC1539420qA83 = EnumC1539420qA8.GLOBAL_PROPS;
            InterfaceC1540500qBs ssrRequestBody3 = interfaceC1540480qBq.getSsrRequestBody();
            if (ssrRequestBody3 == null || (mapLJ3 = ssrRequestBody3.getGlobalProps()) == null) {
                mapLJ3 = C2097608Jq.LJ();
            }
            linkedHashMap.put(enumC1539420qA83, mapLJ3);
            int iIntValue = interfaceC1540480qBq.getRequestStrategy().intValue();
            SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
            long jLongValue = interfaceC1540480qBq.getSsrCacheTimeout().longValue();
            sSRCacheManager.getClass();
            SSRCacheManager.LIZIZ(context, ssrCacheKey, linkedHashMap, iIntValue, sparkContext, sparkSchemaParamLJJJI, jLongValue);
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1540510qBt.class)), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
