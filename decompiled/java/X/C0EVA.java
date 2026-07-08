package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EVA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EVA {
    public static final C0EV9 Companion;
    public static final C0EVA FILLER;
    public static final /* synthetic */ C0EVA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0EVA REPEAT;
    public static final C0EVA SILENT;
    public final String LL;

    public static InterfaceC2044707zh<C0EVA> getEntries() {
        return LLILLL;
    }

    static {
        C0EVA c0eva = new C0EVA("REPEAT", 0, "repeat");
        REPEAT = c0eva;
        C0EVA c0eva2 = new C0EVA("FILLER", 1, "filler");
        FILLER = c0eva2;
        C0EVA c0eva3 = new C0EVA("SILENT", 2, "silent");
        SILENT = c0eva3;
        C0EVA[] c0evaArr = {c0eva, c0eva2, c0eva3};
        LLILLJJLI = c0evaArr;
        LLILLL = new C2254308sP(c0evaArr);
        Companion = new C0EV9();
    }

    public static C0EVA[] values() {
        return (C0EVA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0EVA valueOf(String str) {
        return (C0EVA) C08FF.LIZ(C0EVA.class, str);
    }

    public C0EVA(String str, int i, String str2) {
        this.LL = str2;
    }
}
