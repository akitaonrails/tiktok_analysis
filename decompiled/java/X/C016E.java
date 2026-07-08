package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.016E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C016E {
    public static final C016E DIGITAL_0;
    public static final C016E DIGITAL_1;
    public static final /* synthetic */ C016E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C016E> getEntries() {
        return LLILLL;
    }

    static {
        C016E c016e = new C016E("DIGITAL_0", 0, 0);
        DIGITAL_0 = c016e;
        C016E c016e2 = new C016E("DIGITAL_1", 1, 1);
        DIGITAL_1 = c016e2;
        C016E[] c016eArr = {c016e, c016e2};
        LLILLJJLI = c016eArr;
        LLILLL = new C2254308sP(c016eArr);
    }

    public static C016E[] values() {
        return (C016E[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C016E valueOf(String str) {
        return (C016E) C08FF.LIZ(C016E.class, str);
    }

    public C016E(String str, int i, int i2) {
        this.LL = i2;
    }
}
