package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1183110gtR {
    public static final EnumC1183110gtR AWEME;
    public static final EnumC1183110gtR BANNER;
    public static final /* synthetic */ EnumC1183110gtR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1183110gtR REVIEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1183110gtR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1183110gtR enumC1183110gtR = new EnumC1183110gtR("AWEME", 0, 1);
        AWEME = enumC1183110gtR;
        EnumC1183110gtR enumC1183110gtR2 = new EnumC1183110gtR("REVIEW", 1, 2);
        REVIEW = enumC1183110gtR2;
        EnumC1183110gtR enumC1183110gtR3 = new EnumC1183110gtR("BANNER", 2, 3);
        BANNER = enumC1183110gtR3;
        EnumC1183110gtR[] enumC1183110gtRArr = {enumC1183110gtR, enumC1183110gtR2, enumC1183110gtR3};
        LLILLJJLI = enumC1183110gtRArr;
        LLILLL = new C2254308sP(enumC1183110gtRArr);
    }

    public static EnumC1183110gtR[] values() {
        return (EnumC1183110gtR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1183110gtR valueOf(String str) {
        return (EnumC1183110gtR) C08FF.LIZ(EnumC1183110gtR.class, str);
    }

    public EnumC1183110gtR(String str, int i, int i2) {
        this.LL = i2;
    }
}
