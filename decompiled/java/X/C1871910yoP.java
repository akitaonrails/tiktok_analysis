package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yoP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1871910yoP {
    public static final List<Object> LJII(InterfaceC1871920yoQ interfaceC1871920yoQ) {
        ArrayList arrayList = new ArrayList();
        int size = interfaceC1871920yoQ.size();
        for (int i = 0; i < size; i++) {
            switch (C1323540kXw.LIZ[interfaceC1871920yoQ.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(interfaceC1871920yoQ.getString(i));
                    break;
                case 2:
                    arrayList.add(Double.valueOf(interfaceC1871920yoQ.getDouble(i)));
                    break;
                case 3:
                    arrayList.add(Boolean.valueOf(interfaceC1871920yoQ.getBoolean(i)));
                    break;
                case 4:
                    arrayList.add(Integer.valueOf(interfaceC1871920yoQ.getInt(i)));
                    break;
                case 5:
                    InterfaceC1107590evd map = interfaceC1871920yoQ.getMap(i);
                    if (map != null) {
                        arrayList.add(LJIIIIZZ(map));
                    }
                    break;
                case 6:
                    InterfaceC1871920yoQ array = interfaceC1871920yoQ.getArray(i);
                    if (array != null) {
                        arrayList.add(LJII(array));
                    }
                    break;
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> LJIIIIZZ(InterfaceC1107590evd interfaceC1107590evd) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1107470evR interfaceC1107470evRLIZIZ = interfaceC1107590evd.LIZIZ();
        while (interfaceC1107470evRLIZIZ.hasNextKey()) {
            String strNextKey = interfaceC1107470evRLIZIZ.nextKey();
            switch (C1323540kXw.LIZ[interfaceC1107590evd.getType(strNextKey).ordinal()]) {
                case 1:
                    linkedHashMap.put(strNextKey, interfaceC1107590evd.getString(strNextKey));
                    break;
                case 2:
                    linkedHashMap.put(strNextKey, Double.valueOf(interfaceC1107590evd.getDouble(strNextKey)));
                    break;
                case 3:
                    linkedHashMap.put(strNextKey, Boolean.valueOf(interfaceC1107590evd.getBoolean(strNextKey)));
                    break;
                case 4:
                    linkedHashMap.put(strNextKey, Integer.valueOf(interfaceC1107590evd.getInt(strNextKey)));
                    break;
                case 5:
                    InterfaceC1107590evd map = interfaceC1107590evd.getMap(strNextKey);
                    if (map != null) {
                        linkedHashMap.put(strNextKey, LJIIIIZZ(map));
                    }
                    break;
                case 6:
                    InterfaceC1871920yoQ array = interfaceC1107590evd.getArray(strNextKey);
                    if (array != null) {
                        linkedHashMap.put(strNextKey, LJII(array));
                    }
                    break;
            }
        }
        return linkedHashMap;
    }

    public static InterfaceC1107590evd LJ(InterfaceC1107590evd interfaceC1107590evd, String str) {
        if (interfaceC1107590evd.hasKey(str)) {
            InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get(str);
            if (interfaceC1871820yoG.getType() == EnumC1323480kXq.Map) {
                return interfaceC1871820yoG.asMap();
            }
            return null;
        }
        return null;
    }

    public static final InterfaceC1871920yoQ LIZ(InterfaceC1107590evd interfaceC1107590evd, String str, InterfaceC1871920yoQ interfaceC1871920yoQ) {
        if (!interfaceC1107590evd.hasKey(str)) {
            return interfaceC1871920yoQ;
        }
        InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get(str);
        if (interfaceC1871820yoG.getType() == EnumC1323480kXq.Array) {
            return interfaceC1871820yoG.asArray();
        }
        return interfaceC1871920yoQ;
    }

    public static final boolean LIZIZ(InterfaceC1107590evd interfaceC1107590evd, String str, boolean z) {
        if (!interfaceC1107590evd.hasKey(str)) {
            return z;
        }
        InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get(str);
        if (interfaceC1871820yoG.getType() == EnumC1323480kXq.Boolean) {
            return interfaceC1871820yoG.asBoolean();
        }
        return z;
    }

    public static final double LIZJ(InterfaceC1107590evd interfaceC1107590evd, String str, double d) {
        if (!interfaceC1107590evd.hasKey(str)) {
            return d;
        }
        InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get(str);
        if (interfaceC1871820yoG.getType() == EnumC1323480kXq.Number) {
            return interfaceC1871820yoG.asDouble();
        }
        return d;
    }

    public static final int LIZLLL(InterfaceC1107590evd interfaceC1107590evd, String str, int i) {
        if (!interfaceC1107590evd.hasKey(str)) {
            return i;
        }
        InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get(str);
        if (interfaceC1871820yoG.getType() == EnumC1323480kXq.Int) {
            return interfaceC1871820yoG.asInt();
        }
        if (interfaceC1871820yoG.getType() != EnumC1323480kXq.Number) {
            return i;
        }
        return (int) interfaceC1871820yoG.asDouble();
    }

    public static final String LJFF(InterfaceC1107590evd interfaceC1107590evd, String str, String str2) {
        if (!interfaceC1107590evd.hasKey(str)) {
            return str2;
        }
        InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get(str);
        if (interfaceC1871820yoG.getType() == EnumC1323480kXq.String) {
            return interfaceC1871820yoG.asString();
        }
        return str2;
    }
}
