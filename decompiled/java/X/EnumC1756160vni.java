package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756160vni {
    public static final EnumC1756160vni BATCH_PRELOAD;
    public static final EnumC1756160vni CACHE;
    public static final /* synthetic */ EnumC1756160vni[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1756160vni LOADING;
    public static final EnumC1756160vni PREVIEW;
    public static final EnumC1756160vni UNDEFINE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1756160vni> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1756160vni enumC1756160vni = new EnumC1756160vni("UNDEFINE", 0, "undefine");
        UNDEFINE = enumC1756160vni;
        EnumC1756160vni enumC1756160vni2 = new EnumC1756160vni("LOADING", 1, "loading");
        LOADING = enumC1756160vni2;
        EnumC1756160vni enumC1756160vni3 = new EnumC1756160vni("PREVIEW", 2, "preview");
        PREVIEW = enumC1756160vni3;
        EnumC1756160vni enumC1756160vni4 = new EnumC1756160vni("BATCH_PRELOAD", 3, "batch_preload");
        BATCH_PRELOAD = enumC1756160vni4;
        EnumC1756160vni enumC1756160vni5 = new EnumC1756160vni("CACHE", 4, "cache");
        CACHE = enumC1756160vni5;
        EnumC1756160vni[] enumC1756160vniArr = {enumC1756160vni, enumC1756160vni2, enumC1756160vni3, enumC1756160vni4, enumC1756160vni5};
        LLILLJJLI = enumC1756160vniArr;
        LLILLL = new C2254308sP(enumC1756160vniArr);
    }

    public static EnumC1756160vni[] values() {
        return (EnumC1756160vni[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1756160vni valueOf(String str) {
        return (EnumC1756160vni) C08FF.LIZ(EnumC1756160vni.class, str);
    }

    public EnumC1756160vni(String str, int i, String str2) {
        this.LL = str2;
    }
}
