package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0291008b {
    public static final EnumC0291008b EFFECT_NOT_DOWNLOADED;
    public static final EnumC0291008b EFFECT_NULL;
    public static final EnumC0291008b FAILED_TO_GET_PLATFORM;
    public static final /* synthetic */ EnumC0291008b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0291008b PLATFORM_ERROR;
    public static final EnumC0291008b SUCCESS;
    public static final EnumC0291008b UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0291008b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0291008b enumC0291008b = new EnumC0291008b("UNKNOWN", 0, -1);
        UNKNOWN = enumC0291008b;
        EnumC0291008b enumC0291008b2 = new EnumC0291008b("SUCCESS", 1, 0);
        SUCCESS = enumC0291008b2;
        EnumC0291008b enumC0291008b3 = new EnumC0291008b("PLATFORM_ERROR", 2, 1);
        PLATFORM_ERROR = enumC0291008b3;
        EnumC0291008b enumC0291008b4 = new EnumC0291008b("FAILED_TO_GET_PLATFORM", 3, 2);
        FAILED_TO_GET_PLATFORM = enumC0291008b4;
        EnumC0291008b enumC0291008b5 = new EnumC0291008b("EFFECT_NULL", 4, 3);
        EFFECT_NULL = enumC0291008b5;
        EnumC0291008b enumC0291008b6 = new EnumC0291008b("EFFECT_NOT_DOWNLOADED", 5, 4);
        EFFECT_NOT_DOWNLOADED = enumC0291008b6;
        EnumC0291008b[] enumC0291008bArr = {enumC0291008b, enumC0291008b2, enumC0291008b3, enumC0291008b4, enumC0291008b5, enumC0291008b6};
        LLILLJJLI = enumC0291008bArr;
        LLILLL = new C2254308sP(enumC0291008bArr);
    }

    public static EnumC0291008b[] values() {
        return (EnumC0291008b[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC0291008b valueOf(String str) {
        return (EnumC0291008b) C08FF.LIZ(EnumC0291008b.class, str);
    }

    public EnumC0291008b(String str, int i, int i2) {
        this.LL = i2;
    }
}
