package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PM8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PM8 {
    public static final /* synthetic */ C0PM8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PM8 NORMAL;
    public static final C0PM8 SHOOT;
    public final int LL;

    public static InterfaceC2044707zh<C0PM8> getEntries() {
        return LLILLL;
    }

    static {
        C0PM8 c0pm8 = new C0PM8("NORMAL", 0, 0);
        NORMAL = c0pm8;
        C0PM8 c0pm82 = new C0PM8("SHOOT", 1, 1);
        SHOOT = c0pm82;
        C0PM8[] c0pm8Arr = {c0pm8, c0pm82};
        LLILLJJLI = c0pm8Arr;
        LLILLL = new C2254308sP(c0pm8Arr);
    }

    public static C0PM8[] values() {
        return (C0PM8[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0PM8 valueOf(String str) {
        return (C0PM8) C08FF.LIZ(C0PM8.class, str);
    }

    public C0PM8(String str, int i, int i2) {
        this.LL = i2;
    }
}
