package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC902270ZaT {
    public static final EnumC902270ZaT CAMERA;
    public static final EnumC902270ZaT GALLERY;
    public static final /* synthetic */ EnumC902270ZaT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC902270ZaT PRIVATE_IMAGE;
    public static final EnumC902270ZaT PRIVATE_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC902270ZaT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC902270ZaT enumC902270ZaT = new EnumC902270ZaT("CAMERA", 0, "camera");
        CAMERA = enumC902270ZaT;
        EnumC902270ZaT enumC902270ZaT2 = new EnumC902270ZaT("GALLERY", 1, "gallery");
        GALLERY = enumC902270ZaT2;
        EnumC902270ZaT enumC902270ZaT3 = new EnumC902270ZaT("PRIVATE_IMAGE", 2, "private_image");
        PRIVATE_IMAGE = enumC902270ZaT3;
        EnumC902270ZaT enumC902270ZaT4 = new EnumC902270ZaT("PRIVATE_VIDEO", 3, "private_video");
        PRIVATE_VIDEO = enumC902270ZaT4;
        EnumC902270ZaT[] enumC902270ZaTArr = {enumC902270ZaT, enumC902270ZaT2, enumC902270ZaT3, enumC902270ZaT4};
        LLILLJJLI = enumC902270ZaTArr;
        LLILLL = new C2254308sP(enumC902270ZaTArr);
    }

    public static EnumC902270ZaT[] values() {
        return (EnumC902270ZaT[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC902270ZaT valueOf(String str) {
        return (EnumC902270ZaT) C08FF.LIZ(EnumC902270ZaT.class, str);
    }

    public EnumC902270ZaT(String str, int i, String str2) {
        this.LL = str2;
    }
}
