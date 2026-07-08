package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CS {
    public static final AnonymousClass0324 Companion;
    public static final C03CS DOUBLE_LINE;
    public static final /* synthetic */ C03CS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03CS SINGLE_LINE;
    public static final C03CS UNDEFINED;
    public final int LL;

    public static InterfaceC2044707zh<C03CS> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0324] */
    static {
        C03CS c03cs = new C03CS("UNDEFINED", 0, -1);
        UNDEFINED = c03cs;
        C03CS c03cs2 = new C03CS("SINGLE_LINE", 1, 0);
        SINGLE_LINE = c03cs2;
        C03CS c03cs3 = new C03CS("DOUBLE_LINE", 2, 1);
        DOUBLE_LINE = c03cs3;
        C03CS[] c03csArr = {c03cs, c03cs2, c03cs3};
        LLILLJJLI = c03csArr;
        LLILLL = new C2254308sP(c03csArr);
        Companion = new Object() { // from class: X.0324
        };
    }

    public static C03CS[] values() {
        return (C03CS[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03CS valueOf(String str) {
        return (C03CS) C08FF.LIZ(C03CS.class, str);
    }

    public C03CS(String str, int i, int i2) {
        this.LL = i2;
    }
}
