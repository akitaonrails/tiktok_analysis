package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC851960XbW {
    public static final EnumC851960XbW ANOMALY;
    public static final EnumC851960XbW CONTINUE_SIGNUP_FLOW;
    public static final EnumC851960XbW DISMISS;
    public static final EnumC851960XbW EMAIL_REGISTER;
    public static final EnumC851960XbW FALLBACK;
    public static final EnumC851960XbW FINISH;
    public static final /* synthetic */ EnumC851960XbW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC851960XbW LOAD_OPTIONAL_PAGES;
    public static final EnumC851960XbW QUICK_LOGIN_CONTINUE_FOR_SIGNUP;
    public static final EnumC851960XbW TERMS_CONSENT_3P;
    public static final EnumC851960XbW TERMS_CONSENT_PHONE;
    public static final EnumC851960XbW VERIFY_EMAIL_CODE;

    public static InterfaceC2044707zh<EnumC851960XbW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC851960XbW enumC851960XbW = new EnumC851960XbW("CONTINUE_SIGNUP_FLOW", 0);
        CONTINUE_SIGNUP_FLOW = enumC851960XbW;
        EnumC851960XbW enumC851960XbW2 = new EnumC851960XbW("QUICK_LOGIN_CONTINUE_FOR_SIGNUP", 1);
        QUICK_LOGIN_CONTINUE_FOR_SIGNUP = enumC851960XbW2;
        EnumC851960XbW enumC851960XbW3 = new EnumC851960XbW("VERIFY_EMAIL_CODE", 2);
        VERIFY_EMAIL_CODE = enumC851960XbW3;
        EnumC851960XbW enumC851960XbW4 = new EnumC851960XbW("EMAIL_REGISTER", 3);
        EMAIL_REGISTER = enumC851960XbW4;
        EnumC851960XbW enumC851960XbW5 = new EnumC851960XbW("TERMS_CONSENT_3P", 4);
        TERMS_CONSENT_3P = enumC851960XbW5;
        EnumC851960XbW enumC851960XbW6 = new EnumC851960XbW("TERMS_CONSENT_PHONE", 5);
        TERMS_CONSENT_PHONE = enumC851960XbW6;
        EnumC851960XbW enumC851960XbW7 = new EnumC851960XbW("DISMISS", 6);
        DISMISS = enumC851960XbW7;
        EnumC851960XbW enumC851960XbW8 = new EnumC851960XbW("FINISH", 7);
        FINISH = enumC851960XbW8;
        EnumC851960XbW enumC851960XbW9 = new EnumC851960XbW("LOAD_OPTIONAL_PAGES", 8);
        LOAD_OPTIONAL_PAGES = enumC851960XbW9;
        EnumC851960XbW enumC851960XbW10 = new EnumC851960XbW("ANOMALY", 9);
        ANOMALY = enumC851960XbW10;
        EnumC851960XbW enumC851960XbW11 = new EnumC851960XbW("FALLBACK", 10);
        FALLBACK = enumC851960XbW11;
        EnumC851960XbW[] enumC851960XbWArr = {enumC851960XbW, enumC851960XbW2, enumC851960XbW3, enumC851960XbW4, enumC851960XbW5, enumC851960XbW6, enumC851960XbW7, enumC851960XbW8, enumC851960XbW9, enumC851960XbW10, enumC851960XbW11};
        LL = enumC851960XbWArr;
        LLILLJJLI = new C2254308sP(enumC851960XbWArr);
    }

    public static EnumC851960XbW[] values() {
        return (EnumC851960XbW[]) LL.clone();
    }

    public static EnumC851960XbW valueOf(String str) {
        return (EnumC851960XbW) C08FF.LIZ(EnumC851960XbW.class, str);
    }

    public EnumC851960XbW(String str, int i) {
    }
}
