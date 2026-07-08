package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ExQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381420ExQ {
    public static final void LIZ(EnumC355970DxT enumC355970DxT, C381430ExR c381430ExR, InterfaceC381500ExY<C381330ExH> interfaceC381500ExY, Map<String, ? extends Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError: cost=");
        sbLIZ.append(c381430ExR.LJJIIJZLJL());
        C381530Exb.LIZJ(c381430ExR, C2188811AlT.LIZIZ(sbLIZ));
        C381350ExJ c381350ExJ = new C381350ExJ(enumC355970DxT.getCode(), enumC355970DxT.getMsg(), 4);
        Map<String, String> map2 = c381350ExJ.LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        map2.putAll(linkedHashMap);
        interfaceC381500ExY.LIZJ(c381350ExJ);
    }
}
