package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19lH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21632119lH {
    public static final /* synthetic */ EnumC21632119lH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21632119lH MP;
    public static final EnumC21632119lH TT4B;
    public static final EnumC21632119lH TTOP;
    public static final EnumC21632119lH USER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21632119lH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21632119lH enumC21632119lH = new EnumC21632119lH("TTOP", 0, "01");
        TTOP = enumC21632119lH;
        EnumC21632119lH enumC21632119lH2 = new EnumC21632119lH("TT4B", 1, "02");
        TT4B = enumC21632119lH2;
        EnumC21632119lH enumC21632119lH3 = new EnumC21632119lH("MP", 2, "03");
        MP = enumC21632119lH3;
        EnumC21632119lH enumC21632119lH4 = new EnumC21632119lH("USER", 3, "04");
        USER = enumC21632119lH4;
        EnumC21632119lH[] enumC21632119lHArr = {enumC21632119lH, enumC21632119lH2, enumC21632119lH3, enumC21632119lH4};
        LLILLJJLI = enumC21632119lHArr;
        LLILLL = new C2254308sP(enumC21632119lHArr);
    }

    public static EnumC21632119lH[] values() {
        return (EnumC21632119lH[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21632119lH valueOf(String str) {
        return (EnumC21632119lH) C08FF.LIZ(EnumC21632119lH.class, str);
    }

    public EnumC21632119lH(String str, int i, String str2) {
        this.LL = str2;
    }
}
