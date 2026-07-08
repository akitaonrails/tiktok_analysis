package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1534705zd {
    public static final EnumC1534705zd INNER_CACHE;
    public static final /* synthetic */ EnumC1534705zd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1534705zd PRELOADER;
    public static final EnumC1534705zd SCHEMA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1534705zd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1534705zd enumC1534705zd = new EnumC1534705zd("INNER_CACHE", 0, "inner_cache");
        INNER_CACHE = enumC1534705zd;
        EnumC1534705zd enumC1534705zd2 = new EnumC1534705zd("SCHEMA", 1, "schema");
        SCHEMA = enumC1534705zd2;
        EnumC1534705zd enumC1534705zd3 = new EnumC1534705zd("PRELOADER", 2, "preloader");
        PRELOADER = enumC1534705zd3;
        EnumC1534705zd[] enumC1534705zdArr = {enumC1534705zd, enumC1534705zd2, enumC1534705zd3};
        LLILLJJLI = enumC1534705zdArr;
        LLILLL = new C2254308sP(enumC1534705zdArr);
    }

    public static EnumC1534705zd[] values() {
        return (EnumC1534705zd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1534705zd valueOf(String str) {
        return (EnumC1534705zd) C08FF.LIZ(EnumC1534705zd.class, str);
    }

    public EnumC1534705zd(String str, int i, String str2) {
        this.LL = str2;
    }
}
