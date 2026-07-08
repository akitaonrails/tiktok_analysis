package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.043P, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043P {
    public static final C043P DISABLE;
    public static final C043P ENABLE;
    public static final /* synthetic */ C043P[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C043P> getEntries() {
        return LLILLL;
    }

    static {
        C043P c043p = new C043P("ENABLE", 0, 1);
        ENABLE = c043p;
        C043P c043p2 = new C043P("DISABLE", 1, 2);
        DISABLE = c043p2;
        C043P[] c043pArr = {c043p, c043p2};
        LLILLJJLI = c043pArr;
        LLILLL = new C2254308sP(c043pArr);
    }

    public static C043P[] values() {
        return (C043P[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C043P valueOf(String str) {
        return (C043P) C08FF.LIZ(C043P.class, str);
    }

    public C043P(String str, int i, int i2) {
        this.LL = i2;
    }
}
