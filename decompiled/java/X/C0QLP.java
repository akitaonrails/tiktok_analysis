package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QLP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLP {
    public static final C0QLP ADAPT;
    public static final C0QLP CHANNEL_DARK;
    public static final C0QLP CHANNEL_LIGHT;
    public static final C0QLP DARK;
    public static final C0QLP LIGHT;
    public static final /* synthetic */ C0QLP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0QLP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QLP c0qlp = new C0QLP("DARK", 0);
        DARK = c0qlp;
        C0QLP c0qlp2 = new C0QLP("LIGHT", 1);
        LIGHT = c0qlp2;
        C0QLP c0qlp3 = new C0QLP("ADAPT", 2);
        ADAPT = c0qlp3;
        C0QLP c0qlp4 = new C0QLP("CHANNEL_DARK", 3);
        CHANNEL_DARK = c0qlp4;
        C0QLP c0qlp5 = new C0QLP("CHANNEL_LIGHT", 4);
        CHANNEL_LIGHT = c0qlp5;
        C0QLP[] c0qlpArr = {c0qlp, c0qlp2, c0qlp3, c0qlp4, c0qlp5};
        LL = c0qlpArr;
        LLILLJJLI = new C2254308sP(c0qlpArr);
    }

    public static C0QLP[] values() {
        return (C0QLP[]) LL.clone();
    }

    public static C0QLP valueOf(String str) {
        return (C0QLP) C08FF.LIZ(C0QLP.class, str);
    }

    public C0QLP(String str, int i) {
    }
}
