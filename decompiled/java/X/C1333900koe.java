package X;

import Y.ARunnableS0S1300100_20;
import Y.ARunnableS5S1100100_20;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.optimize.statistics.StatLogUtils;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0koe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1333900koe extends C1320270kSf {
    public static final ExecutorService LIZJ;
    public final ConcurrentHashMap<String, C1333830koX> LIZ;
    public final C1333910kof LIZIZ;

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LJFF(String str) {
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LJIIIIZZ(String str, String str2, Map<String, String> map) {
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final boolean LJIIJ(String str) {
        return true;
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.0koi
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new BPEAThread(runnable, "fresco-trace-monitor");
            }
        };
        LIZJ = C0WP5.LIZJ() ? new C822650WOx(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory) : C786410Ut5.e4(1, threadFactory);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kof, X.0kwt] */
    public C1333900koe() {
        ?? r1 = new InterfaceC1339010kwt() { // from class: X.0kof
            @Override // X.InterfaceC1339010kwt
            public final void LIZIZ(long j, long j2, C1334060kou c1334060kou, C1494850p0F c1494850p0F, JSONObject jSONObject) {
                LIZJ(j, j2, c1334060kou, c1494850p0F, null, jSONObject);
            }

            @Override // X.InterfaceC1339010kwt
            public final void LIZ(long j, long j2, C1334060kou c1334060kou, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject) {
                LIZJ(j, j2, c1334060kou, c1494850p0F, th, jSONObject);
            }

            public final void LIZJ(long j, long j2, C1334060kou c1334060kou, C1494850p0F c1494850p0F, Throwable th, JSONObject jSONObject) {
                int iIntValue;
                long jLongValue;
                Object objRemove = jSONObject.remove("requestId");
                Object objRemove2 = jSONObject.remove("retryCount");
                Object objRemove3 = jSONObject.remove("queue_time");
                Object objRemove4 = jSONObject.remove("fetch_time");
                for (InterfaceC1330770kjb interfaceC1330770kjb : (ArrayList) C1330620kjM.LIZ) {
                    if (interfaceC1330770kjb != null) {
                        interfaceC1330770kjb.LIZ();
                    }
                }
                try {
                    if (objRemove instanceof String) {
                        String str = (String) objRemove;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        if (objRemove2 instanceof Integer) {
                            iIntValue = ((Integer) objRemove2).intValue();
                        } else {
                            iIntValue = -1;
                        }
                        long jLongValue2 = -1;
                        if (objRemove3 instanceof Long) {
                            jLongValue = ((Long) objRemove3).longValue();
                        } else {
                            jLongValue = -1;
                        }
                        if (objRemove4 instanceof Long) {
                            jLongValue2 = ((Long) objRemove4).longValue();
                        }
                        C1333830koX c1333830koX = this.LIZ.LIZ.get(str);
                        if (c1333830koX == null) {
                            return;
                        }
                        JSONObject jSONObject2 = c1333830koX.LIZJ;
                        jSONObject2.put("is_request_network", true);
                        jSONObject2.put("http_status", jSONObject.optInt("http_status", 0));
                        jSONObject2.put("retry_count", iIntValue);
                        jSONObject2.put("queue_duration", jLongValue);
                        jSONObject2.put("download_duration", jLongValue2);
                        C1333900koe.LJIILLIIL(c1494850p0F, jSONObject2);
                        C1333900koe.LJIIZILJ(c1334060kou, jSONObject2);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        this.LIZIZ = r1;
        this.LIZ = new ConcurrentHashMap<>();
        C1338960kwo.LIZIZ = r1;
    }

    public static JSONObject LJIILIIL(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
            if (jSONObjectOptJSONObject == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("headers", jSONObject2);
                return jSONObject2;
            }
            return jSONObjectOptJSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1328570kg3.LJII("FrescoTraceListener", "construct headers error", e.getMessage());
            return null;
        }
    }

    public static boolean LJIILL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.contains("Canceled") && !str.contains("canceled")) {
            return false;
        }
        return true;
    }

    public static String LJIJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            LJIJ("socket", "cip", jSONObject);
            LJIJ("dns", "queried_with_cip", jSONObject);
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (StatLogUtils.IsDebug()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeSensitiveFromRequestLog ");
                sbLIZ.append(Log.getStackTraceString(e));
                StatLogUtils.e(C2188811AlT.LIZIZ(sbLIZ));
            }
            return str;
        }
    }

    public static Pair LJIJJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("x");
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            return new Pair(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[0])), Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[1])));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LIZLLL(String str) {
        LIZJ.submit(new ARunnableS5S1100100_20(str, System.currentTimeMillis(), this, 1));
    }

    public static long LJIIL(long j, Long l) {
        if (l != null) {
            return j - l.longValue();
        }
        return -1L;
    }

    public static void LJIILLIIL(C1494850p0F c1494850p0F, JSONObject jSONObject) {
        if (c1494850p0F != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("requestStart", c1494850p0F.LJI);
                jSONObject2.put("responseBack", c1494850p0F.LJII);
                jSONObject2.put("completeReadResponse", c1494850p0F.LJIIIIZZ);
                jSONObject2.put("requestEnd", c1494850p0F.LJIIIZ);
                jSONObject2.put("recycleCount", c1494850p0F.LJJ);
                int i = c1494850p0F.LJJIFFI;
                if (i == 0 || i == 2) {
                    jSONObject2.put("timing_dns", c1494850p0F.LJIIJ);
                    jSONObject2.put("timing_connect", c1494850p0F.LJIIJJI);
                    jSONObject2.put("timing_ssl", c1494850p0F.LJIIL);
                    jSONObject2.put("timing_send", c1494850p0F.LJIILIIL);
                    jSONObject2.put("timing_wait", c1494850p0F.LJIILJJIL);
                    jSONObject2.put("timing_receive", c1494850p0F.LJIILL);
                    jSONObject2.put("timing_total", c1494850p0F.LJIILLIIL);
                    jSONObject2.put("timing_isSocketReused", c1494850p0F.LJJI);
                    jSONObject2.put("timing_totalSendBytes", c1494850p0F.LJIJI);
                    jSONObject2.put("timing_totalReceivedBytes", c1494850p0F.LJIJJ);
                    jSONObject2.put("timing_remoteIP", c1494850p0F.LJIJ);
                    jSONObject2.put("request_log", LJIJI(c1494850p0F.LJJIIJ));
                }
                JSONObject jSONObject3 = c1494850p0F.LJJIIJZLJL;
                if (jSONObject3 != null) {
                    jSONObject3.remove("client_info");
                    LJIJ("response-headers", "set-cookie", c1494850p0F.LJJIIJZLJL);
                    LJIJ("response-headers", "x-request-ip", c1494850p0F.LJJIIJZLJL);
                    jSONObject2.put("req_info", c1494850p0F.LJJIIJZLJL);
                }
                jSONObject2.put("download", c1494850p0F.LJJIIZ);
                jSONObject.put("net_timing_detail", jSONObject2);
                if (c1494850p0F.LJJIFFI == 2) {
                    jSONObject.put("netClientType", "MIOClient");
                } else if (C1493430oxx.LIZ()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                if (StatLogUtils.IsDebug()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("packageRequestParameters ");
                    sbLIZ.append(Log.getStackTraceString(e));
                    StatLogUtils.e(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    public static void LJIIZILJ(C1334060kou c1334060kou, JSONObject jSONObject) {
        String str;
        String str2;
        try {
            C1333950koj c1333950koj = c1334060kou.LIZIZ;
            String str3 = "";
            if (c1333950koj == null) {
                C0X52 c0x52 = c1334060kou.LIZ;
                if (c0x52 != null) {
                    C080U c080uLIZ = c0x52.LIZ.LIZ("Nw-Session-Trace");
                    C080U c080uLIZ2 = c1334060kou.LIZ.LIZ.LIZ("x-net-info.remoteaddr");
                    if (c080uLIZ == null) {
                        str = "";
                    } else {
                        str = c1334060kou.LIZ.LIZ.LIZ("Nw-Session-Trace").LIZIZ;
                    }
                    str2 = c080uLIZ2 != null ? c1334060kou.LIZ.LIZ.LIZ("x-net-info.remoteaddr").LIZIZ : "";
                } else {
                    c1334060kou.getClass();
                    str = "";
                    str2 = "";
                }
            } else {
                str = c1333950koj.LIZ;
                str2 = c1333950koj.LIZIZ;
            }
            if (str == null) {
                str = "";
            }
            jSONObject.put("nw-session-trace", str);
            if (str2 != null) {
                str3 = str2;
            }
            jSONObject.put("server_ip", str3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (StatLogUtils.IsDebug()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("packageResponseHeader ");
                sbLIZ.append(Log.getStackTraceString(e));
                StatLogUtils.e(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LJIJJLI(C1325710kbR c1325710kbR, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = null;
            String strOptString = jSONObject.optString("uri", null);
            String strOptString2 = jSONObject.optString("biz_tag", null);
            if (!TextUtils.isEmpty(strOptString)) {
                Uri uri = UriProtector.parse(strOptString);
                if (strOptString2 == null) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "biz_tag");
                    if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from");
                    }
                    if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && c1325710kbR != null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = c1325710kbR.LJJJJ;
                    }
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        jSONObject.put("biz_tag", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                }
                C1330560kjG.LJIIJJI(jSONObject, c1325710kbR, uri);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "imagex_flight_id");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "imagex_vid");
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) || !TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                    try {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                            jSONObject.put("extra", jSONObjectOptJSONObject);
                        }
                        jSONObject2 = jSONObjectOptJSONObject;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1328570kg3.LJII("FrescoTraceListener", "construct extra error", e.getMessage());
                    }
                    jSONObject2.put("imagex_flight_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    jSONObject2.put("imagex_vid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                }
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1328570kg3.LJII("FrescoTraceListener", "uriQueryParamToExtra error", e2.getMessage());
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LJI(String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1333830koX c1333830koX = this.LIZ.get(str);
        if (c1333830koX == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        Map<String, Long> map = c1333830koX.LIZIZ;
        sb.append(str2);
        ((HashMap) map).put(sb.toString(), Long.valueOf(jCurrentTimeMillis));
        JSONObject jSONObject = c1333830koX.LIZJ;
        if (jSONObject != null) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("image_monitor_data");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.put(str2, new JSONObject());
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJIJ(String str, String str2, JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof JSONObject) {
            ((JSONObject) objOpt).remove(str2);
            return;
        }
        if (!(objOpt instanceof String)) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject((String) objOpt);
            jSONObject2.remove(str2);
            jSONObject.put(str, C786410Ut5.J3(jSONObject2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LIZIZ(String str, String str2, Map<String, String> map) {
        JSONObject jSONObjectOptJSONObject;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1333830koX c1333830koX = this.LIZ.get(str);
        if (c1333830koX == null) {
            return;
        }
        HashMap map2 = (HashMap) c1333830koX.LIZIZ;
        if (map2.isEmpty()) {
            return;
        }
        Long l = (Long) map2.remove(str + str2);
        JSONObject jSONObject = c1333830koX.LIZJ;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("image_monitor_data");
            if (jSONObjectOptJSONObject != null) {
                try {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str2);
                    if (jSONObjectOptJSONObject2 != null) {
                        try {
                        } catch (JSONException e) {
                            e = e;
                        }
                        try {
                            jSONObjectOptJSONObject2.put("producer_start", l.longValue() - Long.valueOf(c1333830koX.LIZ).longValue());
                            jSONObjectOptJSONObject2.put("producer_end", jCurrentTimeMillis - c1333830koX.LIZ);
                        } catch (JSONException e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (JSONException e3) {
                    e = e3;
                }
            }
        } catch (JSONException e4) {
            e = e4;
            jSONObjectOptJSONObject = null;
        }
        if (map == null) {
            return;
        }
        String str3 = "1";
        if ("NetworkFetchProducer".equals(str2)) {
            try {
                String str4 = map.get("content_length");
                String str5 = map.get("image_size");
                long j2 = -1;
                if (!TextUtils.isEmpty(str4)) {
                    j = CastLongProtector.parseLong(str4);
                } else {
                    j = -1;
                }
                if (!TextUtils.isEmpty(str5)) {
                    j2 = CastLongProtector.parseLong(str5);
                }
                jSONObject.put("file_size", j2);
                jSONObject.put("content_length", j);
                if (j != j2) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("file_consistent", str3);
                jSONObject.put("hit_cdn_cache", map.get("hit_cdn_cache"));
                jSONObject.put("x_response_cache", map.get("x_response_cache"));
                jSONObject.put("imagex_demotion", map.get("imagex_demotion"));
                jSONObject.put("imagex_want_fmt", map.get("imagex_want_fmt"));
                jSONObject.put("imagex_true_fmt", map.get("imagex_true_fmt"));
                jSONObject.put("imagex_consistency", map.get("imagex_consistency"));
                jSONObject.put("is_prefetch_image", map.get("is_prefetch_image"));
                if (map.get("mio_trace_id") != null) {
                    jSONObject.put("mio_trace_id", map.get("mio_trace_id"));
                }
                LJIILIIL(jSONObject).put("x-response-cache", map.get("x_response_cache"));
                if (!TextUtils.isEmpty(map.get("x-imagex-extra"))) {
                    LJIILIIL(jSONObject).put("x-imagex-extra", map.get("x-imagex-extra"));
                }
                jSONObject.put("customParam", map.get("customParam"));
                return;
            } catch (NumberFormatException e5) {
                TryCatchGuardChecker.doCheck(e5);
                return;
            } catch (JSONException e6) {
                TryCatchGuardChecker.doCheck(e6);
                return;
            }
        }
        if ("DiskCacheWriteProducer".equals(str2)) {
            try {
                jSONObject.put("image_type", map.get("imageType"));
                String str6 = map.get("encodedImageSize");
                if ("-1x-1".equals(str6) || "unknown".equals(str6)) {
                    str6 = map.get("bitmapSize");
                }
                jSONObject.put("applied_image_size", str6);
                return;
            } catch (JSONException e7) {
                TryCatchGuardChecker.doCheck(e7);
                return;
            }
        }
        if ("DecodeProducer".equals(str2)) {
            try {
                String str7 = map.get("requestedImageSize");
                if ("unknown".equals(str7)) {
                    str7 = "0x0";
                }
                jSONObject.put("intended_image_size", str7);
                String str8 = map.get("encodedImageSize");
                if ("-1x-1".equals(str8) || "unknown".equals(str8)) {
                    str8 = map.get("bitmapSize");
                }
                jSONObject.put("isCrop", map.get("isCrop"));
                jSONObject.put("regionToDecode", map.get("regionToDecode"));
                jSONObject.put("sampleSize", map.get("sampleSize"));
                jSONObject.put("applied_image_size", str8);
                jSONObject.put("decode_duration", jCurrentTimeMillis - l.longValue());
                jSONObject.put("image_type", map.get("imageFormat"));
                jSONObject.put("image_ram_size", map.get("bitmapRamSize"));
                jSONObject.put("image_count", CastIntegerProtector.parseInt(map.get("imageCount")));
                jSONObject.put("extra_bitmap_config", map.get("extra_bitmap_config"));
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.put("decode_queue_duration", CastLongProtector.parseLong(map.get("queueTime")));
                }
                jSONObject.put("image_quality", map.get("imageQuality"));
                jSONObject.put("heic_sys_first", map.get("heic_sys_first"));
                jSONObject.put("heic_custom_decoder", map.get("heic_custom_decoder"));
                try {
                    String str9 = map.get("heic_decode_error");
                    if (str9 != null) {
                        jSONObject.put("err_code", CastIntegerProtector.parseInt(str9));
                    }
                } catch (Exception e8) {
                    TryCatchGuardChecker.doCheck(e8);
                }
                if (map.get("thumb_decode_duration") != null) {
                    jSONObject.put("thumb_file_size", map.get("thumb_file_size"));
                    jSONObject.put("thumb_decode_duration", map.get("thumb_decode_duration"));
                    jSONObject.put("thumb_download_duration", System.currentTimeMillis() - c1333830koX.LIZ);
                }
                if (map.get("preview_used") != null && "1".equals(map.get("preview_used"))) {
                    jSONObject.put("preview_used", map.get("preview_used"));
                    jSONObject.put("preview_algo", map.get("preview_algo"));
                    jSONObject.put("preview_duration", map.get("preview_duration"));
                    jSONObject.put("preview_error", map.get("preview_error"));
                    jSONObject.put("preview_hash_decode_duration", map.get("preview_hash_decode_duration"));
                }
                if ("1".equalsIgnoreCase(map.get("sr_heic_opt"))) {
                    String str10 = map.get("sr_duration");
                    jSONObject.put("sr_heic_opt", map.get("sr_heic_opt"));
                    jSONObject.put("sr_type", map.get("sr_type"));
                    jSONObject.put("sr_status", map.get("sr_status"));
                    jSONObject.put("sr_duration", str10);
                    jSONObject.put("sr_width", map.get("sr_width"));
                    jSONObject.put("sr_height", map.get("sr_height"));
                    jSONObject.put("sr_stretch", map.get("sr_stretch"));
                    jSONObject.put("scale_type", map.get("scale_type"));
                    jSONObject.put("enable_all", map.get("enable_all"));
                    jSONObject.put("sr_max_width", map.get("sr_max_width"));
                    jSONObject.put("sr_max_height", map.get("sr_max_height"));
                    jSONObject.put("sr_err", map.get("sr_err"));
                    if (!TextUtils.isEmpty(str10)) {
                        jSONObject.put("decode_duration", (jCurrentTimeMillis - l.longValue()) - ((long) CastIntegerProtector.parseInt(str10)));
                        return;
                    }
                    return;
                }
                return;
            } catch (NumberFormatException e9) {
                TryCatchGuardChecker.doCheck(e9);
                return;
            } catch (JSONException e10) {
                TryCatchGuardChecker.doCheck(e10);
                return;
            }
        }
        if ("BackgroundThreadHandoffProducer".equals(str2)) {
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put("pause_time", map.get("pendingTime"));
                    return;
                } catch (JSONException e11) {
                    TryCatchGuardChecker.doCheck(e11);
                    return;
                }
            }
            return;
        }
        if ("PostprocessorProducer".equals(str2)) {
            try {
                if (!"1".equalsIgnoreCase(map.get("sr_heic_opt"))) {
                    jSONObject.put("sr_heic_opt", map.get("sr_heic_opt"));
                    jSONObject.put("sr_type", map.get("sr_type"));
                    jSONObject.put("sr_status", map.get("sr_status"));
                    jSONObject.put("sr_duration", map.get("sr_duration"));
                    jSONObject.put("sr_width", map.get("sr_width"));
                    jSONObject.put("sr_height", map.get("sr_height"));
                    jSONObject.put("sr_stretch", map.get("sr_stretch"));
                    jSONObject.put("scale_type", map.get("scale_type"));
                    jSONObject.put("enable_all", map.get("enable_all"));
                    jSONObject.put("sr_max_width", map.get("sr_max_width"));
                    jSONObject.put("sr_max_height", map.get("sr_max_height"));
                    jSONObject.put("sr_err", map.get("sr_err"));
                }
            } catch (JSONException e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                jSONObject.put("sharp_type", map.get("sharp_type"));
                jSONObject.put("sharp_status", map.get("sharp_status"));
                jSONObject.put("sharp_duration", map.get("sharp_duration"));
                jSONObject.put("sharp_error", map.get("sharp_error"));
                jSONObject.put("sharp_wt", map.get("sharp_wt"));
                jSONObject.put("sharp_thr", map.get("sharp_thr"));
                jSONObject.put("sharp_ovrt", map.get("sharp_ovrt"));
                jSONObject.put("sharp_adaptive", map.get("sharp_adaptive"));
                jSONObject.put("sharp_g0", map.get("sharp_g0"));
                jSONObject.put("sharp_lc_wt_thr", map.get("sharp_lc_wt_thr"));
            } catch (JSONException e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJII(final C1325710kbR c1325710kbR, final String str, boolean z) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        LIZJ.submit(new Runnable() { // from class: X.0koZ
            /* JADX WARN: Removed duplicated region for block: B:105:0x02ef  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0317  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x031f  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x033a  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x033e  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x0375  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0378  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x03d2  */
            /* JADX WARN: Removed duplicated region for block: B:157:0x03dd  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x040b  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0416  */
            /* JADX WARN: Removed duplicated region for block: B:177:0x043e  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x0440  */
            /* JADX WARN: Removed duplicated region for block: B:182:0x044c  */
            /* JADX WARN: Removed duplicated region for block: B:187:0x0457  */
            /* JADX WARN: Removed duplicated region for block: B:196:0x0488 A[PHI: r1
              0x0488: PHI (r1v149 java.lang.String) = (r1v143 java.lang.String), (r1v148 java.lang.String) binds: [B:175:0x043b, B:195:0x0486] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:199:0x04a3  */
            /* JADX WARN: Removed duplicated region for block: B:283:0x0747  */
            /* JADX WARN: Removed duplicated region for block: B:294:0x0763  */
            /* JADX WARN: Removed duplicated region for block: B:304:0x079f A[EDGE_INSN: B:361:0x079f->B:304:0x079f BREAK  A[LOOP:0: B:131:0x035e->B:135:0x036e]] */
            /* JADX WARN: Removed duplicated region for block: B:306:0x07a3  */
            /* JADX WARN: Removed duplicated region for block: B:320:0x0803  */
            /* JADX WARN: Removed duplicated region for block: B:328:0x082a  */
            /* JADX WARN: Removed duplicated region for block: B:354:0x0468 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 2218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1333850koZ.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FrescoTraceListener@156d.onRequestSuccess$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FrescoTraceListener@156d.onRequestSuccess$1");
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0koX> r0 = r4.LIZ
            java.lang.Object r0 = r0.get(r5)
            X.0koX r0 = (X.C1333830koX) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            org.json.JSONObject r1 = r0.LIZJ
            if (r1 != 0) goto L10
            return
        L10:
            java.lang.String r0 = "image_monitor_data"
            org.json.JSONObject r2 = r1.optJSONObject(r0)     // Catch: org.json.JSONException -> L6f
            if (r2 == 0) goto L73
            java.lang.String r1 = "image_origin"
            r6.getClass()     // Catch: org.json.JSONException -> L6f
            int r0 = r6.hashCode()
            r3 = 1
            switch(r0) {
                case -1914072202: goto L61;
                case -1307634203: goto L57;
                case -1224383234: goto L4e;
                case 656304759: goto L44;
                case 957714404: goto L3b;
                case 1023071510: goto L31;
                case 2109593398: goto L27;
                default: goto L25;
            }
        L25:
            r3 = 7
            goto L6b
        L27:
            java.lang.String r0 = "PartialDiskCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L25
            r3 = 2
            goto L6b
        L31:
            java.lang.String r0 = "PostprocessedBitmapMemoryCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L25
            r3 = 6
            goto L6b
        L3b:
            java.lang.String r0 = "BitmapMemoryCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6a
            goto L25
        L44:
            java.lang.String r0 = "DiskCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L25
            r3 = 3
            goto L6b
        L4e:
            java.lang.String r0 = "NetworkFetchProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6b
            goto L25
        L57:
            java.lang.String r0 = "EncodedMemoryCacheProducer"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L25
            r3 = 4
            goto L6b
        L61:
            java.lang.String r0 = "BitmapMemoryCacheGetProducer"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L6a
            goto L25
        L6a:
            r3 = 5
        L6b:
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L6f
            return
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1333900koe.LJIIIZ(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // X.C1320270kSf
    public final void LJIIJJI(C1325710kbR c1325710kbR, String str, boolean z) {
        LIZJ.submit(new ARunnableS5S1100100_20(this, c1325710kbR, str, z, System.currentTimeMillis(), 2));
    }

    @Override // X.C1320270kSf, X.InterfaceC1325690kbP
    public final void LIZ(String str, Throwable th, String str2, Map map) {
        JSONObject jSONObject;
        long j;
        long j2;
        long j3;
        Map map2 = map;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1333830koX c1333830koX = this.LIZ.get(str);
        if (c1333830koX == null || (jSONObject = c1333830koX.LIZJ) == null) {
            return;
        }
        Map map3 = map2;
        if (map2 == null) {
            HashMap map4 = new HashMap();
            map4.put("image_size", "-1");
            map4.put("queue_time", "-1");
            map4.put("fetch_time", "-1");
            map3 = map4;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("image_monitor_data");
        if ("NetworkFetchProducer".equals(str2)) {
            try {
                jSONObject.put("fail_phase", "download");
                jSONObject.put("download_duration", -1);
                if (map3.get("mio_trace_id") != null) {
                    jSONObject.put("mio_trace_id", map3.get("mio_trace_id"));
                }
                String str3 = (String) map3.get("content_length");
                String str4 = (String) map3.get("image_size");
                String str5 = (String) map3.get("queue_time");
                if (!TextUtils.isEmpty(str3)) {
                    j = CastLongProtector.parseLong(str3);
                } else {
                    j = -1;
                }
                if (!TextUtils.isEmpty(str4)) {
                    j2 = CastLongProtector.parseLong(str4);
                } else {
                    j2 = -1;
                }
                if (!TextUtils.isEmpty(str5)) {
                    j3 = CastLongProtector.parseLong(str5);
                } else {
                    j3 = -1;
                }
                jSONObject.put("file_size", j2);
                jSONObject.put("content_length", j);
                jSONObject.put("queue_duration", j3);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } else if ("DecodeProducer".equals(str2)) {
            try {
                jSONObject.put("fail_phase", "decode");
                jSONObject.put("download_duration", map3.get("fetch_time"));
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.put("decode_queue_duration", CastLongProtector.parseLong((String) map3.get("queueTime")));
                }
                jSONObject.put("heic_sys_first", map3.get("heic_sys_first"));
                jSONObject.put("heic_custom_decoder", map3.get("heic_custom_decoder"));
            } catch (NumberFormatException e3) {
                TryCatchGuardChecker.doCheck(e3);
            } catch (JSONException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        StringBuilder sb = new StringBuilder(str);
        HashMap map5 = (HashMap) c1333830koX.LIZIZ;
        if (map5.isEmpty()) {
            return;
        }
        sb.append(str2);
        Long l = (Long) map5.remove(sb.toString());
        if (C1330620kjM.LJI) {
            String string = th.toString();
            String strK4 = C786410Ut5.k4(null, "time %d: onProducerFinishWithFailure: {requestId: %s, stage: %s, elapsedTime: %d ms, extraMap: %s, throwable: %s}", new Object[]{Long.valueOf(jCurrentTimeMillis), str, str2, Long.valueOf(LJIIL(jCurrentTimeMillis, l)), map3, string});
            if (LJIILL(string)) {
                if (AbstractC827810Wdf.LIZ != null) {
                    AbstractC827810Wdf.LIZ.getClass();
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("Fresco", strK4);
                }
            } else {
                AbstractC827810Wdf.LIZJ("Fresco", strK4, th);
            }
            C1328570kg3.LJI("Fresco", strK4, th);
        }
        if (jSONObjectOptJSONObject != null) {
            try {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str2);
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.put("producer_start", l.longValue() - Long.valueOf(c1333830koX.LIZ).longValue());
                    jSONObjectOptJSONObject2.put("producer_end", jCurrentTimeMillis - c1333830koX.LIZ);
                }
            } catch (JSONException e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
        }
    }

    @Override // X.C1320270kSf, X.InterfaceC1325670kbN
    public final void LJ(C1325710kbR c1325710kbR, String str, Throwable th, boolean z) {
        LIZJ.submit(new ARunnableS0S1300100_20(this, c1325710kbR, str, System.currentTimeMillis(), th, 0));
    }

    public static boolean LJIILJJIL(C1325710kbR c1325710kbR, String str, Object obj, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        List<InterfaceC589610NAp> list = C1330620kjM.LIZLLL;
        synchronized (list) {
            try {
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    Pair pairLIZ = ((InterfaceC589610NAp) it2.next()).LIZ(c1325710kbR, obj, jSONObject2, z, z3);
                    if (pairLIZ != null) {
                        if (!z2) {
                            z2 = ((Boolean) pairLIZ.first).booleanValue();
                        }
                        Map map = (Map) pairLIZ.second;
                        if (map != null) {
                            try {
                                for (String str2 : map.keySet()) {
                                    jSONObject.put(str2, map.get(str2));
                                }
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z2;
    }
}
