package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZAJ {
    public static final /* synthetic */ C0ZAJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZAJ ShowDefault;
    public static final C0ZAJ ShowDot;
    public static final C0ZAJ ShowNum;

    public static InterfaceC2044707zh<C0ZAJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZAJ c0zaj = new C0ZAJ("ShowDefault", 0);
        ShowDefault = c0zaj;
        C0ZAJ c0zaj2 = new C0ZAJ("ShowDot", 1);
        ShowDot = c0zaj2;
        C0ZAJ c0zaj3 = new C0ZAJ("ShowNum", 2);
        ShowNum = c0zaj3;
        C0ZAJ[] c0zajArr = {c0zaj, c0zaj2, c0zaj3};
        LL = c0zajArr;
        LLILLJJLI = new C2254308sP(c0zajArr);
    }

    public static C0ZAJ[] values() {
        return (C0ZAJ[]) LL.clone();
    }

    public static C0ZAJ valueOf(String str) {
        return (C0ZAJ) C08FF.LIZ(C0ZAJ.class, str);
    }

    public C0ZAJ(String str, int i) {
    }
}
