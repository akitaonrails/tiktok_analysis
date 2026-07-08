package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Myc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586000Myc {
    public static final EnumC586000Myc CLICK_PRODUCTS;
    public static final /* synthetic */ EnumC586000Myc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC586000Myc OPEN_BOARDS;

    public static InterfaceC2044707zh<EnumC586000Myc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586000Myc enumC586000Myc = new EnumC586000Myc("OPEN_BOARDS", 0);
        OPEN_BOARDS = enumC586000Myc;
        EnumC586000Myc enumC586000Myc2 = new EnumC586000Myc("CLICK_PRODUCTS", 1);
        CLICK_PRODUCTS = enumC586000Myc2;
        EnumC586000Myc[] enumC586000MycArr = {enumC586000Myc, enumC586000Myc2};
        LL = enumC586000MycArr;
        LLILLJJLI = new C2254308sP(enumC586000MycArr);
    }

    public static EnumC586000Myc[] values() {
        return (EnumC586000Myc[]) LL.clone();
    }

    public static EnumC586000Myc valueOf(String str) {
        return (EnumC586000Myc) C08FF.LIZ(EnumC586000Myc.class, str);
    }

    public EnumC586000Myc(String str, int i) {
    }
}
