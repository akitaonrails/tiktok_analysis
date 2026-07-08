package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC479460IrA {
    public static final EnumC479460IrA LL;
    public static final EnumC479460IrA LLILLJJLI;
    public static final EnumC479460IrA LLILLL;
    public static final EnumC479460IrA LLILZ;
    public static final EnumC479460IrA LLILZIL;
    public static final EnumC479460IrA LLILZLL;
    public static final /* synthetic */ EnumC479460IrA[] LLIZ;

    static {
        EnumC479460IrA enumC479460IrA = new EnumC479460IrA("REQUEST_START", 0);
        LL = enumC479460IrA;
        EnumC479460IrA enumC479460IrA2 = new EnumC479460IrA("REQUEST_SUCCESS", 1);
        LLILLJJLI = enumC479460IrA2;
        EnumC479460IrA enumC479460IrA3 = new EnumC479460IrA("REQUEST_EMPTY", 2);
        LLILLL = enumC479460IrA3;
        EnumC479460IrA enumC479460IrA4 = new EnumC479460IrA("REQUEST_ERROR", 3);
        LLILZ = enumC479460IrA4;
        EnumC479460IrA enumC479460IrA5 = new EnumC479460IrA("RENDER_START", 4);
        LLILZIL = enumC479460IrA5;
        EnumC479460IrA enumC479460IrA6 = new EnumC479460IrA("RENDER_SUCCESS", 5);
        LLILZLL = enumC479460IrA6;
        EnumC479460IrA[] enumC479460IrAArr = {enumC479460IrA, enumC479460IrA2, enumC479460IrA3, enumC479460IrA4, enumC479460IrA5, enumC479460IrA6};
        LLIZ = enumC479460IrAArr;
        new C2254308sP(enumC479460IrAArr);
    }

    public static EnumC479460IrA[] values() {
        return (EnumC479460IrA[]) LLIZ.clone();
    }

    public static EnumC479460IrA valueOf(String str) {
        return (EnumC479460IrA) C08FF.LIZ(EnumC479460IrA.class, str);
    }

    public EnumC479460IrA(String str, int i) {
    }
}
