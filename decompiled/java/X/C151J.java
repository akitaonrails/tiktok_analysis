package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.151J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151J {
    public static final C151J DEFEAT_TIME;
    public static final C151J ENEMY_KILL;
    public static final C151J KILL_TIME;
    public static final /* synthetic */ C151J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C151J NON_KILL;
    public static final C151J NON_TIME;
    public static final C151J SELF_KILL;
    public static final C151J TEAMMATE_KILL;
    public static final C151J VICTORY_TIME;
    public final int LL;

    public static InterfaceC2044707zh<C151J> getEntries() {
        return LLILLL;
    }

    static {
        C151J c151j = new C151J("NON_KILL", 0, 0);
        NON_KILL = c151j;
        C151J c151j2 = new C151J("SELF_KILL", 1, 1);
        SELF_KILL = c151j2;
        C151J c151j3 = new C151J("TEAMMATE_KILL", 2, 2);
        TEAMMATE_KILL = c151j3;
        C151J c151j4 = new C151J("ENEMY_KILL", 3, 3);
        ENEMY_KILL = c151j4;
        C151J c151j5 = new C151J("NON_TIME", 4, 4);
        NON_TIME = c151j5;
        C151J c151j6 = new C151J("KILL_TIME", 5, 5);
        KILL_TIME = c151j6;
        C151J c151j7 = new C151J("VICTORY_TIME", 6, 6);
        VICTORY_TIME = c151j7;
        C151J c151j8 = new C151J("DEFEAT_TIME", 7, 7);
        DEFEAT_TIME = c151j8;
        C151J[] c151jArr = {c151j, c151j2, c151j3, c151j4, c151j5, c151j6, c151j7, c151j8};
        LLILLJJLI = c151jArr;
        LLILLL = new C2254308sP(c151jArr);
    }

    public static C151J[] values() {
        return (C151J[]) LLILLJJLI.clone();
    }

    public final int getIdx() {
        return this.LL;
    }

    public static C151J valueOf(String str) {
        return (C151J) C08FF.LIZ(C151J.class, str);
    }

    public C151J(String str, int i, int i2) {
        this.LL = i2;
    }
}
