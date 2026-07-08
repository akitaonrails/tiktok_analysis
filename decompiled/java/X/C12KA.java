package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12KA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12KA {
    public static final C12KP Companion;
    public static final C12KA LINEAR;
    public static final /* synthetic */ C12KA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C12KA NONE;
    public final int LL;

    public static InterfaceC2044707zh<C12KA> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.12KP] */
    static {
        C12KA c12ka = new C12KA("NONE", 0, 0);
        NONE = c12ka;
        C12KA c12ka2 = new C12KA("LINEAR", 1, 1);
        LINEAR = c12ka2;
        C12KA[] c12kaArr = {c12ka, c12ka2};
        LLILLJJLI = c12kaArr;
        LLILLL = new C2254308sP(c12kaArr);
        Companion = new Object() { // from class: X.12KP
        };
    }

    public static C12KA[] values() {
        return (C12KA[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C12KA valueOf(String str) {
        return (C12KA) C08FF.LIZ(C12KA.class, str);
    }

    public C12KA(String str, int i, int i2) {
        this.LL = i2;
    }
}
