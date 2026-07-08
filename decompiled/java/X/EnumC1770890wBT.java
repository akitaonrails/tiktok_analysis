package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770890wBT {
    public static final EnumC1770890wBT API_ERROR_RETRY;
    public static final /* synthetic */ EnumC1770890wBT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1770890wBT NETWORK_UNAVAILABLE_RETRY;
    public static final EnumC1770890wBT PREFETCH;
    public static final EnumC1770890wBT PREFETCH_CACHE;
    public static final EnumC1770890wBT REFRESH;
    public static final EnumC1770890wBT TEMPLATE_ERROR_RETRY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1770890wBT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1770890wBT enumC1770890wBT = new EnumC1770890wBT("PREFETCH_CACHE", 0, "prefetch_cache");
        PREFETCH_CACHE = enumC1770890wBT;
        EnumC1770890wBT enumC1770890wBT2 = new EnumC1770890wBT("PREFETCH", 1, "prefetch");
        PREFETCH = enumC1770890wBT2;
        EnumC1770890wBT enumC1770890wBT3 = new EnumC1770890wBT("REFRESH", 2, "refresh");
        REFRESH = enumC1770890wBT3;
        EnumC1770890wBT enumC1770890wBT4 = new EnumC1770890wBT("API_ERROR_RETRY", 3, "api_error_retry");
        API_ERROR_RETRY = enumC1770890wBT4;
        EnumC1770890wBT enumC1770890wBT5 = new EnumC1770890wBT("NETWORK_UNAVAILABLE_RETRY", 4, "network_unavailable_retry");
        NETWORK_UNAVAILABLE_RETRY = enumC1770890wBT5;
        EnumC1770890wBT enumC1770890wBT6 = new EnumC1770890wBT("TEMPLATE_ERROR_RETRY", 5, "template_error_retry");
        TEMPLATE_ERROR_RETRY = enumC1770890wBT6;
        EnumC1770890wBT[] enumC1770890wBTArr = {enumC1770890wBT, enumC1770890wBT2, enumC1770890wBT3, enumC1770890wBT4, enumC1770890wBT5, enumC1770890wBT6};
        LLILLJJLI = enumC1770890wBTArr;
        LLILLL = new C2254308sP(enumC1770890wBTArr);
    }

    public static EnumC1770890wBT[] values() {
        return (EnumC1770890wBT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1770890wBT valueOf(String str) {
        return (EnumC1770890wBT) C08FF.LIZ(EnumC1770890wBT.class, str);
    }

    public EnumC1770890wBT(String str, int i, String str2) {
        this.LL = str2;
    }
}
