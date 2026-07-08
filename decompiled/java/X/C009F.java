package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009F {
    public static final C009F DIGG;
    public static final /* synthetic */ C009F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009F UNDIGG;
    public static final C009F UNKNOWN;

    public static InterfaceC2044707zh<C009F> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009F c009f = new C009F("UNKNOWN", 0);
        UNKNOWN = c009f;
        C009F c009f2 = new C009F("DIGG", 1);
        DIGG = c009f2;
        C009F c009f3 = new C009F("UNDIGG", 2);
        UNDIGG = c009f3;
        C009F[] c009fArr = {c009f, c009f2, c009f3};
        LL = c009fArr;
        LLILLJJLI = new C2254308sP(c009fArr);
    }

    public static C009F[] values() {
        return (C009F[]) LL.clone();
    }

    public static C009F valueOf(String str) {
        return (C009F) C08FF.LIZ(C009F.class, str);
    }

    public C009F(String str, int i) {
    }
}
