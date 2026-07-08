package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC566330MJb {
    public static final /* synthetic */ EnumC566330MJb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC566330MJb PHOTO;
    public static final EnumC566330MJb PHOTO_AND_VIDEO;
    public static final EnumC566330MJb VIDEO;

    public static InterfaceC2044707zh<EnumC566330MJb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC566330MJb enumC566330MJb = new EnumC566330MJb("PHOTO", 0);
        PHOTO = enumC566330MJb;
        EnumC566330MJb enumC566330MJb2 = new EnumC566330MJb("PHOTO_AND_VIDEO", 1);
        PHOTO_AND_VIDEO = enumC566330MJb2;
        EnumC566330MJb enumC566330MJb3 = new EnumC566330MJb("VIDEO", 2);
        VIDEO = enumC566330MJb3;
        EnumC566330MJb[] enumC566330MJbArr = {enumC566330MJb, enumC566330MJb2, enumC566330MJb3};
        LL = enumC566330MJbArr;
        LLILLJJLI = new C2254308sP(enumC566330MJbArr);
    }

    public static EnumC566330MJb[] values() {
        return (EnumC566330MJb[]) LL.clone();
    }

    public static EnumC566330MJb valueOf(String str) {
        return (EnumC566330MJb) C08FF.LIZ(EnumC566330MJb.class, str);
    }

    public EnumC566330MJb(String str, int i) {
    }
}
