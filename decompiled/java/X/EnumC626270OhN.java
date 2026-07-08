package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC626270OhN {
    public static final EnumC626270OhN ALBUM;
    public static final EnumC626270OhN ARTIST;
    public static final EnumC626270OhN AUDIOBOOK;
    public static final C626280OhO Companion;
    public static final /* synthetic */ EnumC626270OhN[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC626270OhN OTHER;
    public static final EnumC626270OhN PLAYLIST;
    public static final EnumC626270OhN PODCAST;
    public static final EnumC626270OhN REPLAY;
    public static final EnumC626270OhN TRACK;
    public static final EnumC626270OhN UNKNOWN;
    public static final EnumC626270OhN WRAPPED;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC626270OhN> getEntries() {
        return LLILZ;
    }

    static {
        EnumC626270OhN enumC626270OhN = new EnumC626270OhN("UNKNOWN", 0, 0, "null");
        UNKNOWN = enumC626270OhN;
        EnumC626270OhN enumC626270OhN2 = new EnumC626270OhN("TRACK", 1, 1, "song");
        TRACK = enumC626270OhN2;
        EnumC626270OhN enumC626270OhN3 = new EnumC626270OhN("PLAYLIST", 2, 2, "playlist");
        PLAYLIST = enumC626270OhN3;
        EnumC626270OhN enumC626270OhN4 = new EnumC626270OhN("AUDIOBOOK", 3, 3, "audiobook");
        AUDIOBOOK = enumC626270OhN4;
        EnumC626270OhN enumC626270OhN5 = new EnumC626270OhN("PODCAST", 4, 4, "podcast");
        PODCAST = enumC626270OhN5;
        EnumC626270OhN enumC626270OhN6 = new EnumC626270OhN("ARTIST", 5, 5, "artist");
        ARTIST = enumC626270OhN6;
        EnumC626270OhN enumC626270OhN7 = new EnumC626270OhN("ALBUM", 6, 6, "album");
        ALBUM = enumC626270OhN7;
        EnumC626270OhN enumC626270OhN8 = new EnumC626270OhN("WRAPPED", 7, 7, "wrapped");
        WRAPPED = enumC626270OhN8;
        EnumC626270OhN enumC626270OhN9 = new EnumC626270OhN("REPLAY", 8, 8, "replay");
        REPLAY = enumC626270OhN9;
        EnumC626270OhN enumC626270OhN10 = new EnumC626270OhN("OTHER", 9, 100, "other");
        OTHER = enumC626270OhN10;
        EnumC626270OhN[] enumC626270OhNArr = {enumC626270OhN, enumC626270OhN2, enumC626270OhN3, enumC626270OhN4, enumC626270OhN5, enumC626270OhN6, enumC626270OhN7, enumC626270OhN8, enumC626270OhN9, enumC626270OhN10};
        LLILLL = enumC626270OhNArr;
        LLILZ = new C2254308sP(enumC626270OhNArr);
        Companion = new C626280OhO();
    }

    public static EnumC626270OhN[] values() {
        return (EnumC626270OhN[]) LLILLL.clone();
    }

    public final String getEventName() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC626270OhN valueOf(String str) {
        return (EnumC626270OhN) C08FF.LIZ(EnumC626270OhN.class, str);
    }

    public EnumC626270OhN(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
