package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FKC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FKC {
    public static final C0FKC EDITOR;
    public static final /* synthetic */ C0FKC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FKC NONE;
    public static final C0FKC ONLY_PANEL;

    public static InterfaceC2044707zh<C0FKC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FKC c0fkc = new C0FKC("NONE", 0);
        NONE = c0fkc;
        C0FKC c0fkc2 = new C0FKC("ONLY_PANEL", 1);
        ONLY_PANEL = c0fkc2;
        C0FKC c0fkc3 = new C0FKC("EDITOR", 2);
        EDITOR = c0fkc3;
        C0FKC[] c0fkcArr = {c0fkc, c0fkc2, c0fkc3};
        LL = c0fkcArr;
        LLILLJJLI = new C2254308sP(c0fkcArr);
    }

    public static C0FKC[] values() {
        return (C0FKC[]) LL.clone();
    }

    public static C0FKC valueOf(String str) {
        return (C0FKC) C08FF.LIZ(C0FKC.class, str);
    }

    public C0FKC(String str, int i) {
    }
}
