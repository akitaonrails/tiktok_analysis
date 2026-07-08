package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q7B, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q7B {
    public static final /* synthetic */ C0Q7B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Q7B NORMAL;
    public static final C0Q7B SIMPLIFIED;

    public static InterfaceC2044707zh<C0Q7B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Q7B c0q7b = new C0Q7B("NORMAL", 0);
        NORMAL = c0q7b;
        C0Q7B c0q7b2 = new C0Q7B("SIMPLIFIED", 1);
        SIMPLIFIED = c0q7b2;
        C0Q7B[] c0q7bArr = {c0q7b, c0q7b2};
        LL = c0q7bArr;
        LLILLJJLI = new C2254308sP(c0q7bArr);
    }

    public static C0Q7B[] values() {
        return (C0Q7B[]) LL.clone();
    }

    public static C0Q7B valueOf(String str) {
        return (C0Q7B) C08FF.LIZ(C0Q7B.class, str);
    }

    public C0Q7B(String str, int i) {
    }
}
