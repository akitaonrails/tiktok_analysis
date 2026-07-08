package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09n0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2475609n0 {
    public static final EnumC2475609n0 ASPECT_FILL;
    public static final EnumC2475609n0 ASPECT_FIT;
    public static final EnumC2475609n0 ASPECT_WIDTH;
    public static final EnumC2475609n0 CENTER_ZOOM;
    public static final EnumC2475609n0 FREE_MODE;
    public static final /* synthetic */ EnumC2475609n0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2475609n0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2475609n0 enumC2475609n0 = new EnumC2475609n0("ASPECT_FILL", 0);
        ASPECT_FILL = enumC2475609n0;
        EnumC2475609n0 enumC2475609n02 = new EnumC2475609n0("ASPECT_WIDTH", 1);
        ASPECT_WIDTH = enumC2475609n02;
        EnumC2475609n0 enumC2475609n03 = new EnumC2475609n0("ASPECT_FIT", 2);
        ASPECT_FIT = enumC2475609n03;
        EnumC2475609n0 enumC2475609n04 = new EnumC2475609n0("FREE_MODE", 3);
        FREE_MODE = enumC2475609n04;
        EnumC2475609n0 enumC2475609n05 = new EnumC2475609n0("CENTER_ZOOM", 4);
        CENTER_ZOOM = enumC2475609n05;
        EnumC2475609n0[] enumC2475609n0Arr = {enumC2475609n0, enumC2475609n02, enumC2475609n03, enumC2475609n04, enumC2475609n05};
        LL = enumC2475609n0Arr;
        LLILLJJLI = new C2254308sP(enumC2475609n0Arr);
    }

    public static EnumC2475609n0[] values() {
        return (EnumC2475609n0[]) LL.clone();
    }

    public static EnumC2475609n0 valueOf(String str) {
        return (EnumC2475609n0) C08FF.LIZ(EnumC2475609n0.class, str);
    }

    public EnumC2475609n0(String str, int i) {
    }
}
