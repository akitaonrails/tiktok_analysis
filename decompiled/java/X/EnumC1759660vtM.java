package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1759660vtM {
    public static final EnumC1759660vtM BIZ_TYPE_ADD_ON_ENTRANCE;
    public static final EnumC1759660vtM BIZ_TYPE_CAMPAIGN;
    public static final EnumC1759660vtM BIZ_TYPE_COUPON;
    public static final EnumC1759660vtM BIZ_TYPE_TASK;
    public static final /* synthetic */ EnumC1759660vtM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1759660vtM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1759660vtM enumC1759660vtM = new EnumC1759660vtM("BIZ_TYPE_COUPON", 0, 1);
        BIZ_TYPE_COUPON = enumC1759660vtM;
        EnumC1759660vtM enumC1759660vtM2 = new EnumC1759660vtM("BIZ_TYPE_TASK", 1, 2);
        BIZ_TYPE_TASK = enumC1759660vtM2;
        EnumC1759660vtM enumC1759660vtM3 = new EnumC1759660vtM("BIZ_TYPE_CAMPAIGN", 2, 3);
        BIZ_TYPE_CAMPAIGN = enumC1759660vtM3;
        EnumC1759660vtM enumC1759660vtM4 = new EnumC1759660vtM("BIZ_TYPE_ADD_ON_ENTRANCE", 3, 4);
        BIZ_TYPE_ADD_ON_ENTRANCE = enumC1759660vtM4;
        EnumC1759660vtM[] enumC1759660vtMArr = {enumC1759660vtM, enumC1759660vtM2, enumC1759660vtM3, enumC1759660vtM4};
        LLILLJJLI = enumC1759660vtMArr;
        LLILLL = new C2254308sP(enumC1759660vtMArr);
    }

    public static EnumC1759660vtM[] values() {
        return (EnumC1759660vtM[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1759660vtM valueOf(String str) {
        return (EnumC1759660vtM) C08FF.LIZ(EnumC1759660vtM.class, str);
    }

    public EnumC1759660vtM(String str, int i, int i2) {
        this.LL = i2;
    }
}
