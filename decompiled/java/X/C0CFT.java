package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CFT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFT {
    public static final C0CFT LL;
    public static final C0CFT LLILLJJLI;
    public static final /* synthetic */ C0CFT[] LLILLL;

    static {
        C0CFT c0cft = new C0CFT("NONE", 0);
        C0CFT c0cft2 = new C0CFT("FIRST", 1);
        LL = c0cft2;
        C0CFT c0cft3 = new C0CFT("THIRD", 2);
        LLILLJJLI = c0cft3;
        C0CFT[] c0cftArr = {c0cft, c0cft2, c0cft3};
        LLILLL = c0cftArr;
        new C2254308sP(c0cftArr);
    }

    public static C0CFT[] values() {
        return (C0CFT[]) LLILLL.clone();
    }

    public static C0CFT valueOf(String str) {
        return (C0CFT) C08FF.LIZ(C0CFT.class, str);
    }

    public C0CFT(String str, int i) {
    }
}
