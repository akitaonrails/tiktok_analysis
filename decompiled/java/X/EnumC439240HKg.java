package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439240HKg {
    public static final EnumC439240HKg FAILURE_IMAGE_FACE_DETECTION_CHECK;
    public static final EnumC439240HKg FAILURE_IMAGE_INTERNAL_ERROR;
    public static final EnumC439240HKg FAILURE_IMAGE_TNS_CHECK;
    public static final EnumC439240HKg FAILURE_INTERNET;
    public static final /* synthetic */ EnumC439240HKg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC439240HKg NONE;

    public static InterfaceC2044707zh<EnumC439240HKg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439240HKg enumC439240HKg = new EnumC439240HKg("NONE", 0);
        NONE = enumC439240HKg;
        EnumC439240HKg enumC439240HKg2 = new EnumC439240HKg("FAILURE_IMAGE_TNS_CHECK", 1);
        FAILURE_IMAGE_TNS_CHECK = enumC439240HKg2;
        EnumC439240HKg enumC439240HKg3 = new EnumC439240HKg("FAILURE_IMAGE_FACE_DETECTION_CHECK", 2);
        FAILURE_IMAGE_FACE_DETECTION_CHECK = enumC439240HKg3;
        EnumC439240HKg enumC439240HKg4 = new EnumC439240HKg("FAILURE_IMAGE_INTERNAL_ERROR", 3);
        FAILURE_IMAGE_INTERNAL_ERROR = enumC439240HKg4;
        EnumC439240HKg enumC439240HKg5 = new EnumC439240HKg("FAILURE_INTERNET", 4);
        FAILURE_INTERNET = enumC439240HKg5;
        EnumC439240HKg[] enumC439240HKgArr = {enumC439240HKg, enumC439240HKg2, enumC439240HKg3, enumC439240HKg4, enumC439240HKg5};
        LL = enumC439240HKgArr;
        LLILLJJLI = new C2254308sP(enumC439240HKgArr);
    }

    public static EnumC439240HKg[] values() {
        return (EnumC439240HKg[]) LL.clone();
    }

    public static EnumC439240HKg valueOf(String str) {
        return (EnumC439240HKg) C08FF.LIZ(EnumC439240HKg.class, str);
    }

    public EnumC439240HKg(String str, int i) {
    }
}
