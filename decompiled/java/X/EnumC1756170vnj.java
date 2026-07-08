package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vnj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756170vnj {
    public static final EnumC1756170vnj BATCH_PRELOAD;
    public static final EnumC1756170vnj CACHE;
    public static final /* synthetic */ EnumC1756170vnj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1756170vnj LOADING;
    public static final EnumC1756170vnj PREVIEW;
    public static final EnumC1756170vnj UNDEFINE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1756170vnj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1756170vnj enumC1756170vnj = new EnumC1756170vnj("UNDEFINE", 0, "undefine");
        UNDEFINE = enumC1756170vnj;
        EnumC1756170vnj enumC1756170vnj2 = new EnumC1756170vnj("LOADING", 1, "loading");
        LOADING = enumC1756170vnj2;
        EnumC1756170vnj enumC1756170vnj3 = new EnumC1756170vnj("PREVIEW", 2, "preview");
        PREVIEW = enumC1756170vnj3;
        EnumC1756170vnj enumC1756170vnj4 = new EnumC1756170vnj("BATCH_PRELOAD", 3, "batch_preload");
        BATCH_PRELOAD = enumC1756170vnj4;
        EnumC1756170vnj enumC1756170vnj5 = new EnumC1756170vnj("CACHE", 4, "cache");
        CACHE = enumC1756170vnj5;
        EnumC1756170vnj[] enumC1756170vnjArr = {enumC1756170vnj, enumC1756170vnj2, enumC1756170vnj3, enumC1756170vnj4, enumC1756170vnj5};
        LLILLJJLI = enumC1756170vnjArr;
        LLILLL = new C2254308sP(enumC1756170vnjArr);
    }

    public static EnumC1756170vnj[] values() {
        return (EnumC1756170vnj[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1756170vnj valueOf(String str) {
        return (EnumC1756170vnj) C08FF.LIZ(EnumC1756170vnj.class, str);
    }

    public EnumC1756170vnj(String str, int i, String str2) {
        this.LL = str2;
    }
}
