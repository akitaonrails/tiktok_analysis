package X;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.12zX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19936912zX {
    public static final EnumC19936912zX BOOL;
    public static final EnumC19936912zX BOOL_LIST;
    public static final EnumC19936912zX BOOL_LIST_PACKED;
    public static final EnumC19936912zX BYTES;
    public static final EnumC19936912zX BYTES_LIST;
    public static final EnumC19936912zX DOUBLE;
    public static final EnumC19936912zX DOUBLE_LIST;
    public static final EnumC19936912zX DOUBLE_LIST_PACKED;
    public static final EnumC19936912zX ENUM;
    public static final EnumC19936912zX ENUM_LIST;
    public static final EnumC19936912zX ENUM_LIST_PACKED;
    public static final EnumC19936912zX FIXED32;
    public static final EnumC19936912zX FIXED32_LIST;
    public static final EnumC19936912zX FIXED32_LIST_PACKED;
    public static final EnumC19936912zX FIXED64;
    public static final EnumC19936912zX FIXED64_LIST;
    public static final EnumC19936912zX FIXED64_LIST_PACKED;
    public static final EnumC19936912zX FLOAT;
    public static final EnumC19936912zX FLOAT_LIST;
    public static final EnumC19936912zX FLOAT_LIST_PACKED;
    public static final EnumC19936912zX GROUP;
    public static final EnumC19936912zX GROUP_LIST;
    public static final EnumC19936912zX INT32;
    public static final EnumC19936912zX INT32_LIST;
    public static final EnumC19936912zX INT32_LIST_PACKED;
    public static final EnumC19936912zX INT64;
    public static final EnumC19936912zX INT64_LIST;
    public static final EnumC19936912zX INT64_LIST_PACKED;
    public static final EnumC19936912zX[] LLILZLL;
    public static final Type[] LLIZ;
    public static final /* synthetic */ EnumC19936912zX[] LLIZLLLIL;
    public static final EnumC19936912zX MAP;
    public static final EnumC19936912zX MESSAGE;
    public static final EnumC19936912zX MESSAGE_LIST;
    public static final EnumC19936912zX SFIXED32;
    public static final EnumC19936912zX SFIXED32_LIST;
    public static final EnumC19936912zX SFIXED32_LIST_PACKED;
    public static final EnumC19936912zX SFIXED64;
    public static final EnumC19936912zX SFIXED64_LIST;
    public static final EnumC19936912zX SFIXED64_LIST_PACKED;
    public static final EnumC19936912zX SINT32;
    public static final EnumC19936912zX SINT32_LIST;
    public static final EnumC19936912zX SINT32_LIST_PACKED;
    public static final EnumC19936912zX SINT64;
    public static final EnumC19936912zX SINT64_LIST;
    public static final EnumC19936912zX SINT64_LIST_PACKED;
    public static final EnumC19936912zX STRING;
    public static final EnumC19936912zX STRING_LIST;
    public static final EnumC19936912zX UINT32;
    public static final EnumC19936912zX UINT32_LIST;
    public static final EnumC19936912zX UINT32_LIST_PACKED;
    public static final EnumC19936912zX UINT64;
    public static final EnumC19936912zX UINT64_LIST;
    public static final EnumC19936912zX UINT64_LIST_PACKED;
    public final EnumC19937212za LL;
    public final int LLILLJJLI;
    public final EnumC19938412zm LLILLL;
    public final Class<?> LLILZ;
    public final boolean LLILZIL;

    static {
        EnumC19938412zm enumC19938412zm = EnumC19938412zm.SCALAR;
        EnumC19937212za enumC19937212za = EnumC19937212za.DOUBLE;
        EnumC19936912zX enumC19936912zX = new EnumC19936912zX("DOUBLE", 0, 0, enumC19938412zm, enumC19937212za);
        DOUBLE = enumC19936912zX;
        EnumC19937212za enumC19937212za2 = EnumC19937212za.FLOAT;
        EnumC19936912zX enumC19936912zX2 = new EnumC19936912zX("FLOAT", 1, 1, enumC19938412zm, enumC19937212za2);
        FLOAT = enumC19936912zX2;
        EnumC19937212za enumC19937212za3 = EnumC19937212za.LONG;
        EnumC19936912zX enumC19936912zX3 = new EnumC19936912zX("INT64", 2, 2, enumC19938412zm, enumC19937212za3);
        INT64 = enumC19936912zX3;
        EnumC19936912zX enumC19936912zX4 = new EnumC19936912zX("UINT64", 3, 3, enumC19938412zm, enumC19937212za3);
        UINT64 = enumC19936912zX4;
        EnumC19937212za enumC19937212za4 = EnumC19937212za.INT;
        EnumC19936912zX enumC19936912zX5 = new EnumC19936912zX("INT32", 4, 4, enumC19938412zm, enumC19937212za4);
        INT32 = enumC19936912zX5;
        EnumC19936912zX enumC19936912zX6 = new EnumC19936912zX("FIXED64", 5, 5, enumC19938412zm, enumC19937212za3);
        FIXED64 = enumC19936912zX6;
        EnumC19936912zX enumC19936912zX7 = new EnumC19936912zX("FIXED32", 6, 6, enumC19938412zm, enumC19937212za4);
        FIXED32 = enumC19936912zX7;
        EnumC19937212za enumC19937212za5 = EnumC19937212za.BOOLEAN;
        EnumC19936912zX enumC19936912zX8 = new EnumC19936912zX("BOOL", 7, 7, enumC19938412zm, enumC19937212za5);
        BOOL = enumC19936912zX8;
        EnumC19937212za enumC19937212za6 = EnumC19937212za.STRING;
        EnumC19936912zX enumC19936912zX9 = new EnumC19936912zX("STRING", 8, 8, enumC19938412zm, enumC19937212za6);
        STRING = enumC19936912zX9;
        EnumC19937212za enumC19937212za7 = EnumC19937212za.MESSAGE;
        EnumC19936912zX enumC19936912zX10 = new EnumC19936912zX("MESSAGE", 9, 9, enumC19938412zm, enumC19937212za7);
        MESSAGE = enumC19936912zX10;
        EnumC19937212za enumC19937212za8 = EnumC19937212za.BYTE_STRING;
        EnumC19936912zX enumC19936912zX11 = new EnumC19936912zX("BYTES", 10, 10, enumC19938412zm, enumC19937212za8);
        BYTES = enumC19936912zX11;
        EnumC19936912zX enumC19936912zX12 = new EnumC19936912zX("UINT32", 11, 11, enumC19938412zm, enumC19937212za4);
        UINT32 = enumC19936912zX12;
        EnumC19937212za enumC19937212za9 = EnumC19937212za.ENUM;
        EnumC19936912zX enumC19936912zX13 = new EnumC19936912zX("ENUM", 12, 12, enumC19938412zm, enumC19937212za9);
        ENUM = enumC19936912zX13;
        EnumC19936912zX enumC19936912zX14 = new EnumC19936912zX("SFIXED32", 13, 13, enumC19938412zm, enumC19937212za4);
        SFIXED32 = enumC19936912zX14;
        EnumC19936912zX enumC19936912zX15 = new EnumC19936912zX("SFIXED64", 14, 14, enumC19938412zm, enumC19937212za3);
        SFIXED64 = enumC19936912zX15;
        EnumC19936912zX enumC19936912zX16 = new EnumC19936912zX("SINT32", 15, 15, enumC19938412zm, enumC19937212za4);
        SINT32 = enumC19936912zX16;
        EnumC19936912zX enumC19936912zX17 = new EnumC19936912zX("SINT64", 16, 16, enumC19938412zm, enumC19937212za3);
        SINT64 = enumC19936912zX17;
        EnumC19936912zX enumC19936912zX18 = new EnumC19936912zX("GROUP", 17, 17, enumC19938412zm, enumC19937212za7);
        GROUP = enumC19936912zX18;
        EnumC19938412zm enumC19938412zm2 = EnumC19938412zm.VECTOR;
        EnumC19936912zX enumC19936912zX19 = new EnumC19936912zX("DOUBLE_LIST", 18, 18, enumC19938412zm2, enumC19937212za);
        DOUBLE_LIST = enumC19936912zX19;
        EnumC19936912zX enumC19936912zX20 = new EnumC19936912zX("FLOAT_LIST", 19, 19, enumC19938412zm2, enumC19937212za2);
        FLOAT_LIST = enumC19936912zX20;
        EnumC19936912zX enumC19936912zX21 = new EnumC19936912zX("INT64_LIST", 20, 20, enumC19938412zm2, enumC19937212za3);
        INT64_LIST = enumC19936912zX21;
        EnumC19936912zX enumC19936912zX22 = new EnumC19936912zX("UINT64_LIST", 21, 21, enumC19938412zm2, enumC19937212za3);
        UINT64_LIST = enumC19936912zX22;
        EnumC19936912zX enumC19936912zX23 = new EnumC19936912zX("INT32_LIST", 22, 22, enumC19938412zm2, enumC19937212za4);
        INT32_LIST = enumC19936912zX23;
        EnumC19936912zX enumC19936912zX24 = new EnumC19936912zX("FIXED64_LIST", 23, 23, enumC19938412zm2, enumC19937212za3);
        FIXED64_LIST = enumC19936912zX24;
        EnumC19936912zX enumC19936912zX25 = new EnumC19936912zX("FIXED32_LIST", 24, 24, enumC19938412zm2, enumC19937212za4);
        FIXED32_LIST = enumC19936912zX25;
        EnumC19936912zX enumC19936912zX26 = new EnumC19936912zX("BOOL_LIST", 25, 25, enumC19938412zm2, enumC19937212za5);
        BOOL_LIST = enumC19936912zX26;
        EnumC19936912zX enumC19936912zX27 = new EnumC19936912zX("STRING_LIST", 26, 26, enumC19938412zm2, enumC19937212za6);
        STRING_LIST = enumC19936912zX27;
        EnumC19936912zX enumC19936912zX28 = new EnumC19936912zX("MESSAGE_LIST", 27, 27, enumC19938412zm2, enumC19937212za7);
        MESSAGE_LIST = enumC19936912zX28;
        EnumC19936912zX enumC19936912zX29 = new EnumC19936912zX("BYTES_LIST", 28, 28, enumC19938412zm2, enumC19937212za8);
        BYTES_LIST = enumC19936912zX29;
        EnumC19936912zX enumC19936912zX30 = new EnumC19936912zX("UINT32_LIST", 29, 29, enumC19938412zm2, enumC19937212za4);
        UINT32_LIST = enumC19936912zX30;
        EnumC19936912zX enumC19936912zX31 = new EnumC19936912zX("ENUM_LIST", 30, 30, enumC19938412zm2, enumC19937212za9);
        ENUM_LIST = enumC19936912zX31;
        EnumC19936912zX enumC19936912zX32 = new EnumC19936912zX("SFIXED32_LIST", 31, 31, enumC19938412zm2, enumC19937212za4);
        SFIXED32_LIST = enumC19936912zX32;
        EnumC19936912zX enumC19936912zX33 = new EnumC19936912zX("SFIXED64_LIST", 32, 32, enumC19938412zm2, enumC19937212za3);
        SFIXED64_LIST = enumC19936912zX33;
        EnumC19936912zX enumC19936912zX34 = new EnumC19936912zX("SINT32_LIST", 33, 33, enumC19938412zm2, enumC19937212za4);
        SINT32_LIST = enumC19936912zX34;
        EnumC19936912zX enumC19936912zX35 = new EnumC19936912zX("SINT64_LIST", 34, 34, enumC19938412zm2, enumC19937212za3);
        SINT64_LIST = enumC19936912zX35;
        EnumC19938412zm enumC19938412zm3 = EnumC19938412zm.PACKED_VECTOR;
        EnumC19936912zX enumC19936912zX36 = new EnumC19936912zX("DOUBLE_LIST_PACKED", 35, 35, enumC19938412zm3, enumC19937212za);
        DOUBLE_LIST_PACKED = enumC19936912zX36;
        EnumC19936912zX enumC19936912zX37 = new EnumC19936912zX("FLOAT_LIST_PACKED", 36, 36, enumC19938412zm3, enumC19937212za2);
        FLOAT_LIST_PACKED = enumC19936912zX37;
        EnumC19936912zX enumC19936912zX38 = new EnumC19936912zX("INT64_LIST_PACKED", 37, 37, enumC19938412zm3, enumC19937212za3);
        INT64_LIST_PACKED = enumC19936912zX38;
        EnumC19936912zX enumC19936912zX39 = new EnumC19936912zX("UINT64_LIST_PACKED", 38, 38, enumC19938412zm3, enumC19937212za3);
        UINT64_LIST_PACKED = enumC19936912zX39;
        EnumC19936912zX enumC19936912zX40 = new EnumC19936912zX("INT32_LIST_PACKED", 39, 39, enumC19938412zm3, enumC19937212za4);
        INT32_LIST_PACKED = enumC19936912zX40;
        EnumC19936912zX enumC19936912zX41 = new EnumC19936912zX("FIXED64_LIST_PACKED", 40, 40, enumC19938412zm3, enumC19937212za3);
        FIXED64_LIST_PACKED = enumC19936912zX41;
        EnumC19936912zX enumC19936912zX42 = new EnumC19936912zX("FIXED32_LIST_PACKED", 41, 41, enumC19938412zm3, enumC19937212za4);
        FIXED32_LIST_PACKED = enumC19936912zX42;
        EnumC19936912zX enumC19936912zX43 = new EnumC19936912zX("BOOL_LIST_PACKED", 42, 42, enumC19938412zm3, enumC19937212za5);
        BOOL_LIST_PACKED = enumC19936912zX43;
        EnumC19936912zX enumC19936912zX44 = new EnumC19936912zX("UINT32_LIST_PACKED", 43, 43, enumC19938412zm3, enumC19937212za4);
        UINT32_LIST_PACKED = enumC19936912zX44;
        EnumC19936912zX enumC19936912zX45 = new EnumC19936912zX("ENUM_LIST_PACKED", 44, 44, enumC19938412zm3, enumC19937212za9);
        ENUM_LIST_PACKED = enumC19936912zX45;
        EnumC19936912zX enumC19936912zX46 = new EnumC19936912zX("SFIXED32_LIST_PACKED", 45, 45, enumC19938412zm3, enumC19937212za4);
        SFIXED32_LIST_PACKED = enumC19936912zX46;
        EnumC19936912zX enumC19936912zX47 = new EnumC19936912zX("SFIXED64_LIST_PACKED", 46, 46, enumC19938412zm3, enumC19937212za3);
        SFIXED64_LIST_PACKED = enumC19936912zX47;
        EnumC19936912zX enumC19936912zX48 = new EnumC19936912zX("SINT32_LIST_PACKED", 47, 47, enumC19938412zm3, enumC19937212za4);
        SINT32_LIST_PACKED = enumC19936912zX48;
        EnumC19936912zX enumC19936912zX49 = new EnumC19936912zX("SINT64_LIST_PACKED", 48, 48, enumC19938412zm3, enumC19937212za3);
        SINT64_LIST_PACKED = enumC19936912zX49;
        EnumC19936912zX enumC19936912zX50 = new EnumC19936912zX("GROUP_LIST", 49, 49, enumC19938412zm2, enumC19937212za7);
        GROUP_LIST = enumC19936912zX50;
        EnumC19936912zX enumC19936912zX51 = new EnumC19936912zX("MAP", 50, 50, EnumC19938412zm.MAP, EnumC19937212za.VOID);
        MAP = enumC19936912zX51;
        LLIZLLLIL = new EnumC19936912zX[]{enumC19936912zX, enumC19936912zX2, enumC19936912zX3, enumC19936912zX4, enumC19936912zX5, enumC19936912zX6, enumC19936912zX7, enumC19936912zX8, enumC19936912zX9, enumC19936912zX10, enumC19936912zX11, enumC19936912zX12, enumC19936912zX13, enumC19936912zX14, enumC19936912zX15, enumC19936912zX16, enumC19936912zX17, enumC19936912zX18, enumC19936912zX19, enumC19936912zX20, enumC19936912zX21, enumC19936912zX22, enumC19936912zX23, enumC19936912zX24, enumC19936912zX25, enumC19936912zX26, enumC19936912zX27, enumC19936912zX28, enumC19936912zX29, enumC19936912zX30, enumC19936912zX31, enumC19936912zX32, enumC19936912zX33, enumC19936912zX34, enumC19936912zX35, enumC19936912zX36, enumC19936912zX37, enumC19936912zX38, enumC19936912zX39, enumC19936912zX40, enumC19936912zX41, enumC19936912zX42, enumC19936912zX43, enumC19936912zX44, enumC19936912zX45, enumC19936912zX46, enumC19936912zX47, enumC19936912zX48, enumC19936912zX49, enumC19936912zX50, enumC19936912zX51};
        LLIZ = new Type[0];
        EnumC19936912zX[] enumC19936912zXArrValues = values();
        LLILZLL = new EnumC19936912zX[enumC19936912zXArrValues.length];
        for (EnumC19936912zX enumC19936912zX52 : enumC19936912zXArrValues) {
            LLILZLL[enumC19936912zX52.LLILLJJLI] = enumC19936912zX52;
        }
    }

    public static EnumC19936912zX[] values() {
        return (EnumC19936912zX[]) LLIZLLLIL.clone();
    }

    public boolean isList() {
        return this.LLILLL.LL;
    }

    public boolean isMap() {
        return this.LLILLL == EnumC19938412zm.MAP;
    }

    public boolean isPacked() {
        return EnumC19938412zm.PACKED_VECTOR.equals(this.LLILLL);
    }

    public boolean isScalar() {
        return this.LLILLL == EnumC19938412zm.SCALAR;
    }

    public EnumC19937212za getJavaType() {
        return this.LL;
    }

    public int id() {
        return this.LLILLJJLI;
    }

    public boolean isPrimitiveScalar() {
        return this.LLILZIL;
    }

    public static EnumC19936912zX forId(int i) {
        if (i >= 0) {
            EnumC19936912zX[] enumC19936912zXArr = LLILZLL;
            if (i < enumC19936912zXArr.length) {
                return enumC19936912zXArr[i];
            }
            return null;
        }
        return null;
    }

    public static EnumC19936912zX valueOf(String str) {
        return (EnumC19936912zX) C08FF.LIZ(EnumC19936912zX.class, str);
    }

    public boolean isValidForField(Field field) {
        Type genericSuperclass;
        if (EnumC19938412zm.VECTOR.equals(this.LLILLL)) {
            Class<?> type = field.getType();
            if (!this.LL.getType().isAssignableFrom(type)) {
                return false;
            }
            Type[] actualTypeArguments = LLIZ;
            if (C786410Ut5.U2(field) instanceof ParameterizedType) {
                actualTypeArguments = ((ParameterizedType) C786410Ut5.U2(field)).getActualTypeArguments();
            }
            while (type != List.class) {
                Type[] genericInterfaces = type.getGenericInterfaces();
                int length = genericInterfaces.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        genericSuperclass = genericInterfaces[i];
                        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
                            break;
                        }
                        i++;
                    } else {
                        genericSuperclass = type.getGenericSuperclass();
                        if (!(genericSuperclass instanceof ParameterizedType) || !List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
                            genericSuperclass = null;
                        }
                    }
                }
                if (genericSuperclass instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                    Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments2.length; i2++) {
                        Type type2 = actualTypeArguments2[i2];
                        if (type2 instanceof TypeVariable) {
                            TypeVariable[] typeVariableArrV2 = C786410Ut5.V2(type);
                            if (actualTypeArguments.length == typeVariableArrV2.length) {
                                for (int i3 = 0; i3 < typeVariableArrV2.length; i3++) {
                                    if (type2 == typeVariableArrV2[i3]) {
                                        actualTypeArguments2[i2] = actualTypeArguments[i3];
                                    }
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Unable to find replacement for ");
                                sbLIZ.append(type2);
                                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            throw new RuntimeException("Type array mismatch");
                        }
                    }
                    type = (Class) parameterizedType.getRawType();
                    actualTypeArguments = actualTypeArguments2;
                } else {
                    actualTypeArguments = LLIZ;
                    Class<?>[] interfaces = type.getInterfaces();
                    int length2 = interfaces.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            Class<?> cls = interfaces[i4];
                            if (List.class.isAssignableFrom(cls)) {
                                type = cls;
                                break;
                            }
                            i4++;
                        } else {
                            type = type.getSuperclass();
                            break;
                        }
                    }
                }
            }
            if (actualTypeArguments.length == 1) {
                Type type3 = actualTypeArguments[0];
                if (!(type3 instanceof Class)) {
                    return true;
                }
                return this.LLILZ.isAssignableFrom((Class) type3);
            }
            throw new RuntimeException("Unable to identify parameter type for List<T>");
        }
        return this.LL.getType().isAssignableFrom(field.getType());
    }

    public EnumC19936912zX(String str, int i, int i2, EnumC19938412zm enumC19938412zm, EnumC19937212za enumC19937212za) {
        int i3;
        this.LLILLJJLI = i2;
        this.LLILLL = enumC19938412zm;
        this.LL = enumC19937212za;
        int iOrdinal = enumC19938412zm.ordinal();
        if (iOrdinal != 1 && iOrdinal != 3) {
            this.LLILZ = null;
        } else {
            this.LLILZ = enumC19937212za.getBoxedType();
        }
        this.LLILZIL = (enumC19938412zm != EnumC19938412zm.SCALAR || (i3 = C19938512zn.LIZ[enumC19937212za.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }
}
