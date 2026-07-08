package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440430HOv {
    public static final EnumC440430HOv DISCARD;
    public static final /* synthetic */ EnumC440430HOv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440430HOv SHOW;
    public static final EnumC440430HOv VIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440430HOv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440430HOv enumC440430HOv = new EnumC440430HOv("SHOW", 0, "show");
        SHOW = enumC440430HOv;
        EnumC440430HOv enumC440430HOv2 = new EnumC440430HOv("DISCARD", 1, "discard");
        DISCARD = enumC440430HOv2;
        EnumC440430HOv enumC440430HOv3 = new EnumC440430HOv("VIEW", 2, "view");
        VIEW = enumC440430HOv3;
        EnumC440430HOv[] enumC440430HOvArr = {enumC440430HOv, enumC440430HOv2, enumC440430HOv3};
        LLILLJJLI = enumC440430HOvArr;
        LLILLL = new C2254308sP(enumC440430HOvArr);
    }

    public static EnumC440430HOv[] values() {
        return (EnumC440430HOv[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440430HOv valueOf(String str) {
        return (EnumC440430HOv) C08FF.LIZ(EnumC440430HOv.class, str);
    }

    public EnumC440430HOv(String str, int i, String str2) {
        this.LL = str2;
    }
}
