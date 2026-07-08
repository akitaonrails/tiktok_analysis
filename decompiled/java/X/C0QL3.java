package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QL3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QL3 {
    public static final C0QL3 ECOM;
    public static final C0QL3 GENERAL;
    public static final /* synthetic */ C0QL3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0QL3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QL3 c0ql3 = new C0QL3("GENERAL", 0);
        GENERAL = c0ql3;
        C0QL3 c0ql32 = new C0QL3("ECOM", 1);
        ECOM = c0ql32;
        C0QL3[] c0ql3Arr = {c0ql3, c0ql32};
        LL = c0ql3Arr;
        LLILLJJLI = new C2254308sP(c0ql3Arr);
    }

    public static C0QL3[] values() {
        return (C0QL3[]) LL.clone();
    }

    public static C0QL3 valueOf(String str) {
        return (C0QL3) C08FF.LIZ(C0QL3.class, str);
    }

    public C0QL3(String str, int i) {
    }
}
