package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wBW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770920wBW {
    public static final EnumC1770920wBW API_ERROR_RETRY;
    public static final /* synthetic */ EnumC1770920wBW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1770920wBW NETWORK_UNAVAILABLE_RETRY;
    public static final EnumC1770920wBW PREFETCH;
    public static final EnumC1770920wBW PREFETCH_CACHE;
    public static final EnumC1770920wBW PULL_REFRESH;
    public static final EnumC1770920wBW REFRESH;
    public static final EnumC1770920wBW TEMPLATE_ERROR_RETRY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1770920wBW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1770920wBW enumC1770920wBW = new EnumC1770920wBW("PREFETCH_CACHE", 0, "prefetch_cache");
        PREFETCH_CACHE = enumC1770920wBW;
        EnumC1770920wBW enumC1770920wBW2 = new EnumC1770920wBW("PREFETCH", 1, "prefetch");
        PREFETCH = enumC1770920wBW2;
        EnumC1770920wBW enumC1770920wBW3 = new EnumC1770920wBW("REFRESH", 2, "refresh");
        REFRESH = enumC1770920wBW3;
        EnumC1770920wBW enumC1770920wBW4 = new EnumC1770920wBW("PULL_REFRESH", 3, "pull_refresh");
        PULL_REFRESH = enumC1770920wBW4;
        EnumC1770920wBW enumC1770920wBW5 = new EnumC1770920wBW("API_ERROR_RETRY", 4, "api_error_retry");
        API_ERROR_RETRY = enumC1770920wBW5;
        EnumC1770920wBW enumC1770920wBW6 = new EnumC1770920wBW("NETWORK_UNAVAILABLE_RETRY", 5, "network_unavailable_retry");
        NETWORK_UNAVAILABLE_RETRY = enumC1770920wBW6;
        EnumC1770920wBW enumC1770920wBW7 = new EnumC1770920wBW("TEMPLATE_ERROR_RETRY", 6, "template_error_retry");
        TEMPLATE_ERROR_RETRY = enumC1770920wBW7;
        EnumC1770920wBW[] enumC1770920wBWArr = {enumC1770920wBW, enumC1770920wBW2, enumC1770920wBW3, enumC1770920wBW4, enumC1770920wBW5, enumC1770920wBW6, enumC1770920wBW7};
        LLILLJJLI = enumC1770920wBWArr;
        LLILLL = new C2254308sP(enumC1770920wBWArr);
    }

    public static EnumC1770920wBW[] values() {
        return (EnumC1770920wBW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1770920wBW valueOf(String str) {
        return (EnumC1770920wBW) C08FF.LIZ(EnumC1770920wBW.class, str);
    }

    public EnumC1770920wBW(String str, int i, String str2) {
        this.LL = str2;
    }
}
