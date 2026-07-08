package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.019G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C019G {
    public static final C019G DRAW;
    public static final C019G LEFT_MEMBER_WIN;
    public static final /* synthetic */ C019G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C019G RIGHT_MEMBER_WIN;

    public static InterfaceC2044707zh<C019G> getEntries() {
        return LLILLJJLI;
    }

    static {
        C019G c019g = new C019G("LEFT_MEMBER_WIN", 0);
        LEFT_MEMBER_WIN = c019g;
        C019G c019g2 = new C019G("RIGHT_MEMBER_WIN", 1);
        RIGHT_MEMBER_WIN = c019g2;
        C019G c019g3 = new C019G("DRAW", 2);
        DRAW = c019g3;
        C019G[] c019gArr = {c019g, c019g2, c019g3};
        LL = c019gArr;
        LLILLJJLI = new C2254308sP(c019gArr);
    }

    public static C019G[] values() {
        return (C019G[]) LL.clone();
    }

    public static C019G valueOf(String str) {
        return (C019G) C08FF.LIZ(C019G.class, str);
    }

    public C019G(String str, int i) {
    }
}
