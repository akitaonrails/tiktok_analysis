package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Et4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC378720Et4 {
    public static final EnumC378720Et4 AI_TRANSITION_RESULT;
    public static final /* synthetic */ EnumC378720Et4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC378720Et4 NONE;
    public static final EnumC378720Et4 TEXT_TO_IMAGE_CREATION;
    public static final EnumC378720Et4 TEXT_TO_IMAGE_REPORT;
    public static final EnumC378720Et4 TEXT_TO_IMAGE_RESULT;
    public static final EnumC378720Et4 TEXT_TO_VIDEO_CREATION;
    public static final EnumC378720Et4 TEXT_TO_VIDEO_REPORT;
    public static final EnumC378720Et4 TEXT_TO_VIDEO_RESULT;

    public static InterfaceC2044707zh<EnumC378720Et4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC378720Et4 enumC378720Et4 = new EnumC378720Et4("NONE", 0);
        NONE = enumC378720Et4;
        EnumC378720Et4 enumC378720Et42 = new EnumC378720Et4("TEXT_TO_IMAGE_CREATION", 1);
        TEXT_TO_IMAGE_CREATION = enumC378720Et42;
        EnumC378720Et4 enumC378720Et43 = new EnumC378720Et4("TEXT_TO_VIDEO_CREATION", 2);
        TEXT_TO_VIDEO_CREATION = enumC378720Et43;
        EnumC378720Et4 enumC378720Et44 = new EnumC378720Et4("TEXT_TO_IMAGE_RESULT", 3);
        TEXT_TO_IMAGE_RESULT = enumC378720Et44;
        EnumC378720Et4 enumC378720Et45 = new EnumC378720Et4("TEXT_TO_VIDEO_RESULT", 4);
        TEXT_TO_VIDEO_RESULT = enumC378720Et45;
        EnumC378720Et4 enumC378720Et46 = new EnumC378720Et4("AI_TRANSITION_RESULT", 5);
        AI_TRANSITION_RESULT = enumC378720Et46;
        EnumC378720Et4 enumC378720Et47 = new EnumC378720Et4("TEXT_TO_IMAGE_REPORT", 6);
        TEXT_TO_IMAGE_REPORT = enumC378720Et47;
        EnumC378720Et4 enumC378720Et48 = new EnumC378720Et4("TEXT_TO_VIDEO_REPORT", 7);
        TEXT_TO_VIDEO_REPORT = enumC378720Et48;
        EnumC378720Et4[] enumC378720Et4Arr = {enumC378720Et4, enumC378720Et42, enumC378720Et43, enumC378720Et44, enumC378720Et45, enumC378720Et46, enumC378720Et47, enumC378720Et48};
        LL = enumC378720Et4Arr;
        LLILLJJLI = new C2254308sP(enumC378720Et4Arr);
    }

    public static EnumC378720Et4[] values() {
        return (EnumC378720Et4[]) LL.clone();
    }

    public static EnumC378720Et4 valueOf(String str) {
        return (EnumC378720Et4) C08FF.LIZ(EnumC378720Et4.class, str);
    }

    public EnumC378720Et4(String str, int i) {
    }
}
