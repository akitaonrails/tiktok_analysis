package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1826470xd7 {
    public static final EnumC1826470xd7 CAPSULE;
    public static final /* synthetic */ EnumC1826470xd7[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1826470xd7 RECTANGLE;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public static InterfaceC2044707zh<EnumC1826470xd7> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1826470xd7 enumC1826470xd7 = new EnumC1826470xd7("CAPSULE", 0, 200, 200, 200, 200);
        CAPSULE = enumC1826470xd7;
        EnumC1826470xd7 enumC1826470xd72 = new EnumC1826470xd7("RECTANGLE", 1, 12, 8, 10, 4);
        RECTANGLE = enumC1826470xd72;
        EnumC1826470xd7[] enumC1826470xd7Arr = {enumC1826470xd7, enumC1826470xd72};
        LLILZIL = enumC1826470xd7Arr;
        LLILZLL = new C2254308sP(enumC1826470xd7Arr);
    }

    public static EnumC1826470xd7[] values() {
        return (EnumC1826470xd7[]) LLILZIL.clone();
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

    public static EnumC1826470xd7 valueOf(String str) {
        return (EnumC1826470xd7) C08FF.LIZ(EnumC1826470xd7.class, str);
    }

    public EnumC1826470xd7(String str, int i, int i2, int i3, int i4, int i5) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
        this.LLILZ = i5;
    }
}
