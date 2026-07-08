package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N4G, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4G {
    public static final C0N4G FAILED;
    public static final /* synthetic */ C0N4G[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N4G SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0N4G> getEntries() {
        return LLILLL;
    }

    static {
        C0N4G c0n4g = new C0N4G("SUCCESS", 0, 0);
        SUCCESS = c0n4g;
        C0N4G c0n4g2 = new C0N4G("FAILED", 1, -1);
        FAILED = c0n4g2;
        C0N4G[] c0n4gArr = {c0n4g, c0n4g2};
        LLILLJJLI = c0n4gArr;
        LLILLL = new C2254308sP(c0n4gArr);
    }

    public static C0N4G[] values() {
        return (C0N4G[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0N4G valueOf(String str) {
        return (C0N4G) C08FF.LIZ(C0N4G.class, str);
    }

    public C0N4G(String str, int i, int i2) {
        this.LL = i2;
    }
}
