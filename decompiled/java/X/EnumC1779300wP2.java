package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wP2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779300wP2 {
    public static final EnumC1779300wP2 FIFTEEN_MINS;
    public static final /* synthetic */ EnumC1779300wP2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779300wP2 ONE_HOUR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779300wP2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779300wP2 enumC1779300wP2 = new EnumC1779300wP2("ONE_HOUR", 0, 0);
        ONE_HOUR = enumC1779300wP2;
        EnumC1779300wP2 enumC1779300wP22 = new EnumC1779300wP2("FIFTEEN_MINS", 1, 1);
        FIFTEEN_MINS = enumC1779300wP22;
        EnumC1779300wP2[] enumC1779300wP2Arr = {enumC1779300wP2, enumC1779300wP22};
        LLILLJJLI = enumC1779300wP2Arr;
        LLILLL = new C2254308sP(enumC1779300wP2Arr);
    }

    public static EnumC1779300wP2[] values() {
        return (EnumC1779300wP2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1779300wP2 valueOf(String str) {
        return (EnumC1779300wP2) C08FF.LIZ(EnumC1779300wP2.class, str);
    }

    public EnumC1779300wP2(String str, int i, int i2) {
        this.LL = i2;
    }
}
