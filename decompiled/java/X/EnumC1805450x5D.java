package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x5D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1805450x5D {
    public static final C1806550x6z Companion;
    public static final /* synthetic */ EnumC1805450x5D[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1805450x5D NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L1_NEW;
    public static final EnumC1805450x5D NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L1_STUBBORN;
    public static final EnumC1805450x5D NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L2_NEW;
    public static final EnumC1805450x5D NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L2_STUBBORN;
    public static final EnumC1805450x5D NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L3;
    public static final EnumC1805450x5D NOTICE_ID_KYC_INCENTIVE_REVAMP_NOTICE;
    public final EnumC1704090uRj LL;
    public final EnumC1805520x5K LLILLJJLI;
    public String LLILLL = "";
    public String LLILZ = "";

    public static InterfaceC2044707zh<EnumC1805450x5D> getEntries() {
        return LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0x6z] */
    static {
        EnumC1704090uRj enumC1704090uRj = EnumC1704090uRj.L1;
        EnumC1805520x5K enumC1805520x5K = EnumC1805520x5K.NEW;
        EnumC1805450x5D enumC1805450x5D = new EnumC1805450x5D("NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L1_NEW", 0, enumC1704090uRj, enumC1805520x5K);
        NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L1_NEW = enumC1805450x5D;
        EnumC1805520x5K enumC1805520x5K2 = EnumC1805520x5K.STUBBORN;
        EnumC1805450x5D enumC1805450x5D2 = new EnumC1805450x5D("NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L1_STUBBORN", 1, enumC1704090uRj, enumC1805520x5K2);
        NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L1_STUBBORN = enumC1805450x5D2;
        EnumC1704090uRj enumC1704090uRj2 = EnumC1704090uRj.L2;
        EnumC1805450x5D enumC1805450x5D3 = new EnumC1805450x5D("NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L2_NEW", 2, enumC1704090uRj2, enumC1805520x5K);
        NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L2_NEW = enumC1805450x5D3;
        EnumC1805450x5D enumC1805450x5D4 = new EnumC1805450x5D("NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L2_STUBBORN", 3, enumC1704090uRj2, enumC1805520x5K2);
        NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L2_STUBBORN = enumC1805450x5D4;
        EnumC1805450x5D enumC1805450x5D5 = new EnumC1805450x5D("NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L3", 4, EnumC1704090uRj.L3, EnumC1805520x5K.NONE);
        NOTICE_ID_KYC_INCENTIVE_15K_NOTICE_L3 = enumC1805450x5D5;
        EnumC1805450x5D enumC1805450x5D6 = new EnumC1805450x5D("NOTICE_ID_KYC_INCENTIVE_REVAMP_NOTICE", 5, EnumC1704090uRj.UNKNOWN, EnumC1805520x5K.REVAMP);
        NOTICE_ID_KYC_INCENTIVE_REVAMP_NOTICE = enumC1805450x5D6;
        EnumC1805450x5D[] enumC1805450x5DArr = {enumC1805450x5D, enumC1805450x5D2, enumC1805450x5D3, enumC1805450x5D4, enumC1805450x5D5, enumC1805450x5D6};
        LLILZIL = enumC1805450x5DArr;
        LLILZLL = new C2254308sP(enumC1805450x5DArr);
        Companion = new Object() { // from class: X.0x6z
        };
    }

    public static EnumC1805450x5D[] values() {
        return (EnumC1805450x5D[]) LLILZIL.clone();
    }

    public final EnumC1805520x5K getGroup() {
        return this.LLILLJJLI;
    }

    public final EnumC1704090uRj getLevel() {
        return this.LL;
    }

    public final String getSchemaUrl() {
        return this.LLILZ;
    }

    public final String getTitle() {
        return this.LLILLL;
    }

    public static EnumC1805450x5D valueOf(String str) {
        return (EnumC1805450x5D) C08FF.LIZ(EnumC1805450x5D.class, str);
    }

    public final void setSchemaUrl$livewallet_impl_release(String str) {
        this.LLILZ = str;
    }

    public final void setTitle$livewallet_impl_release(String str) {
        this.LLILLL = str;
    }

    public EnumC1805450x5D(String str, int i, EnumC1704090uRj enumC1704090uRj, EnumC1805520x5K enumC1805520x5K) {
        this.LL = enumC1704090uRj;
        this.LLILLJJLI = enumC1805520x5K;
    }
}
