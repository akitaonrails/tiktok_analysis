package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VVU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VVU {
    public static final C0VVU LINK;
    public static final /* synthetic */ C0VVU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0VVU SYSTEM;

    public static InterfaceC2044707zh<C0VVU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VVU c0vvu = new C0VVU("SYSTEM", 0);
        SYSTEM = c0vvu;
        C0VVU c0vvu2 = new C0VVU("LINK", 1);
        LINK = c0vvu2;
        C0VVU[] c0vvuArr = {c0vvu, c0vvu2};
        LL = c0vvuArr;
        LLILLJJLI = new C2254308sP(c0vvuArr);
    }

    public static C0VVU[] values() {
        return (C0VVU[]) LL.clone();
    }

    public static C0VVU valueOf(String str) {
        return (C0VVU) C08FF.LIZ(C0VVU.class, str);
    }

    public C0VVU(String str, int i) {
    }
}
