package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780670wRF {
    public static final EnumC1780670wRF FINITE_RECURRING;
    public static final EnumC1780670wRF INFINITE_RECURRING;
    public static final /* synthetic */ EnumC1780670wRF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780670wRF NON_RECURRING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1780670wRF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780670wRF enumC1780670wRF = new EnumC1780670wRF("INFINITE_RECURRING", 0, 1);
        INFINITE_RECURRING = enumC1780670wRF;
        EnumC1780670wRF enumC1780670wRF2 = new EnumC1780670wRF("FINITE_RECURRING", 1, 2);
        FINITE_RECURRING = enumC1780670wRF2;
        EnumC1780670wRF enumC1780670wRF3 = new EnumC1780670wRF("NON_RECURRING", 2, 3);
        NON_RECURRING = enumC1780670wRF3;
        EnumC1780670wRF[] enumC1780670wRFArr = {enumC1780670wRF, enumC1780670wRF2, enumC1780670wRF3};
        LLILLJJLI = enumC1780670wRFArr;
        LLILLL = new C2254308sP(enumC1780670wRFArr);
    }

    public static EnumC1780670wRF[] values() {
        return (EnumC1780670wRF[]) LLILLJJLI.clone();
    }

    public final int getMode() {
        return this.LL;
    }

    public static EnumC1780670wRF valueOf(String str) {
        return (EnumC1780670wRF) C08FF.LIZ(EnumC1780670wRF.class, str);
    }

    public EnumC1780670wRF(String str, int i, int i2) {
        this.LL = i2;
    }
}
