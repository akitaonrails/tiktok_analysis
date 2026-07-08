package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1073650e2t {
    public static final EnumC1073650e2t CONTACT;
    public static final EnumC1073650e2t FACEBOOK;
    public static final EnumC1073650e2t INVITE;
    public static final /* synthetic */ EnumC1073650e2t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1073650e2t SHARE_BAR;

    public static InterfaceC2044707zh<EnumC1073650e2t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1073650e2t enumC1073650e2t = new EnumC1073650e2t("CONTACT", 0);
        CONTACT = enumC1073650e2t;
        EnumC1073650e2t enumC1073650e2t2 = new EnumC1073650e2t("FACEBOOK", 1);
        FACEBOOK = enumC1073650e2t2;
        EnumC1073650e2t enumC1073650e2t3 = new EnumC1073650e2t("INVITE", 2);
        INVITE = enumC1073650e2t3;
        EnumC1073650e2t enumC1073650e2t4 = new EnumC1073650e2t("SHARE_BAR", 3);
        SHARE_BAR = enumC1073650e2t4;
        EnumC1073650e2t[] enumC1073650e2tArr = {enumC1073650e2t, enumC1073650e2t2, enumC1073650e2t3, enumC1073650e2t4};
        LL = enumC1073650e2tArr;
        LLILLJJLI = new C2254308sP(enumC1073650e2tArr);
    }

    public static EnumC1073650e2t[] values() {
        return (EnumC1073650e2t[]) LL.clone();
    }

    public static EnumC1073650e2t valueOf(String str) {
        return (EnumC1073650e2t) C08FF.LIZ(EnumC1073650e2t.class, str);
    }

    public EnumC1073650e2t(String str, int i) {
    }
}
