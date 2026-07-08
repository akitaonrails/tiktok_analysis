package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1240620iOC {
    public static final EnumC1240620iOC ACCOUNT;
    public static final EnumC1240620iOC ALL;
    public static final EnumC1240620iOC HISTORY;
    public static final /* synthetic */ EnumC1240620iOC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1240620iOC MESSAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1240620iOC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1240620iOC enumC1240620iOC = new EnumC1240620iOC("ALL", 0, "all");
        ALL = enumC1240620iOC;
        EnumC1240620iOC enumC1240620iOC2 = new EnumC1240620iOC("ACCOUNT", 1, "account");
        ACCOUNT = enumC1240620iOC2;
        EnumC1240620iOC enumC1240620iOC3 = new EnumC1240620iOC("MESSAGE", 2, "message");
        MESSAGE = enumC1240620iOC3;
        EnumC1240620iOC enumC1240620iOC4 = new EnumC1240620iOC("HISTORY", 3, "history");
        HISTORY = enumC1240620iOC4;
        EnumC1240620iOC[] enumC1240620iOCArr = {enumC1240620iOC, enumC1240620iOC2, enumC1240620iOC3, enumC1240620iOC4};
        LLILLJJLI = enumC1240620iOCArr;
        LLILLL = new C2254308sP(enumC1240620iOCArr);
    }

    public static EnumC1240620iOC[] values() {
        return (EnumC1240620iOC[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1240620iOC valueOf(String str) {
        return (EnumC1240620iOC) C08FF.LIZ(EnumC1240620iOC.class, str);
    }

    public EnumC1240620iOC(String str, int i, String str2) {
        this.LL = str2;
    }
}
