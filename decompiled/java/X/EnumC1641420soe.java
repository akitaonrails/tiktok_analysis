package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641420soe {
    public static final EnumC1641420soe DOWNLOADING;
    public static final EnumC1641420soe DOWNLOAD_FAILED;
    public static final EnumC1641420soe DOWNLOAD_SUCCESS;
    public static final /* synthetic */ EnumC1641420soe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641420soe NOT_DOWNLOAD;
    public static final EnumC1641420soe UNKNOWN;

    public static InterfaceC2044707zh<EnumC1641420soe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641420soe enumC1641420soe = new EnumC1641420soe("UNKNOWN", 0);
        UNKNOWN = enumC1641420soe;
        EnumC1641420soe enumC1641420soe2 = new EnumC1641420soe("NOT_DOWNLOAD", 1);
        NOT_DOWNLOAD = enumC1641420soe2;
        EnumC1641420soe enumC1641420soe3 = new EnumC1641420soe("DOWNLOADING", 2);
        DOWNLOADING = enumC1641420soe3;
        EnumC1641420soe enumC1641420soe4 = new EnumC1641420soe("DOWNLOAD_SUCCESS", 3);
        DOWNLOAD_SUCCESS = enumC1641420soe4;
        EnumC1641420soe enumC1641420soe5 = new EnumC1641420soe("DOWNLOAD_FAILED", 4);
        DOWNLOAD_FAILED = enumC1641420soe5;
        EnumC1641420soe[] enumC1641420soeArr = {enumC1641420soe, enumC1641420soe2, enumC1641420soe3, enumC1641420soe4, enumC1641420soe5};
        LL = enumC1641420soeArr;
        LLILLJJLI = new C2254308sP(enumC1641420soeArr);
    }

    public static EnumC1641420soe[] values() {
        return (EnumC1641420soe[]) LL.clone();
    }

    public static EnumC1641420soe valueOf(String str) {
        return (EnumC1641420soe) C08FF.LIZ(EnumC1641420soe.class, str);
    }

    public EnumC1641420soe(String str, int i) {
    }
}
