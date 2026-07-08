package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356060Dxc {
    public static final /* synthetic */ EnumC356060Dxc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356060Dxc MV_ALGORITHM;
    public static final EnumC356060Dxc MV_MUSIC;
    public static final EnumC356060Dxc MV_NORMAL;

    public static InterfaceC2044707zh<EnumC356060Dxc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356060Dxc enumC356060Dxc = new EnumC356060Dxc("MV_NORMAL", 0);
        MV_NORMAL = enumC356060Dxc;
        EnumC356060Dxc enumC356060Dxc2 = new EnumC356060Dxc("MV_ALGORITHM", 1);
        MV_ALGORITHM = enumC356060Dxc2;
        EnumC356060Dxc enumC356060Dxc3 = new EnumC356060Dxc("MV_MUSIC", 2);
        MV_MUSIC = enumC356060Dxc3;
        EnumC356060Dxc[] enumC356060DxcArr = {enumC356060Dxc, enumC356060Dxc2, enumC356060Dxc3};
        LL = enumC356060DxcArr;
        LLILLJJLI = new C2254308sP(enumC356060DxcArr);
    }

    public static EnumC356060Dxc[] values() {
        return (EnumC356060Dxc[]) LL.clone();
    }

    public static EnumC356060Dxc valueOf(String str) {
        return (EnumC356060Dxc) C08FF.LIZ(EnumC356060Dxc.class, str);
    }

    public EnumC356060Dxc(String str, int i) {
    }
}
