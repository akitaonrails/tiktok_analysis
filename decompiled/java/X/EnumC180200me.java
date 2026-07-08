package X;

/* JADX INFO: renamed from: X.00me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC180200me {
    CLICK_DESC_VIEW_MORE_BTN("1"),
    CLICK_DESC_ICON("2"),
    CLICK_DESC_TITLE("3"),
    BACK_FROM_OTHER_PAGES("4");

    public final String LL;

    public String getValue() {
        return this.LL;
    }

    public static EnumC180200me valueOf(String str) {
        return (EnumC180200me) C08FF.LIZ(EnumC180200me.class, str);
    }

    EnumC180200me(String str) {
        this.LL = str;
    }
}
