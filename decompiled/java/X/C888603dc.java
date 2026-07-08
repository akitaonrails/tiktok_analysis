package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PipoPreBindVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.StorePaymentMethodRespContent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C888603dc {
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final C888603dc LIZ = new C888603dc();
    public static final Map<String, Object> LJI = new LinkedHashMap();

    public static void LJ() {
        boolean zLJI = ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LJI();
        boolean z = C893003eK.LIZ().enable;
        String str = zLJI ? z ? "paypal_show" : "paypal_ab_not_enable" : z ? "paypal_sdk_not_ready" : "paypal_ab_not_enable_and_sdk_not_ready";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", str);
        LJIIJ(linkedHashMap);
    }

    public static void LIZIZ(C887503dR c887503dR) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", "step_enter");
        String str = c887503dR.LJFF;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("entrance", str);
        String str3 = c887503dR.LIZLLL;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("amount", str3);
        String str4 = c887503dR.LJ;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("agreement_id", str4);
        String str5 = c887503dR.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("region", str5);
        String str6 = c887503dR.LJI;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("seller_id", str6);
        String str7 = c887503dR.LIZ;
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("oec_user_id", str7);
        String str8 = c887503dR.LJFF;
        if (str8 != null) {
            str2 = str8;
        }
        linkedHashMap.put("entrance", str2);
        LJIIJ(linkedHashMap);
    }

    public static void LJIIJ(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(LJI);
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C1018703yb.LIZIZ("rd_pipo_tts_bind_card", linkedHashMap);
        C921903iz.LIZ.getClass();
        C921903iz.LIZIZ(4, linkedHashMap, "rd_pipo_tts_bind_card");
    }

    public static void LIZJ(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", str);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        LJIIJ(linkedHashMap);
    }

    public static void LIZ(C887503dR c887503dR, C893103eL c893103eL, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", c893103eL.LIZ.getValue());
        if (c887503dR == null || (str2 = c887503dR.LJFF) == null) {
            str2 = "";
        }
        linkedHashMap.put("entrance", str2);
        if (c887503dR == null || (str3 = c887503dR.LJ) == null) {
            str3 = "";
        }
        linkedHashMap.put("agreement_id", str3);
        LJIIJ(linkedHashMap);
        if (Intrinsics.LJFF(c893103eL.LIZ.getValue(), EnumC887103dN.SUCCESS.getValue())) {
            EnumC888403da enumC888403da = c893103eL.LIZIZ;
            if ((enumC888403da == EnumC888403da.NOT_MIT || enumC888403da == EnumC888403da.NEW_ADD) && enumC888403da != null) {
                if (enumC888403da == EnumC888403da.NEW_ADD) {
                    str4 = "ccdc_card_info";
                } else {
                    str4 = "ccdc_card_fill_cvv";
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("step", "bind_card_result");
                if (c887503dR == null || (str5 = c887503dR.LJFF) == null) {
                    str5 = "";
                }
                linkedHashMap2.put("entrance", str5);
                if (c887503dR == null || (str6 = c887503dR.LJ) == null) {
                    str6 = "";
                }
                linkedHashMap2.put("agreement_id", str6);
                linkedHashMap2.put("page_source", str4);
                linkedHashMap2.put("duration", Long.valueOf(jCurrentTimeMillis));
                if (c887503dR == null || (str7 = c887503dR.LJFF) == null) {
                    str7 = "";
                }
                linkedHashMap2.put("entrance", str7);
                if (str == null) {
                    str = "";
                }
                linkedHashMap2.put("payment_method_id", str);
                LIZ.getClass();
                LJIIJ(linkedHashMap2);
            }
        }
    }

    public static void LIZLLL(C887503dR c887503dR, String str, RedirectDetails redirectDetails) {
        String str2;
        String str3;
        Object objPut;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", "jump_to_3ds");
        String str4 = "";
        if (c887503dR == null || (str2 = c887503dR.LJFF) == null) {
            str2 = "";
        }
        linkedHashMap.put("entrance", str2);
        if (c887503dR == null || (str3 = c887503dR.LJ) == null) {
            str3 = "";
        }
        linkedHashMap.put("agreement_id", str3);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("payment_method_id", str);
        String str5 = redirectDetails.url;
        if (str5 != null) {
            str4 = str5;
        }
        linkedHashMap.put("redirect_url", str4);
        try {
            String str6 = redirectDetails.header;
            if (str6 != null) {
                objPut = linkedHashMap.put("is_3ds_new_flow", Integer.valueOf(Intrinsics.LJFF(new JSONObject(str6).optString("three_ds_del_mid_page"), "true") ? 1 : 0));
            } else {
                objPut = null;
            }
            C189200o6.m2constructorimpl(objPut);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        LJIIJ(linkedHashMap);
    }

    public static void LJII(C887503dR c887503dR, String str, Long l) {
        String str2;
        String str3;
        long jLongValue;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", "request_verify");
        linkedHashMap.put("result", str);
        String str5 = "";
        if (c887503dR == null || (str2 = c887503dR.LJFF) == null) {
            str2 = "";
        }
        linkedHashMap.put("entrance", str2);
        if (c887503dR == null || (str3 = c887503dR.LJ) == null) {
            str3 = "";
        }
        linkedHashMap.put("agreement_id", str3);
        if (c887503dR != null && (str4 = c887503dR.LIZ) != null) {
            str5 = str4;
        }
        linkedHashMap.put("oec_user_id", str5);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        linkedHashMap.put("duration", Long.valueOf(jLongValue));
        LJIIJ(linkedHashMap);
    }

    public static void LJFF(C887503dR c887503dR, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", "get_bind_status");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("result", str2);
        linkedHashMap.put("idempotency_key", str);
        if (c887503dR == null || (str4 = c887503dR.LJFF) == null) {
            str4 = "";
        }
        linkedHashMap.put("entrance", str4);
        if (c887503dR == null || (str5 = c887503dR.LJ) == null) {
            str5 = "";
        }
        linkedHashMap.put("agreement_id", str5);
        if (c887503dR == null || (str6 = c887503dR.LIZ) == null) {
            str6 = "";
        }
        linkedHashMap.put("oec_user_id", str6);
        linkedHashMap.put("duration", Long.valueOf(System.currentTimeMillis() - LJ));
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("payment_method_id", str3);
        LJIIJ(linkedHashMap);
    }

    public static void LJIIIIZZ(String str, C887503dR c887503dR, String str2, Map map) {
        String str3;
        String str4;
        String str5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", str);
        linkedHashMap.put("result", str2);
        String str6 = "";
        if (c887503dR == null || (str3 = c887503dR.LJFF) == null) {
            str3 = "";
        }
        linkedHashMap.put("entrance", str3);
        if (c887503dR == null || (str4 = c887503dR.LJ) == null) {
            str4 = "";
        }
        linkedHashMap.put("agreement_id", str4);
        if (c887503dR != null && (str5 = c887503dR.LIZ) != null) {
            str6 = str5;
        }
        linkedHashMap.put("oec_user_id", str6);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LJIIJ(linkedHashMap);
    }

    public static void LJIIIZ(C888603dc c888603dc, C887503dR c887503dR, String str, PipoPreBindVerifyData pipoPreBindVerifyData, String str2, int i) {
        String str3;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            pipoPreBindVerifyData = null;
        }
        c888603dc.getClass();
        if (str == null) {
            if (pipoPreBindVerifyData == null) {
                str = "error";
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str4 = pipoPreBindVerifyData.decision;
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap.put("decision", str4);
                String str6 = pipoPreBindVerifyData.orderId;
                if (str6 == null) {
                    str6 = "";
                }
                linkedHashMap.put("order_id", str6);
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put("payment_method_id", str2);
                linkedHashMap.put("duration", Long.valueOf(LIZLLL - LIZJ));
                if (c887503dR != null && (str3 = c887503dR.LJFF) != null) {
                    str5 = str3;
                }
                linkedHashMap.put("entrance", str5);
                LJIIIIZZ("request_pre_bind", c887503dR, "success", linkedHashMap);
                return;
            }
        }
        LJIIIIZZ("request_pre_bind", c887503dR, str, null);
    }

    public static void LJI(C888603dc c888603dc, C887503dR c887503dR, String str, String str2, StorePaymentMethodRespContent storePaymentMethodRespContent, String str3, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            storePaymentMethodRespContent = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        c888603dc.getClass();
        String str4 = "";
        try {
            if (str2 == null) {
                if (storePaymentMethodRespContent != null) {
                    String str5 = storePaymentMethodRespContent.resultCode;
                    if (str5 == null) {
                        str5 = "";
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap.put("payment_method_id", str3);
                    linkedHashMap.put("duration", Long.valueOf(LJ - LIZLLL));
                    String str6 = storePaymentMethodRespContent.errorCode;
                    if (str6 == null) {
                        str6 = "";
                    }
                    linkedHashMap.put("error_code", str6);
                    String str7 = storePaymentMethodRespContent.errorContent;
                    if (str7 == null) {
                        str7 = "";
                    }
                    linkedHashMap.put("error_content", str7);
                    String str8 = storePaymentMethodRespContent.errorMessage;
                    if (str8 != null) {
                        str4 = str8;
                    }
                    linkedHashMap.put("error_message", str4);
                    LJIIIIZZ("request_store_payment", c887503dR, str5, linkedHashMap);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return;
                }
                str2 = "error";
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (str == null) {
                str = "";
            }
            linkedHashMap2.put("idempotency_key", str);
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap2.put("payment_method_id", str3);
            long j = LJ;
            long j2 = LIZLLL;
            if (j > j2) {
                linkedHashMap2.put("duration", Long.valueOf(j - j2));
            }
            LJIIIIZZ("request_store_payment", c887503dR, str2, linkedHashMap2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
