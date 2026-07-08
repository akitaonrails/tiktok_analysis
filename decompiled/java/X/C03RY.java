package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03RY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RY {
    public static final C03RY CLIENT_ERR;
    public static final /* synthetic */ C03RY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03RY RAW_DATA_ERR;
    public static final C03RY SUCC;

    public static InterfaceC2044707zh<C03RY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03RY c03ry = new C03RY("SUCC", 0);
        SUCC = c03ry;
        C03RY c03ry2 = new C03RY("RAW_DATA_ERR", 1);
        RAW_DATA_ERR = c03ry2;
        C03RY c03ry3 = new C03RY("CLIENT_ERR", 2);
        CLIENT_ERR = c03ry3;
        C03RY[] c03ryArr = {c03ry, c03ry2, c03ry3};
        LL = c03ryArr;
        LLILLJJLI = new C2254308sP(c03ryArr);
    }

    public static C03RY[] values() {
        return (C03RY[]) LL.clone();
    }

    public static C03RY valueOf(String str) {
        return (C03RY) C08FF.LIZ(C03RY.class, str);
    }

    public C03RY(String str, int i) {
    }
}
