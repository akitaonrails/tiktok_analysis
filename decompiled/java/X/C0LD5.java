package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LD5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LD5 {
    public static final C0LD5 DARK;
    public static final C0LD5 FOLLOW_SYSTEM;
    public static final C0LD5 LIGHT;
    public static final /* synthetic */ C0LD5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0LD5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LD5 c0ld5 = new C0LD5("FOLLOW_SYSTEM", 0);
        FOLLOW_SYSTEM = c0ld5;
        C0LD5 c0ld52 = new C0LD5("LIGHT", 1);
        LIGHT = c0ld52;
        C0LD5 c0ld53 = new C0LD5("DARK", 2);
        DARK = c0ld53;
        C0LD5[] c0ld5Arr = {c0ld5, c0ld52, c0ld53};
        LL = c0ld5Arr;
        LLILLJJLI = new C2254308sP(c0ld5Arr);
    }

    public static C0LD5[] values() {
        return (C0LD5[]) LL.clone();
    }

    public static C0LD5 valueOf(String str) {
        return (C0LD5) C08FF.LIZ(C0LD5.class, str);
    }

    public C0LD5(String str, int i) {
    }
}
