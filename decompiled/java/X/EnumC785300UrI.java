package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC785300UrI {
    public static final EnumC785300UrI ANCHOR_TRY_MODE_EFFECT_GUIDE;
    public static final EnumC785300UrI ANCHOR_TRY_MODE_ENHANCE_GUIDE;
    public static final EnumC785300UrI ANCHOR_TRY_MODE_INTERACT_GUIDE;
    public static final EnumC785300UrI ANCHOR_TRY_MODE_MUSIC_GUIDE;
    public static final EnumC785300UrI ANCHOR_TRY_MODE_QUICK_QA_GUIDE;
    public static final /* synthetic */ EnumC785300UrI[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL = 0;

    public static InterfaceC2044707zh<EnumC785300UrI> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC785300UrI enumC785300UrI = new EnumC785300UrI("ANCHOR_TRY_MODE_ENHANCE_GUIDE", 0, "AnchorTryModeEnhanceGuide", "enhance_icon");
        ANCHOR_TRY_MODE_ENHANCE_GUIDE = enumC785300UrI;
        EnumC785300UrI enumC785300UrI2 = new EnumC785300UrI("ANCHOR_TRY_MODE_EFFECT_GUIDE", 1, "AnchorTryModeEffectGuide", "effect_icon");
        ANCHOR_TRY_MODE_EFFECT_GUIDE = enumC785300UrI2;
        EnumC785300UrI enumC785300UrI3 = new EnumC785300UrI("ANCHOR_TRY_MODE_MUSIC_GUIDE", 2, "AnchorTryModeMusicGuide", "music_icon");
        ANCHOR_TRY_MODE_MUSIC_GUIDE = enumC785300UrI3;
        EnumC785300UrI enumC785300UrI4 = new EnumC785300UrI("ANCHOR_TRY_MODE_INTERACT_GUIDE", 3, "AnchorTryModeInteractGuide", "interact_icon");
        ANCHOR_TRY_MODE_INTERACT_GUIDE = enumC785300UrI4;
        EnumC785300UrI enumC785300UrI5 = new EnumC785300UrI("ANCHOR_TRY_MODE_QUICK_QA_GUIDE", 4, "AnchorTryModeQuickQAGuide", "quick_qa_icon");
        ANCHOR_TRY_MODE_QUICK_QA_GUIDE = enumC785300UrI5;
        EnumC785300UrI[] enumC785300UrIArr = {enumC785300UrI, enumC785300UrI2, enumC785300UrI3, enumC785300UrI4, enumC785300UrI5};
        LLILZ = enumC785300UrIArr;
        LLILZIL = new C2254308sP(enumC785300UrIArr);
    }

    public static EnumC785300UrI[] values() {
        return (EnumC785300UrI[]) LLILZ.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getPosition() {
        return this.LLILLJJLI;
    }

    public final int getPriority() {
        return this.LLILLL;
    }

    public static EnumC785300UrI valueOf(String str) {
        return (EnumC785300UrI) C08FF.LIZ(EnumC785300UrI.class, str);
    }

    public EnumC785300UrI(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
