package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UOE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UOE {
    public static final C0UOE AGE_REVIEWING_KEY;
    public static final C0UOE AGE_VERIFY_FAILED_KEY;
    public static final C0UOE CAN_SUBMIT_AGE_VERIFY_KEY;
    public static final /* synthetic */ C0UOE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0UOE> getEntries() {
        return LLILLL;
    }

    static {
        C0UOE c0uoe = new C0UOE("CAN_SUBMIT_AGE_VERIFY_KEY", 0, "ttlive_LOPAgeConfirmBeforeGoLIVE_confirm_banner");
        CAN_SUBMIT_AGE_VERIFY_KEY = c0uoe;
        C0UOE c0uoe2 = new C0UOE("AGE_REVIEWING_KEY", 1, "ttlive_LOPAgeConfirmBeforeGoLIVE_review_banner");
        AGE_REVIEWING_KEY = c0uoe2;
        C0UOE c0uoe3 = new C0UOE("AGE_VERIFY_FAILED_KEY", 2, "ttlive_LOPAgeConfirmBeforeGoLIVE_reviewFail_banner");
        AGE_VERIFY_FAILED_KEY = c0uoe3;
        C0UOE[] c0uoeArr = {c0uoe, c0uoe2, c0uoe3};
        LLILLJJLI = c0uoeArr;
        LLILLL = new C2254308sP(c0uoeArr);
    }

    public static C0UOE[] values() {
        return (C0UOE[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0UOE valueOf(String str) {
        return (C0UOE) C08FF.LIZ(C0UOE.class, str);
    }

    public C0UOE(String str, int i, String str2) {
        this.LL = str2;
    }
}
