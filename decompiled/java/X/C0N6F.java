package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6F {
    public static final C0N6F LIVE;
    public static final /* synthetic */ C0N6F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N6F PRODUCT;
    public static final C0N6F UNKNOWN;
    public static final C0N6F VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<C0N6F> getEntries() {
        return LLILLL;
    }

    static {
        C0N6F c0n6f = new C0N6F("UNKNOWN", 0, 0);
        UNKNOWN = c0n6f;
        C0N6F c0n6f2 = new C0N6F("PRODUCT", 1, 1);
        PRODUCT = c0n6f2;
        C0N6F c0n6f3 = new C0N6F("LIVE", 2, 2);
        LIVE = c0n6f3;
        C0N6F c0n6f4 = new C0N6F("VIDEO", 3, 3);
        VIDEO = c0n6f4;
        C0N6F[] c0n6fArr = {c0n6f, c0n6f2, c0n6f3, c0n6f4};
        LLILLJJLI = c0n6fArr;
        LLILLL = new C2254308sP(c0n6fArr);
    }

    public static C0N6F[] values() {
        return (C0N6F[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0N6F valueOf(String str) {
        return (C0N6F) C08FF.LIZ(C0N6F.class, str);
    }

    public C0N6F(String str, int i, int i2) {
        this.LL = i2;
    }
}
