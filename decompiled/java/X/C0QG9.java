package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QG9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QG9 {
    public static final C0QG9 LL;
    public static final C0QG9 LLILLJJLI;
    public static final C0QG9 LLILLL;
    public static final /* synthetic */ C0QG9[] LLILZ;

    static {
        C0QG9 c0qg9 = new C0QG9("UNKNOWN", 0);
        LL = c0qg9;
        C0QG9 c0qg92 = new C0QG9("DOWNLOADING", 1);
        LLILLJJLI = c0qg92;
        C0QG9 c0qg93 = new C0QG9("INSTALLED", 2);
        LLILLL = c0qg93;
        C0QG9[] c0qg9Arr = {c0qg9, c0qg92, c0qg93};
        LLILZ = c0qg9Arr;
        new C2254308sP(c0qg9Arr);
    }

    public static C0QG9[] values() {
        return (C0QG9[]) LLILZ.clone();
    }

    public static C0QG9 valueOf(String str) {
        return (C0QG9) C08FF.LIZ(C0QG9.class, str);
    }

    public C0QG9(String str, int i) {
    }
}
