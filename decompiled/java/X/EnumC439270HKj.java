package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439270HKj {
    public static final EnumC439270HKj FAILURE_IMAGE_FACE_DETECTION_CHECK;
    public static final EnumC439270HKj FAILURE_IMAGE_INTERNAL_ERROR;
    public static final EnumC439270HKj FAILURE_IMAGE_TNS_CHECK;
    public static final EnumC439270HKj FAILURE_INTERNET;
    public static final /* synthetic */ EnumC439270HKj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC439270HKj NONE;

    public static InterfaceC2044707zh<EnumC439270HKj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439270HKj enumC439270HKj = new EnumC439270HKj("NONE", 0);
        NONE = enumC439270HKj;
        EnumC439270HKj enumC439270HKj2 = new EnumC439270HKj("FAILURE_IMAGE_TNS_CHECK", 1);
        FAILURE_IMAGE_TNS_CHECK = enumC439270HKj2;
        EnumC439270HKj enumC439270HKj3 = new EnumC439270HKj("FAILURE_IMAGE_FACE_DETECTION_CHECK", 2);
        FAILURE_IMAGE_FACE_DETECTION_CHECK = enumC439270HKj3;
        EnumC439270HKj enumC439270HKj4 = new EnumC439270HKj("FAILURE_IMAGE_INTERNAL_ERROR", 3);
        FAILURE_IMAGE_INTERNAL_ERROR = enumC439270HKj4;
        EnumC439270HKj enumC439270HKj5 = new EnumC439270HKj("FAILURE_INTERNET", 4);
        FAILURE_INTERNET = enumC439270HKj5;
        EnumC439270HKj[] enumC439270HKjArr = {enumC439270HKj, enumC439270HKj2, enumC439270HKj3, enumC439270HKj4, enumC439270HKj5};
        LL = enumC439270HKjArr;
        LLILLJJLI = new C2254308sP(enumC439270HKjArr);
    }

    public static EnumC439270HKj[] values() {
        return (EnumC439270HKj[]) LL.clone();
    }

    public static EnumC439270HKj valueOf(String str) {
        return (EnumC439270HKj) C08FF.LIZ(EnumC439270HKj.class, str);
    }

    public EnumC439270HKj(String str, int i) {
    }
}
