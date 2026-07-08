package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0rt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605760rt8 {
    public static final Map<EnumC1615506Uf, InterfaceC1605730rt5> LIZ;
    public static final C01GW LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        LIZIZ = C452501pT.LIZIZ(new C728730SiF());
        linkedHashMap.put(EnumC1615506Uf.STORY, C1607070rvF.LIZIZ.LJI());
    }

    public static InterfaceC1605730rt5 LIZ(EnumC1615506Uf enumC1615506Uf) {
        InterfaceC1605730rt5 interfaceC1605730rt5 = (InterfaceC1605730rt5) ((LinkedHashMap) LIZ).get(enumC1615506Uf);
        if (interfaceC1605730rt5 == null) {
            return (InterfaceC1605730rt5) LIZIZ.getValue();
        }
        return interfaceC1605730rt5;
    }
}
