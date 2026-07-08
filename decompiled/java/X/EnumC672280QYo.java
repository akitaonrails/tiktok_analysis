package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672280QYo {
    public static final EnumC672280QYo BEFORE_SEARCH_NO_CACHE;
    public static final EnumC672280QYo BEFORE_SEARCH_USE_UNIQUE_CACHE;
    public static final /* synthetic */ EnumC672280QYo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC672280QYo NO_CACHE;
    public static final EnumC672280QYo USE_COMMON_CACHE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC672280QYo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC672280QYo enumC672280QYo = new EnumC672280QYo("NO_CACHE", 0, "no_cache");
        NO_CACHE = enumC672280QYo;
        EnumC672280QYo enumC672280QYo2 = new EnumC672280QYo("USE_COMMON_CACHE", 1, "use_common_cache");
        USE_COMMON_CACHE = enumC672280QYo2;
        EnumC672280QYo enumC672280QYo3 = new EnumC672280QYo("BEFORE_SEARCH_NO_CACHE", 2, "before_search_no_cache");
        BEFORE_SEARCH_NO_CACHE = enumC672280QYo3;
        EnumC672280QYo enumC672280QYo4 = new EnumC672280QYo("BEFORE_SEARCH_USE_UNIQUE_CACHE", 3, "before_search_use_unique_cache");
        BEFORE_SEARCH_USE_UNIQUE_CACHE = enumC672280QYo4;
        EnumC672280QYo[] enumC672280QYoArr = {enumC672280QYo, enumC672280QYo2, enumC672280QYo3, enumC672280QYo4};
        LLILLJJLI = enumC672280QYoArr;
        LLILLL = new C2254308sP(enumC672280QYoArr);
    }

    public static EnumC672280QYo[] values() {
        return (EnumC672280QYo[]) LLILLJJLI.clone();
    }

    public final String getCacheStrategy() {
        return this.LL;
    }

    public static EnumC672280QYo valueOf(String str) {
        return (EnumC672280QYo) C08FF.LIZ(EnumC672280QYo.class, str);
    }

    public EnumC672280QYo(String str, int i, String str2) {
        this.LL = str2;
    }
}
