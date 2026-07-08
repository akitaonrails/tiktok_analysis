package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1241110iOz {
    public static final /* synthetic */ EnumC1241110iOz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1241110iOz PRIVATE_MEDIA;
    public static final EnumC1241110iOz SHARED_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1241110iOz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1241110iOz enumC1241110iOz = new EnumC1241110iOz("SHARED_VIDEO", 0, "chat_setting_search_share_post");
        SHARED_VIDEO = enumC1241110iOz;
        EnumC1241110iOz enumC1241110iOz2 = new EnumC1241110iOz("PRIVATE_MEDIA", 1, "chat_setting_search_private_photo");
        PRIVATE_MEDIA = enumC1241110iOz2;
        EnumC1241110iOz[] enumC1241110iOzArr = {enumC1241110iOz, enumC1241110iOz2};
        LLILLJJLI = enumC1241110iOzArr;
        LLILLL = new C2254308sP(enumC1241110iOzArr);
    }

    public static EnumC1241110iOz[] values() {
        return (EnumC1241110iOz[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC1241110iOz valueOf(String str) {
        return (EnumC1241110iOz) C08FF.LIZ(EnumC1241110iOz.class, str);
    }

    public EnumC1241110iOz(String str, int i, String str2) {
        this.LL = str2;
    }
}
