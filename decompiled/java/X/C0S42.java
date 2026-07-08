package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S42, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S42 {
    public static final C0S42 CLEAN_MODE;
    public static final /* synthetic */ C0S42[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0S42 NONE;
    public static final C0S42 REFERRAL;
    public static final C0S42 RISK_ASYNC_CLEAN_MODE_CLOSE;
    public static final C0S42 RISK_ASYNC_CLEAN_MODE_OPEN;
    public static final C0S42 UG_CARD_SURVEY;
    public final int LL;

    public static InterfaceC2044707zh<C0S42> getEntries() {
        return LLILLL;
    }

    static {
        C0S42 c0s42 = new C0S42("NONE", 0, 0);
        NONE = c0s42;
        C0S42 c0s422 = new C0S42("CLEAN_MODE", 1, 1);
        CLEAN_MODE = c0s422;
        C0S42 c0s423 = new C0S42("UG_CARD_SURVEY", 2, 2);
        UG_CARD_SURVEY = c0s423;
        C0S42 c0s424 = new C0S42("REFERRAL", 3, 3);
        REFERRAL = c0s424;
        C0S42 c0s425 = new C0S42("RISK_ASYNC_CLEAN_MODE_OPEN", 4, 101);
        RISK_ASYNC_CLEAN_MODE_OPEN = c0s425;
        C0S42 c0s426 = new C0S42("RISK_ASYNC_CLEAN_MODE_CLOSE", 5, 102);
        RISK_ASYNC_CLEAN_MODE_CLOSE = c0s426;
        C0S42[] c0s42Arr = {c0s42, c0s422, c0s423, c0s424, c0s425, c0s426};
        LLILLJJLI = c0s42Arr;
        LLILLL = new C2254308sP(c0s42Arr);
    }

    public static C0S42[] values() {
        return (C0S42[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static C0S42 valueOf(String str) {
        return (C0S42) C08FF.LIZ(C0S42.class, str);
    }

    public C0S42(String str, int i, int i2) {
        this.LL = i2;
    }
}
