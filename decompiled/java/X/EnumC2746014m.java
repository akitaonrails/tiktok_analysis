package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.014m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2746014m {
    public static final EnumC2746014m HOMEPAGE_HOT;
    public static final /* synthetic */ EnumC2746014m[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2746014m OTHERS_HOMEPAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2746014m> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2746014m enumC2746014m = new EnumC2746014m("HOMEPAGE_HOT", 0, "homepage_hot");
        HOMEPAGE_HOT = enumC2746014m;
        EnumC2746014m enumC2746014m2 = new EnumC2746014m("OTHERS_HOMEPAGE", 1, "others_homepage");
        OTHERS_HOMEPAGE = enumC2746014m2;
        EnumC2746014m[] enumC2746014mArr = {enumC2746014m, enumC2746014m2};
        LLILLJJLI = enumC2746014mArr;
        LLILLL = new C2254308sP(enumC2746014mArr);
    }

    public static EnumC2746014m[] values() {
        return (EnumC2746014m[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2746014m valueOf(String str) {
        return (EnumC2746014m) C08FF.LIZ(EnumC2746014m.class, str);
    }

    public EnumC2746014m(String str, int i, String str2) {
        this.LL = str2;
    }
}
