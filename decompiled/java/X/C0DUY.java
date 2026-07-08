package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DUY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DUY {
    public static final /* synthetic */ C0DUY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DUY NONE;
    public static final C0DUY SELECTED;
    public static final C0DUY UNSELECTED;

    public static InterfaceC2044707zh<C0DUY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DUY c0duy = new C0DUY("NONE", 0);
        NONE = c0duy;
        C0DUY c0duy2 = new C0DUY("SELECTED", 1);
        SELECTED = c0duy2;
        C0DUY c0duy3 = new C0DUY("UNSELECTED", 2);
        UNSELECTED = c0duy3;
        C0DUY[] c0duyArr = {c0duy, c0duy2, c0duy3};
        LL = c0duyArr;
        LLILLJJLI = new C2254308sP(c0duyArr);
    }

    public static C0DUY[] values() {
        return (C0DUY[]) LL.clone();
    }

    public static C0DUY valueOf(String str) {
        return (C0DUY) C08FF.LIZ(C0DUY.class, str);
    }

    public C0DUY(String str, int i) {
    }
}
