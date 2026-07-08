package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ts9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC760350Ts9 {
    public static final EnumC760350Ts9 DP;
    public static final /* synthetic */ EnumC760350Ts9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC760350Ts9 PERCENT;
    public static final EnumC760350Ts9 RPX;

    public static InterfaceC2044707zh<EnumC760350Ts9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC760350Ts9 enumC760350Ts9 = new EnumC760350Ts9("DP", 0);
        DP = enumC760350Ts9;
        EnumC760350Ts9 enumC760350Ts92 = new EnumC760350Ts9("PERCENT", 1);
        PERCENT = enumC760350Ts92;
        EnumC760350Ts9 enumC760350Ts93 = new EnumC760350Ts9("RPX", 2);
        RPX = enumC760350Ts93;
        EnumC760350Ts9[] enumC760350Ts9Arr = {enumC760350Ts9, enumC760350Ts92, enumC760350Ts93};
        LL = enumC760350Ts9Arr;
        LLILLJJLI = new C2254308sP(enumC760350Ts9Arr);
    }

    public static EnumC760350Ts9[] values() {
        return (EnumC760350Ts9[]) LL.clone();
    }

    public static EnumC760350Ts9 valueOf(String str) {
        return (EnumC760350Ts9) C08FF.LIZ(EnumC760350Ts9.class, str);
    }

    public EnumC760350Ts9(String str, int i) {
    }
}
