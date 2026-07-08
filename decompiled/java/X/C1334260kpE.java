package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kpE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.performance.mob.TakoImageLoadTracker$TakoImageLoadListener$sendImageMob$2", f = "TakoImageLoadTracker.kt", l = {}, m = "invokeSuspend")
public final class C1334260kpE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1334260kpE(boolean z, JSONObject jSONObject, String str, Map<String, String> map, boolean z2, InterfaceC1364105Vn<? super C1334260kpE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = jSONObject;
        this.LLILLL = str;
        this.LLILZ = map;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1334260kpE(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strOptString;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6;
        int i;
        JSONObject jSONObjectOptJSONObject;
        Long lValueOf4;
        Long lValueOf5;
        Long lValueOf6;
        Long lValueOf7;
        Long lValueOf8;
        Long lValueOf9;
        int i2;
        int i3;
        int i4;
        Integer numValueOf;
        String strOptString7;
        Long lValueOf10;
        String strOptString8;
        String strOptString9;
        String strOptString10;
        String strOptString11;
        String strOptString12;
        String strLJJLJ;
        String string;
        Integer numLJIIJJI;
        String strOptString13;
        Integer numValueOf2;
        String strOptString14;
        String strOptString15;
        String strOptString16;
        String strOptString17;
        String strOptString18;
        Long lValueOf11;
        String strOptString19;
        C1C7U.LIZ("TakoImageLoadTracker$TakoImageLoadListener@251c.sendImageMob$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1333890kod c1333890kod = C1333890kod.LIZ;
        boolean z = this.LL;
        JSONObject jSONObject = this.LLILLJJLI;
        String str = this.LLILLL;
        Map<String, String> map = this.LLILZ;
        boolean z2 = this.LLILZIL;
        c1333890kod.getClass();
        JSONObject jSONObject2 = new JSONObject();
        String strSubstring = null;
        if (jSONObject == null) {
            strOptString = null;
        } else {
            try {
                strOptString = jSONObject.optString("biz_tag");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        jSONObject2.put("biz_tag", strOptString);
        if (jSONObject == null) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(jSONObject.optLong("duration"));
        }
        jSONObject2.put("duration", lValueOf);
        if (jSONObject == null) {
            lValueOf2 = null;
        } else {
            lValueOf2 = Long.valueOf(jSONObject.optLong("decode_duration"));
        }
        jSONObject2.put("decode_duration", lValueOf2);
        if (jSONObject == null) {
            lValueOf3 = null;
        } else {
            lValueOf3 = Long.valueOf(jSONObject.optLong("queue_duration"));
        }
        jSONObject2.put("queue_duration", lValueOf3);
        if (jSONObject == null) {
            strOptString2 = null;
        } else {
            strOptString2 = jSONObject.optString("hit_cdn_cache");
        }
        jSONObject2.put("hit_cdn_cache", strOptString2);
        if (jSONObject == null) {
            strOptString3 = null;
        } else {
            strOptString3 = jSONObject.optString("fail_reason");
        }
        jSONObject2.put("fail_reason", strOptString3);
        if (jSONObject != null) {
            strOptString4 = jSONObject.optString("file_size");
        } else {
            strOptString4 = null;
        }
        jSONObject2.put("image_size", strOptString4);
        if (jSONObject == null) {
            strOptString5 = null;
        } else {
            strOptString5 = jSONObject.optString("image_type");
        }
        jSONObject2.put("image_type", strOptString5);
        if (jSONObject == null) {
            strOptString6 = null;
        } else {
            strOptString6 = jSONObject.optString("uri");
        }
        jSONObject2.put("image_url", strOptString6);
        int i5 = 1;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        jSONObject2.put("sub_biz_tag", str);
        if (jSONObject == null) {
            jSONObjectOptJSONObject = null;
        } else {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("net_timing_detail");
        }
        if (jSONObjectOptJSONObject != null) {
            lValueOf4 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_connect"));
        } else {
            lValueOf4 = null;
        }
        jSONObject2.put("connect_duration", lValueOf4);
        if (jSONObjectOptJSONObject != null) {
            lValueOf5 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_dns"));
        } else {
            lValueOf5 = null;
        }
        jSONObject2.put("dns_duration", lValueOf5);
        if (jSONObjectOptJSONObject != null) {
            lValueOf6 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_ssl"));
        } else {
            lValueOf6 = null;
        }
        jSONObject2.put("ssl_duration", lValueOf6);
        if (jSONObjectOptJSONObject != null) {
            lValueOf7 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_wait"));
        } else {
            lValueOf7 = null;
        }
        jSONObject2.put("wait_duration", lValueOf7);
        if (jSONObjectOptJSONObject != null) {
            lValueOf8 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_send"));
        } else {
            lValueOf8 = null;
        }
        jSONObject2.put("send_duration", lValueOf8);
        if (jSONObjectOptJSONObject != null) {
            lValueOf9 = Long.valueOf(jSONObjectOptJSONObject.optLong("timing_receive"));
        } else {
            lValueOf9 = null;
        }
        jSONObject2.put("receive_duration", lValueOf9);
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("timing_isCached")) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        jSONObject2.put("is_net_cached", i2);
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("timing_isFromProxy")) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        jSONObject2.put("is_from_proxy", i3);
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("timing_isSocketReused")) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        jSONObject2.put("is_socket_reused", i4);
        if (!z2) {
            i5 = 0;
        }
        jSONObject2.put("is_cache_sensible", i5);
        if (jSONObject != null) {
            numValueOf = Integer.valueOf(jSONObject.optInt("from"));
        } else {
            numValueOf = null;
        }
        jSONObject2.put("image_source", numValueOf);
        if (jSONObject == null) {
            strOptString7 = null;
        } else {
            strOptString7 = jSONObject.optString("nw-session-trace");
        }
        jSONObject2.put("nw_session_trace", strOptString7);
        if (jSONObject == null) {
            lValueOf10 = null;
        } else {
            lValueOf10 = Long.valueOf(jSONObject.optLong("download_duration"));
        }
        jSONObject2.put("download_duration", lValueOf10);
        if (jSONObject == null) {
            strOptString8 = null;
        } else {
            strOptString8 = jSONObject.optString("fail_phase");
        }
        jSONObject2.put("fail_phase", strOptString8);
        if (jSONObject == null) {
            strOptString9 = null;
        } else {
            strOptString9 = jSONObject.optString("err_code");
        }
        jSONObject2.put("err_code", strOptString9);
        if (jSONObject == null) {
            strOptString10 = null;
        } else {
            strOptString10 = jSONObject.optString("err_desc");
        }
        jSONObject2.put("err_desc", strOptString10);
        if (jSONObject == null) {
            strOptString11 = null;
        } else {
            strOptString11 = jSONObject.optString("scene_tag");
        }
        jSONObject2.put("scene_tag", strOptString11);
        if (!z2) {
            if (jSONObject != null) {
                strOptString13 = jSONObject.optString("MIOClient");
            } else {
                strOptString13 = null;
            }
            jSONObject2.put("client_type", strOptString13);
            if (jSONObject == null) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(jSONObject.optInt("http_status"));
            }
            jSONObject2.put("http_status", numValueOf2);
            if (jSONObject == null) {
                strOptString14 = null;
            } else {
                strOptString14 = jSONObject.optString("x_response_cache");
            }
            jSONObject2.put("x_response_cache", strOptString14);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (jSONObject != null) {
                strOptString15 = jSONObject.optString("imagex_want_fmt");
            } else {
                strOptString15 = null;
            }
            sbLIZ.append(strOptString15);
            sbLIZ.append(',');
            if (jSONObject == null) {
                strOptString16 = null;
            } else {
                strOptString16 = jSONObject.optString("imagex_true_fmt");
            }
            sbLIZ.append(strOptString16);
            jSONObject2.put("format_response", C2188811AlT.LIZIZ(sbLIZ));
            if (jSONObject == null) {
                strOptString17 = null;
            } else {
                strOptString17 = jSONObject.optString("extra_bitmap_config");
            }
            jSONObject2.put("extra_bitmap_config", strOptString17);
            if (jSONObject == null) {
                strOptString18 = null;
            } else {
                strOptString18 = jSONObject.optString("network_quality");
            }
            jSONObject2.put("network_quality", strOptString18);
            if (jSONObject == null) {
                lValueOf11 = null;
            } else {
                lValueOf11 = Long.valueOf(jSONObject.optLong("image_ram_size"));
            }
            jSONObject2.put("image_ram_size", lValueOf11);
            if (jSONObject != null && (strOptString19 = jSONObject.optString("uri")) != null) {
                int iLJJJ = a0.LJJJ(strOptString19, "://", 0, false, 6);
                if (iLJJJ != -1) {
                    int i6 = iLJJJ + 3;
                    int iLJJJ2 = a0.LJJJ(strOptString19, "/", i6, false, 4);
                    if (iLJJJ2 == -1) {
                        strSubstring = strOptString19.substring(i6);
                    } else {
                        strSubstring = strOptString19.substring(i6, iLJJJ2);
                    }
                }
                jSONObject2.put("domain", strSubstring);
            }
            C1333890kod.LIZ(jSONObject, jSONObject2);
        }
        if (jSONObject != null && (strOptString12 = jSONObject.optString("nw-session-trace")) != null && (strLJJLJ = a0.LJJLJ(' ', strOptString12, strOptString12)) != null && (string = a0.LJLIIIL(strLJJLJ).toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
            jSONObject2.put("image_x_cost", numLJIIJJI.intValue());
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (C123100dR.LIZ(entry.getValue())) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        ((Boolean) C287300BNw.LIZ.getValue()).booleanValue();
        AppLogNewUtils.onEventV3("tako_image_monitor", jSONObject2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageLoadTracker$TakoImageLoadListener@251c.sendImageMob$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
