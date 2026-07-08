package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1429270nIT {
    public static final EnumC1429270nIT BUILD_MUSIC_MODEL;
    public static final EnumC1429270nIT DOWNLOAD_MUSIC;
    public static final EnumC1429270nIT DOWNLOAD_MUSIC_FROM_MODEL;
    public static final EnumC1429270nIT DOWNLOAD_MUSIC_FROM_URL;
    public static final EnumC1429270nIT FETCH_MUSIC;
    public static final /* synthetic */ EnumC1429270nIT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1429270nIT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1429270nIT enumC1429270nIT = new EnumC1429270nIT("DOWNLOAD_MUSIC", 0, "DOWNLOAD_MUSIC");
        DOWNLOAD_MUSIC = enumC1429270nIT;
        EnumC1429270nIT enumC1429270nIT2 = new EnumC1429270nIT("FETCH_MUSIC", 1, "FETCH_MUSIC");
        FETCH_MUSIC = enumC1429270nIT2;
        EnumC1429270nIT enumC1429270nIT3 = new EnumC1429270nIT("DOWNLOAD_MUSIC_FROM_MODEL", 2, "DOWNLOAD_MUSIC_FROM_MODEL");
        DOWNLOAD_MUSIC_FROM_MODEL = enumC1429270nIT3;
        EnumC1429270nIT enumC1429270nIT4 = new EnumC1429270nIT("DOWNLOAD_MUSIC_FROM_URL", 3, "DOWNLOAD_MUSIC_FROM_URL");
        DOWNLOAD_MUSIC_FROM_URL = enumC1429270nIT4;
        EnumC1429270nIT enumC1429270nIT5 = new EnumC1429270nIT("BUILD_MUSIC_MODEL", 4, "BUILD_MUSIC_MODEL");
        BUILD_MUSIC_MODEL = enumC1429270nIT5;
        EnumC1429270nIT[] enumC1429270nITArr = {enumC1429270nIT, enumC1429270nIT2, enumC1429270nIT3, enumC1429270nIT4, enumC1429270nIT5};
        LLILLJJLI = enumC1429270nITArr;
        LLILLL = new C2254308sP(enumC1429270nITArr);
    }

    public static EnumC1429270nIT[] values() {
        return (EnumC1429270nIT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1429270nIT valueOf(String str) {
        return (EnumC1429270nIT) C08FF.LIZ(EnumC1429270nIT.class, str);
    }

    public EnumC1429270nIT(String str, int i, String str2) {
        this.LL = str2;
    }
}
