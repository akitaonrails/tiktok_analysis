package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1563010qmB {
    public static final EnumC1563010qmB HAS_PINNED;
    public static final /* synthetic */ EnumC1563010qmB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1563010qmB NOT_ALLOWED_SHOWN;
    public static final EnumC1563010qmB NOT_PINNED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1563010qmB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1563010qmB enumC1563010qmB = new EnumC1563010qmB("NOT_ALLOWED_SHOWN", 0, 0);
        NOT_ALLOWED_SHOWN = enumC1563010qmB;
        EnumC1563010qmB enumC1563010qmB2 = new EnumC1563010qmB("NOT_PINNED", 1, 1);
        NOT_PINNED = enumC1563010qmB2;
        EnumC1563010qmB enumC1563010qmB3 = new EnumC1563010qmB("HAS_PINNED", 2, 2);
        HAS_PINNED = enumC1563010qmB3;
        EnumC1563010qmB[] enumC1563010qmBArr = {enumC1563010qmB, enumC1563010qmB2, enumC1563010qmB3};
        LLILLJJLI = enumC1563010qmBArr;
        LLILLL = new C2254308sP(enumC1563010qmBArr);
    }

    public static EnumC1563010qmB[] values() {
        return (EnumC1563010qmB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1563010qmB valueOf(String str) {
        return (EnumC1563010qmB) C08FF.LIZ(EnumC1563010qmB.class, str);
    }

    public EnumC1563010qmB(String str, int i, int i2) {
        this.LL = i2;
    }
}
