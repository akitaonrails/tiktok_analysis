package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.014B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C014B {
    public static final C014B CLICK_SUBTITLE;
    public static final /* synthetic */ C014B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C014B LONG_PRESS;
    public static final C014B SHARE_PANEL;
    public final String LL;

    public static InterfaceC2044707zh<C014B> getEntries() {
        return LLILLL;
    }

    static {
        C014B c014b = new C014B("CLICK_SUBTITLE", 0, "click_subtitle");
        CLICK_SUBTITLE = c014b;
        C014B c014b2 = new C014B("LONG_PRESS", 1, "long_press");
        LONG_PRESS = c014b2;
        C014B c014b3 = new C014B("SHARE_PANEL", 2, "share_panel");
        SHARE_PANEL = c014b3;
        C014B[] c014bArr = {c014b, c014b2, c014b3};
        LLILLJJLI = c014bArr;
        LLILLL = new C2254308sP(c014bArr);
    }

    public static C014B[] values() {
        return (C014B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C014B valueOf(String str) {
        return (C014B) C08FF.LIZ(C014B.class, str);
    }

    public C014B(String str, int i, String str2) {
        this.LL = str2;
    }
}
