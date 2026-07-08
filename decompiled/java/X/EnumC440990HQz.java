package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440990HQz {
    public static final EnumC440990HQz APPEND_STICKER;
    public static final EnumC440990HQz DISCARD_RESULTS;
    public static final EnumC440990HQz DOWNLOAD_STICKER;
    public static final EnumC440990HQz FAVORITE_STICKER;
    public static final /* synthetic */ EnumC440990HQz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440990HQz SEND_STICKER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC440990HQz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440990HQz enumC440990HQz = new EnumC440990HQz("FAVORITE_STICKER", 0, "favorite_sticker");
        FAVORITE_STICKER = enumC440990HQz;
        EnumC440990HQz enumC440990HQz2 = new EnumC440990HQz("SEND_STICKER", 1, "send_sticker");
        SEND_STICKER = enumC440990HQz2;
        EnumC440990HQz enumC440990HQz3 = new EnumC440990HQz("APPEND_STICKER", 2, "append_sticker");
        APPEND_STICKER = enumC440990HQz3;
        EnumC440990HQz enumC440990HQz4 = new EnumC440990HQz("DOWNLOAD_STICKER", 3, "download_sticker");
        DOWNLOAD_STICKER = enumC440990HQz4;
        EnumC440990HQz enumC440990HQz5 = new EnumC440990HQz("DISCARD_RESULTS", 4, "discard_results");
        DISCARD_RESULTS = enumC440990HQz5;
        EnumC440990HQz[] enumC440990HQzArr = {enumC440990HQz, enumC440990HQz2, enumC440990HQz3, enumC440990HQz4, enumC440990HQz5};
        LLILLJJLI = enumC440990HQzArr;
        LLILLL = new C2254308sP(enumC440990HQzArr);
    }

    public static EnumC440990HQz[] values() {
        return (EnumC440990HQz[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC440990HQz valueOf(String str) {
        return (EnumC440990HQz) C08FF.LIZ(EnumC440990HQz.class, str);
    }

    public EnumC440990HQz(String str, int i, String str2) {
        this.LL = str2;
    }
}
