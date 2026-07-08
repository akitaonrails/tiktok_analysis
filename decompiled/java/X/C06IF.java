package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06IF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06IF {
    public static final C06IF LARGE;
    public static final /* synthetic */ C06IF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06IF NONE;
    public static final C06IF SMALL;

    public static InterfaceC2044707zh<C06IF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06IF c06if = new C06IF("NONE", 0);
        NONE = c06if;
        C06IF c06if2 = new C06IF("SMALL", 1);
        SMALL = c06if2;
        C06IF c06if3 = new C06IF("LARGE", 2);
        LARGE = c06if3;
        C06IF[] c06ifArr = {c06if, c06if2, c06if3};
        LL = c06ifArr;
        LLILLJJLI = new C2254308sP(c06ifArr);
    }

    public static C06IF[] values() {
        return (C06IF[]) LL.clone();
    }

    public static C06IF valueOf(String str) {
        return (C06IF) C08FF.LIZ(C06IF.class, str);
    }

    public C06IF(String str, int i) {
    }
}
