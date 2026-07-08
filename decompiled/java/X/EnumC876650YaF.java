package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC876650YaF {
    public static final EnumC876650YaF CONVERSATION;
    public static final /* synthetic */ EnumC876650YaF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC876650YaF MESSAGE;
    public static final EnumC876650YaF PROPERTY;
    public static final EnumC876650YaF SINGLE_CHAT_CONVERSATION_ID;
    public static final EnumC876650YaF TIP;

    public static InterfaceC2044707zh<EnumC876650YaF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC876650YaF enumC876650YaF = new EnumC876650YaF("MESSAGE", 0);
        MESSAGE = enumC876650YaF;
        EnumC876650YaF enumC876650YaF2 = new EnumC876650YaF("CONVERSATION", 1);
        CONVERSATION = enumC876650YaF2;
        EnumC876650YaF enumC876650YaF3 = new EnumC876650YaF("SINGLE_CHAT_CONVERSATION_ID", 2);
        SINGLE_CHAT_CONVERSATION_ID = enumC876650YaF3;
        EnumC876650YaF enumC876650YaF4 = new EnumC876650YaF("PROPERTY", 3);
        PROPERTY = enumC876650YaF4;
        EnumC876650YaF enumC876650YaF5 = new EnumC876650YaF("TIP", 4);
        TIP = enumC876650YaF5;
        EnumC876650YaF[] enumC876650YaFArr = {enumC876650YaF, enumC876650YaF2, enumC876650YaF3, enumC876650YaF4, enumC876650YaF5};
        LL = enumC876650YaFArr;
        LLILLJJLI = new C2254308sP(enumC876650YaFArr);
    }

    public static EnumC876650YaF[] values() {
        return (EnumC876650YaF[]) LL.clone();
    }

    public static EnumC876650YaF valueOf(String str) {
        return (EnumC876650YaF) C08FF.LIZ(EnumC876650YaF.class, str);
    }

    public EnumC876650YaF(String str, int i) {
    }
}
