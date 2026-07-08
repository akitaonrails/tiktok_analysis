package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0grZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1181950grZ {
    public static final EnumC1181950grZ GALLERY_HEADER;
    public static final EnumC1181950grZ IMAGE_HEADER_V1;
    public static final EnumC1181950grZ IMAGE_HEADER_V2;
    public static final /* synthetic */ EnumC1181950grZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1181950grZ PURE_TEXT;
    public static final EnumC1181950grZ TOP_MAP;
    public static final EnumC1181950grZ TOP_VIDEOS;

    public static InterfaceC2044707zh<EnumC1181950grZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1181950grZ enumC1181950grZ = new EnumC1181950grZ("PURE_TEXT", 0);
        PURE_TEXT = enumC1181950grZ;
        EnumC1181950grZ enumC1181950grZ2 = new EnumC1181950grZ("IMAGE_HEADER_V1", 1);
        IMAGE_HEADER_V1 = enumC1181950grZ2;
        EnumC1181950grZ enumC1181950grZ3 = new EnumC1181950grZ("IMAGE_HEADER_V2", 2);
        IMAGE_HEADER_V2 = enumC1181950grZ3;
        EnumC1181950grZ enumC1181950grZ4 = new EnumC1181950grZ("GALLERY_HEADER", 3);
        GALLERY_HEADER = enumC1181950grZ4;
        EnumC1181950grZ enumC1181950grZ5 = new EnumC1181950grZ("TOP_MAP", 4);
        TOP_MAP = enumC1181950grZ5;
        EnumC1181950grZ enumC1181950grZ6 = new EnumC1181950grZ("TOP_VIDEOS", 5);
        TOP_VIDEOS = enumC1181950grZ6;
        EnumC1181950grZ[] enumC1181950grZArr = {enumC1181950grZ, enumC1181950grZ2, enumC1181950grZ3, enumC1181950grZ4, enumC1181950grZ5, enumC1181950grZ6};
        LL = enumC1181950grZArr;
        LLILLJJLI = new C2254308sP(enumC1181950grZArr);
    }

    public static EnumC1181950grZ[] values() {
        return (EnumC1181950grZ[]) LL.clone();
    }

    public static EnumC1181950grZ valueOf(String str) {
        return (EnumC1181950grZ) C08FF.LIZ(EnumC1181950grZ.class, str);
    }

    public EnumC1181950grZ(String str, int i) {
    }
}
