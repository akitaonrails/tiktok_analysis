package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k97, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1308150k97 {
    public static final EnumC1308150k97 BOOL;
    public static final C1308170k99 Companion;
    public static final EnumC1308150k97 DOUBLE;
    public static final EnumC1308150k97 JSON_OBJECT;
    public static final EnumC1308150k97 LEGACY_JSON_OBJECT;
    public static final /* synthetic */ EnumC1308150k97[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1308150k97 LONG;
    public static final EnumC1308150k97 STRING;
    public static final EnumC1308150k97 UNKNOWN;
    public static final Map<Integer, EnumC1308150k97> valueMap;
    public final Integer LL;

    public static InterfaceC2044707zh<EnumC1308150k97> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0k99] */
    static {
        EnumC1308150k97 enumC1308150k97 = new EnumC1308150k97("UNKNOWN", 0, 0);
        UNKNOWN = enumC1308150k97;
        EnumC1308150k97 enumC1308150k972 = new EnumC1308150k97("LONG", 1, 1);
        LONG = enumC1308150k972;
        EnumC1308150k97 enumC1308150k973 = new EnumC1308150k97("DOUBLE", 2, 2);
        DOUBLE = enumC1308150k973;
        EnumC1308150k97 enumC1308150k974 = new EnumC1308150k97("STRING", 3, 3);
        STRING = enumC1308150k974;
        EnumC1308150k97 enumC1308150k975 = new EnumC1308150k97("BOOL", 4, 4);
        BOOL = enumC1308150k975;
        EnumC1308150k97 enumC1308150k976 = new EnumC1308150k97("JSON_OBJECT", 5, 5);
        JSON_OBJECT = enumC1308150k976;
        EnumC1308150k97 enumC1308150k977 = new EnumC1308150k97("LEGACY_JSON_OBJECT", 6, 100);
        LEGACY_JSON_OBJECT = enumC1308150k977;
        EnumC1308150k97[] enumC1308150k97Arr = {enumC1308150k97, enumC1308150k972, enumC1308150k973, enumC1308150k974, enumC1308150k975, enumC1308150k976, enumC1308150k977};
        LLILLJJLI = enumC1308150k97Arr;
        LLILLL = new C2254308sP(enumC1308150k97Arr);
        Companion = new Object() { // from class: X.0k99
        };
        EnumC1308150k97[] enumC1308150k97ArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1308150k97ArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1308150k97 enumC1308150k978 : enumC1308150k97ArrValues) {
            linkedHashMap.put(enumC1308150k978.LL, enumC1308150k978);
        }
        valueMap = linkedHashMap;
    }

    public static EnumC1308150k97[] values() {
        return (EnumC1308150k97[]) LLILLJJLI.clone();
    }

    public final Integer getValue() {
        return this.LL;
    }

    public static EnumC1308150k97 valueOf(String str) {
        return (EnumC1308150k97) C08FF.LIZ(EnumC1308150k97.class, str);
    }

    public EnumC1308150k97(String str, int i, Integer num) {
        this.LL = num;
    }
}
