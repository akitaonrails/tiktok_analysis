package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587610N2x {
    public static final EnumC587610N2x COLOR_PICKER;
    public static final EnumC587610N2x GRID;
    public static final /* synthetic */ EnumC587610N2x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC587610N2x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC587610N2x enumC587610N2x = new EnumC587610N2x("COLOR_PICKER", 0);
        COLOR_PICKER = enumC587610N2x;
        EnumC587610N2x enumC587610N2x2 = new EnumC587610N2x("GRID", 1);
        GRID = enumC587610N2x2;
        EnumC587610N2x[] enumC587610N2xArr = {enumC587610N2x, enumC587610N2x2};
        LL = enumC587610N2xArr;
        LLILLJJLI = new C2254308sP(enumC587610N2xArr);
    }

    public static EnumC587610N2x[] values() {
        return (EnumC587610N2x[]) LL.clone();
    }

    public static EnumC587610N2x valueOf(String str) {
        return (EnumC587610N2x) C08FF.LIZ(EnumC587610N2x.class, str);
    }

    public EnumC587610N2x(String str, int i) {
    }
}
