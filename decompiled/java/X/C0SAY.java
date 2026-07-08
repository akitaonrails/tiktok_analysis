package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SAY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAY {
    public static final C716870SAb Companion;
    public static final C0SAY FAIL;
    public static final /* synthetic */ C0SAY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SAY LOADING;
    public static final C0SAY SUCCESS;
    public static final C0SAY UNKNOWN;
    public final int LL;

    public static final C0SAY findStatus(Integer num) {
        Companion.getClass();
        return C716870SAb.LIZ(num);
    }

    public static InterfaceC2044707zh<C0SAY> getEntries() {
        return LLILLL;
    }

    static {
        C0SAY c0say = new C0SAY("FAIL", 0, 0);
        FAIL = c0say;
        C0SAY c0say2 = new C0SAY("SUCCESS", 1, 1);
        SUCCESS = c0say2;
        C0SAY c0say3 = new C0SAY("LOADING", 2, 2);
        LOADING = c0say3;
        C0SAY c0say4 = new C0SAY("UNKNOWN", 3, -1);
        UNKNOWN = c0say4;
        C0SAY[] c0sayArr = {c0say, c0say2, c0say3, c0say4};
        LLILLJJLI = c0sayArr;
        LLILLL = new C2254308sP(c0sayArr);
        Companion = new C716870SAb();
    }

    public static C0SAY[] values() {
        return (C0SAY[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0SAY valueOf(String str) {
        return (C0SAY) C08FF.LIZ(C0SAY.class, str);
    }

    public C0SAY(String str, int i, int i2) {
        this.LL = i2;
    }
}
