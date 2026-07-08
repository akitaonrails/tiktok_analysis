package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TGU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TGU {
    public static final C0TGU CONVERT_STYLE;
    public static final /* synthetic */ C0TGU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TGU STANDARD_RATIO;
    public static final C0TGU SUG;
    public final int LL;

    public static InterfaceC2044707zh<C0TGU> getEntries() {
        return LLILLL;
    }

    static {
        C0TGU c0tgu = new C0TGU("CONVERT_STYLE", 0, 1);
        CONVERT_STYLE = c0tgu;
        C0TGU c0tgu2 = new C0TGU("STANDARD_RATIO", 1, 2);
        STANDARD_RATIO = c0tgu2;
        C0TGU c0tgu3 = new C0TGU("SUG", 2, 3);
        SUG = c0tgu3;
        C0TGU[] c0tguArr = {c0tgu, c0tgu2, c0tgu3};
        LLILLJJLI = c0tguArr;
        LLILLL = new C2254308sP(c0tguArr);
    }

    public static C0TGU[] values() {
        return (C0TGU[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0TGU valueOf(String str) {
        return (C0TGU) C08FF.LIZ(C0TGU.class, str);
    }

    public C0TGU(String str, int i, int i2) {
        this.LL = i2;
    }
}
