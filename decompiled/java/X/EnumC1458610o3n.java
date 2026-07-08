package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1458610o3n {
    public static final /* synthetic */ EnumC1458610o3n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1458610o3n MUSIC_DOWNLOAD;
    public static final EnumC1458610o3n MUSIC_LIST;
    public static final EnumC1458610o3n SPEECH_DETECTION;
    public static final EnumC1458610o3n TIME_OUT;
    public static final EnumC1458610o3n USER_CANCEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1458610o3n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1458610o3n enumC1458610o3n = new EnumC1458610o3n("MUSIC_LIST", 0, "music_list");
        MUSIC_LIST = enumC1458610o3n;
        EnumC1458610o3n enumC1458610o3n2 = new EnumC1458610o3n("MUSIC_DOWNLOAD", 1, "music_download");
        MUSIC_DOWNLOAD = enumC1458610o3n2;
        EnumC1458610o3n enumC1458610o3n3 = new EnumC1458610o3n("USER_CANCEL", 2, "user_cancel");
        USER_CANCEL = enumC1458610o3n3;
        EnumC1458610o3n enumC1458610o3n4 = new EnumC1458610o3n("SPEECH_DETECTION", 3, "speech_detection");
        SPEECH_DETECTION = enumC1458610o3n4;
        EnumC1458610o3n enumC1458610o3n5 = new EnumC1458610o3n("TIME_OUT", 4, "time_out");
        TIME_OUT = enumC1458610o3n5;
        EnumC1458610o3n[] enumC1458610o3nArr = {enumC1458610o3n, enumC1458610o3n2, enumC1458610o3n3, enumC1458610o3n4, enumC1458610o3n5};
        LLILLJJLI = enumC1458610o3nArr;
        LLILLL = new C2254308sP(enumC1458610o3nArr);
    }

    public static EnumC1458610o3n[] values() {
        return (EnumC1458610o3n[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1458610o3n valueOf(String str) {
        return (EnumC1458610o3n) C08FF.LIZ(EnumC1458610o3n.class, str);
    }

    public EnumC1458610o3n(String str, int i, String str2) {
        this.LL = str2;
    }
}
