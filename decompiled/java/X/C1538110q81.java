package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538110q81 {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public static void LIZ(InterfaceC1541990qEH interfaceC1541990qEH, String str, List<? extends Object> list) {
        InterfaceC1631620sYq<? super InterfaceC1541990qEH, ? super String, Object, Unit> interfaceC1631620sYq = interfaceC1541990qEH.getHybridContext().sendEventListener;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(interfaceC1541990qEH, str, list);
        }
        AbstractC1539000q9S abstractC1539000q9S = interfaceC1541990qEH.getHybridContext().absSendEventListener;
        if (abstractC1539000q9S != null) {
            do {
                abstractC1539000q9S.LJJIJL(str, list);
                T t = abstractC1539000q9S.LL;
                if (t != 0 && (t instanceof AbstractC1539000q9S)) {
                    abstractC1539000q9S = (AbstractC1539000q9S) t;
                } else {
                    return;
                }
            } while (abstractC1539000q9S != null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, String str, JSONObject jSONObject) {
        InterfaceC1631620sYq<? super InterfaceC1541990qEH, ? super String, Object, Unit> interfaceC1631620sYq = interfaceC1541990qEH.getHybridContext().sendEventListener;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(interfaceC1541990qEH, str, jSONObject);
        }
        AbstractC1539000q9S abstractC1539000q9S = interfaceC1541990qEH.getHybridContext().absSendEventListener;
        if (abstractC1539000q9S != null) {
            do {
                abstractC1539000q9S.LJJIJL(str, jSONObject);
                T t = abstractC1539000q9S.LL;
                if (t != 0 && (t instanceof AbstractC1539000q9S)) {
                    abstractC1539000q9S = (AbstractC1539000q9S) t;
                } else {
                    return;
                }
            } while (abstractC1539000q9S != null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH, String str, Map<String, ? extends Object> map) {
        InterfaceC1631620sYq<? super InterfaceC1541990qEH, ? super String, Object, Unit> interfaceC1631620sYq = interfaceC1541990qEH.getHybridContext().sendEventListener;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(interfaceC1541990qEH, str, map);
        }
        AbstractC1539000q9S abstractC1539000q9S = interfaceC1541990qEH.getHybridContext().absSendEventListener;
        if (abstractC1539000q9S != null) {
            do {
                abstractC1539000q9S.LJJIJL(str, map);
                T t = abstractC1539000q9S.LL;
                if (t != 0 && (t instanceof AbstractC1539000q9S)) {
                    abstractC1539000q9S = (AbstractC1539000q9S) t;
                } else {
                    return;
                }
            } while (abstractC1539000q9S != null);
        }
    }
}
