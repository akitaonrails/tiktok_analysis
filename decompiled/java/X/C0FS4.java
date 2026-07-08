package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FS4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FS4 {
    public static final C0FS4 ICON;
    public static final /* synthetic */ C0FS4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0FS4 TITLE;
    public final String LL;

    public static InterfaceC2044707zh<C0FS4> getEntries() {
        return LLILLL;
    }

    static {
        C0FS4 c0fs4 = new C0FS4("ICON", 0, "click_icon");
        ICON = c0fs4;
        C0FS4 c0fs42 = new C0FS4("TITLE", 1, "click_title");
        TITLE = c0fs42;
        C0FS4[] c0fs4Arr = {c0fs4, c0fs42};
        LLILLJJLI = c0fs4Arr;
        LLILLL = new C2254308sP(c0fs4Arr);
    }

    public static C0FS4[] values() {
        return (C0FS4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0FS4 valueOf(String str) {
        return (C0FS4) C08FF.LIZ(C0FS4.class, str);
    }

    public C0FS4(String str, int i, String str2) {
        this.LL = str2;
    }
}
