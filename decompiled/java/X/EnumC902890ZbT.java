package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC902890ZbT {
    public static final EnumC902890ZbT ASSISTANT_ERROR_QUOTA;
    public static final EnumC902890ZbT ASSISTANT_ERROR_REGENERATE;
    public static final EnumC902890ZbT ASSISTANT_GENERATING;
    public static final EnumC902890ZbT ASSISTANT_IMAGE;
    public static final EnumC902890ZbT ASSISTANT_MARKDOWN;
    public static final EnumC902890ZbT ASSISTANT_TEXT;
    public static final EnumC902890ZbT BOT_FALLBACK;
    public static final EnumC902890ZbT DATE_SEPARATOR;
    public static final EnumC902890ZbT FALLBACK;
    public static final /* synthetic */ EnumC902890ZbT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC902890ZbT ONBOARDING;
    public static final EnumC902890ZbT USER_PROMPT;
    public static final EnumC902890ZbT WAITING_FOR_REPLY;

    public static InterfaceC2044707zh<EnumC902890ZbT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC902890ZbT enumC902890ZbT = new EnumC902890ZbT("ONBOARDING", 0);
        ONBOARDING = enumC902890ZbT;
        EnumC902890ZbT enumC902890ZbT2 = new EnumC902890ZbT("ASSISTANT_ERROR_QUOTA", 1);
        ASSISTANT_ERROR_QUOTA = enumC902890ZbT2;
        EnumC902890ZbT enumC902890ZbT3 = new EnumC902890ZbT("ASSISTANT_ERROR_REGENERATE", 2);
        ASSISTANT_ERROR_REGENERATE = enumC902890ZbT3;
        EnumC902890ZbT enumC902890ZbT4 = new EnumC902890ZbT("ASSISTANT_GENERATING", 3);
        ASSISTANT_GENERATING = enumC902890ZbT4;
        EnumC902890ZbT enumC902890ZbT5 = new EnumC902890ZbT("ASSISTANT_IMAGE", 4);
        ASSISTANT_IMAGE = enumC902890ZbT5;
        EnumC902890ZbT enumC902890ZbT6 = new EnumC902890ZbT("ASSISTANT_MARKDOWN", 5);
        ASSISTANT_MARKDOWN = enumC902890ZbT6;
        EnumC902890ZbT enumC902890ZbT7 = new EnumC902890ZbT("ASSISTANT_TEXT", 6);
        ASSISTANT_TEXT = enumC902890ZbT7;
        EnumC902890ZbT enumC902890ZbT8 = new EnumC902890ZbT("USER_PROMPT", 7);
        USER_PROMPT = enumC902890ZbT8;
        EnumC902890ZbT enumC902890ZbT9 = new EnumC902890ZbT("WAITING_FOR_REPLY", 8);
        WAITING_FOR_REPLY = enumC902890ZbT9;
        EnumC902890ZbT enumC902890ZbT10 = new EnumC902890ZbT("BOT_FALLBACK", 9);
        BOT_FALLBACK = enumC902890ZbT10;
        EnumC902890ZbT enumC902890ZbT11 = new EnumC902890ZbT("DATE_SEPARATOR", 10);
        DATE_SEPARATOR = enumC902890ZbT11;
        EnumC902890ZbT enumC902890ZbT12 = new EnumC902890ZbT("FALLBACK", 11);
        FALLBACK = enumC902890ZbT12;
        EnumC902890ZbT[] enumC902890ZbTArr = {enumC902890ZbT, enumC902890ZbT2, enumC902890ZbT3, enumC902890ZbT4, enumC902890ZbT5, enumC902890ZbT6, enumC902890ZbT7, enumC902890ZbT8, enumC902890ZbT9, enumC902890ZbT10, enumC902890ZbT11, enumC902890ZbT12};
        LL = enumC902890ZbTArr;
        LLILLJJLI = new C2254308sP(enumC902890ZbTArr);
    }

    public static EnumC902890ZbT[] values() {
        return (EnumC902890ZbT[]) LL.clone();
    }

    public static EnumC902890ZbT valueOf(String str) {
        return (EnumC902890ZbT) C08FF.LIZ(EnumC902890ZbT.class, str);
    }

    public EnumC902890ZbT(String str, int i) {
    }
}
