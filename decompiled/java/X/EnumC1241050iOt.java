package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1241050iOt {
    public static final /* synthetic */ EnumC1241050iOt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1241050iOt PRIVATE_MEDIA;
    public static final EnumC1241050iOt SHARED_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1241050iOt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1241050iOt enumC1241050iOt = new EnumC1241050iOt("SHARED_VIDEO", 0, "shared_posts");
        SHARED_VIDEO = enumC1241050iOt;
        EnumC1241050iOt enumC1241050iOt2 = new EnumC1241050iOt("PRIVATE_MEDIA", 1, "photo_video");
        PRIVATE_MEDIA = enumC1241050iOt2;
        EnumC1241050iOt[] enumC1241050iOtArr = {enumC1241050iOt, enumC1241050iOt2};
        LLILLJJLI = enumC1241050iOtArr;
        LLILLL = new C2254308sP(enumC1241050iOtArr);
    }

    public static EnumC1241050iOt[] values() {
        return (EnumC1241050iOt[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC1241050iOt valueOf(String str) {
        return (EnumC1241050iOt) C08FF.LIZ(EnumC1241050iOt.class, str);
    }

    public EnumC1241050iOt(String str, int i, String str2) {
        this.LL = str2;
    }
}
