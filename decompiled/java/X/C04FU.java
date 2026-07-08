package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04FU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FU {
    public static final /* synthetic */ C04FU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C04FU MERGE;
    public static final C04FU REPLACE;
    public final int LL;

    public static InterfaceC2044707zh<C04FU> getEntries() {
        return LLILLL;
    }

    static {
        C04FU c04fu = new C04FU("REPLACE", 0, 0);
        REPLACE = c04fu;
        C04FU c04fu2 = new C04FU("MERGE", 1, 1);
        MERGE = c04fu2;
        C04FU[] c04fuArr = {c04fu, c04fu2};
        LLILLJJLI = c04fuArr;
        LLILLL = new C2254308sP(c04fuArr);
    }

    public static C04FU[] values() {
        return (C04FU[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C04FU valueOf(String str) {
        return (C04FU) C08FF.LIZ(C04FU.class, str);
    }

    public C04FU(String str, int i, int i2) {
        this.LL = i2;
    }
}
