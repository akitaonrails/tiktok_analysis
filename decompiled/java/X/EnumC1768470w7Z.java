package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768470w7Z {
    public static final EnumC1768470w7Z AFTER_CACHE;
    public static final EnumC1768470w7Z BEFORE_MALL;
    public static final EnumC1768470w7Z CLICK_TAB;
    public static final /* synthetic */ EnumC1768470w7Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768470w7Z NO_CACHE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1768470w7Z> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768470w7Z enumC1768470w7Z = new EnumC1768470w7Z("BEFORE_MALL", 0, "before_mall");
        BEFORE_MALL = enumC1768470w7Z;
        EnumC1768470w7Z enumC1768470w7Z2 = new EnumC1768470w7Z("AFTER_CACHE", 1, "after_cache");
        AFTER_CACHE = enumC1768470w7Z2;
        EnumC1768470w7Z enumC1768470w7Z3 = new EnumC1768470w7Z("NO_CACHE", 2, "no_cache");
        NO_CACHE = enumC1768470w7Z3;
        EnumC1768470w7Z enumC1768470w7Z4 = new EnumC1768470w7Z("CLICK_TAB", 3, "click_tab");
        CLICK_TAB = enumC1768470w7Z4;
        EnumC1768470w7Z[] enumC1768470w7ZArr = {enumC1768470w7Z, enumC1768470w7Z2, enumC1768470w7Z3, enumC1768470w7Z4};
        LLILLJJLI = enumC1768470w7ZArr;
        LLILLL = new C2254308sP(enumC1768470w7ZArr);
    }

    public static EnumC1768470w7Z[] values() {
        return (EnumC1768470w7Z[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1768470w7Z valueOf(String str) {
        return (EnumC1768470w7Z) C08FF.LIZ(EnumC1768470w7Z.class, str);
    }

    public EnumC1768470w7Z(String str, int i, String str2) {
        this.LL = str2;
    }
}
