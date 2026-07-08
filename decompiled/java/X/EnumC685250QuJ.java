package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC685250QuJ {
    public static final EnumC685250QuJ FLEX;
    public static final EnumC685250QuJ IMAGE;
    public static final /* synthetic */ EnumC685250QuJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC685250QuJ MARKDOWN;
    public static final EnumC685250QuJ TEXT;
    public static final EnumC685250QuJ VIDEO;
    public static final EnumC685250QuJ VIDEO_STACK;
    public static final EnumC685250QuJ VIEW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC685250QuJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC685250QuJ enumC685250QuJ = new EnumC685250QuJ("TEXT", 0, "text");
        TEXT = enumC685250QuJ;
        EnumC685250QuJ enumC685250QuJ2 = new EnumC685250QuJ("MARKDOWN", 1, "markdown");
        MARKDOWN = enumC685250QuJ2;
        EnumC685250QuJ enumC685250QuJ3 = new EnumC685250QuJ("VIDEO", 2, "video");
        VIDEO = enumC685250QuJ3;
        EnumC685250QuJ enumC685250QuJ4 = new EnumC685250QuJ("VIDEO_STACK", 3, "video_stack");
        VIDEO_STACK = enumC685250QuJ4;
        EnumC685250QuJ enumC685250QuJ5 = new EnumC685250QuJ("VIEW", 4, "view");
        VIEW = enumC685250QuJ5;
        EnumC685250QuJ enumC685250QuJ6 = new EnumC685250QuJ("FLEX", 5, "flex");
        FLEX = enumC685250QuJ6;
        EnumC685250QuJ enumC685250QuJ7 = new EnumC685250QuJ("IMAGE", 6, "image");
        IMAGE = enumC685250QuJ7;
        EnumC685250QuJ[] enumC685250QuJArr = {enumC685250QuJ, enumC685250QuJ2, enumC685250QuJ3, enumC685250QuJ4, enumC685250QuJ5, enumC685250QuJ6, enumC685250QuJ7};
        LLILLJJLI = enumC685250QuJArr;
        LLILLL = new C2254308sP(enumC685250QuJArr);
    }

    public static EnumC685250QuJ[] values() {
        return (EnumC685250QuJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC685250QuJ valueOf(String str) {
        return (EnumC685250QuJ) C08FF.LIZ(EnumC685250QuJ.class, str);
    }

    public EnumC685250QuJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
