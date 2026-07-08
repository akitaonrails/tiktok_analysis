package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05LG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05LG {
    public static final C05LG GROUP_CHAT_PANEL;
    public static final /* synthetic */ C05LG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C05LG MORE_PANEL;

    public static InterfaceC2044707zh<C05LG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C05LG c05lg = new C05LG("MORE_PANEL", 0);
        MORE_PANEL = c05lg;
        C05LG c05lg2 = new C05LG("GROUP_CHAT_PANEL", 1);
        GROUP_CHAT_PANEL = c05lg2;
        C05LG[] c05lgArr = {c05lg, c05lg2};
        LL = c05lgArr;
        LLILLJJLI = new C2254308sP(c05lgArr);
    }

    public static C05LG[] values() {
        return (C05LG[]) LL.clone();
    }

    public static C05LG valueOf(String str) {
        return (C05LG) C08FF.LIZ(C05LG.class, str);
    }

    public C05LG(String str, int i) {
    }
}
