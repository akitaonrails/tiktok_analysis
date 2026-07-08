package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ov9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491690ov9 {
    public final String LIZ;
    public final String LIZIZ;

    public final void LIZ(String str) {
        C1491570oux c1491570oux = C1491570oux.LIZ;
        String str2 = this.LIZ;
        EnumC1491500ouq enumC1491500ouq = EnumC1491500ouq.EXTEND;
        c1491570oux.getClass();
        C1491570oux.LJIJJ(str2, str, enumC1491500ouq);
    }

    public final void LJ(Map<String, ? extends Object> map) {
        C1491570oux c1491570oux = C1491570oux.LIZ;
        String str = this.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(LJFF((String) entry.getKey()), entry.getValue());
        }
        C1491570oux.LJIILLIIL(c1491570oux, str, linkedHashMap);
    }

    public final String LJFF(String str) {
        if (!a0.LJJJIL(this.LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('_');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public final long LIZIZ(InterfaceC1491700ovA interfaceC1491700ovA, Long l) {
        long jLongValue;
        if (l == null) {
            jLongValue = System.currentTimeMillis();
        } else {
            jLongValue = l.longValue();
        }
        LIZLLL(interfaceC1491700ovA.key(), Long.valueOf(jLongValue));
        return jLongValue;
    }

    public final void LIZLLL(String str, Object obj) {
        C1491570oux.LJIJI(C1491570oux.LIZ, this.LIZ, LJFF(str), obj);
    }

    public C1491690ov9(int i, long j, String str, String str2, boolean z, boolean z2) {
        str2 = (i & 2) != 0 ? "" : str2;
        j = (i & 4) != 0 ? 600000L : j;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        this.LIZ = str;
        this.LIZIZ = str2;
        C1491570oux.LIZ.getClass();
        C1491570oux.LIZ(j, str, z, z2);
    }
}
