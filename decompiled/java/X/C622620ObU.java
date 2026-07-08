package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ObU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622620ObU {
    public static final Map<String, InterfaceC1602960roc> LIZ = new LinkedHashMap();

    public static void LIZIZ(String str) {
        if (AbstractC19994813Le.Default.nextInt(100) < ((Number) C264200AXa.LIZ.getValue()).intValue()) {
            Map<String, InterfaceC1602960roc> map = LIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(str) == null) {
                return;
            }
            InterfaceC1602960roc interfaceC1602960roc = (InterfaceC1602960roc) linkedHashMap.get(str);
            if (interfaceC1602960roc != null) {
                interfaceC1602960roc.stop();
            }
            map.put(str, null);
        }
    }

    public static void LIZ(String str, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        if (AbstractC19994813Le.Default.nextInt(100) < ((Number) C264200AXa.LIZ.getValue()).intValue()) {
            InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ(str, false);
            interfaceC1602960rocLIZ.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
            LIZ.put(str, interfaceC1602960rocLIZ);
        }
    }
}
