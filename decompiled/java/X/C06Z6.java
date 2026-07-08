package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Z6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06Z6 {
    public static final C06Z6 IO;
    public static final /* synthetic */ C06Z6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06Z6 MAIN;
    public static final C06Z6 WORKER;

    public static InterfaceC2044707zh<C06Z6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06Z6 c06z6 = new C06Z6("IO", 0);
        IO = c06z6;
        C06Z6 c06z62 = new C06Z6("WORKER", 1);
        WORKER = c06z62;
        C06Z6 c06z63 = new C06Z6("MAIN", 2);
        MAIN = c06z63;
        C06Z6[] c06z6Arr = {c06z6, c06z62, c06z63};
        LL = c06z6Arr;
        LLILLJJLI = new C2254308sP(c06z6Arr);
    }

    public static C06Z6[] values() {
        return (C06Z6[]) LL.clone();
    }

    public final AbstractC2252651DEx asCoroutineDispatcher() {
        int i = C06Z7.LIZ[ordinal()];
        if (i == 1) {
            return C0PEM.LIZJ;
        }
        if (i == 2) {
            return C0PEM.LIZ;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        C1DFH c1dfh = C0PEM.LIZ;
        return C2107308Nj.LIZ;
    }

    public static C06Z6 valueOf(String str) {
        return (C06Z6) C08FF.LIZ(C06Z6.class, str);
    }

    public C06Z6(String str, int i) {
    }
}
