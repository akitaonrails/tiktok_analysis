package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CFM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFM {
    public static final C0CFM FIRST;
    public static final C0CFM LAST;
    public static final /* synthetic */ C0CFM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CFM NONE;

    public static InterfaceC2044707zh<C0CFM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CFM c0cfm = new C0CFM("FIRST", 0);
        FIRST = c0cfm;
        C0CFM c0cfm2 = new C0CFM("LAST", 1);
        LAST = c0cfm2;
        C0CFM c0cfm3 = new C0CFM("NONE", 2);
        NONE = c0cfm3;
        C0CFM[] c0cfmArr = {c0cfm, c0cfm2, c0cfm3};
        LL = c0cfmArr;
        LLILLJJLI = new C2254308sP(c0cfmArr);
    }

    public static C0CFM[] values() {
        return (C0CFM[]) LL.clone();
    }

    public static C0CFM valueOf(String str) {
        return (C0CFM) C08FF.LIZ(C0CFM.class, str);
    }

    public C0CFM(String str, int i) {
    }
}
