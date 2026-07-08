package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854480Xfa {
    public static final EnumC854480Xfa EMAIL;
    public static final /* synthetic */ EnumC854480Xfa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC854480Xfa PASSWORD;
    public static final EnumC854480Xfa SMS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC854480Xfa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854480Xfa enumC854480Xfa = new EnumC854480Xfa("EMAIL", 0, "email");
        EMAIL = enumC854480Xfa;
        EnumC854480Xfa enumC854480Xfa2 = new EnumC854480Xfa("PASSWORD", 1, "password");
        PASSWORD = enumC854480Xfa2;
        EnumC854480Xfa enumC854480Xfa3 = new EnumC854480Xfa("SMS", 2, "sms");
        SMS = enumC854480Xfa3;
        EnumC854480Xfa[] enumC854480XfaArr = {enumC854480Xfa, enumC854480Xfa2, enumC854480Xfa3};
        LLILLJJLI = enumC854480XfaArr;
        LLILLL = new C2254308sP(enumC854480XfaArr);
    }

    public static EnumC854480Xfa[] values() {
        return (EnumC854480Xfa[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC854480Xfa valueOf(String str) {
        return (EnumC854480Xfa) C08FF.LIZ(EnumC854480Xfa.class, str);
    }

    public EnumC854480Xfa(String str, int i, String str2) {
        this.LL = str2;
    }
}
