package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.151B, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151B {
    public static final C151B DYNAMIC;
    public static final C151B KEY_GAP;
    public static final C151B KEY_TIME;
    public static final /* synthetic */ C151B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C151B MLBB_HERO;
    public static final C151B NONE;
    public static final C151B SEXUAL;

    public static InterfaceC2044707zh<C151B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C151B c151b = new C151B("NONE", 0);
        NONE = c151b;
        C151B c151b2 = new C151B("SEXUAL", 1);
        SEXUAL = c151b2;
        C151B c151b3 = new C151B("KEY_TIME", 2);
        KEY_TIME = c151b3;
        C151B c151b4 = new C151B("KEY_GAP", 3);
        KEY_GAP = c151b4;
        C151B c151b5 = new C151B("DYNAMIC", 4);
        DYNAMIC = c151b5;
        C151B c151b6 = new C151B("MLBB_HERO", 5);
        MLBB_HERO = c151b6;
        C151B[] c151bArr = {c151b, c151b2, c151b3, c151b4, c151b5, c151b6};
        LL = c151bArr;
        LLILLJJLI = new C2254308sP(c151bArr);
    }

    public static C151B[] values() {
        return (C151B[]) LL.clone();
    }

    public static C151B valueOf(String str) {
        return (C151B) C08FF.LIZ(C151B.class, str);
    }

    public C151B(String str, int i) {
    }
}
