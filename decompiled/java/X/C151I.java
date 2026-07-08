package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.151I, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151I {
    public static final C151I DEFEAT_TIME;
    public static final C151I ENEMY_KILL;
    public static final /* synthetic */ C151I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C151I NON_TIME;
    public static final C151I SELF_KILL;
    public static final C151I TEAMMATE_KILL;
    public static final C151I VICTORY_TIME;
    public final int LL;

    public static InterfaceC2044707zh<C151I> getEntries() {
        return LLILLL;
    }

    static {
        C151I c151i = new C151I("NON_TIME", 0, 0);
        NON_TIME = c151i;
        C151I c151i2 = new C151I("SELF_KILL", 1, 1);
        SELF_KILL = c151i2;
        C151I c151i3 = new C151I("TEAMMATE_KILL", 2, 2);
        TEAMMATE_KILL = c151i3;
        C151I c151i4 = new C151I("ENEMY_KILL", 3, 3);
        ENEMY_KILL = c151i4;
        C151I c151i5 = new C151I("VICTORY_TIME", 4, 4);
        VICTORY_TIME = c151i5;
        C151I c151i6 = new C151I("DEFEAT_TIME", 5, 5);
        DEFEAT_TIME = c151i6;
        C151I[] c151iArr = {c151i, c151i2, c151i3, c151i4, c151i5, c151i6};
        LLILLJJLI = c151iArr;
        LLILLL = new C2254308sP(c151iArr);
    }

    public static C151I[] values() {
        return (C151I[]) LLILLJJLI.clone();
    }

    public final int getIdx() {
        return this.LL;
    }

    public static C151I valueOf(String str) {
        return (C151I) C08FF.LIZ(C151I.class, str);
    }

    public C151I(String str, int i, int i2) {
        this.LL = i2;
    }
}
