package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1993807rU {
    public static final /* synthetic */ EnumC1993807rU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1993807rU NORMAL_VIDEO_CARD;
    public static final EnumC1993807rU TRENDING_VIDEO_CARD;

    public static InterfaceC2044707zh<EnumC1993807rU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1993807rU enumC1993807rU = new EnumC1993807rU("NORMAL_VIDEO_CARD", 0);
        NORMAL_VIDEO_CARD = enumC1993807rU;
        EnumC1993807rU enumC1993807rU2 = new EnumC1993807rU("TRENDING_VIDEO_CARD", 1);
        TRENDING_VIDEO_CARD = enumC1993807rU2;
        EnumC1993807rU[] enumC1993807rUArr = {enumC1993807rU, enumC1993807rU2};
        LL = enumC1993807rUArr;
        LLILLJJLI = new C2254308sP(enumC1993807rUArr);
    }

    public static EnumC1993807rU[] values() {
        return (EnumC1993807rU[]) LL.clone();
    }

    public static EnumC1993807rU valueOf(String str) {
        return (EnumC1993807rU) C08FF.LIZ(EnumC1993807rU.class, str);
    }

    public EnumC1993807rU(String str, int i) {
    }
}
