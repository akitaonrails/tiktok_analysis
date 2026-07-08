package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04Bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1058104Bv {
    public static final EnumC1058104Bv FULL;
    public static final /* synthetic */ EnumC1058104Bv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1058104Bv SEA_SKU_INFO_REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1058104Bv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1058104Bv enumC1058104Bv = new EnumC1058104Bv("FULL", 0, 0);
        FULL = enumC1058104Bv;
        EnumC1058104Bv enumC1058104Bv2 = new EnumC1058104Bv("SEA_SKU_INFO_REFRESH", 1, 1);
        SEA_SKU_INFO_REFRESH = enumC1058104Bv2;
        EnumC1058104Bv[] enumC1058104BvArr = {enumC1058104Bv, enumC1058104Bv2};
        LLILLJJLI = enumC1058104BvArr;
        LLILLL = new C2254308sP(enumC1058104BvArr);
    }

    public static EnumC1058104Bv[] values() {
        return (EnumC1058104Bv[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1058104Bv valueOf(String str) {
        return (EnumC1058104Bv) C08FF.LIZ(EnumC1058104Bv.class, str);
    }

    public EnumC1058104Bv(String str, int i, int i2) {
        this.LL = i2;
    }
}
