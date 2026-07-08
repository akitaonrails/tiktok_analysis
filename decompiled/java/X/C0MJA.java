package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJA {
    public static final /* synthetic */ C0MJA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MJA NONE;
    public static final C0MJA SOUND_SYNC;
    public static final C0MJA TEMPLATE;

    public static InterfaceC2044707zh<C0MJA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MJA c0mja = new C0MJA("NONE", 0);
        NONE = c0mja;
        C0MJA c0mja2 = new C0MJA("SOUND_SYNC", 1);
        SOUND_SYNC = c0mja2;
        C0MJA c0mja3 = new C0MJA("TEMPLATE", 2);
        TEMPLATE = c0mja3;
        C0MJA[] c0mjaArr = {c0mja, c0mja2, c0mja3};
        LL = c0mjaArr;
        LLILLJJLI = new C2254308sP(c0mjaArr);
    }

    public static C0MJA[] values() {
        return (C0MJA[]) LL.clone();
    }

    public static C0MJA valueOf(String str) {
        return (C0MJA) C08FF.LIZ(C0MJA.class, str);
    }

    public C0MJA(String str, int i) {
    }
}
