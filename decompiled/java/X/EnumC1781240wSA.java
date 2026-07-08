package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781240wSA {
    public static final EnumC1781240wSA FEED_OUTREACH;
    public static final EnumC1781240wSA FEED_OUTREACH_COLD_START;
    public static final /* synthetic */ EnumC1781240wSA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1781240wSA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1781240wSA enumC1781240wSA = new EnumC1781240wSA("FEED_OUTREACH_COLD_START", 0, "feed_outreach_cold_start");
        FEED_OUTREACH_COLD_START = enumC1781240wSA;
        EnumC1781240wSA enumC1781240wSA2 = new EnumC1781240wSA("FEED_OUTREACH", 1, "feed_outreach");
        FEED_OUTREACH = enumC1781240wSA2;
        EnumC1781240wSA[] enumC1781240wSAArr = {enumC1781240wSA, enumC1781240wSA2};
        LLILLJJLI = enumC1781240wSAArr;
        LLILLL = new C2254308sP(enumC1781240wSAArr);
    }

    public static EnumC1781240wSA[] values() {
        return (EnumC1781240wSA[]) LLILLJJLI.clone();
    }

    public final String getSceneName() {
        return this.LL;
    }

    public static EnumC1781240wSA valueOf(String str) {
        return (EnumC1781240wSA) C08FF.LIZ(EnumC1781240wSA.class, str);
    }

    public EnumC1781240wSA(String str, int i, String str2) {
        this.LL = str2;
    }
}
