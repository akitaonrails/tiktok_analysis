package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00FI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FI {
    public static final /* synthetic */ C00FI[] LL;

    static {
        C00FI[] c00fiArr = {new C00FI("UNKNOWN", 0, 0L), new C00FI("NORMAL", 1, 1L), new C00FI("COMMUNITY", 2, 2L)};
        LL = c00fiArr;
        new C2254308sP(c00fiArr);
    }

    public static C00FI[] values() {
        return (C00FI[]) LL.clone();
    }

    public static C00FI valueOf(String str) {
        return (C00FI) C08FF.LIZ(C00FI.class, str);
    }

    public C00FI(String str, int i, long j) {
    }
}
