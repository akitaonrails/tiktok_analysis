package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC618610OOd {
    public static final EnumC618610OOd ALL_FAILED;
    public static final EnumC618610OOd DUPLICATE;
    public static final EnumC618610OOd INVALID;
    public static final /* synthetic */ EnumC618610OOd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC618610OOd NO_INTERNET;
    public static final EnumC618610OOd SUCCESS;
    public static final EnumC618610OOd TEXT_FAILED;

    public static InterfaceC2044707zh<EnumC618610OOd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC618610OOd enumC618610OOd = new EnumC618610OOd("INVALID", 0);
        INVALID = enumC618610OOd;
        EnumC618610OOd enumC618610OOd2 = new EnumC618610OOd("SUCCESS", 1);
        SUCCESS = enumC618610OOd2;
        EnumC618610OOd enumC618610OOd3 = new EnumC618610OOd("NO_INTERNET", 2);
        NO_INTERNET = enumC618610OOd3;
        EnumC618610OOd enumC618610OOd4 = new EnumC618610OOd("ALL_FAILED", 3);
        ALL_FAILED = enumC618610OOd4;
        EnumC618610OOd enumC618610OOd5 = new EnumC618610OOd("TEXT_FAILED", 4);
        TEXT_FAILED = enumC618610OOd5;
        EnumC618610OOd enumC618610OOd6 = new EnumC618610OOd("DUPLICATE", 5);
        DUPLICATE = enumC618610OOd6;
        EnumC618610OOd[] enumC618610OOdArr = {enumC618610OOd, enumC618610OOd2, enumC618610OOd3, enumC618610OOd4, enumC618610OOd5, enumC618610OOd6};
        LL = enumC618610OOdArr;
        LLILLJJLI = new C2254308sP(enumC618610OOdArr);
    }

    public static EnumC618610OOd[] values() {
        return (EnumC618610OOd[]) LL.clone();
    }

    public static EnumC618610OOd valueOf(String str) {
        return (EnumC618610OOd) C08FF.LIZ(EnumC618610OOd.class, str);
    }

    public EnumC618610OOd(String str, int i) {
    }
}
