package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VUC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUC {
    public static final /* synthetic */ C0VUC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0VUC SYSTEM;
    public static final C0VUC WCDB;

    public static InterfaceC2044707zh<C0VUC> getEntries() {
        return LLILLJJLI;
    }

    public static C0VUC valueOf(String str) {
        return (C0VUC) C08FF.LIZ(C0VUC.class, str);
    }

    public static C0VUC[] values() {
        return (C0VUC[]) LL.clone();
    }

    static {
        C0VUC c0vuc = new C0VUC("SYSTEM", 0);
        SYSTEM = c0vuc;
        C0VUC c0vuc2 = new C0VUC("WCDB", 1);
        WCDB = c0vuc2;
        C0VUC[] c0vucArr = {c0vuc, c0vuc2};
        LL = c0vucArr;
        LLILLJJLI = new C2254308sP(c0vucArr);
    }

    public C0VUC(String str, int i) {
    }
}
