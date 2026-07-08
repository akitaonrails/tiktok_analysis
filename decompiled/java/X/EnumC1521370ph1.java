package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ph1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1521370ph1 {
    public static final EnumC1521370ph1 Config;
    public static final EnumC1521370ph1 CustomReport;
    public static final EnumC1521370ph1 Init;
    public static final /* synthetic */ EnumC1521370ph1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1521370ph1 ReportJsError;

    public static InterfaceC2044707zh<EnumC1521370ph1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1521370ph1 enumC1521370ph1 = new EnumC1521370ph1("Init", 0);
        Init = enumC1521370ph1;
        EnumC1521370ph1 enumC1521370ph12 = new EnumC1521370ph1("CustomReport", 1);
        CustomReport = enumC1521370ph12;
        EnumC1521370ph1 enumC1521370ph13 = new EnumC1521370ph1("Config", 2);
        Config = enumC1521370ph13;
        EnumC1521370ph1 enumC1521370ph14 = new EnumC1521370ph1("ReportJsError", 3);
        ReportJsError = enumC1521370ph14;
        EnumC1521370ph1[] enumC1521370ph1Arr = {enumC1521370ph1, enumC1521370ph12, enumC1521370ph13, enumC1521370ph14};
        LL = enumC1521370ph1Arr;
        LLILLJJLI = new C2254308sP(enumC1521370ph1Arr);
    }

    public static EnumC1521370ph1[] values() {
        return (EnumC1521370ph1[]) LL.clone();
    }

    public static EnumC1521370ph1 valueOf(String str) {
        return (EnumC1521370ph1) C08FF.LIZ(EnumC1521370ph1.class, str);
    }

    public EnumC1521370ph1(String str, int i) {
    }
}
