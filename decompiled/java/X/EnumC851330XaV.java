package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC851330XaV {
    public static final EnumC851330XaV EMAIL;
    public static final /* synthetic */ EnumC851330XaV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC851330XaV PHONE;
    public static final EnumC851330XaV THIRD_PARTY;

    public static InterfaceC2044707zh<EnumC851330XaV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC851330XaV enumC851330XaV = new EnumC851330XaV("PHONE", 0);
        PHONE = enumC851330XaV;
        EnumC851330XaV enumC851330XaV2 = new EnumC851330XaV("EMAIL", 1);
        EMAIL = enumC851330XaV2;
        EnumC851330XaV enumC851330XaV3 = new EnumC851330XaV("THIRD_PARTY", 2);
        THIRD_PARTY = enumC851330XaV3;
        EnumC851330XaV[] enumC851330XaVArr = {enumC851330XaV, enumC851330XaV2, enumC851330XaV3};
        LL = enumC851330XaVArr;
        LLILLJJLI = new C2254308sP(enumC851330XaVArr);
    }

    public static EnumC851330XaV[] values() {
        return (EnumC851330XaV[]) LL.clone();
    }

    public static EnumC851330XaV valueOf(String str) {
        return (EnumC851330XaV) C08FF.LIZ(EnumC851330XaV.class, str);
    }

    public EnumC851330XaV(String str, int i) {
    }
}
