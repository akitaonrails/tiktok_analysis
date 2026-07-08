package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CZ {
    public static final C03CZ INVERTED_SELECTED;
    public static final /* synthetic */ C03CZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03CZ UNSELECTED;
    public static final C03CZ USER_SELECTED;
    public final int LL;

    public static InterfaceC2044707zh<C03CZ> getEntries() {
        return LLILLL;
    }

    static {
        C03CZ c03cz = new C03CZ("UNSELECTED", 0, 0);
        UNSELECTED = c03cz;
        C03CZ c03cz2 = new C03CZ("USER_SELECTED", 1, 1);
        USER_SELECTED = c03cz2;
        C03CZ c03cz3 = new C03CZ("INVERTED_SELECTED", 2, 2);
        INVERTED_SELECTED = c03cz3;
        C03CZ[] c03czArr = {c03cz, c03cz2, c03cz3};
        LLILLJJLI = c03czArr;
        LLILLL = new C2254308sP(c03czArr);
    }

    public static C03CZ[] values() {
        return (C03CZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03CZ valueOf(String str) {
        return (C03CZ) C08FF.LIZ(C03CZ.class, str);
    }

    public C03CZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
