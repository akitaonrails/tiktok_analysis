package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC666230QBh implements C1D61 {
    public static final EnumC666230QBh ENTER_MIDDLE_PAGE;
    public static final EnumC666230QBh EXIT_MIDDLE_PAGE;
    public static final /* synthetic */ EnumC666230QBh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = name();

    public static InterfaceC2044707zh<EnumC666230QBh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC666230QBh enumC666230QBh = new EnumC666230QBh("ENTER_MIDDLE_PAGE", 0);
        ENTER_MIDDLE_PAGE = enumC666230QBh;
        EnumC666230QBh enumC666230QBh2 = new EnumC666230QBh("EXIT_MIDDLE_PAGE", 1);
        EXIT_MIDDLE_PAGE = enumC666230QBh2;
        EnumC666230QBh[] enumC666230QBhArr = {enumC666230QBh, enumC666230QBh2};
        LLILLJJLI = enumC666230QBhArr;
        LLILLL = new C2254308sP(enumC666230QBhArr);
    }

    public static EnumC666230QBh[] values() {
        return (EnumC666230QBh[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static EnumC666230QBh valueOf(String str) {
        return (EnumC666230QBh) C08FF.LIZ(EnumC666230QBh.class, str);
    }

    public EnumC666230QBh(String str, int i) {
    }
}
