package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03XW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XW {
    public static final /* synthetic */ C03XW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03XW ON_CLOSE;
    public static final C03XW ON_TOAST;

    public static InterfaceC2044707zh<C03XW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03XW c03xw = new C03XW("ON_CLOSE", 0);
        ON_CLOSE = c03xw;
        C03XW c03xw2 = new C03XW("ON_TOAST", 1);
        ON_TOAST = c03xw2;
        C03XW[] c03xwArr = {c03xw, c03xw2};
        LL = c03xwArr;
        LLILLJJLI = new C2254308sP(c03xwArr);
    }

    public static C03XW[] values() {
        return (C03XW[]) LL.clone();
    }

    public static C03XW valueOf(String str) {
        return (C03XW) C08FF.LIZ(C03XW.class, str);
    }

    public C03XW(String str, int i) {
    }
}
