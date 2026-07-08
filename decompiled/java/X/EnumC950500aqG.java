package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC950500aqG {
    public static final EnumC950500aqG ACCEPT;
    public static final EnumC950500aqG INVITE_WITHDRAW;
    public static final /* synthetic */ EnumC950500aqG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC950500aqG OTHERS_REJECT;
    public static final EnumC950500aqG OVER_TIME;
    public static final EnumC950500aqG REJECT;
    public static final EnumC950500aqG UNKNOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC950500aqG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC950500aqG enumC950500aqG = new EnumC950500aqG("ACCEPT", 0, "accept");
        ACCEPT = enumC950500aqG;
        EnumC950500aqG enumC950500aqG2 = new EnumC950500aqG("REJECT", 1, "reject");
        REJECT = enumC950500aqG2;
        EnumC950500aqG enumC950500aqG3 = new EnumC950500aqG("OVER_TIME", 2, "over_time");
        OVER_TIME = enumC950500aqG3;
        EnumC950500aqG enumC950500aqG4 = new EnumC950500aqG("INVITE_WITHDRAW", 3, "invite_withdraw");
        INVITE_WITHDRAW = enumC950500aqG4;
        EnumC950500aqG enumC950500aqG5 = new EnumC950500aqG("OTHERS_REJECT", 4, "others_reject");
        OTHERS_REJECT = enumC950500aqG5;
        EnumC950500aqG enumC950500aqG6 = new EnumC950500aqG("UNKNOW", 5, "unknow");
        UNKNOW = enumC950500aqG6;
        EnumC950500aqG[] enumC950500aqGArr = {enumC950500aqG, enumC950500aqG2, enumC950500aqG3, enumC950500aqG4, enumC950500aqG5, enumC950500aqG6};
        LLILLJJLI = enumC950500aqGArr;
        LLILLL = new C2254308sP(enumC950500aqGArr);
    }

    public static EnumC950500aqG[] values() {
        return (EnumC950500aqG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC950500aqG valueOf(String str) {
        return (EnumC950500aqG) C08FF.LIZ(EnumC950500aqG.class, str);
    }

    public EnumC950500aqG(String str, int i, String str2) {
        this.LL = str2;
    }
}
