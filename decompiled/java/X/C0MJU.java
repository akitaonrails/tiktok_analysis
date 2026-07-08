package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJU {
    public static final C0MJU FILTER;
    public static final C0MJU FLASH;
    public static final /* synthetic */ C0MJU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0MJU M_BEAUTY;
    public static final C0MJU REVERSE;

    public static InterfaceC2044707zh<C0MJU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0MJU c0mju = new C0MJU("REVERSE", 0);
        REVERSE = c0mju;
        C0MJU c0mju2 = new C0MJU("FLASH", 1);
        FLASH = c0mju2;
        C0MJU c0mju3 = new C0MJU("FILTER", 2);
        FILTER = c0mju3;
        C0MJU c0mju4 = new C0MJU("M_BEAUTY", 3);
        M_BEAUTY = c0mju4;
        C0MJU[] c0mjuArr = {c0mju, c0mju2, c0mju3, c0mju4};
        LL = c0mjuArr;
        LLILLJJLI = new C2254308sP(c0mjuArr);
    }

    public static C0MJU[] values() {
        return (C0MJU[]) LL.clone();
    }

    public static C0MJU valueOf(String str) {
        return (C0MJU) C08FF.LIZ(C0MJU.class, str);
    }

    public C0MJU(String str, int i) {
    }
}
