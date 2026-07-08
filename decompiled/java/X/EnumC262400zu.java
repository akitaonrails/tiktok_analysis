package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC262400zu {
    public static final EnumC262400zu GUESS_GUIDE_PIN;
    public static final EnumC262400zu GUESS_MSG_AUDIT_STATUS;
    public static final EnumC262400zu GUESS_MSG_GUESS_RESULT;
    public static final EnumC262400zu GUESS_MSG_MODERATOR;
    public static final EnumC262400zu GUESS_MSG_NORMAL;
    public static final EnumC262400zu GUESS_MSG_REQ_GUESS;
    public static final EnumC262400zu GUESS_MSG_SUGGEST;
    public static final /* synthetic */ EnumC262400zu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC262400zu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC262400zu enumC262400zu = new EnumC262400zu("GUESS_MSG_NORMAL", 0);
        GUESS_MSG_NORMAL = enumC262400zu;
        EnumC262400zu enumC262400zu2 = new EnumC262400zu("GUESS_MSG_MODERATOR", 1);
        GUESS_MSG_MODERATOR = enumC262400zu2;
        EnumC262400zu enumC262400zu3 = new EnumC262400zu("GUESS_MSG_AUDIT_STATUS", 2);
        GUESS_MSG_AUDIT_STATUS = enumC262400zu3;
        EnumC262400zu enumC262400zu4 = new EnumC262400zu("GUESS_MSG_SUGGEST", 3);
        GUESS_MSG_SUGGEST = enumC262400zu4;
        EnumC262400zu enumC262400zu5 = new EnumC262400zu("GUESS_MSG_REQ_GUESS", 4);
        GUESS_MSG_REQ_GUESS = enumC262400zu5;
        EnumC262400zu enumC262400zu6 = new EnumC262400zu("GUESS_MSG_GUESS_RESULT", 5);
        GUESS_MSG_GUESS_RESULT = enumC262400zu6;
        EnumC262400zu enumC262400zu7 = new EnumC262400zu("GUESS_GUIDE_PIN", 6);
        GUESS_GUIDE_PIN = enumC262400zu7;
        EnumC262400zu[] enumC262400zuArr = {enumC262400zu, enumC262400zu2, enumC262400zu3, enumC262400zu4, enumC262400zu5, enumC262400zu6, enumC262400zu7};
        LL = enumC262400zuArr;
        LLILLJJLI = new C2254308sP(enumC262400zuArr);
    }

    public static EnumC262400zu[] values() {
        return (EnumC262400zu[]) LL.clone();
    }

    public static EnumC262400zu valueOf(String str) {
        return (EnumC262400zu) C08FF.LIZ(EnumC262400zu.class, str);
    }

    public EnumC262400zu(String str, int i) {
    }
}
