package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1379880m0o {
    public static final EnumC1379880m0o AWEME_IMAGE;
    public static final EnumC1379880m0o AWEME_STORY_PHOTO;
    public static final EnumC1379880m0o AWEME_VIDEO;
    public static final /* synthetic */ EnumC1379880m0o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1379880m0o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1379880m0o enumC1379880m0o = new EnumC1379880m0o("AWEME_VIDEO", 0, 0);
        AWEME_VIDEO = enumC1379880m0o;
        EnumC1379880m0o enumC1379880m0o2 = new EnumC1379880m0o("AWEME_IMAGE", 1, 1);
        AWEME_IMAGE = enumC1379880m0o2;
        EnumC1379880m0o enumC1379880m0o3 = new EnumC1379880m0o("AWEME_STORY_PHOTO", 2, 2);
        AWEME_STORY_PHOTO = enumC1379880m0o3;
        EnumC1379880m0o[] enumC1379880m0oArr = {enumC1379880m0o, enumC1379880m0o2, enumC1379880m0o3};
        LLILLJJLI = enumC1379880m0oArr;
        LLILLL = new C2254308sP(enumC1379880m0oArr);
    }

    public static EnumC1379880m0o[] values() {
        return (EnumC1379880m0o[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1379880m0o valueOf(String str) {
        return (EnumC1379880m0o) C08FF.LIZ(EnumC1379880m0o.class, str);
    }

    public EnumC1379880m0o(String str, int i, int i2) {
        this.LL = i2;
    }
}
