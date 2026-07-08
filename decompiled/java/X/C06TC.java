package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06TC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06TC {
    public static final C06TC ACTIVE;
    public static final C06TC EXPIRED;
    public static final /* synthetic */ C06TC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06TC NOT_ON;
    public final int LL;

    public static InterfaceC2044707zh<C06TC> getEntries() {
        return LLILLL;
    }

    static {
        C06TC c06tc = new C06TC("NOT_ON", 0, 0);
        NOT_ON = c06tc;
        C06TC c06tc2 = new C06TC("EXPIRED", 1, 1);
        EXPIRED = c06tc2;
        C06TC c06tc3 = new C06TC("ACTIVE", 2, 2);
        ACTIVE = c06tc3;
        C06TC[] c06tcArr = {c06tc, c06tc2, c06tc3};
        LLILLJJLI = c06tcArr;
        LLILLL = new C2254308sP(c06tcArr);
    }

    public static C06TC[] values() {
        return (C06TC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C06TC valueOf(String str) {
        return (C06TC) C08FF.LIZ(C06TC.class, str);
    }

    public C06TC(String str, int i, int i2) {
        this.LL = i2;
    }
}
