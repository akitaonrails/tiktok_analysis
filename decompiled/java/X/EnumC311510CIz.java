package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311510CIz {
    public static final /* synthetic */ EnumC311510CIz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC311510CIz TYPE_SPARK;
    public static final EnumC311510CIz TYPE_SPARK_LITE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC311510CIz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC311510CIz enumC311510CIz = new EnumC311510CIz("TYPE_SPARK_LITE", 0, 51000);
        TYPE_SPARK_LITE = enumC311510CIz;
        EnumC311510CIz enumC311510CIz2 = new EnumC311510CIz("TYPE_SPARK", 1, 51001);
        TYPE_SPARK = enumC311510CIz2;
        EnumC311510CIz[] enumC311510CIzArr = {enumC311510CIz, enumC311510CIz2};
        LLILLJJLI = enumC311510CIzArr;
        LLILLL = new C2254308sP(enumC311510CIzArr);
    }

    public static EnumC311510CIz[] values() {
        return (EnumC311510CIz[]) LLILLJJLI.clone();
    }

    public final int getTypeValue() {
        return this.LL;
    }

    public static EnumC311510CIz valueOf(String str) {
        return (EnumC311510CIz) C08FF.LIZ(EnumC311510CIz.class, str);
    }

    public EnumC311510CIz(String str, int i, int i2) {
        this.LL = i2;
    }
}
