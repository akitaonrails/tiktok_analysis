package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12CP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CP {
    public static final C12CP BOTTOM;
    public static final /* synthetic */ C12CP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C12CP TOP;

    public static InterfaceC2044707zh<C12CP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C12CP c12cp = new C12CP("TOP", 0);
        TOP = c12cp;
        C12CP c12cp2 = new C12CP("BOTTOM", 1);
        BOTTOM = c12cp2;
        C12CP[] c12cpArr = {c12cp, c12cp2};
        LL = c12cpArr;
        LLILLJJLI = new C2254308sP(c12cpArr);
    }

    public static C12CP[] values() {
        return (C12CP[]) LL.clone();
    }

    public static C12CP valueOf(String str) {
        return (C12CP) C08FF.LIZ(C12CP.class, str);
    }

    public C12CP(String str, int i) {
    }
}
