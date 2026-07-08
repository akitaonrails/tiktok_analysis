package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKQ {
    public static final C0MKQ LL;
    public static final C0MKQ LLILLJJLI;
    public static final C0MKQ LLILLL;
    public static final C0MKQ LLILZ;
    public static final /* synthetic */ C0MKQ[] LLILZIL;

    static {
        C0MKQ c0mkq = new C0MKQ("DOWNLOADING", 0);
        LL = c0mkq;
        C0MKQ c0mkq2 = new C0MKQ("DONE", 1);
        LLILLJJLI = c0mkq2;
        C0MKQ c0mkq3 = new C0MKQ("FAILED", 2);
        LLILLL = c0mkq3;
        C0MKQ c0mkq4 = new C0MKQ("NOT_SUPPORTED", 3);
        LLILZ = c0mkq4;
        C0MKQ[] c0mkqArr = {c0mkq, c0mkq2, c0mkq3, c0mkq4};
        LLILZIL = c0mkqArr;
        new C2254308sP(c0mkqArr);
    }

    public static C0MKQ[] values() {
        return (C0MKQ[]) LLILZIL.clone();
    }

    public static C0MKQ valueOf(String str) {
        return (C0MKQ) C08FF.LIZ(C0MKQ.class, str);
    }

    public C0MKQ(String str, int i) {
    }
}
