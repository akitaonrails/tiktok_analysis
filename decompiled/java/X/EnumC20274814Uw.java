package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20274814Uw {
    public static final C14VH Companion;
    public static final /* synthetic */ EnumC20274814Uw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20274814Uw PICK_PHOTO_FROM_ALBUM;
    public static final EnumC20274814Uw PICK_VIDEO_FROM_ALBUM;
    public static final EnumC20274814Uw TAKE_PHOTO;
    public static final EnumC20274814Uw TAKE_VIDEO;
    public static final EnumC20274814Uw UNSUPPORTED;

    public static InterfaceC2044707zh<EnumC20274814Uw> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.14VH] */
    static {
        EnumC20274814Uw enumC20274814Uw = new EnumC20274814Uw("TAKE_PHOTO", 0);
        TAKE_PHOTO = enumC20274814Uw;
        EnumC20274814Uw enumC20274814Uw2 = new EnumC20274814Uw("PICK_PHOTO_FROM_ALBUM", 1);
        PICK_PHOTO_FROM_ALBUM = enumC20274814Uw2;
        EnumC20274814Uw enumC20274814Uw3 = new EnumC20274814Uw("TAKE_VIDEO", 2);
        TAKE_VIDEO = enumC20274814Uw3;
        EnumC20274814Uw enumC20274814Uw4 = new EnumC20274814Uw("PICK_VIDEO_FROM_ALBUM", 3);
        PICK_VIDEO_FROM_ALBUM = enumC20274814Uw4;
        EnumC20274814Uw enumC20274814Uw5 = new EnumC20274814Uw("UNSUPPORTED", 4);
        UNSUPPORTED = enumC20274814Uw5;
        EnumC20274814Uw[] enumC20274814UwArr = {enumC20274814Uw, enumC20274814Uw2, enumC20274814Uw3, enumC20274814Uw4, enumC20274814Uw5};
        LL = enumC20274814UwArr;
        LLILLJJLI = new C2254308sP(enumC20274814UwArr);
        Companion = new Object() { // from class: X.14VH
        };
    }

    public static EnumC20274814Uw[] values() {
        return (EnumC20274814Uw[]) LL.clone();
    }

    public static EnumC20274814Uw valueOf(String str) {
        return (EnumC20274814Uw) C08FF.LIZ(EnumC20274814Uw.class, str);
    }

    public EnumC20274814Uw(String str, int i) {
    }
}
