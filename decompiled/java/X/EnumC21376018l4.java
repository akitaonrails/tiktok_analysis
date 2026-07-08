package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21376018l4 {
    public static final EnumC21376018l4 LARGE;
    public static final /* synthetic */ EnumC21376018l4[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC21376018l4 MIDDLE;
    public static final EnumC21376018l4 SMALL;
    public final int LL;
    public final float LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public static InterfaceC2044707zh<EnumC21376018l4> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC21376018l4 enumC21376018l4 = new EnumC21376018l4(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C418440Gaw.LIZIZ(4), "SMALL", C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        SMALL = enumC21376018l4;
        EnumC21376018l4 enumC21376018l42 = new EnumC21376018l4(1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C418440Gaw.LIZIZ(4), "MIDDLE", C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        MIDDLE = enumC21376018l42;
        EnumC21376018l4 enumC21376018l43 = new EnumC21376018l4(2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C21375518kz.LIZ > 0 ? C418440Gaw.LIZIZ(6) : C418440Gaw.LIZIZ(4), "LARGE", C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        LARGE = enumC21376018l43;
        EnumC21376018l4[] enumC21376018l4Arr = {enumC21376018l4, enumC21376018l42, enumC21376018l43};
        LLILZIL = enumC21376018l4Arr;
        LLILZLL = new C2254308sP(enumC21376018l4Arr);
    }

    public static EnumC21376018l4[] values() {
        return (EnumC21376018l4[]) LLILZIL.clone();
    }

    public final int getLabelHeight() {
        return this.LL;
    }

    public final float getLabelRadius() {
        return this.LLILLJJLI;
    }

    public final int getTagGroupPaddingHorizontal() {
        return this.LLILLL;
    }

    public final int getTagSpace() {
        return this.LLILZ;
    }

    public static EnumC21376018l4 valueOf(String str) {
        return (EnumC21376018l4) C08FF.LIZ(EnumC21376018l4.class, str);
    }

    public EnumC21376018l4(int i, int i2, int i3, float f, String str, int i4) {
        this.LL = i2;
        this.LLILLJJLI = f;
        this.LLILLL = i3;
        this.LLILZ = i4;
    }
}
