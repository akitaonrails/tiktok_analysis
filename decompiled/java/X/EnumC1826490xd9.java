package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1826490xd9 {
    public static final EnumC1826490xd9 CAPSULE;
    public static final /* synthetic */ EnumC1826490xd9[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1826490xd9 RECTANGLE;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public static InterfaceC2044707zh<EnumC1826490xd9> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1826490xd9 enumC1826490xd9 = new EnumC1826490xd9("CAPSULE", 0, 200, 200, 200, 200);
        CAPSULE = enumC1826490xd9;
        EnumC1826490xd9 enumC1826490xd92 = new EnumC1826490xd9("RECTANGLE", 1, 9, 8, 8, 4);
        RECTANGLE = enumC1826490xd92;
        EnumC1826490xd9[] enumC1826490xd9Arr = {enumC1826490xd9, enumC1826490xd92};
        LLILZIL = enumC1826490xd9Arr;
        LLILZLL = new C2254308sP(enumC1826490xd9Arr);
    }

    public static EnumC1826490xd9[] values() {
        return (EnumC1826490xd9[]) LLILZIL.clone();
    }

    public final int getInnerRadiusSmall() {
        return this.LLILLL;
    }

    public final int getInnerRadiusXSmall() {
        return this.LLILZ;
    }

    public final int getOuterRadiusSmall() {
        return this.LL;
    }

    public final int getOuterRadiusXSmall() {
        return this.LLILLJJLI;
    }

    public static EnumC1826490xd9 valueOf(String str) {
        return (EnumC1826490xd9) C08FF.LIZ(EnumC1826490xd9.class, str);
    }

    public EnumC1826490xd9(String str, int i, int i2, int i3, int i4, int i5) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
        this.LLILZ = i5;
    }
}
