package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1570650qyV {
    public static final EnumC1570650qyV BACK_PRESS;
    public static final EnumC1570650qyV CLICK_MASK;
    public static final EnumC1570650qyV ENTER_BACKGROUND;
    public static final /* synthetic */ EnumC1570650qyV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1570650qyV SLIDE_LEFT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1570650qyV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1570650qyV enumC1570650qyV = new EnumC1570650qyV("SLIDE_LEFT", 0, "slide_left");
        SLIDE_LEFT = enumC1570650qyV;
        EnumC1570650qyV enumC1570650qyV2 = new EnumC1570650qyV("BACK_PRESS", 1, "slide_left");
        BACK_PRESS = enumC1570650qyV2;
        EnumC1570650qyV enumC1570650qyV3 = new EnumC1570650qyV("CLICK_MASK", 2, "click");
        CLICK_MASK = enumC1570650qyV3;
        EnumC1570650qyV enumC1570650qyV4 = new EnumC1570650qyV("ENTER_BACKGROUND", 3, "exit_background");
        ENTER_BACKGROUND = enumC1570650qyV4;
        EnumC1570650qyV[] enumC1570650qyVArr = {enumC1570650qyV, enumC1570650qyV2, enumC1570650qyV3, enumC1570650qyV4};
        LLILLJJLI = enumC1570650qyVArr;
        LLILLL = new C2254308sP(enumC1570650qyVArr);
    }

    public static EnumC1570650qyV[] values() {
        return (EnumC1570650qyV[]) LLILLJJLI.clone();
    }

    public final String getMethod() {
        return this.LL;
    }

    public static EnumC1570650qyV valueOf(String str) {
        return (EnumC1570650qyV) C08FF.LIZ(EnumC1570650qyV.class, str);
    }

    public EnumC1570650qyV(String str, int i, String str2) {
        this.LL = str2;
    }
}
