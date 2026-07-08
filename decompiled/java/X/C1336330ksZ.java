package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.network.EcomNetworkInterceptorSwitch;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ksZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336330ksZ {
    public static final String LIZ(C0X52<?> c0x52) {
        List<C080U> listLIZIZ;
        String str;
        C2175508fh c2175508fh = c0x52.LIZ;
        if (c2175508fh != null) {
            listLIZIZ = c2175508fh.LIZIZ("X-Tt-Logid");
        } else {
            listLIZIZ = null;
        }
        if (listLIZIZ == null || listLIZIZ.size() <= 0 || (str = ((C080U) ListProtector.get(listLIZIZ, 0)).LIZIZ) == null) {
            return "";
        }
        return str;
    }

    public static final Map<String, Object> LIZIZ(String str) {
        JSONObject jSONObjectOptJSONObject;
        Number numberLIZJ;
        Integer numValueOf;
        JSONObject jSONObjectOptJSONObject2;
        Integer numValueOf2;
        Object objOpt;
        String string;
        Object objOpt2;
        String string2;
        Number numberLIZJ2;
        Number numberLIZJ3;
        String string3;
        Number numberLIZJ4;
        int iIntValue;
        Integer numValueOf3;
        int iIntValue2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("timing");
            Unit unit = null;
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("detailed_duration");
            } else {
                jSONObjectOptJSONObject = null;
            }
            int i = 0;
            if (jSONObjectOptJSONObject != null) {
                Number numberLIZJ5 = LIZJ("rtt", jSONObjectOptJSONObject);
                if (numberLIZJ5 != null) {
                    linkedHashMap.put("rtt_cost", numberLIZJ5);
                }
                Number numberLIZJ6 = LIZJ("edge", jSONObjectOptJSONObject);
                if (numberLIZJ6 != null) {
                    linkedHashMap.put("edge_cost", numberLIZJ6);
                }
                Number numberLIZJ7 = LIZJ("origin", jSONObjectOptJSONObject);
                if (numberLIZJ7 != null) {
                    linkedHashMap.put("origin_cost", numberLIZJ7);
                }
                Number numberLIZJ8 = LIZJ("inner", jSONObjectOptJSONObject);
                if (numberLIZJ8 != null) {
                    linkedHashMap.put("inner_cost", numberLIZJ8);
                }
                Number numberLIZJ9 = LIZJ("before_stream", jSONObjectOptJSONObject);
                if (numberLIZJ9 != null) {
                    linkedHashMap.put("before_stream_cost", numberLIZJ9);
                } else {
                    numberLIZJ9 = null;
                }
                Number numberLIZJ10 = LIZJ("create_stream", jSONObjectOptJSONObject);
                if (numberLIZJ10 != null) {
                    linkedHashMap.put("create_stream_cost", numberLIZJ10);
                } else {
                    numberLIZJ10 = null;
                }
                if (numberLIZJ9 != null) {
                    try {
                        iIntValue = numberLIZJ9.intValue();
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        numValueOf3 = null;
                    }
                } else {
                    iIntValue = 0;
                }
                if (numberLIZJ10 == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = numberLIZJ10.intValue();
                }
                numValueOf3 = Integer.valueOf(iIntValue + iIntValue2);
                if (numValueOf3 != null) {
                    linkedHashMap.put("connect_cost_v2", Integer.valueOf(numValueOf3.intValue()));
                }
                Number numberLIZJ11 = LIZJ("oec_callback", jSONObjectOptJSONObject);
                if (numberLIZJ11 != null) {
                    linkedHashMap.put("oec_callback", numberLIZJ11);
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("dns");
            if (jSONObjectOptJSONObject4 != null && (numberLIZJ4 = LIZJ("source", jSONObjectOptJSONObject4)) != null) {
                linkedHashMap.put("dns_source", numberLIZJ4);
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("base");
            if (jSONObjectOptJSONObject5 != null) {
                Number numberLIZJ12 = LIZJ("load_state", jSONObjectOptJSONObject5);
                if (numberLIZJ12 != null) {
                    linkedHashMap.put("load_state", numberLIZJ12);
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("redirecting_list");
                if (jSONArrayOptJSONArray != null) {
                    Object obj = jSONArrayOptJSONArray.get(jSONArrayOptJSONArray.length() - 1);
                    if (obj != null) {
                        string3 = obj.toString();
                    } else {
                        string3 = null;
                    }
                    if (string3 != null) {
                        linkedHashMap.put("redirect_host", string3);
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("socket");
            if (jSONObjectOptJSONObject6 != null && (numberLIZJ3 = LIZJ("address_family", jSONObjectOptJSONObject6)) != null) {
                linkedHashMap.put("address_family", numberLIZJ3);
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("source_stream");
            if (jSONObjectOptJSONObject7 != null && (numberLIZJ2 = LIZJ("raw_bytes", jSONObjectOptJSONObject7)) != null) {
                linkedHashMap.put("raw_byte", numberLIZJ2);
            }
            JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("nqe");
            if (jSONObjectOptJSONObject8 != null) {
                Number numberLIZJ13 = LIZJ("real_net_type", jSONObjectOptJSONObject8);
                if (numberLIZJ13 != null) {
                    linkedHashMap.put("network_type", numberLIZJ13);
                }
                try {
                    try {
                        objOpt2 = jSONObjectOptJSONObject8.opt("pending_requests");
                    } catch (CancellationException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw e2;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                if (objOpt2 != null && (string2 = objOpt2.toString()) != null) {
                    numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(string2));
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue3 = numValueOf.intValue();
                    linkedHashMap.put("pending_requests", Integer.valueOf(iIntValue3));
                    C1506030pIH.LIZLLL = Integer.valueOf(iIntValue3);
                }
                if (!((Boolean) C269650AhX.LIZ.getValue()).booleanValue() && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject8.optJSONObject("req_start")) != null) {
                    try {
                        objOpt = jSONObjectOptJSONObject2.opt("pending_reqs");
                    } catch (CancellationException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        throw e3;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                    if (objOpt != null && (string = objOpt.toString()) != null) {
                        numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(string));
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        linkedHashMap.put("req_start_pending_reqs", Integer.valueOf(numValueOf2.intValue()));
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("response");
            if (jSONObjectOptJSONObject9 != null) {
                Number numberLIZJ14 = LIZJ("connection_info", jSONObjectOptJSONObject9);
                if (numberLIZJ14 != null) {
                    linkedHashMap.put("connection_info", numberLIZJ14);
                }
                Number numberLIZJ15 = LIZJ("code", jSONObjectOptJSONObject9);
                if (numberLIZJ15 != null) {
                    linkedHashMap.put("http_status_code", numberLIZJ15);
                }
            }
            JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("quic");
            if (jSONObjectOptJSONObject10 != null && (numberLIZJ = LIZJ("race_result", jSONObjectOptJSONObject10)) != null) {
                linkedHashMap.put("quic_race_result", numberLIZJ);
            }
            JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("ifconfig");
            if (jSONObjectOptJSONObject11 != null) {
                boolean zOptBoolean = jSONObjectOptJSONObject11.optBoolean("ipv6_reachable");
                boolean zOptBoolean2 = jSONObjectOptJSONObject11.optBoolean("ipv4_reachable");
                if (!zOptBoolean || !zOptBoolean2) {
                    if (zOptBoolean) {
                        i = 1;
                    } else if (zOptBoolean2) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                }
                linkedHashMap.put("dualstack_reachable", Integer.valueOf(i));
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return linkedHashMap;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            C189200o6.m2constructorimpl(new C098200Yq(th4));
            return linkedHashMap;
        }
    }

    public static final Number LIZJ(String str, JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof Number)) {
            return (Number) objOpt;
        }
        return null;
    }

    public static final boolean LIZLLL(String str, String str2) {
        if (str != null) {
            EcomNetworkInterceptorSwitch.EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel = EcomNetworkInterceptorSwitch.LIZ;
            if (EcomNetworkInterceptorSwitch.LIZIZ.contains(str)) {
                return true;
            }
        }
        if (str2 != null) {
            EcomNetworkInterceptorSwitch.EcomNetworkInterceptorSwitchModel ecomNetworkInterceptorSwitchModel2 = EcomNetworkInterceptorSwitch.LIZ;
            if (EcomNetworkInterceptorSwitch.LIZJ.contains(str2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
