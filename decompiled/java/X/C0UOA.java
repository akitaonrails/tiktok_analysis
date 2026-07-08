package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UOA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UOA {
    public static final C0UOA AGE_REVIEWING_STAGE;
    public static final C0UOA AGE_VERIFIED;
    public static final C0UOA AGE_VERIFY_FAILED_STAGE;
    public static final C0UOA CAN_SUBMIT_AGE_VERIFY_STAGE;
    public static final /* synthetic */ C0UOA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0UOA> getEntries() {
        return LLILLL;
    }

    static {
        C0UOA c0uoa = new C0UOA("CAN_SUBMIT_AGE_VERIFY_STAGE", 0, 0);
        CAN_SUBMIT_AGE_VERIFY_STAGE = c0uoa;
        C0UOA c0uoa2 = new C0UOA("AGE_REVIEWING_STAGE", 1, 1);
        AGE_REVIEWING_STAGE = c0uoa2;
        C0UOA c0uoa3 = new C0UOA("AGE_VERIFY_FAILED_STAGE", 2, 2);
        AGE_VERIFY_FAILED_STAGE = c0uoa3;
        C0UOA c0uoa4 = new C0UOA("AGE_VERIFIED", 3, 3);
        AGE_VERIFIED = c0uoa4;
        C0UOA[] c0uoaArr = {c0uoa, c0uoa2, c0uoa3, c0uoa4};
        LLILLJJLI = c0uoaArr;
        LLILLL = new C2254308sP(c0uoaArr);
    }

    public static C0UOA[] values() {
        return (C0UOA[]) LLILLJJLI.clone();
    }

    public final int getStage() {
        return this.LL;
    }

    public static C0UOA valueOf(String str) {
        return (C0UOA) C08FF.LIZ(C0UOA.class, str);
    }

    public C0UOA(String str, int i, int i2) {
        this.LL = i2;
    }
}
