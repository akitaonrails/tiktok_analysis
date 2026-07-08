package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yDU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1849020yDU {
    public static final EnumC1849020yDU ARRAY;
    public static final EnumC1849020yDU BOOLEAN;
    public static final C1849030yDV Companion;
    public static final EnumC1849020yDU LIST;
    public static final /* synthetic */ EnumC1849020yDU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1849020yDU MAP;
    public static final EnumC1849020yDU NULL;
    public static final EnumC1849020yDU NUMBER;
    public static final EnumC1849020yDU OBJECT;
    public static final EnumC1849020yDU OTHER;
    public static final EnumC1849020yDU STRING;
    public static final Map<Integer, EnumC1849020yDU> idx;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1849020yDU> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0yDV] */
    static {
        EnumC1849020yDU enumC1849020yDU = new EnumC1849020yDU("NULL", 0, 1);
        NULL = enumC1849020yDU;
        EnumC1849020yDU enumC1849020yDU2 = new EnumC1849020yDU("STRING", 1, 2);
        STRING = enumC1849020yDU2;
        EnumC1849020yDU enumC1849020yDU3 = new EnumC1849020yDU("NUMBER", 2, 3);
        NUMBER = enumC1849020yDU3;
        EnumC1849020yDU enumC1849020yDU4 = new EnumC1849020yDU("BOOLEAN", 3, 4);
        BOOLEAN = enumC1849020yDU4;
        EnumC1849020yDU enumC1849020yDU5 = new EnumC1849020yDU("OBJECT", 4, 5);
        OBJECT = enumC1849020yDU5;
        EnumC1849020yDU enumC1849020yDU6 = new EnumC1849020yDU("ARRAY", 5, 6);
        ARRAY = enumC1849020yDU6;
        EnumC1849020yDU enumC1849020yDU7 = new EnumC1849020yDU("MAP", 6, 7);
        MAP = enumC1849020yDU7;
        EnumC1849020yDU enumC1849020yDU8 = new EnumC1849020yDU("LIST", 7, 8);
        LIST = enumC1849020yDU8;
        EnumC1849020yDU enumC1849020yDU9 = new EnumC1849020yDU("OTHER", 8, -1);
        OTHER = enumC1849020yDU9;
        EnumC1849020yDU[] enumC1849020yDUArr = {enumC1849020yDU, enumC1849020yDU2, enumC1849020yDU3, enumC1849020yDU4, enumC1849020yDU5, enumC1849020yDU6, enumC1849020yDU7, enumC1849020yDU8, enumC1849020yDU9};
        LLILLJJLI = enumC1849020yDUArr;
        LLILLL = new C2254308sP(enumC1849020yDUArr);
        Companion = new Object() { // from class: X.0yDV
        };
        EnumC1849020yDU[] enumC1849020yDUArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1849020yDUArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1849020yDU enumC1849020yDU10 : enumC1849020yDUArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC1849020yDU10.LL), enumC1849020yDU10);
        }
        idx = linkedHashMap;
    }

    public static EnumC1849020yDU[] values() {
        return (EnumC1849020yDU[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1849020yDU valueOf(String str) {
        return (EnumC1849020yDU) C08FF.LIZ(EnumC1849020yDU.class, str);
    }

    public EnumC1849020yDU(String str, int i, int i2) {
        this.LL = i2;
    }
}
