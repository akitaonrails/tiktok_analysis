package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081Y {
    public static final C081Y FALSE;
    public static final /* synthetic */ C081Y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C081Y TRUE;
    public final String LL;

    public static InterfaceC2044707zh<C081Y> getEntries() {
        return LLILLL;
    }

    static {
        C081Y c081y = new C081Y("FALSE", 0, "false");
        FALSE = c081y;
        C081Y c081y2 = new C081Y("TRUE", 1, "true");
        TRUE = c081y2;
        C081Y[] c081yArr = {c081y, c081y2};
        LLILLJJLI = c081yArr;
        LLILLL = new C2254308sP(c081yArr);
    }

    public static C081Y[] values() {
        return (C081Y[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C081Y valueOf(String str) {
        return (C081Y) C08FF.LIZ(C081Y.class, str);
    }

    public C081Y(String str, int i, String str2) {
        this.LL = str2;
    }
}
