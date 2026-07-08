package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641480sok {
    public static final EnumC1641480sok INFO_STICKER_STATE_DOWNLOADING;
    public static final EnumC1641480sok INFO_STICKER_STATE_DOWNLOAD_FAILED;
    public static final EnumC1641480sok INFO_STICKER_STATE_DOWNLOAD_SUCCESS;
    public static final EnumC1641480sok INFO_STICKER_STATE_NOT_DOWNLOAD;
    public static final EnumC1641480sok INFO_STICKER_STATE_UNKNOWN;
    public static final /* synthetic */ EnumC1641480sok[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1641480sok> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641480sok enumC1641480sok = new EnumC1641480sok("INFO_STICKER_STATE_UNKNOWN", 0);
        INFO_STICKER_STATE_UNKNOWN = enumC1641480sok;
        EnumC1641480sok enumC1641480sok2 = new EnumC1641480sok("INFO_STICKER_STATE_NOT_DOWNLOAD", 1);
        INFO_STICKER_STATE_NOT_DOWNLOAD = enumC1641480sok2;
        EnumC1641480sok enumC1641480sok3 = new EnumC1641480sok("INFO_STICKER_STATE_DOWNLOADING", 2);
        INFO_STICKER_STATE_DOWNLOADING = enumC1641480sok3;
        EnumC1641480sok enumC1641480sok4 = new EnumC1641480sok("INFO_STICKER_STATE_DOWNLOAD_SUCCESS", 3);
        INFO_STICKER_STATE_DOWNLOAD_SUCCESS = enumC1641480sok4;
        EnumC1641480sok enumC1641480sok5 = new EnumC1641480sok("INFO_STICKER_STATE_DOWNLOAD_FAILED", 4);
        INFO_STICKER_STATE_DOWNLOAD_FAILED = enumC1641480sok5;
        EnumC1641480sok[] enumC1641480sokArr = {enumC1641480sok, enumC1641480sok2, enumC1641480sok3, enumC1641480sok4, enumC1641480sok5};
        LL = enumC1641480sokArr;
        LLILLJJLI = new C2254308sP(enumC1641480sokArr);
    }

    public static EnumC1641480sok[] values() {
        return (EnumC1641480sok[]) LL.clone();
    }

    public static EnumC1641480sok valueOf(String str) {
        return (EnumC1641480sok) C08FF.LIZ(EnumC1641480sok.class, str);
    }

    public EnumC1641480sok(String str, int i) {
    }
}
