package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1620106Vz {
    public static final EnumC1620106Vz CARE_MODE_ON_BANNER;
    public static final EnumC1620106Vz COMMENT_BATCH_DELETE_PUSH;
    public static final EnumC1620106Vz COMMENT_DELETE_PUSH;
    public static final EnumC1620106Vz COMMENT_DISLIKE_PUSH;
    public static final C1620006Vy Companion;
    public static final EnumC1620106Vz FILTER_ALL_BANNER;
    public static final EnumC1620106Vz FILTER_ALL_INBOX;
    public static final EnumC1620106Vz FILTER_ALL_POPUP;
    public static final /* synthetic */ EnumC1620106Vz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final Map<Integer, EnumC1620106Vz> MAP;
    public static final EnumC1620106Vz OLD_INBOX_SCHEMA;
    public static final EnumC1620106Vz REPORT_SUBMIT;
    public static final EnumC1620106Vz VUL_CREATOR_BANNER;
    public static final EnumC1620106Vz VUL_CREATOR_INBOX;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1620106Vz> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.06Vy] */
    static {
        EnumC1620106Vz enumC1620106Vz = new EnumC1620106Vz("FILTER_ALL_INBOX", 0, 0);
        FILTER_ALL_INBOX = enumC1620106Vz;
        EnumC1620106Vz enumC1620106Vz2 = new EnumC1620106Vz("FILTER_ALL_POPUP", 1, 1);
        FILTER_ALL_POPUP = enumC1620106Vz2;
        EnumC1620106Vz enumC1620106Vz3 = new EnumC1620106Vz("FILTER_ALL_BANNER", 2, 2);
        FILTER_ALL_BANNER = enumC1620106Vz3;
        EnumC1620106Vz enumC1620106Vz4 = new EnumC1620106Vz("COMMENT_DELETE_PUSH", 3, 3);
        COMMENT_DELETE_PUSH = enumC1620106Vz4;
        EnumC1620106Vz enumC1620106Vz5 = new EnumC1620106Vz("COMMENT_BATCH_DELETE_PUSH", 4, 4);
        COMMENT_BATCH_DELETE_PUSH = enumC1620106Vz5;
        EnumC1620106Vz enumC1620106Vz6 = new EnumC1620106Vz("COMMENT_DISLIKE_PUSH", 5, 5);
        COMMENT_DISLIKE_PUSH = enumC1620106Vz6;
        EnumC1620106Vz enumC1620106Vz7 = new EnumC1620106Vz("VUL_CREATOR_INBOX", 6, 6);
        VUL_CREATOR_INBOX = enumC1620106Vz7;
        EnumC1620106Vz enumC1620106Vz8 = new EnumC1620106Vz("VUL_CREATOR_BANNER", 7, 7);
        VUL_CREATOR_BANNER = enumC1620106Vz8;
        EnumC1620106Vz enumC1620106Vz9 = new EnumC1620106Vz("CARE_MODE_ON_BANNER", 8, 8);
        CARE_MODE_ON_BANNER = enumC1620106Vz9;
        EnumC1620106Vz enumC1620106Vz10 = new EnumC1620106Vz("REPORT_SUBMIT", 9, 9);
        REPORT_SUBMIT = enumC1620106Vz10;
        EnumC1620106Vz enumC1620106Vz11 = new EnumC1620106Vz("OLD_INBOX_SCHEMA", 10, 10);
        OLD_INBOX_SCHEMA = enumC1620106Vz11;
        EnumC1620106Vz[] enumC1620106VzArr = {enumC1620106Vz, enumC1620106Vz2, enumC1620106Vz3, enumC1620106Vz4, enumC1620106Vz5, enumC1620106Vz6, enumC1620106Vz7, enumC1620106Vz8, enumC1620106Vz9, enumC1620106Vz10, enumC1620106Vz11};
        LLILLJJLI = enumC1620106VzArr;
        LLILLL = new C2254308sP(enumC1620106VzArr);
        Companion = new Object() { // from class: X.06Vy
        };
        EnumC1620106Vz[] enumC1620106VzArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1620106VzArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1620106Vz enumC1620106Vz12 : enumC1620106VzArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC1620106Vz12.LL), enumC1620106Vz12);
        }
        MAP = linkedHashMap;
    }

    public static EnumC1620106Vz[] values() {
        return (EnumC1620106Vz[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1620106Vz valueOf(String str) {
        return (EnumC1620106Vz) C08FF.LIZ(EnumC1620106Vz.class, str);
    }

    public EnumC1620106Vz(String str, int i, int i2) {
        this.LL = i2;
    }
}
