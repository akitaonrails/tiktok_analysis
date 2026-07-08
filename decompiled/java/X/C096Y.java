package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.096Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096Y {
    public static final C096Y IMAGE;
    public static final /* synthetic */ C096Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C096Y VIDEO;

    public static InterfaceC2044707zh<C096Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        C096Y c096y = new C096Y("IMAGE", 0);
        IMAGE = c096y;
        C096Y c096y2 = new C096Y("VIDEO", 1);
        VIDEO = c096y2;
        C096Y[] c096yArr = {c096y, c096y2};
        LL = c096yArr;
        LLILLJJLI = new C2254308sP(c096yArr);
    }

    public static C096Y[] values() {
        return (C096Y[]) LL.clone();
    }

    public static C096Y valueOf(String str) {
        return (C096Y) C08FF.LIZ(C096Y.class, str);
    }

    public C096Y(String str, int i) {
    }
}
