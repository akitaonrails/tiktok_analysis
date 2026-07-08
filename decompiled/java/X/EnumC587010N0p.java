package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587010N0p {
    public static final /* synthetic */ EnumC587010N0p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587010N0p NONE;
    public static final EnumC587010N0p TYPE_TUX_ICON;
    public static final EnumC587010N0p TYPE_TUX_LOTTIE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587010N0p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587010N0p enumC587010N0p = new EnumC587010N0p("NONE", 0, 0);
        NONE = enumC587010N0p;
        EnumC587010N0p enumC587010N0p2 = new EnumC587010N0p("TYPE_TUX_LOTTIE", 1, 1);
        TYPE_TUX_LOTTIE = enumC587010N0p2;
        EnumC587010N0p enumC587010N0p3 = new EnumC587010N0p("TYPE_TUX_ICON", 2, 2);
        TYPE_TUX_ICON = enumC587010N0p3;
        EnumC587010N0p[] enumC587010N0pArr = {enumC587010N0p, enumC587010N0p2, enumC587010N0p3};
        LLILLJJLI = enumC587010N0pArr;
        LLILLL = new C2254308sP(enumC587010N0pArr);
    }

    public static EnumC587010N0p[] values() {
        return (EnumC587010N0p[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC587010N0p valueOf(String str) {
        return (EnumC587010N0p) C08FF.LIZ(EnumC587010N0p.class, str);
    }

    public EnumC587010N0p(String str, int i, int i2) {
        this.LL = i2;
    }
}
