package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u1P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1687770u1P {
    public static final EnumC1687770u1P DENIED;
    public static final EnumC1687770u1P GRANTED;
    public static final /* synthetic */ EnumC1687770u1P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1687770u1P NO_APP_PERMISSION;
    public static final EnumC1687770u1P NO_SYSTEM_PERMISSION;
    public static final EnumC1687770u1P UNKNOWN;

    public static InterfaceC2044707zh<EnumC1687770u1P> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1687770u1P enumC1687770u1P = new EnumC1687770u1P("UNKNOWN", 0);
        UNKNOWN = enumC1687770u1P;
        EnumC1687770u1P enumC1687770u1P2 = new EnumC1687770u1P("NO_APP_PERMISSION", 1);
        NO_APP_PERMISSION = enumC1687770u1P2;
        EnumC1687770u1P enumC1687770u1P3 = new EnumC1687770u1P("NO_SYSTEM_PERMISSION", 2);
        NO_SYSTEM_PERMISSION = enumC1687770u1P3;
        EnumC1687770u1P enumC1687770u1P4 = new EnumC1687770u1P("GRANTED", 3);
        GRANTED = enumC1687770u1P4;
        EnumC1687770u1P enumC1687770u1P5 = new EnumC1687770u1P("DENIED", 4);
        DENIED = enumC1687770u1P5;
        EnumC1687770u1P[] enumC1687770u1PArr = {enumC1687770u1P, enumC1687770u1P2, enumC1687770u1P3, enumC1687770u1P4, enumC1687770u1P5};
        LL = enumC1687770u1PArr;
        LLILLJJLI = new C2254308sP(enumC1687770u1PArr);
    }

    public static EnumC1687770u1P[] values() {
        return (EnumC1687770u1P[]) LL.clone();
    }

    public static EnumC1687770u1P valueOf(String str) {
        return (EnumC1687770u1P) C08FF.LIZ(EnumC1687770u1P.class, str);
    }

    public EnumC1687770u1P(String str, int i) {
    }
}
