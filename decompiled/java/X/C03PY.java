package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03PY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PY {
    public static final C03PY CLIENT_QUERY;
    public static final C03PY FE_QUERY;
    public static final /* synthetic */ C03PY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03PY POLL_ORDER;
    public final int LL;

    public static InterfaceC2044707zh<C03PY> getEntries() {
        return LLILLL;
    }

    static {
        C03PY c03py = new C03PY("CLIENT_QUERY", 0, 1);
        CLIENT_QUERY = c03py;
        C03PY c03py2 = new C03PY("FE_QUERY", 1, 2);
        FE_QUERY = c03py2;
        C03PY c03py3 = new C03PY("POLL_ORDER", 2, 3);
        POLL_ORDER = c03py3;
        C03PY[] c03pyArr = {c03py, c03py2, c03py3};
        LLILLJJLI = c03pyArr;
        LLILLL = new C2254308sP(c03pyArr);
    }

    public static C03PY[] values() {
        return (C03PY[]) LLILLJJLI.clone();
    }

    public final int getNum() {
        return this.LL;
    }

    public static C03PY valueOf(String str) {
        return (C03PY) C08FF.LIZ(C03PY.class, str);
    }

    public C03PY(String str, int i, int i2) {
        this.LL = i2;
    }
}
