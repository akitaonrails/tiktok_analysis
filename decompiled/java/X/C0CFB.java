package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CFB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFB {
    public static final C0CFB HIGH;
    public static final /* synthetic */ C0CFB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CFB LOW;
    public static final C0CFB MIDDLE;
    public static final C0CFB UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0CFB> getEntries() {
        return LLILLL;
    }

    static {
        C0CFB c0cfb = new C0CFB("UNKNOWN", 0, -1);
        UNKNOWN = c0cfb;
        C0CFB c0cfb2 = new C0CFB("LOW", 1, 1);
        LOW = c0cfb2;
        C0CFB c0cfb3 = new C0CFB("MIDDLE", 2, 2);
        MIDDLE = c0cfb3;
        C0CFB c0cfb4 = new C0CFB("HIGH", 3, 3);
        HIGH = c0cfb4;
        C0CFB[] c0cfbArr = {c0cfb, c0cfb2, c0cfb3, c0cfb4};
        LLILLJJLI = c0cfbArr;
        LLILLL = new C2254308sP(c0cfbArr);
    }

    public static C0CFB[] values() {
        return (C0CFB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0CFB valueOf(String str) {
        return (C0CFB) C08FF.LIZ(C0CFB.class, str);
    }

    public C0CFB(String str, int i, int i2) {
        this.LL = i2;
    }
}
