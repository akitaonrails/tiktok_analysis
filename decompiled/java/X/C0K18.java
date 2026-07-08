package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K18, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K18 {
    public static final C0K18 GOOGLE_PLAY;
    public static final /* synthetic */ C0K18[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0K18 TPL_LIST;

    public static InterfaceC2044707zh<C0K18> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0K18 c0k18 = new C0K18("TPL_LIST", 0);
        TPL_LIST = c0k18;
        C0K18 c0k182 = new C0K18("GOOGLE_PLAY", 1);
        GOOGLE_PLAY = c0k182;
        C0K18[] c0k18Arr = {c0k18, c0k182};
        LL = c0k18Arr;
        LLILLJJLI = new C2254308sP(c0k18Arr);
    }

    public static C0K18[] values() {
        return (C0K18[]) LL.clone();
    }

    public static C0K18 valueOf(String str) {
        return (C0K18) C08FF.LIZ(C0K18.class, str);
    }

    public C0K18(String str, int i) {
    }
}
