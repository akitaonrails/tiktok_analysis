package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056A {
    public static final C056A FINGER_DOWN;
    public static final C056A FINGER_UP;
    public static final /* synthetic */ C056A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C056A> getEntries() {
        return LLILLJJLI;
    }

    static {
        C056A c056a = new C056A("FINGER_UP", 0);
        FINGER_UP = c056a;
        C056A c056a2 = new C056A("FINGER_DOWN", 1);
        FINGER_DOWN = c056a2;
        C056A[] c056aArr = {c056a, c056a2};
        LL = c056aArr;
        LLILLJJLI = new C2254308sP(c056aArr);
    }

    public static C056A[] values() {
        return (C056A[]) LL.clone();
    }

    public static C056A valueOf(String str) {
        return (C056A) C08FF.LIZ(C056A.class, str);
    }

    public C056A(String str, int i) {
    }
}
