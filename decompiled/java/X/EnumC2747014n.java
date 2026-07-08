package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.014n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2747014n {
    public static final EnumC2747014n HOMEPAGE_HOT;
    public static final /* synthetic */ EnumC2747014n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2747014n OTHERS_HOMEPAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2747014n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2747014n enumC2747014n = new EnumC2747014n("HOMEPAGE_HOT", 0, "homepage_hot");
        HOMEPAGE_HOT = enumC2747014n;
        EnumC2747014n enumC2747014n2 = new EnumC2747014n("OTHERS_HOMEPAGE", 1, "others_homepage");
        OTHERS_HOMEPAGE = enumC2747014n2;
        EnumC2747014n[] enumC2747014nArr = {enumC2747014n, enumC2747014n2};
        LLILLJJLI = enumC2747014nArr;
        LLILLL = new C2254308sP(enumC2747014nArr);
    }

    public static EnumC2747014n[] values() {
        return (EnumC2747014n[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2747014n valueOf(String str) {
        return (EnumC2747014n) C08FF.LIZ(EnumC2747014n.class, str);
    }

    public EnumC2747014n(String str, int i, String str2) {
        this.LL = str2;
    }
}
