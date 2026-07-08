package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HSZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HSZ {
    public static final C0HSZ ERROR;
    public static final C0HSZ GENERATING;
    public static final C0HSZ IDLE;
    public static final /* synthetic */ C0HSZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HSZ NEW;
    public static final C0HSZ READY_TO_REVIEW;

    public static InterfaceC2044707zh<C0HSZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HSZ c0hsz = new C0HSZ("NEW", 0);
        NEW = c0hsz;
        C0HSZ c0hsz2 = new C0HSZ("IDLE", 1);
        IDLE = c0hsz2;
        C0HSZ c0hsz3 = new C0HSZ("GENERATING", 2);
        GENERATING = c0hsz3;
        C0HSZ c0hsz4 = new C0HSZ("READY_TO_REVIEW", 3);
        READY_TO_REVIEW = c0hsz4;
        C0HSZ c0hsz5 = new C0HSZ("ERROR", 4);
        ERROR = c0hsz5;
        C0HSZ[] c0hszArr = {c0hsz, c0hsz2, c0hsz3, c0hsz4, c0hsz5};
        LL = c0hszArr;
        LLILLJJLI = new C2254308sP(c0hszArr);
    }

    public static C0HSZ[] values() {
        return (C0HSZ[]) LL.clone();
    }

    public static C0HSZ valueOf(String str) {
        return (C0HSZ) C08FF.LIZ(C0HSZ.class, str);
    }

    public C0HSZ(String str, int i) {
    }
}
