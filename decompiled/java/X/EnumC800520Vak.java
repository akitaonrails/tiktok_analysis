package X;

/* JADX INFO: renamed from: X.0Vak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC800520Vak {
    PAGE_INIT("page_init"),
    PAGE_START("page_start"),
    PAGE_REDIRECT("page_redirect"),
    PAGE_LOADING("page_loading"),
    PAGE_FINISHED("page_finished");

    public final String LL;

    public static EnumC800520Vak valueOf(String str) {
        return (EnumC800520Vak) C08FF.LIZ(EnumC800520Vak.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    EnumC800520Vak(String str) {
        this.LL = str;
    }
}
