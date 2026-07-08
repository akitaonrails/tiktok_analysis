package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995400c0g {
    public static final EnumC995400c0g FAIL;
    public static final /* synthetic */ EnumC995400c0g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC995400c0g LOADING_OUT;
    public static final EnumC995400c0g SUCCESS;
    public static final EnumC995400c0g UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC995400c0g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC995400c0g enumC995400c0g = new EnumC995400c0g("SUCCESS", 0, 0);
        SUCCESS = enumC995400c0g;
        EnumC995400c0g enumC995400c0g2 = new EnumC995400c0g("FAIL", 1, 1);
        FAIL = enumC995400c0g2;
        EnumC995400c0g enumC995400c0g3 = new EnumC995400c0g("LOADING_OUT", 2, 2);
        LOADING_OUT = enumC995400c0g3;
        EnumC995400c0g enumC995400c0g4 = new EnumC995400c0g("UNKNOWN", 3, -1);
        UNKNOWN = enumC995400c0g4;
        EnumC995400c0g[] enumC995400c0gArr = {enumC995400c0g, enumC995400c0g2, enumC995400c0g3, enumC995400c0g4};
        LLILLJJLI = enumC995400c0gArr;
        LLILLL = new C2254308sP(enumC995400c0gArr);
    }

    public static EnumC995400c0g[] values() {
        return (EnumC995400c0g[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC995400c0g valueOf(String str) {
        return (EnumC995400c0g) C08FF.LIZ(EnumC995400c0g.class, str);
    }

    public EnumC995400c0g(String str, int i, int i2) {
        this.LL = i2;
    }
}
