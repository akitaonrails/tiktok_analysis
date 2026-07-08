package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03fT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC900103fT {
    public static final EnumC900103fT BIDDING_BIND;
    public static final /* synthetic */ EnumC900103fT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC900103fT MEMBERSHIP_BIND;
    public static final EnumC900103fT NORMAL_BIND;
    public static final EnumC900103fT NORMAL_ONETIME;
    public static final EnumC900103fT SNS_BIND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC900103fT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC900103fT enumC900103fT = new EnumC900103fT("SNS_BIND", 0, "sns_bind");
        SNS_BIND = enumC900103fT;
        EnumC900103fT enumC900103fT2 = new EnumC900103fT("BIDDING_BIND", 1, "bidding_bind");
        BIDDING_BIND = enumC900103fT2;
        EnumC900103fT enumC900103fT3 = new EnumC900103fT("NORMAL_ONETIME", 2, "normal_onetime");
        NORMAL_ONETIME = enumC900103fT3;
        EnumC900103fT enumC900103fT4 = new EnumC900103fT("NORMAL_BIND", 3, "normal_bind");
        NORMAL_BIND = enumC900103fT4;
        EnumC900103fT enumC900103fT5 = new EnumC900103fT("MEMBERSHIP_BIND", 4, "membership_bind");
        MEMBERSHIP_BIND = enumC900103fT5;
        EnumC900103fT[] enumC900103fTArr = {enumC900103fT, enumC900103fT2, enumC900103fT3, enumC900103fT4, enumC900103fT5};
        LLILLJJLI = enumC900103fTArr;
        LLILLL = new C2254308sP(enumC900103fTArr);
    }

    public static EnumC900103fT[] values() {
        return (EnumC900103fT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC900103fT valueOf(String str) {
        return (EnumC900103fT) C08FF.LIZ(EnumC900103fT.class, str);
    }

    public EnumC900103fT(String str, int i, String str2) {
        this.LL = str2;
    }
}
