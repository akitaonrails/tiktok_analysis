package X;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18bW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21316818bW extends AbstractC21318218bk<Map<String, ? extends Object>> {
    public final InterfaceC606320NqI LIZ;
    public final C21326718d7 LIZIZ;

    @Override // X.AbstractC21318218bk
    public final C21318318bl LIZ(Map map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        return new C21318318bl(true, linkedHashMap);
    }

    public C21316818bW(InterfaceC606320NqI interfaceC606320NqI, C21326718d7 c21326718d7) {
        this.LIZ = interfaceC606320NqI;
        this.LIZIZ = c21326718d7;
    }

    @Override // X.AbstractC21318218bk
    public final void LIZIZ(final C21319218bu c21319218bu, Object obj) {
        final C21326518d5 c21326518d5;
        Map<String, ? extends Object> map = (Map) obj;
        if (c21319218bu.LIZ.name != null) {
            Object obj2 = c21319218bu.LIZIZ.LJ.get("item");
            if ((obj2 instanceof C1773340wFQ) && obj2 != null) {
                Object obj3 = c21319218bu.LIZIZ.LJ.get("template");
                if ((obj3 instanceof C21326518d5) && (c21326518d5 = (C21326518d5) obj3) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("bridge_center_extra_bridge_center_context", new InterfaceC21159017rA() { // from class: X.18bX
                        @Override // X.InterfaceC21159017rA
                        public final <T> T LIZIZ(Class<T> cls) {
                            return null;
                        }

                        @Override // X.InterfaceC21159017rA
                        public final String LIZJ() {
                            return c21326518d5.LIZ.LJIIL();
                        }

                        @Override // X.InterfaceC21159017rA
                        public final View LIZ(String str) {
                            return this.LIZ.LIZIZ.LIZJ(c21326518d5.LIZIZ, str);
                        }
                    });
                    linkedHashMap.put("bridge_center_extra_lynx_item_vo", obj2);
                    this.LIZ.LJI(c21319218bu.LIZ.name, map, new C0NOB() { // from class: X.0yt6
                        @Override // X.C0NOB
                        public final void LIZ(int i, String str, Map<String, ? extends Object> map2) {
                            if (i == 1) {
                                c21319218bu.LIZJ(map2);
                            } else {
                                c21319218bu.LIZ(map2);
                            }
                        }
                    }, null, linkedHashMap);
                }
            }
        }
    }
}
