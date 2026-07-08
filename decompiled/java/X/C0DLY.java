package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DLY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DLY {
    public static final C0DLY APPEND;
    public static final C0DLY COMPLETE_CHANGE;
    public static final C0DLY IDENTICAL;
    public static final /* synthetic */ C0DLY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DLY TAIL_REPLACE;

    public static InterfaceC2044707zh<C0DLY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DLY c0dly = new C0DLY("IDENTICAL", 0);
        IDENTICAL = c0dly;
        C0DLY c0dly2 = new C0DLY("APPEND", 1);
        APPEND = c0dly2;
        C0DLY c0dly3 = new C0DLY("TAIL_REPLACE", 2);
        TAIL_REPLACE = c0dly3;
        C0DLY c0dly4 = new C0DLY("COMPLETE_CHANGE", 3);
        COMPLETE_CHANGE = c0dly4;
        C0DLY[] c0dlyArr = {c0dly, c0dly2, c0dly3, c0dly4};
        LL = c0dlyArr;
        LLILLJJLI = new C2254308sP(c0dlyArr);
    }

    public static C0DLY[] values() {
        return (C0DLY[]) LL.clone();
    }

    public static C0DLY valueOf(String str) {
        return (C0DLY) C08FF.LIZ(C0DLY.class, str);
    }

    public C0DLY(String str, int i) {
    }
}
