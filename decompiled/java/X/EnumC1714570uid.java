package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1714570uid {
    public static final EnumC1714570uid ERROR;
    public static final /* synthetic */ EnumC1714570uid[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1714570uid PASS;
    public static final EnumC1714570uid PENDING;
    public static final EnumC1714570uid REJECT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1714570uid> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1714570uid enumC1714570uid = new EnumC1714570uid("PASS", 0, "PASS");
        PASS = enumC1714570uid;
        EnumC1714570uid enumC1714570uid2 = new EnumC1714570uid("REJECT", 1, "REJECT");
        REJECT = enumC1714570uid2;
        EnumC1714570uid enumC1714570uid3 = new EnumC1714570uid("PENDING", 2, "PENDING");
        PENDING = enumC1714570uid3;
        EnumC1714570uid enumC1714570uid4 = new EnumC1714570uid("ERROR", 3, "ERROR");
        ERROR = enumC1714570uid4;
        EnumC1714570uid[] enumC1714570uidArr = {enumC1714570uid, enumC1714570uid2, enumC1714570uid3, enumC1714570uid4};
        LLILLJJLI = enumC1714570uidArr;
        LLILLL = new C2254308sP(enumC1714570uidArr);
    }

    public static EnumC1714570uid[] values() {
        return (EnumC1714570uid[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static EnumC1714570uid valueOf(String str) {
        return (EnumC1714570uid) C08FF.LIZ(EnumC1714570uid.class, str);
    }

    public EnumC1714570uid(String str, int i, String str2) {
        this.LL = str2;
    }
}
