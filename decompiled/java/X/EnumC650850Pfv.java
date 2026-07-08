package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC650850Pfv {
    public static final EnumC650850Pfv BOTTOM_TO_TOP;
    public static final /* synthetic */ EnumC650850Pfv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC650850Pfv TOP_TO_BOTTOM;

    public static InterfaceC2044707zh<EnumC650850Pfv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC650850Pfv enumC650850Pfv = new EnumC650850Pfv("TOP_TO_BOTTOM", 0);
        TOP_TO_BOTTOM = enumC650850Pfv;
        EnumC650850Pfv enumC650850Pfv2 = new EnumC650850Pfv("BOTTOM_TO_TOP", 1);
        BOTTOM_TO_TOP = enumC650850Pfv2;
        EnumC650850Pfv[] enumC650850PfvArr = {enumC650850Pfv, enumC650850Pfv2};
        LL = enumC650850PfvArr;
        LLILLJJLI = new C2254308sP(enumC650850PfvArr);
    }

    public static EnumC650850Pfv[] values() {
        return (EnumC650850Pfv[]) LL.clone();
    }

    public static EnumC650850Pfv valueOf(String str) {
        return (EnumC650850Pfv) C08FF.LIZ(EnumC650850Pfv.class, str);
    }

    public EnumC650850Pfv(String str, int i) {
    }
}
