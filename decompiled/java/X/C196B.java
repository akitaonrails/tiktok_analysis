package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.196B, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C196B {
    public static final C196B GIF;
    public static final /* synthetic */ C196B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C196B LOTTIE;

    public static InterfaceC2044707zh<C196B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C196B c196b = new C196B("GIF", 0);
        GIF = c196b;
        C196B c196b2 = new C196B("LOTTIE", 1);
        LOTTIE = c196b2;
        C196B[] c196bArr = {c196b, c196b2};
        LL = c196bArr;
        LLILLJJLI = new C2254308sP(c196bArr);
    }

    public static C196B[] values() {
        return (C196B[]) LL.clone();
    }

    public static C196B valueOf(String str) {
        return (C196B) C08FF.LIZ(C196B.class, str);
    }

    public C196B(String str, int i) {
    }
}
