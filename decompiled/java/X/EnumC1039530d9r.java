package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1039530d9r {
    public static final EnumC1039530d9r FIRST_LOAD_URL;
    public static final /* synthetic */ EnumC1039530d9r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1039530d9r SHOULD_INTERCEPT_REQUEST;
    public static final EnumC1039530d9r SHOULD_OVERRIDE_URL_LOADING;

    public static InterfaceC2044707zh<EnumC1039530d9r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1039530d9r enumC1039530d9r = new EnumC1039530d9r("FIRST_LOAD_URL", 0);
        FIRST_LOAD_URL = enumC1039530d9r;
        EnumC1039530d9r enumC1039530d9r2 = new EnumC1039530d9r("SHOULD_OVERRIDE_URL_LOADING", 1);
        SHOULD_OVERRIDE_URL_LOADING = enumC1039530d9r2;
        EnumC1039530d9r enumC1039530d9r3 = new EnumC1039530d9r("SHOULD_INTERCEPT_REQUEST", 2);
        SHOULD_INTERCEPT_REQUEST = enumC1039530d9r3;
        EnumC1039530d9r[] enumC1039530d9rArr = {enumC1039530d9r, enumC1039530d9r2, enumC1039530d9r3};
        LL = enumC1039530d9rArr;
        LLILLJJLI = new C2254308sP(enumC1039530d9rArr);
    }

    public static EnumC1039530d9r[] values() {
        return (EnumC1039530d9r[]) LL.clone();
    }

    public static EnumC1039530d9r valueOf(String str) {
        return (EnumC1039530d9r) C08FF.LIZ(EnumC1039530d9r.class, str);
    }

    public EnumC1039530d9r(String str, int i) {
    }
}
