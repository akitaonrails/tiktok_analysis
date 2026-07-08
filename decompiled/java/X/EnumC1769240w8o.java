package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1769240w8o {
    public static final /* synthetic */ EnumC1769240w8o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1769240w8o NORMAL;
    public static final EnumC1769240w8o NUMBER;
    public static final EnumC1769240w8o TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1769240w8o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1769240w8o enumC1769240w8o = new EnumC1769240w8o("NORMAL", 0, 1);
        NORMAL = enumC1769240w8o;
        EnumC1769240w8o enumC1769240w8o2 = new EnumC1769240w8o("NUMBER", 1, 2);
        NUMBER = enumC1769240w8o2;
        EnumC1769240w8o enumC1769240w8o3 = new EnumC1769240w8o("TEXT", 2, 3);
        TEXT = enumC1769240w8o3;
        EnumC1769240w8o[] enumC1769240w8oArr = {enumC1769240w8o, enumC1769240w8o2, enumC1769240w8o3};
        LLILLJJLI = enumC1769240w8oArr;
        LLILLL = new C2254308sP(enumC1769240w8oArr);
    }

    public static EnumC1769240w8o[] values() {
        return (EnumC1769240w8o[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1769240w8o valueOf(String str) {
        return (EnumC1769240w8o) C08FF.LIZ(EnumC1769240w8o.class, str);
    }

    public EnumC1769240w8o(String str, int i, int i2) {
        this.LL = i2;
    }
}
