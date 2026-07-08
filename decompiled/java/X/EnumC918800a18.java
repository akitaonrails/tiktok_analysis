package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918800a18 {
    public static final EnumC918800a18 LINE_UP;
    public static final EnumC918800a18 LINK_MIC_ANCHOR;
    public static final EnumC918800a18 LINK_MIC_GUEST;
    public static final EnumC918800a18 LINK_MIC_PK;
    public static final /* synthetic */ EnumC918800a18[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC918800a18 NORMAL_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC918800a18> getEntries() {
        return LLILLL;
    }

    static {
        EnumC918800a18 enumC918800a18 = new EnumC918800a18("NORMAL_VIDEO", 0, "normal_video_live");
        NORMAL_VIDEO = enumC918800a18;
        EnumC918800a18 enumC918800a182 = new EnumC918800a18("LINE_UP", 1, "video_anchor_order");
        LINE_UP = enumC918800a182;
        EnumC918800a18 enumC918800a183 = new EnumC918800a18("LINK_MIC_ANCHOR", 2, "video_anchor_connect");
        LINK_MIC_ANCHOR = enumC918800a183;
        EnumC918800a18 enumC918800a184 = new EnumC918800a18("LINK_MIC_PK", 3, "video_anchor_pk");
        LINK_MIC_PK = enumC918800a184;
        EnumC918800a18 enumC918800a185 = new EnumC918800a18("LINK_MIC_GUEST", 4, "video_anchor_guest_connect");
        LINK_MIC_GUEST = enumC918800a185;
        EnumC918800a18[] enumC918800a18Arr = {enumC918800a18, enumC918800a182, enumC918800a183, enumC918800a184, enumC918800a185};
        LLILLJJLI = enumC918800a18Arr;
        LLILLL = new C2254308sP(enumC918800a18Arr);
    }

    public static EnumC918800a18[] values() {
        return (EnumC918800a18[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC918800a18 valueOf(String str) {
        return (EnumC918800a18) C08FF.LIZ(EnumC918800a18.class, str);
    }

    public EnumC918800a18(String str, int i, String str2) {
        this.LL = str2;
    }
}
