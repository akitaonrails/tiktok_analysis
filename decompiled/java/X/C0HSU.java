package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HSU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HSU {
    public static final C0HSU LL;
    public static final C0HSU LLILLJJLI;
    public static final C0HSU LLILLL;
    public static final /* synthetic */ C0HSU[] LLILZ;

    static {
        C0HSU c0hsu = new C0HSU("TOP", 0);
        LL = c0hsu;
        C0HSU c0hsu2 = new C0HSU("BOTTOM", 1);
        LLILLJJLI = c0hsu2;
        C0HSU c0hsu3 = new C0HSU("ALONE", 2);
        LLILLL = c0hsu3;
        C0HSU[] c0hsuArr = {c0hsu, c0hsu2, c0hsu3};
        LLILZ = c0hsuArr;
        new C2254308sP(c0hsuArr);
    }

    public static C0HSU[] values() {
        return (C0HSU[]) LLILZ.clone();
    }

    public static C0HSU valueOf(String str) {
        return (C0HSU) C08FF.LIZ(C0HSU.class, str);
    }

    public C0HSU(String str, int i) {
    }
}
