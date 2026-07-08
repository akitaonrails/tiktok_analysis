package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04Bt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1057904Bt {
    public static final /* synthetic */ EnumC1057904Bt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1057904Bt LYNX_AIR;
    public static final EnumC1057904Bt NATIVE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1057904Bt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1057904Bt enumC1057904Bt = new EnumC1057904Bt("NATIVE", 0, 0);
        NATIVE = enumC1057904Bt;
        EnumC1057904Bt enumC1057904Bt2 = new EnumC1057904Bt("LYNX_AIR", 1, 1);
        LYNX_AIR = enumC1057904Bt2;
        EnumC1057904Bt[] enumC1057904BtArr = {enumC1057904Bt, enumC1057904Bt2};
        LLILLJJLI = enumC1057904BtArr;
        LLILLL = new C2254308sP(enumC1057904BtArr);
    }

    public static EnumC1057904Bt[] values() {
        return (EnumC1057904Bt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1057904Bt valueOf(String str) {
        return (EnumC1057904Bt) C08FF.LIZ(EnumC1057904Bt.class, str);
    }

    public EnumC1057904Bt(String str, int i, int i2) {
        this.LL = i2;
    }
}
