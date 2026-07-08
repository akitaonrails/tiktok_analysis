package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ukK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715620ukK implements InterfaceC1709310ua9 {
    public final InterfaceC1715630ukL LIZ;
    public final ThreadLocal<Map<String, String>> LIZIZ;
    public Function2<? super String, ? super Map<String, String>, ? extends Pair<String, ? extends Map<String, String>>> LIZJ;

    public C1715620ukK() {
        this(null);
    }

    public C1715620ukK(InterfaceC1715630ukL interfaceC1715630ukL) {
        this.LIZ = interfaceC1715630ukL;
        this.LIZIZ = new ThreadLocal<>();
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJFF(C1708620uZ2 c1708620uZ2) {
        this.LIZJ = c1708620uZ2;
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJIIIIZZ(Map<String, String> map) throws JSONException {
        LIZ("rd_pipo_cashier_exception", map);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJIIIZ(Map<String, String> map) throws JSONException {
        LIZ("rd_pipo_general_debug", map);
    }

    @Override // X.InterfaceC1709310ua9
    public final void setExtraParams(Map<String, String> map) {
        this.LIZIZ.set(map);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LIZ(String str, Map<String, String> map) throws JSONException {
        Map<String, String> commonParams;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL != null && (commonParams = interfaceC1715630ukL.getCommonParams()) != null) {
            linkedHashMap.putAll(commonParams);
        }
        Map<String, String> map2 = this.LIZIZ.get();
        if (map2 != null) {
            linkedHashMap.putAll(map2);
            this.LIZIZ.set(null);
        }
        linkedHashMap.putAll(map);
        Function2<? super String, ? super Map<String, String>, ? extends Pair<String, ? extends Map<String, String>>> function2 = this.LIZJ;
        if (function2 != null) {
            Pair<String, ? extends Map<String, String>> pairInvoke = function2.invoke(str, linkedHashMap);
            if (pairInvoke != null) {
                String first = pairInvoke.getFirst();
                Map<String, String> second = pairInvoke.getSecond();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(second.size()));
                Iterator<T> it2 = second.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                C1713870uhV.LIZ(first, linkedHashMap2);
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
        }
        C1713870uhV.LIZ(str, linkedHashMap3);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LIZIZ(String str, Map<String, String> map) throws JSONException {
        String strLJII;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLJII = interfaceC1715630ukL.LJII()) == null) {
            strLJII = "rd_pipo_enter_page";
        }
        LIZ(strLJII, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJIILIIL(String str, Map map) throws JSONException {
        String strLIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("module_name", "payment_method");
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLIZIZ = interfaceC1715630ukL.LIZIZ()) == null) {
            strLIZIZ = "rd_pipo_module_show";
        }
        LIZ(strLIZIZ, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LIZJ(String str, String str2, Map<String, String> map) throws JSONException {
        String strLJFF;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("popup_name", str2);
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLJFF = interfaceC1715630ukL.LJFF()) == null) {
            strLJFF = "rd_pipo_popup_click";
        }
        LIZ(strLJFF, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LIZLLL(String str, String str2, Map<String, String> map) throws JSONException {
        String strLJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("input_box_name", str2);
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLJI = interfaceC1715630ukL.LJI()) == null) {
            strLJI = "rd_pipo_input_result";
        }
        LIZ(strLJI, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJI(String str, String str2, Map<String, String> map) throws JSONException {
        String strLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("input_box_name", str2);
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLIZ = interfaceC1715630ukL.LIZ()) == null) {
            strLIZ = "rd_pipo_input_click";
        }
        LIZ(strLIZ, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJIIJJI(String str, String str2, Map<String, String> map) throws JSONException {
        String strLJIIIIZZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("popup_name", str2);
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLJIIIIZZ = interfaceC1715630ukL.LJIIIIZZ()) == null) {
            strLJIIIIZZ = "rd_pipo_popup_show";
        }
        LIZ(strLJIIIIZZ, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJ(String str, String str2, Boolean bool, Map<String, String> map) throws JSONException {
        String strLJ;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("button_name", str2);
        if (bool != null) {
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_full_screen", str3);
        }
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLJ = interfaceC1715630ukL.LJ()) == null) {
            strLJ = "rd_pipo_button_show";
        }
        LIZ(strLJ, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJIIJ(long j, String str, Map map, String str2) throws JSONException {
        String strLIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("input_box_name", str2);
        linkedHashMap.put("stay_time", String.valueOf(j));
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLIZLLL = interfaceC1715630ukL.LIZLLL()) == null) {
            strLIZLLL = "rd_pipo_input_staytime";
        }
        LIZ(strLIZLLL, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJIIL(String str, String str2, Boolean bool, Map<String, String> map) throws JSONException {
        String strLIZJ;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("button_name", str2);
        if (bool != null) {
            if (bool.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_full_screen", str3);
        }
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLIZJ = interfaceC1715630ukL.LIZJ()) == null) {
            strLIZJ = "rd_pipo_button_click";
        }
        LIZ(strLIZJ, linkedHashMap);
    }

    @Override // X.InterfaceC1709310ua9
    public final void LJII(long j, String str, String str2, Map map, boolean z) throws JSONException {
        String str3;
        String strLJIIIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("stay_time", String.valueOf(j));
        linkedHashMap.put("quit_type", str2);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_load_data", str3);
        InterfaceC1715630ukL interfaceC1715630ukL = this.LIZ;
        if (interfaceC1715630ukL == null || (strLJIIIZ = interfaceC1715630ukL.LJIIIZ()) == null) {
            strLJIIIZ = "rd_pipo_stay_page";
        }
        LIZ(strLJIIIZ, linkedHashMap);
    }
}
