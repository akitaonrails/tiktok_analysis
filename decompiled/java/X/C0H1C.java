package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H1C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1C {
    public static final /* synthetic */ C0H1C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0H1C V1;
    public static final C0H1C V3;
    public final String LL;

    public static InterfaceC2044707zh<C0H1C> getEntries() {
        return LLILLL;
    }

    static {
        C0H1C c0h1c = new C0H1C("V1", 0, "v1");
        V1 = c0h1c;
        C0H1C c0h1c2 = new C0H1C("V3", 1, "v3");
        V3 = c0h1c2;
        C0H1C[] c0h1cArr = {c0h1c, c0h1c2};
        LLILLJJLI = c0h1cArr;
        LLILLL = new C2254308sP(c0h1cArr);
    }

    public static C0H1C[] values() {
        return (C0H1C[]) LLILLJJLI.clone();
    }

    public final String getIdSuffix() {
        return this.LL;
    }

    public static C0H1C valueOf(String str) {
        return (C0H1C) C08FF.LIZ(C0H1C.class, str);
    }

    public C0H1C(String str, int i, String str2) {
        this.LL = str2;
    }
}
