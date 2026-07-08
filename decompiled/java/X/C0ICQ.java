package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ICQ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICQ {
    public static final C0ICQ LLILLJJLI;
    public static final C0ICQ LLILLL;
    public static final /* synthetic */ C0ICQ[] LLILZ;
    public final int LL;

    static {
        C0ICQ c0icq = new C0ICQ("IMAGE", 0, 0);
        LLILLJJLI = c0icq;
        C0ICQ c0icq2 = new C0ICQ("ERROR", 1, 1);
        LLILLL = c0icq2;
        C0ICQ[] c0icqArr = {c0icq, c0icq2};
        LLILZ = c0icqArr;
        new C2254308sP(c0icqArr);
    }

    public static C0ICQ[] values() {
        return (C0ICQ[]) LLILZ.clone();
    }

    public static C0ICQ valueOf(String str) {
        return (C0ICQ) C08FF.LIZ(C0ICQ.class, str);
    }

    public C0ICQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
