package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XW9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XW9 {
    public static final /* synthetic */ C0XW9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0XW9 NEW;
    public static final C0XW9 REINSTALL;
    public static final C0XW9 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0XW9> getEntries() {
        return LLILLL;
    }

    static {
        C0XW9 c0xw9 = new C0XW9("UNKNOWN", 0, 0);
        UNKNOWN = c0xw9;
        C0XW9 c0xw92 = new C0XW9("REINSTALL", 1, 1);
        REINSTALL = c0xw92;
        C0XW9 c0xw93 = new C0XW9("NEW", 2, 2);
        NEW = c0xw93;
        C0XW9[] c0xw9Arr = {c0xw9, c0xw92, c0xw93};
        LLILLJJLI = c0xw9Arr;
        LLILLL = new C2254308sP(c0xw9Arr);
    }

    public static C0XW9[] values() {
        return (C0XW9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0XW9 valueOf(String str) {
        return (C0XW9) C08FF.LIZ(C0XW9.class, str);
    }

    public C0XW9(String str, int i, int i2) {
        this.LL = i2;
    }
}
