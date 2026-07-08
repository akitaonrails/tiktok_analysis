package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1131780fYe {
    public static final EnumC1131780fYe INSUFFICIENT;
    public static final EnumC1131780fYe INSUFFICIENT_EXCHANGE;
    public static final /* synthetic */ EnumC1131780fYe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1131780fYe SUFFICIENT_COINS;
    public static final EnumC1131780fYe SUFFICIENT_EXCHANGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1131780fYe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1131780fYe enumC1131780fYe = new EnumC1131780fYe("INSUFFICIENT", 0, 0);
        INSUFFICIENT = enumC1131780fYe;
        EnumC1131780fYe enumC1131780fYe2 = new EnumC1131780fYe("INSUFFICIENT_EXCHANGE", 1, 1);
        INSUFFICIENT_EXCHANGE = enumC1131780fYe2;
        EnumC1131780fYe enumC1131780fYe3 = new EnumC1131780fYe("SUFFICIENT_COINS", 2, 2);
        SUFFICIENT_COINS = enumC1131780fYe3;
        EnumC1131780fYe enumC1131780fYe4 = new EnumC1131780fYe("SUFFICIENT_EXCHANGE", 3, 3);
        SUFFICIENT_EXCHANGE = enumC1131780fYe4;
        EnumC1131780fYe[] enumC1131780fYeArr = {enumC1131780fYe, enumC1131780fYe2, enumC1131780fYe3, enumC1131780fYe4};
        LLILLJJLI = enumC1131780fYeArr;
        LLILLL = new C2254308sP(enumC1131780fYeArr);
    }

    public static EnumC1131780fYe[] values() {
        return (EnumC1131780fYe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1131780fYe valueOf(String str) {
        return (EnumC1131780fYe) C08FF.LIZ(EnumC1131780fYe.class, str);
    }

    public EnumC1131780fYe(String str, int i, int i2) {
        this.LL = i2;
    }
}
