package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1647040sxi {
    public static final EnumC1647040sxi CAMERA_FIRST_FRAME;
    public static final /* synthetic */ EnumC1647040sxi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1647040sxi UI_FIRST_FRAME;

    public static InterfaceC2044707zh<EnumC1647040sxi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1647040sxi enumC1647040sxi = new EnumC1647040sxi("CAMERA_FIRST_FRAME", 0);
        CAMERA_FIRST_FRAME = enumC1647040sxi;
        EnumC1647040sxi enumC1647040sxi2 = new EnumC1647040sxi("UI_FIRST_FRAME", 1);
        UI_FIRST_FRAME = enumC1647040sxi2;
        EnumC1647040sxi[] enumC1647040sxiArr = {enumC1647040sxi, enumC1647040sxi2};
        LL = enumC1647040sxiArr;
        LLILLJJLI = new C2254308sP(enumC1647040sxiArr);
    }

    public static EnumC1647040sxi[] values() {
        return (EnumC1647040sxi[]) LL.clone();
    }

    public static EnumC1647040sxi valueOf(String str) {
        return (EnumC1647040sxi) C08FF.LIZ(EnumC1647040sxi.class, str);
    }

    public EnumC1647040sxi(String str, int i) {
    }
}
