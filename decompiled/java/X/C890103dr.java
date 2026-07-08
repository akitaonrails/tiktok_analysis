package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsAddCardRiskControlSettingSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03dr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C890103dr {
    public static final C890103dr LIZ = new C890103dr();
    public static String LIZIZ = "";
    public static final LinkedHashMap<String, Object> LIZJ = new LinkedHashMap<>();
    public static final Regex LIZLLL = new Regex("[^a-z0-9]+");
    public static final Map<String, Long> LJ = new LinkedHashMap();
    public static Integer LJFF;
    public static String LJI;
    public static String LJII;
    public static EnterParams LJIIIIZZ;
    public static String LJIIIZ;

    public static void LJIILJJIL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        linkedHashMap.put("popup_for", "quit_editing");
        linkedHashMap.put("popup_name", "quit_editing_ccdc");
        LJIJ("tiktokec_popup_show", linkedHashMap);
    }

    public static long LIZ(String str) {
        Map<String, Long> map = LJ;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            long jLongValue = l.longValue();
            map.remove(str);
            return SystemClock.elapsedRealtime() - jLongValue;
        }
        return 0L;
    }

    public static List LIZJ(PaymentMethod paymentMethod) {
        List<ElementDTO> listLJIIJJI;
        if (paymentMethod != null && (listLJIIJJI = paymentMethod.LJIIJJI()) != null) {
            ArrayList<ElementDTO> arrayList = new ArrayList();
            for (ElementDTO elementDTO : listLJIIJJI) {
                if (true ^ Intrinsics.LJFF(elementDTO.id, "eg_ccdc_global_cvv")) {
                    arrayList.add(elementDTO);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (ElementDTO elementDTO2 : arrayList) {
                C890103dr c890103dr = LIZ;
                String str = elementDTO2.paramName;
                c890103dr.getClass();
                arrayList2.add(LJIIZILJ(str));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() != 0) {
                    arrayList3.add(obj);
                }
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(java.lang.String r4) {
        /*
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = X.C890103dr.LIZJ
            r3.putAll(r0)
            java.lang.String r0 = "input_box_name"
            r3.put(r0, r4)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r2 = X.C890103dr.LJIIIIZZ
            if (r2 == 0) goto L2e
            boolean r0 = r2.LIZ
            if (r0 != 0) goto L74
            java.lang.String r1 = "full_screen"
        L19:
            java.lang.String r0 = "page_show_type"
            r3.put(r0, r1)
            java.lang.String r1 = "source_previous_page"
            java.lang.String r0 = "order_submit"
            r3.put(r1, r0)
            java.lang.String r1 = r2.LJI
            if (r1 == 0) goto L2e
            java.lang.String r0 = "trigger_event"
            r3.put(r0, r1)
        L2e:
            java.lang.String r0 = "tiktokec_input_click"
            LJIJ(r0, r3)
            if (r4 == 0) goto L3c
            int r0 = r4.hashCode()
            switch(r0) {
                case 98915: goto L69;
                case 3076014: goto L5e;
                case 578603864: goto L58;
                case 811667774: goto L4d;
                default: goto L3c;
            }
        L3c:
            java.lang.String r2 = "input_click_card_number"
        L3e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "action_type"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            LJIJI(r0)
            return
        L4d:
            java.lang.String r0 = "holder_name"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3c
            java.lang.String r2 = "input_click_holder_name"
            goto L3e
        L58:
            java.lang.String r0 = "card_number"
            r4.equals(r0)
            goto L3c
        L5e:
            java.lang.String r0 = "date"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3c
            java.lang.String r2 = "input_click_expiration_date"
            goto L3e
        L69:
            java.lang.String r0 = "cvv"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L3c
            java.lang.String r2 = "input_click_cvv"
            goto L3e
        L74:
            java.lang.String r1 = "seven_screen"
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C890103dr.LJIIIIZZ(java.lang.String):void");
    }

    public static void LJIILIIL(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        linkedHashMap.put("popup_for", "quit_editing");
        linkedHashMap.put("popup_name", "quit_editing_ccdc");
        linkedHashMap.put("action_type", str);
        LJIJ("tiktokec_popup_click", linkedHashMap);
    }

    public static String LJIIZILJ(String str) {
        if (!Intrinsics.LJFF(str, "expiration_date") && !Intrinsics.LJFF(str, "issue_date")) {
            if (str == null) {
                return "";
            }
            return str;
        }
        return "date";
    }

    public static void LJIJI(Map map) {
        if (PipoTtsAddCardRiskControlSettingSettings.LIZIZ) {
            C1018703yb.LIZIZ("rd_pipo_add_card_risk_info", C2097608Jq.LJIIL(C2097608Jq.LJIIL(LIZJ, map), C2097908Jt.LIZJ(new Pair("pipo_ts", Long.valueOf(System.currentTimeMillis())))));
        }
    }

    public static void LJIJJ(String str) {
        LJ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LJI(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        linkedHashMap.put("button_name", str);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LJIJ("tiktokec_button_show", linkedHashMap);
    }

    public static void LJIJ(String str, Map map) {
        C1018703yb.LIZIZ(str, map);
        C921903iz.LIZ.getClass();
        C921903iz.LIZIZ(4, map, str);
    }

    public static String LIZIZ(Context context, int i, String str) {
        String strLJLIL;
        String lowerCase;
        String strReplace;
        String string = null;
        if (context != null) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(Locale.ENGLISH);
            string = context.createConfigurationContext(configuration).getString(i);
        }
        if (string == null || (lowerCase = string.toLowerCase(Locale.US)) == null || (strReplace = LIZLLL.replace(lowerCase, "_")) == null || (strLJLIL = a0.LJLIL(strReplace, '_')) == null) {
            strLJLIL = "";
        }
        if (strLJLIL.length() != 0) {
            return strLJLIL;
        }
        return str;
    }

    public static void LIZLLL(EnterParams enterParams, String str, String str2, String str3) {
        HashMap<String, Object> map;
        int i;
        String str4;
        Object obj;
        HashMap<String, Object> map2;
        Object obj2;
        Address address = null;
        if (enterParams != null) {
            map = enterParams.trackParams;
        } else {
            map = null;
        }
        LJIIIIZZ = enterParams;
        LinkedHashMap<String, Object> linkedHashMap = LIZJ;
        linkedHashMap.clear();
        LJII = null;
        LIZIZ = "";
        if (enterParams != null) {
            address = enterParams.shippingAddress;
        }
        if (address == null) {
            i = 0;
        } else {
            i = 1;
        }
        LJFF = i;
        if (Intrinsics.LJFF(str, "ADD_NEW_CARD")) {
            str4 = "add";
        } else {
            str4 = "pay";
        }
        LJI = str4;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", str2);
        if (enterParams != null && (map2 = enterParams.trackParams) != null && (obj2 = map2.get("bind_source")) != null) {
            linkedHashMap.put("bind_source", obj2);
        }
        if (map != null) {
            Object obj3 = map.get("cashier_original_track_id");
            if (obj3 != null) {
                linkedHashMap.put("cashier_original_track_id", obj3.toString());
            }
            Object obj4 = map.get("rendering_num");
            if (obj4 != null) {
                linkedHashMap.put("rendering_num", obj4.toString());
            }
        }
        if (((str3 != null && str3.length() > 0) || (map != null && (obj = map.get("payment_method_id")) != null && (str3 = obj.toString()) != null)) && str3.length() > 0) {
            linkedHashMap.put("payment_method_id", str3);
        }
        Integer num = LJFF;
        if (num != null) {
            linkedHashMap.put("is_with_delivery_info", Integer.valueOf(num.intValue()));
        }
        String str5 = LJI;
        if (str5 != null) {
            linkedHashMap.put("fill_type", str5);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(long r5, java.lang.Boolean r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = X.C890103dr.LIZJ
            r4.putAll(r0)
            java.lang.String r3 = ""
            if (r8 != 0) goto L8f
            r1 = r3
        Lf:
            java.lang.String r0 = "input_box_name"
            r4.put(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "stay_time"
            r4.put(r2, r0)
            if (r9 != 0) goto L20
            r9 = r3
        L20:
            java.lang.String r0 = "input_method"
            r4.put(r0, r9)
            if (r7 == 0) goto L37
            r7.booleanValue()
            boolean r0 = r7.booleanValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_valid"
            r4.put(r0, r1)
        L37:
            java.lang.String r0 = "tiktokec_input_staytime"
            LJIJ(r0, r4)
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            if (r8 == 0) goto L48
            int r0 = r8.hashCode()
            switch(r0) {
                case 98915: goto L84;
                case 3076014: goto L79;
                case 578603864: goto L73;
                case 811667774: goto L68;
                default: goto L48;
            }
        L48:
            java.lang.String r4 = "input_result_card_number"
        L4a:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "action_type"
            r1.<init>(r0, r4)
            r0 = 0
            r3[r0] = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r2, r0)
            r0 = 1
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            LJIJI(r0)
            return
        L68:
            java.lang.String r0 = "holder_name"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r4 = "input_result_holder_name"
            goto L4a
        L73:
            java.lang.String r0 = "card_number"
            r8.equals(r0)
            goto L48
        L79:
            java.lang.String r0 = "date"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r4 = "input_result_expiration_date"
            goto L4a
        L84:
            java.lang.String r0 = "cvv"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r4 = "input_result_cvv"
            goto L4a
        L8f:
            r1 = r8
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C890103dr.LJIIJJI(long, java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    public static void LJIIIZ(Boolean bool, String str, String str2, String str3, boolean z) {
        int i;
        String strLIZ;
        String str4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        if (str != null) {
            linkedHashMap.put("option_name", str);
        }
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("is_valid", Integer.valueOf(i));
        if (str2 != null) {
            linkedHashMap.put("input_name", str2);
            linkedHashMap.put("input_box_name", str2);
        }
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("input_method", str3);
        if (bool != null) {
            strLIZ = C893803eS.LIZ(bool.booleanValue());
        } else {
            strLIZ = "-1";
        }
        linkedHashMap.put("if_same_with_last_auto_result", strLIZ);
        EnterParams enterParams = LJIIIIZZ;
        if (enterParams != null) {
            if (!enterParams.LIZ) {
                str4 = "full_screen";
            } else {
                str4 = "seven_screen";
            }
            linkedHashMap.put("page_show_type", str4);
            linkedHashMap.put("source_previous_page", "order_submit");
            String str5 = enterParams.LJI;
            if (str5 != null) {
                linkedHashMap.put("trigger_event", str5);
            }
        }
        LJIJ("tiktokec_input_result", linkedHashMap);
    }

    public static void LJIIJ(Boolean bool, String str, String str2, String str3, boolean z) {
        if (Intrinsics.LJFF(LIZIZ, str2)) {
            return;
        }
        LJIIIZ(bool, str, str2, str3, z);
        LJIIJJI(LIZ(str2), Boolean.valueOf(z), str2, "card_number_ocr");
    }

    public static void LJIIL(int i, String str, String str2, long j, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        linkedHashMap.put("quit_type", str);
        linkedHashMap.put("stay_time", Long.valueOf(j));
        linkedHashMap.put("ocr_mode", C893803eS.LIZIZ(i));
        if (str2 != null) {
            linkedHashMap.put("is_valid", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("if_same_with_last_auto_result", str3);
        }
        LJIJ("tiktokec_scan_result", linkedHashMap);
    }

    public static void LJIILL(long j, Boolean bool, String str, Integer num, String str2, boolean z, Map map) {
        IECommerceHostService iECommerceHostService;
        boolean z2;
        String name;
        String str3 = LJII;
        if (str3 == null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IActivityStackDependencyService iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                if (iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IActivityStackDependencyService.class.getName();
                if (iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                    name = iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                iECommerceHostService = iActivityStackDependencyServiceCreateIActivityStackDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            if (((IActivityStackDependencyService) iECommerceHostService).isAppBackGround()) {
                str3 = "close";
            } else {
                str3 = "return";
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        linkedHashMap.put("stay_time", String.valueOf(j));
        linkedHashMap.put("page_info", str2);
        linkedHashMap.put("is_complete", C893803eS.LIZ(z));
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_use_ocr", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            if (num != null) {
                num.intValue();
                linkedHashMap.put("ocr_mode", C893803eS.LIZIZ(num.intValue()));
            }
        }
        if (str != null) {
            linkedHashMap.put("is_edit_ocr_result", str);
        }
        linkedHashMap.put("quit_type", str3);
        linkedHashMap.put("is_load_data", 1);
        C038N.LIZ(linkedHashMap, map);
        LJIJ("tiktokec_stay_page", linkedHashMap);
        LJIJI(C2097608Jq.LJIIIIZZ(new Pair("stay_time", Long.valueOf(j)), new Pair("action_type", "stay_page")));
    }

    public static void LJFF(C890103dr c890103dr, String str, Map map, Boolean bool, String str2, Integer num, Map map2, Boolean bool2, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            map2 = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        c890103dr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        linkedHashMap.put("button_name", str);
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap.put("is_use_ocr", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            if (num != null) {
                num.intValue();
                linkedHashMap.put("ocr_mode", C893803eS.LIZIZ(num.intValue()));
            }
        }
        if (str2 != null) {
            linkedHashMap.put("is_edit_ocr_result", str2);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (bool2 != null) {
            linkedHashMap.put("is_recommended_tag", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        C038N.LIZ(linkedHashMap, map2);
        LJIJ("tiktokec_button_click", linkedHashMap);
    }
}
