package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D4K, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4K {
    public static final C0D4K LL;
    public static final C0D4K LLILLJJLI;
    public static final C0D4K LLILLL;
    public static final /* synthetic */ C0D4K[] LLILZ;

    static {
        C0D4K c0d4k = new C0D4K("NONE", 0);
        LL = c0d4k;
        C0D4K c0d4k2 = new C0D4K("LOADING", 1);
        LLILLJJLI = c0d4k2;
        C0D4K c0d4k3 = new C0D4K("FINAL_NO_IMAGE", 2);
        LLILLL = c0d4k3;
        C0D4K[] c0d4kArr = {c0d4k, c0d4k2, c0d4k3};
        LLILZ = c0d4kArr;
        new C2254308sP(c0d4kArr);
    }

    public static C0D4K[] values() {
        return (C0D4K[]) LLILZ.clone();
    }

    public static C0D4K valueOf(String str) {
        return (C0D4K) C08FF.LIZ(C0D4K.class, str);
    }

    public C0D4K(String str, int i) {
    }
}
