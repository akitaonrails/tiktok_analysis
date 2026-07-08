package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC457080HwA {
    public static final EnumC457080HwA CENTER;
    public static final /* synthetic */ EnumC457080HwA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC457080HwA TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC457080HwA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC457080HwA enumC457080HwA = new EnumC457080HwA("CENTER", 0, 0);
        CENTER = enumC457080HwA;
        EnumC457080HwA enumC457080HwA2 = new EnumC457080HwA("TOP", 1, 1);
        TOP = enumC457080HwA2;
        EnumC457080HwA[] enumC457080HwAArr = {enumC457080HwA, enumC457080HwA2};
        LLILLJJLI = enumC457080HwAArr;
        LLILLL = new C2254308sP(enumC457080HwAArr);
    }

    public static EnumC457080HwA[] values() {
        return (EnumC457080HwA[]) LLILLJJLI.clone();
    }

    public final int getLocationValue() {
        return this.LL;
    }

    public static EnumC457080HwA valueOf(String str) {
        return (EnumC457080HwA) C08FF.LIZ(EnumC457080HwA.class, str);
    }

    public EnumC457080HwA(String str, int i, int i2) {
        this.LL = i2;
    }
}
