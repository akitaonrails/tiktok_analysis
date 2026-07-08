package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WOV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WOV {
    public static final C0WOV ASYNCSARK;
    public static final /* synthetic */ C0WOV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0WOV NATIVE;
    public static final C0WOV SPARK;
    public static final C0WOV SPARK_LITE;
    public static final C0WOV WEB;

    public static InterfaceC2044707zh<C0WOV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0WOV c0wov = new C0WOV("SPARK", 0);
        SPARK = c0wov;
        C0WOV c0wov2 = new C0WOV("NATIVE", 1);
        NATIVE = c0wov2;
        C0WOV c0wov3 = new C0WOV("WEB", 2);
        WEB = c0wov3;
        C0WOV c0wov4 = new C0WOV("ASYNCSARK", 3);
        ASYNCSARK = c0wov4;
        C0WOV c0wov5 = new C0WOV("SPARK_LITE", 4);
        SPARK_LITE = c0wov5;
        C0WOV[] c0wovArr = {c0wov, c0wov2, c0wov3, c0wov4, c0wov5};
        LL = c0wovArr;
        LLILLJJLI = new C2254308sP(c0wovArr);
    }

    public static C0WOV[] values() {
        return (C0WOV[]) LL.clone();
    }

    public static C0WOV valueOf(String str) {
        return (C0WOV) C08FF.LIZ(C0WOV.class, str);
    }

    public C0WOV(String str, int i) {
    }
}
