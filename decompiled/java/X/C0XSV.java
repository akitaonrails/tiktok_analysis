package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XSV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XSV {
    public static final C0XSV GET;
    public static final /* synthetic */ C0XSV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0XSV POST;

    public static InterfaceC2044707zh<C0XSV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0XSV c0xsv = new C0XSV("GET", 0);
        GET = c0xsv;
        C0XSV c0xsv2 = new C0XSV("POST", 1);
        POST = c0xsv2;
        C0XSV[] c0xsvArr = {c0xsv, c0xsv2};
        LL = c0xsvArr;
        LLILLJJLI = new C2254308sP(c0xsvArr);
    }

    public static C0XSV[] values() {
        return (C0XSV[]) LL.clone();
    }

    public static C0XSV valueOf(String str) {
        return (C0XSV) C08FF.LIZ(C0XSV.class, str);
    }

    public C0XSV(String str, int i) {
    }
}
