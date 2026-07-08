package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VRK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VRK {
    public static final C0VRK DELETE;
    public static final C0VRK INSERT;
    public static final /* synthetic */ C0VRK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0VRK> getEntries() {
        return LLILLL;
    }

    static {
        C0VRK c0vrk = new C0VRK("INSERT", 0, 0);
        INSERT = c0vrk;
        C0VRK c0vrk2 = new C0VRK("DELETE", 1, 1);
        DELETE = c0vrk2;
        C0VRK[] c0vrkArr = {c0vrk, c0vrk2};
        LLILLJJLI = c0vrkArr;
        LLILLL = new C2254308sP(c0vrkArr);
    }

    public static C0VRK[] values() {
        return (C0VRK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0VRK valueOf(String str) {
        return (C0VRK) C08FF.LIZ(C0VRK.class, str);
    }

    public C0VRK(String str, int i, int i2) {
        this.LL = i2;
    }
}
