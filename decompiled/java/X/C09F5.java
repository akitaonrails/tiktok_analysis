package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09F5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09F5 {
    public static final C09F5 INVALID_PATCH;
    public static final /* synthetic */ C09F5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C09F5 PATCH_HAS_EXCEPTION;
    public static final C09F5 PATCH_NO_FOUND_OBJ;
    public static final C09F5 PATCH_PATH_NULL;
    public static final C09F5 SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C09F5> getEntries() {
        return LLILLL;
    }

    static {
        C09F5 c09f5 = new C09F5("SUCCESS", 0, 0);
        SUCCESS = c09f5;
        C09F5 c09f52 = new C09F5("INVALID_PATCH", 1, 1001);
        INVALID_PATCH = c09f52;
        C09F5 c09f53 = new C09F5("PATCH_HAS_EXCEPTION", 2, 1020);
        PATCH_HAS_EXCEPTION = c09f53;
        C09F5 c09f54 = new C09F5("PATCH_NO_FOUND_OBJ", 3, 1021);
        PATCH_NO_FOUND_OBJ = c09f54;
        C09F5 c09f55 = new C09F5("PATCH_PATH_NULL", 4, 1022);
        PATCH_PATH_NULL = c09f55;
        C09F5[] c09f5Arr = {c09f5, c09f52, c09f53, c09f54, c09f55};
        LLILLJJLI = c09f5Arr;
        LLILLL = new C2254308sP(c09f5Arr);
    }

    public static C09F5[] values() {
        return (C09F5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C09F5 valueOf(String str) {
        return (C09F5) C08FF.LIZ(C09F5.class, str);
    }

    public C09F5(String str, int i, int i2) {
        this.LL = i2;
    }
}
