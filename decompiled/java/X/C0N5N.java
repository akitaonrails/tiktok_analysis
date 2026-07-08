package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5N {
    public static final /* synthetic */ C0N5N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N5N ON_CREATE;
    public static final C0N5N ON_DESTORY;

    public static InterfaceC2044707zh<C0N5N> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N5N c0n5n = new C0N5N("ON_CREATE", 0);
        ON_CREATE = c0n5n;
        C0N5N c0n5n2 = new C0N5N("ON_DESTORY", 1);
        ON_DESTORY = c0n5n2;
        C0N5N[] c0n5nArr = {c0n5n, c0n5n2};
        LL = c0n5nArr;
        LLILLJJLI = new C2254308sP(c0n5nArr);
    }

    public static C0N5N[] values() {
        return (C0N5N[]) LL.clone();
    }

    public static C0N5N valueOf(String str) {
        return (C0N5N) C08FF.LIZ(C0N5N.class, str);
    }

    public C0N5N(String str, int i) {
    }
}
