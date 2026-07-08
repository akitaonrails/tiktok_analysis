package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01nR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC439901nR {
    public static final EnumC439901nR GUEST;
    public static final EnumC439901nR HOST;
    public static final /* synthetic */ EnumC439901nR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC439901nR SEND_GIFT;
    public static final EnumC439901nR SEND_LIKE;

    public static InterfaceC2044707zh<EnumC439901nR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439901nR enumC439901nR = new EnumC439901nR("HOST", 0);
        HOST = enumC439901nR;
        EnumC439901nR enumC439901nR2 = new EnumC439901nR("GUEST", 1);
        GUEST = enumC439901nR2;
        EnumC439901nR enumC439901nR3 = new EnumC439901nR("SEND_GIFT", 2);
        SEND_GIFT = enumC439901nR3;
        EnumC439901nR enumC439901nR4 = new EnumC439901nR("SEND_LIKE", 3);
        SEND_LIKE = enumC439901nR4;
        EnumC439901nR[] enumC439901nRArr = {enumC439901nR, enumC439901nR2, enumC439901nR3, enumC439901nR4};
        LL = enumC439901nRArr;
        LLILLJJLI = new C2254308sP(enumC439901nRArr);
    }

    public static EnumC439901nR[] values() {
        return (EnumC439901nR[]) LL.clone();
    }

    public static EnumC439901nR valueOf(String str) {
        return (EnumC439901nR) C08FF.LIZ(EnumC439901nR.class, str);
    }

    public EnumC439901nR(String str, int i) {
    }
}
