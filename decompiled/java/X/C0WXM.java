package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WXM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXM {
    public static final C0WXM GAME_SERVER;
    public static final /* synthetic */ C0WXM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0WXM MINIS_SERVER;

    public static InterfaceC2044707zh<C0WXM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0WXM c0wxm = new C0WXM("MINIS_SERVER", 0);
        MINIS_SERVER = c0wxm;
        C0WXM c0wxm2 = new C0WXM("GAME_SERVER", 1);
        GAME_SERVER = c0wxm2;
        C0WXM[] c0wxmArr = {c0wxm, c0wxm2};
        LL = c0wxmArr;
        LLILLJJLI = new C2254308sP(c0wxmArr);
    }

    public static C0WXM[] values() {
        return (C0WXM[]) LL.clone();
    }

    public static C0WXM valueOf(String str) {
        return (C0WXM) C08FF.LIZ(C0WXM.class, str);
    }

    public C0WXM(String str, int i) {
    }
}
