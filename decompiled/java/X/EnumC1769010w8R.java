package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1769010w8R {
    public static final EnumC1769010w8R HIDE;
    public static final /* synthetic */ EnumC1769010w8R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1769010w8R SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1769010w8R> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1769010w8R enumC1769010w8R = new EnumC1769010w8R("HIDE", 0, 0);
        HIDE = enumC1769010w8R;
        EnumC1769010w8R enumC1769010w8R2 = new EnumC1769010w8R("SHOW", 1, 1);
        SHOW = enumC1769010w8R2;
        EnumC1769010w8R[] enumC1769010w8RArr = {enumC1769010w8R, enumC1769010w8R2};
        LLILLJJLI = enumC1769010w8RArr;
        LLILLL = new C2254308sP(enumC1769010w8RArr);
    }

    public static EnumC1769010w8R[] values() {
        return (EnumC1769010w8R[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1769010w8R valueOf(String str) {
        return (EnumC1769010w8R) C08FF.LIZ(EnumC1769010w8R.class, str);
    }

    public EnumC1769010w8R(String str, int i, int i2) {
        this.LL = i2;
    }
}
