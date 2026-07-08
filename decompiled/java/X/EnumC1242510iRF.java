package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1242510iRF {
    public static final EnumC1242510iRF EMPTY;
    public static final /* synthetic */ EnumC1242510iRF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1242510iRF NOT_EMPTY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1242510iRF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1242510iRF enumC1242510iRF = new EnumC1242510iRF("NOT_EMPTY", 0, 0);
        NOT_EMPTY = enumC1242510iRF;
        EnumC1242510iRF enumC1242510iRF2 = new EnumC1242510iRF("EMPTY", 1, 1);
        EMPTY = enumC1242510iRF2;
        EnumC1242510iRF[] enumC1242510iRFArr = {enumC1242510iRF, enumC1242510iRF2};
        LLILLJJLI = enumC1242510iRFArr;
        LLILLL = new C2254308sP(enumC1242510iRFArr);
    }

    public static EnumC1242510iRF[] values() {
        return (EnumC1242510iRF[]) LLILLJJLI.clone();
    }

    public final int getEtNumber() {
        return this.LL;
    }

    public static EnumC1242510iRF valueOf(String str) {
        return (EnumC1242510iRF) C08FF.LIZ(EnumC1242510iRF.class, str);
    }

    public EnumC1242510iRF(String str, int i, int i2) {
        this.LL = i2;
    }
}
