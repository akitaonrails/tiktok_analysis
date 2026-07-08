package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0utp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1721510utp {
    public static final C1721650uu3 Companion;
    public static final EnumC1721510utp FAILED;
    public static final /* synthetic */ EnumC1721510utp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1721510utp SUCCESS;

    public static InterfaceC2044707zh<EnumC1721510utp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1721510utp enumC1721510utp = new EnumC1721510utp("SUCCESS", 0);
        SUCCESS = enumC1721510utp;
        EnumC1721510utp enumC1721510utp2 = new EnumC1721510utp("FAILED", 1);
        FAILED = enumC1721510utp2;
        EnumC1721510utp[] enumC1721510utpArr = {enumC1721510utp, enumC1721510utp2};
        LL = enumC1721510utpArr;
        LLILLJJLI = new C2254308sP(enumC1721510utpArr);
        Companion = new C1721650uu3();
    }

    public static EnumC1721510utp[] values() {
        return (EnumC1721510utp[]) LL.clone();
    }

    public static EnumC1721510utp valueOf(String str) {
        return (EnumC1721510utp) C08FF.LIZ(EnumC1721510utp.class, str);
    }

    public EnumC1721510utp(String str, int i) {
    }
}
