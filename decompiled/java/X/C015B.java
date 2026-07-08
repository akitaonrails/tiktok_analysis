package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.015B, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015B {
    public static final /* synthetic */ C015B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C015B OFF;
    public static final C015B ON;
    public final String LL;

    public static InterfaceC2044707zh<C015B> getEntries() {
        return LLILLL;
    }

    static {
        C015B c015b = new C015B("OFF", 0, "off");
        OFF = c015b;
        C015B c015b2 = new C015B("ON", 1, "on");
        ON = c015b2;
        C015B[] c015bArr = {c015b, c015b2};
        LLILLJJLI = c015bArr;
        LLILLL = new C2254308sP(c015bArr);
    }

    public static C015B[] values() {
        return (C015B[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C015B valueOf(String str) {
        return (C015B) C08FF.LIZ(C015B.class, str);
    }

    public C015B(String str, int i, String str2) {
        this.LL = str2;
    }
}
