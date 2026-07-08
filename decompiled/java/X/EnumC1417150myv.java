package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0myv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1417150myv {
    public static final EnumC1417150myv ALBUM;
    public static final EnumC1417150myv IMAGE_EDIT;
    public static final /* synthetic */ EnumC1417150myv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1417150myv UNSET;
    public static final EnumC1417150myv VIDEO_EDIT;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC1417150myv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1417150myv enumC1417150myv = new EnumC1417150myv("UNSET", 0, -1);
        UNSET = enumC1417150myv;
        EnumC1417150myv enumC1417150myv2 = new EnumC1417150myv("ALBUM", 1, 0);
        ALBUM = enumC1417150myv2;
        EnumC1417150myv enumC1417150myv3 = new EnumC1417150myv("VIDEO_EDIT", 2, 1);
        VIDEO_EDIT = enumC1417150myv3;
        EnumC1417150myv enumC1417150myv4 = new EnumC1417150myv("IMAGE_EDIT", 3, 2);
        IMAGE_EDIT = enumC1417150myv4;
        EnumC1417150myv[] enumC1417150myvArr = {enumC1417150myv, enumC1417150myv2, enumC1417150myv3, enumC1417150myv4};
        LLILLJJLI = enumC1417150myvArr;
        LLILLL = new C2254308sP(enumC1417150myvArr);
    }

    public static EnumC1417150myv[] values() {
        return (EnumC1417150myv[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1417150myv valueOf(String str) {
        return (EnumC1417150myv) C08FF.LIZ(EnumC1417150myv.class, str);
    }

    public EnumC1417150myv(String str, int i, int i2) {
        this.LL = i2;
    }
}
