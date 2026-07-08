package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016G, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016G {
    public static final C016G DIGITAL_0;
    public static final C016G DIGITAL_1;
    public static final /* synthetic */ C016G[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C016G> getEntries() {
        return LLILLL;
    }

    static {
        C016G c016g = new C016G("DIGITAL_0", 0, 0);
        DIGITAL_0 = c016g;
        C016G c016g2 = new C016G("DIGITAL_1", 1, 1);
        DIGITAL_1 = c016g2;
        C016G[] c016gArr = {c016g, c016g2};
        LLILLJJLI = c016gArr;
        LLILLL = new C2254308sP(c016gArr);
    }

    public static C016G[] values() {
        return (C016G[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C016G valueOf(String str) {
        return (C016G) C08FF.LIZ(C016G.class, str);
    }

    public C016G(String str, int i, int i2) {
        this.LL = i2;
    }
}
