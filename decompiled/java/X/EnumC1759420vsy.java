package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1759420vsy {
    public static final EnumC1759420vsy BOTTOM_BANNER;
    public static final EnumC1759420vsy BOTTOM_SHEET;
    public static final EnumC1759420vsy FLOATING_LAYER;
    public static final /* synthetic */ EnumC1759420vsy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1759420vsy LYNX_FLOATING_LAYER;
    public static final EnumC1759420vsy LYNX_FLOATING_LAYER_BOTTOM_ONLY;
    public static final EnumC1759420vsy LYNX_SHEET;
    public static final EnumC1759420vsy SEA_PDP_MYNA_BOTTOM_BANNER;
    public static final EnumC1759420vsy SEA_PENDANT;
    public static final EnumC1759420vsy SEA_POPUP;
    public static final EnumC1759420vsy TOAST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1759420vsy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1759420vsy enumC1759420vsy = new EnumC1759420vsy("FLOATING_LAYER", 0, 1);
        FLOATING_LAYER = enumC1759420vsy;
        EnumC1759420vsy enumC1759420vsy2 = new EnumC1759420vsy("BOTTOM_SHEET", 1, 2);
        BOTTOM_SHEET = enumC1759420vsy2;
        EnumC1759420vsy enumC1759420vsy3 = new EnumC1759420vsy("TOAST", 2, 3);
        TOAST = enumC1759420vsy3;
        EnumC1759420vsy enumC1759420vsy4 = new EnumC1759420vsy("LYNX_SHEET", 3, 4);
        LYNX_SHEET = enumC1759420vsy4;
        EnumC1759420vsy enumC1759420vsy5 = new EnumC1759420vsy("LYNX_FLOATING_LAYER", 4, 6);
        LYNX_FLOATING_LAYER = enumC1759420vsy5;
        EnumC1759420vsy enumC1759420vsy6 = new EnumC1759420vsy("LYNX_FLOATING_LAYER_BOTTOM_ONLY", 5, 7);
        LYNX_FLOATING_LAYER_BOTTOM_ONLY = enumC1759420vsy6;
        EnumC1759420vsy enumC1759420vsy7 = new EnumC1759420vsy("SEA_POPUP", 6, 8);
        SEA_POPUP = enumC1759420vsy7;
        EnumC1759420vsy enumC1759420vsy8 = new EnumC1759420vsy("SEA_PENDANT", 7, 9);
        SEA_PENDANT = enumC1759420vsy8;
        EnumC1759420vsy enumC1759420vsy9 = new EnumC1759420vsy("SEA_PDP_MYNA_BOTTOM_BANNER", 8, 10);
        SEA_PDP_MYNA_BOTTOM_BANNER = enumC1759420vsy9;
        EnumC1759420vsy enumC1759420vsy10 = new EnumC1759420vsy("BOTTOM_BANNER", 9, 11);
        BOTTOM_BANNER = enumC1759420vsy10;
        EnumC1759420vsy[] enumC1759420vsyArr = {enumC1759420vsy, enumC1759420vsy2, enumC1759420vsy3, enumC1759420vsy4, enumC1759420vsy5, enumC1759420vsy6, enumC1759420vsy7, enumC1759420vsy8, enumC1759420vsy9, enumC1759420vsy10};
        LLILLJJLI = enumC1759420vsyArr;
        LLILLL = new C2254308sP(enumC1759420vsyArr);
    }

    public static EnumC1759420vsy[] values() {
        return (EnumC1759420vsy[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1759420vsy valueOf(String str) {
        return (EnumC1759420vsy) C08FF.LIZ(EnumC1759420vsy.class, str);
    }

    public EnumC1759420vsy(String str, int i, int i2) {
        this.LL = i2;
    }
}
