package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H1G, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1G {
    public static final /* synthetic */ C0H1G[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0H1G NEW;
    public static final C0H1G OLD;
    public final int LL;

    public static InterfaceC2044707zh<C0H1G> getEntries() {
        return LLILLL;
    }

    static {
        C0H1G c0h1g = new C0H1G("OLD", 0, 0);
        OLD = c0h1g;
        C0H1G c0h1g2 = new C0H1G("NEW", 1, 1);
        NEW = c0h1g2;
        C0H1G[] c0h1gArr = {c0h1g, c0h1g2};
        LLILLJJLI = c0h1gArr;
        LLILLL = new C2254308sP(c0h1gArr);
    }

    public static C0H1G[] values() {
        return (C0H1G[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0H1G valueOf(String str) {
        return (C0H1G) C08FF.LIZ(C0H1G.class, str);
    }

    public C0H1G(String str, int i, int i2) {
        this.LL = i2;
    }
}
