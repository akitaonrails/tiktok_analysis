package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.12zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19937712zf {
    public static final EnumC19937712zf BOOL;
    public static final EnumC19937712zf BYTES;
    public static final EnumC19937712zf DOUBLE;
    public static final EnumC19937712zf ENUM;
    public static final EnumC19937712zf FIXED32;
    public static final EnumC19937712zf FIXED64;
    public static final EnumC19937712zf FLOAT;
    public static final EnumC19937712zf GROUP;
    public static final EnumC19937712zf INT32;
    public static final EnumC19937712zf INT64;
    public static final /* synthetic */ EnumC19937712zf[] LLILLJJLI;
    public static final EnumC19937712zf MESSAGE;
    public static final EnumC19937712zf SFIXED32;
    public static final EnumC19937712zf SFIXED64;
    public static final EnumC19937712zf SINT32;
    public static final EnumC19937712zf SINT64;
    public static final EnumC19937712zf STRING;
    public static final EnumC19937712zf UINT32;
    public static final EnumC19937712zf UINT64;
    public static final EnumC19937712zf[] types;
    public final EnumC19937812zg LL;

    static {
        EnumC19937712zf enumC19937712zf = new EnumC19937712zf("DOUBLE", 0, EnumC19937812zg.DOUBLE);
        DOUBLE = enumC19937712zf;
        EnumC19937712zf enumC19937712zf2 = new EnumC19937712zf("FLOAT", 1, EnumC19937812zg.FLOAT);
        FLOAT = enumC19937712zf2;
        EnumC19937812zg enumC19937812zg = EnumC19937812zg.LONG;
        EnumC19937712zf enumC19937712zf3 = new EnumC19937712zf("INT64", 2, enumC19937812zg);
        INT64 = enumC19937712zf3;
        EnumC19937712zf enumC19937712zf4 = new EnumC19937712zf("UINT64", 3, enumC19937812zg);
        UINT64 = enumC19937712zf4;
        EnumC19937812zg enumC19937812zg2 = EnumC19937812zg.INT;
        EnumC19937712zf enumC19937712zf5 = new EnumC19937712zf("INT32", 4, enumC19937812zg2);
        INT32 = enumC19937712zf5;
        EnumC19937712zf enumC19937712zf6 = new EnumC19937712zf("FIXED64", 5, enumC19937812zg);
        FIXED64 = enumC19937712zf6;
        EnumC19937712zf enumC19937712zf7 = new EnumC19937712zf("FIXED32", 6, enumC19937812zg2);
        FIXED32 = enumC19937712zf7;
        EnumC19937712zf enumC19937712zf8 = new EnumC19937712zf("BOOL", 7, EnumC19937812zg.BOOLEAN);
        BOOL = enumC19937712zf8;
        EnumC19937712zf enumC19937712zf9 = new EnumC19937712zf("STRING", 8, EnumC19937812zg.STRING);
        STRING = enumC19937712zf9;
        EnumC19937812zg enumC19937812zg3 = EnumC19937812zg.MESSAGE;
        EnumC19937712zf enumC19937712zf10 = new EnumC19937712zf("GROUP", 9, enumC19937812zg3);
        GROUP = enumC19937712zf10;
        EnumC19937712zf enumC19937712zf11 = new EnumC19937712zf("MESSAGE", 10, enumC19937812zg3);
        MESSAGE = enumC19937712zf11;
        EnumC19937712zf enumC19937712zf12 = new EnumC19937712zf("BYTES", 11, EnumC19937812zg.BYTE_STRING);
        BYTES = enumC19937712zf12;
        EnumC19937712zf enumC19937712zf13 = new EnumC19937712zf("UINT32", 12, enumC19937812zg2);
        UINT32 = enumC19937712zf13;
        EnumC19937712zf enumC19937712zf14 = new EnumC19937712zf("ENUM", 13, EnumC19937812zg.ENUM);
        ENUM = enumC19937712zf14;
        EnumC19937712zf enumC19937712zf15 = new EnumC19937712zf("SFIXED32", 14, enumC19937812zg2);
        SFIXED32 = enumC19937712zf15;
        EnumC19937712zf enumC19937712zf16 = new EnumC19937712zf("SFIXED64", 15, enumC19937812zg);
        SFIXED64 = enumC19937712zf16;
        EnumC19937712zf enumC19937712zf17 = new EnumC19937712zf("SINT32", 16, enumC19937812zg2);
        SINT32 = enumC19937712zf17;
        EnumC19937712zf enumC19937712zf18 = new EnumC19937712zf("SINT64", 17, enumC19937812zg);
        SINT64 = enumC19937712zf18;
        LLILLJJLI = new EnumC19937712zf[]{enumC19937712zf, enumC19937712zf2, enumC19937712zf3, enumC19937712zf4, enumC19937712zf5, enumC19937712zf6, enumC19937712zf7, enumC19937712zf8, enumC19937712zf9, enumC19937712zf10, enumC19937712zf11, enumC19937712zf12, enumC19937712zf13, enumC19937712zf14, enumC19937712zf15, enumC19937712zf16, enumC19937712zf17, enumC19937712zf18};
        types = values();
    }

    public static EnumC19937712zf[] values() {
        return (EnumC19937712zf[]) LLILLJJLI.clone();
    }

    public C130D toProto() {
        return C130D.forNumber(ordinal() + 1);
    }

    public EnumC19937812zg getJavaType() {
        return this.LL;
    }

    public static EnumC19937712zf valueOf(C130D c130d) {
        return types[c130d.getNumber() - 1];
    }

    public static EnumC19937712zf valueOf(String str) {
        return (EnumC19937712zf) C08FF.LIZ(EnumC19937712zf.class, str);
    }

    public EnumC19937712zf(String str, int i, EnumC19937812zg enumC19937812zg) {
        this.LL = enumC19937812zg;
    }
}
