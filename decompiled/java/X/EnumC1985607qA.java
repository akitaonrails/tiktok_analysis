package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985607qA {
    public static final /* synthetic */ EnumC1985607qA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1985607qA STATUS_FAIL;
    public static final EnumC1985607qA STATUS_PASS;
    public static final EnumC1985607qA STATUS_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1985607qA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1985607qA enumC1985607qA = new EnumC1985607qA("STATUS_UNKNOWN", 0, 0);
        STATUS_UNKNOWN = enumC1985607qA;
        EnumC1985607qA enumC1985607qA2 = new EnumC1985607qA("STATUS_PASS", 1, 1);
        STATUS_PASS = enumC1985607qA2;
        EnumC1985607qA enumC1985607qA3 = new EnumC1985607qA("STATUS_FAIL", 2, 2);
        STATUS_FAIL = enumC1985607qA3;
        EnumC1985607qA[] enumC1985607qAArr = {enumC1985607qA, enumC1985607qA2, enumC1985607qA3};
        LLILLJJLI = enumC1985607qAArr;
        LLILLL = new C2254308sP(enumC1985607qAArr);
    }

    public static EnumC1985607qA[] values() {
        return (EnumC1985607qA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1985607qA valueOf(String str) {
        return (EnumC1985607qA) C08FF.LIZ(EnumC1985607qA.class, str);
    }

    public EnumC1985607qA(String str, int i, int i2) {
        this.LL = i2;
    }
}
