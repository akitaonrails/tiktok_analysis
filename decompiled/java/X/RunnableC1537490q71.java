package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0q71, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1537490q71 implements Runnable {
    public final /* synthetic */ C1537480q70 LL;

    public RunnableC1537490q71(C1537480q70 c1537480q70) {
        this.LL = c1537480q70;
    }

    public final void LIZ() {
        Pair[] pairArr = new Pair[15];
        pairArr[0] = new Pair("spark_bid", this.LL.bid);
        pairArr[1] = new Pair("spark_vaid", this.LL.vaid);
        pairArr[2] = new Pair("spark_bid_from", this.LL.bidFrom);
        pairArr[3] = new Pair("spark_resource_path", this.LL.resourcePath);
        pairArr[4] = new Pair("spark_resource_preload_triggered", Boolean.valueOf(this.LL.resourcePreloadTriggered));
        pairArr[5] = new Pair("spark_ui_type", this.LL.uiType.getType());
        pairArr[6] = new Pair("spark_cold_start_engine", Boolean.valueOf(this.LL.coldStartEngine));
        C1533760q10 c1533760q10 = this.LL.mainDocumentGeckoInfo;
        pairArr[7] = new Pair("spark_main_document_gecko_channel", c1533760q10 != null ? c1533760q10.LIZIZ : null);
        C1533760q10 c1533760q102 = this.LL.mainDocumentGeckoInfo;
        pairArr[8] = new Pair("spark_main_document_gecko_bundle", c1533760q102 != null ? c1533760q102.LIZJ : null);
        pairArr[9] = new Pair("spark_use_preload", Boolean.valueOf(this.LL.usePreload));
        pairArr[10] = new Pair("spark_auto_release_resource_group", Boolean.valueOf(this.LL.autoReleaseResourceGroup));
        pairArr[11] = new Pair("spark_jsb_optimize", Boolean.valueOf(this.LL.jsbOptimize));
        pairArr[12] = new Pair("spark_jsb_optimize_v2", Boolean.valueOf(this.LL.jsbOptimizeV2));
        pairArr[13] = new Pair("spark_enable_auto_hide_loading_script", Boolean.valueOf(this.LL.enableAutoHideLoadingScript));
        pairArr[14] = new Pair("spark_fmp_value_for_auto_hide_loading_script", this.LL.fmpValueForAutoHideLoadingScript);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C1537510q73 c1537510q73 = this.LL.runtimeInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : c1537510q73.entrySet()) {
            Object value = entry.getValue();
            if (value != null && ((value instanceof Number) || (value instanceof String) || (value instanceof Boolean))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("spark_runtime_");
            sbLIZ.append(C1530570pvr.LIZ((String) entry2.getKey()));
            linkedHashMap2.put(C2188811AlT.LIZIZ(sbLIZ), entry2.getValue());
        }
        mapLJIIJ.putAll(linkedHashMap2);
        Uri uri = UriProtector.parse(this.LL.LJIJI());
        mapLJIIJ.put("spark_schema_protocol", uri.getScheme());
        mapLJIIJ.put("spark_schema_host", uri.getHost());
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("spark_schema_param_");
                sbLIZ2.append(C1530570pvr.LIZ(str));
                mapLJIIJ.put(C2188811AlT.LIZIZ(sbLIZ2), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        C1491570oux.LJIILLIIL(C1491570oux.LIZ, this.LL.containerId, mapLJIIJ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("HybridPropsExtKt@e470.writeExtraInfoToHybridProps$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HybridPropsExtKt@e470.writeExtraInfoToHybridProps$1");
    }
}
