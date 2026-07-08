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
/* JADX INFO: renamed from: X.1334, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class AnonymousClass1334 {
    public static final AnonymousClass1334 BOOL;
    public static final AnonymousClass1334 BYTES;
    public static final AnonymousClass1334 DOUBLE;
    public static final AnonymousClass1334 ENUM;
    public static final AnonymousClass1334 FIXED32;
    public static final AnonymousClass1334 FIXED64;
    public static final AnonymousClass1334 FLOAT;
    public static final AnonymousClass1334 GROUP;
    public static final AnonymousClass1334 INT32;
    public static final AnonymousClass1334 INT64;
    public static final /* synthetic */ AnonymousClass1334[] LLILLL;
    public static final AnonymousClass1334 MESSAGE;
    public static final AnonymousClass1334 SFIXED32;
    public static final AnonymousClass1334 SFIXED64;
    public static final AnonymousClass1334 SINT32;
    public static final AnonymousClass1334 SINT64;
    public static final AnonymousClass1334 STRING;
    public static final AnonymousClass1334 UINT32;
    public static final AnonymousClass1334 UINT64;
    public final AnonymousClass1332 LL;
    public final int LLILLJJLI;

    public /* synthetic */ AnonymousClass1334() {
        throw null;
    }

    public boolean isPackable() {
        return true;
    }

    static {
        AnonymousClass1334 anonymousClass1334 = new AnonymousClass1334("DOUBLE", 0, AnonymousClass1332.DOUBLE, 1);
        DOUBLE = anonymousClass1334;
        AnonymousClass1334 anonymousClass13342 = new AnonymousClass1334("FLOAT", 1, AnonymousClass1332.FLOAT, 5);
        FLOAT = anonymousClass13342;
        AnonymousClass1332 anonymousClass1332 = AnonymousClass1332.LONG;
        AnonymousClass1334 anonymousClass13343 = new AnonymousClass1334("INT64", 2, anonymousClass1332, 0);
        INT64 = anonymousClass13343;
        AnonymousClass1334 anonymousClass13344 = new AnonymousClass1334("UINT64", 3, anonymousClass1332, 0);
        UINT64 = anonymousClass13344;
        AnonymousClass1332 anonymousClass13322 = AnonymousClass1332.INT;
        AnonymousClass1334 anonymousClass13345 = new AnonymousClass1334("INT32", 4, anonymousClass13322, 0);
        INT32 = anonymousClass13345;
        AnonymousClass1334 anonymousClass13346 = new AnonymousClass1334("FIXED64", 5, anonymousClass1332, 1);
        FIXED64 = anonymousClass13346;
        AnonymousClass1334 anonymousClass13347 = new AnonymousClass1334("FIXED32", 6, anonymousClass13322, 5);
        FIXED32 = anonymousClass13347;
        AnonymousClass1334 anonymousClass13348 = new AnonymousClass1334("BOOL", 7, AnonymousClass1332.BOOLEAN, 0);
        BOOL = anonymousClass13348;
        final AnonymousClass1332 anonymousClass13323 = AnonymousClass1332.STRING;
        AnonymousClass1334 anonymousClass13349 = new AnonymousClass1334(anonymousClass13323) { // from class: X.1339
            @Override // X.AnonymousClass1334
            public final boolean isPackable() {
                return false;
            }
        };
        STRING = anonymousClass13349;
        final AnonymousClass1332 anonymousClass13324 = AnonymousClass1332.MESSAGE;
        AnonymousClass1334 anonymousClass133410 = new AnonymousClass1334(anonymousClass13324) { // from class: X.133A
            @Override // X.AnonymousClass1334
            public final boolean isPackable() {
                return false;
            }
        };
        GROUP = anonymousClass133410;
        AnonymousClass1334 anonymousClass133411 = new AnonymousClass1334(anonymousClass13324) { // from class: X.133B
            @Override // X.AnonymousClass1334
            public final boolean isPackable() {
                return false;
            }
        };
        MESSAGE = anonymousClass133411;
        final AnonymousClass1332 anonymousClass13325 = AnonymousClass1332.BYTE_STRING;
        AnonymousClass1334 anonymousClass133412 = new AnonymousClass1334(anonymousClass13325) { // from class: X.133C
            @Override // X.AnonymousClass1334
            public final boolean isPackable() {
                return false;
            }
        };
        BYTES = anonymousClass133412;
        AnonymousClass1334 anonymousClass133413 = new AnonymousClass1334("UINT32", 12, anonymousClass13322, 0);
        UINT32 = anonymousClass133413;
        AnonymousClass1334 anonymousClass133414 = new AnonymousClass1334("ENUM", 13, AnonymousClass1332.ENUM, 0);
        ENUM = anonymousClass133414;
        AnonymousClass1334 anonymousClass133415 = new AnonymousClass1334("SFIXED32", 14, anonymousClass13322, 5);
        SFIXED32 = anonymousClass133415;
        AnonymousClass1334 anonymousClass133416 = new AnonymousClass1334("SFIXED64", 15, anonymousClass1332, 1);
        SFIXED64 = anonymousClass133416;
        AnonymousClass1334 anonymousClass133417 = new AnonymousClass1334("SINT32", 16, anonymousClass13322, 0);
        SINT32 = anonymousClass133417;
        AnonymousClass1334 anonymousClass133418 = new AnonymousClass1334("SINT64", 17, anonymousClass1332, 0);
        SINT64 = anonymousClass133418;
        LLILLL = new AnonymousClass1334[]{anonymousClass1334, anonymousClass13342, anonymousClass13343, anonymousClass13344, anonymousClass13345, anonymousClass13346, anonymousClass13347, anonymousClass13348, anonymousClass13349, anonymousClass133410, anonymousClass133411, anonymousClass133412, anonymousClass133413, anonymousClass133414, anonymousClass133415, anonymousClass133416, anonymousClass133417, anonymousClass133418};
    }

    public static AnonymousClass1334[] values() {
        return (AnonymousClass1334[]) LLILLL.clone();
    }

    public AnonymousClass1332 getJavaType() {
        return this.LL;
    }

    public int getWireType() {
        return this.LLILLJJLI;
    }

    public static AnonymousClass1334 valueOf(String str) {
        return (AnonymousClass1334) C08FF.LIZ(AnonymousClass1334.class, str);
    }

    public AnonymousClass1334(String str, int i, AnonymousClass1332 anonymousClass1332, int i2) {
        this.LL = anonymousClass1332;
        this.LLILLJJLI = i2;
    }
}
