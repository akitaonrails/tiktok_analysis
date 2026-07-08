package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC962630b9p {
    public static final /* synthetic */ EnumC962630b9p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC962630b9p MATCH_LV0;
    public static final EnumC962630b9p MATCH_LV1;
    public static final EnumC962630b9p MATCH_LV2;
    public static final EnumC962630b9p MATCH_LV3;
    public static final EnumC962630b9p ROUND1;
    public static final EnumC962630b9p ROUND2_END;
    public static final EnumC962630b9p ROUND2_ON;
    public static final EnumC962630b9p ROUND2_PRE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC962630b9p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC962630b9p enumC962630b9p = new EnumC962630b9p("ROUND1", 0, "round1");
        ROUND1 = enumC962630b9p;
        EnumC962630b9p enumC962630b9p2 = new EnumC962630b9p("ROUND2_PRE", 1, "round2_pre");
        ROUND2_PRE = enumC962630b9p2;
        EnumC962630b9p enumC962630b9p3 = new EnumC962630b9p("ROUND2_ON", 2, "round2_on");
        ROUND2_ON = enumC962630b9p3;
        EnumC962630b9p enumC962630b9p4 = new EnumC962630b9p("ROUND2_END", 3, "round2_end");
        ROUND2_END = enumC962630b9p4;
        EnumC962630b9p enumC962630b9p5 = new EnumC962630b9p("MATCH_LV0", 4, "match_lv0");
        MATCH_LV0 = enumC962630b9p5;
        EnumC962630b9p enumC962630b9p6 = new EnumC962630b9p("MATCH_LV1", 5, "match_lv1");
        MATCH_LV1 = enumC962630b9p6;
        EnumC962630b9p enumC962630b9p7 = new EnumC962630b9p("MATCH_LV2", 6, "match_lv2");
        MATCH_LV2 = enumC962630b9p7;
        EnumC962630b9p enumC962630b9p8 = new EnumC962630b9p("MATCH_LV3", 7, "match_lv3");
        MATCH_LV3 = enumC962630b9p8;
        EnumC962630b9p[] enumC962630b9pArr = {enumC962630b9p, enumC962630b9p2, enumC962630b9p3, enumC962630b9p4, enumC962630b9p5, enumC962630b9p6, enumC962630b9p7, enumC962630b9p8};
        LLILLJJLI = enumC962630b9pArr;
        LLILLL = new C2254308sP(enumC962630b9pArr);
    }

    public static EnumC962630b9p[] values() {
        return (EnumC962630b9p[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC962630b9p valueOf(String str) {
        return (EnumC962630b9p) C08FF.LIZ(EnumC962630b9p.class, str);
    }

    public EnumC962630b9p(String str, int i, String str2) {
        this.LL = str2;
    }
}
