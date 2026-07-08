package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ro0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC706820Ro0 {
    public static final EnumC706820Ro0 ALL;
    public static final EnumC706820Ro0 BOTTOM_AREA;
    public static final EnumC706820Ro0 LEFT_AREA;
    public static final /* synthetic */ EnumC706820Ro0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC706820Ro0 MIDDLE_AREA;
    public static final EnumC706820Ro0 RIGHT_AREA;
    public final int LL;

    public static InterfaceC2044707zh<EnumC706820Ro0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC706820Ro0 enumC706820Ro0 = new EnumC706820Ro0("ALL", 0, 1);
        ALL = enumC706820Ro0;
        EnumC706820Ro0 enumC706820Ro02 = new EnumC706820Ro0("LEFT_AREA", 1, 2);
        LEFT_AREA = enumC706820Ro02;
        EnumC706820Ro0 enumC706820Ro03 = new EnumC706820Ro0("RIGHT_AREA", 2, 4);
        RIGHT_AREA = enumC706820Ro03;
        EnumC706820Ro0 enumC706820Ro04 = new EnumC706820Ro0("BOTTOM_AREA", 3, 5);
        BOTTOM_AREA = enumC706820Ro04;
        EnumC706820Ro0 enumC706820Ro05 = new EnumC706820Ro0("MIDDLE_AREA", 4, 6);
        MIDDLE_AREA = enumC706820Ro05;
        EnumC706820Ro0[] enumC706820Ro0Arr = {enumC706820Ro0, enumC706820Ro02, enumC706820Ro03, enumC706820Ro04, enumC706820Ro05};
        LLILLJJLI = enumC706820Ro0Arr;
        LLILLL = new C2254308sP(enumC706820Ro0Arr);
    }

    public static EnumC706820Ro0[] values() {
        return (EnumC706820Ro0[]) LLILLJJLI.clone();
    }

    public final int getCategory() {
        return this.LL;
    }

    public static EnumC706820Ro0 valueOf(String str) {
        return (EnumC706820Ro0) C08FF.LIZ(EnumC706820Ro0.class, str);
    }

    public EnumC706820Ro0(String str, int i, int i2) {
        this.LL = i2;
    }
}
