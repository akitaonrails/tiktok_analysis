package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009307tz {
    public static final EnumC2009307tz COMPRESS_WITHOUT_QUALITY;
    public static final EnumC2009307tz COMPRESS_WITH_QUALITY;
    public static final /* synthetic */ EnumC2009307tz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2009307tz NO_COMPRESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009307tz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009307tz enumC2009307tz = new EnumC2009307tz("NO_COMPRESS", 0, 0);
        NO_COMPRESS = enumC2009307tz;
        EnumC2009307tz enumC2009307tz2 = new EnumC2009307tz("COMPRESS_WITH_QUALITY", 1, 1);
        COMPRESS_WITH_QUALITY = enumC2009307tz2;
        EnumC2009307tz enumC2009307tz3 = new EnumC2009307tz("COMPRESS_WITHOUT_QUALITY", 2, 2);
        COMPRESS_WITHOUT_QUALITY = enumC2009307tz3;
        EnumC2009307tz[] enumC2009307tzArr = {enumC2009307tz, enumC2009307tz2, enumC2009307tz3};
        LLILLJJLI = enumC2009307tzArr;
        LLILLL = new C2254308sP(enumC2009307tzArr);
    }

    public static EnumC2009307tz[] values() {
        return (EnumC2009307tz[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2009307tz valueOf(String str) {
        return (EnumC2009307tz) C08FF.LIZ(EnumC2009307tz.class, str);
    }

    public EnumC2009307tz(String str, int i, int i2) {
        this.LL = i2;
    }
}
