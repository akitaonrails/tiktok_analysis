package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1406660mi0 {
    public static final EnumC1406660mi0 IMAGE;
    public static final /* synthetic */ EnumC1406660mi0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1406660mi0 RICH_TEXT;
    public static final EnumC1406660mi0 XL_TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1406660mi0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1406660mi0 enumC1406660mi0 = new EnumC1406660mi0("IMAGE", 0, 1);
        IMAGE = enumC1406660mi0;
        EnumC1406660mi0 enumC1406660mi02 = new EnumC1406660mi0("RICH_TEXT", 1, 2);
        RICH_TEXT = enumC1406660mi02;
        EnumC1406660mi0 enumC1406660mi03 = new EnumC1406660mi0("XL_TEXT", 2, 3);
        XL_TEXT = enumC1406660mi03;
        EnumC1406660mi0[] enumC1406660mi0Arr = {enumC1406660mi0, enumC1406660mi02, enumC1406660mi03};
        LLILLJJLI = enumC1406660mi0Arr;
        LLILLL = new C2254308sP(enumC1406660mi0Arr);
    }

    public static EnumC1406660mi0[] values() {
        return (EnumC1406660mi0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1406660mi0 valueOf(String str) {
        return (EnumC1406660mi0) C08FF.LIZ(EnumC1406660mi0.class, str);
    }

    public EnumC1406660mi0(String str, int i, int i2) {
        this.LL = i2;
    }
}
