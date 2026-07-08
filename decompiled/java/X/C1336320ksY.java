package X;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.image.LsLynxImageMonitorExp;
import com.ss.android.ugc.aweme.image.exp.LsResourcePreloadItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0ksY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336320ksY {
    public static final C1336320ksY LIZ = new C1336320ksY();
    public static final C603820NmG<Integer, Map<String, String>> LIZIZ = new C603820NmG<>(100);
    public static final C603820NmG<Integer, Map<String, String>> LIZJ = new C603820NmG<>(100);
    public static final C603820NmG<String, ConcurrentHashMap<String, String>> LIZLLL = new C603820NmG<>(100);
    public static final C603820NmG<String, Boolean> LJ = new C603820NmG<>(LSPassThroughRecordSizeConfig.DEFAULT);
    public static final C603820NmG<String, Boolean> LJFF = new C603820NmG<>(100);
    public static final int LJI;
    public static final Regex LJII;

    static {
        double d = C1BWL.LIZ().getResources().getDisplayMetrics().density;
        LJI = d <= 1.4d ? 1 : d <= 2.4d ? 2 : 3;
        LJII = new Regex(":q(\\d+)");
        C1186030gy9.LIZ(AFwS208S0000000_20.get$arr$(58));
        if (Intrinsics.LJFF(((LsLynxImageMonitorExp.Config) LsLynxImageMonitorExp.LIZIZ.getValue()).enable, Boolean.TRUE)) {
            C1330620kjM.LIZ(new InterfaceC589610NAp() { // from class: X.0hP1
                @Override // X.InterfaceC589610NAp
                public final Pair LIZ(C1325710kbR c1325710kbR, Object obj, JSONObject jSONObject, boolean z, boolean z2) {
                    String string;
                    Uri uri;
                    if (c1325710kbR == null || (uri = c1325710kbR.LIZIZ) == null || (string = uri.toString()) == null) {
                        string = "";
                    }
                    ConcurrentHashMap<String, String> concurrentHashMapLIZJ = C1336320ksY.LIZLLL.LIZJ(string);
                    if (concurrentHashMapLIZJ != null) {
                        C1336320ksY.LIZ.getClass();
                        C1336320ksY.LJI(concurrentHashMapLIZJ, jSONObject, z);
                    }
                    return new Pair(Boolean.FALSE, new LinkedHashMap());
                }
            });
        }
    }

    public static int LJ(String str) {
        int iIntValue;
        int iIntValue2 = 0;
        if (str == null) {
            return 0;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"x"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 2) {
            return 0;
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
        if (numLJIIJJI != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLJIIJJI2 = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
        if (numLJIIJJI2 != null) {
            iIntValue2 = numLJIIJJI2.intValue();
        }
        return iIntValue2 * iIntValue;
    }

    public static void LIZ(Uri uri, Map map) {
        String encodedPath = uri.getEncodedPath();
        if (encodedPath == null) {
            return;
        }
        String strLJJZ = a0.LJJZ(a0.LJJLIL(encodedPath, "tplv-", ""), "?", "");
        if (strLJJZ.length() == 0) {
            return;
        }
        int iLJJJ = a0.LJJJ(strLJJZ, "-", 0, false, 6);
        int iLJJJ2 = a0.LJJJ(strLJJZ, ":", 0, false, 6);
        int iLJJJ3 = a0.LJJJ(strLJJZ, e3.d, 0, false, 6);
        if (iLJJJ != -1 && iLJJJ3 != -1) {
            String strSubstring = strLJJZ.substring(0, iLJJJ);
            int i = iLJJJ + 1;
            if (iLJJJ2 == -1) {
                iLJJJ2 = iLJJJ3;
            }
            String strSubstring2 = strLJJZ.substring(i, iLJJJ2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tplv-");
            sbLIZ.append(strSubstring);
            sbLIZ.append('-');
            sbLIZ.append(strSubstring2);
            C2188811AlT.LIZIZ(sbLIZ);
            map.put("service_id", strSubstring);
            map.put("imagex_template_name", strSubstring2);
        }
    }

    public static void LIZIZ(JSONObject jSONObject, Map map) {
        JSONObject jSONObjectOptJSONObject;
        Number numberLIZ;
        String string;
        String str;
        String string2;
        Number numberLIZ2;
        Object obj;
        String string3;
        if (jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("request_log");
            int i = 0;
            if (strOptString != null && strOptString.length() != 0) {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("timing");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("detailed_duration");
                } else {
                    jSONObjectOptJSONObject = null;
                }
                if (jSONObjectOptJSONObject != null) {
                    Number numberLIZ3 = C1336340ksa.LIZ("dns", jSONObjectOptJSONObject);
                    if (numberLIZ3 != null) {
                        map.put("net_dns_duration", numberLIZ3.toString());
                    }
                    Number numberLIZ4 = C1336340ksa.LIZ("tcp", jSONObjectOptJSONObject);
                    if (numberLIZ4 != null) {
                        map.put("net_connect_duration", numberLIZ4.toString());
                    }
                    Number numberLIZ5 = C1336340ksa.LIZ("ssl", jSONObjectOptJSONObject);
                    if (numberLIZ5 != null) {
                        map.put("net_ssl_duration", numberLIZ5.toString());
                    }
                    Number numberLIZ6 = C1336340ksa.LIZ("send", jSONObjectOptJSONObject);
                    if (numberLIZ6 != null) {
                        map.put("net_send_duration", numberLIZ6.toString());
                    }
                    Number numberLIZ7 = C1336340ksa.LIZ("ttfb", jSONObjectOptJSONObject);
                    if (numberLIZ7 != null) {
                        map.put("net_ttfb_duration", numberLIZ7.toString());
                    }
                    Number numberLIZ8 = C1336340ksa.LIZ("body_recv", jSONObjectOptJSONObject);
                    if (numberLIZ8 != null) {
                        map.put("net_body_recv_duration", numberLIZ8.toString());
                    }
                    Number numberLIZ9 = C1336340ksa.LIZ("rtt", jSONObjectOptJSONObject);
                    if (numberLIZ9 != null) {
                        map.put("net_rtt_duration", numberLIZ9.toString());
                    }
                    Number numberLIZ10 = C1336340ksa.LIZ("edge", jSONObjectOptJSONObject);
                    if (numberLIZ10 != null) {
                        map.put("net_edge_duration", numberLIZ10.toString());
                    }
                    Number numberLIZ11 = C1336340ksa.LIZ("origin", jSONObjectOptJSONObject);
                    if (numberLIZ11 != null) {
                        map.put("net_origin_duration", numberLIZ11.toString());
                    }
                    Number numberLIZ12 = C1336340ksa.LIZ("inner", jSONObjectOptJSONObject);
                    if (numberLIZ12 != null) {
                        map.put("net_inner_duration", numberLIZ12.toString());
                    }
                    Number numberLIZ13 = C1336340ksa.LIZ("before_stream", jSONObjectOptJSONObject);
                    if (numberLIZ13 != null) {
                        map.put("net_before_stream_duration", numberLIZ13.toString());
                    } else {
                        numberLIZ13 = null;
                    }
                    Number numberLIZ14 = C1336340ksa.LIZ("create_stream", jSONObjectOptJSONObject);
                    if (numberLIZ14 != null) {
                        map.put("net_create_stream_duration", numberLIZ14.toString());
                    } else {
                        numberLIZ14 = null;
                    }
                    if (numberLIZ13 != null && numberLIZ14 != null) {
                        map.put("net_connect_duration_v2", String.valueOf(numberLIZ13.intValue() + numberLIZ14.intValue()));
                    }
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("base");
                if (jSONObjectOptJSONObject3 != null) {
                    Number numberLIZ15 = C1336340ksa.LIZ("load_state", jSONObjectOptJSONObject3);
                    if (numberLIZ15 != null) {
                        map.put("net_load_state", numberLIZ15.toString());
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("redirecting_list");
                    if (jSONArrayOptJSONArray != null && (obj = jSONArrayOptJSONArray.get(jSONArrayOptJSONArray.length() - 1)) != null && (string3 = obj.toString()) != null) {
                        map.put("net_redirect_host", string3);
                    }
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("dns");
                if (jSONObjectOptJSONObject4 != null && (numberLIZ2 = C1336340ksa.LIZ("source", jSONObjectOptJSONObject4)) != null) {
                    map.put("net_dns_source", numberLIZ2.toString());
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObject2.optJSONObject("socket");
                if (jSONObjectOptJSONObject5 != null) {
                    Object objOpt = jSONObjectOptJSONObject5.opt("remote");
                    if (objOpt != null && (string2 = objOpt.toString()) != null) {
                        map.put("net_remote_ip", string2);
                    }
                    if (jSONObjectOptJSONObject5.optBoolean("socket_reused")) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    map.put("net_is_socket_reused", str);
                    Number numberLIZ16 = C1336340ksa.LIZ("address_family", jSONObjectOptJSONObject5);
                    if (numberLIZ16 != null) {
                        map.put("net_address_family", numberLIZ16.toString());
                    }
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObject2.optJSONObject("nqe");
                if (jSONObjectOptJSONObject6 != null) {
                    Number numberLIZ17 = C1336340ksa.LIZ("real_net_type", jSONObjectOptJSONObject6);
                    if (numberLIZ17 != null) {
                        map.put("network_type", numberLIZ17.toString());
                    }
                    Object objOpt2 = jSONObjectOptJSONObject6.opt("pending_requests");
                    if (objOpt2 != null && (string = objOpt2.toString()) != null) {
                        map.put("net_pending_requests", string);
                    }
                }
                JSONObject jSONObjectOptJSONObject7 = jSONObject2.optJSONObject("response");
                if (jSONObjectOptJSONObject7 != null) {
                    Number numberLIZ18 = C1336340ksa.LIZ("connection_info", jSONObjectOptJSONObject7);
                    if (numberLIZ18 != null) {
                        map.put("net_connection_info", numberLIZ18.toString());
                    }
                    Number numberLIZ19 = C1336340ksa.LIZ("code", jSONObjectOptJSONObject7);
                    if (numberLIZ19 != null) {
                        map.put("net_http_code", numberLIZ19.toString());
                    }
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObject2.optJSONObject("quic");
                if (jSONObjectOptJSONObject8 != null && (numberLIZ = C1336340ksa.LIZ("race_result", jSONObjectOptJSONObject8)) != null) {
                    map.put("net_quic_race_result", numberLIZ.toString());
                }
                JSONObject jSONObjectOptJSONObject9 = jSONObject2.optJSONObject("ifconfig");
                if (jSONObjectOptJSONObject9 != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject9.optBoolean("ipv6_reachable");
                    boolean zOptBoolean2 = jSONObjectOptJSONObject9.optBoolean("ipv4_reachable");
                    if (zOptBoolean) {
                        if (!zOptBoolean2) {
                            i = 1;
                        }
                    } else if (zOptBoolean2) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                    map.put("net_dualstack_reachable", String.valueOf(i));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(String str, Map map) {
        MatchResult matchResultFind$default;
        List<String> listLIZ;
        String str2;
        Integer numLJIIJJI;
        if (str != null && str.length() != 0 && (matchResultFind$default = Regex.find$default(LJII, str, 0, 2, null)) != null && (listLIZ = matchResultFind$default.LIZ()) != null && (str2 = (String) C13LP.LJJJLZIJ(1, listLIZ)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
            map.put("q_value", String.valueOf(numLJIIJJI.intValue()));
        }
    }

    public static void LIZLLL(String str, Map map) {
        String str2;
        if (str != null) {
            map.put("image_url", str);
            Uri uri = UriProtector.parse(str);
            String path = uri.getPath();
            if (path != null) {
                map.put("path", path);
                LIZ.getClass();
                LIZJ(path, map);
            }
            String host = uri.getHost();
            if (host != null) {
                map.put("host", host);
            }
            if (!Intrinsics.LJFF(uri.getScheme(), "http") && !Intrinsics.LJFF(uri.getScheme(), "https")) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = "1";
            }
            map.put("is_http_url", str2);
            LIZ.getClass();
            LIZ(uri, map);
        }
    }

    public static void LJIIIIZZ(String str, Map map) {
        if (str == null || str.length() <= 0) {
            str = "location_image_monitor";
        }
        if (Intrinsics.LJFF(map.get("is_success"), CardStruct.IStatusCode.DEFAULT)) {
            C1186030gy9.LIZ(AFwS208S0000000_20.get$arr$(60));
            C20684815ws.LJIILLIIL("location_image_monitor_error", map);
        }
        String str2 = (String) map.get("scene_tag");
        if (str2 == null) {
            str2 = "";
        }
        boolean zLIZIZ = C1196170hEV.LIZIZ(str, str2, (String) map.get("page_tag"));
        C1186030gy9.LIZ(new AwS547S0100000_3(map, (Map<String, String>) 97));
        if (zLIZIZ) {
            C20684815ws.LJIILLIIL(str, map);
        }
    }

    public static void LJI(Map map, JSONObject jSONObject, boolean z) {
        Object objOpt;
        Object objOpt2;
        Object objOpt3;
        Object objOpt4;
        Object objOpt5;
        Object objOpt6;
        Object objOpt7;
        Object objOpt8;
        String str;
        Object objOpt9;
        String str2;
        Object objOpt10;
        String str3;
        String strLJJIFFI;
        Object objOpt11;
        JSONObject jSONObjectOptJSONObject;
        Object objOpt12;
        int iIntValue;
        Object objOpt13;
        Object objOpt14;
        String strSubstring;
        Number number;
        String str4;
        String str5;
        String str6;
        Number number2;
        String str7;
        Number number3;
        Number number4;
        Number number5;
        String str8 = null;
        if (jSONObject == null) {
            objOpt = null;
        } else {
            try {
                objOpt = jSONObject.opt("queue_duration");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if ((objOpt instanceof Number) && (number5 = (Number) objOpt) != null) {
            map.put("queue_duration", number5.toString());
        }
        if (jSONObject == null) {
            objOpt2 = null;
        } else {
            objOpt2 = jSONObject.opt("download_duration");
        }
        if ((objOpt2 instanceof Number) && (number4 = (Number) objOpt2) != null) {
            map.put("download_duration", number4.toString());
        }
        if (jSONObject == null) {
            objOpt3 = null;
        } else {
            objOpt3 = jSONObject.opt("decode_duration");
        }
        if ((objOpt3 instanceof Number) && (number3 = (Number) objOpt3) != null) {
            map.put("decode_duration", number3.toString());
        }
        if (jSONObject == null) {
            objOpt4 = null;
        } else {
            objOpt4 = jSONObject.opt("hit_cdn_cache");
        }
        if ((objOpt4 instanceof String) && (str7 = (String) objOpt4) != null) {
            map.put("hit_cdn_cache", str7);
        }
        if (jSONObject == null) {
            objOpt5 = null;
        } else {
            objOpt5 = jSONObject.opt("file_size");
        }
        if ((objOpt5 instanceof Number) && (number2 = (Number) objOpt5) != null) {
            map.put("file_size", number2.toString());
        }
        if (jSONObject == null) {
            objOpt6 = null;
        } else {
            objOpt6 = jSONObject.opt("image_type");
        }
        if ((objOpt6 instanceof String) && (str6 = (String) objOpt6) != null) {
            map.put("codeType", str6);
        }
        if (jSONObject == null) {
            objOpt7 = null;
        } else {
            objOpt7 = jSONObject.opt("image_ram_size");
        }
        if ((objOpt7 instanceof String) && (str5 = (String) objOpt7) != null) {
            map.put("memory_size", str5);
        }
        if (jSONObject == null) {
            objOpt8 = null;
        } else {
            objOpt8 = jSONObject.opt("intended_image_size");
        }
        if (objOpt8 instanceof String) {
            str = (String) objOpt8;
            if (str != null) {
                map.put("request_image_size_v2", str);
            }
        } else {
            str = null;
        }
        int iLJ = LJ(str);
        if (iLJ > 0) {
            map.put("request_image_size", String.valueOf(iLJ));
        }
        if (jSONObject == null) {
            objOpt9 = null;
        } else {
            objOpt9 = jSONObject.opt("applied_image_size");
        }
        if (objOpt9 instanceof String) {
            str2 = (String) objOpt9;
            if (str2 != null) {
                map.put("original_image_size_v2", str2);
            }
        } else {
            str2 = null;
        }
        int iLJ2 = LJ(str2);
        if (iLJ2 > 0) {
            map.put("original_image_size", String.valueOf(iLJ2));
        }
        if (jSONObject == null) {
            objOpt10 = null;
        } else {
            objOpt10 = jSONObject.opt("view_size");
        }
        if (objOpt10 instanceof String) {
            str3 = (String) objOpt10;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            strLJJIFFI = null;
        } else {
            strLJJIFFI = u.LJJIFFI(str3, "*", "x", false);
            if (strLJJIFFI != null) {
                map.put("view_size_v2", strLJJIFFI);
            }
        }
        int iLJ3 = LJ(strLJJIFFI);
        if (iLJ3 > 0) {
            map.put("view_size", String.valueOf(iLJ3));
        }
        if (iLJ2 > 0 && iLJ3 > 0) {
            map.put("image_size_diff", String.valueOf(iLJ2 / iLJ3));
        }
        if (jSONObject == null) {
            objOpt11 = null;
        } else {
            objOpt11 = jSONObject.opt("sr_status");
        }
        if ((objOpt11 instanceof String) && (str4 = (String) objOpt11) != null) {
            map.put("sr_status", str4);
        }
        if (jSONObject == null) {
            jSONObjectOptJSONObject = null;
        } else {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("net_timing_detail");
        }
        LIZIZ(jSONObjectOptJSONObject, map);
        if (!z) {
            if (jSONObject == null) {
                objOpt12 = null;
            } else {
                objOpt12 = jSONObject.opt("err_code");
            }
            if ((objOpt12 instanceof Number) && (number = (Number) objOpt12) != null) {
                iIntValue = number.intValue();
            } else {
                iIntValue = -1;
            }
            map.put("error_code", String.valueOf(iIntValue));
            if (jSONObject == null) {
                objOpt13 = null;
            } else {
                objOpt13 = jSONObject.opt("err_desc");
            }
            if ((objOpt13 instanceof String) && (strSubstring = (String) objOpt13) != null) {
                LIZ.getClass();
                if (strSubstring.length() > 500) {
                    strSubstring = strSubstring.substring(0, 500);
                }
                map.put("error_msg", strSubstring);
            }
            if (jSONObject == null) {
                objOpt14 = null;
            } else {
                objOpt14 = jSONObject.opt("uri");
            }
            if (objOpt14 instanceof String) {
                str8 = (String) objOpt14;
            }
            LIZLLL(str8, map);
        }
    }

    public static void LJII(String str, String str2, LsResourcePreloadItemModel lsResourcePreloadItemModel, String str3) {
        String str4;
        LJ.LIZLLL(str, Boolean.TRUE);
        if (C1196170hEV.LIZIZ("location_image_preload", str2, str3)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1189060h32.LJJ("api", str2, linkedHashMap);
            C1189060h32.LJJ("instance_id", str3, linkedHashMap);
            C1189060h32.LJJ("url", str, linkedHashMap);
            String str5 = null;
            if (lsResourcePreloadItemModel != null) {
                str4 = lsResourcePreloadItemModel.pageTag;
            } else {
                str4 = null;
            }
            C1189060h32.LJJ("page_tag", str4, linkedHashMap);
            if (lsResourcePreloadItemModel != null) {
                str5 = lsResourcePreloadItemModel.sceneTag;
            }
            C1189060h32.LJJ("scene_tag", str5, linkedHashMap);
            C20684815ws.LJIILLIIL("location_image_preload", linkedHashMap);
        }
    }

    public static void LJFF(C1336320ksY c1336320ksY, boolean z, C1325710kbR c1325710kbR, long j, Map map, String str, int i, int i2, String str2, String str3, Integer num, int i3) {
        Object obj;
        String str4;
        Object obj2;
        String str5;
        Object obj3;
        Object obj4;
        Object obj5;
        int iIntValue;
        int iIntValue2;
        Uri uri;
        String path;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        String strSubstring = str3;
        int i4 = i2;
        int i5 = i;
        int i6 = 0;
        if ((i3 & 32) != 0) {
            i5 = 0;
        }
        if ((i3 & 64) != 0) {
            i4 = 0;
        }
        if ((i3 & 256) != 0) {
            strSubstring = null;
        }
        if ((i3 & 1024) != 0) {
            num = null;
        }
        c1336320ksY.getClass();
        if (c1325710kbR != null) {
            try {
                Uri uri2 = c1325710kbR.LIZIZ;
                String string = uri2.toString();
                ConcurrentHashMap concurrentHashMapLJ = LIZLLL.LJ(string);
                if (concurrentHashMapLJ != null) {
                    C1186030gy9.LIZ(new AwS87S1000000_2(string, 16));
                    if (map == null) {
                        obj = null;
                    } else {
                        obj = map.get("page_tag");
                    }
                    if (obj instanceof String) {
                        str4 = (String) obj;
                    } else {
                        str4 = null;
                    }
                    if (map == null) {
                        obj2 = null;
                    } else {
                        obj2 = map.get("scene_tag");
                    }
                    if (obj2 instanceof String) {
                        str5 = (String) obj2;
                    } else {
                        str5 = null;
                    }
                    if (str4 != null && str4.length() != 0 && str5 != null && str5.length() != 0) {
                        concurrentHashMapLJ.put("page_tag", str4);
                        concurrentHashMapLJ.put("scene_tag", str5);
                        concurrentHashMapLJ.put("dpr", String.valueOf(LJI));
                        String str6 = CardStruct.IStatusCode.DEFAULT;
                        if (z) {
                            obj3 = "1";
                        } else {
                            obj3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        concurrentHashMapLJ.put("is_success", obj3);
                        C603820NmG<String, Boolean> c603820NmG = LJ;
                        if (c603820NmG.LIZJ(string) != null) {
                            c603820NmG.LJ(string);
                            obj4 = "1";
                        } else {
                            obj4 = CardStruct.IStatusCode.DEFAULT;
                        }
                        concurrentHashMapLJ.put("is_preload", obj4);
                        C603820NmG<String, Boolean> c603820NmG2 = LJFF;
                        if (c603820NmG2.LIZJ(string) != null) {
                            c603820NmG2.LJ(string);
                            obj5 = "1";
                        } else {
                            obj5 = CardStruct.IStatusCode.DEFAULT;
                        }
                        concurrentHashMapLJ.put("handler_opt", obj5);
                        if (!z) {
                            if (strSubstring != null) {
                                LIZ.getClass();
                                if (strSubstring.length() > 500) {
                                    strSubstring = strSubstring.substring(0, 500);
                                }
                                concurrentHashMapLJ.put("error_msg", strSubstring);
                            }
                            if (num != null) {
                                concurrentHashMapLJ.put("error_code", String.valueOf(num.intValue()));
                            }
                        }
                        if (j > 0) {
                            concurrentHashMapLJ.put("total_duration", String.valueOf(j));
                            concurrentHashMapLJ.put("overall_duration", String.valueOf(j));
                        }
                        int i7 = i5 * i4;
                        if (i7 > 0) {
                            concurrentHashMapLJ.put("view_size", String.valueOf(i7));
                            StringBuilder sb = new StringBuilder();
                            sb.append(i5);
                            sb.append('x');
                            sb.append(i4);
                            concurrentHashMapLJ.put("view_size_v2", sb.toString());
                            String str7 = (String) concurrentHashMapLJ.get("original_image_size");
                            if (str7 != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str7)) != null) {
                                concurrentHashMapLJ.put("image_size_diff", String.valueOf(numLJIIJJI3.intValue() / i7));
                            }
                        }
                        String str8 = (String) concurrentHashMapLJ.get("download_duration");
                        if (str8 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str8)) != null) {
                            iIntValue = numLJIIJJI2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        String str9 = (String) concurrentHashMapLJ.get("decode_duration");
                        if (str9 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str9)) != null) {
                            iIntValue2 = numLJIIJJI.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (iIntValue <= 0) {
                            if (iIntValue2 > 0) {
                                i6 = 2;
                            } else {
                                i6 = 1;
                            }
                        }
                        concurrentHashMapLJ.put("from", String.valueOf(i6));
                        concurrentHashMapLJ.put("page_state", str2);
                        concurrentHashMapLJ.put("image_url", string);
                        String path2 = uri2.getPath();
                        String str10 = "";
                        if (path2 == null) {
                            path2 = "";
                        }
                        concurrentHashMapLJ.put("path", path2);
                        LIZJ(uri2.getPath(), concurrentHashMapLJ);
                        String host = uri2.getHost();
                        if (host != null) {
                            str10 = host;
                        }
                        concurrentHashMapLJ.put("host", str10);
                        if (Intrinsics.LJFF(uri2.getScheme(), "http") || Intrinsics.LJFF(uri2.getScheme(), "https")) {
                            str6 = "1";
                        }
                        concurrentHashMapLJ.put("is_http_url", str6);
                        LIZ(uri2, concurrentHashMapLJ);
                        if (str != null && (uri = UriProtector.parse(str)) != null && (path = uri.getPath()) != null) {
                            concurrentHashMapLJ.put("template_path", path);
                        }
                        for (Map.Entry entry : map.entrySet()) {
                            concurrentHashMapLJ.put(entry.getKey(), entry.getValue().toString());
                        }
                        LJIIIIZZ(null, concurrentHashMapLJ);
                        return;
                    }
                    C1186030gy9.LIZ(AFwS208S0000000_20.get$arr$(59));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
