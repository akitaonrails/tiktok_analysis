package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1576910r8b implements InterfaceC1576930r8d {
    public static final EnumC1576910r8b CAI_CHECK_FAIL;
    public static final EnumC1576910r8b CAI_CHECK_START;
    public static final EnumC1576910r8b CAI_CHECK_SUCCESS;
    public static final EnumC1576910r8b HAS_PRELOAD_VALID_DATA;
    public static final EnumC1576910r8b HAS_SWITCH_TO_DRAMA_TAB;
    public static final EnumC1576910r8b HAS_UN_CONSUME_VALID_DATA;
    public static final /* synthetic */ EnumC1576910r8b[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1576910r8b NOT_LOGIN;
    public static final EnumC1576910r8b NO_DRAMA_TAB;
    public static final EnumC1576910r8b PRELOAD_FAILED;
    public static final EnumC1576910r8b PRELOAD_SUCCESS;
    public static final EnumC1576910r8b RUN;
    public static final EnumC1576910r8b START;
    public static final EnumC1576910r8b STOP_PRELOAD;
    public final String LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1576910r8b> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1576910r8b enumC1576910r8b = new EnumC1576910r8b("START", 0, "start", false);
        START = enumC1576910r8b;
        EnumC1576910r8b enumC1576910r8b2 = new EnumC1576910r8b("RUN", 1, "run", false);
        RUN = enumC1576910r8b2;
        EnumC1576910r8b enumC1576910r8b3 = new EnumC1576910r8b("NOT_LOGIN", 2, "not_login", true);
        NOT_LOGIN = enumC1576910r8b3;
        EnumC1576910r8b enumC1576910r8b4 = new EnumC1576910r8b("NO_DRAMA_TAB", 3, "no_drama_tab", true);
        NO_DRAMA_TAB = enumC1576910r8b4;
        EnumC1576910r8b enumC1576910r8b5 = new EnumC1576910r8b("HAS_SWITCH_TO_DRAMA_TAB", 4, "has_switch_to_drama_tab", true);
        HAS_SWITCH_TO_DRAMA_TAB = enumC1576910r8b5;
        EnumC1576910r8b enumC1576910r8b6 = new EnumC1576910r8b("HAS_UN_CONSUME_VALID_DATA", 5, "has_un_consume_valid_data", true);
        HAS_UN_CONSUME_VALID_DATA = enumC1576910r8b6;
        EnumC1576910r8b enumC1576910r8b7 = new EnumC1576910r8b("HAS_PRELOAD_VALID_DATA", 6, "has_preload_valid_data", true);
        HAS_PRELOAD_VALID_DATA = enumC1576910r8b7;
        EnumC1576910r8b enumC1576910r8b8 = new EnumC1576910r8b("CAI_CHECK_START", 7, "cai_check_start", false);
        CAI_CHECK_START = enumC1576910r8b8;
        EnumC1576910r8b enumC1576910r8b9 = new EnumC1576910r8b("CAI_CHECK_SUCCESS", 8, "cai_check_success", false);
        CAI_CHECK_SUCCESS = enumC1576910r8b9;
        EnumC1576910r8b enumC1576910r8b10 = new EnumC1576910r8b("CAI_CHECK_FAIL", 9, "cai_check_fail", true);
        CAI_CHECK_FAIL = enumC1576910r8b10;
        EnumC1576910r8b enumC1576910r8b11 = new EnumC1576910r8b("PRELOAD_SUCCESS", 10, "preload_success", true);
        PRELOAD_SUCCESS = enumC1576910r8b11;
        EnumC1576910r8b enumC1576910r8b12 = new EnumC1576910r8b("PRELOAD_FAILED", 11, "preload_failed", true);
        PRELOAD_FAILED = enumC1576910r8b12;
        EnumC1576910r8b enumC1576910r8b13 = new EnumC1576910r8b("STOP_PRELOAD", 12, "stop_preload", true);
        STOP_PRELOAD = enumC1576910r8b13;
        EnumC1576910r8b[] enumC1576910r8bArr = {enumC1576910r8b, enumC1576910r8b2, enumC1576910r8b3, enumC1576910r8b4, enumC1576910r8b5, enumC1576910r8b6, enumC1576910r8b7, enumC1576910r8b8, enumC1576910r8b9, enumC1576910r8b10, enumC1576910r8b11, enumC1576910r8b12, enumC1576910r8b13};
        LLILLL = enumC1576910r8bArr;
        LLILZ = new C2254308sP(enumC1576910r8bArr);
    }

    public static EnumC1576910r8b[] values() {
        return (EnumC1576910r8b[]) LLILLL.clone();
    }

    @Override // X.InterfaceC1576930r8d
    public String getStage() {
        return this.LL;
    }

    @Override // X.InterfaceC1576930r8d
    public boolean isFinal() {
        return this.LLILLJJLI;
    }

    public static EnumC1576910r8b valueOf(String str) {
        return (EnumC1576910r8b) C08FF.LIZ(EnumC1576910r8b.class, str);
    }

    public EnumC1576910r8b(String str, int i, String str2, boolean z) {
        this.LL = str2;
        this.LLILLJJLI = z;
    }
}
