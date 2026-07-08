package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.015C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015C {
    public static final /* synthetic */ C015C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C015C OFF;
    public static final C015C ON;
    public static final C015C UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C015C> getEntries() {
        return LLILLL;
    }

    static {
        C015C c015c = new C015C("UNKNOWN", 0, 0);
        UNKNOWN = c015c;
        C015C c015c2 = new C015C("ON", 1, 1);
        ON = c015c2;
        C015C c015c3 = new C015C("OFF", 2, 2);
        OFF = c015c3;
        C015C[] c015cArr = {c015c, c015c2, c015c3};
        LLILLJJLI = c015cArr;
        LLILLL = new C2254308sP(c015cArr);
    }

    public static C015C[] values() {
        return (C015C[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static C015C valueOf(String str) {
        return (C015C) C08FF.LIZ(C015C.class, str);
    }

    public C015C(String str, int i, int i2) {
        this.LL = i2;
    }
}
