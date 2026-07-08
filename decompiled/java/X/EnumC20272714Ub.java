package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20272714Ub {
    public static final C20273514Uj Companion;
    public static final /* synthetic */ EnumC20272714Ub[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20272714Ub PICK_PHOTO_FROM_ALBUM;
    public static final EnumC20272714Ub PICK_VIDEO_FROM_ALBUM;
    public static final EnumC20272714Ub TAKE_PHOTO;
    public static final EnumC20272714Ub TAKE_VIDEO;
    public static final EnumC20272714Ub UNSUPPORTED;

    public static InterfaceC2044707zh<EnumC20272714Ub> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.14Uj] */
    static {
        EnumC20272714Ub enumC20272714Ub = new EnumC20272714Ub("TAKE_PHOTO", 0);
        TAKE_PHOTO = enumC20272714Ub;
        EnumC20272714Ub enumC20272714Ub2 = new EnumC20272714Ub("PICK_PHOTO_FROM_ALBUM", 1);
        PICK_PHOTO_FROM_ALBUM = enumC20272714Ub2;
        EnumC20272714Ub enumC20272714Ub3 = new EnumC20272714Ub("TAKE_VIDEO", 2);
        TAKE_VIDEO = enumC20272714Ub3;
        EnumC20272714Ub enumC20272714Ub4 = new EnumC20272714Ub("PICK_VIDEO_FROM_ALBUM", 3);
        PICK_VIDEO_FROM_ALBUM = enumC20272714Ub4;
        EnumC20272714Ub enumC20272714Ub5 = new EnumC20272714Ub("UNSUPPORTED", 4);
        UNSUPPORTED = enumC20272714Ub5;
        EnumC20272714Ub[] enumC20272714UbArr = {enumC20272714Ub, enumC20272714Ub2, enumC20272714Ub3, enumC20272714Ub4, enumC20272714Ub5};
        LL = enumC20272714UbArr;
        LLILLJJLI = new C2254308sP(enumC20272714UbArr);
        Companion = new Object() { // from class: X.14Uj
        };
    }

    public static EnumC20272714Ub[] values() {
        return (EnumC20272714Ub[]) LL.clone();
    }

    public static EnumC20272714Ub valueOf(String str) {
        return (EnumC20272714Ub) C08FF.LIZ(EnumC20272714Ub.class, str);
    }

    public EnumC20272714Ub(String str, int i) {
    }
}
