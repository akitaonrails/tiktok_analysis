package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1093370eYh {
    public static final EnumC1093370eYh EPI;
    public static final EnumC1093370eYh EPI_SERVER;
    public static final /* synthetic */ EnumC1093370eYh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1093370eYh PITAYA;
    public static final EnumC1093370eYh PITAYA_CEP;
    public static final EnumC1093370eYh PSP;
    public static final EnumC1093370eYh STAR_SHIP;
    public static final EnumC1093370eYh TTM_CEL;
    public static final EnumC1093370eYh TTM_CEP;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1093370eYh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1093370eYh enumC1093370eYh = new EnumC1093370eYh("PITAYA", 0, 1L);
        PITAYA = enumC1093370eYh;
        EnumC1093370eYh enumC1093370eYh2 = new EnumC1093370eYh("PSP", 1, 2L);
        PSP = enumC1093370eYh2;
        EnumC1093370eYh enumC1093370eYh3 = new EnumC1093370eYh("PITAYA_CEP", 2, 3L);
        PITAYA_CEP = enumC1093370eYh3;
        EnumC1093370eYh enumC1093370eYh4 = new EnumC1093370eYh("EPI", 3, 4L);
        EPI = enumC1093370eYh4;
        EnumC1093370eYh enumC1093370eYh5 = new EnumC1093370eYh("TTM_CEL", 4, 5L);
        TTM_CEL = enumC1093370eYh5;
        EnumC1093370eYh enumC1093370eYh6 = new EnumC1093370eYh("TTM_CEP", 5, 6L);
        TTM_CEP = enumC1093370eYh6;
        EnumC1093370eYh enumC1093370eYh7 = new EnumC1093370eYh("EPI_SERVER", 6, 7L);
        EPI_SERVER = enumC1093370eYh7;
        EnumC1093370eYh enumC1093370eYh8 = new EnumC1093370eYh("STAR_SHIP", 7, 8L);
        STAR_SHIP = enumC1093370eYh8;
        EnumC1093370eYh[] enumC1093370eYhArr = {enumC1093370eYh, enumC1093370eYh2, enumC1093370eYh3, enumC1093370eYh4, enumC1093370eYh5, enumC1093370eYh6, enumC1093370eYh7, enumC1093370eYh8};
        LLILLJJLI = enumC1093370eYhArr;
        LLILLL = new C2254308sP(enumC1093370eYhArr);
    }

    public static EnumC1093370eYh[] values() {
        return (EnumC1093370eYh[]) LLILLJJLI.clone();
    }

    public final long getType() {
        return this.LL;
    }

    public static EnumC1093370eYh valueOf(String str) {
        return (EnumC1093370eYh) C08FF.LIZ(EnumC1093370eYh.class, str);
    }

    public EnumC1093370eYh(String str, int i, long j) {
        this.LL = j;
    }
}
