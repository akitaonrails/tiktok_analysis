package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e0M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1072080e0M {
    public static final EnumC1072080e0M ALLOW;
    public static final EnumC1072080e0M DENY;
    public static final EnumC1072080e0M DISMISS;
    public static final EnumC1072080e0M LEARN_MORE;
    public static final /* synthetic */ EnumC1072080e0M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1072080e0M NOT_NOW;
    public static final EnumC1072080e0M OK;
    public static final EnumC1072080e0M OPEN_SETTINGS;

    public static InterfaceC2044707zh<EnumC1072080e0M> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1072080e0M enumC1072080e0M = new EnumC1072080e0M("NOT_NOW", 0);
        NOT_NOW = enumC1072080e0M;
        EnumC1072080e0M enumC1072080e0M2 = new EnumC1072080e0M("DENY", 1);
        DENY = enumC1072080e0M2;
        EnumC1072080e0M enumC1072080e0M3 = new EnumC1072080e0M("OK", 2);
        OK = enumC1072080e0M3;
        EnumC1072080e0M enumC1072080e0M4 = new EnumC1072080e0M("ALLOW", 3);
        ALLOW = enumC1072080e0M4;
        EnumC1072080e0M enumC1072080e0M5 = new EnumC1072080e0M("DISMISS", 4);
        DISMISS = enumC1072080e0M5;
        EnumC1072080e0M enumC1072080e0M6 = new EnumC1072080e0M("LEARN_MORE", 5);
        LEARN_MORE = enumC1072080e0M6;
        EnumC1072080e0M enumC1072080e0M7 = new EnumC1072080e0M("OPEN_SETTINGS", 6);
        OPEN_SETTINGS = enumC1072080e0M7;
        EnumC1072080e0M[] enumC1072080e0MArr = {enumC1072080e0M, enumC1072080e0M2, enumC1072080e0M3, enumC1072080e0M4, enumC1072080e0M5, enumC1072080e0M6, enumC1072080e0M7};
        LL = enumC1072080e0MArr;
        LLILLJJLI = new C2254308sP(enumC1072080e0MArr);
    }

    public static EnumC1072080e0M[] values() {
        return (EnumC1072080e0M[]) LL.clone();
    }

    public static EnumC1072080e0M valueOf(String str) {
        return (EnumC1072080e0M) C08FF.LIZ(EnumC1072080e0M.class, str);
    }

    public EnumC1072080e0M(String str, int i) {
    }
}
