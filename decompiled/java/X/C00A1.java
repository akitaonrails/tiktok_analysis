package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00A1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A1 {
    public static final C00A1 EFFECT_UNZIP_FILE_FIELD;
    public static final C00A1 EFFECT_ZIP_FILE_FIELD;
    public static final /* synthetic */ C00A1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00A1 PACKAGE_SIZE_FIELD;
    public final int LL;

    public static InterfaceC2044707zh<C00A1> getEntries() {
        return LLILLL;
    }

    static {
        C00A1 c00a1 = new C00A1("PACKAGE_SIZE_FIELD", 0, 1);
        PACKAGE_SIZE_FIELD = c00a1;
        C00A1 c00a12 = new C00A1("EFFECT_ZIP_FILE_FIELD", 1, 2);
        EFFECT_ZIP_FILE_FIELD = c00a12;
        C00A1 c00a13 = new C00A1("EFFECT_UNZIP_FILE_FIELD", 2, 4);
        EFFECT_UNZIP_FILE_FIELD = c00a13;
        C00A1[] c00a1Arr = {c00a1, c00a12, c00a13};
        LLILLJJLI = c00a1Arr;
        LLILLL = new C2254308sP(c00a1Arr);
    }

    public static C00A1[] values() {
        return (C00A1[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00A1 valueOf(String str) {
        return (C00A1) C08FF.LIZ(C00A1.class, str);
    }

    public C00A1(String str, int i, int i2) {
        this.LL = i2;
    }
}
