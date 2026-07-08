package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04GV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04GV {
    public static final /* synthetic */ C04GV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C04GV LOTTERY;
    public static final C04GV UPGRADE;
    public final int LL;

    public static InterfaceC2044707zh<C04GV> getEntries() {
        return LLILLL;
    }

    static {
        C04GV c04gv = new C04GV("LOTTERY", 0, 1);
        LOTTERY = c04gv;
        C04GV c04gv2 = new C04GV("UPGRADE", 1, 2);
        UPGRADE = c04gv2;
        C04GV[] c04gvArr = {c04gv, c04gv2};
        LLILLJJLI = c04gvArr;
        LLILLL = new C2254308sP(c04gvArr);
    }

    public static C04GV[] values() {
        return (C04GV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C04GV valueOf(String str) {
        return (C04GV) C08FF.LIZ(C04GV.class, str);
    }

    public C04GV(String str, int i, int i2) {
        this.LL = i2;
    }
}
