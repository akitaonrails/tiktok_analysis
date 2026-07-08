package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562480M4g {
    public static final EnumC562480M4g AWEME;
    public static final EnumC562480M4g GIF;
    public static final EnumC562480M4g LIVE_PHOTO;
    public static final /* synthetic */ EnumC562480M4g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC562480M4g LOCAL_VIDEO;
    public static final EnumC562480M4g STATIC_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC562480M4g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC562480M4g enumC562480M4g = new EnumC562480M4g("AWEME", 0, "aweme");
        AWEME = enumC562480M4g;
        EnumC562480M4g enumC562480M4g2 = new EnumC562480M4g("LOCAL_VIDEO", 1, "local_video");
        LOCAL_VIDEO = enumC562480M4g2;
        EnumC562480M4g enumC562480M4g3 = new EnumC562480M4g("LIVE_PHOTO", 2, "live_photo");
        LIVE_PHOTO = enumC562480M4g3;
        EnumC562480M4g enumC562480M4g4 = new EnumC562480M4g("STATIC_PHOTO", 3, "static_photo");
        STATIC_PHOTO = enumC562480M4g4;
        EnumC562480M4g enumC562480M4g5 = new EnumC562480M4g("GIF", 4, "gif");
        GIF = enumC562480M4g5;
        EnumC562480M4g[] enumC562480M4gArr = {enumC562480M4g, enumC562480M4g2, enumC562480M4g3, enumC562480M4g4, enumC562480M4g5};
        LLILLJJLI = enumC562480M4gArr;
        LLILLL = new C2254308sP(enumC562480M4gArr);
    }

    public static EnumC562480M4g[] values() {
        return (EnumC562480M4g[]) LLILLJJLI.clone();
    }

    public final String getEtValue() {
        return this.LL;
    }

    public static EnumC562480M4g valueOf(String str) {
        return (EnumC562480M4g) C08FF.LIZ(EnumC562480M4g.class, str);
    }

    public EnumC562480M4g(String str, int i, String str2) {
        this.LL = str2;
    }
}
