package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03GQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GQ {
    public static final C03GQ IMAGE_LIST;
    public static final /* synthetic */ C03GQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03GQ WITH_BUTTON;
    public final int LL;

    public static InterfaceC2044707zh<C03GQ> getEntries() {
        return LLILLL;
    }

    static {
        C03GQ c03gq = new C03GQ("WITH_BUTTON", 0, 0);
        WITH_BUTTON = c03gq;
        C03GQ c03gq2 = new C03GQ("IMAGE_LIST", 1, 1);
        IMAGE_LIST = c03gq2;
        C03GQ[] c03gqArr = {c03gq, c03gq2};
        LLILLJJLI = c03gqArr;
        LLILLL = new C2254308sP(c03gqArr);
    }

    public static C03GQ[] values() {
        return (C03GQ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03GQ valueOf(String str) {
        return (C03GQ) C08FF.LIZ(C03GQ.class, str);
    }

    public C03GQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
