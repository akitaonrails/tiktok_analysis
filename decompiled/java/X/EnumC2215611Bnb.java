package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Bnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2215611Bnb {
    public static final C2215601Bna Companion;
    public static final /* synthetic */ EnumC2215611Bnb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2215611Bnb TYPE_BOOL;
    public static final EnumC2215611Bnb TYPE_DATE;
    public static final EnumC2215611Bnb TYPE_HIT_NODE;
    public static final EnumC2215611Bnb TYPE_LIGHT_INTERACTION_FREQUENCY_CONTROL;
    public static final EnumC2215611Bnb TYPE_NO_SUPPORT;
    public static final EnumC2215611Bnb TYPE_NUMBER;
    public static final EnumC2215611Bnb TYPE_NUMBER_ARRAY;
    public static final EnumC2215611Bnb TYPE_STRING;
    public static final EnumC2215611Bnb TYPE_STRING_ARRAY;
    public static final Map<String, EnumC2215611Bnb> keyToTypeMap;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2215611Bnb> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.1Bna] */
    static {
        EnumC2215611Bnb enumC2215611Bnb = new EnumC2215611Bnb("TYPE_STRING", 0, "string");
        TYPE_STRING = enumC2215611Bnb;
        EnumC2215611Bnb enumC2215611Bnb2 = new EnumC2215611Bnb("TYPE_NUMBER", 1, "number");
        TYPE_NUMBER = enumC2215611Bnb2;
        EnumC2215611Bnb enumC2215611Bnb3 = new EnumC2215611Bnb("TYPE_BOOL", 2, "bool");
        TYPE_BOOL = enumC2215611Bnb3;
        EnumC2215611Bnb enumC2215611Bnb4 = new EnumC2215611Bnb("TYPE_HIT_NODE", 3, "hit_node");
        TYPE_HIT_NODE = enumC2215611Bnb4;
        EnumC2215611Bnb enumC2215611Bnb5 = new EnumC2215611Bnb("TYPE_STRING_ARRAY", 4, "string_array");
        TYPE_STRING_ARRAY = enumC2215611Bnb5;
        EnumC2215611Bnb enumC2215611Bnb6 = new EnumC2215611Bnb("TYPE_NUMBER_ARRAY", 5, "number_array");
        TYPE_NUMBER_ARRAY = enumC2215611Bnb6;
        EnumC2215611Bnb enumC2215611Bnb7 = new EnumC2215611Bnb("TYPE_DATE", 6, "date");
        TYPE_DATE = enumC2215611Bnb7;
        EnumC2215611Bnb enumC2215611Bnb8 = new EnumC2215611Bnb("TYPE_LIGHT_INTERACTION_FREQUENCY_CONTROL", 7, "light_interaction_frequency_control_type");
        TYPE_LIGHT_INTERACTION_FREQUENCY_CONTROL = enumC2215611Bnb8;
        EnumC2215611Bnb enumC2215611Bnb9 = new EnumC2215611Bnb("TYPE_NO_SUPPORT", 8, "no_support");
        TYPE_NO_SUPPORT = enumC2215611Bnb9;
        EnumC2215611Bnb[] enumC2215611BnbArr = {enumC2215611Bnb, enumC2215611Bnb2, enumC2215611Bnb3, enumC2215611Bnb4, enumC2215611Bnb5, enumC2215611Bnb6, enumC2215611Bnb7, enumC2215611Bnb8, enumC2215611Bnb9};
        LLILLJJLI = enumC2215611BnbArr;
        LLILLL = new C2254308sP(enumC2215611BnbArr);
        Companion = new Object() { // from class: X.1Bna
        };
        EnumC2215611Bnb[] enumC2215611BnbArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC2215611BnbArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC2215611Bnb enumC2215611Bnb10 : enumC2215611BnbArrValues) {
            linkedHashMap.put(enumC2215611Bnb10.LL, enumC2215611Bnb10);
        }
        keyToTypeMap = linkedHashMap;
    }

    public static EnumC2215611Bnb[] values() {
        return (EnumC2215611Bnb[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC2215611Bnb valueOf(String str) {
        return (EnumC2215611Bnb) C08FF.LIZ(EnumC2215611Bnb.class, str);
    }

    public EnumC2215611Bnb(String str, int i, String str2) {
        this.LL = str2;
    }
}
