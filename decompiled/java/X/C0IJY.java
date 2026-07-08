package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IJY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJY {
    public static final C0IJY LL;
    public static final C0IJY LLILLJJLI;
    public static final /* synthetic */ C0IJY[] LLILLL;

    static {
        C0IJY c0ijy = new C0IJY("SHOWN", 0);
        LL = c0ijy;
        C0IJY c0ijy2 = new C0IJY("DISMISSED", 1);
        LLILLJJLI = c0ijy2;
        C0IJY[] c0ijyArr = {c0ijy, c0ijy2};
        LLILLL = c0ijyArr;
        new C2254308sP(c0ijyArr);
    }

    public static C0IJY[] values() {
        return (C0IJY[]) LLILLL.clone();
    }

    public static C0IJY valueOf(String str) {
        return (C0IJY) C08FF.LIZ(C0IJY.class, str);
    }

    public C0IJY(String str, int i) {
    }
}
