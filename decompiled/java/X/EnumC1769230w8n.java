package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1769230w8n {
    public static final EnumC1769230w8n BASE_BADGE;
    public static final EnumC1769230w8n BASE_ICON;
    public static final EnumC1769230w8n BASE_TOOLTIP;
    public static final /* synthetic */ EnumC1769230w8n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1769230w8n VIDEO_GUIDE_MASK;
    public static final EnumC1769230w8n VOUCHER_TOOLTIP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1769230w8n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1769230w8n enumC1769230w8n = new EnumC1769230w8n("BASE_TOOLTIP", 0, "base_tooltip");
        BASE_TOOLTIP = enumC1769230w8n;
        EnumC1769230w8n enumC1769230w8n2 = new EnumC1769230w8n("VOUCHER_TOOLTIP", 1, "voucher_tooltip");
        VOUCHER_TOOLTIP = enumC1769230w8n2;
        EnumC1769230w8n enumC1769230w8n3 = new EnumC1769230w8n("VIDEO_GUIDE_MASK", 2, "video_guide_mask");
        VIDEO_GUIDE_MASK = enumC1769230w8n3;
        EnumC1769230w8n enumC1769230w8n4 = new EnumC1769230w8n("BASE_ICON", 3, "base_icon");
        BASE_ICON = enumC1769230w8n4;
        EnumC1769230w8n enumC1769230w8n5 = new EnumC1769230w8n("BASE_BADGE", 4, "base_badge");
        BASE_BADGE = enumC1769230w8n5;
        EnumC1769230w8n[] enumC1769230w8nArr = {enumC1769230w8n, enumC1769230w8n2, enumC1769230w8n3, enumC1769230w8n4, enumC1769230w8n5};
        LLILLJJLI = enumC1769230w8nArr;
        LLILLL = new C2254308sP(enumC1769230w8nArr);
    }

    public static EnumC1769230w8n[] values() {
        return (EnumC1769230w8n[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1769230w8n valueOf(String str) {
        return (EnumC1769230w8n) C08FF.LIZ(EnumC1769230w8n.class, str);
    }

    public EnumC1769230w8n(String str, int i, String str2) {
        this.LL = str2;
    }
}
