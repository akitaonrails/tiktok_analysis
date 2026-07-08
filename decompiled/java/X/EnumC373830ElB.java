package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ElB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373830ElB {
    public static final EnumC373830ElB AUTO_CUTOUT;
    public static final EnumC373830ElB BRUSH;
    public static final EnumC373830ElB CHROMA_KEY;
    public static final EnumC373830ElB ERASER;
    public static final /* synthetic */ EnumC373830ElB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC373830ElB MANUAL_CUTOUT;
    public static final EnumC373830ElB QUICK_BRUSH;
    public static final EnumC373830ElB SPLIT_LINE;
    public static final EnumC373830ElB STROKE;

    public static InterfaceC2044707zh<EnumC373830ElB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC373830ElB enumC373830ElB = new EnumC373830ElB("SPLIT_LINE", 0);
        SPLIT_LINE = enumC373830ElB;
        EnumC373830ElB enumC373830ElB2 = new EnumC373830ElB("AUTO_CUTOUT", 1);
        AUTO_CUTOUT = enumC373830ElB2;
        EnumC373830ElB enumC373830ElB3 = new EnumC373830ElB("MANUAL_CUTOUT", 2);
        MANUAL_CUTOUT = enumC373830ElB3;
        EnumC373830ElB enumC373830ElB4 = new EnumC373830ElB("CHROMA_KEY", 3);
        CHROMA_KEY = enumC373830ElB4;
        EnumC373830ElB enumC373830ElB5 = new EnumC373830ElB("STROKE", 4);
        STROKE = enumC373830ElB5;
        EnumC373830ElB enumC373830ElB6 = new EnumC373830ElB("QUICK_BRUSH", 5);
        QUICK_BRUSH = enumC373830ElB6;
        EnumC373830ElB enumC373830ElB7 = new EnumC373830ElB("BRUSH", 6);
        BRUSH = enumC373830ElB7;
        EnumC373830ElB enumC373830ElB8 = new EnumC373830ElB("ERASER", 7);
        ERASER = enumC373830ElB8;
        EnumC373830ElB[] enumC373830ElBArr = {enumC373830ElB, enumC373830ElB2, enumC373830ElB3, enumC373830ElB4, enumC373830ElB5, enumC373830ElB6, enumC373830ElB7, enumC373830ElB8};
        LL = enumC373830ElBArr;
        LLILLJJLI = new C2254308sP(enumC373830ElBArr);
    }

    public static EnumC373830ElB[] values() {
        return (EnumC373830ElB[]) LL.clone();
    }

    public static EnumC373830ElB valueOf(String str) {
        return (EnumC373830ElB) C08FF.LIZ(EnumC373830ElB.class, str);
    }

    public EnumC373830ElB(String str, int i) {
    }
}
