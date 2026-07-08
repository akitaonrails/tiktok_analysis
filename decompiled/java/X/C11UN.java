package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11UN, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UN {
    public static final C11UN FIRST;
    public static final C11UN LAST;
    public static final /* synthetic */ C11UN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C11UN MIDDLE;
    public static final C11UN ONLY;
    public final int LL;

    public static InterfaceC2044707zh<C11UN> getEntries() {
        return LLILLL;
    }

    static {
        C11UN c11un = new C11UN("MIDDLE", 0, 0);
        MIDDLE = c11un;
        C11UN c11un2 = new C11UN("FIRST", 1, 1);
        FIRST = c11un2;
        C11UN c11un3 = new C11UN("LAST", 2, 2);
        LAST = c11un3;
        C11UN c11un4 = new C11UN("ONLY", 3, 3);
        ONLY = c11un4;
        C11UN[] c11unArr = {c11un, c11un2, c11un3, c11un4};
        LLILLJJLI = c11unArr;
        LLILLL = new C2254308sP(c11unArr);
    }

    public static C11UN[] values() {
        return (C11UN[]) LLILLJJLI.clone();
    }

    public final int getPos() {
        return this.LL;
    }

    public static C11UN valueOf(String str) {
        return (C11UN) C08FF.LIZ(C11UN.class, str);
    }

    public C11UN(String str, int i, int i2) {
        this.LL = i2;
    }
}
