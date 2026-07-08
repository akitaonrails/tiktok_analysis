package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.126j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC197015126j {
    public static final EnumC197015126j EASE_IN;
    public static final EnumC197015126j EASE_IN_OUT;
    public static final EnumC197015126j EASE_OUT;
    public static final EnumC197015126j LINEAR;
    public static final /* synthetic */ EnumC197015126j[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public final float LL;
    public final float LLILLL;
    public final float LLILLJJLI = 0.0f;
    public final float LLILZ = 1.0f;

    public static InterfaceC2044707zh<EnumC197015126j> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC197015126j enumC197015126j = new EnumC197015126j(0, 0.0f, 1.0f, "LINEAR");
        LINEAR = enumC197015126j;
        EnumC197015126j enumC197015126j2 = new EnumC197015126j(1, 0.42f, 1.0f, "EASE_IN");
        EASE_IN = enumC197015126j2;
        EnumC197015126j enumC197015126j3 = new EnumC197015126j(2, 0.0f, 0.58f, "EASE_OUT");
        EASE_OUT = enumC197015126j3;
        EnumC197015126j enumC197015126j4 = new EnumC197015126j(3, 0.42f, 0.58f, "EASE_IN_OUT");
        EASE_IN_OUT = enumC197015126j4;
        EnumC197015126j[] enumC197015126jArr = {enumC197015126j, enumC197015126j2, enumC197015126j3, enumC197015126j4};
        LLILZIL = enumC197015126jArr;
        LLILZLL = new C2254308sP(enumC197015126jArr);
    }

    public static EnumC197015126j[] values() {
        return (EnumC197015126j[]) LLILZIL.clone();
    }

    public final float getX0() {
        return this.LL;
    }

    public final float getX1() {
        return this.LLILLL;
    }

    public final float getY0() {
        return this.LLILLJJLI;
    }

    public final float getY1() {
        return this.LLILZ;
    }

    public static EnumC197015126j valueOf(String str) {
        return (EnumC197015126j) C08FF.LIZ(EnumC197015126j.class, str);
    }

    public EnumC197015126j(int i, float f, float f2, String str) {
        this.LL = f;
        this.LLILLL = f2;
    }
}
