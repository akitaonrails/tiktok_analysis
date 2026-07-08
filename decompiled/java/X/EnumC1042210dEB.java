package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1042210dEB {
    public static final EnumC1042210dEB FEED;
    public static final /* synthetic */ EnumC1042210dEB[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1042210dEB USER_ENTER_1;
    public static final EnumC1042210dEB USER_ENTER_2;
    public final String LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1042210dEB> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1042210dEB enumC1042210dEB = new EnumC1042210dEB("FEED", 0, "feed", true);
        FEED = enumC1042210dEB;
        EnumC1042210dEB enumC1042210dEB2 = new EnumC1042210dEB("USER_ENTER_1", 1, "user_enter_1", false);
        USER_ENTER_1 = enumC1042210dEB2;
        EnumC1042210dEB enumC1042210dEB3 = new EnumC1042210dEB("USER_ENTER_2", 2, "user_enter_2", false);
        USER_ENTER_2 = enumC1042210dEB3;
        EnumC1042210dEB[] enumC1042210dEBArr = {enumC1042210dEB, enumC1042210dEB2, enumC1042210dEB3};
        LLILLL = enumC1042210dEBArr;
        LLILZ = new C2254308sP(enumC1042210dEBArr);
    }

    public static EnumC1042210dEB[] values() {
        return (EnumC1042210dEB[]) LLILLL.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public final boolean isPrefetch() {
        return this.LLILLJJLI;
    }

    public static EnumC1042210dEB valueOf(String str) {
        return (EnumC1042210dEB) C08FF.LIZ(EnumC1042210dEB.class, str);
    }

    public EnumC1042210dEB(String str, int i, String str2, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = z;
    }
}
