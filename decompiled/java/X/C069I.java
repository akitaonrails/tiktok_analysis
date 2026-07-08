package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.069I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C069I {
    public static final /* synthetic */ C069I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C069I P0;
    public static final C069I P1;
    public static final C069I P2;

    public static InterfaceC2044707zh<C069I> getEntries() {
        return LLILLJJLI;
    }

    static {
        C069I c069i = new C069I("P0", 0);
        P0 = c069i;
        C069I c069i2 = new C069I("P1", 1);
        P1 = c069i2;
        C069I c069i3 = new C069I("P2", 2);
        P2 = c069i3;
        C069I[] c069iArr = {c069i, c069i2, c069i3};
        LL = c069iArr;
        LLILLJJLI = new C2254308sP(c069iArr);
    }

    public static C069I[] values() {
        return (C069I[]) LL.clone();
    }

    public static C069I valueOf(String str) {
        return (C069I) C08FF.LIZ(C069I.class, str);
    }

    public C069I(String str, int i) {
    }
}
