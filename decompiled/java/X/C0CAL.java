package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CAL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAL {
    public static final /* synthetic */ C0CAL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CAL NO_TRANSLATABLE_ELEMENT;
    public static final C0CAL OTHER;
    public static final C0CAL SAME_LANGUAGE;
    public final int LL;

    public static InterfaceC2044707zh<C0CAL> getEntries() {
        return LLILLL;
    }

    static {
        C0CAL c0cal = new C0CAL("SAME_LANGUAGE", 0, 1);
        SAME_LANGUAGE = c0cal;
        C0CAL c0cal2 = new C0CAL("NO_TRANSLATABLE_ELEMENT", 1, 2);
        NO_TRANSLATABLE_ELEMENT = c0cal2;
        C0CAL c0cal3 = new C0CAL("OTHER", 2, 3);
        OTHER = c0cal3;
        C0CAL[] c0calArr = {c0cal, c0cal2, c0cal3};
        LLILLJJLI = c0calArr;
        LLILLL = new C2254308sP(c0calArr);
    }

    public static C0CAL[] values() {
        return (C0CAL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0CAL valueOf(String str) {
        return (C0CAL) C08FF.LIZ(C0CAL.class, str);
    }

    public C0CAL(String str, int i, int i2) {
        this.LL = i2;
    }
}
