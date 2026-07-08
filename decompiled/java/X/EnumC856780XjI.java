package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC856780XjI {
    public static final EnumC856780XjI ECOMMERCE_CHECK_TYPE;
    public static final /* synthetic */ EnumC856780XjI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC856780XjI LONG_VIDEO_CHECK_TYPE;
    public static final EnumC856780XjI POSSIBLE_SUBSCRIBE_LONG_VIDEO_CHECK_TYPE;
    public static final EnumC856780XjI SHORT_VIDEO_CHECK_TYPE;
    public static final EnumC856780XjI SUBSCRIBE_VIDEO_CHECK_TYPE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC856780XjI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC856780XjI enumC856780XjI = new EnumC856780XjI("SUBSCRIBE_VIDEO_CHECK_TYPE", 0, 1);
        SUBSCRIBE_VIDEO_CHECK_TYPE = enumC856780XjI;
        EnumC856780XjI enumC856780XjI2 = new EnumC856780XjI("POSSIBLE_SUBSCRIBE_LONG_VIDEO_CHECK_TYPE", 1, 0);
        POSSIBLE_SUBSCRIBE_LONG_VIDEO_CHECK_TYPE = enumC856780XjI2;
        EnumC856780XjI enumC856780XjI3 = new EnumC856780XjI("LONG_VIDEO_CHECK_TYPE", 2, 2);
        LONG_VIDEO_CHECK_TYPE = enumC856780XjI3;
        EnumC856780XjI enumC856780XjI4 = new EnumC856780XjI("ECOMMERCE_CHECK_TYPE", 3, 3);
        ECOMMERCE_CHECK_TYPE = enumC856780XjI4;
        EnumC856780XjI enumC856780XjI5 = new EnumC856780XjI("SHORT_VIDEO_CHECK_TYPE", 4, 4);
        SHORT_VIDEO_CHECK_TYPE = enumC856780XjI5;
        EnumC856780XjI[] enumC856780XjIArr = {enumC856780XjI, enumC856780XjI2, enumC856780XjI3, enumC856780XjI4, enumC856780XjI5};
        LLILLJJLI = enumC856780XjIArr;
        LLILLL = new C2254308sP(enumC856780XjIArr);
    }

    public static EnumC856780XjI[] values() {
        return (EnumC856780XjI[]) LLILLJJLI.clone();
    }

    public final int getCheckType() {
        return this.LL;
    }

    public static EnumC856780XjI valueOf(String str) {
        return (EnumC856780XjI) C08FF.LIZ(EnumC856780XjI.class, str);
    }

    public EnumC856780XjI(String str, int i, int i2) {
        this.LL = i2;
    }
}
