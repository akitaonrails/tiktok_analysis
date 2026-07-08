package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC797220VPc {
    public static final EnumC797220VPc CURRENT;
    public static final EnumC797220VPc EIGHT2TWENTYONE;
    public static final /* synthetic */ EnumC797220VPc[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC797220VPc SEVEN2EIGHT_PM;
    public static final EnumC797220VPc TWO2THREE_PM;
    public final int LL;
    public final float LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC797220VPc> getEntries() {
        return LLILZIL;
    }

    static {
        int i = 0;
        EnumC797220VPc enumC797220VPc = new EnumC797220VPc("CURRENT", i, i, 0.0f);
        CURRENT = enumC797220VPc;
        int i2 = 1;
        EnumC797220VPc enumC797220VPc2 = new EnumC797220VPc("TWO2THREE_PM", i2, i2, 14.0f);
        TWO2THREE_PM = enumC797220VPc2;
        int i3 = 2;
        EnumC797220VPc enumC797220VPc3 = new EnumC797220VPc("SEVEN2EIGHT_PM", i3, i3, 19.0f);
        SEVEN2EIGHT_PM = enumC797220VPc3;
        EnumC797220VPc enumC797220VPc4 = new EnumC797220VPc(8.0f, 3, 3, 780, "EIGHT2TWENTYONE");
        EIGHT2TWENTYONE = enumC797220VPc4;
        EnumC797220VPc[] enumC797220VPcArr = {enumC797220VPc, enumC797220VPc2, enumC797220VPc3, enumC797220VPc4};
        LLILZ = enumC797220VPcArr;
        LLILZIL = new C2254308sP(enumC797220VPcArr);
    }

    public static EnumC797220VPc[] values() {
        return (EnumC797220VPc[]) LLILZ.clone();
    }

    public final int getDuration() {
        return this.LLILLL;
    }

    public final int getIndex() {
        return this.LL;
    }

    public final float getStartHour() {
        return this.LLILLJJLI;
    }

    public static EnumC797220VPc valueOf(String str) {
        return (EnumC797220VPc) C08FF.LIZ(EnumC797220VPc.class, str);
    }

    public /* synthetic */ EnumC797220VPc(String str, int i, int i2, float f) {
        this(f, i, i2, 60, str);
    }

    public EnumC797220VPc(float f, int i, int i2, int i3, String str) {
        this.LL = i2;
        this.LLILLJJLI = f;
        this.LLILLL = i3;
    }
}
