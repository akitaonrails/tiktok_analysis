package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZBL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBL {
    public static final C0ZBL HORIZONTAL;
    public static final C0ZBL HORIZONTAL_NEW;
    public static final /* synthetic */ C0ZBL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZBL VERTICAL;
    public static final C0ZBL VERTICAL_NEW;

    public static InterfaceC2044707zh<C0ZBL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZBL c0zbl = new C0ZBL("HORIZONTAL", 0);
        HORIZONTAL = c0zbl;
        C0ZBL c0zbl2 = new C0ZBL("VERTICAL", 1);
        VERTICAL = c0zbl2;
        C0ZBL c0zbl3 = new C0ZBL("HORIZONTAL_NEW", 2);
        HORIZONTAL_NEW = c0zbl3;
        C0ZBL c0zbl4 = new C0ZBL("VERTICAL_NEW", 3);
        VERTICAL_NEW = c0zbl4;
        C0ZBL[] c0zblArr = {c0zbl, c0zbl2, c0zbl3, c0zbl4};
        LL = c0zblArr;
        LLILLJJLI = new C2254308sP(c0zblArr);
    }

    public static C0ZBL[] values() {
        return (C0ZBL[]) LL.clone();
    }

    public static C0ZBL valueOf(String str) {
        return (C0ZBL) C08FF.LIZ(C0ZBL.class, str);
    }

    public C0ZBL(String str, int i) {
    }
}
