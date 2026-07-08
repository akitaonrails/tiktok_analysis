package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.12zY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19937012zY {
    public static final EnumC19937012zY[] LLILLJJLI;
    public static final /* synthetic */ EnumC19937012zY[] LLILLL;
    public static final EnumC19937012zY zza;
    public static final EnumC19937012zY zzb;
    public final int LL;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC19937012zY EF3;

    static {
        EnumC19938712zp enumC19938712zp = EnumC19938712zp.SCALAR;
        EnumC19937412zc enumC19937412zc = EnumC19937412zc.DOUBLE;
        EnumC19937012zY enumC19937012zY = new EnumC19937012zY("DOUBLE", 0, 0, enumC19938712zp, enumC19937412zc);
        EnumC19937412zc enumC19937412zc2 = EnumC19937412zc.FLOAT;
        EnumC19937012zY enumC19937012zY2 = new EnumC19937012zY("FLOAT", 1, 1, enumC19938712zp, enumC19937412zc2);
        EnumC19937412zc enumC19937412zc3 = EnumC19937412zc.LONG;
        EnumC19937012zY enumC19937012zY3 = new EnumC19937012zY("INT64", 2, 2, enumC19938712zp, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY4 = new EnumC19937012zY("UINT64", 3, 3, enumC19938712zp, enumC19937412zc3);
        EnumC19937412zc enumC19937412zc4 = EnumC19937412zc.INT;
        EnumC19937012zY enumC19937012zY5 = new EnumC19937012zY("INT32", 4, 4, enumC19938712zp, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY6 = new EnumC19937012zY("FIXED64", 5, 5, enumC19938712zp, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY7 = new EnumC19937012zY("FIXED32", 6, 6, enumC19938712zp, enumC19937412zc4);
        EnumC19937412zc enumC19937412zc5 = EnumC19937412zc.BOOLEAN;
        EnumC19937012zY enumC19937012zY8 = new EnumC19937012zY("BOOL", 7, 7, enumC19938712zp, enumC19937412zc5);
        EnumC19937412zc enumC19937412zc6 = EnumC19937412zc.STRING;
        EnumC19937012zY enumC19937012zY9 = new EnumC19937012zY("STRING", 8, 8, enumC19938712zp, enumC19937412zc6);
        EnumC19937412zc enumC19937412zc7 = EnumC19937412zc.MESSAGE;
        EnumC19937012zY enumC19937012zY10 = new EnumC19937012zY("MESSAGE", 9, 9, enumC19938712zp, enumC19937412zc7);
        EnumC19937412zc enumC19937412zc8 = EnumC19937412zc.BYTE_STRING;
        EnumC19937012zY enumC19937012zY11 = new EnumC19937012zY("BYTES", 10, 10, enumC19938712zp, enumC19937412zc8);
        EnumC19937012zY enumC19937012zY12 = new EnumC19937012zY("UINT32", 11, 11, enumC19938712zp, enumC19937412zc4);
        EnumC19937412zc enumC19937412zc9 = EnumC19937412zc.ENUM;
        EnumC19937012zY enumC19937012zY13 = new EnumC19937012zY("ENUM", 12, 12, enumC19938712zp, enumC19937412zc9);
        EnumC19937012zY enumC19937012zY14 = new EnumC19937012zY("SFIXED32", 13, 13, enumC19938712zp, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY15 = new EnumC19937012zY("SFIXED64", 14, 14, enumC19938712zp, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY16 = new EnumC19937012zY("SINT32", 15, 15, enumC19938712zp, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY17 = new EnumC19937012zY("SINT64", 16, 16, enumC19938712zp, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY18 = new EnumC19937012zY("GROUP", 17, 17, enumC19938712zp, enumC19937412zc7);
        EnumC19938712zp enumC19938712zp2 = EnumC19938712zp.VECTOR;
        EnumC19937012zY enumC19937012zY19 = new EnumC19937012zY("DOUBLE_LIST", 18, 18, enumC19938712zp2, enumC19937412zc);
        EnumC19937012zY enumC19937012zY20 = new EnumC19937012zY("FLOAT_LIST", 19, 19, enumC19938712zp2, enumC19937412zc2);
        EnumC19937012zY enumC19937012zY21 = new EnumC19937012zY("INT64_LIST", 20, 20, enumC19938712zp2, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY22 = new EnumC19937012zY("UINT64_LIST", 21, 21, enumC19938712zp2, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY23 = new EnumC19937012zY("INT32_LIST", 22, 22, enumC19938712zp2, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY24 = new EnumC19937012zY("FIXED64_LIST", 23, 23, enumC19938712zp2, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY25 = new EnumC19937012zY("FIXED32_LIST", 24, 24, enumC19938712zp2, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY26 = new EnumC19937012zY("BOOL_LIST", 25, 25, enumC19938712zp2, enumC19937412zc5);
        EnumC19937012zY enumC19937012zY27 = new EnumC19937012zY("STRING_LIST", 26, 26, enumC19938712zp2, enumC19937412zc6);
        EnumC19937012zY enumC19937012zY28 = new EnumC19937012zY("MESSAGE_LIST", 27, 27, enumC19938712zp2, enumC19937412zc7);
        EnumC19937012zY enumC19937012zY29 = new EnumC19937012zY("BYTES_LIST", 28, 28, enumC19938712zp2, enumC19937412zc8);
        EnumC19937012zY enumC19937012zY30 = new EnumC19937012zY("UINT32_LIST", 29, 29, enumC19938712zp2, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY31 = new EnumC19937012zY("ENUM_LIST", 30, 30, enumC19938712zp2, enumC19937412zc9);
        EnumC19937012zY enumC19937012zY32 = new EnumC19937012zY("SFIXED32_LIST", 31, 31, enumC19938712zp2, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY33 = new EnumC19937012zY("SFIXED64_LIST", 32, 32, enumC19938712zp2, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY34 = new EnumC19937012zY("SINT32_LIST", 33, 33, enumC19938712zp2, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY35 = new EnumC19937012zY("SINT64_LIST", 34, 34, enumC19938712zp2, enumC19937412zc3);
        EnumC19938712zp enumC19938712zp3 = EnumC19938712zp.PACKED_VECTOR;
        EnumC19937012zY enumC19937012zY36 = new EnumC19937012zY("DOUBLE_LIST_PACKED", 35, 35, enumC19938712zp3, enumC19937412zc);
        zza = enumC19937012zY36;
        EnumC19937012zY enumC19937012zY37 = new EnumC19937012zY("FLOAT_LIST_PACKED", 36, 36, enumC19938712zp3, enumC19937412zc2);
        EnumC19937012zY enumC19937012zY38 = new EnumC19937012zY("INT64_LIST_PACKED", 37, 37, enumC19938712zp3, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY39 = new EnumC19937012zY("UINT64_LIST_PACKED", 38, 38, enumC19938712zp3, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY40 = new EnumC19937012zY("INT32_LIST_PACKED", 39, 39, enumC19938712zp3, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY41 = new EnumC19937012zY("FIXED64_LIST_PACKED", 40, 40, enumC19938712zp3, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY42 = new EnumC19937012zY("FIXED32_LIST_PACKED", 41, 41, enumC19938712zp3, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY43 = new EnumC19937012zY("BOOL_LIST_PACKED", 42, 42, enumC19938712zp3, enumC19937412zc5);
        EnumC19937012zY enumC19937012zY44 = new EnumC19937012zY("UINT32_LIST_PACKED", 43, 43, enumC19938712zp3, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY45 = new EnumC19937012zY("ENUM_LIST_PACKED", 44, 44, enumC19938712zp3, enumC19937412zc9);
        EnumC19937012zY enumC19937012zY46 = new EnumC19937012zY("SFIXED32_LIST_PACKED", 45, 45, enumC19938712zp3, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY47 = new EnumC19937012zY("SFIXED64_LIST_PACKED", 46, 46, enumC19938712zp3, enumC19937412zc3);
        EnumC19937012zY enumC19937012zY48 = new EnumC19937012zY("SINT32_LIST_PACKED", 47, 47, enumC19938712zp3, enumC19937412zc4);
        EnumC19937012zY enumC19937012zY49 = new EnumC19937012zY("SINT64_LIST_PACKED", 48, 48, enumC19938712zp3, enumC19937412zc3);
        zzb = enumC19937012zY49;
        LLILLL = new EnumC19937012zY[]{enumC19937012zY, enumC19937012zY2, enumC19937012zY3, enumC19937012zY4, enumC19937012zY5, enumC19937012zY6, enumC19937012zY7, enumC19937012zY8, enumC19937012zY9, enumC19937012zY10, enumC19937012zY11, enumC19937012zY12, enumC19937012zY13, enumC19937012zY14, enumC19937012zY15, enumC19937012zY16, enumC19937012zY17, enumC19937012zY18, enumC19937012zY19, enumC19937012zY20, enumC19937012zY21, enumC19937012zY22, enumC19937012zY23, enumC19937012zY24, enumC19937012zY25, enumC19937012zY26, enumC19937012zY27, enumC19937012zY28, enumC19937012zY29, enumC19937012zY30, enumC19937012zY31, enumC19937012zY32, enumC19937012zY33, enumC19937012zY34, enumC19937012zY35, enumC19937012zY36, enumC19937012zY37, enumC19937012zY38, enumC19937012zY39, enumC19937012zY40, enumC19937012zY41, enumC19937012zY42, enumC19937012zY43, enumC19937012zY44, enumC19937012zY45, enumC19937012zY46, enumC19937012zY47, enumC19937012zY48, enumC19937012zY49, new EnumC19937012zY("GROUP_LIST", 49, 49, enumC19938712zp2, enumC19937412zc7), new EnumC19937012zY("MAP", 50, 50, EnumC19938712zp.MAP, EnumC19937412zc.VOID)};
        EnumC19937012zY[] enumC19937012zYArrValues = values();
        LLILLJJLI = new EnumC19937012zY[enumC19937012zYArrValues.length];
        for (EnumC19937012zY enumC19937012zY50 : enumC19937012zYArrValues) {
            LLILLJJLI[enumC19937012zY50.LL] = enumC19937012zY50;
        }
    }

    public static EnumC19937012zY[] values() {
        return (EnumC19937012zY[]) LLILLL.clone();
    }

    public final int zza() {
        return this.LL;
    }

    public EnumC19937012zY(String str, int i, int i2, EnumC19938712zp enumC19938712zp, EnumC19937412zc enumC19937412zc) {
        this.LL = i2;
        int iOrdinal = enumC19938712zp.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            enumC19937412zc.zza();
        }
        if (enumC19938712zp == EnumC19938712zp.SCALAR) {
            int[] iArr = C19938612zo.LIZ;
            enumC19937412zc.ordinal();
        }
    }
}
