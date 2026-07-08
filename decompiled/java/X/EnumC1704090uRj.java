package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1704090uRj {
    public static final EnumC1704090uRj L1;
    public static final EnumC1704090uRj L2;
    public static final EnumC1704090uRj L3;
    public static final /* synthetic */ EnumC1704090uRj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1704090uRj UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1704090uRj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1704090uRj enumC1704090uRj = new EnumC1704090uRj("UNKNOWN", 0, -1);
        UNKNOWN = enumC1704090uRj;
        EnumC1704090uRj enumC1704090uRj2 = new EnumC1704090uRj("L1", 1, 1);
        L1 = enumC1704090uRj2;
        EnumC1704090uRj enumC1704090uRj3 = new EnumC1704090uRj("L2", 2, 2);
        L2 = enumC1704090uRj3;
        EnumC1704090uRj enumC1704090uRj4 = new EnumC1704090uRj("L3", 3, 3);
        L3 = enumC1704090uRj4;
        EnumC1704090uRj[] enumC1704090uRjArr = {enumC1704090uRj, enumC1704090uRj2, enumC1704090uRj3, enumC1704090uRj4};
        LLILLJJLI = enumC1704090uRjArr;
        LLILLL = new C2254308sP(enumC1704090uRjArr);
    }

    public static EnumC1704090uRj[] values() {
        return (EnumC1704090uRj[]) LLILLJJLI.clone();
    }

    public final int getLevelValue() {
        return this.LL;
    }

    public static EnumC1704090uRj valueOf(String str) {
        return (EnumC1704090uRj) C08FF.LIZ(EnumC1704090uRj.class, str);
    }

    public EnumC1704090uRj(String str, int i, int i2) {
        this.LL = i2;
    }
}
