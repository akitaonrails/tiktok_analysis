package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992640bwE {
    public static final EnumC992640bwE ADDRESS;
    public static final /* synthetic */ EnumC992640bwE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992640bwE PAYMENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992640bwE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992640bwE enumC992640bwE = new EnumC992640bwE("ADDRESS", 0, 1);
        ADDRESS = enumC992640bwE;
        EnumC992640bwE enumC992640bwE2 = new EnumC992640bwE("PAYMENT", 1, 2);
        PAYMENT = enumC992640bwE2;
        EnumC992640bwE[] enumC992640bwEArr = {enumC992640bwE, enumC992640bwE2};
        LLILLJJLI = enumC992640bwEArr;
        LLILLL = new C2254308sP(enumC992640bwEArr);
    }

    public static EnumC992640bwE[] values() {
        return (EnumC992640bwE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992640bwE valueOf(String str) {
        return (EnumC992640bwE) C08FF.LIZ(EnumC992640bwE.class, str);
    }

    public EnumC992640bwE(String str, int i, int i2) {
        this.LL = i2;
    }
}
