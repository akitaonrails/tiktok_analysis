package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FS9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FS9 {
    public static final C0FS9 HOT;
    public static final /* synthetic */ C0FS9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FS9 RECOMMEND;

    public static InterfaceC2044707zh<C0FS9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FS9 c0fs9 = new C0FS9("RECOMMEND", 0);
        RECOMMEND = c0fs9;
        C0FS9 c0fs92 = new C0FS9("HOT", 1);
        HOT = c0fs92;
        C0FS9[] c0fs9Arr = {c0fs9, c0fs92};
        LL = c0fs9Arr;
        LLILLJJLI = new C2254308sP(c0fs9Arr);
    }

    public static C0FS9[] values() {
        return (C0FS9[]) LL.clone();
    }

    public static C0FS9 valueOf(String str) {
        return (C0FS9) C08FF.LIZ(C0FS9.class, str);
    }

    public C0FS9(String str, int i) {
    }
}
