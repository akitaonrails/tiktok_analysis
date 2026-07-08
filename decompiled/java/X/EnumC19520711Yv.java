package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11Yv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19520711Yv {
    public static final EnumC19520711Yv HIDE;
    public static final /* synthetic */ EnumC19520711Yv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19520711Yv SETTING_MODE;
    public static final EnumC19520711Yv VOP_MODE;

    public static InterfaceC2044707zh<EnumC19520711Yv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19520711Yv enumC19520711Yv = new EnumC19520711Yv("HIDE", 0);
        HIDE = enumC19520711Yv;
        EnumC19520711Yv enumC19520711Yv2 = new EnumC19520711Yv("VOP_MODE", 1);
        VOP_MODE = enumC19520711Yv2;
        EnumC19520711Yv enumC19520711Yv3 = new EnumC19520711Yv("SETTING_MODE", 2);
        SETTING_MODE = enumC19520711Yv3;
        EnumC19520711Yv[] enumC19520711YvArr = {enumC19520711Yv, enumC19520711Yv2, enumC19520711Yv3};
        LL = enumC19520711YvArr;
        LLILLJJLI = new C2254308sP(enumC19520711YvArr);
    }

    public static EnumC19520711Yv[] values() {
        return (EnumC19520711Yv[]) LL.clone();
    }

    public static EnumC19520711Yv valueOf(String str) {
        return (EnumC19520711Yv) C08FF.LIZ(EnumC19520711Yv.class, str);
    }

    public EnumC19520711Yv(String str, int i) {
    }
}
