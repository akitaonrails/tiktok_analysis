package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PQN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQN {
    public static final C0PQN EMPTY;
    public static final C0PQN HIT_CORE_TABLE;
    public static final C0PQN LIMIT;
    public static final /* synthetic */ C0PQN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PQN NEED_LOGIN;
    public static final C0PQN SENSITIVE;
    public final int LL;

    public static InterfaceC2044707zh<C0PQN> getEntries() {
        return LLILLL;
    }

    static {
        C0PQN c0pqn = new C0PQN("NEED_LOGIN", 0, 1);
        NEED_LOGIN = c0pqn;
        C0PQN c0pqn2 = new C0PQN("LIMIT", 1, 2);
        LIMIT = c0pqn2;
        C0PQN c0pqn3 = new C0PQN("EMPTY", 2, 3);
        EMPTY = c0pqn3;
        C0PQN c0pqn4 = new C0PQN("SENSITIVE", 3, 4);
        SENSITIVE = c0pqn4;
        C0PQN c0pqn5 = new C0PQN("HIT_CORE_TABLE", 4, 5);
        HIT_CORE_TABLE = c0pqn5;
        C0PQN[] c0pqnArr = {c0pqn, c0pqn2, c0pqn3, c0pqn4, c0pqn5};
        LLILLJJLI = c0pqnArr;
        LLILLL = new C2254308sP(c0pqnArr);
    }

    public static C0PQN[] values() {
        return (C0PQN[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0PQN valueOf(String str) {
        return (C0PQN) C08FF.LIZ(C0PQN.class, str);
    }

    public C0PQN(String str, int i, int i2) {
        this.LL = i2;
    }
}
