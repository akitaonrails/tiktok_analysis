package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1834820xqa {
    public static final EnumC1834820xqa CAPTION;
    public static final EnumC1834820xqa CUT;
    public static final EnumC1834820xqa DELETE;
    public static final EnumC1834820xqa DOWNLOAD;
    public static final /* synthetic */ EnumC1834820xqa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1834820xqa MUSIC;
    public static final EnumC1834820xqa REVIVE;
    public static final EnumC1834820xqa SHARE;
    public static final EnumC1834820xqa TEXT_STICKER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1834820xqa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1834820xqa enumC1834820xqa = new EnumC1834820xqa("DOWNLOAD", 0, 1);
        DOWNLOAD = enumC1834820xqa;
        EnumC1834820xqa enumC1834820xqa2 = new EnumC1834820xqa("DELETE", 1, 2);
        DELETE = enumC1834820xqa2;
        EnumC1834820xqa enumC1834820xqa3 = new EnumC1834820xqa("SHARE", 2, 3);
        SHARE = enumC1834820xqa3;
        EnumC1834820xqa enumC1834820xqa4 = new EnumC1834820xqa("REVIVE", 3, 4);
        REVIVE = enumC1834820xqa4;
        EnumC1834820xqa enumC1834820xqa5 = new EnumC1834820xqa("CUT", 4, 5);
        CUT = enumC1834820xqa5;
        EnumC1834820xqa enumC1834820xqa6 = new EnumC1834820xqa("MUSIC", 5, 6);
        MUSIC = enumC1834820xqa6;
        EnumC1834820xqa enumC1834820xqa7 = new EnumC1834820xqa("CAPTION", 6, 7);
        CAPTION = enumC1834820xqa7;
        EnumC1834820xqa enumC1834820xqa8 = new EnumC1834820xqa("TEXT_STICKER", 7, 8);
        TEXT_STICKER = enumC1834820xqa8;
        EnumC1834820xqa[] enumC1834820xqaArr = {enumC1834820xqa, enumC1834820xqa2, enumC1834820xqa3, enumC1834820xqa4, enumC1834820xqa5, enumC1834820xqa6, enumC1834820xqa7, enumC1834820xqa8};
        LLILLJJLI = enumC1834820xqaArr;
        LLILLL = new C2254308sP(enumC1834820xqaArr);
    }

    public static EnumC1834820xqa[] values() {
        return (EnumC1834820xqa[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1834820xqa valueOf(String str) {
        return (EnumC1834820xqa) C08FF.LIZ(EnumC1834820xqa.class, str);
    }

    public EnumC1834820xqa(String str, int i, int i2) {
        this.LL = i2;
    }
}
