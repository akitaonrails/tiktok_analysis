package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1787200wbm {
    public static final EnumC1787200wbm CLOSE;
    public static final /* synthetic */ EnumC1787200wbm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1787200wbm REDIRECT_CHANNEL;
    public static final EnumC1787200wbm REDIRECT_FEEDBACK_CHATBOT;

    public static InterfaceC2044707zh<EnumC1787200wbm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1787200wbm enumC1787200wbm = new EnumC1787200wbm("CLOSE", 0);
        CLOSE = enumC1787200wbm;
        EnumC1787200wbm enumC1787200wbm2 = new EnumC1787200wbm("REDIRECT_FEEDBACK_CHATBOT", 1);
        REDIRECT_FEEDBACK_CHATBOT = enumC1787200wbm2;
        EnumC1787200wbm enumC1787200wbm3 = new EnumC1787200wbm("REDIRECT_CHANNEL", 2);
        REDIRECT_CHANNEL = enumC1787200wbm3;
        EnumC1787200wbm[] enumC1787200wbmArr = {enumC1787200wbm, enumC1787200wbm2, enumC1787200wbm3};
        LL = enumC1787200wbmArr;
        LLILLJJLI = new C2254308sP(enumC1787200wbmArr);
    }

    public static EnumC1787200wbm[] values() {
        return (EnumC1787200wbm[]) LL.clone();
    }

    public static EnumC1787200wbm valueOf(String str) {
        return (EnumC1787200wbm) C08FF.LIZ(EnumC1787200wbm.class, str);
    }

    public EnumC1787200wbm(String str, int i) {
    }
}
