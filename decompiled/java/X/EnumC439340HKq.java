package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439340HKq {
    public static final EnumC439340HKq IMAGE_X_AUTH_KEY;
    public static final /* synthetic */ EnumC439340HKq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC439340HKq UPLOAD_IMAGE;

    public static InterfaceC2044707zh<EnumC439340HKq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439340HKq enumC439340HKq = new EnumC439340HKq("IMAGE_X_AUTH_KEY", 0);
        IMAGE_X_AUTH_KEY = enumC439340HKq;
        EnumC439340HKq enumC439340HKq2 = new EnumC439340HKq("UPLOAD_IMAGE", 1);
        UPLOAD_IMAGE = enumC439340HKq2;
        EnumC439340HKq[] enumC439340HKqArr = {enumC439340HKq, enumC439340HKq2};
        LL = enumC439340HKqArr;
        LLILLJJLI = new C2254308sP(enumC439340HKqArr);
    }

    public static EnumC439340HKq[] values() {
        return (EnumC439340HKq[]) LL.clone();
    }

    public static EnumC439340HKq valueOf(String str) {
        return (EnumC439340HKq) C08FF.LIZ(EnumC439340HKq.class, str);
    }

    public EnumC439340HKq(String str, int i) {
    }
}
