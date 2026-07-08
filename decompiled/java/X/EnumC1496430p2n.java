package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0p2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1496430p2n {
    public static final /* synthetic */ EnumC1496430p2n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1496430p2n NETWORK_BOOT_TO_INIT_TTNET;
    public static final EnumC1496430p2n NETWORK_BOOT_TO_INIT_TTNET_END;
    public static final EnumC1496430p2n NETWORK_INIT_SEC_DURATION;
    public static final EnumC1496430p2n NETWORK_INIT_TO_INIT_TTNET;
    public static final EnumC1496430p2n NETWORK_INIT_TTNET_DURATION;
    public static final EnumC1496430p2n NETWORK_INIT_TTNET_END_TO_NETWORK;
    public static final EnumC1496430p2n NETWORK_METHOD_INIT_TTNET_DURATION;

    public static InterfaceC2044707zh<EnumC1496430p2n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1496430p2n enumC1496430p2n = new EnumC1496430p2n("NETWORK_METHOD_INIT_TTNET_DURATION", 0);
        NETWORK_METHOD_INIT_TTNET_DURATION = enumC1496430p2n;
        EnumC1496430p2n enumC1496430p2n2 = new EnumC1496430p2n("NETWORK_INIT_TO_INIT_TTNET", 1);
        NETWORK_INIT_TO_INIT_TTNET = enumC1496430p2n2;
        EnumC1496430p2n enumC1496430p2n3 = new EnumC1496430p2n("NETWORK_INIT_TTNET_DURATION", 2);
        NETWORK_INIT_TTNET_DURATION = enumC1496430p2n3;
        EnumC1496430p2n enumC1496430p2n4 = new EnumC1496430p2n("NETWORK_BOOT_TO_INIT_TTNET", 3);
        NETWORK_BOOT_TO_INIT_TTNET = enumC1496430p2n4;
        EnumC1496430p2n enumC1496430p2n5 = new EnumC1496430p2n("NETWORK_BOOT_TO_INIT_TTNET_END", 4);
        NETWORK_BOOT_TO_INIT_TTNET_END = enumC1496430p2n5;
        EnumC1496430p2n enumC1496430p2n6 = new EnumC1496430p2n("NETWORK_INIT_TTNET_END_TO_NETWORK", 5);
        NETWORK_INIT_TTNET_END_TO_NETWORK = enumC1496430p2n6;
        EnumC1496430p2n enumC1496430p2n7 = new EnumC1496430p2n("NETWORK_INIT_SEC_DURATION", 6);
        NETWORK_INIT_SEC_DURATION = enumC1496430p2n7;
        EnumC1496430p2n[] enumC1496430p2nArr = {enumC1496430p2n, enumC1496430p2n2, enumC1496430p2n3, enumC1496430p2n4, enumC1496430p2n5, enumC1496430p2n6, enumC1496430p2n7};
        LL = enumC1496430p2nArr;
        LLILLJJLI = new C2254308sP(enumC1496430p2nArr);
    }

    public static EnumC1496430p2n[] values() {
        return (EnumC1496430p2n[]) LL.clone();
    }

    public static EnumC1496430p2n valueOf(String str) {
        return (EnumC1496430p2n) C08FF.LIZ(EnumC1496430p2n.class, str);
    }

    public EnumC1496430p2n(String str, int i) {
    }
}
