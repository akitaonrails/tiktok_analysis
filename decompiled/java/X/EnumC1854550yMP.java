package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yMP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1854550yMP {
    public static final EnumC1854550yMP DEEP_THINK;
    public static final EnumC1854550yMP EDIT_IMAGE;
    public static final EnumC1854550yMP HOMEWORK;
    public static final EnumC1854550yMP IMAGE_TO_VIDEO;
    public static final /* synthetic */ EnumC1854550yMP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1854550yMP NONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1854550yMP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1854550yMP enumC1854550yMP = new EnumC1854550yMP("NONE", 0, "default");
        NONE = enumC1854550yMP;
        EnumC1854550yMP enumC1854550yMP2 = new EnumC1854550yMP("EDIT_IMAGE", 1, "image");
        EDIT_IMAGE = enumC1854550yMP2;
        EnumC1854550yMP enumC1854550yMP3 = new EnumC1854550yMP("IMAGE_TO_VIDEO", 2, "image_to_video");
        IMAGE_TO_VIDEO = enumC1854550yMP3;
        EnumC1854550yMP enumC1854550yMP4 = new EnumC1854550yMP("HOMEWORK", 3, "homework");
        HOMEWORK = enumC1854550yMP4;
        EnumC1854550yMP enumC1854550yMP5 = new EnumC1854550yMP("DEEP_THINK", 4, "deep_thinking");
        DEEP_THINK = enumC1854550yMP5;
        EnumC1854550yMP[] enumC1854550yMPArr = {enumC1854550yMP, enumC1854550yMP2, enumC1854550yMP3, enumC1854550yMP4, enumC1854550yMP5};
        LLILLJJLI = enumC1854550yMPArr;
        LLILLL = new C2254308sP(enumC1854550yMPArr);
    }

    public static EnumC1854550yMP[] values() {
        return (EnumC1854550yMP[]) LLILLJJLI.clone();
    }

    public final String getSkillModeType() {
        return this.LL;
    }

    public static EnumC1854550yMP valueOf(String str) {
        return (EnumC1854550yMP) C08FF.LIZ(EnumC1854550yMP.class, str);
    }

    public EnumC1854550yMP(String str, int i, String str2) {
        this.LL = str2;
    }
}
