package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19I4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19I4 {
    public static final C19I4 AUTO;
    public static final /* synthetic */ C19I4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C19I4 OFF;
    public static final C19I4 TORCH;
    public final String LL;

    public static InterfaceC2044707zh<C19I4> getEntries() {
        return LLILLL;
    }

    static {
        C19I4 c19i4 = new C19I4("OFF", 0, "off");
        OFF = c19i4;
        C19I4 c19i42 = new C19I4("TORCH", 1, "torch");
        TORCH = c19i42;
        C19I4 c19i43 = new C19I4("AUTO", 2, "auto");
        AUTO = c19i43;
        C19I4[] c19i4Arr = {c19i4, c19i42, c19i43};
        LLILLJJLI = c19i4Arr;
        LLILLL = new C2254308sP(c19i4Arr);
    }

    public static C19I4[] values() {
        return (C19I4[]) LLILLJJLI.clone();
    }

    public final String getMode() {
        return this.LL;
    }

    public static C19I4 valueOf(String str) {
        return (C19I4) C08FF.LIZ(C19I4.class, str);
    }

    public C19I4(String str, int i, String str2) {
        this.LL = str2;
    }
}
