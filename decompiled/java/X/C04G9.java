package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04G9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04G9 {
    public static final /* synthetic */ C04G9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C04G9 SHOW_ORIGINAL;
    public static final C04G9 TRANSLATING;
    public static final C04G9 VIEW_TRANSLATION;
    public final int LL;

    public static InterfaceC2044707zh<C04G9> getEntries() {
        return LLILLL;
    }

    static {
        C04G9 c04g9 = new C04G9("VIEW_TRANSLATION", 0, 0);
        VIEW_TRANSLATION = c04g9;
        C04G9 c04g92 = new C04G9("TRANSLATING", 1, 1);
        TRANSLATING = c04g92;
        C04G9 c04g93 = new C04G9("SHOW_ORIGINAL", 2, 2);
        SHOW_ORIGINAL = c04g93;
        C04G9[] c04g9Arr = {c04g9, c04g92, c04g93};
        LLILLJJLI = c04g9Arr;
        LLILLL = new C2254308sP(c04g9Arr);
    }

    public static C04G9[] values() {
        return (C04G9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C04G9 valueOf(String str) {
        return (C04G9) C08FF.LIZ(C04G9.class, str);
    }

    public C04G9(String str, int i, int i2) {
        this.LL = i2;
    }
}
