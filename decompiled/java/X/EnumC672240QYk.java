package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672240QYk {
    public static final EnumC672240QYk DISABLE;
    public static final EnumC672240QYk ENABLE_ALWAYS;
    public static final /* synthetic */ EnumC672240QYk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC672240QYk ONLY_RESEARCH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC672240QYk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC672240QYk enumC672240QYk = new EnumC672240QYk("DISABLE", 0, 0);
        DISABLE = enumC672240QYk;
        EnumC672240QYk enumC672240QYk2 = new EnumC672240QYk("ENABLE_ALWAYS", 1, 1);
        ENABLE_ALWAYS = enumC672240QYk2;
        EnumC672240QYk enumC672240QYk3 = new EnumC672240QYk("ONLY_RESEARCH", 2, 2);
        ONLY_RESEARCH = enumC672240QYk3;
        EnumC672240QYk[] enumC672240QYkArr = {enumC672240QYk, enumC672240QYk2, enumC672240QYk3};
        LLILLJJLI = enumC672240QYkArr;
        LLILLL = new C2254308sP(enumC672240QYkArr);
    }

    public static EnumC672240QYk[] values() {
        return (EnumC672240QYk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC672240QYk valueOf(String str) {
        return (EnumC672240QYk) C08FF.LIZ(EnumC672240QYk.class, str);
    }

    public EnumC672240QYk(String str, int i, int i2) {
        this.LL = i2;
    }
}
