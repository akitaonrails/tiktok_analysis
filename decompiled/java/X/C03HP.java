package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03HP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HP {
    public static final C03HP COMMON;
    public static final /* synthetic */ C03HP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03HP PLUS;
    public final int LL;

    public static InterfaceC2044707zh<C03HP> getEntries() {
        return LLILLL;
    }

    static {
        C03HP c03hp = new C03HP("COMMON", 0, 0);
        COMMON = c03hp;
        C03HP c03hp2 = new C03HP("PLUS", 1, 1);
        PLUS = c03hp2;
        C03HP[] c03hpArr = {c03hp, c03hp2};
        LLILLJJLI = c03hpArr;
        LLILLL = new C2254308sP(c03hpArr);
    }

    public static C03HP[] values() {
        return (C03HP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03HP valueOf(String str) {
        return (C03HP) C08FF.LIZ(C03HP.class, str);
    }

    public C03HP(String str, int i, int i2) {
        this.LL = i2;
    }
}
