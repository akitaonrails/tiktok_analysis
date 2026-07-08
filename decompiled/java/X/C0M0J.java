package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M0J, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M0J {
    public static final C0M0J AIGC;
    public static final C0M0J AI_PORTRAIT;
    public static final /* synthetic */ C0M0J[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0M0J TEMPLATE;

    public static InterfaceC2044707zh<C0M0J> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0M0J c0m0j = new C0M0J("TEMPLATE", 0);
        TEMPLATE = c0m0j;
        C0M0J c0m0j2 = new C0M0J("AIGC", 1);
        AIGC = c0m0j2;
        C0M0J c0m0j3 = new C0M0J("AI_PORTRAIT", 2);
        AI_PORTRAIT = c0m0j3;
        C0M0J[] c0m0jArr = {c0m0j, c0m0j2, c0m0j3};
        LL = c0m0jArr;
        LLILLJJLI = new C2254308sP(c0m0jArr);
    }

    public static C0M0J[] values() {
        return (C0M0J[]) LL.clone();
    }

    public static C0M0J valueOf(String str) {
        return (C0M0J) C08FF.LIZ(C0M0J.class, str);
    }

    public C0M0J(String str, int i) {
    }
}
