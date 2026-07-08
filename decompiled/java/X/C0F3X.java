package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F3X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F3X {
    public static final C0F3X FAIL;
    public static final /* synthetic */ C0F3X[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0F3X SUCCESS;
    public static final C0F3X TAKING;

    public static InterfaceC2044707zh<C0F3X> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0F3X c0f3x = new C0F3X("SUCCESS", 0);
        SUCCESS = c0f3x;
        C0F3X c0f3x2 = new C0F3X("FAIL", 1);
        FAIL = c0f3x2;
        C0F3X c0f3x3 = new C0F3X("TAKING", 2);
        TAKING = c0f3x3;
        C0F3X[] c0f3xArr = {c0f3x, c0f3x2, c0f3x3};
        LL = c0f3xArr;
        LLILLJJLI = new C2254308sP(c0f3xArr);
    }

    public static C0F3X[] values() {
        return (C0F3X[]) LL.clone();
    }

    public static C0F3X valueOf(String str) {
        return (C0F3X) C08FF.LIZ(C0F3X.class, str);
    }

    public C0F3X(String str, int i) {
    }
}
