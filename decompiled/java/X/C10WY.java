package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10WY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10WY {
    public static final C10WZ Companion;
    public static final /* synthetic */ C10WY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C10WY STATUS_TYPE_PENDING;
    public static final C10WY STATUS_TYPE_UNKNOWN;
    public static final C10WY STATUS_TYPE_VERIFIED;
    public final int LL;

    public static InterfaceC2044707zh<C10WY> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.10WZ] */
    static {
        C10WY c10wy = new C10WY("STATUS_TYPE_UNKNOWN", 0, 0);
        STATUS_TYPE_UNKNOWN = c10wy;
        C10WY c10wy2 = new C10WY("STATUS_TYPE_PENDING", 1, 1);
        STATUS_TYPE_PENDING = c10wy2;
        C10WY c10wy3 = new C10WY("STATUS_TYPE_VERIFIED", 2, 2);
        STATUS_TYPE_VERIFIED = c10wy3;
        C10WY[] c10wyArr = {c10wy, c10wy2, c10wy3};
        LLILLJJLI = c10wyArr;
        LLILLL = new C2254308sP(c10wyArr);
        Companion = new Object() { // from class: X.10WZ
        };
    }

    public static C10WY[] values() {
        return (C10WY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C10WY valueOf(String str) {
        return (C10WY) C08FF.LIZ(C10WY.class, str);
    }

    public C10WY(String str, int i, int i2) {
        this.LL = i2;
    }
}
