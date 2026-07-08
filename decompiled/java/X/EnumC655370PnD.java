package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC655370PnD {
    public static final EnumC655370PnD BOTTOM_USER_AREA;
    public static final /* synthetic */ EnumC655370PnD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC655370PnD VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<EnumC655370PnD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC655370PnD enumC655370PnD = new EnumC655370PnD("VIDEO", 0, 1);
        VIDEO = enumC655370PnD;
        EnumC655370PnD enumC655370PnD2 = new EnumC655370PnD("BOTTOM_USER_AREA", 1, 2);
        BOTTOM_USER_AREA = enumC655370PnD2;
        EnumC655370PnD[] enumC655370PnDArr = {enumC655370PnD, enumC655370PnD2};
        LLILLJJLI = enumC655370PnDArr;
        LLILLL = new C2254308sP(enumC655370PnDArr);
    }

    public static EnumC655370PnD[] values() {
        return (EnumC655370PnD[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC655370PnD valueOf(String str) {
        return (EnumC655370PnD) C08FF.LIZ(EnumC655370PnD.class, str);
    }

    public EnumC655370PnD(String str, int i, int i2) {
        this.LL = i2;
    }
}
