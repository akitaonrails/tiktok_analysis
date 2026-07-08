package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05FX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05FX {
    public static final C05FX DURATION_FROM_PREVIOUS;
    public static final C05FX DURATION_FROM_START;
    public static final /* synthetic */ C05FX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C05FX> getEntries() {
        return LLILLJJLI;
    }

    static {
        C05FX c05fx = new C05FX("DURATION_FROM_PREVIOUS", 0);
        DURATION_FROM_PREVIOUS = c05fx;
        C05FX c05fx2 = new C05FX("DURATION_FROM_START", 1);
        DURATION_FROM_START = c05fx2;
        C05FX[] c05fxArr = {c05fx, c05fx2};
        LL = c05fxArr;
        LLILLJJLI = new C2254308sP(c05fxArr);
    }

    public static C05FX[] values() {
        return (C05FX[]) LL.clone();
    }

    public static C05FX valueOf(String str) {
        return (C05FX) C08FF.LIZ(C05FX.class, str);
    }

    public C05FX(String str, int i) {
    }
}
