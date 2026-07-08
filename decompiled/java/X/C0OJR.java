package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OJR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJR {
    public static final C0OJR BULLETIN_OPEN_NORMAL;
    public static final C0OJR CREATOR_CLOSED_CAN_REOPEN;
    public static final C0OJR CREATOR_CLOSED_CREATED_ANOTHER;
    public static final C0OJR CREATOR_CLOSED_OVER_TIME;
    public static final C0OJR INVALID;
    public static final /* synthetic */ C0OJR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0OJR> getEntries() {
        return LLILLL;
    }

    static {
        C0OJR c0ojr = new C0OJR("INVALID", 0, -1);
        INVALID = c0ojr;
        C0OJR c0ojr2 = new C0OJR("BULLETIN_OPEN_NORMAL", 1, 1);
        BULLETIN_OPEN_NORMAL = c0ojr2;
        C0OJR c0ojr3 = new C0OJR("CREATOR_CLOSED_CAN_REOPEN", 2, 2);
        CREATOR_CLOSED_CAN_REOPEN = c0ojr3;
        C0OJR c0ojr4 = new C0OJR("CREATOR_CLOSED_OVER_TIME", 3, 3);
        CREATOR_CLOSED_OVER_TIME = c0ojr4;
        C0OJR c0ojr5 = new C0OJR("CREATOR_CLOSED_CREATED_ANOTHER", 4, 4);
        CREATOR_CLOSED_CREATED_ANOTHER = c0ojr5;
        C0OJR[] c0ojrArr = {c0ojr, c0ojr2, c0ojr3, c0ojr4, c0ojr5};
        LLILLJJLI = c0ojrArr;
        LLILLL = new C2254308sP(c0ojrArr);
    }

    public static C0OJR[] values() {
        return (C0OJR[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static C0OJR valueOf(String str) {
        return (C0OJR) C08FF.LIZ(C0OJR.class, str);
    }

    public C0OJR(String str, int i, int i2) {
        this.LL = i2;
    }
}
