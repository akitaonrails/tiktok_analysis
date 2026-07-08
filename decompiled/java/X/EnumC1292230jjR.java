package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1292230jjR {
    public static final EnumC1292230jjR DOWNLOAD_IMAGE;
    public static final EnumC1292230jjR DOWNLOAD_JSON;
    public static final EnumC1292230jjR DOWNLOAD_VIDEO;
    public static final /* synthetic */ EnumC1292230jjR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1292230jjR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1292230jjR enumC1292230jjR = new EnumC1292230jjR("DOWNLOAD_VIDEO", 0, ".mp4");
        DOWNLOAD_VIDEO = enumC1292230jjR;
        EnumC1292230jjR enumC1292230jjR2 = new EnumC1292230jjR("DOWNLOAD_IMAGE", 1, ".png");
        DOWNLOAD_IMAGE = enumC1292230jjR2;
        EnumC1292230jjR enumC1292230jjR3 = new EnumC1292230jjR("DOWNLOAD_JSON", 2, ".json");
        DOWNLOAD_JSON = enumC1292230jjR3;
        EnumC1292230jjR[] enumC1292230jjRArr = {enumC1292230jjR, enumC1292230jjR2, enumC1292230jjR3};
        LLILLJJLI = enumC1292230jjRArr;
        LLILLL = new C2254308sP(enumC1292230jjRArr);
    }

    public static EnumC1292230jjR[] values() {
        return (EnumC1292230jjR[]) LLILLJJLI.clone();
    }

    public final String getSuffix() {
        return this.LL;
    }

    public static EnumC1292230jjR valueOf(String str) {
        return (EnumC1292230jjR) C08FF.LIZ(EnumC1292230jjR.class, str);
    }

    public EnumC1292230jjR(String str, int i, String str2) {
        this.LL = str2;
    }
}
