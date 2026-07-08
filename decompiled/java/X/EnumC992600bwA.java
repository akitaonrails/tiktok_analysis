package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992600bwA {
    public static final EnumC992600bwA HUB;
    public static final EnumC992600bwA LIST;
    public static final /* synthetic */ EnumC992600bwA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992600bwA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992600bwA enumC992600bwA = new EnumC992600bwA("LIST", 0, 0);
        LIST = enumC992600bwA;
        EnumC992600bwA enumC992600bwA2 = new EnumC992600bwA("HUB", 1, 1);
        HUB = enumC992600bwA2;
        EnumC992600bwA[] enumC992600bwAArr = {enumC992600bwA, enumC992600bwA2};
        LLILLJJLI = enumC992600bwAArr;
        LLILLL = new C2254308sP(enumC992600bwAArr);
    }

    public static EnumC992600bwA[] values() {
        return (EnumC992600bwA[]) LLILLJJLI.clone();
    }

    public final int getStyle() {
        return this.LL;
    }

    public static EnumC992600bwA valueOf(String str) {
        return (EnumC992600bwA) C08FF.LIZ(EnumC992600bwA.class, str);
    }

    public EnumC992600bwA(String str, int i, int i2) {
        this.LL = i2;
    }
}
