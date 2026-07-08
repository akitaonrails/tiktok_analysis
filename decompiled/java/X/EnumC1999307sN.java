package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1999307sN {
    public static final EnumC1999307sN AUTO_PLAY;
    public static final EnumC1999307sN CLICK;
    public static final /* synthetic */ EnumC1999307sN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1999307sN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1999307sN enumC1999307sN = new EnumC1999307sN("CLICK", 0, "click");
        CLICK = enumC1999307sN;
        EnumC1999307sN enumC1999307sN2 = new EnumC1999307sN("AUTO_PLAY", 1, "auto_play");
        AUTO_PLAY = enumC1999307sN2;
        EnumC1999307sN[] enumC1999307sNArr = {enumC1999307sN, enumC1999307sN2};
        LLILLJJLI = enumC1999307sNArr;
        LLILLL = new C2254308sP(enumC1999307sNArr);
    }

    public static EnumC1999307sN[] values() {
        return (EnumC1999307sN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1999307sN valueOf(String str) {
        return (EnumC1999307sN) C08FF.LIZ(EnumC1999307sN.class, str);
    }

    public EnumC1999307sN(String str, int i, String str2) {
        this.LL = str2;
    }
}
