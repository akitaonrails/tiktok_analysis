package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142210fpT {
    public static final EnumC1142210fpT AUDIO_URL_EMPTY;
    public static final EnumC1142210fpT DOWNLOAD_FAILED;
    public static final /* synthetic */ EnumC1142210fpT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1142210fpT LYRICS_URL_EMPTY;
    public static final EnumC1142210fpT NONE;
    public static final EnumC1142210fpT OFFLINE;
    public static final EnumC1142210fpT PLAYER_ERROR;
    public static final EnumC1142210fpT RESOURCE_EMPTY;
    public static final EnumC1142210fpT UNKNOWN;

    public static InterfaceC2044707zh<EnumC1142210fpT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142210fpT enumC1142210fpT = new EnumC1142210fpT("NONE", 0);
        NONE = enumC1142210fpT;
        EnumC1142210fpT enumC1142210fpT2 = new EnumC1142210fpT("RESOURCE_EMPTY", 1);
        RESOURCE_EMPTY = enumC1142210fpT2;
        EnumC1142210fpT enumC1142210fpT3 = new EnumC1142210fpT("DOWNLOAD_FAILED", 2);
        DOWNLOAD_FAILED = enumC1142210fpT3;
        EnumC1142210fpT enumC1142210fpT4 = new EnumC1142210fpT("AUDIO_URL_EMPTY", 3);
        AUDIO_URL_EMPTY = enumC1142210fpT4;
        EnumC1142210fpT enumC1142210fpT5 = new EnumC1142210fpT("LYRICS_URL_EMPTY", 4);
        LYRICS_URL_EMPTY = enumC1142210fpT5;
        EnumC1142210fpT enumC1142210fpT6 = new EnumC1142210fpT("PLAYER_ERROR", 5);
        PLAYER_ERROR = enumC1142210fpT6;
        EnumC1142210fpT enumC1142210fpT7 = new EnumC1142210fpT("OFFLINE", 6);
        OFFLINE = enumC1142210fpT7;
        EnumC1142210fpT enumC1142210fpT8 = new EnumC1142210fpT("UNKNOWN", 7);
        UNKNOWN = enumC1142210fpT8;
        EnumC1142210fpT[] enumC1142210fpTArr = {enumC1142210fpT, enumC1142210fpT2, enumC1142210fpT3, enumC1142210fpT4, enumC1142210fpT5, enumC1142210fpT6, enumC1142210fpT7, enumC1142210fpT8};
        LL = enumC1142210fpTArr;
        LLILLJJLI = new C2254308sP(enumC1142210fpTArr);
    }

    public static EnumC1142210fpT[] values() {
        return (EnumC1142210fpT[]) LL.clone();
    }

    public static EnumC1142210fpT valueOf(String str) {
        return (EnumC1142210fpT) C08FF.LIZ(EnumC1142210fpT.class, str);
    }

    public EnumC1142210fpT(String str, int i) {
    }
}
