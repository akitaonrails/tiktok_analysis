package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587230N1l {
    public static final EnumC587230N1l CLICK_TO_SHOP;
    public static final /* synthetic */ EnumC587230N1l[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587230N1l ROUTE_TO_SHOP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC587230N1l> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587230N1l enumC587230N1l = new EnumC587230N1l("CLICK_TO_SHOP", 0, "1");
        CLICK_TO_SHOP = enumC587230N1l;
        EnumC587230N1l enumC587230N1l2 = new EnumC587230N1l("ROUTE_TO_SHOP", 1, "2");
        ROUTE_TO_SHOP = enumC587230N1l2;
        EnumC587230N1l[] enumC587230N1lArr = {enumC587230N1l, enumC587230N1l2};
        LLILLJJLI = enumC587230N1lArr;
        LLILLL = new C2254308sP(enumC587230N1lArr);
    }

    public static EnumC587230N1l[] values() {
        return (EnumC587230N1l[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC587230N1l valueOf(String str) {
        return (EnumC587230N1l) C08FF.LIZ(EnumC587230N1l.class, str);
    }

    public EnumC587230N1l(String str, int i, String str2) {
        this.LL = str2;
    }
}
