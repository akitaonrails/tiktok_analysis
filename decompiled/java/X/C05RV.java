package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05RV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05RV {
    public static final C05RV BUSINESS_INBOX;
    public static final C05RU Companion;
    public static final /* synthetic */ C05RV[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C05RV PERSONAL_INBOX;
    public static final C05RV PRO_CREATOR_INBOX;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C05RV> getEntries() {
        return LLILZ;
    }

    static {
        C05RV c05rv = new C05RV("PERSONAL_INBOX", 0, 3, "personal");
        PERSONAL_INBOX = c05rv;
        C05RV c05rv2 = new C05RV("PRO_CREATOR_INBOX", 1, 4, "creator_pro");
        PRO_CREATOR_INBOX = c05rv2;
        C05RV c05rv3 = new C05RV("BUSINESS_INBOX", 2, 1, "business");
        BUSINESS_INBOX = c05rv3;
        C05RV[] c05rvArr = {c05rv, c05rv2, c05rv3};
        LLILLL = c05rvArr;
        LLILZ = new C2254308sP(c05rvArr);
        Companion = new C05RU();
    }

    public static C05RV[] values() {
        return (C05RV[]) LLILLL.clone();
    }

    public final int getEnumValue() {
        return this.LL;
    }

    public final String getMobValue() {
        return this.LLILLJJLI;
    }

    public static C05RV valueOf(String str) {
        return (C05RV) C08FF.LIZ(C05RV.class, str);
    }

    public C05RV(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
