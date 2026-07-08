package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056Q {
    public static final /* synthetic */ C056Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C056Q SCROLLED;
    public static final C056Q UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C056Q> getEntries() {
        return LLILLL;
    }

    static {
        C056Q c056q = new C056Q("UNKNOWN", 0, 0);
        UNKNOWN = c056q;
        C056Q c056q2 = new C056Q("SCROLLED", 1, 1);
        SCROLLED = c056q2;
        C056Q[] c056qArr = {c056q, c056q2};
        LLILLJJLI = c056qArr;
        LLILLL = new C2254308sP(c056qArr);
    }

    public static C056Q[] values() {
        return (C056Q[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C056Q valueOf(String str) {
        return (C056Q) C08FF.LIZ(C056Q.class, str);
    }

    public C056Q(String str, int i, int i2) {
        this.LL = i2;
    }
}
