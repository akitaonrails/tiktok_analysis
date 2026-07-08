package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1117520fBe {
    public static final C1117550fBh Companion;
    public static final EnumC1117520fBe FANS_CLUB_CRM_AI_SWITCH_STATUS_DEFAULT;
    public static final EnumC1117520fBe FANS_CLUB_CRM_AI_SWITCH_STATUS_OFF;
    public static final EnumC1117520fBe FANS_CLUB_CRM_AI_SWITCH_STATUS_ON;
    public static final /* synthetic */ EnumC1117520fBe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1117520fBe> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fBh] */
    static {
        EnumC1117520fBe enumC1117520fBe = new EnumC1117520fBe("FANS_CLUB_CRM_AI_SWITCH_STATUS_DEFAULT", 0, 0L);
        FANS_CLUB_CRM_AI_SWITCH_STATUS_DEFAULT = enumC1117520fBe;
        EnumC1117520fBe enumC1117520fBe2 = new EnumC1117520fBe("FANS_CLUB_CRM_AI_SWITCH_STATUS_ON", 1, 1L);
        FANS_CLUB_CRM_AI_SWITCH_STATUS_ON = enumC1117520fBe2;
        EnumC1117520fBe enumC1117520fBe3 = new EnumC1117520fBe("FANS_CLUB_CRM_AI_SWITCH_STATUS_OFF", 2, 2L);
        FANS_CLUB_CRM_AI_SWITCH_STATUS_OFF = enumC1117520fBe3;
        EnumC1117520fBe[] enumC1117520fBeArr = {enumC1117520fBe, enumC1117520fBe2, enumC1117520fBe3};
        LLILLJJLI = enumC1117520fBeArr;
        LLILLL = new C2254308sP(enumC1117520fBeArr);
        Companion = new Object() { // from class: X.0fBh
        };
    }

    public static EnumC1117520fBe[] values() {
        return (EnumC1117520fBe[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1117520fBe valueOf(String str) {
        return (EnumC1117520fBe) C08FF.LIZ(EnumC1117520fBe.class, str);
    }

    public EnumC1117520fBe(String str, int i, long j) {
        this.LL = j;
    }
}
