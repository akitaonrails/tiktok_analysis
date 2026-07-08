package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439400HKw {
    public static final EnumC439400HKw FAILURE_IMAGE_HEADSHOT_NEEDED;
    public static final EnumC439400HKw FAILURE_IMAGE_NOT_NEUTRAL;
    public static final EnumC439400HKw FAILURE_IMAGE_NO_FACE;
    public static final /* synthetic */ EnumC439400HKw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC439400HKw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439400HKw enumC439400HKw = new EnumC439400HKw("FAILURE_IMAGE_NO_FACE", 0);
        FAILURE_IMAGE_NO_FACE = enumC439400HKw;
        EnumC439400HKw enumC439400HKw2 = new EnumC439400HKw("FAILURE_IMAGE_HEADSHOT_NEEDED", 1);
        FAILURE_IMAGE_HEADSHOT_NEEDED = enumC439400HKw2;
        EnumC439400HKw enumC439400HKw3 = new EnumC439400HKw("FAILURE_IMAGE_NOT_NEUTRAL", 2);
        FAILURE_IMAGE_NOT_NEUTRAL = enumC439400HKw3;
        EnumC439400HKw[] enumC439400HKwArr = {enumC439400HKw, enumC439400HKw2, enumC439400HKw3};
        LL = enumC439400HKwArr;
        LLILLJJLI = new C2254308sP(enumC439400HKwArr);
    }

    public static EnumC439400HKw[] values() {
        return (EnumC439400HKw[]) LL.clone();
    }

    public static EnumC439400HKw valueOf(String str) {
        return (EnumC439400HKw) C08FF.LIZ(EnumC439400HKw.class, str);
    }

    public EnumC439400HKw(String str, int i) {
    }
}
