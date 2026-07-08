package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14SI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14SI {
    public static final C14SI BTT;
    public static final /* synthetic */ C14SI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C14SI LTR;
    public static final C14SI RTL;
    public static final C14SI TTB;

    public static InterfaceC2044707zh<C14SI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C14SI c14si = new C14SI("LTR", 0);
        LTR = c14si;
        C14SI c14si2 = new C14SI("RTL", 1);
        RTL = c14si2;
        C14SI c14si3 = new C14SI("TTB", 2);
        TTB = c14si3;
        C14SI c14si4 = new C14SI("BTT", 3);
        BTT = c14si4;
        C14SI[] c14siArr = {c14si, c14si2, c14si3, c14si4};
        LL = c14siArr;
        LLILLJJLI = new C2254308sP(c14siArr);
    }

    public static C14SI[] values() {
        return (C14SI[]) LL.clone();
    }

    public static C14SI valueOf(String str) {
        return (C14SI) C08FF.LIZ(C14SI.class, str);
    }

    public C14SI(String str, int i) {
    }
}
