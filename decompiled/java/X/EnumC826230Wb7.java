package X;

/* JADX INFO: renamed from: X.0Wb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC826230Wb7 {
    FIRST_PARTY("first_party"),
    SECOND_PARTY("second_party"),
    INTERNAL_THIRD_PARTY("internal_3rd"),
    EXTERNAL_THIRD_PARTY("external_3rd"),
    UNKNOWN("unknown");

    public static final C826280WbC Companion = new Object() { // from class: X.0WbC
    };
    public final String LL;

    public static EnumC826230Wb7 valueOf(String str) {
        return (EnumC826230Wb7) C08FF.LIZ(EnumC826230Wb7.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    EnumC826230Wb7(String str) {
        this.LL = str;
    }
}
