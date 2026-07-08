package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BYW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BYW {
    public static final C1BYW LL;
    public static final C1BYW LLILLJJLI;
    public static final C1BYW LLILLL;
    public static final C1BYW LLILZ;
    public static final /* synthetic */ C1BYW[] LLILZIL;

    static {
        C1BYW c1byw = new C1BYW("SCENE_BOOT", 0);
        LL = c1byw;
        C1BYW c1byw2 = new C1BYW("SCENE_LOGIN", 1);
        LLILLJJLI = c1byw2;
        C1BYW c1byw3 = new C1BYW("SCENE_SWITCH", 2);
        LLILLL = c1byw3;
        C1BYW c1byw4 = new C1BYW("SCENE_LOGOUT", 3);
        LLILZ = c1byw4;
        C1BYW[] c1bywArr = {c1byw, c1byw2, c1byw3, c1byw4};
        LLILZIL = c1bywArr;
        new C2254308sP(c1bywArr);
    }

    public static C1BYW[] values() {
        return (C1BYW[]) LLILZIL.clone();
    }

    public static C1BYW valueOf(String str) {
        return (C1BYW) C08FF.LIZ(C1BYW.class, str);
    }

    public C1BYW(String str, int i) {
    }
}
