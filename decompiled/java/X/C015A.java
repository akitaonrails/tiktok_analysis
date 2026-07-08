package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.015A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015A {
    public static final /* synthetic */ C015A[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C015A OFF;
    public static final C015A ON;
    public final String LL;

    public static InterfaceC2044707zh<C015A> getEntries() {
        return LLILLL;
    }

    static {
        C015A c015a = new C015A("OFF", 0, "off");
        OFF = c015a;
        C015A c015a2 = new C015A("ON", 1, "on");
        ON = c015a2;
        C015A[] c015aArr = {c015a, c015a2};
        LLILLJJLI = c015aArr;
        LLILLL = new C2254308sP(c015aArr);
    }

    public static C015A[] values() {
        return (C015A[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C015A valueOf(String str) {
        return (C015A) C08FF.LIZ(C015A.class, str);
    }

    public C015A(String str, int i, String str2) {
        this.LL = str2;
    }
}
