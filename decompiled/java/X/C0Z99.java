package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z99, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z99 {
    public static final /* synthetic */ C0Z99[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0Z99 QUICK_REACTION;
    public static final C0Z99 SPARK;
    public final String LL;

    public static InterfaceC2044707zh<C0Z99> getEntries() {
        return LLILLL;
    }

    static {
        C0Z99 c0z99 = new C0Z99("QUICK_REACTION", 0, "quick_reaction");
        QUICK_REACTION = c0z99;
        C0Z99 c0z992 = new C0Z99("SPARK", 1, "spark");
        SPARK = c0z992;
        C0Z99[] c0z99Arr = {c0z99, c0z992};
        LLILLJJLI = c0z99Arr;
        LLILLL = new C2254308sP(c0z99Arr);
    }

    public static C0Z99[] values() {
        return (C0Z99[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0Z99 valueOf(String str) {
        return (C0Z99) C08FF.LIZ(C0Z99.class, str);
    }

    public C0Z99(String str, int i, String str2) {
        this.LL = str2;
    }
}
