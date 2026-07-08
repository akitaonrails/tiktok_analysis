package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LZU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LZU {
    public static final /* synthetic */ C0LZU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LZU NEW_FRAMEWORK;
    public static final C0LZU NONE;
    public static final C0LZU OLD_FRAMEWORK;

    public static InterfaceC2044707zh<C0LZU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LZU c0lzu = new C0LZU("OLD_FRAMEWORK", 0);
        OLD_FRAMEWORK = c0lzu;
        C0LZU c0lzu2 = new C0LZU("NEW_FRAMEWORK", 1);
        NEW_FRAMEWORK = c0lzu2;
        C0LZU c0lzu3 = new C0LZU("NONE", 2);
        NONE = c0lzu3;
        C0LZU[] c0lzuArr = {c0lzu, c0lzu2, c0lzu3};
        LL = c0lzuArr;
        LLILLJJLI = new C2254308sP(c0lzuArr);
    }

    public static C0LZU[] values() {
        return (C0LZU[]) LL.clone();
    }

    public static C0LZU valueOf(String str) {
        return (C0LZU) C08FF.LIZ(C0LZU.class, str);
    }

    public C0LZU(String str, int i) {
    }
}
