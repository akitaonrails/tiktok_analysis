package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0R0B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0B {
    public static final C0R0B CLICK_CLOSE;
    public static final C0R0B CLICK_INSPIRATION_HALF_PAGE;
    public static final C0R0B CLICK_SHOOT;
    public static final /* synthetic */ C0R0B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0R0B> getEntries() {
        return LLILLL;
    }

    static {
        C0R0B c0r0b = new C0R0B("CLICK_INSPIRATION_HALF_PAGE", 0, "click_inspiration_halfpage");
        CLICK_INSPIRATION_HALF_PAGE = c0r0b;
        C0R0B c0r0b2 = new C0R0B("CLICK_SHOOT", 1, "click_shoot");
        CLICK_SHOOT = c0r0b2;
        C0R0B c0r0b3 = new C0R0B("CLICK_CLOSE", 2, "click_close");
        CLICK_CLOSE = c0r0b3;
        C0R0B[] c0r0bArr = {c0r0b, c0r0b2, c0r0b3};
        LLILLJJLI = c0r0bArr;
        LLILLL = new C2254308sP(c0r0bArr);
    }

    public static C0R0B[] values() {
        return (C0R0B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0R0B valueOf(String str) {
        return (C0R0B) C08FF.LIZ(C0R0B.class, str);
    }

    public C0R0B(String str, int i, String str2) {
        this.LL = str2;
    }
}
