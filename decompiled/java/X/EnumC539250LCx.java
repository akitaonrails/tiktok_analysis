package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC539250LCx {
    public static final EnumC539250LCx GIF;
    public static final EnumC539250LCx IMAGE;
    public static final EnumC539250LCx LIVE_PHOTO;
    public static final /* synthetic */ EnumC539250LCx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC539250LCx VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC539250LCx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC539250LCx enumC539250LCx = new EnumC539250LCx("IMAGE", 0, "image");
        IMAGE = enumC539250LCx;
        EnumC539250LCx enumC539250LCx2 = new EnumC539250LCx("GIF", 1, "gif");
        GIF = enumC539250LCx2;
        EnumC539250LCx enumC539250LCx3 = new EnumC539250LCx("VIDEO", 2, "video");
        VIDEO = enumC539250LCx3;
        EnumC539250LCx enumC539250LCx4 = new EnumC539250LCx("LIVE_PHOTO", 3, "live_photo");
        LIVE_PHOTO = enumC539250LCx4;
        EnumC539250LCx[] enumC539250LCxArr = {enumC539250LCx, enumC539250LCx2, enumC539250LCx3, enumC539250LCx4};
        LLILLJJLI = enumC539250LCxArr;
        LLILLL = new C2254308sP(enumC539250LCxArr);
    }

    public static EnumC539250LCx[] values() {
        return (EnumC539250LCx[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC539250LCx valueOf(String str) {
        return (EnumC539250LCx) C08FF.LIZ(EnumC539250LCx.class, str);
    }

    public EnumC539250LCx(String str, int i, String str2) {
        this.LL = str2;
    }
}
