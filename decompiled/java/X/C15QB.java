package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15QB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15QB {
    public static final C15QB LL;
    public static final C15QB LLILLJJLI;
    public static final C15QB LLILLL;
    public static final /* synthetic */ C15QB[] LLILZ;

    static {
        C15QB c15qb = new C15QB("NORMAL", 0);
        LL = c15qb;
        C15QB c15qb2 = new C15QB("MORE", 1);
        LLILLJJLI = c15qb2;
        C15QB c15qb3 = new C15QB("LESS", 2);
        LLILLL = c15qb3;
        C15QB[] c15qbArr = {c15qb, c15qb2, c15qb3};
        LLILZ = c15qbArr;
        new C2254308sP(c15qbArr);
    }

    public static C15QB[] values() {
        return (C15QB[]) LLILZ.clone();
    }

    public static C15QB valueOf(String str) {
        return (C15QB) C08FF.LIZ(C15QB.class, str);
    }

    public C15QB(String str, int i) {
    }
}
