package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016F {
    public static final C016F DIGITAL_0;
    public static final C016F DIGITAL_1;
    public static final /* synthetic */ C016F[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C016F> getEntries() {
        return LLILLL;
    }

    static {
        C016F c016f = new C016F("DIGITAL_0", 0, 0);
        DIGITAL_0 = c016f;
        C016F c016f2 = new C016F("DIGITAL_1", 1, 1);
        DIGITAL_1 = c016f2;
        C016F[] c016fArr = {c016f, c016f2};
        LLILLJJLI = c016fArr;
        LLILLL = new C2254308sP(c016fArr);
    }

    public static C016F[] values() {
        return (C016F[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C016F valueOf(String str) {
        return (C016F) C08FF.LIZ(C016F.class, str);
    }

    public C016F(String str, int i, int i2) {
        this.LL = i2;
    }
}
