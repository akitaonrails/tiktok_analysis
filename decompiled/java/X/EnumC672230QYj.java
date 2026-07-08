package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672230QYj {
    public static final EnumC672230QYj COMMON;
    public static final EnumC672230QYj DISABLE;
    public static final /* synthetic */ EnumC672230QYj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC672230QYj UNIQUE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC672230QYj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC672230QYj enumC672230QYj = new EnumC672230QYj("DISABLE", 0, 0);
        DISABLE = enumC672230QYj;
        EnumC672230QYj enumC672230QYj2 = new EnumC672230QYj("COMMON", 1, 1);
        COMMON = enumC672230QYj2;
        EnumC672230QYj enumC672230QYj3 = new EnumC672230QYj("UNIQUE", 2, 2);
        UNIQUE = enumC672230QYj3;
        EnumC672230QYj[] enumC672230QYjArr = {enumC672230QYj, enumC672230QYj2, enumC672230QYj3};
        LLILLJJLI = enumC672230QYjArr;
        LLILLL = new C2254308sP(enumC672230QYjArr);
    }

    public static EnumC672230QYj[] values() {
        return (EnumC672230QYj[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC672230QYj valueOf(String str) {
        return (EnumC672230QYj) C08FF.LIZ(EnumC672230QYj.class, str);
    }

    public EnumC672230QYj(String str, int i, int i2) {
        this.LL = i2;
    }
}
