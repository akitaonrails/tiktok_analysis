package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.069H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C069H {
    public static final /* synthetic */ C069H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C069H NONE;
    public static final C069H P0;
    public static final C069H P1;

    public static InterfaceC2044707zh<C069H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C069H c069h = new C069H("P0", 0);
        P0 = c069h;
        C069H c069h2 = new C069H("P1", 1);
        P1 = c069h2;
        C069H c069h3 = new C069H("NONE", 2);
        NONE = c069h3;
        C069H[] c069hArr = {c069h, c069h2, c069h3};
        LL = c069hArr;
        LLILLJJLI = new C2254308sP(c069hArr);
    }

    public static C069H[] values() {
        return (C069H[]) LL.clone();
    }

    public static C069H valueOf(String str) {
        return (C069H) C08FF.LIZ(C069H.class, str);
    }

    public C069H(String str, int i) {
    }
}
