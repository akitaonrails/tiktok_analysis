package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC950510aqH {
    public static final /* synthetic */ EnumC950510aqH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC950510aqH MESSAGE_APPLY;
    public static final EnumC950510aqH MESSAGE_INVITE;
    public static final EnumC950510aqH OFFLIVE_INVITE;
    public static final EnumC950510aqH OTHER;
    public static final EnumC950510aqH REMOVE;
    public static final EnumC950510aqH SDK_APPLY;
    public static final EnumC950510aqH SDK_APPLY_TIMEOUT;
    public static final EnumC950510aqH SDK_INVITE;
    public static final EnumC950510aqH SDK_INVITE_TIMEOUT;
    public static final EnumC950510aqH USER_LIST;

    public static InterfaceC2044707zh<EnumC950510aqH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC950510aqH enumC950510aqH = new EnumC950510aqH("SDK_INVITE", 0);
        SDK_INVITE = enumC950510aqH;
        EnumC950510aqH enumC950510aqH2 = new EnumC950510aqH("SDK_INVITE_TIMEOUT", 1);
        SDK_INVITE_TIMEOUT = enumC950510aqH2;
        EnumC950510aqH enumC950510aqH3 = new EnumC950510aqH("SDK_APPLY", 2);
        SDK_APPLY = enumC950510aqH3;
        EnumC950510aqH enumC950510aqH4 = new EnumC950510aqH("SDK_APPLY_TIMEOUT", 3);
        SDK_APPLY_TIMEOUT = enumC950510aqH4;
        EnumC950510aqH enumC950510aqH5 = new EnumC950510aqH("MESSAGE_INVITE", 4);
        MESSAGE_INVITE = enumC950510aqH5;
        EnumC950510aqH enumC950510aqH6 = new EnumC950510aqH("MESSAGE_APPLY", 5);
        MESSAGE_APPLY = enumC950510aqH6;
        EnumC950510aqH enumC950510aqH7 = new EnumC950510aqH("OFFLIVE_INVITE", 6);
        OFFLIVE_INVITE = enumC950510aqH7;
        EnumC950510aqH enumC950510aqH8 = new EnumC950510aqH("USER_LIST", 7);
        USER_LIST = enumC950510aqH8;
        EnumC950510aqH enumC950510aqH9 = new EnumC950510aqH("OTHER", 8);
        OTHER = enumC950510aqH9;
        EnumC950510aqH enumC950510aqH10 = new EnumC950510aqH("REMOVE", 9);
        REMOVE = enumC950510aqH10;
        EnumC950510aqH[] enumC950510aqHArr = {enumC950510aqH, enumC950510aqH2, enumC950510aqH3, enumC950510aqH4, enumC950510aqH5, enumC950510aqH6, enumC950510aqH7, enumC950510aqH8, enumC950510aqH9, enumC950510aqH10};
        LL = enumC950510aqHArr;
        LLILLJJLI = new C2254308sP(enumC950510aqHArr);
    }

    public static EnumC950510aqH[] values() {
        return (EnumC950510aqH[]) LL.clone();
    }

    public static EnumC950510aqH valueOf(String str) {
        return (EnumC950510aqH) C08FF.LIZ(EnumC950510aqH.class, str);
    }

    public EnumC950510aqH(String str, int i) {
    }
}
