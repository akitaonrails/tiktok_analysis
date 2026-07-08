package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OR7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OR7 {
    public static final C0OR7 ERROR_CODE_NO_COPYRIGHT;
    public static final C0OR7 ERROR_CODE_UNKNOWN;
    public static final /* synthetic */ C0OR7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0OR7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OR7 c0or7 = new C0OR7("ERROR_CODE_UNKNOWN", 0);
        ERROR_CODE_UNKNOWN = c0or7;
        C0OR7 c0or72 = new C0OR7("ERROR_CODE_NO_COPYRIGHT", 1);
        ERROR_CODE_NO_COPYRIGHT = c0or72;
        C0OR7[] c0or7Arr = {c0or7, c0or72};
        LL = c0or7Arr;
        LLILLJJLI = new C2254308sP(c0or7Arr);
    }

    public static C0OR7[] values() {
        return (C0OR7[]) LL.clone();
    }

    public static C0OR7 valueOf(String str) {
        return (C0OR7) C08FF.LIZ(C0OR7.class, str);
    }

    public C0OR7(String str, int i) {
    }
}
