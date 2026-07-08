package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2229208oM {
    public static final EnumC2229208oM LIVE_PREVIEW;
    public static final /* synthetic */ EnumC2229208oM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2229208oM MUSIC;
    public static final EnumC2229208oM VOICE_PLAY;
    public static final EnumC2229208oM VOICE_PREVIEW;
    public static final EnumC2229208oM VOICE_RECORD;

    public static InterfaceC2044707zh<EnumC2229208oM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2229208oM enumC2229208oM = new EnumC2229208oM("VOICE_RECORD", 0);
        VOICE_RECORD = enumC2229208oM;
        EnumC2229208oM enumC2229208oM2 = new EnumC2229208oM("VOICE_PREVIEW", 1);
        VOICE_PREVIEW = enumC2229208oM2;
        EnumC2229208oM enumC2229208oM3 = new EnumC2229208oM("VOICE_PLAY", 2);
        VOICE_PLAY = enumC2229208oM3;
        EnumC2229208oM enumC2229208oM4 = new EnumC2229208oM("MUSIC", 3);
        MUSIC = enumC2229208oM4;
        EnumC2229208oM enumC2229208oM5 = new EnumC2229208oM("LIVE_PREVIEW", 4);
        LIVE_PREVIEW = enumC2229208oM5;
        EnumC2229208oM[] enumC2229208oMArr = {enumC2229208oM, enumC2229208oM2, enumC2229208oM3, enumC2229208oM4, enumC2229208oM5};
        LL = enumC2229208oMArr;
        LLILLJJLI = new C2254308sP(enumC2229208oMArr);
    }

    public static EnumC2229208oM[] values() {
        return (EnumC2229208oM[]) LL.clone();
    }

    public static EnumC2229208oM valueOf(String str) {
        return (EnumC2229208oM) C08FF.LIZ(EnumC2229208oM.class, str);
    }

    public EnumC2229208oM(String str, int i) {
    }
}
