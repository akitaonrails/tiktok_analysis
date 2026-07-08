package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LXI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LXI {
    public static final C0LXI CAMEO_ID;
    public static final C0LXI IMAGE;
    public static final /* synthetic */ C0LXI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LXI TEXT;
    public final String LL;

    public static InterfaceC2044707zh<C0LXI> getEntries() {
        return LLILLL;
    }

    static {
        C0LXI c0lxi = new C0LXI("TEXT", 0, "text");
        TEXT = c0lxi;
        C0LXI c0lxi2 = new C0LXI("CAMEO_ID", 1, "cameo_id");
        CAMEO_ID = c0lxi2;
        C0LXI c0lxi3 = new C0LXI("IMAGE", 2, "image");
        IMAGE = c0lxi3;
        C0LXI[] c0lxiArr = {c0lxi, c0lxi2, c0lxi3};
        LLILLJJLI = c0lxiArr;
        LLILLL = new C2254308sP(c0lxiArr);
    }

    public static C0LXI[] values() {
        return (C0LXI[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0LXI valueOf(String str) {
        return (C0LXI) C08FF.LIZ(C0LXI.class, str);
    }

    public C0LXI(String str, int i, String str2) {
        this.LL = str2;
    }
}
