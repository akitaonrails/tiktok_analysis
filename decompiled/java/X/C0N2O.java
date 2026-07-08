package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2O {
    public static final /* synthetic */ C0N2O[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N2O REQUEST_END;
    public static final C0N2O REQUEST_START;

    public static InterfaceC2044707zh<C0N2O> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N2O c0n2o = new C0N2O("REQUEST_START", 0);
        REQUEST_START = c0n2o;
        C0N2O c0n2o2 = new C0N2O("REQUEST_END", 1);
        REQUEST_END = c0n2o2;
        C0N2O[] c0n2oArr = {c0n2o, c0n2o2};
        LL = c0n2oArr;
        LLILLJJLI = new C2254308sP(c0n2oArr);
    }

    public static C0N2O[] values() {
        return (C0N2O[]) LL.clone();
    }

    public static C0N2O valueOf(String str) {
        return (C0N2O) C08FF.LIZ(C0N2O.class, str);
    }

    public C0N2O(String str, int i) {
    }
}
