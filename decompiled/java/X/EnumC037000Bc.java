package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC037000Bc {
    public static final EnumC037000Bc DEBUG;
    public static final EnumC037000Bc ERROR;
    public static final EnumC037000Bc INFO;
    public static final /* synthetic */ EnumC037000Bc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC037000Bc WARNING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC037000Bc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC037000Bc enumC037000Bc = new EnumC037000Bc("DEBUG", 0, 3);
        DEBUG = enumC037000Bc;
        EnumC037000Bc enumC037000Bc2 = new EnumC037000Bc("INFO", 1, 4);
        INFO = enumC037000Bc2;
        EnumC037000Bc enumC037000Bc3 = new EnumC037000Bc("WARNING", 2, 5);
        WARNING = enumC037000Bc3;
        EnumC037000Bc enumC037000Bc4 = new EnumC037000Bc("ERROR", 3, 6);
        ERROR = enumC037000Bc4;
        EnumC037000Bc[] enumC037000BcArr = {enumC037000Bc, enumC037000Bc2, enumC037000Bc3, enumC037000Bc4};
        LLILLJJLI = enumC037000BcArr;
        LLILLL = new C2254308sP(enumC037000BcArr);
    }

    public static EnumC037000Bc[] values() {
        return (EnumC037000Bc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC037000Bc valueOf(String str) {
        return (EnumC037000Bc) C08FF.LIZ(EnumC037000Bc.class, str);
    }

    public EnumC037000Bc(String str, int i, int i2) {
        this.LL = i2;
    }
}
