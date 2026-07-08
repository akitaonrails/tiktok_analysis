package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1853760yL8 {
    public static final EnumC1853760yL8 ADD_PHOTOS;
    public static final EnumC1853760yL8 CAMERA;
    public static final /* synthetic */ EnumC1853760yL8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1853760yL8 PHOTO;

    public static InterfaceC2044707zh<EnumC1853760yL8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1853760yL8 enumC1853760yL8 = new EnumC1853760yL8("CAMERA", 0);
        CAMERA = enumC1853760yL8;
        EnumC1853760yL8 enumC1853760yL82 = new EnumC1853760yL8("ADD_PHOTOS", 1);
        ADD_PHOTOS = enumC1853760yL82;
        EnumC1853760yL8 enumC1853760yL83 = new EnumC1853760yL8("PHOTO", 2);
        PHOTO = enumC1853760yL83;
        EnumC1853760yL8[] enumC1853760yL8Arr = {enumC1853760yL8, enumC1853760yL82, enumC1853760yL83};
        LL = enumC1853760yL8Arr;
        LLILLJJLI = new C2254308sP(enumC1853760yL8Arr);
    }

    public static EnumC1853760yL8[] values() {
        return (EnumC1853760yL8[]) LL.clone();
    }

    public static EnumC1853760yL8 valueOf(String str) {
        return (EnumC1853760yL8) C08FF.LIZ(EnumC1853760yL8.class, str);
    }

    public EnumC1853760yL8(String str, int i) {
    }
}
