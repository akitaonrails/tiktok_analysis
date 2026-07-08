package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ihm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1252760ihm {
    public static final EnumC1252760ihm AGE_UNKNOWN;
    public static final C1251920igQ Companion;
    public static final EnumC1252760ihm FAMILY_PARING_RESTRICTED;
    public static final /* synthetic */ EnumC1252760ihm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<Integer, EnumC1252760ihm> MAP;
    public static final EnumC1252760ihm MINOR;
    public static final EnumC1252760ihm NON_LOGIN;
    public static final EnumC1252760ihm RESTRICTED;
    public static final EnumC1252760ihm SENSITIVE_INDUSTRY;
    public static final EnumC1252760ihm UNKNOWN;
    public final int LL;

    public static final EnumC1252760ihm fromInt(int i) {
        Companion.getClass();
        return C1251920igQ.LIZ(i);
    }

    public static InterfaceC2044707zh<EnumC1252760ihm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1252760ihm enumC1252760ihm = new EnumC1252760ihm("UNKNOWN", 0, 0);
        UNKNOWN = enumC1252760ihm;
        EnumC1252760ihm enumC1252760ihm2 = new EnumC1252760ihm("MINOR", 1, 1);
        MINOR = enumC1252760ihm2;
        EnumC1252760ihm enumC1252760ihm3 = new EnumC1252760ihm("NON_LOGIN", 2, 2);
        NON_LOGIN = enumC1252760ihm3;
        EnumC1252760ihm enumC1252760ihm4 = new EnumC1252760ihm("RESTRICTED", 3, 3);
        RESTRICTED = enumC1252760ihm4;
        EnumC1252760ihm enumC1252760ihm5 = new EnumC1252760ihm("FAMILY_PARING_RESTRICTED", 4, 4);
        FAMILY_PARING_RESTRICTED = enumC1252760ihm5;
        EnumC1252760ihm enumC1252760ihm6 = new EnumC1252760ihm("AGE_UNKNOWN", 5, 5);
        AGE_UNKNOWN = enumC1252760ihm6;
        EnumC1252760ihm enumC1252760ihm7 = new EnumC1252760ihm("SENSITIVE_INDUSTRY", 6, 6);
        SENSITIVE_INDUSTRY = enumC1252760ihm7;
        EnumC1252760ihm[] enumC1252760ihmArr = {enumC1252760ihm, enumC1252760ihm2, enumC1252760ihm3, enumC1252760ihm4, enumC1252760ihm5, enumC1252760ihm6, enumC1252760ihm7};
        LLILLJJLI = enumC1252760ihmArr;
        LLILLL = new C2254308sP(enumC1252760ihmArr);
        Companion = new C1251920igQ();
        EnumC1252760ihm[] enumC1252760ihmArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1252760ihmArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1252760ihm enumC1252760ihm8 : enumC1252760ihmArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC1252760ihm8.LL), enumC1252760ihm8);
        }
        MAP = linkedHashMap;
    }

    public static EnumC1252760ihm[] values() {
        return (EnumC1252760ihm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1252760ihm valueOf(String str) {
        return (EnumC1252760ihm) C08FF.LIZ(EnumC1252760ihm.class, str);
    }

    public EnumC1252760ihm(String str, int i, int i2) {
        this.LL = i2;
    }
}
