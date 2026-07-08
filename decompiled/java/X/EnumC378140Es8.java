package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Es8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC378140Es8 {
    public static final /* synthetic */ EnumC378140Es8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC378140Es8 NONE;
    public static final EnumC378140Es8 STYLIZED_FL2V;
    public static final EnumC378140Es8 STYLIZED_I2V;
    public final int LL;

    public static InterfaceC2044707zh<EnumC378140Es8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC378140Es8 enumC378140Es8 = new EnumC378140Es8("NONE", 0, 0);
        NONE = enumC378140Es8;
        EnumC378140Es8 enumC378140Es82 = new EnumC378140Es8("STYLIZED_I2V", 1, 1);
        STYLIZED_I2V = enumC378140Es82;
        EnumC378140Es8 enumC378140Es83 = new EnumC378140Es8("STYLIZED_FL2V", 2, 2);
        STYLIZED_FL2V = enumC378140Es83;
        EnumC378140Es8[] enumC378140Es8Arr = {enumC378140Es8, enumC378140Es82, enumC378140Es83};
        LLILLJJLI = enumC378140Es8Arr;
        LLILLL = new C2254308sP(enumC378140Es8Arr);
    }

    public static EnumC378140Es8[] values() {
        return (EnumC378140Es8[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC378140Es8 valueOf(String str) {
        return (EnumC378140Es8) C08FF.LIZ(EnumC378140Es8.class, str);
    }

    public EnumC378140Es8(String str, int i, int i2) {
        this.LL = i2;
    }
}
