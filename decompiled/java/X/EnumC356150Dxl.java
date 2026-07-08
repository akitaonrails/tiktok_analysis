package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356150Dxl {
    public static final EnumC356150Dxl ERASER;
    public static final /* synthetic */ EnumC356150Dxl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356150Dxl NORMAL;
    public static final EnumC356150Dxl QUICK;

    public static InterfaceC2044707zh<EnumC356150Dxl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356150Dxl enumC356150Dxl = new EnumC356150Dxl("QUICK", 0);
        QUICK = enumC356150Dxl;
        EnumC356150Dxl enumC356150Dxl2 = new EnumC356150Dxl("NORMAL", 1);
        NORMAL = enumC356150Dxl2;
        EnumC356150Dxl enumC356150Dxl3 = new EnumC356150Dxl("ERASER", 2);
        ERASER = enumC356150Dxl3;
        EnumC356150Dxl[] enumC356150DxlArr = {enumC356150Dxl, enumC356150Dxl2, enumC356150Dxl3};
        LL = enumC356150DxlArr;
        LLILLJJLI = new C2254308sP(enumC356150DxlArr);
    }

    public static EnumC356150Dxl[] values() {
        return (EnumC356150Dxl[]) LL.clone();
    }

    public static EnumC356150Dxl valueOf(String str) {
        return (EnumC356150Dxl) C08FF.LIZ(EnumC356150Dxl.class, str);
    }

    public EnumC356150Dxl(String str, int i) {
    }
}
