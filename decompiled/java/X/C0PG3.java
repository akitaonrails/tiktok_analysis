package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG3 {
    public static final C0PG3 CALL_RESULT_PERFORM_PLAY;
    public static final C0PG3 CALL_RESULT_PERFORM_PLAY_BUT_LAZY;
    public static final C0PG3 INIT;
    public static final C0PG3 LAZY_CALCULATE;
    public static final /* synthetic */ C0PG3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PG3 PLAYER_GET_CALLED;
    public static final C0PG3 REPORTED;
    public static final C0PG3 START_CALCULATE;

    public static InterfaceC2044707zh<C0PG3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PG3 c0pg3 = new C0PG3("INIT", 0);
        INIT = c0pg3;
        C0PG3 c0pg32 = new C0PG3("START_CALCULATE", 1);
        START_CALCULATE = c0pg32;
        C0PG3 c0pg33 = new C0PG3("CALL_RESULT_PERFORM_PLAY", 2);
        CALL_RESULT_PERFORM_PLAY = c0pg33;
        C0PG3 c0pg34 = new C0PG3("CALL_RESULT_PERFORM_PLAY_BUT_LAZY", 3);
        CALL_RESULT_PERFORM_PLAY_BUT_LAZY = c0pg34;
        C0PG3 c0pg35 = new C0PG3("LAZY_CALCULATE", 4);
        LAZY_CALCULATE = c0pg35;
        C0PG3 c0pg36 = new C0PG3("PLAYER_GET_CALLED", 5);
        PLAYER_GET_CALLED = c0pg36;
        C0PG3 c0pg37 = new C0PG3("REPORTED", 6);
        REPORTED = c0pg37;
        C0PG3[] c0pg3Arr = {c0pg3, c0pg32, c0pg33, c0pg34, c0pg35, c0pg36, c0pg37};
        LL = c0pg3Arr;
        LLILLJJLI = new C2254308sP(c0pg3Arr);
    }

    public static C0PG3[] values() {
        return (C0PG3[]) LL.clone();
    }

    public static C0PG3 valueOf(String str) {
        return (C0PG3) C08FF.LIZ(C0PG3.class, str);
    }

    public C0PG3(String str, int i) {
    }
}
