package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JKP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JKP {
    public static final C0JKP COMPULSORY;
    public static final C0JKP IMPORTANT;
    public static final /* synthetic */ C0JKP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0JKP OTHERS;

    public static InterfaceC2044707zh<C0JKP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0JKP c0jkp = new C0JKP("COMPULSORY", 0);
        COMPULSORY = c0jkp;
        C0JKP c0jkp2 = new C0JKP("IMPORTANT", 1);
        IMPORTANT = c0jkp2;
        C0JKP c0jkp3 = new C0JKP("OTHERS", 2);
        OTHERS = c0jkp3;
        C0JKP[] c0jkpArr = {c0jkp, c0jkp2, c0jkp3};
        LL = c0jkpArr;
        LLILLJJLI = new C2254308sP(c0jkpArr);
    }

    public static C0JKP[] values() {
        return (C0JKP[]) LL.clone();
    }

    public static C0JKP valueOf(String str) {
        return (C0JKP) C08FF.LIZ(C0JKP.class, str);
    }

    public C0JKP(String str, int i) {
    }
}
