package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC362430EIv {
    public static final EnumC362430EIv CANCEL;
    public static final EnumC362430EIv CLICK_ANIMATION;
    public static final EnumC362430EIv CLICK_EDIT;
    public static final EnumC362430EIv CLICK_START;
    public static final /* synthetic */ EnumC362430EIv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC362430EIv SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC362430EIv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC362430EIv enumC362430EIv = new EnumC362430EIv("SHOW", 0, "show");
        SHOW = enumC362430EIv;
        EnumC362430EIv enumC362430EIv2 = new EnumC362430EIv("CLICK_START", 1, "click_start");
        CLICK_START = enumC362430EIv2;
        EnumC362430EIv enumC362430EIv3 = new EnumC362430EIv("CLICK_EDIT", 2, "click_guide1");
        CLICK_EDIT = enumC362430EIv3;
        EnumC362430EIv enumC362430EIv4 = new EnumC362430EIv("CLICK_ANIMATION", 3, "click_guide2");
        CLICK_ANIMATION = enumC362430EIv4;
        EnumC362430EIv enumC362430EIv5 = new EnumC362430EIv("CANCEL", 4, "cancel");
        CANCEL = enumC362430EIv5;
        EnumC362430EIv[] enumC362430EIvArr = {enumC362430EIv, enumC362430EIv2, enumC362430EIv3, enumC362430EIv4, enumC362430EIv5};
        LLILLJJLI = enumC362430EIvArr;
        LLILLL = new C2254308sP(enumC362430EIvArr);
    }

    public static EnumC362430EIv[] values() {
        return (EnumC362430EIv[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC362430EIv valueOf(String str) {
        return (EnumC362430EIv) C08FF.LIZ(EnumC362430EIv.class, str);
    }

    public EnumC362430EIv(String str, int i, String str2) {
        this.LL = str2;
    }
}
