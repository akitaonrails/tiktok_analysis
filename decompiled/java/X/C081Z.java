package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081Z {
    public static final C081Z FALSE;
    public static final /* synthetic */ C081Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C081Z TRUE;
    public final String LL;

    public static InterfaceC2044707zh<C081Z> getEntries() {
        return LLILLL;
    }

    static {
        C081Z c081z = new C081Z("FALSE", 0, "false");
        FALSE = c081z;
        C081Z c081z2 = new C081Z("TRUE", 1, "true");
        TRUE = c081z2;
        C081Z[] c081zArr = {c081z, c081z2};
        LLILLJJLI = c081zArr;
        LLILLL = new C2254308sP(c081zArr);
    }

    public static C081Z[] values() {
        return (C081Z[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C081Z valueOf(String str) {
        return (C081Z) C08FF.LIZ(C081Z.class, str);
    }

    public C081Z(String str, int i, String str2) {
        this.LL = str2;
    }
}
