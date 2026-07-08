package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UFE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFE {
    public static final C0UFF Companion;
    public static final /* synthetic */ C0UFE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0UFE OFF;
    public static final C0UFE ON;
    public final int LL;

    public static final C0UFE fromInt(int i) {
        Companion.getClass();
        return C0UFF.LIZ(i);
    }

    public static InterfaceC2044707zh<C0UFE> getEntries() {
        return LLILLL;
    }

    static {
        C0UFE c0ufe = new C0UFE("OFF", 0, 0);
        OFF = c0ufe;
        C0UFE c0ufe2 = new C0UFE("ON", 1, 1);
        ON = c0ufe2;
        C0UFE[] c0ufeArr = {c0ufe, c0ufe2};
        LLILLJJLI = c0ufeArr;
        LLILLL = new C2254308sP(c0ufeArr);
        Companion = new C0UFF();
    }

    public static C0UFE[] values() {
        return (C0UFE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0UFE valueOf(String str) {
        return (C0UFE) C08FF.LIZ(C0UFE.class, str);
    }

    public C0UFE(String str, int i, int i2) {
        this.LL = i2;
    }
}
