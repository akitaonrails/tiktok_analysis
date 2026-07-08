package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TNK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TNK {
    public static final C0TNK BUNDLE_ADD_FAIL;
    public static final C0TNK BUNDLE_ADD_SUCCESS;
    public static final /* synthetic */ C0TNK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TNK NORMAL_ADD_FAIL;
    public static final C0TNK NORMAL_ADD_SUCCESS;
    public static final C0TNK UNDEFINED;
    public final int LL;

    public static InterfaceC2044707zh<C0TNK> getEntries() {
        return LLILLL;
    }

    static {
        C0TNK c0tnk = new C0TNK("UNDEFINED", 0, 0);
        UNDEFINED = c0tnk;
        C0TNK c0tnk2 = new C0TNK("NORMAL_ADD_SUCCESS", 1, 1);
        NORMAL_ADD_SUCCESS = c0tnk2;
        C0TNK c0tnk3 = new C0TNK("NORMAL_ADD_FAIL", 2, 2);
        NORMAL_ADD_FAIL = c0tnk3;
        C0TNK c0tnk4 = new C0TNK("BUNDLE_ADD_SUCCESS", 3, 3);
        BUNDLE_ADD_SUCCESS = c0tnk4;
        C0TNK c0tnk5 = new C0TNK("BUNDLE_ADD_FAIL", 4, 4);
        BUNDLE_ADD_FAIL = c0tnk5;
        C0TNK[] c0tnkArr = {c0tnk, c0tnk2, c0tnk3, c0tnk4, c0tnk5};
        LLILLJJLI = c0tnkArr;
        LLILLL = new C2254308sP(c0tnkArr);
    }

    public static C0TNK[] values() {
        return (C0TNK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0TNK valueOf(String str) {
        return (C0TNK) C08FF.LIZ(C0TNK.class, str);
    }

    public C0TNK(String str, int i, int i2) {
        this.LL = i2;
    }
}
