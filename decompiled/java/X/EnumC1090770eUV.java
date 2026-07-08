package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1090770eUV {
    public static final EnumC1090770eUV EPI_FAIL;
    public static final EnumC1090770eUV FILTERED;
    public static final /* synthetic */ EnumC1090770eUV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1090770eUV PITAYA_CEP_FAIL;
    public static final EnumC1090770eUV PITAYA_FAIL;
    public static final EnumC1090770eUV PITAYA_NOT_INIT;
    public static final EnumC1090770eUV PSP_NOT_INIT;
    public static final EnumC1090770eUV STAR_SHIP_NOT_INIT;
    public static final EnumC1090770eUV TTM_CEL_FAIL;
    public static final EnumC1090770eUV TTM_NOT_INIT;
    public static final EnumC1090770eUV UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1090770eUV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1090770eUV enumC1090770eUV = new EnumC1090770eUV("UNKNOWN", 0, -1);
        UNKNOWN = enumC1090770eUV;
        EnumC1090770eUV enumC1090770eUV2 = new EnumC1090770eUV("PITAYA_FAIL", 1, -2);
        PITAYA_FAIL = enumC1090770eUV2;
        EnumC1090770eUV enumC1090770eUV3 = new EnumC1090770eUV("PITAYA_NOT_INIT", 2, -3);
        PITAYA_NOT_INIT = enumC1090770eUV3;
        EnumC1090770eUV enumC1090770eUV4 = new EnumC1090770eUV("PSP_NOT_INIT", 3, -4);
        PSP_NOT_INIT = enumC1090770eUV4;
        EnumC1090770eUV enumC1090770eUV5 = new EnumC1090770eUV("TTM_NOT_INIT", 4, -5);
        TTM_NOT_INIT = enumC1090770eUV5;
        EnumC1090770eUV enumC1090770eUV6 = new EnumC1090770eUV("PITAYA_CEP_FAIL", 5, -6);
        PITAYA_CEP_FAIL = enumC1090770eUV6;
        EnumC1090770eUV enumC1090770eUV7 = new EnumC1090770eUV("TTM_CEL_FAIL", 6, -7);
        TTM_CEL_FAIL = enumC1090770eUV7;
        EnumC1090770eUV enumC1090770eUV8 = new EnumC1090770eUV("EPI_FAIL", 7, -8);
        EPI_FAIL = enumC1090770eUV8;
        EnumC1090770eUV enumC1090770eUV9 = new EnumC1090770eUV("STAR_SHIP_NOT_INIT", 8, -9);
        STAR_SHIP_NOT_INIT = enumC1090770eUV9;
        EnumC1090770eUV enumC1090770eUV10 = new EnumC1090770eUV("FILTERED", 9, -100);
        FILTERED = enumC1090770eUV10;
        EnumC1090770eUV[] enumC1090770eUVArr = {enumC1090770eUV, enumC1090770eUV2, enumC1090770eUV3, enumC1090770eUV4, enumC1090770eUV5, enumC1090770eUV6, enumC1090770eUV7, enumC1090770eUV8, enumC1090770eUV9, enumC1090770eUV10};
        LLILLJJLI = enumC1090770eUVArr;
        LLILLL = new C2254308sP(enumC1090770eUVArr);
    }

    public static EnumC1090770eUV[] values() {
        return (EnumC1090770eUV[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1090770eUV valueOf(String str) {
        return (EnumC1090770eUV) C08FF.LIZ(EnumC1090770eUV.class, str);
    }

    public EnumC1090770eUV(String str, int i, int i2) {
        this.LL = i2;
    }
}
