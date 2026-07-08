package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCP {
    public static final /* synthetic */ C0NCP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NCP VIEW_GONE;
    public static final C0NCP VIEW_VISIBLE;
    public final String LL;

    public static InterfaceC2044707zh<C0NCP> getEntries() {
        return LLILLL;
    }

    static {
        C0NCP c0ncp = new C0NCP("VIEW_GONE", 0, "view_gone");
        VIEW_GONE = c0ncp;
        C0NCP c0ncp2 = new C0NCP("VIEW_VISIBLE", 1, "view_visible");
        VIEW_VISIBLE = c0ncp2;
        C0NCP[] c0ncpArr = {c0ncp, c0ncp2};
        LLILLJJLI = c0ncpArr;
        LLILLL = new C2254308sP(c0ncpArr);
    }

    public static C0NCP[] values() {
        return (C0NCP[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0NCP valueOf(String str) {
        return (C0NCP) C08FF.LIZ(C0NCP.class, str);
    }

    public C0NCP(String str, int i, String str2) {
        this.LL = str2;
    }
}
