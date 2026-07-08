package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1502800pD4 {
    public static final EnumC1502800pD4 EQUAL_TO;
    public static final EnumC1502800pD4 GREATER_THAN;
    public static final EnumC1502800pD4 GREATER_THAN_OR_EQUAL_TO;
    public static final EnumC1502800pD4 LESS_THAN;
    public static final EnumC1502800pD4 LESS_THAN_OR_EQUAL_TO;
    public static final /* synthetic */ EnumC1502800pD4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1502800pD4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1502800pD4 enumC1502800pD4 = new EnumC1502800pD4("EQUAL_TO", 0);
        EQUAL_TO = enumC1502800pD4;
        EnumC1502800pD4 enumC1502800pD42 = new EnumC1502800pD4("LESS_THAN", 1);
        LESS_THAN = enumC1502800pD42;
        EnumC1502800pD4 enumC1502800pD43 = new EnumC1502800pD4("GREATER_THAN", 2);
        GREATER_THAN = enumC1502800pD43;
        EnumC1502800pD4 enumC1502800pD44 = new EnumC1502800pD4("LESS_THAN_OR_EQUAL_TO", 3);
        LESS_THAN_OR_EQUAL_TO = enumC1502800pD44;
        EnumC1502800pD4 enumC1502800pD45 = new EnumC1502800pD4("GREATER_THAN_OR_EQUAL_TO", 4);
        GREATER_THAN_OR_EQUAL_TO = enumC1502800pD45;
        EnumC1502800pD4[] enumC1502800pD4Arr = {enumC1502800pD4, enumC1502800pD42, enumC1502800pD43, enumC1502800pD44, enumC1502800pD45};
        LL = enumC1502800pD4Arr;
        LLILLJJLI = new C2254308sP(enumC1502800pD4Arr);
    }

    public static EnumC1502800pD4[] values() {
        return (EnumC1502800pD4[]) LL.clone();
    }

    public static EnumC1502800pD4 valueOf(String str) {
        return (EnumC1502800pD4) C08FF.LIZ(EnumC1502800pD4.class, str);
    }

    public EnumC1502800pD4(String str, int i) {
    }
}
