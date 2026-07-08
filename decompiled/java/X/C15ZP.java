package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C15ZP {
    public final String LIZ;
    public final CopyOnWriteArrayList<C15ZW> LIZIZ = new CopyOnWriteArrayList<>();

    public C15ZP(String str) {
        this.LIZ = str;
    }

    public final void LIZJ(C15ZW c15zw) {
        C15ZQ c15zq;
        Map<String, C20540515Zb> map;
        C20540515Zb c20540515Zb;
        C15ZQ c15zq2;
        Map<String, C20540515Zb> map2;
        C20540515Zb c20540515Zb2;
        if (this.LIZIZ.contains(c15zw)) {
            InterfaceC20540815Ze interfaceC20540815ZeLIZ = C15ZV.LIZ();
            if (interfaceC20540815ZeLIZ != null) {
                interfaceC20540815ZeLIZ.LIZ("pnsscreensdk_try_to_add_strategy_failed_1", C2097608Jq.LJIIIIZZ(new Pair("trigger_key", this.LIZ), new Pair("strategy_key", c15zw.LIZ)));
                return;
            }
            return;
        }
        CopyOnWriteArrayList<C15ZW> copyOnWriteArrayList = this.LIZIZ;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<C15ZW> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZ, c15zw.LIZ)) {
                    InterfaceC20540815Ze interfaceC20540815ZeLIZ2 = C15ZV.LIZ();
                    if (interfaceC20540815ZeLIZ2 != null) {
                        interfaceC20540815ZeLIZ2.LIZ("pnsscreensdk_try_to_add_strategy_failed_2", C2097608Jq.LJIIIIZZ(new Pair("trigger_key", this.LIZ), new Pair("strategy_key", c15zw.LIZ)));
                        return;
                    }
                    return;
                }
            }
        }
        if (!c15zw.LIZIZ(this)) {
            InterfaceC20540815Ze interfaceC20540815ZeLIZ3 = C15ZV.LIZ();
            if (interfaceC20540815ZeLIZ3 != null) {
                interfaceC20540815ZeLIZ3.LIZ("pnsscreensdk_try_to_add_strategy_failed_3", C2097608Jq.LJIIIIZZ(new Pair("trigger_key", this.LIZ), new Pair("strategy_key", c15zw.LIZ)));
                return;
            }
            return;
        }
        c15zw.LIZJ = new AwS432S0200000_31(this, c15zw, 100);
        this.LIZIZ.add(c15zw);
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_add_strategy", new JSONObject().put("trigger_key", this.LIZ).put("strategy_key", c15zw.LIZ), null);
        }
        InterfaceC20540815Ze interfaceC20540815ZeLIZ4 = C15ZV.LIZ();
        if (interfaceC20540815ZeLIZ4 != null) {
            interfaceC20540815ZeLIZ4.LIZ("pnsscreensdk_add_strategy", C2097608Jq.LJIIIIZZ(new Pair("trigger_key", this.LIZ), new Pair("strategy_key", c15zw.LIZ)));
        }
        long jLIZJ = 0;
        if (c15zw instanceof C15ZY) {
            C15ZY c15zy = (C15ZY) c15zw;
            C15ZR c15zr = C15ZR.LIZLLL;
            if (c15zr != null && (c15zq2 = c15zr.LIZIZ) != null && (map2 = c15zq2.LIZJ) != null && (c20540515Zb2 = (C20540515Zb) ((LinkedHashMap) map2).get(c15zw.LIZIZ)) != null) {
                jLIZJ = c20540515Zb2.LIZJ();
            }
            c15zy.LJFF(jLIZJ);
            return;
        }
        if (!(c15zw instanceof C20540915Zf)) {
            return;
        }
        C20540915Zf c20540915Zf = (C20540915Zf) c15zw;
        C15ZR c15zr2 = C15ZR.LIZLLL;
        if (c15zr2 != null && (c15zq = c15zr2.LIZIZ) != null && (map = c15zq.LIZJ) != null && (c20540515Zb = (C20540515Zb) ((LinkedHashMap) map).get(c15zw.LIZIZ)) != null) {
            jLIZJ = c20540515Zb.LIZJ();
        }
        c20540915Zf.LIZLLL = jLIZJ;
    }

    public final void LIZLLL(EnumC992810bwV enumC992810bwV) {
        if (this.LIZIZ.isEmpty()) {
            return;
        }
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_remove_strategy", new JSONObject().put("trigger_key", this.LIZ).put("strategy_key_list", C13LP.LJJLIIIJ(this.LIZIZ, ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(274), 30)).put("remove_reason", enumC992810bwV.getValue()), null);
        }
        this.LIZIZ.clear();
    }

    public final void LJ(C15ZW c15zw, EnumC992810bwV enumC992810bwV) {
        if (this.LIZIZ.contains(c15zw)) {
            this.LIZIZ.remove(c15zw);
            InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
            if (interfaceC20541015ZgLIZIZ != null) {
                interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_remove_strategy", new JSONObject().put("trigger_key", this.LIZ).put("strategy_key_list", c15zw.LIZ).put("remove_reason", enumC992810bwV.getValue()), null);
            }
        }
    }

    public final void LJFF(String str, EnumC992810bwV enumC992810bwV) {
        for (C15ZW c15zw : this.LIZIZ) {
            if (Intrinsics.LJFF(c15zw.LIZ, str)) {
                this.LIZIZ.remove(c15zw);
                InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
                if (interfaceC20541015ZgLIZIZ != null) {
                    interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_remove_strategy", new JSONObject().put("trigger_key", this.LIZ).put("strategy_key_list", str).put("remove_reason", enumC992810bwV.getValue()), null);
                }
            }
        }
    }
}
