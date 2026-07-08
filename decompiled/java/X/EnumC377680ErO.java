package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ErO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC377680ErO {
    public static final EnumC377680ErO AI_TRANSITION;
    public static final EnumC377680ErO AI_VIDEO;
    public static final EnumC377680ErO FL_2_VIDEO;
    public static final EnumC377680ErO IMAGE_2_IMAGE;
    public static final EnumC377680ErO IMAGE_2_VIDEO;
    public static final /* synthetic */ EnumC377680ErO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC377680ErO TEXT_2_IMAGE;
    public static final EnumC377680ErO TEXT_2_VIDEO;
    public static final EnumC377680ErO VIDEO_2_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC377680ErO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC377680ErO enumC377680ErO = new EnumC377680ErO("IMAGE_2_VIDEO", 0, "image2video");
        IMAGE_2_VIDEO = enumC377680ErO;
        EnumC377680ErO enumC377680ErO2 = new EnumC377680ErO("TEXT_2_IMAGE", 1, "text2image");
        TEXT_2_IMAGE = enumC377680ErO2;
        EnumC377680ErO enumC377680ErO3 = new EnumC377680ErO("IMAGE_2_IMAGE", 2, "image2image");
        IMAGE_2_IMAGE = enumC377680ErO3;
        EnumC377680ErO enumC377680ErO4 = new EnumC377680ErO("TEXT_2_VIDEO", 3, "text2video");
        TEXT_2_VIDEO = enumC377680ErO4;
        EnumC377680ErO enumC377680ErO5 = new EnumC377680ErO("FL_2_VIDEO", 4, "fl2video");
        FL_2_VIDEO = enumC377680ErO5;
        EnumC377680ErO enumC377680ErO6 = new EnumC377680ErO("AI_TRANSITION", 5, "ai_transition");
        AI_TRANSITION = enumC377680ErO6;
        EnumC377680ErO enumC377680ErO7 = new EnumC377680ErO("AI_VIDEO", 6, "ai_video");
        AI_VIDEO = enumC377680ErO7;
        EnumC377680ErO enumC377680ErO8 = new EnumC377680ErO("VIDEO_2_VIDEO", 7, "video2video");
        VIDEO_2_VIDEO = enumC377680ErO8;
        EnumC377680ErO[] enumC377680ErOArr = {enumC377680ErO, enumC377680ErO2, enumC377680ErO3, enumC377680ErO4, enumC377680ErO5, enumC377680ErO6, enumC377680ErO7, enumC377680ErO8};
        LLILLJJLI = enumC377680ErOArr;
        LLILLL = new C2254308sP(enumC377680ErOArr);
    }

    public static EnumC377680ErO[] values() {
        return (EnumC377680ErO[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC377680ErO valueOf(String str) {
        return (EnumC377680ErO) C08FF.LIZ(EnumC377680ErO.class, str);
    }

    public EnumC377680ErO(String str, int i, String str2) {
        this.LL = str2;
    }
}
