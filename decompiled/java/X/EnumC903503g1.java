package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03g1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC903503g1 {
    public static final EnumC903503g1 Address;
    public static final EnumC903503g1 BA_CITY;
    public static final EnumC903503g1 BA_COUNTRY;
    public static final EnumC903503g1 BA_COUNTY;
    public static final EnumC903503g1 CPF;
    public static final EnumC903503g1 CardNumber;
    public static final EnumC903503g1 Date;
    public static final EnumC903503g1 Email;
    public static final EnumC903503g1 ISSUE_DATE;
    public static final /* synthetic */ EnumC903503g1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC903503g1 Normal;
    public static final EnumC903503g1 Option;
    public static final EnumC903503g1 Phone;
    public static final EnumC903503g1 Region;
    public static final EnumC903503g1 UN_USE0;
    public static final EnumC903503g1 UN_USE1;

    public static InterfaceC2044707zh<EnumC903503g1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC903503g1 enumC903503g1 = new EnumC903503g1("Normal", 0);
        Normal = enumC903503g1;
        EnumC903503g1 enumC903503g12 = new EnumC903503g1("CardNumber", 1);
        CardNumber = enumC903503g12;
        EnumC903503g1 enumC903503g13 = new EnumC903503g1("Date", 2);
        Date = enumC903503g13;
        EnumC903503g1 enumC903503g14 = new EnumC903503g1("Region", 3);
        Region = enumC903503g14;
        EnumC903503g1 enumC903503g15 = new EnumC903503g1("CPF", 4);
        CPF = enumC903503g15;
        EnumC903503g1 enumC903503g16 = new EnumC903503g1("Email", 5);
        Email = enumC903503g16;
        EnumC903503g1 enumC903503g17 = new EnumC903503g1("Address", 6);
        Address = enumC903503g17;
        EnumC903503g1 enumC903503g18 = new EnumC903503g1("Option", 7);
        Option = enumC903503g18;
        EnumC903503g1 enumC903503g19 = new EnumC903503g1("Phone", 8);
        Phone = enumC903503g19;
        EnumC903503g1 enumC903503g110 = new EnumC903503g1("UN_USE0", 9);
        UN_USE0 = enumC903503g110;
        EnumC903503g1 enumC903503g111 = new EnumC903503g1("UN_USE1", 10);
        UN_USE1 = enumC903503g111;
        EnumC903503g1 enumC903503g112 = new EnumC903503g1("BA_COUNTRY", 11);
        BA_COUNTRY = enumC903503g112;
        EnumC903503g1 enumC903503g113 = new EnumC903503g1("BA_CITY", 12);
        BA_CITY = enumC903503g113;
        EnumC903503g1 enumC903503g114 = new EnumC903503g1("BA_COUNTY", 13);
        BA_COUNTY = enumC903503g114;
        EnumC903503g1 enumC903503g115 = new EnumC903503g1("ISSUE_DATE", 14);
        ISSUE_DATE = enumC903503g115;
        EnumC903503g1[] enumC903503g1Arr = {enumC903503g1, enumC903503g12, enumC903503g13, enumC903503g14, enumC903503g15, enumC903503g16, enumC903503g17, enumC903503g18, enumC903503g19, enumC903503g110, enumC903503g111, enumC903503g112, enumC903503g113, enumC903503g114, enumC903503g115};
        LL = enumC903503g1Arr;
        LLILLJJLI = new C2254308sP(enumC903503g1Arr);
    }

    public static EnumC903503g1[] values() {
        return (EnumC903503g1[]) LL.clone();
    }

    public static EnumC903503g1 valueOf(String str) {
        return (EnumC903503g1) C08FF.LIZ(EnumC903503g1.class, str);
    }

    public EnumC903503g1(String str, int i) {
    }
}
