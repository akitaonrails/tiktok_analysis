package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114700c5 {
    public static final /* synthetic */ EnumC114700c5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC114700c5 NEW_CUSTOMER;
    public static final EnumC114700c5 OLD_CUSTOMER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC114700c5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC114700c5 enumC114700c5 = new EnumC114700c5("NEW_CUSTOMER", 0, 1);
        NEW_CUSTOMER = enumC114700c5;
        EnumC114700c5 enumC114700c52 = new EnumC114700c5("OLD_CUSTOMER", 1, 2);
        OLD_CUSTOMER = enumC114700c52;
        EnumC114700c5[] enumC114700c5Arr = {enumC114700c5, enumC114700c52};
        LLILLJJLI = enumC114700c5Arr;
        LLILLL = new C2254308sP(enumC114700c5Arr);
    }

    public static EnumC114700c5[] values() {
        return (EnumC114700c5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC114700c5 valueOf(String str) {
        return (EnumC114700c5) C08FF.LIZ(EnumC114700c5.class, str);
    }

    public EnumC114700c5(String str, int i, int i2) {
        this.LL = i2;
    }
}
