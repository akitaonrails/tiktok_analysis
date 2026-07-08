package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1301920jz4 {
    public static final EnumC1301920jz4 ANSWERED;
    public static final EnumC1301920jz4 ANSWERING;
    public static final C1301930jz5 Companion;
    public static final EnumC1301920jz4 INTERRUPTED;
    public static final EnumC1301920jz4 KEYBOARD;
    public static final EnumC1301920jz4 LISTENING;
    public static final /* synthetic */ EnumC1301920jz4[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1301920jz4 THINKING;
    public static final EnumC1301920jz4 VOICE;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1301920jz4> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1301920jz4 enumC1301920jz4 = new EnumC1301920jz4("VOICE", 0, -2, "voice");
        VOICE = enumC1301920jz4;
        EnumC1301920jz4 enumC1301920jz42 = new EnumC1301920jz4("KEYBOARD", 1, -1, "keyboard");
        KEYBOARD = enumC1301920jz42;
        EnumC1301920jz4 enumC1301920jz43 = new EnumC1301920jz4("LISTENING", 2, 0, "listening");
        LISTENING = enumC1301920jz43;
        EnumC1301920jz4 enumC1301920jz44 = new EnumC1301920jz4("THINKING", 3, 1, "thinking");
        THINKING = enumC1301920jz44;
        EnumC1301920jz4 enumC1301920jz45 = new EnumC1301920jz4("ANSWERING", 4, 2, "answering");
        ANSWERING = enumC1301920jz45;
        EnumC1301920jz4 enumC1301920jz46 = new EnumC1301920jz4("INTERRUPTED", 5, 3, "interrupted");
        INTERRUPTED = enumC1301920jz46;
        EnumC1301920jz4 enumC1301920jz47 = new EnumC1301920jz4("ANSWERED", 6, 4, "answerFinished");
        ANSWERED = enumC1301920jz47;
        EnumC1301920jz4[] enumC1301920jz4Arr = {enumC1301920jz4, enumC1301920jz42, enumC1301920jz43, enumC1301920jz44, enumC1301920jz45, enumC1301920jz46, enumC1301920jz47};
        LLILLL = enumC1301920jz4Arr;
        LLILZ = new C2254308sP(enumC1301920jz4Arr);
        Companion = new C1301930jz5();
    }

    public static EnumC1301920jz4[] values() {
        return (EnumC1301920jz4[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getState() {
        return this.LLILLJJLI;
    }

    public static EnumC1301920jz4 valueOf(String str) {
        return (EnumC1301920jz4) C08FF.LIZ(EnumC1301920jz4.class, str);
    }

    public EnumC1301920jz4(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
