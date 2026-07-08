package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.12za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19937212za {
    public static final EnumC19937212za BOOLEAN;
    public static final EnumC19937212za BYTE_STRING;
    public static final EnumC19937212za DOUBLE;
    public static final EnumC19937212za ENUM;
    public static final EnumC19937212za FLOAT;
    public static final EnumC19937212za INT;
    public static final /* synthetic */ EnumC19937212za[] LLILZ;
    public static final EnumC19937212za LONG;
    public static final EnumC19937212za MESSAGE;
    public static final EnumC19937212za STRING;
    public static final EnumC19937212za VOID;
    public final Class<?> LL;
    public final Class<?> LLILLJJLI;
    public final Object LLILLL;

    static {
        EnumC19937212za enumC19937212za = new EnumC19937212za("VOID", 0, Void.class, Void.class, null);
        VOID = enumC19937212za;
        Class cls = Integer.TYPE;
        EnumC19937212za enumC19937212za2 = new EnumC19937212za("INT", 1, cls, Integer.class, 0);
        INT = enumC19937212za2;
        EnumC19937212za enumC19937212za3 = new EnumC19937212za("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = enumC19937212za3;
        EnumC19937212za enumC19937212za4 = new EnumC19937212za("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = enumC19937212za4;
        EnumC19937212za enumC19937212za5 = new EnumC19937212za("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = enumC19937212za5;
        EnumC19937212za enumC19937212za6 = new EnumC19937212za("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = enumC19937212za6;
        EnumC19937212za enumC19937212za7 = new EnumC19937212za("STRING", 6, String.class, String.class, "");
        STRING = enumC19937212za7;
        EnumC19937212za enumC19937212za8 = new EnumC19937212za("BYTE_STRING", 7, AbstractC19922812xG.class, AbstractC19922812xG.class, AbstractC19922812xG.EMPTY);
        BYTE_STRING = enumC19937212za8;
        EnumC19937212za enumC19937212za9 = new EnumC19937212za("ENUM", 8, cls, Integer.class, null);
        ENUM = enumC19937212za9;
        EnumC19937212za enumC19937212za10 = new EnumC19937212za("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = enumC19937212za10;
        LLILZ = new EnumC19937212za[]{enumC19937212za, enumC19937212za2, enumC19937212za3, enumC19937212za4, enumC19937212za5, enumC19937212za6, enumC19937212za7, enumC19937212za8, enumC19937212za9, enumC19937212za10};
    }

    public static EnumC19937212za[] values() {
        return (EnumC19937212za[]) LLILZ.clone();
    }

    public Class<?> getBoxedType() {
        return this.LLILLJJLI;
    }

    public Object getDefaultDefault() {
        return this.LLILLL;
    }

    public Class<?> getType() {
        return this.LL;
    }

    public static EnumC19937212za valueOf(String str) {
        return (EnumC19937212za) C08FF.LIZ(EnumC19937212za.class, str);
    }

    public boolean isValidType(Class<?> cls) {
        return this.LL.isAssignableFrom(cls);
    }

    public EnumC19937212za(String str, int i, Class cls, Class cls2, Object obj) {
        this.LL = cls;
        this.LLILLJJLI = cls2;
        this.LLILLL = obj;
    }
}
