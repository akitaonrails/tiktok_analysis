package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009D, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009D {
    public static final C009D FACE;
    public static final /* synthetic */ C009D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009D NONE;

    public static InterfaceC2044707zh<C009D> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009D c009d = new C009D("NONE", 0);
        NONE = c009d;
        C009D c009d2 = new C009D("FACE", 1);
        FACE = c009d2;
        C009D[] c009dArr = {c009d, c009d2};
        LL = c009dArr;
        LLILLJJLI = new C2254308sP(c009dArr);
    }

    public static C009D[] values() {
        return (C009D[]) LL.clone();
    }

    public static C009D valueOf(String str) {
        return (C009D) C08FF.LIZ(C009D.class, str);
    }

    public C009D(String str, int i) {
    }
}
