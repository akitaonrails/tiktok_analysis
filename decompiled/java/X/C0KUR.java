package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KUR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KUR {
    public static final C0KUR BEFORE_LOAD_START;
    public static final C0KUR IS_LOADING;
    public static final /* synthetic */ C0KUR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0KUR LOAD_FAIL;
    public static final C0KUR LOAD_SUCCESS;

    public static InterfaceC2044707zh<C0KUR> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KUR c0kur = new C0KUR("BEFORE_LOAD_START", 0);
        BEFORE_LOAD_START = c0kur;
        C0KUR c0kur2 = new C0KUR("IS_LOADING", 1);
        IS_LOADING = c0kur2;
        C0KUR c0kur3 = new C0KUR("LOAD_SUCCESS", 2);
        LOAD_SUCCESS = c0kur3;
        C0KUR c0kur4 = new C0KUR("LOAD_FAIL", 3);
        LOAD_FAIL = c0kur4;
        C0KUR[] c0kurArr = {c0kur, c0kur2, c0kur3, c0kur4};
        LL = c0kurArr;
        LLILLJJLI = new C2254308sP(c0kurArr);
    }

    public static C0KUR[] values() {
        return (C0KUR[]) LL.clone();
    }

    public static C0KUR valueOf(String str) {
        return (C0KUR) C08FF.LIZ(C0KUR.class, str);
    }

    public C0KUR(String str, int i) {
    }
}
