package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QS4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QS4 {
    public static final /* synthetic */ C0QS4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QS4 TAKO_BUTTON;
    public static final C0QS4 VOICE_BUTTON;
    public final String LL;

    public static InterfaceC2044707zh<C0QS4> getEntries() {
        return LLILLL;
    }

    static {
        C0QS4 c0qs4 = new C0QS4("VOICE_BUTTON", 0, "voice_button");
        VOICE_BUTTON = c0qs4;
        C0QS4 c0qs42 = new C0QS4("TAKO_BUTTON", 1, "keyboard_above_icon");
        TAKO_BUTTON = c0qs42;
        C0QS4[] c0qs4Arr = {c0qs4, c0qs42};
        LLILLJJLI = c0qs4Arr;
        LLILLL = new C2254308sP(c0qs4Arr);
    }

    public static C0QS4[] values() {
        return (C0QS4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0QS4 valueOf(String str) {
        return (C0QS4) C08FF.LIZ(C0QS4.class, str);
    }

    public C0QS4(String str, int i, String str2) {
        this.LL = str2;
    }
}
