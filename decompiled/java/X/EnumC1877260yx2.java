package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1877260yx2 {
    public static final EnumC1877260yx2 BANNER;
    public static final EnumC1877260yx2 BUTTON;
    public static final /* synthetic */ EnumC1877260yx2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1877260yx2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1877260yx2 enumC1877260yx2 = new EnumC1877260yx2("BUTTON", 0, "Button");
        BUTTON = enumC1877260yx2;
        EnumC1877260yx2 enumC1877260yx22 = new EnumC1877260yx2("BANNER", 1, "Banner");
        BANNER = enumC1877260yx22;
        EnumC1877260yx2[] enumC1877260yx2Arr = {enumC1877260yx2, enumC1877260yx22};
        LLILLJJLI = enumC1877260yx2Arr;
        LLILLL = new C2254308sP(enumC1877260yx2Arr);
    }

    public static EnumC1877260yx2[] values() {
        return (EnumC1877260yx2[]) LLILLJJLI.clone();
    }

    public final String getEtValue() {
        return this.LL;
    }

    public static EnumC1877260yx2 valueOf(String str) {
        return (EnumC1877260yx2) C08FF.LIZ(EnumC1877260yx2.class, str);
    }

    public EnumC1877260yx2(String str, int i, String str2) {
        this.LL = str2;
    }
}
