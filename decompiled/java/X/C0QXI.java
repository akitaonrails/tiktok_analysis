package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXI {
    public static final C0QXI FILL_STYLE;
    public static final C0QXI HINT_STYLE;
    public static final /* synthetic */ C0QXI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0QXI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QXI c0qxi = new C0QXI("HINT_STYLE", 0);
        HINT_STYLE = c0qxi;
        C0QXI c0qxi2 = new C0QXI("FILL_STYLE", 1);
        FILL_STYLE = c0qxi2;
        C0QXI[] c0qxiArr = {c0qxi, c0qxi2};
        LL = c0qxiArr;
        LLILLJJLI = new C2254308sP(c0qxiArr);
    }

    public static C0QXI[] values() {
        return (C0QXI[]) LL.clone();
    }

    public static C0QXI valueOf(String str) {
        return (C0QXI) C08FF.LIZ(C0QXI.class, str);
    }

    public C0QXI(String str, int i) {
    }
}
