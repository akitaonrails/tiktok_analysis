package X;

/* JADX INFO: renamed from: X.18BX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C18BX {
    FINDER("finder"),
    TOP_PAGE("top_page"),
    LAST_BTM_ID("last_btm_id"),
    SOURCE_BTM_TOKEN("source_btm_token");

    public final String LL;

    public static C18BX valueOf(String str) {
        return (C18BX) C08FF.LIZ(C18BX.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    C18BX(String str) {
        this.LL = str;
    }
}
