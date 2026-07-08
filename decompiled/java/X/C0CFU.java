package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CFU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFU {
    public static final C0CFU COMMON;
    public static final C0CFU FIRST;
    public static final /* synthetic */ C0CFU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CFU THIRD;

    public static InterfaceC2044707zh<C0CFU> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CFU c0cfu = new C0CFU("THIRD", 0);
        THIRD = c0cfu;
        C0CFU c0cfu2 = new C0CFU("FIRST", 1);
        FIRST = c0cfu2;
        C0CFU c0cfu3 = new C0CFU("COMMON", 2);
        COMMON = c0cfu3;
        C0CFU[] c0cfuArr = {c0cfu, c0cfu2, c0cfu3};
        LL = c0cfuArr;
        LLILLJJLI = new C2254308sP(c0cfuArr);
    }

    public static C0CFU[] values() {
        return (C0CFU[]) LL.clone();
    }

    public static C0CFU valueOf(String str) {
        return (C0CFU) C08FF.LIZ(C0CFU.class, str);
    }

    public C0CFU(String str, int i) {
    }
}
