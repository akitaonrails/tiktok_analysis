package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20158813uE {
    public static final C20159113uH Companion;
    public static final EnumC20158813uE DP;
    public static final /* synthetic */ EnumC20158813uE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20158813uE PIX;
    public static final EnumC20158813uE RPX;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20158813uE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20158813uE enumC20158813uE = new EnumC20158813uE("PIX", 0, "");
        PIX = enumC20158813uE;
        EnumC20158813uE enumC20158813uE2 = new EnumC20158813uE("DP", 1, "dp");
        DP = enumC20158813uE2;
        EnumC20158813uE enumC20158813uE3 = new EnumC20158813uE("RPX", 2, "rpx");
        RPX = enumC20158813uE3;
        EnumC20158813uE[] enumC20158813uEArr = {enumC20158813uE, enumC20158813uE2, enumC20158813uE3};
        LLILLJJLI = enumC20158813uEArr;
        LLILLL = new C2254308sP(enumC20158813uEArr);
        Companion = new C20159113uH();
    }

    public static EnumC20158813uE[] values() {
        return (EnumC20158813uE[]) LLILLJJLI.clone();
    }

    public final boolean isAdaptive() {
        return this == DP || this == RPX;
    }

    public final String getSuffix() {
        return this.LL;
    }

    public static EnumC20158813uE valueOf(String str) {
        return (EnumC20158813uE) C08FF.LIZ(EnumC20158813uE.class, str);
    }

    public EnumC20158813uE(String str, int i, String str2) {
        this.LL = str2;
    }
}
