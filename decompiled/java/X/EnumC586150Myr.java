package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Myr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586150Myr {
    public static final /* synthetic */ EnumC586150Myr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586150Myr LYNX_PDP_CASHIER;
    public static final EnumC586150Myr REUSE_SAME_DATA_CASHIER;

    public static InterfaceC2044707zh<EnumC586150Myr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586150Myr enumC586150Myr = new EnumC586150Myr("REUSE_SAME_DATA_CASHIER", 0);
        REUSE_SAME_DATA_CASHIER = enumC586150Myr;
        EnumC586150Myr enumC586150Myr2 = new EnumC586150Myr("LYNX_PDP_CASHIER", 1);
        LYNX_PDP_CASHIER = enumC586150Myr2;
        EnumC586150Myr[] enumC586150MyrArr = {enumC586150Myr, enumC586150Myr2};
        LL = enumC586150MyrArr;
        LLILLJJLI = new C2254308sP(enumC586150MyrArr);
    }

    public static EnumC586150Myr[] values() {
        return (EnumC586150Myr[]) LL.clone();
    }

    public static EnumC586150Myr valueOf(String str) {
        return (EnumC586150Myr) C08FF.LIZ(EnumC586150Myr.class, str);
    }

    public EnumC586150Myr(String str, int i) {
    }
}
