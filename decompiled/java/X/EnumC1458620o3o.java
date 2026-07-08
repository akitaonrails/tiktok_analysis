package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1458620o3o {
    public static final EnumC1458620o3o ALL;
    public static final /* synthetic */ EnumC1458620o3o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1458620o3o MUSIC_DOWNLOAD;
    public static final EnumC1458620o3o MUSIC_LIST;
    public static final EnumC1458620o3o UPLOAD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1458620o3o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1458620o3o enumC1458620o3o = new EnumC1458620o3o("UPLOAD", 0, "upload");
        UPLOAD = enumC1458620o3o;
        EnumC1458620o3o enumC1458620o3o2 = new EnumC1458620o3o("MUSIC_LIST", 1, "music_list");
        MUSIC_LIST = enumC1458620o3o2;
        EnumC1458620o3o enumC1458620o3o3 = new EnumC1458620o3o("MUSIC_DOWNLOAD", 2, "music_download");
        MUSIC_DOWNLOAD = enumC1458620o3o3;
        EnumC1458620o3o enumC1458620o3o4 = new EnumC1458620o3o("ALL", 3, "upload_music_list_music_download");
        ALL = enumC1458620o3o4;
        EnumC1458620o3o[] enumC1458620o3oArr = {enumC1458620o3o, enumC1458620o3o2, enumC1458620o3o3, enumC1458620o3o4};
        LLILLJJLI = enumC1458620o3oArr;
        LLILLL = new C2254308sP(enumC1458620o3oArr);
    }

    public static EnumC1458620o3o[] values() {
        return (EnumC1458620o3o[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1458620o3o valueOf(String str) {
        return (EnumC1458620o3o) C08FF.LIZ(EnumC1458620o3o.class, str);
    }

    public EnumC1458620o3o(String str, int i, String str2) {
        this.LL = str2;
    }
}
