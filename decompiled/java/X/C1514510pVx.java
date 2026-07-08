package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514510pVx<T> implements InterfaceC1491630ov3 {
    public final /* synthetic */ C1520140pf2 LIZ;
    public final /* synthetic */ String LIZIZ;

    public C1514510pVx(C1520140pf2 c1520140pf2, String str) {
        this.LIZ = c1520140pf2;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1491630ov3
    public final void onReceiveValue(Object obj) {
        int i;
        Number number;
        Map<String, List<C443120HZe<String, String, String>>> map;
        List<C443120HZe> list;
        Object obj2;
        Number number2;
        Map map2 = (Map) obj;
        C1520140pf2 c1520140pf2 = this.LIZ;
        String str = this.LIZIZ;
        C1514490pVv c1514490pVv = C1514580pW4.LIZLLL;
        if (c1514490pVv != null && (map = c1514490pVv.LJ) != null && (list = (List) ((LinkedHashMap) map).get(str)) != null) {
            for (C443120HZe c443120HZe : list) {
                Object first = c443120HZe.getFirst();
                Object second = c443120HZe.getSecond();
                String str2 = (String) c443120HZe.getThird();
                if (map2 != null && (obj2 = map2.get(first)) != null && (((obj2 instanceof Number) && (number2 = (Number) obj2) != null && number2.longValue() > 0) || (str2.length() > 0 && Intrinsics.LJFF(obj2, str2)))) {
                    c1520140pf2.LIZIZ.offer((String) second);
                }
            }
        }
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (u.LJJIIJZLJL((String) entry.getKey(), "user_", false)) {
                    Object value = entry.getValue();
                    if ((value instanceof Number) && (number = (Number) value) != null && number.longValue() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                while (true) {
                    int size = c1520140pf2.LIZJ.size();
                    C1514490pVv c1514490pVv2 = C1514580pW4.LIZLLL;
                    if (c1514490pVv2 != null) {
                        i = c1514490pVv2.LIZJ;
                    } else {
                        i = 12;
                    }
                    if (size >= i) {
                        c1520140pf2.LIZJ.poll();
                    }
                }
                c1520140pf2.LIZJ.offer(((String) entry2.getKey()).substring(5));
            }
        }
        c1520140pf2.LJFF.countDown();
    }
}
