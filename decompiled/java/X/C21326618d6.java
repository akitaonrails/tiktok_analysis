package X;

import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import java.util.Map;

/* JADX INFO: renamed from: X.18d6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21326618d6 {
    public final synchronized void LIZJ() {
    }

    public static void LIZIZ(C21325918cz c21325918cz, MynaTemplateProtocol mynaTemplateProtocol) {
        Map<String, ? extends Object> i18n;
        Object obj;
        Map map;
        C1549310qQ5 c1549310qQ5;
        Map<String, C1549300qQ4> map2;
        Map<String, C1549300qQ4> map3;
        C1549300qQ4 c1549300qQ4;
        Map<String, String> map4;
        Object value;
        Map<String, C1549300qQ4> map5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c21325918cz.LIZ.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(c21325918cz.LJIIJJI());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c21325918cz.LIZ.LIZJ.LIZIZ.put("i18nService", new InterfaceC826680Wbq() { // from class: X.18dE
            @Override // X.InterfaceC826680Wbq
            public final String LIZIZ() {
                C1168270gVV.LIZ.getClass();
                InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
                if (interfaceC1168280gVW != null) {
                    return interfaceC1168280gVW.LIZLLL();
                }
                return null;
            }

            @Override // X.InterfaceC826680Wbq
            public final String LIZ(String str) {
                String strLIZLLL;
                String str2 = strLIZIZ;
                C1168270gVV.LIZ.getClass();
                InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
                if (interfaceC1168280gVW == null || (strLIZLLL = interfaceC1168280gVW.LIZLLL()) == null) {
                    strLIZLLL = "en-us";
                }
                return C1549280qQ2.LIZ(str2, strLIZLLL, str);
            }
        });
        if (mynaTemplateProtocol != null) {
            i18n = mynaTemplateProtocol.getI18n();
            if (i18n != null && (obj = i18n.get("default")) != null && (obj instanceof Map) && (map = (Map) obj) != null) {
                C1549290qQ3 c1549290qQ3 = C1549280qQ2.LIZ;
                if (c1549290qQ3.LIZ.get(strLIZIZ) == null) {
                    c1549290qQ3.LIZ.put(strLIZIZ, new C1549310qQ5(null));
                }
                C1549310qQ5 c1549310qQ52 = c1549290qQ3.LIZ.get(strLIZIZ);
                if ((c1549310qQ52 == null || (map5 = c1549310qQ52.LIZ) == null || map5.get("en") == null) && (c1549310qQ5 = c1549290qQ3.LIZ.get(strLIZIZ)) != null && (map2 = c1549310qQ5.LIZ) != null) {
                    map2.put("en", new C1549300qQ4(null));
                }
                C1549310qQ5 c1549310qQ53 = c1549290qQ3.LIZ.get(strLIZIZ);
                if (c1549310qQ53 != null && (map3 = c1549310qQ53.LIZ) != null && (c1549300qQ4 = map3.get("en")) != null && (map4 = c1549300qQ4.LIZ) != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!map4.containsKey(entry.getKey()) && (value = entry.getValue()) != null) {
                            map4.put((String) entry.getKey(), (String) value);
                        }
                    }
                }
            }
        } else {
            i18n = null;
        }
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
        if (interfaceC1168280gVW != null) {
            interfaceC1168280gVW.LJ(strLIZIZ, i18n);
        }
    }

    public static C21326518d5 LIZ(C21326718d7 c21326718d7, MynaTemplateProtocol mynaTemplateProtocol, C1774720wHe c1774720wHe) {
        String type;
        boolean zLIZIZ = C1168320gVa.LIZIZ();
        C21325918cz c21325918cz = new C21325918cz(c21326718d7, c1774720wHe);
        boolean z = !zLIZIZ;
        c21325918cz.LJFF = z;
        c21325918cz.LJI = z;
        c21325918cz.LJII = mynaTemplateProtocol;
        LIZIZ(c21325918cz, mynaTemplateProtocol);
        MynaElement uiInfo = mynaTemplateProtocol.getUiInfo();
        C21327718dH c21327718dH = new C21327718dH(c21326718d7, c1774720wHe.LIZ, 6);
        c21327718dH.LLILLJJLI = c21326718d7.LJIL;
        c21327718dH.LLILLL = c21326718d7.LJJI;
        if (uiInfo != null) {
            type = uiInfo.getType();
        } else {
            type = null;
        }
        AbstractC21333318eB<?> abstractC21333318eBLIZIZ = c21325918cz.LIZIZ(type, true, false);
        c21325918cz.LJIIIZ = abstractC21333318eBLIZIZ;
        c21327718dH.setRootViewManager$myna_render_release(abstractC21333318eBLIZIZ);
        abstractC21333318eBLIZIZ.LJJJJJ(uiInfo);
        c21325918cz.LJFF = false;
        C21326518d5 c21326518d5 = new C21326518d5(c21325918cz, c21327718dH);
        c21326518d5.LJFF = EnumC21327118dB.LLILLL;
        return c21326518d5;
    }
}
