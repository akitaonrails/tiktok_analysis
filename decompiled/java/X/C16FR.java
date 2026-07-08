package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.16FR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16FR {
    public static final /* synthetic */ C16FR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C16FR LOADING;
    public static final C16FR LOADING_FAIL;
    public static final C16FR LOADING_SUCCESS;
    public static final C16FR RETRY;

    public static InterfaceC2044707zh<C16FR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C16FR c16fr = new C16FR("LOADING", 0);
        LOADING = c16fr;
        C16FR c16fr2 = new C16FR("LOADING_FAIL", 1);
        LOADING_FAIL = c16fr2;
        C16FR c16fr3 = new C16FR("LOADING_SUCCESS", 2);
        LOADING_SUCCESS = c16fr3;
        C16FR c16fr4 = new C16FR("RETRY", 3);
        RETRY = c16fr4;
        C16FR[] c16frArr = {c16fr, c16fr2, c16fr3, c16fr4};
        LL = c16frArr;
        LLILLJJLI = new C2254308sP(c16frArr);
    }

    public static C16FR[] values() {
        return (C16FR[]) LL.clone();
    }

    public static C16FR valueOf(String str) {
        return (C16FR) C08FF.LIZ(C16FR.class, str);
    }

    public C16FR(String str, int i) {
    }
}
