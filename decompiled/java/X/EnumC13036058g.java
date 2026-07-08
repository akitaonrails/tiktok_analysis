package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.058g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13036058g {
    public static final EnumC13036058g ALGORITHM_TRIGGER;
    public static final EnumC13036058g HANDLE_MSG;
    public static final /* synthetic */ EnumC13036058g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC13036058g REGISTER_HANDLER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC13036058g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC13036058g enumC13036058g = new EnumC13036058g("REGISTER_HANDLER", 0, "register_handler");
        REGISTER_HANDLER = enumC13036058g;
        EnumC13036058g enumC13036058g2 = new EnumC13036058g("ALGORITHM_TRIGGER", 1, "algorithm_trigger");
        ALGORITHM_TRIGGER = enumC13036058g2;
        EnumC13036058g enumC13036058g3 = new EnumC13036058g("HANDLE_MSG", 2, "handle_msg");
        HANDLE_MSG = enumC13036058g3;
        EnumC13036058g[] enumC13036058gArr = {enumC13036058g, enumC13036058g2, enumC13036058g3};
        LLILLJJLI = enumC13036058gArr;
        LLILLL = new C2254308sP(enumC13036058gArr);
    }

    public static EnumC13036058g[] values() {
        return (EnumC13036058g[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC13036058g valueOf(String str) {
        return (EnumC13036058g) C08FF.LIZ(EnumC13036058g.class, str);
    }

    public EnumC13036058g(String str, int i, String str2) {
        this.LL = str2;
    }
}
