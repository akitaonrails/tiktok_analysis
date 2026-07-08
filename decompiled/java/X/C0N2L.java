package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2L {
    public static final C0N2L AFTER;
    public static final C0N2L BEFORE;
    public static final /* synthetic */ C0N2L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0N2L> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N2L c0n2l = new C0N2L("BEFORE", 0);
        BEFORE = c0n2l;
        C0N2L c0n2l2 = new C0N2L("AFTER", 1);
        AFTER = c0n2l2;
        C0N2L[] c0n2lArr = {c0n2l, c0n2l2};
        LL = c0n2lArr;
        LLILLJJLI = new C2254308sP(c0n2lArr);
    }

    public static C0N2L[] values() {
        return (C0N2L[]) LL.clone();
    }

    public static C0N2L valueOf(String str) {
        return (C0N2L) C08FF.LIZ(C0N2L.class, str);
    }

    public C0N2L(String str, int i) {
    }
}
