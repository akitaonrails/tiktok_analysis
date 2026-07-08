package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC046600Eu {
    public static final EnumC046600Eu BUSINESS_VISIT;
    public static final /* synthetic */ EnumC046600Eu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC046600Eu RISK_PERCEPTION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC046600Eu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC046600Eu enumC046600Eu = new EnumC046600Eu("RISK_PERCEPTION", 0, "risk_perception");
        RISK_PERCEPTION = enumC046600Eu;
        EnumC046600Eu enumC046600Eu2 = new EnumC046600Eu("BUSINESS_VISIT", 1, "business_visit");
        BUSINESS_VISIT = enumC046600Eu2;
        EnumC046600Eu[] enumC046600EuArr = {enumC046600Eu, enumC046600Eu2};
        LLILLJJLI = enumC046600EuArr;
        LLILLL = new C2254308sP(enumC046600EuArr);
    }

    public static EnumC046600Eu[] values() {
        return (EnumC046600Eu[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC046600Eu valueOf(String str) {
        return (EnumC046600Eu) C08FF.LIZ(EnumC046600Eu.class, str);
    }

    public EnumC046600Eu(String str, int i, String str2) {
        this.LL = str2;
    }
}
