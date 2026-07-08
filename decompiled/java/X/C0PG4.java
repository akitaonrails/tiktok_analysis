package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG4 {
    public static final C0PG4 BANNER;
    public static final C0PG4 CORRECT;
    public static final C0PG4 ENTITY;
    public static final C0PG4 FILTER;
    public static final /* synthetic */ C0PG4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PG4 SPECIFIC_CARD_FIRST;
    public static final C0PG4 UNDEFINE;
    public final int LL;

    public static InterfaceC2044707zh<C0PG4> getEntries() {
        return LLILLL;
    }

    static {
        C0PG4 c0pg4 = new C0PG4("UNDEFINE", 0, 0);
        UNDEFINE = c0pg4;
        C0PG4 c0pg42 = new C0PG4("SPECIFIC_CARD_FIRST", 1, 1);
        SPECIFIC_CARD_FIRST = c0pg42;
        C0PG4 c0pg43 = new C0PG4("BANNER", 2, 2);
        BANNER = c0pg43;
        C0PG4 c0pg44 = new C0PG4("ENTITY", 3, 3);
        ENTITY = c0pg44;
        C0PG4 c0pg45 = new C0PG4("FILTER", 4, 3);
        FILTER = c0pg45;
        C0PG4 c0pg46 = new C0PG4("CORRECT", 5, 4);
        CORRECT = c0pg46;
        C0PG4[] c0pg4Arr = {c0pg4, c0pg42, c0pg43, c0pg44, c0pg45, c0pg46};
        LLILLJJLI = c0pg4Arr;
        LLILLL = new C2254308sP(c0pg4Arr);
    }

    public static C0PG4[] values() {
        return (C0PG4[]) LLILLJJLI.clone();
    }

    public static C0PG4 valueOf(String str) {
        return (C0PG4) C08FF.LIZ(C0PG4.class, str);
    }

    public final boolean checkRankPriority(C0PG4 c0pg4) {
        if (this.LL >= c0pg4.LL) {
            return true;
        }
        return false;
    }

    public C0PG4(String str, int i, int i2) {
        this.LL = i2;
    }
}
