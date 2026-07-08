package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1227730i3P {
    public static final /* synthetic */ EnumC1227730i3P[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1227730i3P MAIN;
    public static final EnumC1227730i3P SECONDARY;

    public static InterfaceC2044707zh<EnumC1227730i3P> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1227730i3P enumC1227730i3P = new EnumC1227730i3P("MAIN", 0);
        MAIN = enumC1227730i3P;
        EnumC1227730i3P enumC1227730i3P2 = new EnumC1227730i3P("SECONDARY", 1);
        SECONDARY = enumC1227730i3P2;
        EnumC1227730i3P[] enumC1227730i3PArr = {enumC1227730i3P, enumC1227730i3P2};
        LL = enumC1227730i3PArr;
        LLILLJJLI = new C2254308sP(enumC1227730i3PArr);
    }

    public static EnumC1227730i3P[] values() {
        return (EnumC1227730i3P[]) LL.clone();
    }

    public static EnumC1227730i3P valueOf(String str) {
        return (EnumC1227730i3P) C08FF.LIZ(EnumC1227730i3P.class, str);
    }

    public EnumC1227730i3P(String str, int i) {
    }
}
