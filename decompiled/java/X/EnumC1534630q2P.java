package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1534630q2P {
    public static final EnumC1534630q2P AUTO_META;
    public static final EnumC1534630q2P FORCE_BYTES;
    public static final EnumC1534630q2P FORCE_CONTINUOUS;
    public static final EnumC1534630q2P FORCE_DISCRETE;
    public static final /* synthetic */ EnumC1534630q2P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1534630q2P> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1534630q2P enumC1534630q2P = new EnumC1534630q2P("AUTO_META", 0);
        AUTO_META = enumC1534630q2P;
        EnumC1534630q2P enumC1534630q2P2 = new EnumC1534630q2P("FORCE_CONTINUOUS", 1);
        FORCE_CONTINUOUS = enumC1534630q2P2;
        EnumC1534630q2P enumC1534630q2P3 = new EnumC1534630q2P("FORCE_DISCRETE", 2);
        FORCE_DISCRETE = enumC1534630q2P3;
        EnumC1534630q2P enumC1534630q2P4 = new EnumC1534630q2P("FORCE_BYTES", 3);
        FORCE_BYTES = enumC1534630q2P4;
        EnumC1534630q2P[] enumC1534630q2PArr = {enumC1534630q2P, enumC1534630q2P2, enumC1534630q2P3, enumC1534630q2P4};
        LL = enumC1534630q2PArr;
        LLILLJJLI = new C2254308sP(enumC1534630q2PArr);
    }

    public static EnumC1534630q2P[] values() {
        return (EnumC1534630q2P[]) LL.clone();
    }

    public static EnumC1534630q2P valueOf(String str) {
        return (EnumC1534630q2P) C08FF.LIZ(EnumC1534630q2P.class, str);
    }

    public EnumC1534630q2P(String str, int i) {
    }
}
