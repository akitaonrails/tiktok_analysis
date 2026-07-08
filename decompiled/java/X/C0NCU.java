package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCU {
    public static final C0NCU CANCELED;
    public static final /* synthetic */ C0NCU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NCU NORMAL_DISPATCH;
    public final int LL;

    public static InterfaceC2044707zh<C0NCU> getEntries() {
        return LLILLL;
    }

    static {
        C0NCU c0ncu = new C0NCU("NORMAL_DISPATCH", 0, 0);
        NORMAL_DISPATCH = c0ncu;
        C0NCU c0ncu2 = new C0NCU("CANCELED", 1, 1);
        CANCELED = c0ncu2;
        C0NCU[] c0ncuArr = {c0ncu, c0ncu2};
        LLILLJJLI = c0ncuArr;
        LLILLL = new C2254308sP(c0ncuArr);
    }

    public static C0NCU[] values() {
        return (C0NCU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0NCU valueOf(String str) {
        return (C0NCU) C08FF.LIZ(C0NCU.class, str);
    }

    public C0NCU(String str, int i, int i2) {
        this.LL = i2;
    }
}
