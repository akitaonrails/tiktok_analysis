package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.162i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC207102162i {
    public static final EnumC207102162i CAPTION;
    public static final EnumC207102162i COMMENT;
    public static final EnumC207102162i COMMERCE;
    public static final EnumC207102162i DIRECT_MESSAGE;
    public static final EnumC207102162i DUBBING;
    public static final /* synthetic */ EnumC207102162i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC207102162i NONE;
    public static final EnumC207102162i PHOTO_TEXT;
    public static final EnumC207102162i STICKER;
    public static final EnumC207102162i TEXT;

    public static InterfaceC2044707zh<EnumC207102162i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC207102162i enumC207102162i = new EnumC207102162i("NONE", 0);
        NONE = enumC207102162i;
        EnumC207102162i enumC207102162i2 = new EnumC207102162i("STICKER", 1);
        STICKER = enumC207102162i2;
        EnumC207102162i enumC207102162i3 = new EnumC207102162i("CAPTION", 2);
        CAPTION = enumC207102162i3;
        EnumC207102162i enumC207102162i4 = new EnumC207102162i("TEXT", 3);
        TEXT = enumC207102162i4;
        EnumC207102162i enumC207102162i5 = new EnumC207102162i("COMMENT", 4);
        COMMENT = enumC207102162i5;
        EnumC207102162i enumC207102162i6 = new EnumC207102162i("PHOTO_TEXT", 5);
        PHOTO_TEXT = enumC207102162i6;
        EnumC207102162i enumC207102162i7 = new EnumC207102162i("COMMERCE", 6);
        COMMERCE = enumC207102162i7;
        EnumC207102162i enumC207102162i8 = new EnumC207102162i("DIRECT_MESSAGE", 7);
        DIRECT_MESSAGE = enumC207102162i8;
        EnumC207102162i enumC207102162i9 = new EnumC207102162i("DUBBING", 8);
        DUBBING = enumC207102162i9;
        EnumC207102162i[] enumC207102162iArr = {enumC207102162i, enumC207102162i2, enumC207102162i3, enumC207102162i4, enumC207102162i5, enumC207102162i6, enumC207102162i7, enumC207102162i8, enumC207102162i9};
        LL = enumC207102162iArr;
        LLILLJJLI = new C2254308sP(enumC207102162iArr);
    }

    public static EnumC207102162i[] values() {
        return (EnumC207102162i[]) LL.clone();
    }

    public static EnumC207102162i valueOf(String str) {
        return (EnumC207102162i) C08FF.LIZ(EnumC207102162i.class, str);
    }

    public EnumC207102162i(String str, int i) {
    }
}
