package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1259080iry {
    public static final EnumC1259080iry CAMEO_TAB;
    public static final EnumC1259080iry COLLECT_TAB;
    public static final C1259190is9 Companion;
    public static final EnumC1259080iry LIKE_TAB;
    public static final /* synthetic */ EnumC1259080iry[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1259080iry NORMAL_POST;
    public static final EnumC1259080iry PRIVATE_POST;
    public static final EnumC1259080iry REPOST_TAB;
    public static final EnumC1259080iry UNKNOWN;
    public static final Map<String, EnumC1259080iry> map;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1259080iry> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0is9] */
    static {
        EnumC1259080iry enumC1259080iry = new EnumC1259080iry("NORMAL_POST", 0, "post");
        NORMAL_POST = enumC1259080iry;
        EnumC1259080iry enumC1259080iry2 = new EnumC1259080iry("PRIVATE_POST", 1, "private");
        PRIVATE_POST = enumC1259080iry2;
        EnumC1259080iry enumC1259080iry3 = new EnumC1259080iry("REPOST_TAB", 2, "repost");
        REPOST_TAB = enumC1259080iry3;
        EnumC1259080iry enumC1259080iry4 = new EnumC1259080iry("COLLECT_TAB", 3, "favorite");
        COLLECT_TAB = enumC1259080iry4;
        EnumC1259080iry enumC1259080iry5 = new EnumC1259080iry("LIKE_TAB", 4, "like");
        LIKE_TAB = enumC1259080iry5;
        EnumC1259080iry enumC1259080iry6 = new EnumC1259080iry("CAMEO_TAB", 5, "cameo");
        CAMEO_TAB = enumC1259080iry6;
        EnumC1259080iry enumC1259080iry7 = new EnumC1259080iry("UNKNOWN", 6, "unkown");
        UNKNOWN = enumC1259080iry7;
        EnumC1259080iry[] enumC1259080iryArr = {enumC1259080iry, enumC1259080iry2, enumC1259080iry3, enumC1259080iry4, enumC1259080iry5, enumC1259080iry6, enumC1259080iry7};
        LLILLJJLI = enumC1259080iryArr;
        LLILLL = new C2254308sP(enumC1259080iryArr);
        Companion = new Object() { // from class: X.0is9
        };
        EnumC1259080iry[] enumC1259080iryArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1259080iryArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1259080iry enumC1259080iry8 : enumC1259080iryArrValues) {
            linkedHashMap.put(enumC1259080iry8.LL, enumC1259080iry8);
        }
        map = linkedHashMap;
    }

    public static EnumC1259080iry[] values() {
        return (EnumC1259080iry[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1259080iry valueOf(String str) {
        return (EnumC1259080iry) C08FF.LIZ(EnumC1259080iry.class, str);
    }

    public EnumC1259080iry(String str, int i, String str2) {
        this.LL = str2;
    }
}
