package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1058004Bu {
    public static final EnumC1058004Bu AUTO_REFRESH_MODE;
    public static final /* synthetic */ EnumC1058004Bu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1058004Bu NO_REFRESH_MODE;
    public static final EnumC1058004Bu UNKNOWN_MODE;
    public int LL;

    public static InterfaceC2044707zh<EnumC1058004Bu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1058004Bu enumC1058004Bu = new EnumC1058004Bu("UNKNOWN_MODE", 0, 0);
        UNKNOWN_MODE = enumC1058004Bu;
        EnumC1058004Bu enumC1058004Bu2 = new EnumC1058004Bu("AUTO_REFRESH_MODE", 1, 1);
        AUTO_REFRESH_MODE = enumC1058004Bu2;
        EnumC1058004Bu enumC1058004Bu3 = new EnumC1058004Bu("NO_REFRESH_MODE", 2, 2);
        NO_REFRESH_MODE = enumC1058004Bu3;
        EnumC1058004Bu[] enumC1058004BuArr = {enumC1058004Bu, enumC1058004Bu2, enumC1058004Bu3};
        LLILLJJLI = enumC1058004BuArr;
        LLILLL = new C2254308sP(enumC1058004BuArr);
    }

    public static EnumC1058004Bu[] values() {
        return (EnumC1058004Bu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1058004Bu valueOf(String str) {
        return (EnumC1058004Bu) C08FF.LIZ(EnumC1058004Bu.class, str);
    }

    public final void setValue(int i) {
        this.LL = i;
    }

    public EnumC1058004Bu(String str, int i, int i2) {
        this.LL = i2;
    }
}
