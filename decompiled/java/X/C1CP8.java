package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1CP8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CP8 {
    public static final C1CP8 FADEOUT_ENDED;
    public static final C1CP8 IDLE;
    public static final C1CP8 INITIALIZED;
    public static final /* synthetic */ C1CP8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1CP8 LOOP_PAUSED;
    public static final C1CP8 RUNNING;
    public static final C1CP8 UNINITIALIZED;

    public static InterfaceC2044707zh<C1CP8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1CP8 c1cp8 = new C1CP8("UNINITIALIZED", 0);
        UNINITIALIZED = c1cp8;
        C1CP8 c1cp82 = new C1CP8("IDLE", 1);
        IDLE = c1cp82;
        C1CP8 c1cp83 = new C1CP8("INITIALIZED", 2);
        INITIALIZED = c1cp83;
        C1CP8 c1cp84 = new C1CP8("FADEOUT_ENDED", 3);
        FADEOUT_ENDED = c1cp84;
        C1CP8 c1cp85 = new C1CP8("LOOP_PAUSED", 4);
        LOOP_PAUSED = c1cp85;
        C1CP8 c1cp86 = new C1CP8("RUNNING", 5);
        RUNNING = c1cp86;
        C1CP8[] c1cp8Arr = {c1cp8, c1cp82, c1cp83, c1cp84, c1cp85, c1cp86};
        LL = c1cp8Arr;
        LLILLJJLI = new C2254308sP(c1cp8Arr);
    }

    public static C1CP8[] values() {
        return (C1CP8[]) LL.clone();
    }

    public static C1CP8 valueOf(String str) {
        return (C1CP8) C08FF.LIZ(C1CP8.class, str);
    }

    public final boolean isAtLeast(C1CP8 c1cp8) {
        if (compareTo(c1cp8) >= 0) {
            return true;
        }
        return false;
    }

    public C1CP8(String str, int i) {
    }
}
