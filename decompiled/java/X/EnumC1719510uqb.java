package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1719510uqb {
    public static final EnumC1719510uqb LAYOUT;
    public static final /* synthetic */ EnumC1719510uqb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1719510uqb LTR;
    public static final EnumC1719510uqb RTL;

    public static InterfaceC2044707zh<EnumC1719510uqb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1719510uqb enumC1719510uqb = new EnumC1719510uqb("LTR", 0);
        LTR = enumC1719510uqb;
        EnumC1719510uqb enumC1719510uqb2 = new EnumC1719510uqb("RTL", 1);
        RTL = enumC1719510uqb2;
        EnumC1719510uqb enumC1719510uqb3 = new EnumC1719510uqb("LAYOUT", 2);
        LAYOUT = enumC1719510uqb3;
        EnumC1719510uqb[] enumC1719510uqbArr = {enumC1719510uqb, enumC1719510uqb2, enumC1719510uqb3};
        LL = enumC1719510uqbArr;
        LLILLJJLI = new C2254308sP(enumC1719510uqbArr);
    }

    public static EnumC1719510uqb[] values() {
        return (EnumC1719510uqb[]) LL.clone();
    }

    public static EnumC1719510uqb valueOf(String str) {
        return (EnumC1719510uqb) C08FF.LIZ(EnumC1719510uqb.class, str);
    }

    public EnumC1719510uqb(String str, int i) {
    }
}
