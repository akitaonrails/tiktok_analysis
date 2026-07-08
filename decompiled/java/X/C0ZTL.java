package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZTL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZTL {
    public static final C0ZTL AI_GROUP_SHOT;
    public static final C0ZTL GAME_CHALLENGE;
    public static final /* synthetic */ C0ZTL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0ZTL> getEntries() {
        return LLILLL;
    }

    static {
        C0ZTL c0ztl = new C0ZTL("AI_GROUP_SHOT", 0, "ai_group_shot");
        AI_GROUP_SHOT = c0ztl;
        C0ZTL c0ztl2 = new C0ZTL("GAME_CHALLENGE", 1, "game_challenge");
        GAME_CHALLENGE = c0ztl2;
        C0ZTL[] c0ztlArr = {c0ztl, c0ztl2};
        LLILLJJLI = c0ztlArr;
        LLILLL = new C2254308sP(c0ztlArr);
    }

    public static C0ZTL[] values() {
        return (C0ZTL[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static C0ZTL valueOf(String str) {
        return (C0ZTL) C08FF.LIZ(C0ZTL.class, str);
    }

    public C0ZTL(String str, int i, String str2) {
        this.LL = str2;
    }
}
