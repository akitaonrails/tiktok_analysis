package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356120Dxi {
    public static final EnumC356120Dxi CANCELED;
    public static final EnumC356120Dxi FAILED;
    public static final /* synthetic */ EnumC356120Dxi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356120Dxi MATTING;
    public static final EnumC356120Dxi NONE;
    public static final EnumC356120Dxi SUCCESS;

    public static InterfaceC2044707zh<EnumC356120Dxi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356120Dxi enumC356120Dxi = new EnumC356120Dxi("NONE", 0);
        NONE = enumC356120Dxi;
        EnumC356120Dxi enumC356120Dxi2 = new EnumC356120Dxi("MATTING", 1);
        MATTING = enumC356120Dxi2;
        EnumC356120Dxi enumC356120Dxi3 = new EnumC356120Dxi("SUCCESS", 2);
        SUCCESS = enumC356120Dxi3;
        EnumC356120Dxi enumC356120Dxi4 = new EnumC356120Dxi("FAILED", 3);
        FAILED = enumC356120Dxi4;
        EnumC356120Dxi enumC356120Dxi5 = new EnumC356120Dxi("CANCELED", 4);
        CANCELED = enumC356120Dxi5;
        EnumC356120Dxi[] enumC356120DxiArr = {enumC356120Dxi, enumC356120Dxi2, enumC356120Dxi3, enumC356120Dxi4, enumC356120Dxi5};
        LL = enumC356120DxiArr;
        LLILLJJLI = new C2254308sP(enumC356120DxiArr);
    }

    public static EnumC356120Dxi[] values() {
        return (EnumC356120Dxi[]) LL.clone();
    }

    public static EnumC356120Dxi valueOf(String str) {
        return (EnumC356120Dxi) C08FF.LIZ(EnumC356120Dxi.class, str);
    }

    public EnumC356120Dxi(String str, int i) {
    }
}
