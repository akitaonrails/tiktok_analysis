package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973650bRb {
    public static final EnumC973650bRb BEANS;
    public static final EnumC973650bRb BEANS_GREY;
    public static final EnumC973650bRb DURING_PK_NORMAL;
    public static final /* synthetic */ EnumC973650bRb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC973650bRb NORMAL;
    public static final EnumC973650bRb PK_GREY;
    public static final EnumC973650bRb PLAY_BOOK_GUIDE_ICON;
    public static final EnumC973650bRb QUICK_MATCH;
    public static final EnumC973650bRb STAGE;
    public static final EnumC973650bRb STAGE_GREY;
    public static final EnumC973650bRb UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC973650bRb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC973650bRb enumC973650bRb = new EnumC973650bRb("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC973650bRb;
        EnumC973650bRb enumC973650bRb2 = new EnumC973650bRb("NORMAL", 1, "normal");
        NORMAL = enumC973650bRb2;
        EnumC973650bRb enumC973650bRb3 = new EnumC973650bRb("STAGE", 2, "stage");
        STAGE = enumC973650bRb3;
        EnumC973650bRb enumC973650bRb4 = new EnumC973650bRb("BEANS", 3, "beans");
        BEANS = enumC973650bRb4;
        EnumC973650bRb enumC973650bRb5 = new EnumC973650bRb("PK_GREY", 4, "pk_grey");
        PK_GREY = enumC973650bRb5;
        EnumC973650bRb enumC973650bRb6 = new EnumC973650bRb("STAGE_GREY", 5, "stage_grey");
        STAGE_GREY = enumC973650bRb6;
        EnumC973650bRb enumC973650bRb7 = new EnumC973650bRb("BEANS_GREY", 6, "beans_grey");
        BEANS_GREY = enumC973650bRb7;
        EnumC973650bRb enumC973650bRb8 = new EnumC973650bRb("QUICK_MATCH", 7, "quick_match");
        QUICK_MATCH = enumC973650bRb8;
        EnumC973650bRb enumC973650bRb9 = new EnumC973650bRb("DURING_PK_NORMAL", 8, "during_pk_normal");
        DURING_PK_NORMAL = enumC973650bRb9;
        EnumC973650bRb enumC973650bRb10 = new EnumC973650bRb("PLAY_BOOK_GUIDE_ICON", 9, "play_book_guide_icon");
        PLAY_BOOK_GUIDE_ICON = enumC973650bRb10;
        EnumC973650bRb[] enumC973650bRbArr = {enumC973650bRb, enumC973650bRb2, enumC973650bRb3, enumC973650bRb4, enumC973650bRb5, enumC973650bRb6, enumC973650bRb7, enumC973650bRb8, enumC973650bRb9, enumC973650bRb10};
        LLILLJJLI = enumC973650bRbArr;
        LLILLL = new C2254308sP(enumC973650bRbArr);
    }

    public static EnumC973650bRb[] values() {
        return (EnumC973650bRb[]) LLILLJJLI.clone();
    }

    public final String getIconStyle() {
        return this.LL;
    }

    public static EnumC973650bRb valueOf(String str) {
        return (EnumC973650bRb) C08FF.LIZ(EnumC973650bRb.class, str);
    }

    public EnumC973650bRb(String str, int i, String str2) {
        this.LL = str2;
    }
}
