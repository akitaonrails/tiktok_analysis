package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779120wOk {
    public static final EnumC1779120wOk ANCHOR_EMPTY_ICON;
    public static final EnumC1779120wOk ANCHOR_EMPTY_SUBTITLE;
    public static final EnumC1779120wOk ANCHOR_EMPTY_THUMBNAIL;
    public static final EnumC1779120wOk ANCHOR_EMPTY_TITLE;
    public static final EnumC1779120wOk ANCHOR_FCP_INVALID_KEY;
    public static final EnumC1779120wOk ANCHOR_FILTER_REASON;
    public static final /* synthetic */ EnumC1779120wOk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1779120wOk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779120wOk enumC1779120wOk = new EnumC1779120wOk("ANCHOR_FCP_INVALID_KEY", 0, "fcp_invalid_component_key");
        ANCHOR_FCP_INVALID_KEY = enumC1779120wOk;
        EnumC1779120wOk enumC1779120wOk2 = new EnumC1779120wOk("ANCHOR_EMPTY_TITLE", 1, "anchor_empty_title");
        ANCHOR_EMPTY_TITLE = enumC1779120wOk2;
        EnumC1779120wOk enumC1779120wOk3 = new EnumC1779120wOk("ANCHOR_EMPTY_SUBTITLE", 2, "anchor_empty_subtitle");
        ANCHOR_EMPTY_SUBTITLE = enumC1779120wOk3;
        EnumC1779120wOk enumC1779120wOk4 = new EnumC1779120wOk("ANCHOR_EMPTY_ICON", 3, "anchor_empty_icon");
        ANCHOR_EMPTY_ICON = enumC1779120wOk4;
        EnumC1779120wOk enumC1779120wOk5 = new EnumC1779120wOk("ANCHOR_EMPTY_THUMBNAIL", 4, "anchor_empty_thumbnail");
        ANCHOR_EMPTY_THUMBNAIL = enumC1779120wOk5;
        EnumC1779120wOk enumC1779120wOk6 = new EnumC1779120wOk("ANCHOR_FILTER_REASON", 5, "anchor_filter_reason");
        ANCHOR_FILTER_REASON = enumC1779120wOk6;
        EnumC1779120wOk[] enumC1779120wOkArr = {enumC1779120wOk, enumC1779120wOk2, enumC1779120wOk3, enumC1779120wOk4, enumC1779120wOk5, enumC1779120wOk6};
        LLILLJJLI = enumC1779120wOkArr;
        LLILLL = new C2254308sP(enumC1779120wOkArr);
    }

    public static EnumC1779120wOk[] values() {
        return (EnumC1779120wOk[]) LLILLJJLI.clone();
    }

    public final String getCategoryName() {
        return this.LL;
    }

    public static EnumC1779120wOk valueOf(String str) {
        return (EnumC1779120wOk) C08FF.LIZ(EnumC1779120wOk.class, str);
    }

    public EnumC1779120wOk(String str, int i, String str2) {
        this.LL = str2;
    }
}
