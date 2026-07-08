package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03CT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CT {
    public static final C03CQ Companion;
    public static final C03CT ECONOMY;
    public static final C03CT EXPRESS;
    public static final C03CT INSTANT;
    public static final /* synthetic */ C03CT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03CT NEXTDAY;
    public static final C03CT PUDO;
    public static final C03CT SAMEDAY;
    public static final C03CT STANDARD;
    public static final C03CT UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C03CT> getEntries() {
        return LLILLL;
    }

    static {
        C03CT c03ct = new C03CT("UNKNOWN", 0, 0);
        UNKNOWN = c03ct;
        C03CT c03ct2 = new C03CT("STANDARD", 1, 1);
        STANDARD = c03ct2;
        C03CT c03ct3 = new C03CT("EXPRESS", 2, 2);
        EXPRESS = c03ct3;
        C03CT c03ct4 = new C03CT("ECONOMY", 3, 3);
        ECONOMY = c03ct4;
        C03CT c03ct5 = new C03CT("PUDO", 4, 4);
        PUDO = c03ct5;
        C03CT c03ct6 = new C03CT("INSTANT", 5, 5);
        INSTANT = c03ct6;
        C03CT c03ct7 = new C03CT("SAMEDAY", 6, 6);
        SAMEDAY = c03ct7;
        C03CT c03ct8 = new C03CT("NEXTDAY", 7, 7);
        NEXTDAY = c03ct8;
        C03CT[] c03ctArr = {c03ct, c03ct2, c03ct3, c03ct4, c03ct5, c03ct6, c03ct7, c03ct8};
        LLILLJJLI = c03ctArr;
        LLILLL = new C2254308sP(c03ctArr);
        Companion = new C03CQ();
    }

    public static C03CT[] values() {
        return (C03CT[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03CT valueOf(String str) {
        return (C03CT) C08FF.LIZ(C03CT.class, str);
    }

    public C03CT(String str, int i, int i2) {
        this.LL = i2;
    }
}
