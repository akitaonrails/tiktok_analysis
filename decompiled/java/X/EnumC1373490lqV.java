package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1373490lqV {
    public static final /* synthetic */ EnumC1373490lqV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1373490lqV LONG_PRESS;
    public static final EnumC1373490lqV NONE;
    public static final EnumC1373490lqV NORMAL_SHARE;

    public static InterfaceC2044707zh<EnumC1373490lqV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1373490lqV enumC1373490lqV = new EnumC1373490lqV("NONE", 0);
        NONE = enumC1373490lqV;
        EnumC1373490lqV enumC1373490lqV2 = new EnumC1373490lqV("LONG_PRESS", 1);
        LONG_PRESS = enumC1373490lqV2;
        EnumC1373490lqV enumC1373490lqV3 = new EnumC1373490lqV("NORMAL_SHARE", 2);
        NORMAL_SHARE = enumC1373490lqV3;
        EnumC1373490lqV[] enumC1373490lqVArr = {enumC1373490lqV, enumC1373490lqV2, enumC1373490lqV3};
        LL = enumC1373490lqVArr;
        LLILLJJLI = new C2254308sP(enumC1373490lqVArr);
    }

    public static EnumC1373490lqV[] values() {
        return (EnumC1373490lqV[]) LL.clone();
    }

    public static EnumC1373490lqV valueOf(String str) {
        return (EnumC1373490lqV) C08FF.LIZ(EnumC1373490lqV.class, str);
    }

    public EnumC1373490lqV(String str, int i) {
    }
}
