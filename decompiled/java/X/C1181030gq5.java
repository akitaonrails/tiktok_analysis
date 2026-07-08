package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181030gq5 {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZ = C452501pT.LIZ(enumC452301pR, AFwS206S0000000_18.get$arr$(658));
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS206S0000000_18.get$arr$(657));
    }

    public static InterfaceC1181050gq7 LIZ(InterfaceC1181010gq3 interfaceC1181010gq3) {
        InterfaceC1181050gq7 interfaceC1181050gq7KR1;
        if (interfaceC1181010gq3 == null || (interfaceC1181050gq7KR1 = interfaceC1181010gq3.KR1()) == null) {
            return (C1181040gq6) LIZ.getValue();
        }
        return interfaceC1181050gq7KR1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(InterfaceC1173990gej interfaceC1173990gej, InterfaceC1181010gq3 interfaceC1181010gq3, String str, Map map) {
        Map<String, String> mapVt;
        AbstractC738140SxQ abstractC738140SxQ;
        Map<String, String> mapVt2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1181050gq7 interfaceC1181050gq7LIZ = LIZ(interfaceC1181010gq3);
        if (interfaceC1181010gq3 != null && (mapVt2 = interfaceC1181010gq3.vt()) != null) {
            linkedHashMap.putAll(mapVt2);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = null;
        if ((interfaceC1173990gej instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) interfaceC1173990gej) != null) {
            interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(abstractC738140SxQ);
        }
        linkedHashMap.putAll(interfaceC1181050gq7LIZ.LIZIZ(interfaceC665370Q7zLJIIL));
        if (interfaceC1173990gej != 0 && (mapVt = interfaceC1173990gej.vt()) != null) {
            linkedHashMap.putAll(mapVt);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        interfaceC1181050gq7LIZ.LIZ().LIZ(str, linkedHashMap);
    }
}
