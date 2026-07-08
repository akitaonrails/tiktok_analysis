package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006320cII {
    public static final EnumC1006320cII CONTINUE_PLAYING;
    public static final EnumC1006320cII EXIT_BUTTON;
    public static final EnumC1006320cII EXIT_SWIPE;
    public static final /* synthetic */ EnumC1006320cII[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1006320cII PLAY_BUTTON;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1006320cII> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1006320cII enumC1006320cII = new EnumC1006320cII("PLAY_BUTTON", 0, "play_button");
        PLAY_BUTTON = enumC1006320cII;
        EnumC1006320cII enumC1006320cII2 = new EnumC1006320cII("CONTINUE_PLAYING", 1, "continue_playing");
        CONTINUE_PLAYING = enumC1006320cII2;
        EnumC1006320cII enumC1006320cII3 = new EnumC1006320cII("EXIT_BUTTON", 2, "exit_button");
        EXIT_BUTTON = enumC1006320cII3;
        EnumC1006320cII enumC1006320cII4 = new EnumC1006320cII("EXIT_SWIPE", 3, "exit_swipe");
        EXIT_SWIPE = enumC1006320cII4;
        EnumC1006320cII[] enumC1006320cIIArr = {enumC1006320cII, enumC1006320cII2, enumC1006320cII3, enumC1006320cII4};
        LLILLJJLI = enumC1006320cIIArr;
        LLILLL = new C2254308sP(enumC1006320cIIArr);
    }

    public static EnumC1006320cII[] values() {
        return (EnumC1006320cII[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1006320cII valueOf(String str) {
        return (EnumC1006320cII) C08FF.LIZ(EnumC1006320cII.class, str);
    }

    public EnumC1006320cII(String str, int i, String str2) {
        this.LL = str2;
    }
}
