package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC797240VPe {
    public static final /* synthetic */ EnumC797240VPe[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC797240VPe THREE2FOUR_PM;
    public static final EnumC797240VPe TWO2FIVE_AM;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC797240VPe> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC797240VPe enumC797240VPe = new EnumC797240VPe("TWO2FIVE_AM", 0, 1, 2, 180);
        TWO2FIVE_AM = enumC797240VPe;
        EnumC797240VPe enumC797240VPe2 = new EnumC797240VPe("THREE2FOUR_PM", 1, 2, 15, 60);
        THREE2FOUR_PM = enumC797240VPe2;
        EnumC797240VPe[] enumC797240VPeArr = {enumC797240VPe, enumC797240VPe2};
        LLILZ = enumC797240VPeArr;
        LLILZIL = new C2254308sP(enumC797240VPeArr);
    }

    public static EnumC797240VPe[] values() {
        return (EnumC797240VPe[]) LLILZ.clone();
    }

    public final int getDuration() {
        return this.LLILLL;
    }

    public final int getIndex() {
        return this.LL;
    }

    public final int getStartHour() {
        return this.LLILLJJLI;
    }

    public static EnumC797240VPe valueOf(String str) {
        return (EnumC797240VPe) C08FF.LIZ(EnumC797240VPe.class, str);
    }

    public EnumC797240VPe(String str, int i, int i2, int i3, int i4) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
    }
}
