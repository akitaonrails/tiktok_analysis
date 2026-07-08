package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OBW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBW {
    public static final C0OBW HIDDEN;
    public static final /* synthetic */ C0OBW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OBW SHOWN;

    public static InterfaceC2044707zh<C0OBW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OBW c0obw = new C0OBW("SHOWN", 0);
        SHOWN = c0obw;
        C0OBW c0obw2 = new C0OBW("HIDDEN", 1);
        HIDDEN = c0obw2;
        C0OBW[] c0obwArr = {c0obw, c0obw2};
        LL = c0obwArr;
        LLILLJJLI = new C2254308sP(c0obwArr);
    }

    public static C0OBW[] values() {
        return (C0OBW[]) LL.clone();
    }

    public static C0OBW valueOf(String str) {
        return (C0OBW) C08FF.LIZ(C0OBW.class, str);
    }

    public C0OBW(String str, int i) {
    }
}
