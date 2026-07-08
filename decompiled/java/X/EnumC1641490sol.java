package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641490sol {
    public static final /* synthetic */ EnumC1641490sol[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641490sol PROVIDER_STICKER_STATE_DOWNLOADING;
    public static final EnumC1641490sol PROVIDER_STICKER_STATE_DOWNLOAD_FAILED;
    public static final EnumC1641490sol PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS;
    public static final EnumC1641490sol PROVIDER_STICKER_STATE_NOT_DOWNLOAD;
    public static final EnumC1641490sol PROVIDER_STICKER_STATE_UNKNOWN;

    public static InterfaceC2044707zh<EnumC1641490sol> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641490sol enumC1641490sol = new EnumC1641490sol("PROVIDER_STICKER_STATE_UNKNOWN", 0);
        PROVIDER_STICKER_STATE_UNKNOWN = enumC1641490sol;
        EnumC1641490sol enumC1641490sol2 = new EnumC1641490sol("PROVIDER_STICKER_STATE_NOT_DOWNLOAD", 1);
        PROVIDER_STICKER_STATE_NOT_DOWNLOAD = enumC1641490sol2;
        EnumC1641490sol enumC1641490sol3 = new EnumC1641490sol("PROVIDER_STICKER_STATE_DOWNLOADING", 2);
        PROVIDER_STICKER_STATE_DOWNLOADING = enumC1641490sol3;
        EnumC1641490sol enumC1641490sol4 = new EnumC1641490sol("PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS", 3);
        PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS = enumC1641490sol4;
        EnumC1641490sol enumC1641490sol5 = new EnumC1641490sol("PROVIDER_STICKER_STATE_DOWNLOAD_FAILED", 4);
        PROVIDER_STICKER_STATE_DOWNLOAD_FAILED = enumC1641490sol5;
        EnumC1641490sol[] enumC1641490solArr = {enumC1641490sol, enumC1641490sol2, enumC1641490sol3, enumC1641490sol4, enumC1641490sol5};
        LL = enumC1641490solArr;
        LLILLJJLI = new C2254308sP(enumC1641490solArr);
    }

    public static EnumC1641490sol[] values() {
        return (EnumC1641490sol[]) LL.clone();
    }

    public static EnumC1641490sol valueOf(String str) {
        return (EnumC1641490sol) C08FF.LIZ(EnumC1641490sol.class, str);
    }

    public EnumC1641490sol(String str, int i) {
    }
}
