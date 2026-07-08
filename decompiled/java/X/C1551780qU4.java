package X;

import Y.ARunnableS123S0100000_23;
import android.text.TextUtils;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.statistic.model.EventMessageModel;
import com.bytedance.geckox.statistic.model.SyncEventModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551780qU4 {
    public static final C1551780qU4 LIZ = new C1551780qU4();
    public static String LIZIZ = "";
    public static Function0<? extends Map<String, ? extends Object>> LIZJ = new C170000l0();

    public static InterfaceC1551450qTX LIZJ() {
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
        if (geckoGlobalConfig != null) {
            return geckoGlobalConfig.getStatisticMonitor();
        }
        return null;
    }

    public static void LIZ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("params_for_special", "gecko");
        jSONObject.put("os", 0);
        Common commonLIZLLL = C797990VSb.LIZ.LIZLLL();
        if (commonLIZLLL == null) {
            return;
        }
        jSONObject.put("region", commonLIZLLL.region);
        jSONObject.put("sdk_version", commonLIZLLL.sdkVersion);
        jSONObject.put("aid", commonLIZLLL.aid);
    }

    public static JSONObject LIZIZ(C1551800qU6 c1551800qU6) throws JSONException {
        int size;
        JSONObject jSONObject = new JSONObject();
        LIZ(jSONObject);
        Map<String, ? extends Object> map = c1551800qU6.LIZIZ;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        for (Pair pair : arrayList) {
            jSONObject.put((String) pair.getFirst(), pair.getSecond());
        }
        jSONObject.put("api_version", c1551800qU6.LJIIJJI);
        EnumC1552350qUz enumC1552350qUz = c1551800qU6.LIZ;
        if (enumC1552350qUz != null) {
            jSONObject.put("check_update_result", enumC1552350qUz.getNumber());
        }
        jSONObject.put("call_from", c1551800qU6.LJIILJJIL);
        if (c1551800qU6.LIZ() != null) {
            jSONObject.put("deployments_info", c1551800qU6.LIZ());
        }
        jSONObject.put("update_priority", c1551800qU6.LJIILL);
        jSONObject.put("http_status", c1551800qU6.LJ);
        jSONObject.put("server_status", c1551800qU6.LJFF);
        jSONObject.put("err_msg", c1551800qU6.LIZJ);
        jSONObject.put("req_type", c1551800qU6.LJI);
        jSONObject.put("is_intercept", c1551800qU6.LJII);
        jSONObject.put("is_simplify_local", c1551800qU6.LJIIIIZZ ? 1 : 0);
        jSONObject.put("err_code", c1551800qU6.LJIIIZ.getNumber());
        Object obj = c1551800qU6.LJIJ;
        if (obj != null) {
            jSONObject.put("need_download_package_list", obj);
        }
        jSONObject.put("need_download_package_count", c1551800qU6.LJIILLIIL);
        List<UpdatePackage> list = c1551800qU6.LJIJI;
        Object objLJJLIIIJ = null;
        if (list != null && C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS263S0000000_23.get$arr$(50), 30) != null) {
            List<UpdatePackage> list2 = c1551800qU6.LJIJI;
            if (list2 != null) {
                objLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS263S0000000_23.get$arr$(50), 30);
            }
            jSONObject.put("filtered_download_package_list", objLJJLIIIJ);
        }
        List<UpdatePackage> list3 = c1551800qU6.LJIJI;
        if (list3 != null) {
            size = list3.size();
        } else {
            size = 0;
        }
        jSONObject.put("filtered_download_package_count", size);
        jSONObject.put("actual_download_package_count", c1551800qU6.LJIIZILJ);
        Object obj2 = c1551800qU6.LJIJJ;
        if (obj2 != null) {
            jSONObject.put("actual_download_package_list", obj2);
        }
        C1552760qVe c1552760qVe = c1551800qU6.LJIILIIL;
        long j = c1552760qVe.LJIIJ;
        if (j <= 0) {
            j = c1552760qVe.LIZIZ;
        }
        jSONObject.put("duration_check_update", j - c1552760qVe.LIZ);
        jSONObject.put("duration_handle_response", c1552760qVe.LJIIJ - c1552760qVe.LJIIIZ);
        jSONObject.put("duration_download_packages", c1552760qVe.LJIIIIZZ - c1552760qVe.LJII);
        jSONObject.put("duration_total", c1552760qVe.LIZIZ - c1552760qVe.LIZ);
        jSONObject.put("duration_prepare_request", c1552760qVe.LJ - c1552760qVe.LIZLLL);
        jSONObject.put("duration_init", c1552760qVe.LIZJ - c1552760qVe.LIZ);
        jSONObject.put("duration_network", c1552760qVe.LJI - c1552760qVe.LJFF);
        int i = c1551800qU6.LJIIJ;
        if (i != 0) {
            jSONObject.put("sync_task_id", i);
        }
        if (!TextUtils.isEmpty(c1551800qU6.LIZLLL)) {
            jSONObject.put("x_tt_logid", c1551800qU6.LIZLLL);
        }
        if (!TextUtils.isEmpty(LIZIZ) && TextUtils.isEmpty(c1551800qU6.LIZLLL)) {
            jSONObject.put("x_tt_logid_latest", LIZIZ);
        }
        return jSONObject;
    }

    public static final void LIZLLL(C1504260pFQ c1504260pFQ) {
        LIZ.getClass();
        InterfaceC1551450qTX interfaceC1551450qTXLIZJ = LIZJ();
        if (interfaceC1551450qTXLIZJ == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            LIZ(jSONObject);
            if (!TextUtils.isEmpty(c1504260pFQ.LIZLLL)) {
                jSONObject.put("tt_trace_tag_id", c1504260pFQ.LIZLLL);
            }
            if (!TextUtils.isEmpty(c1504260pFQ.LJ)) {
                jSONObject.put("x_response_cache", c1504260pFQ.LJ);
            }
            if (!TextUtils.isEmpty(c1504260pFQ.LJFF)) {
                jSONObject.put("client_ip", c1504260pFQ.LJFF);
            }
            if (!TextUtils.isEmpty(c1504260pFQ.LJI)) {
                jSONObject.put("client_ip_version", c1504260pFQ.LJI);
            }
            if (!TextUtils.isEmpty(c1504260pFQ.LJII)) {
                jSONObject.put("server_ip", c1504260pFQ.LJII);
            }
            jSONObject.put("http_status", c1504260pFQ.LJIIIIZZ);
            if (c1504260pFQ.LJIIIIZZ != 200) {
                jSONObject.put("error_code", c1504260pFQ.LJIIIZ);
            }
            jSONObject.put("timing_dns", c1504260pFQ.LJIIJ);
            jSONObject.put("timing_connect", c1504260pFQ.LJIIJJI);
            jSONObject.put("timing_send", c1504260pFQ.LJIIL);
            jSONObject.put("timing_ssl", c1504260pFQ.LJIILIIL);
            jSONObject.put("timing_wait", c1504260pFQ.LJIILJJIL);
            jSONObject.put("timing_proxy", 0L);
            jSONObject.put("timing_receive", c1504260pFQ.LJIILL);
            if (!TextUtils.isEmpty(c1504260pFQ.LJIILLIIL)) {
                jSONObject.put("timing_isSocketReused", c1504260pFQ.LJIILLIIL);
            }
            jSONObject.put("timing_total", c1504260pFQ.LJIIZILJ);
            if (!TextUtils.isEmpty(c1504260pFQ.LJIJ)) {
                jSONObject.put("access", c1504260pFQ.LJIJ);
            }
            jSONObject.put("download_duration", c1504260pFQ.LJIJI);
            jSONObject.put("cdn_domain", c1504260pFQ.LIZIZ);
            jSONObject.put("package_size", c1504260pFQ.LIZJ);
            jSONObject.put("url", c1504260pFQ.LIZ);
            interfaceC1551450qTXLIZJ.LIZ("geckosdk_cdn_stats", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadCDNDownload", e);
        }
    }

    public static final void LJ(C1551800qU6 c1551800qU6) {
        c1551800qU6.LJIILIIL.LIZIZ = System.currentTimeMillis();
        C1551500qTc.LIZIZ(new ARunnableS123S0100000_23(c1551800qU6, 168));
    }

    public static final void LJFF(C1551210qT9 c1551210qT9) {
        LIZ.getClass();
        InterfaceC1551450qTX interfaceC1551450qTXLIZJ = LIZJ();
        if (interfaceC1551450qTXLIZJ == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject);
            c1551210qT9.LIZ(jSONObject);
            interfaceC1551450qTXLIZJ.LIZ("geckosdk_clean_stats", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadCleanChannel", e);
        }
    }

    public static final void LJIIJ(C1553080qWA c1553080qWA) {
        LIZ.getClass();
        InterfaceC1551450qTX interfaceC1551450qTXLIZJ = LIZJ();
        if (interfaceC1551450qTXLIZJ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                LIZ(jSONObject);
                jSONObject.put("api_version", c1553080qWA.LIZ);
                jSONObject.put("http_status", c1553080qWA.LIZJ);
                jSONObject.put("err_msg", c1553080qWA.LJ);
                jSONObject.put("req_type", c1553080qWA.LJFF);
                jSONObject.put("err_code", c1553080qWA.LIZLLL);
                if (!TextUtils.isEmpty(c1553080qWA.LIZIZ)) {
                    jSONObject.put("x_tt_logid", c1553080qWA.LIZIZ);
                }
                interfaceC1551450qTXLIZJ.LIZ("geckosdk_query_settings", jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.query.settings:", th);
            }
        }
    }

    public static final void LJIIJJI(SyncEventModel syncEventModel) {
        LIZ.getClass();
        InterfaceC1551450qTX interfaceC1551450qTXLIZJ = LIZJ();
        if (interfaceC1551450qTXLIZJ != null) {
            try {
                interfaceC1551450qTXLIZJ.LIZ("geckosdk_bytesync_stats", new JSONObject(C1551400qTS.LIZIZ.LIZ.LJIILL(syncEventModel)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadSyncEvent:", th);
            }
        }
    }

    public static final void LJIIL(UpdatePackage updatePackage) {
        LIZ.getClass();
        InterfaceC1551450qTX interfaceC1551450qTXLIZJ = LIZJ();
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject);
            updatePackage.putStatisticModelToJson(jSONObject);
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
            if (geckoGlobalConfig != null) {
                jSONObject.put("root_directory", geckoGlobalConfig.getRootDirectory().getName());
            }
            if (!TextUtils.isEmpty(LIZIZ)) {
                if (!jSONObject.has("x_tt_logid")) {
                    jSONObject.put("x_tt_logid_latest", LIZIZ);
                } else {
                    if (!Intrinsics.LJFF(LIZIZ, (String) jSONObject.get("x_tt_logid"))) {
                        jSONObject.put("x_tt_logid_latest", LIZIZ);
                    }
                }
            }
            if (interfaceC1551450qTXLIZJ != null) {
                interfaceC1551450qTXLIZJ.LIZ("geckosdk_update_aggr_stats", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadUpdateAggr", e);
        }
    }

    public static final void LJIIIZ(String str, String str2, String str3) {
        try {
            LIZ.getClass();
            InterfaceC1551450qTX interfaceC1551450qTXLIZJ = LIZJ();
            if (interfaceC1551450qTXLIZJ == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            LIZ(jSONObject);
            jSONObject.put("access_key", str);
            jSONObject.put("channel", str2);
            jSONObject.put("method", str3);
            interfaceC1551450qTXLIZJ.LIZ("geckosdk_resource_access_method", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadResourceInfoToTea", e);
        }
    }

    public static final void LJII(int i, int i2, String str, String str2) {
        LJIIIIZZ(str, i, str2, "", i2, "");
    }

    public static final void LJIIIIZZ(String str, int i, String str2, String str3, int i2, String str4) {
        LIZ.getClass();
        InterfaceC1551450qTX interfaceC1551450qTXLIZJ = LIZJ();
        if (interfaceC1551450qTXLIZJ != null) {
            try {
                EventMessageModel eventMessageModel = new EventMessageModel(i, i2);
                eventMessageModel.setErrMsg(str);
                eventMessageModel.setExtra(str2);
                eventMessageModel.setDuration(0L);
                eventMessageModel.setAccessKey(str3);
                eventMessageModel.setChannels(str4);
                JSONObject jSONObject = new JSONObject(C1551400qTS.LIZIZ.LIZ.LJIILL(eventMessageModel));
                LIZ(jSONObject);
                interfaceC1551450qTXLIZJ.LIZ("geckosdk_event_message", jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadSyncEvent", th);
            }
        }
    }

    public static void LJI(final String str, final String str2, final long j, final boolean z, final long j2, long j3, long j4, Integer num, String str3, final int i, int i2) {
        final Integer num2 = num;
        final long j5 = j4;
        final long j6 = j3;
        if ((i2 & 32) != 0) {
            j6 = 0;
        }
        if ((i2 & 64) != 0) {
            j5 = 0;
        }
        final String str4 = null;
        if ((i2 & 128) != 0) {
            num2 = null;
        }
        if ((i2 & 256) == 0) {
            str4 = str3;
        }
        C1551500qTc.LIZIZ(new Runnable() { // from class: X.0qTa
            public final void LIZ() {
                try {
                    C1551780qU4.LIZ.getClass();
                    InterfaceC1551450qTX interfaceC1551450qTXLIZJ = C1551780qU4.LIZJ();
                    if (interfaceC1551450qTXLIZJ == null) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    C1551780qU4.LIZ(jSONObject);
                    jSONObject.put("access_key", str);
                    jSONObject.put("channel", str2);
                    jSONObject.put("package_id", j);
                    jSONObject.put("success", z ? 0 : 1);
                    jSONObject.put("duration", j2);
                    Integer num3 = num2;
                    if (num3 != null) {
                        jSONObject.put("error_code", num3.intValue());
                    }
                    String str5 = str4;
                    if (str5 != null) {
                        jSONObject.put("error_message", str5);
                    }
                    jSONObject.put("raw_size", j6);
                    jSONObject.put("compress_size", j5);
                    jSONObject.put("from", i);
                    Map<String, ? extends Object> mapInvoke = C1551780qU4.LIZJ.invoke();
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, ? extends Object> entry : mapInvoke.entrySet()) {
                        JSONObject jSONObjectPut = jSONObject.put(entry.getKey(), entry.getValue());
                        if (jSONObjectPut != null) {
                            arrayList.add(jSONObjectPut);
                        }
                    }
                    interfaceC1551450qTXLIZJ.LIZ("geckosdk_compress_stats", jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1553130qWF.LJ("gecko-debug-tag", "UploadStatistic.uploadCompressState", e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UploadStatistic@6c5e.uploadCompressState$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UploadStatistic@6c5e.uploadCompressState$1");
            }
        });
    }
}
