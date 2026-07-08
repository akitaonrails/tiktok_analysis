package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311470CIv {
    public static final EnumC311470CIv BAR_ENTRANCE_REFRESH_TYPE_APPEAR;
    public static final EnumC311470CIv BAR_ENTRANCE_REFRESH_TYPE_NONE;
    public static final /* synthetic */ EnumC311470CIv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC311470CIv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC311470CIv enumC311470CIv = new EnumC311470CIv("BAR_ENTRANCE_REFRESH_TYPE_NONE", 0, 0);
        BAR_ENTRANCE_REFRESH_TYPE_NONE = enumC311470CIv;
        EnumC311470CIv enumC311470CIv2 = new EnumC311470CIv("BAR_ENTRANCE_REFRESH_TYPE_APPEAR", 1, 1);
        BAR_ENTRANCE_REFRESH_TYPE_APPEAR = enumC311470CIv2;
        EnumC311470CIv[] enumC311470CIvArr = {enumC311470CIv, enumC311470CIv2};
        LLILLJJLI = enumC311470CIvArr;
        LLILLL = new C2254308sP(enumC311470CIvArr);
    }

    public static EnumC311470CIv[] values() {
        return (EnumC311470CIv[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC311470CIv valueOf(String str) {
        return (EnumC311470CIv) C08FF.LIZ(EnumC311470CIv.class, str);
    }

    public EnumC311470CIv(String str, int i, int i2) {
        this.LL = i2;
    }
}
