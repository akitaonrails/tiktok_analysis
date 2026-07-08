package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1522810pjL {
    public static final EnumC1522810pjL DECODE;
    public static final EnumC1522810pjL DOWNLOAD;
    public static final /* synthetic */ EnumC1522810pjL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1522810pjL PARSE;
    public static final EnumC1522810pjL STREAM;
    public static final EnumC1522810pjL TYPE;
    public static final EnumC1522810pjL UNKNOWN_EXCEPTION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1522810pjL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1522810pjL enumC1522810pjL = new EnumC1522810pjL("PARSE", 0, 0);
        PARSE = enumC1522810pjL;
        EnumC1522810pjL enumC1522810pjL2 = new EnumC1522810pjL("DOWNLOAD", 1, 1);
        DOWNLOAD = enumC1522810pjL2;
        EnumC1522810pjL enumC1522810pjL3 = new EnumC1522810pjL("TYPE", 2, 2);
        TYPE = enumC1522810pjL3;
        EnumC1522810pjL enumC1522810pjL4 = new EnumC1522810pjL("DECODE", 3, 3);
        DECODE = enumC1522810pjL4;
        EnumC1522810pjL enumC1522810pjL5 = new EnumC1522810pjL("STREAM", 4, 4);
        STREAM = enumC1522810pjL5;
        EnumC1522810pjL enumC1522810pjL6 = new EnumC1522810pjL("UNKNOWN_EXCEPTION", 5, 5);
        UNKNOWN_EXCEPTION = enumC1522810pjL6;
        EnumC1522810pjL[] enumC1522810pjLArr = {enumC1522810pjL, enumC1522810pjL2, enumC1522810pjL3, enumC1522810pjL4, enumC1522810pjL5, enumC1522810pjL6};
        LLILLJJLI = enumC1522810pjLArr;
        LLILLL = new C2254308sP(enumC1522810pjLArr);
    }

    public static EnumC1522810pjL[] values() {
        return (EnumC1522810pjL[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1522810pjL valueOf(String str) {
        return (EnumC1522810pjL) C08FF.LIZ(EnumC1522810pjL.class, str);
    }

    public EnumC1522810pjL(String str, int i, int i2) {
        this.LL = i2;
    }
}
