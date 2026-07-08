package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC800320VaQ {
    public static final EnumC800320VaQ APP_BACKGROUND;
    public static final EnumC800320VaQ BOOT_FINISH;
    public static final /* synthetic */ EnumC800320VaQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC800320VaQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC800320VaQ enumC800320VaQ = new EnumC800320VaQ("BOOT_FINISH", 0, "boot_finish");
        BOOT_FINISH = enumC800320VaQ;
        EnumC800320VaQ enumC800320VaQ2 = new EnumC800320VaQ("APP_BACKGROUND", 1, "app_background");
        APP_BACKGROUND = enumC800320VaQ2;
        EnumC800320VaQ[] enumC800320VaQArr = {enumC800320VaQ, enumC800320VaQ2};
        LLILLJJLI = enumC800320VaQArr;
        LLILLL = new C2254308sP(enumC800320VaQArr);
    }

    public static EnumC800320VaQ[] values() {
        return (EnumC800320VaQ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC800320VaQ valueOf(String str) {
        return (EnumC800320VaQ) C08FF.LIZ(EnumC800320VaQ.class, str);
    }

    public EnumC800320VaQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
