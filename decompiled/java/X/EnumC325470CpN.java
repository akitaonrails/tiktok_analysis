package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC325470CpN {
    public static final EnumC325470CpN COMMENT_TRAY;
    public static final /* synthetic */ EnumC325470CpN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC325470CpN PIN_COMMENT;
    public static final EnumC325470CpN STAR_OTHER_COMMENT;
    public static final EnumC325470CpN STAR_SELF_COMMENT;
    public static final EnumC325470CpN WATCH_FOCUS;

    public static InterfaceC2044707zh<EnumC325470CpN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC325470CpN enumC325470CpN = new EnumC325470CpN("COMMENT_TRAY", 0);
        COMMENT_TRAY = enumC325470CpN;
        EnumC325470CpN enumC325470CpN2 = new EnumC325470CpN("WATCH_FOCUS", 1);
        WATCH_FOCUS = enumC325470CpN2;
        EnumC325470CpN enumC325470CpN3 = new EnumC325470CpN("PIN_COMMENT", 2);
        PIN_COMMENT = enumC325470CpN3;
        EnumC325470CpN enumC325470CpN4 = new EnumC325470CpN("STAR_OTHER_COMMENT", 3);
        STAR_OTHER_COMMENT = enumC325470CpN4;
        EnumC325470CpN enumC325470CpN5 = new EnumC325470CpN("STAR_SELF_COMMENT", 4);
        STAR_SELF_COMMENT = enumC325470CpN5;
        EnumC325470CpN[] enumC325470CpNArr = {enumC325470CpN, enumC325470CpN2, enumC325470CpN3, enumC325470CpN4, enumC325470CpN5};
        LL = enumC325470CpNArr;
        LLILLJJLI = new C2254308sP(enumC325470CpNArr);
    }

    public static EnumC325470CpN[] values() {
        return (EnumC325470CpN[]) LL.clone();
    }

    public static EnumC325470CpN valueOf(String str) {
        return (EnumC325470CpN) C08FF.LIZ(EnumC325470CpN.class, str);
    }

    public EnumC325470CpN(String str, int i) {
    }
}
