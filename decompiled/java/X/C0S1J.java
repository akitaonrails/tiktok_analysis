package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S1J, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1J {
    public static final C0S1J CLICK;
    public static final C0S1J HEAD_ICON;
    public static final /* synthetic */ C0S1J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0S1J SLIDE_UP;
    public final String LL;

    public static InterfaceC2044707zh<C0S1J> getEntries() {
        return LLILLL;
    }

    static {
        C0S1J c0s1j = new C0S1J("CLICK", 0, "click_input_box");
        CLICK = c0s1j;
        C0S1J c0s1j2 = new C0S1J("SLIDE_UP", 1, "slide_up");
        SLIDE_UP = c0s1j2;
        C0S1J c0s1j3 = new C0S1J("HEAD_ICON", 2, "head_icon");
        HEAD_ICON = c0s1j3;
        C0S1J[] c0s1jArr = {c0s1j, c0s1j2, c0s1j3};
        LLILLJJLI = c0s1jArr;
        LLILLL = new C2254308sP(c0s1jArr);
    }

    public static C0S1J[] values() {
        return (C0S1J[]) LLILLJJLI.clone();
    }

    public final String getText() {
        return this.LL;
    }

    public static C0S1J valueOf(String str) {
        return (C0S1J) C08FF.LIZ(C0S1J.class, str);
    }

    public C0S1J(String str, int i, String str2) {
        this.LL = str2;
    }
}
