package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1616740sAq {
    public static final EnumC1616740sAq EXPAND_ON_SCREEN;
    public static final EnumC1616740sAq FULL_SCREEN_SHEET;
    public static final EnumC1616740sAq HALF_SCREEN_SHEET;
    public static final /* synthetic */ EnumC1616740sAq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1616740sAq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1616740sAq enumC1616740sAq = new EnumC1616740sAq("HALF_SCREEN_SHEET", 0, "half_screen");
        HALF_SCREEN_SHEET = enumC1616740sAq;
        EnumC1616740sAq enumC1616740sAq2 = new EnumC1616740sAq("FULL_SCREEN_SHEET", 1, "full_screen");
        FULL_SCREEN_SHEET = enumC1616740sAq2;
        EnumC1616740sAq enumC1616740sAq3 = new EnumC1616740sAq("EXPAND_ON_SCREEN", 2, "expand");
        EXPAND_ON_SCREEN = enumC1616740sAq3;
        EnumC1616740sAq[] enumC1616740sAqArr = {enumC1616740sAq, enumC1616740sAq2, enumC1616740sAq3};
        LLILLJJLI = enumC1616740sAqArr;
        LLILLL = new C2254308sP(enumC1616740sAqArr);
    }

    public static EnumC1616740sAq[] values() {
        return (EnumC1616740sAq[]) LLILLJJLI.clone();
    }

    public final String getMode() {
        return this.LL;
    }

    public static EnumC1616740sAq valueOf(String str) {
        return (EnumC1616740sAq) C08FF.LIZ(EnumC1616740sAq.class, str);
    }

    public EnumC1616740sAq(String str, int i, String str2) {
        this.LL = str2;
    }
}
