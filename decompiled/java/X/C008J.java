package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008J {
    public static final C008J INIT_FRIENDS_2TAB_ASSEM;
    public static final /* synthetic */ C008J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "init_friends_2tab_assem";

    public static InterfaceC2044707zh<C008J> getEntries() {
        return LLILLL;
    }

    static {
        C008J c008j = new C008J();
        INIT_FRIENDS_2TAB_ASSEM = c008j;
        C008J[] c008jArr = {c008j};
        LLILLJJLI = c008jArr;
        LLILLL = new C2254308sP(c008jArr);
    }

    public static C008J[] values() {
        return (C008J[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C008J valueOf(String str) {
        return (C008J) C08FF.LIZ(C008J.class, str);
    }
}
