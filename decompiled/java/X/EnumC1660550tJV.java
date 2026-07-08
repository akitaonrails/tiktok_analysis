package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tJV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1660550tJV {
    public static final EnumC1660550tJV AR_MODE;
    public static final EnumC1660550tJV IMAGE_MODE;
    public static final /* synthetic */ EnumC1660550tJV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1660550tJV VIDEO_MODE;

    public static InterfaceC2044707zh<EnumC1660550tJV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1660550tJV enumC1660550tJV = new EnumC1660550tJV("VIDEO_MODE", 0);
        VIDEO_MODE = enumC1660550tJV;
        EnumC1660550tJV enumC1660550tJV2 = new EnumC1660550tJV("IMAGE_MODE", 1);
        IMAGE_MODE = enumC1660550tJV2;
        EnumC1660550tJV enumC1660550tJV3 = new EnumC1660550tJV("AR_MODE", 2);
        AR_MODE = enumC1660550tJV3;
        EnumC1660550tJV[] enumC1660550tJVArr = {enumC1660550tJV, enumC1660550tJV2, enumC1660550tJV3};
        LL = enumC1660550tJVArr;
        LLILLJJLI = new C2254308sP(enumC1660550tJVArr);
    }

    public static EnumC1660550tJV[] values() {
        return (EnumC1660550tJV[]) LL.clone();
    }

    public static EnumC1660550tJV valueOf(String str) {
        return (EnumC1660550tJV) C08FF.LIZ(EnumC1660550tJV.class, str);
    }

    public EnumC1660550tJV(String str, int i) {
    }
}
