package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EKQ {
    public static final C0EKQ EDIT;
    public static final C0EKQ EDITOR_PRO;
    public static final /* synthetic */ C0EKQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0EKQ> getEntries() {
        return LLILLL;
    }

    static {
        C0EKQ c0ekq = new C0EKQ("EDIT", 0, 0);
        EDIT = c0ekq;
        C0EKQ c0ekq2 = new C0EKQ("EDITOR_PRO", 1, 1);
        EDITOR_PRO = c0ekq2;
        C0EKQ[] c0ekqArr = {c0ekq, c0ekq2};
        LLILLJJLI = c0ekqArr;
        LLILLL = new C2254308sP(c0ekqArr);
    }

    public static C0EKQ[] values() {
        return (C0EKQ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0EKQ valueOf(String str) {
        return (C0EKQ) C08FF.LIZ(C0EKQ.class, str);
    }

    public C0EKQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
