package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008C {
    public static final /* synthetic */ C008C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008C SPARK_FRAGMENT;
    public static final C008C SPARK_VIEW;
    public static final C008C TUX_SHEET;

    public static InterfaceC2044707zh<C008C> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008C c008c = new C008C("TUX_SHEET", 0);
        TUX_SHEET = c008c;
        C008C c008c2 = new C008C("SPARK_VIEW", 1);
        SPARK_VIEW = c008c2;
        C008C c008c3 = new C008C("SPARK_FRAGMENT", 2);
        SPARK_FRAGMENT = c008c3;
        C008C[] c008cArr = {c008c, c008c2, c008c3};
        LL = c008cArr;
        LLILLJJLI = new C2254308sP(c008cArr);
    }

    public static C008C[] values() {
        return (C008C[]) LL.clone();
    }

    public static C008C valueOf(String str) {
        return (C008C) C08FF.LIZ(C008C.class, str);
    }

    public C008C(String str, int i) {
    }
}
