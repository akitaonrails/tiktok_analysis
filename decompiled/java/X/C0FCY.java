package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FCY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FCY {
    public static final C0FCY HIDE;
    public static final C0FCY INITIAL;
    public static final /* synthetic */ C0FCY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FCY LOADING;
    public static final C0FCY NET_ERROR;

    public static InterfaceC2044707zh<C0FCY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FCY c0fcy = new C0FCY("INITIAL", 0);
        INITIAL = c0fcy;
        C0FCY c0fcy2 = new C0FCY("LOADING", 1);
        LOADING = c0fcy2;
        C0FCY c0fcy3 = new C0FCY("NET_ERROR", 2);
        NET_ERROR = c0fcy3;
        C0FCY c0fcy4 = new C0FCY("HIDE", 3);
        HIDE = c0fcy4;
        C0FCY[] c0fcyArr = {c0fcy, c0fcy2, c0fcy3, c0fcy4};
        LL = c0fcyArr;
        LLILLJJLI = new C2254308sP(c0fcyArr);
    }

    public static C0FCY[] values() {
        return (C0FCY[]) LL.clone();
    }

    public static C0FCY valueOf(String str) {
        return (C0FCY) C08FF.LIZ(C0FCY.class, str);
    }

    public C0FCY(String str, int i) {
    }
}
