package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M2B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2B {
    public static final C0M2B LL;
    public static final C0M2B LLILLJJLI;
    public static final /* synthetic */ C0M2B[] LLILLL;

    static {
        C0M2B c0m2b = new C0M2B("INTRO_CLOSE", 0);
        LL = c0m2b;
        C0M2B c0m2b2 = new C0M2B("INTRO_NOT_NOW", 1);
        LLILLJJLI = c0m2b2;
        C0M2B[] c0m2bArr = {c0m2b, c0m2b2};
        LLILLL = c0m2bArr;
        new C2254308sP(c0m2bArr);
    }

    public static C0M2B[] values() {
        return (C0M2B[]) LLILLL.clone();
    }

    public static C0M2B valueOf(String str) {
        return (C0M2B) C08FF.LIZ(C0M2B.class, str);
    }

    public C0M2B(String str, int i) {
    }
}
