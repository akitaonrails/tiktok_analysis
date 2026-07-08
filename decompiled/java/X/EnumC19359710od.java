package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19359710od {
    public static final EnumC19359710od BUSINESS_DEFAULT;
    public static final EnumC19359710od BUSINESS_HIGH;
    public static final EnumC19359710od BUSINESS_LOW;
    public static final /* synthetic */ EnumC19359710od[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19359710od> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19359710od enumC19359710od = new EnumC19359710od("BUSINESS_LOW", 0);
        BUSINESS_LOW = enumC19359710od;
        EnumC19359710od enumC19359710od2 = new EnumC19359710od("BUSINESS_DEFAULT", 1);
        BUSINESS_DEFAULT = enumC19359710od2;
        EnumC19359710od enumC19359710od3 = new EnumC19359710od("BUSINESS_HIGH", 2);
        BUSINESS_HIGH = enumC19359710od3;
        EnumC19359710od[] enumC19359710odArr = {enumC19359710od, enumC19359710od2, enumC19359710od3};
        LL = enumC19359710odArr;
        LLILLJJLI = new C2254308sP(enumC19359710odArr);
    }

    public static EnumC19359710od[] values() {
        return (EnumC19359710od[]) LL.clone();
    }

    public static EnumC19359710od valueOf(String str) {
        return (EnumC19359710od) C08FF.LIZ(EnumC19359710od.class, str);
    }

    public EnumC19359710od(String str, int i) {
    }
}
