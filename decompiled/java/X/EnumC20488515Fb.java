package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20488515Fb {
    public static final EnumC20488515Fb EXTRA_TIME_CARD;
    public static final /* synthetic */ EnumC20488515Fb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20488515Fb NONE;
    public static final EnumC20488515Fb PREVIEW;
    public static final EnumC20488515Fb PROGRESS;
    public static final EnumC20488515Fb PROGRESS_RESULT;
    public static final EnumC20488515Fb REWARD;
    public static final EnumC20488515Fb REWARD_RESULT;
    public static final EnumC20488515Fb SMOKE_CARD;
    public static final EnumC20488515Fb SPECIAL_EFFECT_CARD;
    public static final EnumC20488515Fb STRIKE_CARD;
    public static final EnumC20488515Fb TOP2_CARD;
    public static final EnumC20488515Fb TOP3_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20488515Fb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20488515Fb enumC20488515Fb = new EnumC20488515Fb("NONE", 0, "None");
        NONE = enumC20488515Fb;
        EnumC20488515Fb enumC20488515Fb2 = new EnumC20488515Fb("PREVIEW", 1, "Preview");
        PREVIEW = enumC20488515Fb2;
        EnumC20488515Fb enumC20488515Fb3 = new EnumC20488515Fb("PROGRESS", 2, "Progress");
        PROGRESS = enumC20488515Fb3;
        EnumC20488515Fb enumC20488515Fb4 = new EnumC20488515Fb("PROGRESS_RESULT", 3, "ProgressResult");
        PROGRESS_RESULT = enumC20488515Fb4;
        EnumC20488515Fb enumC20488515Fb5 = new EnumC20488515Fb("REWARD", 4, "Reward");
        REWARD = enumC20488515Fb5;
        EnumC20488515Fb enumC20488515Fb6 = new EnumC20488515Fb("REWARD_RESULT", 5, "RewardResult");
        REWARD_RESULT = enumC20488515Fb6;
        EnumC20488515Fb enumC20488515Fb7 = new EnumC20488515Fb("STRIKE_CARD", 6, "StrikeCard");
        STRIKE_CARD = enumC20488515Fb7;
        EnumC20488515Fb enumC20488515Fb8 = new EnumC20488515Fb("SMOKE_CARD", 7, "SmokeCard");
        SMOKE_CARD = enumC20488515Fb8;
        EnumC20488515Fb enumC20488515Fb9 = new EnumC20488515Fb("EXTRA_TIME_CARD", 8, "ExtraTimeCard");
        EXTRA_TIME_CARD = enumC20488515Fb9;
        EnumC20488515Fb enumC20488515Fb10 = new EnumC20488515Fb("SPECIAL_EFFECT_CARD", 9, "SpecialEffectCard");
        SPECIAL_EFFECT_CARD = enumC20488515Fb10;
        EnumC20488515Fb enumC20488515Fb11 = new EnumC20488515Fb("TOP2_CARD", 10, "Top2Card");
        TOP2_CARD = enumC20488515Fb11;
        EnumC20488515Fb enumC20488515Fb12 = new EnumC20488515Fb("TOP3_CARD", 11, "Top3Card");
        TOP3_CARD = enumC20488515Fb12;
        EnumC20488515Fb[] enumC20488515FbArr = {enumC20488515Fb, enumC20488515Fb2, enumC20488515Fb3, enumC20488515Fb4, enumC20488515Fb5, enumC20488515Fb6, enumC20488515Fb7, enumC20488515Fb8, enumC20488515Fb9, enumC20488515Fb10, enumC20488515Fb11, enumC20488515Fb12};
        LLILLJJLI = enumC20488515FbArr;
        LLILLL = new C2254308sP(enumC20488515FbArr);
    }

    public static EnumC20488515Fb[] values() {
        return (EnumC20488515Fb[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20488515Fb valueOf(String str) {
        return (EnumC20488515Fb) C08FF.LIZ(EnumC20488515Fb.class, str);
    }

    public EnumC20488515Fb(String str, int i, String str2) {
        this.LL = str2;
    }
}
