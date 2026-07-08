package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC390270FRx {
    public static final EnumC390270FRx LARGER_BLACK;
    public static final EnumC390270FRx LARGE_YELLOW;
    public static final /* synthetic */ EnumC390270FRx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC390270FRx SMALL_BLUE;
    public static final EnumC390270FRx SMALL_YELLOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC390270FRx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC390270FRx enumC390270FRx = new EnumC390270FRx("LARGER_BLACK", 0, 2);
        LARGER_BLACK = enumC390270FRx;
        EnumC390270FRx enumC390270FRx2 = new EnumC390270FRx("LARGE_YELLOW", 1, 4);
        LARGE_YELLOW = enumC390270FRx2;
        EnumC390270FRx enumC390270FRx3 = new EnumC390270FRx("SMALL_YELLOW", 2, 5);
        SMALL_YELLOW = enumC390270FRx3;
        EnumC390270FRx enumC390270FRx4 = new EnumC390270FRx("SMALL_BLUE", 3, 6);
        SMALL_BLUE = enumC390270FRx4;
        EnumC390270FRx[] enumC390270FRxArr = {enumC390270FRx, enumC390270FRx2, enumC390270FRx3, enumC390270FRx4};
        LLILLJJLI = enumC390270FRxArr;
        LLILLL = new C2254308sP(enumC390270FRxArr);
    }

    public static EnumC390270FRx[] values() {
        return (EnumC390270FRx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC390270FRx valueOf(String str) {
        return (EnumC390270FRx) C08FF.LIZ(EnumC390270FRx.class, str);
    }

    public EnumC390270FRx(String str, int i, int i2) {
        this.LL = i2;
    }
}
