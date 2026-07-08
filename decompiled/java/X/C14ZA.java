package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZA {
    public static final C14ZA BINARY;
    public static final C14Z9 Companion;
    public static final C14ZA FIVE_LEVEL;
    public static final /* synthetic */ C14ZA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C14ZA MULTIPLE_CHOICE;
    public static final C14ZA MULTIPLE_CHOICE_INPUT;
    public static final C14ZA SINGLE_CHOICE;
    public final int LL;

    public static InterfaceC2044707zh<C14ZA> getEntries() {
        return LLILLL;
    }

    static {
        C14ZA c14za = new C14ZA("BINARY", 0, 0);
        BINARY = c14za;
        C14ZA c14za2 = new C14ZA("FIVE_LEVEL", 1, 1);
        FIVE_LEVEL = c14za2;
        C14ZA c14za3 = new C14ZA("SINGLE_CHOICE", 2, 2);
        SINGLE_CHOICE = c14za3;
        C14ZA c14za4 = new C14ZA("MULTIPLE_CHOICE", 3, 3);
        MULTIPLE_CHOICE = c14za4;
        C14ZA c14za5 = new C14ZA("MULTIPLE_CHOICE_INPUT", 4, 4);
        MULTIPLE_CHOICE_INPUT = c14za5;
        C14ZA[] c14zaArr = {c14za, c14za2, c14za3, c14za4, c14za5};
        LLILLJJLI = c14zaArr;
        LLILLL = new C2254308sP(c14zaArr);
        Companion = new C14Z9();
    }

    public static C14ZA[] values() {
        return (C14ZA[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C14ZA valueOf(String str) {
        return (C14ZA) C08FF.LIZ(C14ZA.class, str);
    }

    public C14ZA(String str, int i, int i2) {
        this.LL = i2;
    }
}
