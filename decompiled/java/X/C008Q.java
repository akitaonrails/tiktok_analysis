package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008Q {
    public static final C008Q GAME_EFFECT;
    public static final /* synthetic */ C008Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C008Q MINI_GAME;
    public final int LL;

    public static InterfaceC2044707zh<C008Q> getEntries() {
        return LLILLL;
    }

    static {
        C008Q c008q = new C008Q("MINI_GAME", 0, 1);
        MINI_GAME = c008q;
        C008Q c008q2 = new C008Q("GAME_EFFECT", 1, 2);
        GAME_EFFECT = c008q2;
        C008Q[] c008qArr = {c008q, c008q2};
        LLILLJJLI = c008qArr;
        LLILLL = new C2254308sP(c008qArr);
    }

    public static C008Q[] values() {
        return (C008Q[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C008Q valueOf(String str) {
        return (C008Q) C08FF.LIZ(C008Q.class, str);
    }

    public C008Q(String str, int i, int i2) {
        this.LL = i2;
    }
}
