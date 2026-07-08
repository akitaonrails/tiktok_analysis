package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC674020QcC {
    public static final EnumC674020QcC AI_SEARCH;
    public static final EnumC674020QcC AI_SEARCH_RECORDING;
    public static final EnumC674020QcC AI_SEARCH_TRANSCRIBING;
    public static final /* synthetic */ EnumC674020QcC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC674020QcC NORMAL_SEARCH;

    public static InterfaceC2044707zh<EnumC674020QcC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC674020QcC enumC674020QcC = new EnumC674020QcC("NORMAL_SEARCH", 0);
        NORMAL_SEARCH = enumC674020QcC;
        EnumC674020QcC enumC674020QcC2 = new EnumC674020QcC("AI_SEARCH", 1);
        AI_SEARCH = enumC674020QcC2;
        EnumC674020QcC enumC674020QcC3 = new EnumC674020QcC("AI_SEARCH_RECORDING", 2);
        AI_SEARCH_RECORDING = enumC674020QcC3;
        EnumC674020QcC enumC674020QcC4 = new EnumC674020QcC("AI_SEARCH_TRANSCRIBING", 3);
        AI_SEARCH_TRANSCRIBING = enumC674020QcC4;
        EnumC674020QcC[] enumC674020QcCArr = {enumC674020QcC, enumC674020QcC2, enumC674020QcC3, enumC674020QcC4};
        LL = enumC674020QcCArr;
        LLILLJJLI = new C2254308sP(enumC674020QcCArr);
    }

    public static EnumC674020QcC[] values() {
        return (EnumC674020QcC[]) LL.clone();
    }

    public final boolean isAIMode() {
        return this != NORMAL_SEARCH;
    }

    public final boolean isRecording() {
        return this == AI_SEARCH_RECORDING;
    }

    public final boolean isVoiceFlow() {
        return this == AI_SEARCH_RECORDING || this == AI_SEARCH_TRANSCRIBING;
    }

    public static EnumC674020QcC valueOf(String str) {
        return (EnumC674020QcC) C08FF.LIZ(EnumC674020QcC.class, str);
    }

    public EnumC674020QcC(String str, int i) {
    }
}
