package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k8P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1307710k8P {
    public static final EnumC1307710k8P GLOBAL;
    public static final /* synthetic */ EnumC1307710k8P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1307710k8P NODE;
    public static final EnumC1307710k8P STRATEGY;
    public static final EnumC1307710k8P UNKNOWN;

    public static InterfaceC2044707zh<EnumC1307710k8P> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1307710k8P enumC1307710k8P = new EnumC1307710k8P("UNKNOWN", 0);
        UNKNOWN = enumC1307710k8P;
        EnumC1307710k8P enumC1307710k8P2 = new EnumC1307710k8P("GLOBAL", 1);
        GLOBAL = enumC1307710k8P2;
        EnumC1307710k8P enumC1307710k8P3 = new EnumC1307710k8P("STRATEGY", 2);
        STRATEGY = enumC1307710k8P3;
        EnumC1307710k8P enumC1307710k8P4 = new EnumC1307710k8P("NODE", 3);
        NODE = enumC1307710k8P4;
        EnumC1307710k8P[] enumC1307710k8PArr = {enumC1307710k8P, enumC1307710k8P2, enumC1307710k8P3, enumC1307710k8P4};
        LL = enumC1307710k8PArr;
        LLILLJJLI = new C2254308sP(enumC1307710k8PArr);
    }

    public static EnumC1307710k8P[] values() {
        return (EnumC1307710k8P[]) LL.clone();
    }

    public static EnumC1307710k8P valueOf(String str) {
        return (EnumC1307710k8P) C08FF.LIZ(EnumC1307710k8P.class, str);
    }

    public EnumC1307710k8P(String str, int i) {
    }
}
