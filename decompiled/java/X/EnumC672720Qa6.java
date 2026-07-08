package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qa6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672720Qa6 {
    public static final C672790QaD Companion;
    public static final EnumC672720Qa6 ECOM_SEARCH_PAGE;
    public static final EnumC672720Qa6 GENERAL_SEARCH_PAGE;
    public static final /* synthetic */ EnumC672720Qa6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<Integer, EnumC672720Qa6> MAP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC672720Qa6> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0QaD] */
    static {
        EnumC672720Qa6 enumC672720Qa6 = new EnumC672720Qa6("GENERAL_SEARCH_PAGE", 0, 0);
        GENERAL_SEARCH_PAGE = enumC672720Qa6;
        EnumC672720Qa6 enumC672720Qa62 = new EnumC672720Qa6("ECOM_SEARCH_PAGE", 1, 1);
        ECOM_SEARCH_PAGE = enumC672720Qa62;
        EnumC672720Qa6[] enumC672720Qa6Arr = {enumC672720Qa6, enumC672720Qa62};
        LLILLJJLI = enumC672720Qa6Arr;
        LLILLL = new C2254308sP(enumC672720Qa6Arr);
        Companion = new Object() { // from class: X.0QaD
        };
        EnumC672720Qa6[] enumC672720Qa6ArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC672720Qa6ArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC672720Qa6 enumC672720Qa63 : enumC672720Qa6ArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC672720Qa63.LL), enumC672720Qa63);
        }
        MAP = linkedHashMap;
    }

    public static EnumC672720Qa6[] values() {
        return (EnumC672720Qa6[]) LLILLJJLI.clone();
    }

    public final int getPageType() {
        return this.LL;
    }

    public static EnumC672720Qa6 valueOf(String str) {
        return (EnumC672720Qa6) C08FF.LIZ(EnumC672720Qa6.class, str);
    }

    public EnumC672720Qa6(String str, int i, int i2) {
        this.LL = i2;
    }
}
