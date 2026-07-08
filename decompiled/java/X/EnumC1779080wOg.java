package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779080wOg {
    public static final EnumC1779080wOg HIDE_ITEM;
    public static final /* synthetic */ EnumC1779080wOg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779080wOg SHOW_DOUBLE_COUPONS;
    public static final EnumC1779080wOg SHOW_ONE_COUPONS;

    public static InterfaceC2044707zh<EnumC1779080wOg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779080wOg enumC1779080wOg = new EnumC1779080wOg("HIDE_ITEM", 0);
        HIDE_ITEM = enumC1779080wOg;
        EnumC1779080wOg enumC1779080wOg2 = new EnumC1779080wOg("SHOW_ONE_COUPONS", 1);
        SHOW_ONE_COUPONS = enumC1779080wOg2;
        EnumC1779080wOg enumC1779080wOg3 = new EnumC1779080wOg("SHOW_DOUBLE_COUPONS", 2);
        SHOW_DOUBLE_COUPONS = enumC1779080wOg3;
        EnumC1779080wOg[] enumC1779080wOgArr = {enumC1779080wOg, enumC1779080wOg2, enumC1779080wOg3};
        LL = enumC1779080wOgArr;
        LLILLJJLI = new C2254308sP(enumC1779080wOgArr);
    }

    public static EnumC1779080wOg[] values() {
        return (EnumC1779080wOg[]) LL.clone();
    }

    public static EnumC1779080wOg valueOf(String str) {
        return (EnumC1779080wOg) C08FF.LIZ(EnumC1779080wOg.class, str);
    }

    public EnumC1779080wOg(String str, int i) {
    }
}
