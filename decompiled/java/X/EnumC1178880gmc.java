package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1178880gmc {
    public static final /* synthetic */ EnumC1178880gmc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1178880gmc REASON_API_ANIMATION;
    public static final EnumC1178880gmc REASON_DEVELOPER_ANIMATION;
    public static final EnumC1178880gmc REASON_GESTURE;
    public static final EnumC1178880gmc UNKNOWN;

    public static InterfaceC2044707zh<EnumC1178880gmc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1178880gmc enumC1178880gmc = new EnumC1178880gmc("REASON_GESTURE", 0);
        REASON_GESTURE = enumC1178880gmc;
        EnumC1178880gmc enumC1178880gmc2 = new EnumC1178880gmc("REASON_API_ANIMATION", 1);
        REASON_API_ANIMATION = enumC1178880gmc2;
        EnumC1178880gmc enumC1178880gmc3 = new EnumC1178880gmc("REASON_DEVELOPER_ANIMATION", 2);
        REASON_DEVELOPER_ANIMATION = enumC1178880gmc3;
        EnumC1178880gmc enumC1178880gmc4 = new EnumC1178880gmc("UNKNOWN", 3);
        UNKNOWN = enumC1178880gmc4;
        EnumC1178880gmc[] enumC1178880gmcArr = {enumC1178880gmc, enumC1178880gmc2, enumC1178880gmc3, enumC1178880gmc4};
        LL = enumC1178880gmcArr;
        LLILLJJLI = new C2254308sP(enumC1178880gmcArr);
    }

    public static EnumC1178880gmc[] values() {
        return (EnumC1178880gmc[]) LL.clone();
    }

    public static EnumC1178880gmc valueOf(String str) {
        return (EnumC1178880gmc) C08FF.LIZ(EnumC1178880gmc.class, str);
    }

    public EnumC1178880gmc(String str, int i) {
    }
}
